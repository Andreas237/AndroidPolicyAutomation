.class public Lo/atv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atv;->c:Landroid/os/Handler;

    .line 70
    iput-object p1, p0, Lo/atv;->c:Landroid/os/Handler;

    .line 71
    return-void
.end method

.method private b(III)V
    .locals 2

    .line 360
    iget-object v0, p0, Lo/atv;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lo/atv;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/atv;->c:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 364
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0, p1}, Lo/apf;->d(II)V

    .line 365
    return-void
.end method

.method private b(Ljava/lang/Long;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 7

    .line 314
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 317
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p2, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;

    if-eqz v0, :cond_2

    .line 319
    move-object v3, p2

    check-cast v3, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;

    .line 320
    iget-object v4, v3, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;->GetUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;

    .line 321
    const-string v5, ""

    .line 322
    const-string v6, ""

    .line 323
    if-eqz v4, :cond_0

    .line 324
    iget-object v6, v4, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 325
    iget-object v5, v4, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;->setFlags_:Ljava/lang/String;

    .line 328
    :cond_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 330
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 334
    :cond_1
    invoke-static {v6}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 336
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v5, v6, v0, v1}, Lo/atv;->e(Ljava/lang/String;Ljava/lang/String;J)V

    .line 337
    goto :goto_1

    .line 340
    :cond_2
    const-string v0, "UserGroupSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getUserGrpSettings error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 346
    :cond_3
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/atv;->b(III)V

    .line 347
    const-string v0, "UserGroupSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getUserGrpSettings error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    :goto_1
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 141
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 144
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_1

    .line 146
    iget-object v0, p3, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->setFlags_:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lo/atv;->e(Ljava/lang/String;Ljava/lang/String;J)V

    .line 147
    if-eqz p2, :cond_0

    .line 150
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 152
    const/4 v0, 0x2

    const v1, 0x310dc

    invoke-static {v0, v1, p2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 154
    :cond_0
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0x2a1

    invoke-direct {p0, v2, v0, v1}, Lo/atv;->b(III)V

    goto :goto_0

    .line 158
    :cond_1
    const/16 v0, 0x2a2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/atv;->b(III)V

    .line 159
    const-string v0, "UserGroupSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UpdateUserGrpSettings error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 165
    :cond_2
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xaaa

    invoke-direct {p0, v2, v0, v1}, Lo/atv;->b(III)V

    .line 166
    const-string v0, "UserGroupSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UpdateUserGrpSettings error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 6

    .line 222
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 225
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p2, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;

    if-eqz v0, :cond_2

    .line 227
    move-object v3, p2

    check-cast v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;

    .line 228
    iget-object v4, v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;->UpdateUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;

    .line 229
    const-string v5, ""

    .line 230
    if-eqz v4, :cond_0

    .line 231
    iget-object v5, v4, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 234
    :cond_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 240
    :cond_1
    invoke-static {v5}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 242
    :goto_0
    const-string v0, ""

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-direct {p0, v0, v5, v1, v2}, Lo/atv;->e(Ljava/lang/String;Ljava/lang/String;J)V

    .line 243
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, v5}, Lo/ast;->e(JLjava/lang/String;)Z

    .line 244
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0x2a1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/atv;->b(III)V

    .line 245
    const/4 v0, 0x5

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 246
    goto :goto_1

    .line 249
    :cond_2
    const/16 v0, 0x2a2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/atv;->b(III)V

    .line 250
    const/4 v0, 0x5

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 251
    const-string v0, "UserGroupSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UpdateUserGrpSettings error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 257
    :cond_3
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xaaa

    invoke-direct {p0, v2, v0, v1}, Lo/atv;->b(III)V

    .line 258
    const/4 v0, 0x5

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 259
    const-string v0, "UserGroupSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UpdateUserGrpSettings error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/atv;III)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/atv;->b(III)V

    return-void
.end method

.method static synthetic d(Lo/atv;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lo/atv;->d(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .line 374
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    .line 375
    if-nez v2, :cond_0

    .line 377
    return-void

    .line 379
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 381
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    .line 383
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    .line 384
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    .line 385
    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    goto :goto_0

    .line 389
    :cond_1
    const-string v0, "UserGroupSettingsTask"

    const-string v1, "updateGroupData  setFlags_.length < 3"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    :cond_2
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 394
    invoke-virtual {v2, p2}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 396
    :cond_3
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 397
    return-void
.end method

.method static synthetic e(Lo/atv;Ljava/lang/Long;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lo/atv;->b(Ljava/lang/Long;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1

    .line 177
    new-instance v0, Lo/atv$5;

    invoke-direct {v0, p0, p1}, Lo/atv$5;-><init>(Lo/atv;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 211
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 5

    .line 118
    const/4 v2, 0x0

    .line 119
    new-instance v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;-><init>()V

    .line 120
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->grpID_:J

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSaveToContractMode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->setFlags_:Ljava/lang/String;

    .line 124
    move-object v2, v3

    .line 125
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 127
    invoke-direct {p0, p1, p2, v3, v4}, Lo/atv;->c(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 128
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 81
    new-instance v0, Lo/atv$1;

    invoke-direct {v0, p0, p1, p2}, Lo/atv$1;-><init>(Lo/atv;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 108
    return-void
.end method

.method public d(Ljava/lang/Long;)V
    .locals 1

    .line 270
    new-instance v0, Lo/atv$3;

    invoke-direct {v0, p0, p1}, Lo/atv$3;-><init>(Lo/atv;Ljava/lang/Long;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 303
    return-void
.end method
