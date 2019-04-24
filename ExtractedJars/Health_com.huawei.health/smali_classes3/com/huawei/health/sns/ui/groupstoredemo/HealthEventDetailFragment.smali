.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$d;
    }
.end annotation


# instance fields
.field private C:Ljava/lang/Runnable;

.field private D:Landroid/os/Handler;

.field private a:Landroid/widget/TextView;

.field private b:Landroid/app/Activity;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/support/v7/widget/RecyclerView;

.field private f:Lcom/huawei/health/sns/model/group/Group;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private o:Ljava/lang/String;

.field private p:I

.field private q:D

.field private r:Ljava/lang/String;

.field private s:I

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;>;"
        }
    .end annotation
.end field

.field private u:Landroid/widget/TextView;

.field private v:Lo/bie;

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private x:Landroid/os/Handler;

.field private y:Lo/egn;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->y:Lo/egn;

    .line 121
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$d;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->x:Landroid/os/Handler;

    .line 534
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->D:Landroid/os/Handler;

    .line 544
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->C:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->p:I

    return v0
.end method

.method private a()V
    .locals 21

    .line 409
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleEventMemberImage start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    new-instance v4, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 411
    const-wide v0, 0x2386f26fc10001L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 412
    const-string v0, "\u65f6\u5149\u5728\u8d70"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 413
    const-string v0, "pic_1"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 415
    new-instance v5, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 416
    const-wide v0, 0x2386f26fc10002L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 417
    const-string v0, "\u89e6\u6478\u9633\u5149"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 418
    const-string v0, "pic_2"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 420
    new-instance v6, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 421
    const-wide v0, 0x2386f26fc10003L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 422
    const-string v0, "\u9ece\u660e\u661f\u6668"

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 423
    const-string v0, "pic_3"

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 425
    new-instance v7, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 426
    const-wide v0, 0x2386f26fc10004L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 427
    const-string v0, "\u6de1\u84dd\u8272\u7684\u7ecf\u5178"

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 428
    const-string v0, "pic_4"

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 430
    new-instance v8, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 431
    const-wide v0, 0x2386f26fc10005L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 432
    const-string v0, "\u6211\u8981\u966a\u4f60\u6570\u592a\u9633"

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 433
    const-string v0, "pic_5"

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 435
    new-instance v9, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v9}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 436
    const-wide v0, 0x2386f26fc10006L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 437
    const-string v0, "\u9017\u6bd4\u6709\u7406"

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 438
    const-string v0, "pic_8"

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 440
    new-instance v10, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 441
    const-wide v0, 0x2386f26fc10007L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 442
    const-string v0, "\u7c73\u5c0f\u8bfa"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 443
    const-string v0, "pic_7"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 445
    new-instance v11, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v11}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 446
    const-wide v0, 0x2386f26fc10008L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 447
    const-string v0, "\u5c0f\u660e"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 448
    const-string v0, "pic_6"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 450
    new-instance v12, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v12}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 451
    const-wide v0, 0x2386f26fc10009L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 452
    const-string v0, "\u84dd\u8272\u6fc0\u6d6a"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 453
    const-string v0, "pic_9"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 455
    new-instance v13, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v13}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 456
    const-wide v0, 0x2386f26fc1000aL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 457
    const-string v0, "\u5c81\u6708\u5982\u521d"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 458
    const-string v0, "pic_10"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 460
    new-instance v14, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v14}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 461
    const-wide v0, 0x2386f26fc1000bL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 462
    const-string v0, "\u4e00\u53ea\u80a5\u80d6\u7684\u732b"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 463
    const-string v0, "pic_11"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 465
    new-instance v15, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v15}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 466
    const-wide v0, 0x2386f26fc1000cL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 467
    const-string v0, "\u5b87\u5b991\u53f7\u5927\u53ef\u7231"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 468
    const-string v0, "pic_12"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 470
    new-instance v16, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 471
    const-wide v0, 0x2386f26fc1000dL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 472
    const-string v0, "\u5c0f\u767d"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 473
    const-string v0, "pic_13"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 475
    new-instance v17, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 476
    const-wide v0, 0x2386f26fc1000eL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 477
    const-string v0, "\u840c\u91cf\u5341\u8db3"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 478
    const-string v0, "pic_14"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 480
    new-instance v18, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 481
    const-wide v0, 0x2386f26fc1000fL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 482
    const-string v0, "Victory"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 483
    const-string v0, "pic_15"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 485
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 486
    move-object/from16 v0, v19

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 487
    move-object/from16 v0, v19

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 488
    move-object/from16 v0, v19

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 489
    move-object/from16 v0, v19

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 490
    move-object/from16 v0, v19

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 491
    move-object/from16 v0, v19

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 492
    move-object/from16 v0, v19

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    move-object/from16 v0, v19

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 494
    move-object/from16 v0, v19

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 495
    move-object/from16 v0, v19

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 496
    move-object/from16 v0, v19

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 497
    move-object/from16 v0, v19

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 498
    move-object/from16 v0, v19

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 499
    move-object/from16 v0, v19

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 500
    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====userInfoBean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v19, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    new-instance v20, Landroid/os/Message;

    invoke-direct/range {v20 .. v20}, Landroid/os/Message;-><init>()V

    .line 504
    const/16 v0, 0x3eb

    move-object/from16 v1, v20

    iput v0, v1, Landroid/os/Message;->what:I

    .line 505
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 506
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->x:Landroid/os/Handler;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 508
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 5

    .line 557
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 558
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 560
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->t:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 561
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->v:Lo/bie;

    if-eqz v0, :cond_0

    .line 562
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->v:Lo/bie;

    invoke-virtual {v0}, Lo/bie;->notifyDataSetChanged()V

    .line 563
    :cond_0
    return-void
