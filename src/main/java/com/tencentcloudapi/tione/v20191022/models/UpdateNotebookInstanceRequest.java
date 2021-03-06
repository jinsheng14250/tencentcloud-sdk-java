/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateNotebookInstanceRequest extends AbstractModel{

    /**
    * Notebook实例名称
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * 角色的资源描述
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * Root访问权限
    */
    @SerializedName("RootAccess")
    @Expose
    private String RootAccess;

    /**
    * 数据卷大小(GB)
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * 算力资源类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * notebook生命周期脚本名称
    */
    @SerializedName("LifecycleScriptsName")
    @Expose
    private String LifecycleScriptsName;

    /**
    * 是否解绑生命周期脚本，默认 false。
如果本来就没有绑定脚本，则忽略此参数；
如果本来有绑定脚本，此参数为 true 则解绑；
如果本来有绑定脚本，此参数为 false，则需要额外填入 LifecycleScriptsName
    */
    @SerializedName("DisassociateLifecycleScript")
    @Expose
    private Boolean DisassociateLifecycleScript;

    /**
    * 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
    */
    @SerializedName("DefaultCodeRepository")
    @Expose
    private String DefaultCodeRepository;

    /**
    * 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
    */
    @SerializedName("AdditionalCodeRepositories")
    @Expose
    private String [] AdditionalCodeRepositories;

    /**
    * 是否取消关联默认存储库，默认false
该值为true时，DefaultCodeRepository将被忽略
    */
    @SerializedName("DisassociateDefaultCodeRepository")
    @Expose
    private Boolean DisassociateDefaultCodeRepository;

    /**
    * 是否取消关联其他存储库，默认false
该值为true时，AdditionalCodeRepositories将被忽略
    */
    @SerializedName("DisassociateAdditionalCodeRepositories")
    @Expose
    private Boolean DisassociateAdditionalCodeRepositories;

    /**
    * 是否开启CLS日志服务，可取值Enabled/Disabled
    */
    @SerializedName("ClsAccess")
    @Expose
    private String ClsAccess;

    /**
     * Get Notebook实例名称 
     * @return NotebookInstanceName Notebook实例名称
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set Notebook实例名称
     * @param NotebookInstanceName Notebook实例名称
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get 角色的资源描述 
     * @return RoleArn 角色的资源描述
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色的资源描述
     * @param RoleArn 角色的资源描述
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get Root访问权限 
     * @return RootAccess Root访问权限
     */
    public String getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set Root访问权限
     * @param RootAccess Root访问权限
     */
    public void setRootAccess(String RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get 数据卷大小(GB) 
     * @return VolumeSizeInGB 数据卷大小(GB)
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 数据卷大小(GB)
     * @param VolumeSizeInGB 数据卷大小(GB)
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get 算力资源类型 
     * @return InstanceType 算力资源类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 算力资源类型
     * @param InstanceType 算力资源类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get notebook生命周期脚本名称 
     * @return LifecycleScriptsName notebook生命周期脚本名称
     */
    public String getLifecycleScriptsName() {
        return this.LifecycleScriptsName;
    }

    /**
     * Set notebook生命周期脚本名称
     * @param LifecycleScriptsName notebook生命周期脚本名称
     */
    public void setLifecycleScriptsName(String LifecycleScriptsName) {
        this.LifecycleScriptsName = LifecycleScriptsName;
    }

    /**
     * Get 是否解绑生命周期脚本，默认 false。
如果本来就没有绑定脚本，则忽略此参数；
如果本来有绑定脚本，此参数为 true 则解绑；
如果本来有绑定脚本，此参数为 false，则需要额外填入 LifecycleScriptsName 
     * @return DisassociateLifecycleScript 是否解绑生命周期脚本，默认 false。
如果本来就没有绑定脚本，则忽略此参数；
如果本来有绑定脚本，此参数为 true 则解绑；
如果本来有绑定脚本，此参数为 false，则需要额外填入 LifecycleScriptsName
     */
    public Boolean getDisassociateLifecycleScript() {
        return this.DisassociateLifecycleScript;
    }

    /**
     * Set 是否解绑生命周期脚本，默认 false。
如果本来就没有绑定脚本，则忽略此参数；
如果本来有绑定脚本，此参数为 true 则解绑；
如果本来有绑定脚本，此参数为 false，则需要额外填入 LifecycleScriptsName
     * @param DisassociateLifecycleScript 是否解绑生命周期脚本，默认 false。
如果本来就没有绑定脚本，则忽略此参数；
如果本来有绑定脚本，此参数为 true 则解绑；
如果本来有绑定脚本，此参数为 false，则需要额外填入 LifecycleScriptsName
     */
    public void setDisassociateLifecycleScript(Boolean DisassociateLifecycleScript) {
        this.DisassociateLifecycleScript = DisassociateLifecycleScript;
    }

    /**
     * Get 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库 
     * @return DefaultCodeRepository 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
     */
    public String getDefaultCodeRepository() {
        return this.DefaultCodeRepository;
    }

    /**
     * Set 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
     * @param DefaultCodeRepository 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
     */
    public void setDefaultCodeRepository(String DefaultCodeRepository) {
        this.DefaultCodeRepository = DefaultCodeRepository;
    }

    /**
     * Get 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库 
     * @return AdditionalCodeRepositories 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
     */
    public String [] getAdditionalCodeRepositories() {
        return this.AdditionalCodeRepositories;
    }

    /**
     * Set 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
     * @param AdditionalCodeRepositories 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
     */
    public void setAdditionalCodeRepositories(String [] AdditionalCodeRepositories) {
        this.AdditionalCodeRepositories = AdditionalCodeRepositories;
    }

    /**
     * Get 是否取消关联默认存储库，默认false
该值为true时，DefaultCodeRepository将被忽略 
     * @return DisassociateDefaultCodeRepository 是否取消关联默认存储库，默认false
该值为true时，DefaultCodeRepository将被忽略
     */
    public Boolean getDisassociateDefaultCodeRepository() {
        return this.DisassociateDefaultCodeRepository;
    }

    /**
     * Set 是否取消关联默认存储库，默认false
该值为true时，DefaultCodeRepository将被忽略
     * @param DisassociateDefaultCodeRepository 是否取消关联默认存储库，默认false
该值为true时，DefaultCodeRepository将被忽略
     */
    public void setDisassociateDefaultCodeRepository(Boolean DisassociateDefaultCodeRepository) {
        this.DisassociateDefaultCodeRepository = DisassociateDefaultCodeRepository;
    }

    /**
     * Get 是否取消关联其他存储库，默认false
该值为true时，AdditionalCodeRepositories将被忽略 
     * @return DisassociateAdditionalCodeRepositories 是否取消关联其他存储库，默认false
该值为true时，AdditionalCodeRepositories将被忽略
     */
    public Boolean getDisassociateAdditionalCodeRepositories() {
        return this.DisassociateAdditionalCodeRepositories;
    }

    /**
     * Set 是否取消关联其他存储库，默认false
该值为true时，AdditionalCodeRepositories将被忽略
     * @param DisassociateAdditionalCodeRepositories 是否取消关联其他存储库，默认false
该值为true时，AdditionalCodeRepositories将被忽略
     */
    public void setDisassociateAdditionalCodeRepositories(Boolean DisassociateAdditionalCodeRepositories) {
        this.DisassociateAdditionalCodeRepositories = DisassociateAdditionalCodeRepositories;
    }

    /**
     * Get 是否开启CLS日志服务，可取值Enabled/Disabled 
     * @return ClsAccess 是否开启CLS日志服务，可取值Enabled/Disabled
     */
    public String getClsAccess() {
        return this.ClsAccess;
    }

    /**
     * Set 是否开启CLS日志服务，可取值Enabled/Disabled
     * @param ClsAccess 是否开启CLS日志服务，可取值Enabled/Disabled
     */
    public void setClsAccess(String ClsAccess) {
        this.ClsAccess = ClsAccess;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "LifecycleScriptsName", this.LifecycleScriptsName);
        this.setParamSimple(map, prefix + "DisassociateLifecycleScript", this.DisassociateLifecycleScript);
        this.setParamSimple(map, prefix + "DefaultCodeRepository", this.DefaultCodeRepository);
        this.setParamArraySimple(map, prefix + "AdditionalCodeRepositories.", this.AdditionalCodeRepositories);
        this.setParamSimple(map, prefix + "DisassociateDefaultCodeRepository", this.DisassociateDefaultCodeRepository);
        this.setParamSimple(map, prefix + "DisassociateAdditionalCodeRepositories", this.DisassociateAdditionalCodeRepositories);
        this.setParamSimple(map, prefix + "ClsAccess", this.ClsAccess);

    }
}

