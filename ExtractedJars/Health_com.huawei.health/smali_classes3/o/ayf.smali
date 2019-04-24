.class public Lo/ayf;
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
.method public b(Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;)Lcom/huawei/health/sns/model/group/Group;
    .locals 5

    .line 25
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getGrpID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 28
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getGrpName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 32
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    .line 39
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getGrpManagerUID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setManagerId(J)V

    .line 45
    const/4 v3, -0x1

    .line 46
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 50
    :cond_1
    invoke-virtual {v2, v3}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 54
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 57
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 58
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    .line 60
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 61
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    .line 63
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 64
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :cond_2
    goto :goto_1

    .line 68
    :catch_0
    move-exception v3

    .line 70
    const-string v0, "UserGroupToGroup"

    const-string v1, "group grpTags_ or setFlags format error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getStickTime_()Ljava/lang/String;

    move-result-object v3

    .line 73
    invoke-static {v3}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getCreateTime_()Ljava/lang/String;

    move-result-object v4

    .line 76
    invoke-static {v4}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setCreateTime(Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getGrpMbVersion_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupMemberVersion(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getState_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 82
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getState_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 84
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 86
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->getSiteID_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSiteID(I)V

    .line 88
    return-object v2
.end method
