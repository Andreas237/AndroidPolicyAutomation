.class public Lo/asu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asu;->e:Landroid/os/Handler;

    .line 94
    iput-object p1, p0, Lo/asu;->e:Landroid/os/Handler;

    .line 95
    return-void
.end method

.method static synthetic a(Lo/asu;Ljava/util/ArrayList;)Lo/brd;
    .locals 1

    .line 44
    invoke-static {p0, p1}, Lo/asu;->c(Lo/asu;Ljava/util/ArrayList;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private a(III)V
    .locals 2

    .line 517
    iget-object v0, p0, Lo/asu;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 519
    iget-object v0, p0, Lo/asu;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/asu;->e:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 521
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 299
    move-object v2, p1

    .line 300
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v3

    .line 301
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    .line 302
    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    .line 301
    invoke-virtual {v3, v0, v1}, Lo/atc;->c(J)Ljava/util/ArrayList;

    move-result-object v4

    .line 305
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v5, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 310
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 312
    move-object v2, v6

    .line 313
    goto :goto_1

    .line 307
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 317
    :cond_1
    :goto_1
    return-object v2
.end method

.method private static b(Lo/asu;Landroid/content/Context;)Lo/aud;
    .locals 1

    .line 247
    new-instance v0, Lo/asu$2;

    invoke-direct {v0, p0, p1}, Lo/asu$2;-><init>(Lo/asu;Landroid/content/Context;)V

    return-object v0
.end method

.method private static b(Lo/asu;Ljava/util/ArrayList;)Lo/awj$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asu;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)Lo/awj$a;"
        }
    .end annotation

    .line 126
    new-instance v0, Lo/asu$3;

    invoke-direct {v0, p0, p1}, Lo/asu$3;-><init>(Lo/asu;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method static synthetic c(Lo/asu;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 44
    invoke-direct {p0, p1}, Lo/asu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lo/asu;Ljava/util/ArrayList;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asu;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 198
    new-instance v0, Lo/asu$1;

    invoke-direct {v0, p1, p0}, Lo/asu$1;-><init>(Ljava/util/ArrayList;Lo/asu;)V

    return-object v0
.end method

.method private c(ILcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;Ljava/util/ArrayList;ILjava/lang/String;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;ILjava/lang/String;)V"
        }
    .end annotation

    .line 399
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v7

    .line 400
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getGrpID_()J

    move-result-wide v9

    .line 401
    new-instance v11, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v11, v9, v10}, Lcom/huawei/health/sns/model/group/Group;-><init>(J)V

    .line 402
    const/4 v12, 0x0

    .line 403
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 405
    const/4 v12, 0x1

    .line 409
    :cond_0
    const/4 v13, -0x1

    .line 410
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v14

    .line 411
    if-eqz v14, :cond_1

    .line 413
    invoke-virtual {v14}, Lo/axr;->c()I

    move-result v13

    .line 415
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v11, v13, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupSiteAndMode(II)V

    .line 416
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getCreateTime_()Ljava/lang/String;

    move-result-object v15

    .line 417
    move-object v0, v11

    move/from16 v1, p4

    move-wide v2, v7

    move-object/from16 v4, p5

    move v5, v12

    invoke-static {v15}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/health/sns/model/group/Group;->setGroupData(IJLjava/lang/String;ILjava/lang/String;)V

    .line 418
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/asu;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 421
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, v9, v10}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 422
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v9, v10}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v11

    .line 423
    if-eqz v11, :cond_3

    .line 426
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

    invoke-direct {v2, v11, v3, v0, v1}, Lo/asu;->d(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Ljava/util/List;Z)V

    .line 428
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/asu;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 429
    return-void
.end method

.method static synthetic c(Lo/asu;III)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lo/asu;->a(III)V

    return-void
.end method

