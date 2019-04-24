.class public Lo/dgy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;

.field private static d:Lo/dgy;

.field private static final e:Ljava/lang/Object;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const-string v0, "Track_HWHealthDataManager"

    sput-object v0, Lo/dgy;->b:Ljava/lang/String;

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dgy;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    .line 48
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 37
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static d()Lo/dgy;
    .locals 4

    .line 51
    sget-object v2, Lo/dgy;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 52
    :try_start_0
    sget-object v0, Lo/dgy;->d:Lo/dgy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 53
    new-instance v0, Lo/dgy;

    invoke-direct {v0}, Lo/dgy;-><init>()V

    sput-object v0, Lo/dgy;->d:Lo/dgy;

    .line 55
    :cond_0
    sget-object v0, Lo/dgy;->d:Lo/dgy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 56
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 468
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackMonthData sportType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " timeUnit = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 470
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 471
    invoke-virtual {v4, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 472
    invoke-virtual {v4, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 473
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 474
    const/4 v5, 0x0

    .line 475
    const/4 v6, 0x0

    .line 476
    sparse-switch p6, :sswitch_data_0

    goto/16 :goto_0

    .line 478
    :sswitch_0
    const/4 v5, 0x3

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 481
    const/4 v0, 0x3

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "Track_Run_Calorie_Sum"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 484
    goto :goto_0

    .line 486
    :sswitch_1
    const/4 v5, 0x3

    new-array v5, v5, [I

    fill-array-data v5, :array_1

    .line 489
    const/4 v0, 0x3

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "Track_Walk_Calorie_Sum"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "Track_Walk_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 492
    goto :goto_0

    .line 494
    :sswitch_2
    const/4 v5, 0x3

    new-array v5, v5, [I

    fill-array-data v5, :array_2

    .line 497
    const/4 v0, 0x3

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "Track_Ride_Calorie_Sum"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "Track_Ride_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 500
    goto :goto_0

    .line 506
    :sswitch_3
    const/4 v5, 0x4

    new-array v5, v5, [I

    fill-array-data v5, :array_3

    .line 511
    const/4 v0, 0x4

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    const-string v0, "Track_Count_Sum"

    const/4 v1, 0x3

    aput-object v0, v6, v1

    .line 515
    .line 520
    :goto_0
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 521
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 522
    invoke-virtual {v4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 523
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 524
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$1;

    invoke-direct {v1, p0, p7}, Lo/dgy$1;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 544
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x101 -> :sswitch_1
        0x102 -> :sswitch_0
        0x103 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 4
        0xa476
        0xa477
        0xa479
    .end array-data

    :array_1
    .array-data 4
        0xa444
        0xa445
        0xa447
    .end array-data

    :array_2
    .array-data 4
        0xa4a8
        0xa4a9
        0xa4ab
    .end array-data

    :array_3
    .array-data 4
        0xa444
        0xa476
        0xa4a8
        0xa415
    .end array-data
.end method

.method public a(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 277
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 278
    invoke-virtual {v2, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 279
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 280
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 283
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$2;

    invoke-direct {v1, p0, p5}, Lo/dgy$2;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 328
    return-void

    :array_0
    .array-data 4
        0x7533
    .end array-data
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 401
    if-nez p1, :cond_0

    .line 402
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireLastTrackSimplifyData callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    return-void

    .line 405
    :cond_0
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 406
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "trackData"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 407
    new-instance v6, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 408
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-virtual {v6, v2, v3, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 409
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 410
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 411
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setConstantsKey([Ljava/lang/String;)V

    .line 412
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 413
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$5;

    invoke-direct {v1, p0, p1}, Lo/dgy$5;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 455
    return-void

    nop

    :array_0
    .array-data 4
        0x7532
    .end array-data
.end method

.method public c(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 688
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackStatData sportType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " timeUnit = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 691
    new-instance v5, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 692
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 693
    invoke-virtual {v5, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 694
    invoke-virtual {v5, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 695
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 696
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 697
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 701
    packed-switch p6, :pswitch_data_0

    goto/16 :goto_0

    .line 703
    :pswitch_0
    const/4 v6, 0x6

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 711
    const/4 v0, 0x6

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "Track_Run_Duration_Sum"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const-string v0, "Track_Run_Calorie_Sum"

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const-string v0, "Track_Run_Step_Sum"

    const/4 v1, 0x3

    aput-object v0, v7, v1

    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x4

    aput-object v0, v7, v1

    const-string v0, "Track_Run_Abnormal_Count_Sum"

    const/4 v1, 0x5

    aput-object v0, v7, v1

    .line 719
    goto :goto_1

    .line 721
    :pswitch_1
    const/4 v6, 0x6

    new-array v6, v6, [I

    fill-array-data v6, :array_1

    .line 729
    const/4 v0, 0x6

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "Track_Walk_Duration_Sum"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const-string v0, "Track_Walk_Calorie_Sum"

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const-string v0, "Track_Walk_Step_Sum"

    const/4 v1, 0x3

    aput-object v0, v7, v1

    const-string v0, "Track_Walk_Count_Sum"

    const/4 v1, 0x4

    aput-object v0, v7, v1

    const-string v0, "Track_Walk_Abnormal_Count_Sum"

    const/4 v1, 0x5

    aput-object v0, v7, v1

    .line 737
    goto :goto_1

    .line 739
    :pswitch_2
    const/4 v6, 0x5

    new-array v6, v6, [I

    fill-array-data v6, :array_2

    .line 746
    const/4 v0, 0x5

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "Track_Ride_Duration_Sum"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const-string v0, "Track_Ride_Calorie_Sum"

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const-string v0, "Track_Ride_Count_Sum"

    const/4 v1, 0x3

    aput-object v0, v7, v1

    const-string v0, "Track_Ride_Abnormal_Count_Sum"

    const/4 v1, 0x4

    aput-object v0, v7, v1

    .line 753
    goto :goto_1

    .line 755
    :goto_0
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackStatData not supported"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 756
    return-void

    .line 759
    :goto_1
    invoke-virtual {v5, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 760
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 761
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 763
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$3;

    invoke-direct {v1, p0, p7}, Lo/dgy$3;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 770
    return-void

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :array_0
    .array-data 4
        0xa476
        0xa478    # 5.9E-41f
        0xa477
        0xa475
        0xa479
        0xa47a
    .end array-data

    :array_1
    .array-data 4
        0xa444
        0xa446
        0xa445
        0xa443
        0xa447
        0xa448
    .end array-data

    :array_2
    .array-data 4
        0xa4a8
        0xa4aa
        0xa4a9
        0xa4ab
        0xa4ac
    .end array-data
.end method

.method public c(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 557
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 558
    invoke-virtual {v2, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 561
    sparse-switch p5, :sswitch_data_0

    goto :goto_0

    .line 563
    :sswitch_0
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 564
    goto :goto_1

    .line 566
    :sswitch_1
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_1

    .line 567
    goto :goto_1

    .line 569
    :sswitch_2
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_2

    .line 570
    goto :goto_1

    .line 573
    :goto_0
    :sswitch_3
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_3

    .line 576
    :goto_1
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 577
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 578
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$9;

    invoke-direct {v1, p0, p6, v3}, Lo/dgy$9;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;[I)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 612
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x101 -> :sswitch_1
        0x102 -> :sswitch_0
        0x103 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 4
        0x7536
    .end array-data

    :array_1
    .array-data 4
        0x7535
    .end array-data

    :array_2
    .array-data 4
        0x7537
    .end array-data

    :array_3
    .array-data 4
        0x7532
    .end array-data
.end method

.method public d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 773
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackTrendCardData sportType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " timeUnit = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 777
    new-instance v5, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 780
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 782
    packed-switch p5, :pswitch_data_0

    goto :goto_0

    .line 784
    :pswitch_0
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 785
    goto :goto_1

    .line 787
    :pswitch_1
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 788
    goto :goto_1

    .line 791
    :pswitch_2
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 792
    goto :goto_1

    .line 794
    :goto_0
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 802
    :goto_1
    sparse-switch p6, :sswitch_data_0

    goto :goto_2

    .line 804
    :sswitch_0
    const/4 v7, 0x1

    new-array v7, v7, [I

    fill-array-data v7, :array_0

    .line 805
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 806
    const/4 v9, 0x3

    new-array v9, v9, [I

    fill-array-data v9, :array_1

    .line 811
    const/4 v0, 0x3

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x1

    aput-object v0, v10, v1

    const-string v0, "Track_Run_Abnormal_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v10, v1

    .line 816
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 817
    goto :goto_3

    .line 819
    :sswitch_1
    const/4 v7, 0x1

    new-array v7, v7, [I

    fill-array-data v7, :array_2

    .line 820
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "sport_step_sum"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 821
    const/4 v9, 0x1

    new-array v9, v9, [I

    fill-array-data v9, :array_3

    .line 823
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "sport_step_sum"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 824
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 825
    goto :goto_3

    .line 827
    :goto_2
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackStatData not supported"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    return-void

    .line 831
    :goto_3
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 832
    invoke-virtual {v5, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 833
    invoke-virtual {v5, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 834
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 835
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 836
    invoke-virtual {v5, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 837
    invoke-virtual {v5, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 838
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 842
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 843
    invoke-virtual {v6, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 844
    invoke-virtual {v6, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 846
    const/4 v0, 0x7

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 847
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 848
    invoke-virtual {v6, v10}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 849
    invoke-virtual {v6, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 850
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 852
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$4;

    move-object/from16 v2, p7

    invoke-direct {v1, p0, v2}, Lo/dgy$4;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 859
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x102 -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 4
        0xa476
    .end array-data

    :array_1
    .array-data 4
        0xa476
        0xa479
        0xa47a
    .end array-data

    :array_2
    .array-data 4
        0x9c42
    .end array-data

    :array_3
    .array-data 4
        0x9c42
    .end array-data
.end method

.method public e(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 615
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 616
    new-instance v5, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 617
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 618
    invoke-virtual {v5, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 619
    invoke-virtual {v5, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 620
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 621
    packed-switch p5, :pswitch_data_0

    goto :goto_0

    .line 623
    :pswitch_0
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 624
    goto :goto_1

    .line 626
    :pswitch_1
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 627
    goto :goto_1

    .line 630
    :pswitch_2
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 631
    goto :goto_1

    .line 633
    :goto_0
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 637
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 641
    packed-switch p6, :pswitch_data_1

    goto :goto_2

    .line 643
    :pswitch_3
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 644
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 645
    goto :goto_3

    .line 647
    :pswitch_4
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_1

    .line 648
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 649
    goto :goto_3

    .line 651
    :pswitch_5
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_2

    .line 652
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 653
    goto :goto_3

    .line 655
    :goto_2
    sget-object v0, Lo/dgy;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackBarData not supported"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    return-void

    .line 659
    :goto_3
    invoke-virtual {v5, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 660
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 661
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 663
    iget-object v0, p0, Lo/dgy;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgy$7;

    invoke-direct {v1, p0, p7}, Lo/dgy$7;-><init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 672
    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x101
        :pswitch_4
        :pswitch_3
        :pswitch_5
    .end packed-switch

    :array_0
    .array-data 4
        0xa476
    .end array-data

    :array_1
    .array-data 4
        0xa444
    .end array-data

    :array_2
    .array-data 4
        0xa4a8
    .end array-data
.end method
