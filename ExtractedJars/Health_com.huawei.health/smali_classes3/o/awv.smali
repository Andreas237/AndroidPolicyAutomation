.class public Lo/awv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;J)Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 23
    new-instance v1, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 24
    invoke-virtual {v1, p1, p2}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 25
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getUserAccount_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getNeedVerify_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 27
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getGender_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 31
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getSignature_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getSiteID_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 34
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getUserType_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setUserType(I)V

    .line 35
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getRegion_()Lcom/huawei/health/sns/server/Region;

    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 38
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/Region;->getProvince_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/Region;->getCity_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 42
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v3

    .line 43
    if-eqz v3, :cond_1

    .line 45
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginType(I)V

    .line 46
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginDesc(Ljava/lang/String;)V

    .line 48
    :cond_1
    return-object v1
.end method
