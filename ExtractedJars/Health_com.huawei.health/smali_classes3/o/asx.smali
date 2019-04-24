.class public Lo/asx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    .line 68
    invoke-direct {p0, p1}, Lo/asx;->e(Landroid/os/Handler;)V

    .line 69
    return-void
.end method

.method private a(Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;)Lcom/huawei/health/sns/model/group/Group;
    .locals 5

    .line 388
    if-nez p1, :cond_0

    .line 390
    const/4 v0, 0x0

    return-object v0

    .line 392
    :cond_0
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 393
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getGrpID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 395
    const/4 v3, 0x0

    .line 396
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 400
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 405
    goto :goto_0

    .line 402
    :catch_0
    move-exception v4

    .line 404
    const-string v0, "FoundGroupTask"

    const-string v1, "getGroupByRspGroup info.grpTags_ parse error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    :cond_1
    :goto_0
    invoke-virtual {v2, v3}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 408
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 409
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 410
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getGrpName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 411
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getGrpManagerUID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setManagerId(J)V

    .line 413
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getCreateTime_()Ljava/lang/String;

    move-result-object v4

    .line 414
    invoke-static {v4}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setCreateTime(Ljava/lang/String;)V

    .line 415
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->getMbNum_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setMemCount(I)V

    .line 416
    return-object v2
.end method

