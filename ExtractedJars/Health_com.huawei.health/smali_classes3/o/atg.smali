.class public Lo/atg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/bqy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/bqy<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Ljava/lang/String;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atg;->e:Landroid/os/Handler;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atg;->a:Lo/bqy;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atg;->c:Ljava/lang/String;

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/atg;->b:I

    .line 85
    iput-object p1, p0, Lo/atg;->e:Landroid/os/Handler;

    .line 86
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 135
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/atg;->d(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 137
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;Z)Ljava/lang/String;

    .line 140
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->g(J)V

    .line 142
    return-object v3
.end method

.method private a(JLo/atl;Z)Lo/aud;
    .locals 6

    .line 97
    new-instance v0, Lo/atg$1;

    move-object v1, p0

    move v2, p4

    move-wide v3, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/atg$1;-><init>(Lo/atg;ZJLo/atl;)V

    return-object v0
.end method

.method private static a(Lo/atg;JLo/atl;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/atg;JLo/atl;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 304
    new-instance v0, Lo/atg$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/atg$4;-><init>(Lo/atg;JLo/atl;)V

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;JLjava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;JLjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 449
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->getGrpMemberList_()Ljava/util/List;

    move-result-object v2

    .line 450
    if-eqz v2, :cond_1

    .line 452
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/group/RspGroupMember;

    .line 454
    new-instance v5, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 455
    invoke-virtual {v5, p2, p3}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 456
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getMbUID_()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 457
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 458
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 459
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getUserNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 460
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getMbNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserGroupNickname(Ljava/lang/String;)V

    .line 461
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getJoinTime_()Ljava/lang/String;

    move-result-object v6

    .line 462
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 464
    const-string v0, "GroupMemberRequestTask"

    const-string v1, "GroupMemberTask processGroupMemberResponse inviteTime is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 467
    :cond_0
    invoke-static {v6}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 468
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getState_()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 469
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getSiteID_()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSiteId(I)V

    .line 471
    invoke-virtual {p4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    goto/16 :goto_0

    .line 474
    :cond_1
    return-void
.end method

.method private c(III)V
    .locals 2

    .line 485
    iget-object v0, p0, Lo/atg;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lo/atg;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/atg;->e:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 489
    :cond_0
    return-void
.end method

.method private c(J)V
    .locals 5

    .line 425
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    .line 426
    if-nez v2, :cond_0

    .line 428
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_deteted_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 430
    new-instance v4, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 431
    invoke-virtual {v4, p1, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 432
    invoke-virtual {v4, v3}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 433
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 434
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 435
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 437
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/atg;JLo/atl;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/atg;->d(JLo/atl;)V

    return-void
.end method

.method private d(J)Ljava/util/ArrayList;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x1

    .line 188
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 189
    new-instance v10, Lo/atk;

    invoke-direct {v10}, Lo/atk;-><init>()V

    .line 191
    move-wide/from16 v0, p1

    invoke-virtual {v10, v0, v1}, Lo/atk;->e(J)Ljava/lang/String;

    move-result-object v11

    .line 194
    const/4 v12, 0x0

    .line 195
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Lo/ath;->b(J)Ljava/util/ArrayList;

    move-result-object v12

    .line 202
    :cond_0
    new-instance v13, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;

    move-wide/from16 v0, p1

    const/16 v2, 0x64

    invoke-direct {v13, v0, v1, v2}, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;-><init>(JI)V

    .line 203
    iget-object v0, p0, Lo/atg;->c:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v13, v11, v0, v1}, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->setData(Ljava/lang/String;Ljava/lang/String;I)V

    .line 204
    invoke-static {v13}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v14

    .line 205
    move-object v0, p0

    move-object v1, v14

    move-object v2, v9

    move-wide/from16 v3, p1

    move v5, v8

    invoke-direct/range {v0 .. v5}, Lo/atg;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/ArrayList;JZ)Z

    move-result v7

    .line 206
    const/4 v8, 0x0

    .line 208
    iget v0, p0, Lo/atg;->b:I

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 211
    :goto_0
    if-eqz v6, :cond_2

    if-nez v7, :cond_0

    .line 213
    :cond_2
    if-nez v7, :cond_3

    .line 216
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 217
    return-object v9

    .line 220
    :cond_3
    const-string v0, "GroupMemberRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncRequestGroupMember newGroupMemberList.size() is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 224
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2, v12, v9}, Lo/ath;->d(JLjava/util/List;Ljava/util/List;)Z

    move-result v13

    .line 228
    if-eqz v13, :cond_4

    .line 230
    const-string v0, "GroupMemberRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Save GroupMember version:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/atg;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    iget-object v0, p0, Lo/atg;->c:Ljava/lang/String;

    move-wide/from16 v1, p1

    invoke-virtual {v10, v1, v2, v0}, Lo/atk;->c(JLjava/lang/String;)V

    .line 235
    move-wide/from16 v0, p1

    invoke-virtual {v10, v0, v1}, Lo/atk;->d(J)V

    goto :goto_1

    .line 239
    :cond_4
    const-string v0, "GroupMemberRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncRequestGroupMember isUpdateDbSucceed is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " isProcessSucceed="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    :cond_5
    :goto_1
    invoke-direct {p0}, Lo/atg;->e()V

    .line 246
    return-object v9
