package com.evmtv.epg.entity;

import com.evmtv.epg.request.BaseRequest;

public class TNodeStatus extends BaseRequest{
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = -6560723116851666018L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.ID
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long id;

    private String userName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FNodeId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fnodeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FUserId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FStatus
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private String fstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FCreateTime
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private String fcreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FContractAdvId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fcontractadvid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FContractId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fcontractid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FSourceId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fsourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FContractAdvResourceId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fcontractadvresourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FBranchId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long fbranchid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FReleaseVersionId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private Long freleaseversionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FRemark
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    private String fremark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.ID
     *
     * @return the value of t_node_status.ID
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.ID
     *
     * @param id the value for t_node_status.ID
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FNodeId
     *
     * @return the value of t_node_status.FNodeId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFnodeid() {
        return fnodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FNodeId
     *
     * @param fnodeid the value for t_node_status.FNodeId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFnodeid(Long fnodeid) {
        this.fnodeid = fnodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FUserId
     *
     * @return the value of t_node_status.FUserId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFuserid() {
        return fuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FUserId
     *
     * @param fuserid the value for t_node_status.FUserId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFuserid(Long fuserid) {
        this.fuserid = fuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FStatus
     *
     * @return the value of t_node_status.FStatus
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public String getFstatus() {
        return fstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FStatus
     *
     * @param fstatus the value for t_node_status.FStatus
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFstatus(String fstatus) {
        this.fstatus = fstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FCreateTime
     *
     * @return the value of t_node_status.FCreateTime
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public String getFcreatetime() {
        return fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FCreateTime
     *
     * @param fcreatetime the value for t_node_status.FCreateTime
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFcreatetime(String fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FContractAdvId
     *
     * @return the value of t_node_status.FContractAdvId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFcontractadvid() {
        return fcontractadvid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FContractAdvId
     *
     * @param fcontractadvid the value for t_node_status.FContractAdvId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFcontractadvid(Long fcontractadvid) {
        this.fcontractadvid = fcontractadvid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FContractId
     *
     * @return the value of t_node_status.FContractId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFcontractid() {
        return fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FContractId
     *
     * @param fcontractid the value for t_node_status.FContractId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFcontractid(Long fcontractid) {
        this.fcontractid = fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FSourceId
     *
     * @return the value of t_node_status.FSourceId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFsourceid() {
        return fsourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FSourceId
     *
     * @param fsourceid the value for t_node_status.FSourceId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFsourceid(Long fsourceid) {
        this.fsourceid = fsourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FContractAdvResourceId
     *
     * @return the value of t_node_status.FContractAdvResourceId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFcontractadvresourceid() {
        return fcontractadvresourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FContractAdvResourceId
     *
     * @param fcontractadvresourceid the value for t_node_status.FContractAdvResourceId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFcontractadvresourceid(Long fcontractadvresourceid) {
        this.fcontractadvresourceid = fcontractadvresourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FBranchId
     *
     * @return the value of t_node_status.FBranchId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFbranchid() {
        return fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FBranchId
     *
     * @param fbranchid the value for t_node_status.FBranchId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFbranchid(Long fbranchid) {
        this.fbranchid = fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FReleaseVersionId
     *
     * @return the value of t_node_status.FReleaseVersionId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public Long getFreleaseversionid() {
        return freleaseversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FReleaseVersionId
     *
     * @param freleaseversionid the value for t_node_status.FReleaseVersionId
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFreleaseversionid(Long freleaseversionid) {
        this.freleaseversionid = freleaseversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FRemark
     *
     * @return the value of t_node_status.FRemark
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public String getFremark() {
        return fremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FRemark
     *
     * @param fremark the value for t_node_status.FRemark
     *
     * @mbggenerated Sat Nov 02 21:30:11 CST 2013
     */
    public void setFremark(String fremark) {
        this.fremark = fremark;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}