.method static synthetic a(Lo/asx;Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/asx;->a(Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/asx;JLjava/util/List;)Ljava/util/ArrayList;
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lo/asx;->d(JLjava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private a(III)V
    .locals 2

    .line 459
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 461
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/asx;->a:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 463
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/asx;J)Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/asx;->e(J)Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/asx;IJZZ)Lo/brd;
    .locals 1

    .line 43
    invoke-static/range {p0 .. p5}, Lo/asx;->e(Lo/asx;IJZZ)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private b(ILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 343
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 346
    iput p1, v1, Landroid/os/Message;->what:I

    .line 347
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 348
    const-string v0, "bundleKeyGroupName"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v0, "bundleKeyGrpMbNumber"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 350
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 351
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 352
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 354
    :cond_0
    return-void
.end method

.method private d(JLjava/util/List;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/server/group/RspGroupMember;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 427
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 429
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 431
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 432
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/group/RspGroupMember;

    .line 434
    new-instance v5, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 435
    invoke-virtual {v5, p1, p2}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 436
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getMbUID_()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 437
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 438
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 439
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getUserNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 440
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getMbNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserGroupNickname(Ljava/lang/String;)V

    .line 441
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getJoinTime_()Ljava/lang/String;

    move-result-object v6

    .line 442
    invoke-static {v6}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 443
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getState_()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 444
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/RspGroupMember;->getSiteID_()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSiteId(I)V

    .line 445
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    goto/16 :goto_0

    .line 447
    :cond_2
    return-object v2
.end method

.method private static d(Lo/asx;IJZZ)Lo/aud;
    .locals 7

    .line 194
    new-instance v0, Lo/asx$1;

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lo/asx$1;-><init>(Lo/asx;IJZZ)V

    return-object v0
.end method

.method private d(ILjava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/Group;)V"
        }
    .end annotation

    .line 366
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 368
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 369
    iput p1, v1, Landroid/os/Message;->what:I

    .line 370
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 371
    const-string v0, "bundleKeyGroupName"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    const-string v0, "bundleKeyGrpMbNumber"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 373
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 374
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 375
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 376
    iget-object v0, p0, Lo/asx;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 378
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/asx;ILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lo/asx;->b(ILjava/lang/String;ILjava/util/ArrayList;)V

    return-void
.end method

.method private e(J)Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;
    .locals 6

    .line 153
    new-instance v3, Lcom/huawei/health/sns/server/group/FindGroupRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/group/FindGroupRequest;-><init>()V

    .line 154
    iput-wide p1, v3, Lcom/huawei/health/sns/server/group/FindGroupRequest;->grpID_:J

    .line 155
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 156
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_0

    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    instance-of v0, v4, Lcom/huawei/health/sns/server/group/FindGroupResponse;

    if-eqz v0, :cond_0

    .line 160
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/server/group/FindGroupResponse;

    .line 161
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/FindGroupResponse;->getFindGroupRsp_()Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;

    move-result-object v0

    return-object v0

    .line 165
    :cond_0
    const-string v0, "FoundGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFindGroupRsp error. responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(Lo/asx;IJZZ)Lo/brd;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asx;IJZZ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 226
    new-instance v0, Lo/asx$4;

    move-wide v1, p2

    move-object v3, p0

    move v4, p1

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lo/asx$4;-><init>(JLo/asx;IZZ)V

    return-object v0
.end method

.method private e(IJZZLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 13

    .line 288
    const/4 v6, 0x0

    .line 289
    move-object/from16 v0, p6

    instance-of v0, v0, Lcom/huawei/health/sns/server/group/FindGroupResponse;

    if-eqz v0, :cond_0

    .line 291
    move-object/from16 v6, p6

    check-cast v6, Lcom/huawei/health/sns/server/group/FindGroupResponse;

    .line 293
    :cond_0
    const/4 v7, 0x0

    .line 294
    if-eqz v6, :cond_1

    .line 296
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/group/FindGroupResponse;->getFindGroupRsp_()Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;

    move-result-object v7

    .line 299
    :cond_1
    if-eqz v7, :cond_7

    .line 301
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->getGroup_()Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;

    move-result-object v8

    .line 302
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->getFirstMemberList_()Ljava/util/List;

    move-result-object v9

    .line 303
    if-eqz v8, :cond_2

    if-nez v9, :cond_3

    .line 305
    :cond_2
    const-string v0, "FoundGroupTask"

    const-string v1, " findGroupListener error! rspGroup is null or rspMbList is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const/16 v0, 0xc0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/asx;->a(III)V

    .line 307
    return-void

    .line 309
    :cond_3
    invoke-direct {p0, v8}, Lo/asx;->a(Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v10

    .line 310
    move-wide v0, p2

    invoke-direct {p0, v0, v1, v9}, Lo/asx;->d(JLjava/util/List;)Ljava/util/ArrayList;

    move-result-object v11

    .line 311
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v12

    .line 312
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 314
    invoke-static {v11}, Lo/ati;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v12

    .line 317
    :cond_4
    if-eqz p4, :cond_6

    .line 319
    invoke-virtual {v10, v12}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 320
    if-eqz p5, :cond_5

    .line 322
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 324
    :cond_5
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 325
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    move-wide v1, p2

    invoke-virtual {v0, v1, v2, v11}, Lo/ath;->a(JLjava/util/List;)Z

    .line 328
    :cond_6
    move-object v0, p0

    move v1, p1

    move-object v2, v12

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/Group;->getMemCount()I

    move-result v3

    move-object v4, v11

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lo/asx;->d(ILjava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V

    .line 330
    :cond_7
    return-void
.end method

.method private e(Landroid/os/Handler;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/asx;->a:Landroid/os/Handler;

    .line 59
    return-void
.end method

.method static synthetic e(Lo/asx;III)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lo/asx;->a(III)V

    return-void
.end method

.method static synthetic e(Lo/asx;IJZZLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 43
    invoke-direct/range {p0 .. p6}, Lo/asx;->e(IJZZLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method


# virtual methods
.method public d(IJ)V
    .locals 2

    .line 79
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asx$2;

    invoke-direct {v1, p0, p2, p3, p1}, Lo/asx$2;-><init>(Lo/asx;JI)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 103
    return-void
.end method

.method public d(IJZZ)V
    .locals 1

    .line 179
    invoke-static/range {p0 .. p5}, Lo/asx;->d(Lo/asx;IJZZ)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 180
    return-void
.end method

.method public d(JJLjava/lang/String;)V
    .locals 7

    .line 115
    new-instance v0, Lo/asx$3;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lo/asx$3;-><init>(Lo/asx;JJLjava/lang/String;)V

    invoke-static {v0}, Lo/aty;->c(Lo/aud;)V

    .line 143
    return-void
.end method
