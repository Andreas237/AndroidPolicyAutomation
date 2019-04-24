.class public Lo/atm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atm;->e:Landroid/os/Handler;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atm;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 101
    iput-object p1, p0, Lo/atm;->e:Landroid/os/Handler;

    .line 102
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 512
    iget-object v0, p0, Lo/atm;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 514
    iget-object v0, p0, Lo/atm;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 515
    const/16 v0, 0xa1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 516
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 517
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 518
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 519
    iget-object v0, p0, Lo/atm;->e:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 521
    :cond_0
    iget-object v0, p0, Lo/atm;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 522
    iget-object v0, p0, Lo/atm;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 524
    :cond_1
    return-void
.end method

.method private a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 344
    if-nez p1, :cond_0

    .line 346
    const/16 v0, 0xa2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/atm;->d(III)V

    .line 347
    const-string v0, "CreateGroupTask"

    const-string v1, "createGroup error! response == null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    return-void

    .line 351
    :cond_0
    iget v3, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 352
    if-nez v3, :cond_2

    .line 354
    iget v4, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    .line 356
    if-nez v4, :cond_1

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/CreateGroupResponse;

    if-eqz v0, :cond_1

    .line 358
    move-object v5, p1

    check-cast v5, Lcom/huawei/health/sns/server/group/CreateGroupResponse;

    .line 359
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 360
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->getGrpName_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v5, p3, v6, v0}, Lo/atm;->c(Lcom/huawei/health/sns/server/group/CreateGroupResponse;Ljava/util/ArrayList;ILjava/lang/String;)V

    .line 361
    goto :goto_0

    .line 364
    :cond_1
    const/16 v0, 0xa2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v4}, Lo/atm;->d(III)V

    .line 365
    const-string v0, "CreateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createGroup error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    :goto_0
    goto :goto_1

    .line 370
    :cond_2
    const/16 v0, 0xaaa

    const/4 v1, 0x0

    invoke-direct {p0, v0, v3, v1}, Lo/atm;->d(III)V

    .line 371
    const-string v0, "CreateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createGroup error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lo/atm;->c(Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method private static b(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/awj$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/atm;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)Lo/awj$a;"
        }
    .end annotation

    .line 137
    new-instance v0, Lo/atm$1;

    invoke-direct {v0, p0, p1, p2}, Lo/atm$1;-><init>(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Ljava/lang/Long;>;Z)V"
        }
    .end annotation

    .line 456
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 458
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lo/atm;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Z)V

    .line 459
    return-void

    .line 462
    :cond_1
    if-nez p2, :cond_2

    .line 464
    return-void

    .line 467
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 468
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/User;

    .line 470
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v6

    .line 471
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 473
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    :cond_3
    goto :goto_0

    .line 477
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 479
    invoke-direct {p0, p1, v3, p4}, Lo/atm;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Z)V

    .line 481
    :cond_5
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p3}, Lo/aqj;->b(JLjava/util/List;)V

    .line 482
    return-void
.end method

.method private static c(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/atm;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 209
    new-instance v0, Lo/atm$3;

    invoke-direct {v0, p1, p2, p0}, Lo/atm$3;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lo/atm;)V

    return-object v0
.end method

.method private c(ILcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;Ljava/util/ArrayList;ILjava/lang/String;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;ILjava/lang/String;)V"
        }
    .end annotation

    .line 414
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v7

    .line 415
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getGrpID_()J

    move-result-wide v9

    .line 416
    new-instance v11, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v11, v9, v10}, Lcom/huawei/health/sns/model/group/Group;-><init>(J)V

    .line 417
    const/4 v12, 0x0

    .line 418
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    const/4 v12, 0x1

    .line 424
    :cond_0
    const/4 v13, -0x1

    .line 425
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v14

    .line 426
    if-eqz v14, :cond_1

    .line 428
    invoke-virtual {v14}, Lo/axr;->c()I

    move-result v13

    .line 430
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v11, v13, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupSiteAndMode(II)V

    .line 431
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getCreateTime_()Ljava/lang/String;

    move-result-object v15

    .line 432
    move-object v0, v11

    move/from16 v1, p4

    move-wide v2, v7

    move-object/from16 v4, p5

    move v5, v12

    invoke-static {v15}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/health/sns/model/group/Group;->setGroupData(IJLjava/lang/String;ILjava/lang/String;)V

    .line 433
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/atm;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 436
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, v9, v10}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 437
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v9, v10}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v11

    .line 438
    if-eqz v11, :cond_3

    .line 441
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getFailUserList_()Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    move-object/from16 v2, p0

    move-object/from16 v3, p3

    invoke-direct {v2, v11, v3, v0, v1}, Lo/atm;->b(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Ljava/util/List;Z)V

    .line 443
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/atm;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 444
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/group/CreateGroupResponse;Ljava/util/ArrayList;ILjava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/group/CreateGroupResponse;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;ILjava/lang/String;)V"
        }
    .end annotation

    .line 385
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/CreateGroupResponse;->getCreateGroupRsp_()Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    move-result-object v6

    .line 386
    if-eqz v6, :cond_2

    .line 388
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getResult_()I

    move-result v7

    .line 390
    if-eqz v7, :cond_0

    const/4 v0, 0x4

    if-ne v7, v0, :cond_1

    .line 392
    :cond_0
    move-object v0, p0

    move v1, v7

    move-object v2, v6

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/atm;->c(ILcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;Ljava/util/ArrayList;ILjava/lang/String;)V

    goto :goto_0

    .line 396
    :cond_1
    const/16 v0, 0xa2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v7}, Lo/atm;->d(III)V

    .line 397
    const-string v0, "CreateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createGroup error! groupInfoRsp.result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 169
    invoke-static {p0, p1, p2}, Lo/atm;->d(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 170
    return-void
.end method

.method private static d(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/aud;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/atm;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)Lo/aud;"
        }
    .end annotation

    .line 182
    new-instance v0, Lo/atm$2;

    invoke-direct {v0, p0, p1, p2}, Lo/atm$2;-><init>(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-object v0
.end method

.method private d(III)V
    .locals 2

    .line 535
    iget-object v0, p0, Lo/atm;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 537
    iget-object v0, p0, Lo/atm;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/atm;->e:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 539
    :cond_0
    iget-object v0, p0, Lo/atm;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 541
    iget-object v0, p0, Lo/atm;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 543
    :cond_1
    return-void
.end method

.method static synthetic d(Lo/atm;III)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lo/atm;->d(III)V

    return-void
.end method

.method static synthetic e(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/brd;
    .locals 1

    .line 46
    invoke-static {p0, p1, p2}, Lo/atm;->c(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1

    .line 553
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 554
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 493
    if-eqz p3, :cond_0

    .line 496
    new-instance v0, Lo/axy;

    invoke-direct {v0}, Lo/axy;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/axy;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 501
    :cond_0
    new-instance v0, Lo/asy;

    invoke-direct {v0}, Lo/asy;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/asy;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V

    .line 503
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/atm;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lo/atm;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/atm;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 106
    return-void
.end method

.method public e(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 116
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->e()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v2

    .line 118
    if-nez v2, :cond_0

    .line 120
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-static {p0, p1, p2}, Lo/atm;->b(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/awj$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    goto :goto_0

    .line 124
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/atm;->c(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 126
    :goto_0
    return-void
.end method
