.class public Lo/dgu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dgu$e;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Landroid/content/Context;

.field private static final c:Ljava/lang/Object;

.field private static g:Lo/dgu;

.field private static final m:Ljava/lang/Object;


# instance fields
.field private d:Ljava/util/concurrent/ExecutorService;

.field private e:Ljava/lang/String;

.field private f:Landroid/content/BroadcastReceiver;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Landroid/content/IntentFilter;

.field private k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

.field private o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private p:Lo/cmg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    const-string v0, "Common_HWHealthDataManager"

    sput-object v0, Lo/dgu;->a:Ljava/lang/String;

    .line 75
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dgu;->c:Ljava/lang/Object;

    .line 162
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dgu;->m:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dgu;->d:Ljava/util/concurrent/ExecutorService;

    .line 91
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>()V

    iput-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 94
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lo/dgu;->i:Landroid/content/IntentFilter;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dgu;->h:Ljava/util/List;

    .line 112
    new-instance v0, Lo/dgu$5;

    invoke-direct {v0, p0}, Lo/dgu$5;-><init>(Lo/dgu;)V

    iput-object v0, p0, Lo/dgu;->f:Landroid/content/BroadcastReceiver;

    .line 131
    new-instance v0, Lo/dgu$9;

    invoke-direct {v0, p0}, Lo/dgu$9;-><init>(Lo/dgu;)V

    iput-object v0, p0, Lo/dgu;->p:Lo/cmg;

    .line 153
    new-instance v0, Lo/dgu$16;

    invoke-direct {v0, p0}, Lo/dgu$16;-><init>(Lo/dgu;)V

    iput-object v0, p0, Lo/dgu;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 99
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/dgu;->b:Landroid/content/Context;

    .line 100
    invoke-direct {p0}, Lo/dgu;->F()V

    .line 102
    sget-object v0, Lo/dgu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lo/dgu;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/dnm;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 103
    iget-object v0, p0, Lo/dgu;->i:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.health.heart_zone_conf_migrate_finish"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 104
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/dgu;->f:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lo/dgu;->i:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 106
    iget-object v0, p0, Lo/dgu;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 107
    iget-object v0, p0, Lo/dgu;->h:Ljava/util/List;

    const/16 v1, 0x66

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    sget-object v0, Lo/dgu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/dgu;->h:Ljava/util/List;

    iget-object v2, p0, Lo/dgu;->p:Lo/cmg;

    invoke-interface {v0, v1, v2}, Lo/clt;->a(Ljava/util/List;Lo/cmg;)V

    .line 110
    return-void
.end method

