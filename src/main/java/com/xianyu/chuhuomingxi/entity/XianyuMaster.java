package com.xianyu.chuhuomingxi.entity;

import java.io.Serializable;

public class Xianyumaster implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xianyuMaster.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xianyuMaster.gongyingshang
     *
     * @mbg.generated
     */
    private String gongyingshang;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xianyuMaster.jinghuo
     *
     * @mbg.generated
     */
    private String jinghuo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xianyuMaster.tuihuo
     *
     * @mbg.generated
     */
    private String tuihuo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xianyuMaster.fukuan
     *
     * @mbg.generated
     */
    private String fukuan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xianyuMaster.zongji
     *
     * @mbg.generated
     */
    private String zongji;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xianyuMaster
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xianyuMaster.id
     *
     * @return the value of xianyuMaster.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xianyuMaster.id
     *
     * @param id the value for xianyuMaster.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xianyuMaster.gongyingshang
     *
     * @return the value of xianyuMaster.gongyingshang
     *
     * @mbg.generated
     */
    public String getGongyingshang() {
        return gongyingshang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xianyuMaster.gongyingshang
     *
     * @param gongyingshang the value for xianyuMaster.gongyingshang
     *
     * @mbg.generated
     */
    public void setGongyingshang(String gongyingshang) {
        this.gongyingshang = gongyingshang == null ? null : gongyingshang.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xianyuMaster.jinghuo
     *
     * @return the value of xianyuMaster.jinghuo
     *
     * @mbg.generated
     */
    public String getJinghuo() {
        return jinghuo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xianyuMaster.jinghuo
     *
     * @param jinghuo the value for xianyuMaster.jinghuo
     *
     * @mbg.generated
     */
    public void setJinghuo(String jinghuo) {
        this.jinghuo = jinghuo == null ? null : jinghuo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xianyuMaster.tuihuo
     *
     * @return the value of xianyuMaster.tuihuo
     *
     * @mbg.generated
     */
    public String getTuihuo() {
        return tuihuo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xianyuMaster.tuihuo
     *
     * @param tuihuo the value for xianyuMaster.tuihuo
     *
     * @mbg.generated
     */
    public void setTuihuo(String tuihuo) {
        this.tuihuo = tuihuo == null ? null : tuihuo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xianyuMaster.fukuan
     *
     * @return the value of xianyuMaster.fukuan
     *
     * @mbg.generated
     */
    public String getFukuan() {
        return fukuan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xianyuMaster.fukuan
     *
     * @param fukuan the value for xianyuMaster.fukuan
     *
     * @mbg.generated
     */
    public void setFukuan(String fukuan) {
        this.fukuan = fukuan == null ? null : fukuan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xianyuMaster.zongji
     *
     * @return the value of xianyuMaster.zongji
     *
     * @mbg.generated
     */
    public String getZongji() {
        return zongji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xianyuMaster.zongji
     *
     * @param zongji the value for xianyuMaster.zongji
     *
     * @mbg.generated
     */
    public void setZongji(String zongji) {
        this.zongji = zongji == null ? null : zongji.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xianyuMaster
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
        sb.append(", gongyingshang=").append(gongyingshang);
        sb.append(", jinghuo=").append(jinghuo);
        sb.append(", tuihuo=").append(tuihuo);
        sb.append(", fukuan=").append(fukuan);
        sb.append(", zongji=").append(zongji);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}