.method static synthetic c(Lo/asu;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lo/asu;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V

    return-void
.end method

.method private static d(Lo/asu;Ljava/util/ArrayList;)Lo/aud;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asu;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)Lo/aud;"
        }
    .end annotation

    .line 171
    new-instance v0, Lo/asu$5;

    invoke-direct {v0, p0, p1}, Lo/asu$5;-><init>(Lo/asu;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method private static d(Lo/asu;Landroid/content/Context;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asu;Landroid/content/Context;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 273
    new-instance v0, Lo/asu$4;

    invoke-direct {v0, p1, p0}, Lo/asu$4;-><init>(Landroid/content/Context;Lo/asu;)V

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 497
    iget-object v0, p0, Lo/asu;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 499
    iget-object v0, p0, Lo/asu;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 500
    const/16 v0, 0xa1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 501
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 502
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 503
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 504
    iget-object v0, p0, Lo/asu;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 506
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Ljava/lang/Long;>;Z)V"
        }
    .end annotation

    .line 441
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 443
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lo/asu;->d(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Z)V

    .line 444
    return-void

    .line 447
    :cond_1
    if-nez p2, :cond_2

    .line 449
    return-void

    .line 452
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 453
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

    .line 455
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v6

    .line 456
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 458
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 460
    :cond_3
    goto :goto_0

    .line 462
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 464
    invoke-direct {p0, p1, v3, p4}, Lo/asu;->d(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Z)V

    .line 466
    :cond_5
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p3}, Lo/aqj;->b(JLjava/util/List;)V

    .line 467
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 478
    if-eqz p3, :cond_0

    .line 481
    new-instance v0, Lo/axy;

    invoke-direct {v0}, Lo/axy;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/axy;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 486
    :cond_0
    new-instance v0, Lo/asy;

    invoke-direct {v0}, Lo/asy;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/asy;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V

    .line 488
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/server/group/CreateGroupResponse;Ljava/util/ArrayList;ILjava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/group/CreateGroupResponse;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;ILjava/lang/String;)V"
        }
    .end annotation

    .line 370
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/CreateGroupResponse;->getCreateGroupRsp_()Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    move-result-object v6

    .line 371
    if-eqz v6, :cond_2

    .line 373
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->getResult_()I

    move-result v7

    .line 375
    if-eqz v7, :cond_0

    const/4 v0, 0x4

    if-ne v7, v0, :cond_1

    .line 377
    :cond_0
    move-object v0, p0

    move v1, v7

    move-object v2, v6

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/asu;->c(ILcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;Ljava/util/ArrayList;ILjava/lang/String;)V

    goto :goto_0

    .line 381
    :cond_1
    const/16 v0, 0xa2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v7}, Lo/asu;->a(III)V

    .line 382
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

    .line 385
    :cond_2
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 329
    if-nez p1, :cond_0

    .line 331
    const/16 v0, 0xa2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/asu;->a(III)V

    .line 332
    const-string v0, "CreateGroupTask"

    const-string v1, "createGroup error! response == null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    return-void

    .line 336
    :cond_0
    iget v3, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 337
    if-nez v3, :cond_2

    .line 339
    iget v4, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    .line 341
    if-nez v4, :cond_1

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/CreateGroupResponse;

    if-eqz v0, :cond_1

    .line 343
    move-object v5, p1

    check-cast v5, Lcom/huawei/health/sns/server/group/CreateGroupResponse;

    .line 344
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->getGrpTags_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 345
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->getGrpName_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v5, p3, v6, v0}, Lo/asu;->d(Lcom/huawei/health/sns/server/group/CreateGroupResponse;Ljava/util/ArrayList;ILjava/lang/String;)V

    .line 346
    goto :goto_0

    .line 349
    :cond_1
    const/16 v0, 0xa2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v4}, Lo/asu;->a(III)V

    .line 350
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

    .line 352
    :goto_0
    goto :goto_1

    .line 355
    :cond_2
    const/16 v0, 0xaaa

    const/4 v1, 0x0

    invoke-direct {p0, v0, v3, v1}, Lo/asu;->a(III)V

    .line 356
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

    .line 358
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/asu;Landroid/content/Context;)Lo/brd;
    .locals 1

    .line 44
    invoke-static {p0, p1}, Lo/asu;->d(Lo/asu;Landroid/content/Context;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1

    .line 531
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 532
    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 158
    invoke-static {p0, p1}, Lo/asu;->d(Lo/asu;Ljava/util/ArrayList;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 159
    return-void
.end method

.method static synthetic e(Lo/asu;Ljava/util/ArrayList;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/asu;->e(Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 105
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->e()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v2

    .line 107
    if-nez v2, :cond_0

    .line 109
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-static {p0, p1}, Lo/asu;->b(Lo/asu;Ljava/util/ArrayList;)Lo/awj$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    goto :goto_0

    .line 113
    :cond_0
    invoke-direct {p0, p1}, Lo/asu;->e(Ljava/util/ArrayList;)V

    .line 115
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 234
    invoke-static {p0, p1}, Lo/asu;->b(Lo/asu;Landroid/content/Context;)Lo/aud;

    move-result-object v0

    invoke-static {p2, v0}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 235
    return-void
.end method
