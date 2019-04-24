.class public Lo/arg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    .line 105
    invoke-direct {p0, p1}, Lo/arg;->a(Landroid/os/Handler;)V

    .line 106
    return-void
.end method

.method private a(Landroid/os/Handler;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/arg;->b:Landroid/os/Handler;

    .line 96
    return-void
.end method

.method static synthetic a(Lo/arg;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lo/arg;->c(Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V

    return-void
.end method

.method static synthetic b(Lo/arg;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/arg;->d(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private c()V
    .locals 3

    .line 355
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    const v1, 0xad03

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 358
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 360
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V
    .locals 6

    .line 157
    iget v0, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    if-nez v0, :cond_3

    .line 160
    iget v0, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    if-nez v0, :cond_1

    .line 162
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->getGetOtherUserInfoRsp_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    move-result-object v3

    .line 163
    if-eqz v3, :cond_0

    .line 165
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->getOtherUserInfo_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    move-result-object v4

    .line 166
    if-eqz v4, :cond_0

    .line 168
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->getDstUserID_()J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lo/awv;->c(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 174
    invoke-direct {p0}, Lo/arg;->c()V

    .line 176
    invoke-direct {p0, v5}, Lo/arg;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 179
    :cond_0
    goto :goto_0

    .line 184
    :cond_1
    iget v0, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    const/16 v1, 0x3ed

    if-ne v0, v1, :cond_2

    .line 185
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->getDstUserID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->c(J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    new-instance v3, Lo/awr;

    invoke-direct {v3}, Lo/awr;-><init>()V

    .line 188
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/awr;->c(Lo/bra;)I

    .line 190
    :cond_2
    iget v0, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    const v1, 0xad02

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/arg;->d(III)V

    .line 191
    const-string v0, "AssistantDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestOtherSNSInfo exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 196
    :cond_3
    iget v0, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    const v1, 0xad02

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/arg;->d(III)V

    .line 197
    const-string v0, "AssistantDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestOtherSNSInfo exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    :goto_0
    return-void
.end method

.method private d()V
    .locals 3

    .line 367
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    const v1, 0xad06

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 370
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 372
    :cond_0
    return-void
.end method

.method private d(III)V
    .locals 2

    .line 383
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    .line 386
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 388
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 344
    if-eqz p1, :cond_0

    .line 346
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/axa;->e(Lcom/huawei/health/sns/model/user/User;)Z

    .line 348
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 225
    new-instance v0, Lo/arg$4;

    invoke-direct {v0, p0, p1}, Lo/arg$4;-><init>(Lo/arg;Lcom/huawei/health/sns/model/user/User;)V

    invoke-static {v0}, Lo/aty;->e(Lo/aud;)V

    .line 261
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 206
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 209
    const v0, 0xad07

    iput v0, v1, Landroid/os/Message;->what:I

    .line 210
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 211
    const-string v0, "bundleKeyOldNickname"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const-string v0, "bundleKeyNewNickname"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 214
    iget-object v0, p0, Lo/arg;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 216
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/arg;III)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lo/arg;->d(III)V

    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/user/User;)V
    .locals 9

    .line 271
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_5

    .line 273
    const/4 v6, 0x0

    .line 274
    instance-of v0, p1, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;

    if-eqz v0, :cond_0

    .line 276
    move-object v6, p1

    check-cast v6, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;

    .line 278
    :cond_0
    if-eqz v6, :cond_3

    iget v0, v6, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    if-nez v0, :cond_3

    .line 280
    new-instance v7, Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/chat/Assistant;-><init>()V

    .line 281
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserId(J)V

    .line 282
    move-object v0, v7

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getChannel_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getDefault_msg_()Ljava/lang/String;

    move-result-object v2

    .line 283
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getCompany_()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getIntroduction_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getMenu_()Ljava/lang/String;

    move-result-object v5

    .line 282
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/chat/Assistant;->setSomeInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getAccount_name_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setNickName(Ljava/lang/String;)V

    .line 285
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->getAppinfo_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->parseAssistAppInfo(Ljava/lang/String;)V

    .line 288
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v8

    .line 289
    if-eqz v8, :cond_1

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 290
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 291
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 294
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/arg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 302
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 304
    :cond_2
    invoke-direct {p0, p2}, Lo/arg;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 306
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/apg;->c(Lcom/huawei/health/sns/model/chat/Assistant;)Z

    .line 309
    invoke-direct {p0}, Lo/arg;->d()V

    .line 310
    goto :goto_0

    .line 314
    :cond_3
    invoke-direct {p0, p2}, Lo/arg;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 315
    if-eqz v6, :cond_4

    .line 317
    iget v0, v6, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    const v1, 0xad05

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/arg;->d(III)V

    .line 318
    const-string v0, "AssistantDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GetAssistantInfo error! errcode_ == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v6, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 322
    :cond_4
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const v2, 0xad05

    invoke-direct {p0, v2, v0, v1}, Lo/arg;->d(III)V

    .line 323
    const-string v0, "AssistantDetailTask"

    const-string v1, "GetAssistantInfo error! getAssistantInfoResponse null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    :goto_0
    goto :goto_1

    .line 330
    :cond_5
    invoke-direct {p0, p2}, Lo/arg;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 331
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const v1, 0xad05

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/arg;->d(III)V

    .line 332
    const-string v0, "AssistantDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GetAssistantInfo error, response.responseCode != SNSHttpCode.OK errcode_ == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    :goto_1
    return-void
.end method

.method public d(J)V
    .locals 2

    .line 115
    new-instance v0, Lo/arg$2;

    invoke-direct {v0, p0, p1, p2}, Lo/arg$2;-><init>(Lo/arg;J)V

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 147
    return-void
.end method
