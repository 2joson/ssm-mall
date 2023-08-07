package com.atguigu.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    Integer id;
    String name;
    BigDecimal originalPrice;
    BigDecimal nowPrice;
    Integer stock;
    Date createDate;
    Integer commentCount;
    Integer saleCount;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", originalPrice=" + originalPrice +
                ", nowPrice=" + nowPrice +
                ", stock=" + stock +
                ", createDate=" + createDate +
                ", commentCount=" + commentCount +
                ", saleCount=" + saleCount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(BigDecimal nowPrice) {
        this.nowPrice = nowPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Product(Integer id, String name, BigDecimal originalPrice, BigDecimal nowPrice, Integer stock, Date createDate, Integer commentCount, Integer saleCount) {
        this.id = id;
        this.name = name;
        this.originalPrice = originalPrice;
        this.nowPrice = nowPrice;
        this.stock = stock;
        this.createDate = createDate;
        this.commentCount = commentCount;
        this.saleCount = saleCount;
    }

    public Product() {
    }
}
