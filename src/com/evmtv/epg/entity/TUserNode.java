package com.evmtv.epg.entity;

import com.evmtv.epg.request.UserNode;

public class TUserNode extends UserNode{
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.ID
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.FBranchId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private Long fbranchid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.FNodeId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private Long fnodeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.FUserGroupId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private Long fusergroupid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.FIsGroup
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private String fisgroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.FIsProvincial
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private String fisprovincial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_node.FOrder
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    private Integer forder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.ID
     *
     * @return the value of t_user_node.ID
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.ID
     *
     * @param id the value for t_user_node.ID
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.FBranchId
     *
     * @return the value of t_user_node.FBranchId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public Long getFbranchid() {
        return fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.FBranchId
     *
     * @param fbranchid the value for t_user_node.FBranchId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setFbranchid(Long fbranchid) {
        this.fbranchid = fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.FNodeId
     *
     * @return the value of t_user_node.FNodeId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public Long getFnodeid() {
        return fnodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.FNodeId
     *
     * @param fnodeid the value for t_user_node.FNodeId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setFnodeid(Long fnodeid) {
        this.fnodeid = fnodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.FUserGroupId
     *
     * @return the value of t_user_node.FUserGroupId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public Long getFusergroupid() {
        return fusergroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.FUserGroupId
     *
     * @param fusergroupid the value for t_user_node.FUserGroupId
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setFusergroupid(Long fusergroupid) {
        this.fusergroupid = fusergroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.FIsGroup
     *
     * @return the value of t_user_node.FIsGroup
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public String getFisgroup() {
        return fisgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.FIsGroup
     *
     * @param fisgroup the value for t_user_node.FIsGroup
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setFisgroup(String fisgroup) {
        this.fisgroup = fisgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.FIsProvincial
     *
     * @return the value of t_user_node.FIsProvincial
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public String getFisprovincial() {
        return fisprovincial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.FIsProvincial
     *
     * @param fisprovincial the value for t_user_node.FIsProvincial
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setFisprovincial(String fisprovincial) {
        this.fisprovincial = fisprovincial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_node.FOrder
     *
     * @return the value of t_user_node.FOrder
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public Integer getForder() {
        return forder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_node.FOrder
     *
     * @param forder the value for t_user_node.FOrder
     *
     * @mbggenerated Fri Aug 16 15:52:36 CST 2013
     */
    public void setForder(Integer forder) {
        this.forder = forder;
    }
}