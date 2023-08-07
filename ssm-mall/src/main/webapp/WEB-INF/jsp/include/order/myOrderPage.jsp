<%--
  Created by IntelliJ IDEA.
  User: xen
  Date: 2017/12/9
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<script>
    var deleteOid = -1;
    $(function () {
        $(".order-type a").click(function () {
            var orderStatus = $(this).attr("order-status");
            if('all'===orderStatus){
                $("table[order-status]").show();
            }else{
                $("table[order-status]").hide();
                $("table[order-status="+orderStatus+"]").show();
            }
            $(".order-type div").removeClass("selected");
            $(this).parent("div").addClass("selected");

        });
        $(".delete-button").click(function () {
            deleteOid = $(this).attr("oid");
            $("#confirmModal").modal('show');
        });
        $("#confirmDelete").click(function () {
            $("#confirmModal").modal("hide");
            var page = "deleteOrder";
            $.get(page,{"oid":deleteOid},function (result) {
                if(result === "success"){
                    $("table[oid="+deleteOid+"]").remove();
                }else{
                    alert("服务器错误，删除失败");
                }
            });
        });
        $("#cancelDelete").click(function () {
            $("#confirmModal").modal("hide");
        });
    });
</script>

<section class="order-type">
    <div class="selected"><a href="#nowhere" order-status="all">所有订单</a></div>
    <div><a href="#nowhere" order-status="waitPay">待付款</a></div>
    <div><a href="#nowhere" order-status="waitDelivery">待发货</a></div>
    <div><a href="#nowhere" order-status="waitConfirm">待确认</a></div>
    <div><a href="#nowhere" order-status="waitComment">待评价</a></div>
</section>

<main class="order-list">
    <table class="head-table">
        <thead>

        </thead>
    </table>
    <c:forEach items="${list}" var="list" varStatus="num">
    <table class="line-table" order-status="${product.id}" >
        <tr>
            <td>序号</td>
            <td>名称</td>
            <td>原价</td>
            <td>现价</td>
            <td>库存</td>
            <td>评论数</td>
            <td>销售量</td>
        </tr>
        <tr>
            <td> ${list.id}</td>
            <td> ${list.name}</td>
            <td> ${list.originalPrice}</td>
            <td> ${list.nowPrice}</td>
            <td> ${list.stock}</td>
            <td> ${list.commentCount}</td>
            <td> ${list.saleCount}</td>
            <a href="deleteOrder/${num.count}">删除订单</a>

        </tr>
    </table>
    </c:forEach>
    <div class="modal" tabindex="-1" role="dialog" id="confirmModal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-title">删除宝贝</div>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>

                <div class="confirm-content">确认要删除该宝贝吗？</div>
                <div class="button-group">
                    <button class="yes" id="confirmDelete">确定</button>
                    <button class="no" id="cancelDelete">取消</button>
                </div>
            </div>
        </div>
    </div>
</main>
