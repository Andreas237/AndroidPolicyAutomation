.class public Lo/aya;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;)Lcom/huawei/health/sns/model/group/Group;
    .locals 5

    .line 25
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getGrpID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getGrpName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    .line 36
    :goto_0
    const/4 v3, 0x0

    .line 37
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 41
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 46
    goto :goto_1

    .line 43
    :catch_0
    move-exception v4

    .line 45
    const-string v0, "GroupInfoToGroup"

    const-string v1, "saveGroupByResponse() info.grpTags_ parse error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :cond_1
    :goto_1
    invoke-virtual {v2, v3}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 49
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getGrpManagerUID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setManagerId(J)V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getGrpMbVersion_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupMemberVersion(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getCreateTime_()Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-static {v4}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setCreateTime(Ljava/lang/String;)V

    .line 55
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    .line 57
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    .line 59
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getSiteID_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSiteID(I)V

    .line 60
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getQrCode_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setQrCode(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->getQrExpireTime_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setQrExpireTime(Ljava/lang/String;)V

    .line 63
    return-object v2
.end method
