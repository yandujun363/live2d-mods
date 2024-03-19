package com.reprisesoftware.rlm;

/* loaded from: PRO_5.0.00~5.0.05-0.1.3.jar:com/reprisesoftware/rlm/RlmActInfo.class */
public class RlmActInfo implements RlmConstants {
    private String actKey;
    private String url;
    private String product;
    private String version;
    private String upgradeVersion;
    private int dateBased;
    private int licType;
    private int count;
    private int fulfilled;
    private int rehosts;
    private int revoked;
    private String exp;
    private String hostid;
    private String keyExp;
    private int allowedHostids;
    private int subInterval;
    private int subWindow;

    private native int rlmActInfo(long j, String str, String str2);

    public RlmActInfo(RlmHandle rh, String url, String actKey) throws RlmException {
        System.out.println("[ShiroSaki] RlmActInfo RIP~");
        this.url = url;
        this.actKey = actKey;
    }

    public String getActKey() {
        return this.actKey;
    }

    public String getURL() {
        return this.url;
    }

    public String getProduct() {
        return this.product;
    }

    public String getVersion() {
        return this.version;
    }

    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public int getDateBased() {
        return this.dateBased;
    }

    public int getLicenseType() {
        return this.licType;
    }

    public int getCount() {
        return this.count;
    }

    public int getFulfilled() {
        return this.fulfilled;
    }

    public int getRehosts() {
        return this.rehosts;
    }

    public int getRevoked() {
        return this.revoked;
    }

    public String getExpiration() {
        return this.exp;
    }

    public String getHostid() {
        return this.hostid;
    }

    public String getKeyExpiration() {
        return this.keyExp;
    }

    public int getSubscriptionInterval() {
        return this.subInterval;
    }

    public int getAllowedHostids() {
        return this.allowedHostids;
    }

    public int getSubscriptionWindow() {
        return this.subWindow;
    }
}
