package com.entity;

import javax.persistence.*;

@Table(name = "`tab_elecinfo`")
public class TabElecinfo {
    @Id
    @Column(name = "`elec_id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer elecId;

    @Column(name = "`elec_month`")
    private String elecMonth;

    @Column(name = "`elec_sum`")
    private String elecSum;

    @Column(name = "`elec_money`")
    private String elecMoney;

    @Column(name = "`room_id`")
    private Integer roomId;

    @Column(name = "`elec_state`")
    private String elecState;

    /**
     * @return elec_id
     */
    public Integer getElecId() {
        return elecId;
    }

    /**
     * @param elecId
     */
    public void setElecId(Integer elecId) {
        this.elecId = elecId;
    }

    /**
     * @return elec_month
     */
    public String getElecMonth() {
        return elecMonth;
    }

    /**
     * @param elecMonth
     */
    public void setElecMonth(String elecMonth) {
        this.elecMonth = elecMonth == null ? null : elecMonth.trim();
    }

    /**
     * @return elec_sum
     */
    public String getElecSum() {
        return elecSum;
    }

    /**
     * @param elecSum
     */
    public void setElecSum(String elecSum) {
        this.elecSum = elecSum == null ? null : elecSum.trim();
    }

    /**
     * @return elec_money
     */
    public String getElecMoney() {
        return elecMoney;
    }

    /**
     * @param elecMoney
     */
    public void setElecMoney(String elecMoney) {
        this.elecMoney = elecMoney == null ? null : elecMoney.trim();
    }

    /**
     * @return room_id
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * @param roomId
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * @return elec_state
     */
    public String getElecState() {
        return elecState;
    }

    /**
     * @param elecState
     */
    public void setElecState(String elecState) {
        this.elecState = elecState == null ? null : elecState.trim();
    }
}