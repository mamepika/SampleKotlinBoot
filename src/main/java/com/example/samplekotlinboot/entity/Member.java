package com.example.samplekotlinboot.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

@Table(name="MST_KAIIN")
@Entity
public class Member {

    @Column(name = "JIGYSYA_CODE")
    private String merchantCode;

    @Column(name = "TENPO_CODE")
    private String tenantCode;

    @Column(name = "KAIIN_ID")
    private String memberId;

    @Column(name = "CARDNO")
    private String cardNumber;

    @Column(name = "CARDYUKOKIGEN_NENGTU")
    private String cardExpireDate;

    @Column(name = "CARDKAISYA_CODE")
    private String cardCompanyCode;

    @Column(name = "KAIIN_STATUS")
    private String status;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpireDate() {
        return cardExpireDate;
    }

    public void setCardExpireDate(String cardExpireDate) {
        this.cardExpireDate = cardExpireDate;
    }

    public String getCardCompanyCode() {
        return cardCompanyCode;
    }

    public void setCardCompanyCode(String cardCompanyCode) {
        this.cardCompanyCode = cardCompanyCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
