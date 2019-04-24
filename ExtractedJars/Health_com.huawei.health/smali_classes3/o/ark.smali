.class public Lo/ark;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    .line 126
    invoke-direct {p0, p1}, Lo/ark;->d(Landroid/os/Handler;)V

    .line 127
    return-void
.end method

.method static synthetic a(JLo/ark;I)Lo/brd;
    .locals 1

    .line 34
    invoke-static {p0, p1, p2, p3}, Lo/ark;->b(JLo/ark;I)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private a(JZI)V
    .locals 4

    .line 419
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    .line 420
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 423
    const/16 v0, 0x201

    iput v0, v2, Landroid/os/Message;->what:I

    .line 424
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 425
    const-string v0, "bundleKeyAssistant"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 426
    const-string v0, "bundleKeyNeedFollow"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 427
    const-string v0, "bundleKeyNeedRefreshUI"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 428
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 429
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 431
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 398
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 400
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 401
    const/16 v0, 0x205

    iput v0, v1, Landroid/os/Message;->what:I

    .line 402
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 403
    const-string v0, "bundleKeyOldNickname"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    const-string v0, "bundleKeyNewNickname"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 406
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 408
    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)I
    .locals 6

    .line 191
    if-nez p1, :cond_0

    .line 193
    const/4 v0, -0x1

    return v0

    .line 196
    :cond_0
    const/4 v3, -0x1

    .line 198
    iget v0, p1, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    if-nez v0, :cond_4

    .line 201
    iget v0, p1, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    if-nez v0, :cond_3

    .line 203
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->getGetOtherUserInfoRsp_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    move-result-object v4

    .line 204
    if-eqz v4, :cond_2

    .line 206
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->getOtherUserInfo_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    move-result-object v5

    .line 207
    if-eqz v5, :cond_1

    .line 209
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getFrdState()I

    move-result v3

    .line 211
    :cond_1
    const-string v0, "AssistantTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseFrdStateResponse frdState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :cond_2
    goto :goto_0

    .line 216
    :cond_3
    const-string v0, "AssistantTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseFrdStateResponse exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 221
    :cond_4
    const-string v0, "AssistantTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseFrdStateResponse exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    :goto_0
    return v3
.end method

.method private static b(JLo/ark;I)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLo/ark;I)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 316
    new-instance v0, Lo/ark$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/ark$2;-><init>(JLo/ark;I)V

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JI)V
    .locals 6

    .line 339
    if-nez p1, :cond_0

    .line 341
    const/16 v0, 0x202

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ark;->c(II)V

    .line 342
    const-string v0, "AssistantTask"

    const-string v1, "GetAssistantInfo error! response == null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    return-void

    .line 345
    :cond_0
    const/4 v3, 0x0

    .line 346
    instance-of v0, p1, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;

    if-eqz v0, :cond_1

    .line 348
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;

    .line 351
    :cond_1
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_5

    .line 353
    if-eqz v3, :cond_3

    iget v0, v3, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    if-nez v0, :cond_3

    .line 355
    new-instance v0, Lo/ari;

    invoke-direct {v0}, Lo/ari;-><init>()V

    invoke-virtual {v0, p2, p3, v3}, Lo/ari;->a(JLcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v4

    .line 359
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 360
    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 361
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 362
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 365
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/ark;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    :cond_2
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/apg;->c(Lcom/huawei/health/sns/model/chat/Assistant;)Z

    .line 370
    const/4 v0, 0x1

    invoke-direct {p0, p2, p3, v0, p4}, Lo/ark;->a(JZI)V

    .line 371
    goto :goto_0

    .line 374
    :cond_3
    if-eqz v3, :cond_4

    .line 376
    iget v0, v3, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    const/16 v1, 0x202

    invoke-direct {p0, v1, v0}, Lo/ark;->c(II)V

    .line 377
    const-string v0, "AssistantTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GetAssistantInfo error! errcode_ == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 381
    :cond_4
    const-string v0, "AssistantTask"

    const-string v1, "GetAssistantInfo error! getAssistantInfoResponse null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 387
    :cond_5
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0x202

    invoke-direct {p0, v1, v0}, Lo/ark;->c(II)V

    .line 388
    const-string v0, "AssistantTask"

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

    .line 391
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/ark;J)Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;
    .locals 1

    .line 34
    invoke-direct {p0, p1, p2}, Lo/ark;->e(J)Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    move-result-object v0

    return-object v0
.end method

.method private c(II)V
    .locals 3

    .line 441
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lo/ark;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/ark;->d:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, p2, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 445
    :cond_0
    return-void
.end method

.method private c(JI)V
    .locals 2

    .line 235
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/ark$3;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/ark$3;-><init>(Lo/ark;JI)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 245
    return-void
.end method

.method static synthetic c(Lo/ark;JI)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/ark;->e(JI)V

    return-void
.end method

.method private static d(JLo/ark;I)Lo/aud;
    .locals 1

    .line 284
    new-instance v0, Lo/ark$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/ark$4;-><init>(JLo/ark;I)V

    return-object v0
.end method

.method private d(Landroid/os/Handler;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/ark;->d:Landroid/os/Handler;

    .line 117
    return-void
.end method

.method static synthetic d(Lo/ark;II)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lo/ark;->c(II)V

    return-void
.end method

.method static synthetic e(Lo/ark;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)I
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/ark;->b(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)I

    move-result v0

    return v0
.end method

.method private e(J)Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;
    .locals 9

    .line 172
    const/4 v6, 0x0

    .line 173
    new-instance v7, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v7}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 174
    move-object v0, v7

    move-wide v1, p1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 175
    invoke-static {v7}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v8

    .line 176
    instance-of v0, v8, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    if-eqz v0, :cond_0

    .line 178
    move-object v6, v8

    check-cast v6, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    .line 180
    :cond_0
    return-object v6
.end method

.method private e(JI)V
    .locals 2

    .line 265
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    const/16 v0, 0x204

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ark;->c(II)V

    .line 268
    return-void

    .line 271
    :cond_0
    invoke-static {p1, p2, p0, p3}, Lo/ark;->d(JLo/ark;I)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->e(Lo/aud;)V

    .line 272
    return-void
.end method

.method static synthetic e(Lo/ark;JI)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/ark;->c(JI)V

    return-void
.end method

.method static synthetic e(Lo/ark;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JI)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ark;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JI)V

    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 1

    .line 254
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/ark;->e(JI)V

    .line 255
    return-void
.end method

.method public d(J)V
    .locals 2

    .line 136
    new-instance v0, Lo/ark$1;

    invoke-direct {v0, p0, p1, p2}, Lo/ark$1;-><init>(Lo/ark;J)V

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 162
    return-void
.end method