.end method

.method private d(JLo/atl;)V
    .locals 2

    .line 290
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1, p2, p3}, Lo/atg;->a(Lo/atg;JLo/atl;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    move-result-object v0

    iput-object v0, p0, Lo/atg;->a:Lo/bqy;

    .line 291
    return-void
.end method

.method static synthetic d(Lo/atg;III)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/atg;->c(III)V

    return-void
.end method

.method static synthetic d(Lo/atg;JLo/atl;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/atg;->e(JLo/atl;)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/ArrayList;JZ)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;JZ)Z"
        }
    .end annotation

    .line 359
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 361
    const/4 v0, 0x0

    return v0

    .line 363
    :cond_0
    const/4 v3, 0x0

    .line 365
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_8

    .line 368
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_5

    .line 370
    const/4 v4, 0x0

    .line 371
    instance-of v0, p1, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;

    if-eqz v0, :cond_1

    .line 373
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;

    .line 375
    :cond_1
    const/4 v5, 0x0

    .line 376
    if-eqz v4, :cond_2

    .line 378
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;->getGetGrpMemberListRsp_()Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;

    move-result-object v5

    .line 380
    :cond_2
    if-eqz v5, :cond_4

    .line 382
    if-eqz p5, :cond_3

    .line 384
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->getTotalNum_()I

    move-result v0

    iput v0, p0, Lo/atg;->b:I

    .line 385
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->getNewVersion_()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/atg;->c:Ljava/lang/String;

    .line 388
    :cond_3
    iget v0, p0, Lo/atg;->b:I

    if-lez v0, :cond_4

    .line 390
    invoke-direct {p0, v5, p3, p4, p2}, Lo/atg;->b(Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;JLjava/util/ArrayList;)V

    .line 391
    const/4 v3, 0x1

    .line 394
    :cond_4
    goto :goto_0

    .line 397
    :cond_5
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f2

    if-ne v0, v1, :cond_6

    .line 399
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p3, p4, v1}, Lo/atc;->e(JZ)Z

    .line 400
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0xe2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/atg;->c(III)V

    .line 403
    :cond_6
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f0

    if-ne v0, v1, :cond_7

    .line 405
    invoke-direct {p0, p3, p4}, Lo/atg;->c(J)V

    .line 407
    :cond_7
    const-string v0, "GroupMemberRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processGroupMemberResponse error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 412
    :cond_8
    const-string v0, "GroupMemberRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processGroupMemberResponse error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    :goto_0
    return v3
.end method

.method private e()V
    .locals 1

    .line 496
    const/4 v0, 0x0

    iput v0, p0, Lo/atg;->b:I

    .line 497
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atg;->c:Ljava/lang/String;

    .line 498
    return-void
.end method

.method private e(JLo/atl;)V
    .locals 2

    .line 267
    invoke-virtual {p0, p1, p2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 268
    iget-object v0, p0, Lo/atg;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lo/atg;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 271
    const/16 v0, 0x1e1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 272
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 273
    iget-object v0, p0, Lo/atg;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 276
    :cond_0
    if-eqz p3, :cond_1

    .line 278
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lo/atl;->d(I)V

    .line 280
    :cond_1
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .line 333
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lo/atg;->a(JLo/atl;Z)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->c(Lo/aud;)V

    .line 334
    return-void
.end method

.method public b(J)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 153
    invoke-direct {p0, p1, p2}, Lo/atg;->d(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 155
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->a(J)Ljava/lang/String;

    .line 158
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->g(J)V

    .line 160
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ath;->e(J)I

    move-result v4

    .line 163
    if-lez v4, :cond_0

    .line 166
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    .line 167
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    .line 166
    invoke-virtual {v0, p1, p2, v1, v2}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v5

    .line 168
    if-nez v5, :cond_0

    .line 170
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/atc;->e(JZ)Z

    .line 174
    :cond_0
    return-object v3
.end method

.method public c()V
    .locals 1

    .line 505
    iget-object v0, p0, Lo/atg;->a:Lo/bqy;

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Lo/atg;->a:Lo/bqy;

    invoke-interface {v0}, Lo/bqy;->b()V

    .line 509
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1

    .line 257
    invoke-direct {p0, p1}, Lo/atg;->a(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    .line 258
    return-void
.end method

.method public e(J)V
    .locals 2

    .line 323
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/atg;->a(JLo/atl;Z)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 324
    return-void
.end method
