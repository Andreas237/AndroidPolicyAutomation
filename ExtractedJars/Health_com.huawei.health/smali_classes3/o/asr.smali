.class public Lo/asr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asr;->a:Landroid/os/Handler;

    .line 84
    iput-object p1, p0, Lo/asr;->a:Landroid/os/Handler;

    .line 85
    return-void
.end method

.method private b(JLjava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Ljava/lang/Long;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 318
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 320
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 321
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/User;

    .line 323
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v9

    .line 324
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 330
    :cond_0
    invoke-virtual {v8, v6}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_name_split_char:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    :goto_1
    goto :goto_0

    .line 334
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 335
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 337
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 338
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_non_friend_alert_info:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v7}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 339
    const/16 v0, 0xe2

    const/4 v1, 0x0

    const/16 v2, 0xe6

    invoke-direct {p0, v0, v1, v2, v8}, Lo/asr;->e(IIILjava/lang/Object;)V

    .line 340
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {v0, p1, p2, p4}, Lo/aqj;->b(JLjava/util/List;)V

    .line 342
    :cond_2
    return-object v5
.end method

.method private static b(Lo/asr;JLjava/util/ArrayList;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asr;JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 140
    new-instance v0, Lo/asr$3;

    invoke-direct {v0, p1, p2, p3, p0}, Lo/asr$3;-><init>(JLjava/util/ArrayList;Lo/asr;)V

    return-object v0
.end method

.method private static c(Lo/asr;JLjava/util/ArrayList;)Lo/aud;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asr;JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)Lo/aud;"
        }
    .end annotation

    .line 111
    new-instance v0, Lo/asr$5;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/asr$5;-><init>(Lo/asr;JLjava/util/ArrayList;)V

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JLjava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 171
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 173
    return-void

    .line 175
    :cond_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_b

    .line 177
    iget v6, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    .line 180
    if-nez v6, :cond_8

    .line 182
    const/4 v7, 0x0

    .line 183
    instance-of v0, p1, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;

    if-eqz v0, :cond_1

    .line 185
    move-object v7, p1

    check-cast v7, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;

    .line 188
    :cond_1
    if-eqz v7, :cond_7

    .line 190
    iget-object v8, v7, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;->InviteToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;

    .line 191
    if-eqz v8, :cond_7

    .line 193
    invoke-virtual {v8}, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->getResult_()I

    move-result v9

    .line 194
    invoke-virtual {v8}, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->getInviteTime_()Ljava/lang/String;

    move-result-object v10

    .line 196
    const/4 v0, 0x2

    if-ne v9, v0, :cond_2

    .line 198
    const/16 v0, 0xe2

    const/4 v1, 0x0

    const/16 v2, 0xe3

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/asr;->e(IIILjava/lang/Object;)V

    .line 200
    return-void

    .line 203
    :cond_2
    const/4 v0, 0x3

    if-ne v9, v0, :cond_3

    .line 205
    const/16 v0, 0xe2

    const/4 v1, 0x0

    const/16 v2, 0xe5

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/asr;->e(IIILjava/lang/Object;)V

    .line 208
    move-object v0, p0

    move-object v1, p4

    move-wide v2, p2

    move-object v4, v10

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Lo/asr;->c(Ljava/util/ArrayList;JLjava/lang/String;I)V

    .line 211
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p2, p3}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 212
    return-void

    .line 216
    :cond_3
    if-nez v9, :cond_4

    .line 219
    move-object v0, p0

    move-wide v1, p2

    move-object v3, v10

    move-object v4, p4

    invoke-virtual {v8}, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->getFailUserList_()Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/asr;->d(JLjava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    goto :goto_0

    .line 222
    :cond_4
    const/4 v0, 0x1

    if-ne v9, v0, :cond_5

    .line 224
    move-object v0, p0

    move-object v1, p4

    move-wide v2, p2

    move-object v4, v10

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Lo/asr;->c(Ljava/util/ArrayList;JLjava/lang/String;I)V

    goto :goto_0

    .line 227
    :cond_5
    const/4 v0, 0x4

    if-ne v9, v0, :cond_6

    .line 230
    invoke-virtual {v8}, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->getFailUserList_()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p2, p3, p4, v0}, Lo/asr;->e(JLjava/util/ArrayList;Ljava/util/List;)V

    .line 234
    :cond_6
    :goto_0
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p2, p3}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 235
    const/16 v0, 0xe4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/asr;->e(IIILjava/lang/Object;)V

    .line 238
    :cond_7
    goto :goto_1

    .line 241
    :cond_8
    const/4 v7, 0x0

    .line 242
    const/16 v0, 0x3f1

    if-ne v6, v0, :cond_9

    .line 244
    const/4 v7, 0x1

    .line 245
    invoke-direct {p0, p4, p2, p3}, Lo/asr;->c(Ljava/util/ArrayList;J)V

    .line 250
    :cond_9
    const/4 v8, 0x0

    .line 251
    if-eqz v7, :cond_a

    .line 253
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 255
    :cond_a
    const/16 v0, 0xe2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v8, v6, v1}, Lo/asr;->e(IIILjava/lang/Object;)V

    .line 256
    const-string v0, "GroupMemberTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseAddMember error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    :goto_1
    goto :goto_2

    .line 261
    :cond_b
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xaaa

    const/4 v3, 0x0

    invoke-direct {p0, v2, v0, v1, v3}, Lo/asr;->e(IIILjava/lang/Object;)V

    .line 262
    const-string v0, "GroupMemberTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseAddMember error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    :goto_2
    return-void
