.class public Lo/axf;
.super Lo/awy;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/awy;-><init>(Landroid/os/Handler;)V

    .line 39
    return-void
.end method

.method static synthetic a(Lo/axf;ILcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lo/axf;->d(ILcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V

    return-void
.end method

.method static synthetic b(Lo/axf;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lo/axf;->d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)V
    .locals 2

    .line 218
    iget-object v0, p0, Lo/axf;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 220
    invoke-virtual/range {p0 .. p6}, Lo/axf;->d(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)Landroid/os/Message;

    move-result-object v1

    .line 221
    iget-object v0, p0, Lo/axf;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 223
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/axf;Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct/range {p0 .. p6}, Lo/axf;->b(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)V

    return-void
.end method

.method private c(J)V
    .locals 1

    .line 172
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ast;->b(J)Z

    .line 174
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 175
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->e(J)Z

    .line 176
    return-void
.end method

.method private d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 187
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 188
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 189
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 190
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 192
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getGender_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 193
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserAccount_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 194
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getSignature_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 195
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 196
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v3

    .line 197
    if-eqz v3, :cond_0

    .line 199
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getProvince_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 200
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getCity_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 202
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 203
    return-object v2
.end method

.method private d(ILcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V
    .locals 10

    .line 121
    iget v0, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    if-nez v0, :cond_3

    .line 124
    iget v0, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    if-nez v0, :cond_1

    .line 126
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->getGetOtherUserInfoRsp_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    move-result-object v7

    .line 127
    if-eqz v7, :cond_0

    .line 129
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->getOtherUserInfo_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    move-result-object v8

    .line 130
    if-eqz v8, :cond_0

    .line 132
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->getDstUserID_()J

    move-result-wide v0

    invoke-static {v8, v0, v1}, Lo/awv;->c(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v9

    .line 133
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/axa;->e(Lcom/huawei/health/sns/model/user/User;)Z

    .line 134
    move-object v0, p0

    move-object v1, v9

    move v2, p1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/axf;->b(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)V

    .line 137
    :cond_0
    goto/16 :goto_0

    .line 140
    :cond_1
    iget v0, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    const/16 v1, 0x23

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lo/axf;->b(III)V

    .line 142
    iget v0, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    const/16 v1, 0x3ed

    if-ne v0, v1, :cond_2

    .line 145
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->getDstUserID_()J

    move-result-wide v7

    .line 146
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Lo/axa;->b(J)Z

    .line 147
    invoke-direct {p0, v7, v8}, Lo/axf;->c(J)V

    .line 150
    new-instance v9, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {v9}, Lcom/huawei/health/sns/model/user/UserNotify;-><init>()V

    .line 151
    invoke-virtual {v9, v7, v8}, Lcom/huawei/health/sns/model/user/UserNotify;->setUserId(J)V

    .line 152
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/axi;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    .line 154
    :cond_2
    const-string v0, "UserRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestOtherSNSInfo exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 159
    :cond_3
    iget v0, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lo/axf;->b(III)V

    .line 160
    const-string v0, "UserRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestOtherSNSInfo exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    :goto_0
    return-void
.end method


# virtual methods
.method public c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V
    .locals 1

    .line 81
    new-instance v0, Lo/axf$2;

    invoke-direct {v0, p0, p3, p1, p2}, Lo/axf$2;-><init>(Lo/axf;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;ILandroid/content/Context;)V

    invoke-static {p4, v0}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 108
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 48
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    new-instance v1, Lo/axf$1;

    invoke-direct {v1, p0, p1}, Lo/axf$1;-><init>(Lo/axf;I)V

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    .line 68
    return-void
.end method
