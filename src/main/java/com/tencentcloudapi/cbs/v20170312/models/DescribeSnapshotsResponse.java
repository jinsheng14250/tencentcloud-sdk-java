package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSnapshotsResponse  extends AbstractModel{


    /**
    * 快照的数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 快照的详情列表。
    */
    @SerializedName("SnapshotSet")
    @Expose
    private Snapshot [] SnapshotSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取快照的数量。
     * @return TotalCount 快照的数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置快照的数量。
     * @param TotalCount 快照的数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取快照的详情列表。
     * @return SnapshotSet 快照的详情列表。
     */
    public Snapshot [] getSnapshotSet() {
        return this.SnapshotSet;
    }

    /**
     * 设置快照的详情列表。
     * @param SnapshotSet 快照的详情列表。
     */
    public void setSnapshotSet(Snapshot [] SnapshotSet) {
        this.SnapshotSet = SnapshotSet;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SnapshotSet.", this.SnapshotSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