.end method

.method private c(Ljava/util/ArrayList;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;J)V"
        }
    .end annotation

    .line 393
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 395
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 396
    new-instance v3, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 397
    invoke-virtual {v3, p2, p3}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 398
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 399
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 400
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 401
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 402
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 403
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 405
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 406
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 407
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    .line 411
    :cond_0
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p2, p3}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 412
    return-void
.end method

.method private c(Ljava/util/ArrayList;JLjava/lang/String;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;JLjava/lang/String;I)V"
        }
    .end annotation

    .line 355
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 356
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 358
    new-instance v5, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 359
    invoke-virtual {v5, p2, p3}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 360
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 361
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 362
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 363
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 364
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 366
    invoke-static {p4}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 367
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    const-string v0, "GroupMemberTask"

    const-string v1, "inviteToJoinGrpRsp inviteTime is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 372
    :cond_0
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 373
    invoke-virtual {v5, p5}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 374
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    goto/16 :goto_0

    .line 377
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 379
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p2, p3, v2}, Lo/ath;->a(JLjava/util/List;)Z

    .line 381
    :cond_2
    return-void
.end method

.method static synthetic c(Lo/asr;IIILjava/lang/Object;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lo/asr;->e(IIILjava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lo/asr;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JLjava/util/ArrayList;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lo/asr;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JLjava/util/ArrayList;)V

    return-void
.end method

.method private d(JLjava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 295
    if-eqz p5, :cond_0

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 297
    :cond_0
    move-object v0, p0

    move-object v1, p4

    move-wide v2, p1

    move-object v4, p3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/asr;->c(Ljava/util/ArrayList;JLjava/lang/String;I)V

    .line 298
    return-void

    .line 301
    :cond_1
    invoke-direct {p0, p1, p2, p4, p5}, Lo/asr;->b(JLjava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v6

    .line 302
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 304
    move-object v0, p0

    move-object v1, v6

    move-wide v2, p1

    move-object v4, p3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/asr;->c(Ljava/util/ArrayList;JLjava/lang/String;I)V

    .line 306
    :cond_2
    return-void
.end method

.method static synthetic e(Lo/asr;JLjava/util/ArrayList;)Lo/brd;
    .locals 1

    .line 39
    invoke-static {p0, p1, p2, p3}, Lo/asr;->b(Lo/asr;JLjava/util/ArrayList;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private e(IIILjava/lang/Object;)V
    .locals 2

    .line 424
    iget-object v0, p0, Lo/asr;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lo/asr;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/asr;->a:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 428
    :cond_0
    return-void
.end method

.method private e(JLjava/util/ArrayList;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 275
    if-eqz p4, :cond_0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 277
    :cond_0
    new-instance v0, Lo/axy;

    invoke-direct {v0}, Lo/axy;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lo/axy;->d(JLjava/util/ArrayList;)V

    .line 278
    return-void

    .line 280
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lo/asr;->b(JLjava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 281
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 283
    new-instance v0, Lo/axy;

    invoke-direct {v0}, Lo/axy;-><init>()V

    invoke-virtual {v0, p1, p2, v1}, Lo/axy;->d(JLjava/util/ArrayList;)V

    .line 285
    :cond_2
    return-void
.end method


# virtual methods
.method public c(JLjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 92
    if-nez p3, :cond_0

    .line 94
    return-void

    .line 97
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lo/asr;->c(Lo/asr;JLjava/util/ArrayList;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 98
    return-void
.end method
