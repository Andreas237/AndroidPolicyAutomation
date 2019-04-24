.class public Lo/atj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atj;->c:Landroid/os/Handler;

    .line 79
    iput-object p1, p0, Lo/atj;->c:Landroid/os/Handler;

    .line 80
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/GroupNotify;)Lcom/huawei/health/sns/model/group/Group;
    .locals 3

    .line 282
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 283
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 284
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 285
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 286
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 287
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 288
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setManagerId(J)V

    .line 289
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getSendTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setCreateTime(Ljava/lang/String;)V

    .line 290
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    .line 291
    return-object v2
.end method

.method private a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupNotify;)V
    .locals 5

    .line 180
    if-nez p1, :cond_0

    .line 182
    return-void

    .line 185
    :cond_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_5

    .line 188
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;

    if-eqz v0, :cond_2

    .line 190
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;

    .line 191
    iget-object v4, v3, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;->AgreeToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;

    .line 192
    if-eqz v4, :cond_1

    .line 194
    invoke-direct {p0, p2, v4}, Lo/atj;->d(Lcom/huawei/health/sns/model/group/GroupNotify;Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;)V

    .line 196
    :cond_1
    goto :goto_1

    .line 199
    :cond_2
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f0

    if-ne v0, v1, :cond_3

    .line 201
    invoke-direct {p0, p2}, Lo/atj;->e(Lcom/huawei/health/sns/model/group/GroupNotify;)V

    goto :goto_0

    .line 203
    :cond_3
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f1

    if-ne v0, v1, :cond_4

    .line 205
    invoke-direct {p0, p2}, Lo/atj;->e(Lcom/huawei/health/sns/model/group/GroupNotify;)V

    .line 208
    :cond_4
    :goto_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0xf2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/atj;->e(III)V

    .line 209
    const-string v0, "HanlerInviteTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "inviteGroup error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 214
    :cond_5
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/atj;->e(III)V

    .line 215
    const-string v0, "HanlerInviteTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "inviteGroup error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/atj;->e(Lcom/huawei/health/sns/model/group/GroupNotify;)V

    return-void
.end method

.method private static c(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 134
    new-instance v0, Lo/atj$2;

    invoke-direct {v0, p2, p1, p0}, Lo/atj$2;-><init>(ZLcom/huawei/health/sns/model/group/GroupNotify;Lo/atj;)V

    return-object v0
.end method

.method private static d(Lo/atj;Landroid/content/Context;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/aud;
    .locals 1

    .line 106
    new-instance v0, Lo/atj$4;

    invoke-direct {v0, p0, p2, p3, p1}, Lo/atj$4;-><init>(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;ZLandroid/content/Context;)V

    return-object v0
.end method

.method static synthetic d(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/brd;
    .locals 1

    .line 34
    invoke-static {p0, p1, p2}, Lo/atj;->c(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/group/GroupNotify;Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;)V
    .locals 6

    .line 227
    const/4 v3, 0x0

    .line 229
    iget v0, p2, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;->result_:I

    if-nez v0, :cond_1

    .line 232
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atb;->d(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 233
    if-nez v3, :cond_0

    .line 235
    invoke-direct {p0, p1}, Lo/atj;->a(Lcom/huawei/health/sns/model/group/GroupNotify;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 238
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 239
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 241
    iget-object v0, p0, Lo/atj;->c:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 243
    iget-object v0, p0, Lo/atj;->c:Landroid/os/Handler;

    const/16 v1, 0xf1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 244
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 245
    const-string v0, "keyGroup"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 246
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 247
    iget-object v0, p0, Lo/atj;->c:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 248
    goto :goto_0

    .line 251
    :cond_1
    iget v0, p2, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;->result_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 253
    const/16 v0, 0xf2

    const/4 v1, 0x0

    const/16 v2, 0xf3

    invoke-direct {p0, v0, v1, v2}, Lo/atj;->e(III)V

    goto :goto_0

    .line 256
    :cond_2
    iget v0, p2, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;->result_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 258
    const/16 v0, 0xf2

    const/4 v1, 0x0

    const/16 v2, 0xf4

    invoke-direct {p0, v0, v1, v2}, Lo/atj;->e(III)V

    .line 260
    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Lo/atj;->e(Lcom/huawei/health/sns/model/group/GroupNotify;)V

    .line 261
    return-void
.end method

.method static synthetic d(Lo/atj;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupNotify;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lo/atj;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupNotify;)V

    return-void
.end method

.method private e(III)V
    .locals 2

    .line 166
    iget-object v0, p0, Lo/atj;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lo/atj;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/atj;->c:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 170
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/GroupNotify;)V
    .locals 5

    .line 270
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/atf;->c(JJ)Z

    .line 272
    invoke-static {}, Lo/aob;->a()V

    .line 273
    return-void
.end method

.method static synthetic e(Lo/atj;III)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/atj;->e(III)V

    return-void
.end method


# virtual methods
.method public d(Landroid/content/Context;Lcom/huawei/health/sns/model/group/GroupNotify;Z)V
    .locals 1

    .line 90
    invoke-static {p0, p1, p2, p3}, Lo/atj;->d(Lo/atj;Landroid/content/Context;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 91
    return-void
.end method
