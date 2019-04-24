.class public Lo/ari;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 8

    .line 51
    new-instance v6, Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/chat/Assistant;-><init>()V

    .line 52
    invoke-virtual {v6, p1, p2}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserId(J)V

    .line 53
    move-object v0, v6

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getChannel_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getDefault_msg_()Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getCompany_()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getIntroduction_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getMenu_()Ljava/lang/String;

    move-result-object v5

    .line 53
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/chat/Assistant;->setSomeInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getAccount_name_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setNickName(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getAppinfo_()Ljava/lang/String;

    move-result-object v7

    .line 58
    invoke-virtual {v6, v7}, Lcom/huawei/health/sns/model/chat/Assistant;->parseAssistAppInfo(Ljava/lang/String;)V

    .line 59
    return-object v6
.end method

.method public d(Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 3

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 25
    new-instance v2, Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/Assistant;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserId(J)V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setNickName(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setImageUrl(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setOldImageUrl(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setImageURLDownload(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSetFlags()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSetFlags(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserType(I)V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setIsFriend(I)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setState(I)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSiteId()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSiteId(I)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setRelation(I)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setStickTime(Ljava/lang/String;)V

    .line 39
    :cond_0
    return-object v2
.end method
