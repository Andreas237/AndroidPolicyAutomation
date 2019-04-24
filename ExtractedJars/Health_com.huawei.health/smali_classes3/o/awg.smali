.class public Lo/awg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz p1, :cond_2

    .line 26
    new-instance v1, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserID_()J

    move-result-wide v2

    .line 28
    invoke-virtual {v1, v2, v3}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 29
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getGender_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserAccount_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getSignature_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getProvince_()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getCity_()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 38
    :cond_2
    return-object v1
.end method
