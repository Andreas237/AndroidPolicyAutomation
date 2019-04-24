.class public Lo/atp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/model/group/GroupMember;)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 29
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 30
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 31
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setOldImageUrl(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getSiteId()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 38
    return-object v2
.end method