.method private A()[I
    .locals 1

    .line 1463
    const/16 v0, 0x17

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0x7d4
        0x7d1
        0x7ef
        0x7f0
        0x7e6
        0x7e7
        0x7e8
        0x7e9
        0x7f1
        0x7ea
        0x7eb
        0x7ec
        0x7ed
        0x7ee
        0x803
        0x804
        0x805
        0x806
        0x807
        0x808
        0x809
        0x80a
        0x80b
    .end array-data
.end method

.method static synthetic B()Ljava/lang/String;
    .locals 1

    .line 71
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    return-object v0
.end method

.method private C()V
    .locals 2

    .line 1600
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    iget-object v1, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getRestHeartRateDefault()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRate(I)V

    .line 1601
    return-void
.end method

.method private D()V
    .locals 2

    .line 1107
    iget-object v0, p0, Lo/dgu;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dgu$8;

    invoke-direct {v1, p0}, Lo/dgu$8;-><init>(Lo/dgu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1243
    return-void
.end method

.method private E()V
    .locals 3

    .line 1788
    new-instance v2, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_HeartRate_Flag"

    const-string v1, "0"

    invoke-direct {v2, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1789
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v2, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1790
    return-void
.end method

.method private F()V
    .locals 7

    .line 2037
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 2039
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 2040
    const-wide v0, 0x9a7ec800L

    sub-long v0, v2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 2041
    invoke-virtual {v4, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 2042
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 2043
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 2045
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 2046
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "restHeartRate"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 2048
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 2049
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 2051
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$20;

    invoke-direct {v1, p0}, Lo/dgu$20;-><init>(Lo/dgu;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 2076
    return-void

    nop

    :array_0
    .array-data 4
        0xb3c2
    .end array-data
.end method

.method private G()V
    .locals 2

    .line 1815
    iget-object v0, p0, Lo/dgu;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dgu$19;

    invoke-direct {v1, p0}, Lo/dgu$19;-><init>(Lo/dgu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1868
    return-void
.end method

.method static synthetic a(Lo/dgu;)Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/dgu;->e:Ljava/lang/String;

    return-object v0
.end method

.method private a(Landroid/content/Context;[J[DILjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 570
    new-instance v3, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 571
    const/4 v4, 0x0

    .line 572
    packed-switch p4, :pswitch_data_0

    goto/16 :goto_0

    .line 574
    :pswitch_0
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2716

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 575
    invoke-virtual {v4, p5}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 576
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 577
    const/4 v0, 0x1

    aget-wide v0, p2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 578
    const-string v0, "weight"

    const/4 v1, 0x0

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 579
    const-string v0, "weight_bodyfat"

    const/4 v1, 0x1

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 580
    goto/16 :goto_0

    .line 582
    :pswitch_1
    goto :goto_0

    .line 584
    :pswitch_2
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2712

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 585
    invoke-virtual {v4, p5}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 586
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 587
    const/4 v0, 0x1

    aget-wide v0, p2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 588
    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x0

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 589
    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x1

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 590
    const-string v0, "heart_rate"

    const/4 v1, 0x2

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 591
    goto :goto_0

    .line 593
    :pswitch_3
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2711

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 594
    invoke-virtual {v4, p5}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 595
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 596
    const/4 v0, 0x1

    aget-wide v0, p2, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 597
    const/4 v0, 0x0

    aget-wide v0, p3, v0

    double-to-int v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 598
    const/4 v0, 0x1

    aget-wide v0, p3, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 599
    .line 605
    :goto_0
    :pswitch_4
    if-nez v4, :cond_0

    .line 606
    return-void

    .line 608
    :cond_0
    invoke-virtual {v3, v4}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 609
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$21;

    invoke-direct {v1, p0, p6}, Lo/dgu$21;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v3, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 620
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic b(Lo/dgu;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/dgu;->G()V

    return-void
.end method

.method public static c()Lo/dgu;
    .locals 4

    .line 165
    sget-object v2, Lo/dgu;->m:Ljava/lang/Object;

    monitor-enter v2

    .line 166
    :try_start_0
    sget-object v0, Lo/dgu;->g:Lo/dgu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 167
    new-instance v0, Lo/dgu;

    invoke-direct {v0}, Lo/dgu;-><init>()V

    sput-object v0, Lo/dgu;->g:Lo/dgu;

    .line 169
    :cond_0
    sget-object v0, Lo/dgu;->g:Lo/dgu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 170
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic c(Lo/dgu;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/dgu;->D()V

    return-void
.end method

.method static synthetic c(Lo/dgu;Landroid/content/Context;[J[DILjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 71
    invoke-direct/range {p0 .. p6}, Lo/dgu;->a(Landroid/content/Context;[J[DILjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic d(Lo/dgu;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/dgu;->F()V

    return-void
.end method

.method static synthetic e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    return-object v0
.end method

.method static synthetic e(Lo/dgu;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 71
    iput-object p1, p0, Lo/dgu;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic j()Landroid/content/Context;
    .locals 1

    .line 71
    sget-object v0, Lo/dgu;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1257
    iget-object v0, p0, Lo/dgu;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dgu$7;

    invoke-direct {v1, p0}, Lo/dgu$7;-><init>(Lo/dgu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1265
    return-void
.end method

.method public a(I)V
    .locals 1

    .line 1340
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V

    .line 1341
    return-void
.end method

.method public a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 275
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getFitnessDataDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgt;->d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 277
    return-void
.end method

.method public a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1898
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackBarData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1899
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lo/dgy;->e(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1900
    return-void
.end method

.method public a(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 1892
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackSimplifyData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1893
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgy;->c(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1894
    return-void
.end method

.method public a(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 656
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getLastHeartRateDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgw;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 659
    return-void
.end method

.method public a(Landroid/content/Context;IJJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 1549
    new-instance v2, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 1550
    invoke-virtual {v2, p3, p4, p5, p6}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimeInterval(JJ)V

    .line 1551
    const/4 v0, 0x1

    new-array v3, v0, [I

    const/4 v0, 0x0

    aput p2, v3, v0

    .line 1552
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 1553
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$15;

    invoke-direct {v1, p0, p7}, Lo/dgu$15;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 1563
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 1072
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$2;

    invoke-direct {v1, p0, p2}, Lo/dgu$2;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 1100
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 216
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getTodayFitnessTotalData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgt;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 218
    return-void
.end method

.method public b()V
    .locals 2

    .line 1246
    iget-object v0, p0, Lo/dgu;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dgu$6;

    invoke-direct {v1, p0}, Lo/dgu$6;-><init>(Lo/dgu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1254
    return-void
.end method

.method public b(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 670
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getHeartRateSummary()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 671
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgw;->c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 672
    return-void
.end method

.method public b(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1887
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackMonthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1888
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lo/dgy;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1889
    return-void
.end method

.method public b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 638
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getVo2maxDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgw;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 640
    return-void
.end method

.method public b(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 821
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 822
    invoke-virtual {v2, p2, p3}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 823
    invoke-virtual {v2, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 825
    const/16 v3, 0x8

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 833
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 834
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 835
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 836
    if-eqz p6, :cond_0

    .line 837
    invoke-virtual {v2, p6}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 839
    :cond_0
    sget-object v0, Lo/dgu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$3;

    invoke-direct {v1, p0, p7}, Lo/dgu$3;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 919
    return-void

    nop

    :array_0
    .array-data 4
        0x7d8
        0x7d9
        0x7da
        0x7db
        0x7dc
        0x7dd
        0x7de
        0x7df
    .end array-data
.end method

.method public b(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 1049
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTimeHeartRateData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1050
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgw;->c(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1051
    return-void
.end method

.method public b(Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 545
    sget-object v7, Lo/dgu;->c:Ljava/lang/Object;

    monitor-enter v7

    .line 546
    const/4 v8, 0x3

    .line 547
    :try_start_0
    iget-object v0, p0, Lo/dgu;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dgu;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    :cond_0
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertBloodsugarData deviceUUID == null || deviceUUID.isEmpty()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$22;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lo/dgu$22;-><init>(Lo/dgu;Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/cmc;)V

    goto :goto_0

    .line 563
    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    iget-object v5, p0, Lo/dgu;->e:Ljava/lang/String;

    move-object v6, p4

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v6}, Lo/dgu;->a(Landroid/content/Context;[J[DILjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 565
    :goto_0
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 566
    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 643
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getLastVo2max()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgw;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 645
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;J)V
    .locals 5

    .line 1572
    new-instance v4, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiTimeInterval;-><init>()V

    .line 1573
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiTimeInterval;->setStartTime(J)V

    .line 1574
    const-wide/32 v0, 0x5265c00

    add-long/2addr v0, p2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setEndTime(J)V

    .line 1575
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDaySportDataOrigin getHealthAPI in. DataOriginStartDay = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1576
    sget-object v0, Lo/dgu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$18;

    invoke-direct {v1, p0, p1}, Lo/dgu$18;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const/4 v2, 0x2

    invoke-interface {v0, v2, v4, v1}, Lo/clt;->d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cmc;)V

    .line 1583
    return-void
.end method

.method public c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 320
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getCoreSleepDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    invoke-static {}, Lo/dgz;->c()Lo/dgz;

    move-result-object v0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgz;->b(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 322
    return-void
.end method

.method public c(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1908
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackStepsBarData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1909
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lo/dgy;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1910
    return-void
.end method

.method public c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 462
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getTrackDetailData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgy;->a(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 464
    return-void
.end method

.method public c(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 930
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 931
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-virtual {v4, v2, v3, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 933
    const/16 v5, 0x8

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 941
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 942
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 943
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 944
    if-eqz p6, :cond_0

    .line 945
    invoke-virtual {v4, p6}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 947
    :cond_0
    sget-object v0, Lo/dgu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$4;

    invoke-direct {v1, p0, p7}, Lo/dgu$4;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1027
    return-void

    :array_0
    .array-data 4
        0x7d8
        0x7d9
        0x7da
        0x7db
        0x7dc
        0x7dd
        0x7de
        0x7df
    .end array-data
.end method

.method public c(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1415
    invoke-direct {p0}, Lo/dgu;->A()[I

    move-result-object v4

    .line 1416
    new-instance v5, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 1417
    invoke-virtual {v5, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimeInterval(JJ)V

    .line 1418
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 1419
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightDatas 222 begain query"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1420
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$14;

    invoke-direct {v1, p0, p6}, Lo/dgu$14;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 1434
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 1521
    new-instance v2, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 1522
    invoke-virtual {v2, p2}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimes(Ljava/util/List;)V

    .line 1523
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1524
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 1526
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$13;

    invoke-direct {v1, p0, p3}, Lo/dgu$13;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 1538
    return-void

    :array_0
    .array-data 4
        0x7d6
        0x7d7
        0x7e2
    .end array-data
.end method

.method public c(Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 511
    sget-object v7, Lo/dgu;->c:Ljava/lang/Object;

    monitor-enter v7

    .line 512
    const/4 v8, 0x2

    .line 513
    :try_start_0
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertBloodpressureData datatype == 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    iget-object v0, p0, Lo/dgu;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dgu;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 515
    :cond_0
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$23;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lo/dgu$23;-><init>(Lo/dgu;Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/cmc;)V

    goto :goto_0

    .line 530
    :cond_1
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceUUID =! null && !deviceUUID.isEmpty()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    iget-object v5, p0, Lo/dgu;->e:Ljava/lang/String;

    move-object v6, p4

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v6}, Lo/dgu;->a(Landroid/content/Context;[J[DILjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 533
    :goto_0
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 534
    :goto_1
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 240
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getTodayDetailSegentData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgt;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 242
    return-void
.end method

.method public c(ZIIIIIII)V
    .locals 5

    .line 1661
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setHeartRateZoneSettingInfo !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1662
    new-instance v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>()V

    .line 1663
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 1665
    invoke-virtual {v4, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningEnble(Z)V

    .line 1666
    invoke-virtual {v4, p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningLimitHR(I)V

    .line 1667
    invoke-virtual {v4, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningEnbleHRR(Z)V

    .line 1668
    invoke-virtual {v4, p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningLimitHRHRR(I)V

    .line 1669
    invoke-virtual {v4, p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setMaxThreshold(I)V

    .line 1670
    invoke-virtual {v4, p4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAnaerobicThreshold(I)V

    .line 1671
    invoke-virtual {v4, p5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAerobicThreshold(I)V

    .line 1672
    invoke-virtual {v4, p6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setFatBurnThreshold(I)V

    .line 1673
    invoke-virtual {v4, p7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarmUpThreshold(I)V

    .line 1674
    invoke-virtual {v4, p8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setFitnessThreshold(I)V

    .line 1675
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setHeartRateZoneSettingInfo mHeartZoneConfingInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1676
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1679
    :cond_0
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave setHeartRateZoneSettingInfo !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1680
    return-void
.end method

.method public d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;
    .locals 1

    .line 1586
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    return-object v0
.end method

.method public d(I)V
    .locals 1

    .line 1344
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRate(I)V

    .line 1345
    return-void
.end method

.method public d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 306
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getSleepDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    invoke-static {}, Lo/dgz;->c()Lo/dgz;

    move-result-object v0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgz;->c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 308
    return-void
.end method

.method public d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1903
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackStatData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1904
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lo/dgy;->c(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1905
    return-void
.end method

.method public d(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 206
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getTrackDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgt;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 208
    return-void
.end method

.method public d(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1499
    const/4 v4, 0x3

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 1500
    new-instance v5, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 1501
    invoke-virtual {v5, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimeInterval(JJ)V

    .line 1502
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 1503
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleOption.setTypes Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1504
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$11;

    invoke-direct {v1, p0, p6}, Lo/dgu$11;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 1518
    return-void

    nop

    :array_0
    .array-data 4
        0x7d6
        0x7d7
        0x7e2
    .end array-data
.end method

.method public d(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 1438
    new-instance v4, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 1439
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimes(Ljava/util/List;)V

    .line 1440
    invoke-direct {p0}, Lo/dgu;->A()[I

    move-result-object v5

    .line 1441
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 1442
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightDatas 111 begain query"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1443
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$12;

    invoke-direct {v1, p0, p3}, Lo/dgu$12;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 1455
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 260
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getTodayCoreSleepTotalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgt;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 262
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V
    .locals 4

    .line 1335
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHRRHeartRateThrosholdConf enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1336
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRHeartZoneConf(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1337
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 681
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager setFitnessGoal()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dgt;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 683
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hihealth/data/model/HiStressMetaData;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 2005
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager setStressData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2006
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/dgx;->c(Ljava/lang/String;Lcom/huawei/hihealth/data/model/HiStressMetaData;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2007
    return-void
.end method

.method public d(ZIIIIIII)V
    .locals 5

    .line 1747
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setHeartRateZoneSettingInfo !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1748
    new-instance v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>()V

    .line 1749
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 1751
    invoke-virtual {v4, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningEnbleHRR(Z)V

    .line 1752
    invoke-virtual {v4, p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningLimitHRHRR(I)V

    .line 1753
    invoke-virtual {v4, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningEnble(Z)V

    .line 1754
    invoke-virtual {v4, p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningLimitHR(I)V

    .line 1755
    invoke-virtual {v4, p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRMaxThreshold(I)V

    .line 1756
    invoke-virtual {v4, p4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAnaerobicAdvanceThreshold(I)V

    .line 1757
    invoke-virtual {v4, p5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAnaerobicBaseThreshold(I)V

    .line 1758
    invoke-virtual {v4, p6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setLacticAcidThreshold(I)V

    .line 1759
    invoke-virtual {v4, p7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAerobicAdvanceThreshold(I)V

    .line 1760
    invoke-virtual {v4, p8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAerobicBaseThreshold(I)V

    .line 1761
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setHeartRateZoneSettingInfo mHeartZoneConfingInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1762
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dgu;->d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1765
    :cond_0
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave setHeartRateZoneSettingInfo !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1766
    return-void
.end method

.method public e()V
    .locals 2

    .line 1268
    iget-object v0, p0, Lo/dgu;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dgu$10;

    invoke-direct {v1, p0}, Lo/dgu$10;-><init>(Lo/dgu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1327
    return-void
.end method

.method public e(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 291
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getFitnessDataDetailByData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgt;->e(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 293
    return-void
.end method

.method public e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 632
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getHeartRateDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgw;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 635
    return-void
.end method

.method public e(Landroid/content/Context;JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 706
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 707
    invoke-virtual {v2, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 708
    invoke-virtual {v2, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 709
    const/4 v3, 0x0

    .line 710
    const/4 v4, 0x0

    .line 712
    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 714
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 718
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 719
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 720
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 721
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 722
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 723
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 724
    if-eqz p6, :cond_0

    .line 725
    invoke-virtual {v2, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 728
    :cond_0
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$1;

    invoke-direct {v1, p0, p8}, Lo/dgu$1;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 746
    return-void

    :array_0
    .array-data 4
        0x7d6
        0x7d7
    .end array-data
.end method

.method public e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 418
    cmp-long v0, p2, p4

    if-lez v0, :cond_0

    .line 419
    return-void

    .line 421
    :cond_0
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 422
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 423
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 424
    invoke-static {p2, p3}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-static {p4, p5}, Lo/cnk;->i(J)J

    move-result-wide v2

    invoke-virtual {v6, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 425
    invoke-virtual {v6, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 426
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 427
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 428
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 429
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 430
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 431
    if-eqz p6, :cond_2

    .line 433
    const v0, 0x1869f

    if-ne p6, v0, :cond_1

    .line 434
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 435
    const-string v0, ""

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 437
    :cond_1
    invoke-virtual {v6, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 440
    :cond_2
    :goto_0
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgu$17;

    invoke-direct {v1, p0, p7}, Lo/dgu$17;-><init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 452
    return-void

    nop

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method public e(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 1061
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRestHeartRateData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1062
    invoke-static {}, Lo/dgw;->e()Lo/dgw;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgw;->d(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1063
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 227
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getTodayDetailPointData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgt;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 229
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V
    .locals 4

    .line 1330
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHeartRateThrosholdConf enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1331
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHeartZoneConf(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1332
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 692
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getFitnessGoal()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    invoke-static {}, Lo/dgt;->c()Lo/dgt;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dgt;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 694
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 2010
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager setStressData list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2011
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/dgx;->d(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2012
    return-void
.end method

.method public f()I
    .locals 1

    .line 1621
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    return v0
.end method

.method public f(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1954
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getPressureMeasureStatistic()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1955
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgx;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1956
    return-void
.end method

.method public f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 2031
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getUserPressureAdjustInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2032
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2033
    return-void
.end method

.method public g()I
    .locals 1

    .line 1628
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFitnessThreshold()I

    move-result v0

    return v0
.end method

.method public g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 1881
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireLastTrackData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1882
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgy;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1884
    return-void
.end method

.method public h()I
    .locals 1

    .line 1614
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHR()I

    move-result v0

    return v0
.end method

.method public h(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1941
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWHealthDataManager getStressDatasForDiagram()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1942
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dgx;->d(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1943
    return-void
.end method

.method public i()V
    .locals 3

    .line 1590
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1592
    invoke-direct {p0}, Lo/dgu;->C()V

    .line 1594
    :cond_0
    invoke-virtual {p0}, Lo/dgu;->w()Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    .line 1595
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->resetHeartZoneConf(I)V

    .line 1596
    invoke-direct {p0}, Lo/dgu;->E()V

    .line 1597
    return-void
.end method

.method public k()Z
    .locals 1

    .line 1607
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->isWarningEnble()Z

    move-result v0

    return v0
.end method

.method public l()I
    .locals 1

    .line 1649
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicThreshold()I

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    .line 1686
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->isWarningEnbleHRR()Z

    move-result v0

    return v0
.end method

.method public n()I
    .locals 1

    .line 1642
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFatBurnThreshold()I

    move-result v0

    return v0
.end method

.method public o()I
    .locals 1

    .line 1656
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicThreshold()I

    move-result v0

    return v0
.end method

.method public p()I
    .locals 1

    .line 1635
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarmUpThreshold()I

    move-result v0

    return v0
.end method

.method public q()I
    .locals 1

    .line 1714
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v0

    return v0
.end method

.method public r()I
    .locals 1

    .line 1707
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicBaseThreshold()I

    move-result v0

    return v0
.end method

.method public s()I
    .locals 1

    .line 1693
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHRHRR()I

    move-result v0

    return v0
.end method

.method public t()I
    .locals 1

    .line 1700
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRMaxThreshold()I

    move-result v0

    return v0
.end method

.method public u()I
    .locals 1

    .line 1721
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v0

    return v0
.end method

.method public v()I
    .locals 1

    .line 1742
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getRestHeartRate()I

    move-result v0

    return v0
.end method

.method public w()Lcom/huawei/up/model/UserInfomation;
    .locals 6

    .line 1769
    const/4 v4, 0x0

    .line 1771
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v5

    .line 1772
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1773
    invoke-virtual {v5}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 1774
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalUserinfo return  userInfomation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1776
    :cond_0
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwUserProfileMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1779
    :goto_0
    if-nez v4, :cond_1

    .line 1780
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 1783
    :cond_1
    return-object v4
.end method

.method public x()I
    .locals 11

    .line 1794
    invoke-virtual {p0}, Lo/dgu;->w()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 1795
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 1796
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v6

    .line 1797
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 1798
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 1799
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 1800
    array-length v0, v8

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 1801
    const/4 v0, 0x1

    aget-object v0, v8, v0

    const-string v1, "\\|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 1803
    const/4 v0, 0x5

    :try_start_0
    aget-object v0, v9, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 1806
    goto :goto_0

    .line 1804
    :catch_0
    move-exception v10

    .line 1805
    const-string v0, "getHeartRateMaxValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1809
    :cond_0
    :goto_0
    sget-object v0, Lo/dgu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateMaxValue iMax = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1810
    return v6
.end method

.method public y()I
    .locals 1

    .line 1728
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v0

    return v0
.end method

.method public z()I
    .locals 1

    .line 1735
    iget-object v0, p0, Lo/dgu;->k:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v0

    return v0
.end method
