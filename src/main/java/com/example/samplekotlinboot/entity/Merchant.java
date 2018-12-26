package com.example.samplekotlinboot.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

/**
 * 事業者エンティティ
 */
@Entity
public class Merchant {

    @Id
    @Column(name = "JIGYSYA_CODE")
    private String merchantCode;

    @Column(name = "MEISYO")
    private String merchantName;

    @Column(name = "SITE_MEISYO")
    private String siteName;

    @Column(name = "SETUZOK_ID")
    private String connectId;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }

    public String getConnectPassword() {
        return connectPassword;
    }

    public void setConnectPassword(String connectPassword) {
        this.connectPassword = connectPassword;
    }

    @Column(name = "SETUZOK_PWD")
    private String connectPassword;




}
