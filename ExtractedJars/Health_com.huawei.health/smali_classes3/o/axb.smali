.class public Lo/axb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(JLandroid/os/Handler;)V
    .locals 2

    .line 50
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axb$4;

    invoke-direct {v1, p0, p1, p2}, Lo/axb$4;-><init>(JLandroid/os/Handler;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 77
    return-void
.end method

.method public static d(JLandroid/os/Handler;)Lcom/huawei/health/sns/model/user/User;
    .locals 9

    .line 90
    if-eqz p2, :cond_0

    .line 92
    invoke-virtual {p2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 93
    const/16 v0, 0x100

    iput v0, v6, Landroid/os/Message;->what:I

    .line 94
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 95
    const-string v0, "bundleKeyUser"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 96
    invoke-virtual {v6, v7}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 97
    invoke-virtual {p2, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 101
    :cond_0
    new-instance v6, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 102
    move-object v0, v6

    move-wide v1, p0

    const/4 v3, 0x4

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 104
    invoke-static {v6}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v7

    .line 105
    invoke-static {v7}, Lo/axb;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v8

    .line 106
    if-eqz v8, :cond_1

    .line 108
    invoke-virtual {v8, p0, p1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 110
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/axa;->e(Lcom/huawei/health/sns/model/user/User;)Z

    .line 112
    :cond_1
    return-object v8
.end method

.method private static e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/model/user/User;
    .locals 8

    .line 123
    if-nez p0, :cond_0

    .line 125
    const/4 v0, 0x0

    return-object v0

    .line 128
    :cond_0
    const/4 v3, 0x0

    .line 129
    const/4 v4, 0x0

    .line 131
    instance-of v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    if-eqz v0, :cond_4

    .line 133
    move-object v4, p0

    check-cast v4, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    .line 134
    iget v0, v4, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    if-nez v0, :cond_3

    .line 137
    iget v0, v4, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    if-nez v0, :cond_2

    .line 139
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->getGetOtherUserInfoRsp_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    move-result-object v5

    .line 140
    if-eqz v5, :cond_1

    .line 142
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->getOtherUserInfo_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    move-result-object v6

    .line 143
    if-eqz v6, :cond_1

    .line 145
    new-instance v3, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 146
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getUserAccount_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 147
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getNeedVerify_()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 148
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 149
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 150
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getGender_()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 152
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getSignature_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 153
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getRegion_()Lcom/huawei/health/sns/server/Region;

    move-result-object v7

    .line 155
    if-eqz v7, :cond_1

    .line 157
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/Region;->getProvince_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/Region;->getCity_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 162
    :cond_1
    goto :goto_0

    .line 165
    :cond_2
    const-string v0, "UserInfoFinder"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseUserInfoResponse exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 170
    :cond_3
    const-string v0, "UserInfoFinder"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseUserInfoResponse exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_4
    const-string v0, "UserInfoFinder"

    const-string v1, "responseBean not instanceof GetOtherUserInfoResponse"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :goto_0
    return-object v3
.end method
