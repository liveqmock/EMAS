package com.evmtv.epg.entity;

public class TSourceWithBLOBs extends TSource {
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = 4579679355807691775L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source.FBitData
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source.FRawData
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */
    private String frawdata;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source.FRemark
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */
    private String fremark;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_source.FRawData
     *
     * @return the value of t_source.FRawData
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */
    public String getFrawdata() {
        return frawdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_source.FRawData
     *
     * @param frawdata the value for t_source.FRawData
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */
    public void setFrawdata(String frawdata) {
        this.frawdata = frawdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_source.FRemark
     *
     * @return the value of t_source.FRemark
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */
    public String getFremark() {
        return fremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_source.FRemark
     *
     * @param fremark the value for t_source.FRemark
     *
     * @mbggenerated Fri Nov 08 15:56:35 CST 2013
     */
    public void setFremark(String fremark) {
        this.fremark = fremark;
    }
}