.end method

.method private b()V
    .locals 3

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v2

    .line 175
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 177
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$2;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V

    .line 178
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    .line 201
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->d()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;Landroid/os/Message;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)Landroid/app/Activity;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 337
    if-eqz v4, :cond_1

    .line 338
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 339
    if-eqz v5, :cond_0

    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->f:Lcom/huawei/health/sns/model/group/Group;

    .line 341
    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->o:Ljava/lang/String;

    .line 343
    :cond_0
    goto :goto_0

    .line 344
    :cond_1
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 346
    return-void

    .line 348
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->t:Ljava/util/List;

    .line 349
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->w:Ljava/util/ArrayList;

    .line 351
    new-instance v0, Lo/bie;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->t:Ljava/util/List;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->o:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lo/bie;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->v:Lo/bie;

    .line 352
    new-instance v5, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    const/4 v1, 0x6

    invoke-direct {v5, v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->v:Lo/bie;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->x:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 356
    return-void
.end method

.method private d()V
    .locals 17

    .line 207
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->c:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->d:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-virtual {v0, v8, v1, v2, v3}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 213
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->p:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 215
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    .line 216
    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 215
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_walk_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    goto/16 :goto_0

    .line 220
    :sswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    .line 221
    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 220
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_run_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    goto/16 :goto_0

    .line 225
    :sswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_bike:I

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    .line 226
    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 225
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_riding_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    goto/16 :goto_0

    .line 230
    :sswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walk:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 231
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 234
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_walk_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    goto/16 :goto_0

    .line 238
    :sswitch_4
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_run:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 239
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 242
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_run_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    goto/16 :goto_0

    .line 246
    :sswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_ride:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 247
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 250
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_riding_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    goto/16 :goto_0

    .line 254
    :sswitch_6
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swim:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 255
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 258
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_swimming_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    goto :goto_0

    .line 262
    :sswitch_7
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 263
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_5

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 266
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_fitness_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    .line 272
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->h:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    invoke-direct/range {p0 .. p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b()V

    .line 278
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 279
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 280
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 281
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 283
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_activity_social_in_progress:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getLastTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 299
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v14}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 300
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->s:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    move-object/from16 v4, p0

    iget v4, v4, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->s:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 304
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->g:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    invoke-direct/range {p0 .. p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->h()V

    .line 307
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->f:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->o:Ljava/lang/String;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getNumberOfPeople()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/boa;->b(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;I)V

    .line 308
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_7
        0xcd -> :sswitch_6
    .end sparse-switch
.end method

.method private d(Landroid/view/View;)V
    .locals 1

    .line 321
    sget v0, Lcom/huawei/android/sns/R$id;->event_member_recycler:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->e:Landroid/support/v7/widget/RecyclerView;

    .line 322
    sget v0, Lcom/huawei/android/sns/R$id;->iv_event_poster:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->d:Landroid/widget/ImageView;

    .line 323
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    .line 324
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->c:Landroid/widget/TextView;

    .line 325
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    .line 326
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->h:Landroid/widget/TextView;

    .line 327
    sget v0, Lcom/huawei/android/sns/R$id;->tv_member_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->g:Landroid/widget/TextView;

    .line 328
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_rule_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->u:Landroid/widget/TextView;

    .line 329
    sget v0, Lcom/huawei/android/sns/R$id;->event_name_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->z:Landroid/widget/ImageView;

    .line 330
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_deadline:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->i:Landroid/widget/TextView;

    .line 331
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->c()V

    .line 333
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->z:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V
    .locals 5

    .line 369
    if-eqz p1, :cond_0

    .line 370
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->m:Ljava/lang/String;

    .line 371
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_EVENT_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->m:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 374
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getGroupActivity()Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 376
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====groupActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->l:Ljava/lang/String;

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->p:I

    .line 379
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    .line 380
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getDetails()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->r:Ljava/lang/String;

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getNumberOfPeople()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->s:I

    .line 385
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 540
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->D:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->C:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 541
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)D
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->q:D

    return-wide v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->s:I

    return v0
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V
    .locals 2

    .line 359
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->e(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V

    .line 360
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->f:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->x:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 363
    :cond_0
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 618
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->w:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 619
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 620
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 622
    :cond_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->s:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4

    .line 512
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 513
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityCreated: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 568
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 312
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_event_detail:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 314
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b:Landroid/app/Activity;

    .line 315
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->d(Landroid/view/View;)V

    .line 316
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->c()V

    .line 317
    return-object v4
.end method

.method public onResume()V
    .locals 0

    .line 573
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 574
    return-void
.end method
