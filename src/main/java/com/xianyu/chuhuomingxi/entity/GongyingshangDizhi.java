package com.xianyu.chuhuomingxi.entity;

import java.io.Serializable;

public class GongyingshangDizhi implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gongyingshang_dizhi.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gongyingshang_dizhi.dizhi
     *
     * @mbg.generated
     */
    private String dizhi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gongyingshang_dizhi
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gongyingshang_dizhi.id
     *
     * @return the value of gongyingshang_dizhi.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gongyingshang_dizhi.id
     *
     * @param id the value for gongyingshang_dizhi.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gongyingshang_dizhi.dizhi
     *
     * @return the value of gongyingshang_dizhi.dizhi
     *
     * @mbg.generated
     */
    public String getDizhi() {
        return dizhi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gongyingshang_dizhi.dizhi
     *
     * @param dizhi the value for gongyingshang_dizhi.dizhi
     *
     * @mbg.generated
     */
    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongyingshang_dizhi
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dizhi=").append(dizhi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}