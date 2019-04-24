.class public Lo/cnw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cnw$b;
    }
.end annotation


# static fields
.field private static b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;Lcom/huawei/hihealth/HiAccountInfo;>;"
        }
    .end annotation
.end field

.field private static g:Landroid/content/Context;


# instance fields
.field private a:Ljava/lang/String;

.field c:Ljava/lang/String;

.field private d:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:Lo/cpr;

.field private h:Lo/cpu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 70
    new-instance v0, Landroid/util/ArrayMap;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/util/ArrayMap;-><init>(I)V

    sput-object v0, Lo/cnw;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const-string v0, ""

    iput-object v0, p0, Lo/cnw;->a:Ljava/lang/String;

    .line 75
    const-string v0, ""

    iput-object v0, p0, Lo/cnw;->c:Ljava/lang/String;

    .line 80
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/cnw;->d:Landroid/util/LruCache;

    .line 81
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    iput-object v0, p0, Lo/cnw;->e:Lo/cpr;

    .line 82
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    iput-object v0, p0, Lo/cnw;->h:Lo/cpu;

    .line 83
    return-void
.end method

.method synthetic constructor <init>(Lo/cnw$2;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/cnw;-><init>()V

    return-void
.end method

.method private a(Landroid/util/LruCache;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/LruCache<Ljava/lang/String;Ljava/lang/Integer;>;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 445
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 446
    invoke-virtual {p1, v4}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 447
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 448
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 450
    :cond_0
    invoke-direct {p0, v4}, Lo/cnw;->e(Ljava/lang/String;)I

    move-result v6

    .line 451
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentAppId() app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", packageName = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    if-gtz v6, :cond_1

    .line 453
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentAppId() app <= 0 packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    new-instance v0, Landroid/os/RemoteException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getCurrentAppId() app <= 0 packageName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",app = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 456
    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    return v6
.end method

.method private declared-synchronized a(Ljava/lang/String;Lo/crd;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 7

    monitor-enter p0

    .line 110
    :try_start_0
    invoke-virtual {p2}, Lo/crd;->d()I

    move-result v4

    .line 111
    new-instance v5, Landroid/util/ArrayMap;

    invoke-direct {v5}, Landroid/util/ArrayMap;-><init>()V

    .line 112
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Lo/cnw;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-direct {p0, p1, v4, v5}, Lo/cnw;->e(Ljava/lang/String;ILjava/util/Map;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v6

    .line 116
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization getCurrentAccountInfo currentHuid = huid, accountInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, " at valid time is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 117
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiAccountInfo;->getExpiresIn()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 116
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    monitor-exit p0

    return-object v6

    .line 120
    :cond_0
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    iget-object v1, p0, Lo/cnw;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Lo/cpr;->c(ILjava/lang/String;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v6

    .line 121
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 122
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 123
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v6}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    .line 125
    :cond_1
    invoke-direct {p0, p1, v4, v5}, Lo/cnw;->e(Ljava/lang/String;ILjava/util/Map;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v6

    .line 126
    iput-object p1, p0, Lo/cnw;->a:Ljava/lang/String;

    .line 128
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization getCurrentAccountInfo then currentHuid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnw;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const-string v0, "HiH_HiHealthBinder"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization getCurrentAccountInfo currentHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnw;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " huid = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const-string v2, " accountInfo = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v6, v1, v2

    const-string v2, " at valid time is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 130
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiAccountInfo;->getExpiresIn()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 129
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit p0

    return-object v6

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static a(Landroid/content/Context;)Lo/cnw;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 92
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cnw;->g:Landroid/content/Context;

    .line 93
    sget-object v0, Lo/cnw$b;->b:Lo/cnw;

    return-object v0
.end method

.method private a(Lcom/huawei/hihealth/HiDataInsertOption;D)V
    .locals 15

    .line 588
    invoke-virtual {p0}, Lo/cnw;->d()I

    move-result v4

    .line 589
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cpw;->b(I)I

    move-result v5

    .line 590
    const v6, 0x9c43

    .line 591
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataInsertOption;->getDatas()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 594
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-static {v7, v8}, Lo/cnk;->a(J)I

    move-result v1

    invoke-virtual {v0, v1, v6, v5}, Lo/cqd;->c(III)Lo/cob;

    move-result-object v9

    .line 595
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise statTable = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const-string v2, " statClient is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 596
    if-eqz v9, :cond_0

    .line 597
    invoke-virtual {v9}, Lo/cob;->d()D

    move-result-wide v10

    .line 598
    add-double v12, p2, v10

    .line 599
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise added sumCalories = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " totalCalories = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 600
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " fitnessCalories = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 599
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    invoke-virtual {v9, v5}, Lo/cob;->b(I)V

    .line 602
    const/16 v0, 0x4e21

    invoke-virtual {v9, v0}, Lo/cob;->d(I)V

    .line 603
    invoke-virtual {v9, v6}, Lo/cob;->a(I)V

    .line 604
    invoke-virtual {v9, v4}, Lo/cob;->e(I)V

    .line 605
    invoke-virtual {v9, v12, v13}, Lo/cob;->e(D)V

    .line 606
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise update statTable = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/cqd;->d(Lo/cob;)Z

    move-result v14

    .line 608
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise fitnessCalories flag is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    :cond_0
    return-void
.end method

.method private declared-synchronized b(JI)V
    .locals 15

    monitor-enter p0

    .line 634
    const-wide/16 v7, 0x0

    .line 635
    :try_start_0
    new-instance v9, Lo/crs;

    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/crs;-><init>(Landroid/content/Context;)V

    .line 636
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    move/from16 v1, p3

    .line 637
    invoke-static/range {p1 .. p2}, Lo/cnk;->d(J)J

    move-result-wide v2

    invoke-static/range {p1 .. p2}, Lo/cnk;->i(J)J

    move-result-wide v4

    const/4 v6, 0x2

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->e(IJJI)Ljava/util/List;

    move-result-object v10

    .line 638
    invoke-static {v10}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 639
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientStepsSync hihealthDatas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    monitor-exit p0

    return-void

    .line 642
    :cond_0
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 643
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    add-double/2addr v7, v0

    .line 644
    goto :goto_0

    .line 645
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 646
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientStepsSync client is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " value is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    invoke-virtual {v11, v7, v8}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 648
    invoke-static/range {p1 .. p2}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 649
    invoke-static/range {p1 .. p2}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 650
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 651
    const/16 v0, 0x385

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 652
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/cpw;->e(I)I

    move-result v12

    .line 653
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    invoke-virtual {p0}, Lo/cnw;->p()I

    move-result v1

    invoke-virtual {p0}, Lo/cnw;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2, v12}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v13

    .line 654
    const/4 v0, 0x0

    if-ne v0, v13, :cond_2

    .line 655
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientStepsSync hihealthContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    monitor-exit p0

    return-void

    .line 658
    :cond_2
    invoke-virtual {v13}, Lo/crd;->a()I

    move-result v14

    .line 659
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientStepsSync hihealthData is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    invoke-virtual {v11, v14}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 661
    const/4 v0, 0x0

    invoke-virtual {v9, v11, v14, v0}, Lo/crs;->b(Lcom/huawei/hihealth/HiHealthData;II)Z

    .line 662
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lo/crd;->f(I)V

    .line 663
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/cpw;->c(Lo/crd;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 664
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(I)I
    .locals 9

    monitor-enter p0

    .line 285
    :try_start_0
    invoke-virtual {p0}, Lo/cnw;->b()Ljava/lang/String;

    move-result-object v4

    .line 286
    invoke-static {v4}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "who is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    monitor-exit p0

    const/16 v0, 0x18

    return v0

    .line 291
    :cond_0
    new-instance v6, Landroid/util/ArrayMap;

    invoke-direct {v6}, Landroid/util/ArrayMap;-><init>()V

    .line 292
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    iget-object v0, p0, Lo/cnw;->a:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 295
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiAccountInfo;

    .line 296
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 297
    monitor-exit p0

    const/16 v0, 0xf

    return v0

    .line 299
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiAccountInfo;->getAppId()I

    move-result v0

    if-ne p1, v0, :cond_8

    iget-object v0, p0, Lo/cnw;->c:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiAccountInfo;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 301
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiAccountInfo;->getExpiresIn()J

    move-result-wide v7

    .line 302
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "atValidTime expire_in = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v0, v7

    if-lez v0, :cond_2

    .line 304
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accessToken is invalid, expire_in = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    monitor-exit p0

    const/16 v0, 0x17

    return v0

    .line 307
    :cond_2
    goto/16 :goto_1

    .line 310
    :cond_3
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkhuidAndAT previousWho is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnw;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " this is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lo/cnw;->a:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiAccountInfo;

    .line 314
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 315
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 316
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    :cond_4
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    iget-object v1, p0, Lo/cnw;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lo/cpr;->c(ILjava/lang/String;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v5

    .line 319
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 320
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 321
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v5}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    goto :goto_0

    .line 323
    :cond_5
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkhuidAndAT errorAccountInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    monitor-exit p0

    const/16 v0, 0xf

    return v0

    .line 327
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiAccountInfo;

    .line 329
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    .line 330
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 331
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    :cond_6
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, p1, v4}, Lo/cpr;->c(ILjava/lang/String;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v5

    .line 334
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    .line 335
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 336
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v5}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    .line 339
    :cond_7
    iput-object v4, p0, Lo/cnw;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    :cond_8
    :goto_1
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(Ljava/lang/String;Lcom/huawei/hihealthservice/auth/HiAuthorization;Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    .line 176
    :try_start_0
    invoke-virtual {p2}, Lcom/huawei/hihealthservice/auth/HiAuthorization;->getCertFingerprint()Ljava/lang/String;

    move-result-object v2

    .line 177
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/cuz;->e(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v3

    .line 178
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiAppInfo;->setCloudCode(J)V

    .line 179
    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiAppInfo;->setSignature(Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lo/cnw;->h:Lo/cpu;

    invoke-virtual {v0, v3}, Lo/cpu;->c(Lcom/huawei/hihealth/HiAppInfo;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private d(Landroid/util/LruCache;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/LruCache<Ljava/lang/String;Ljava/lang/Integer;>;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 461
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 462
    invoke-virtual {p1, v4}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 463
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 464
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 466
    :cond_0
    invoke-direct {p0, v4}, Lo/cnw;->e(Ljava/lang/String;)I

    move-result v6

    .line 467
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initInsertCurrentAppId() app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", packageName = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    if-gtz v6, :cond_1

    .line 469
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initInsertCurrentAppId() app <= 0 packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    new-instance v0, Landroid/os/RemoteException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initInsertCurrentAppId() app <= 0 packageName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",app = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 472
    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    return v6
.end method

.method private declared-synchronized e(Ljava/lang/String;)I
    .locals 6

    monitor-enter p0

    .line 477
    :try_start_0
    iget-object v0, p0, Lo/cnw;->h:Lo/cpu;

    invoke-virtual {v0, p1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v4

    .line 478
    if-gtz v4, :cond_0

    .line 479
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryOrCreateAppId() app <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cuz;->e(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v5

    .line 481
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryOrCreateAppId appInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    iget-object v0, p0, Lo/cnw;->h:Lo/cpu;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cpu;->b(Lcom/huawei/hihealth/HiAppInfo;I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    long-to-int v4, v0

    .line 484
    :cond_0
    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized e(Ljava/lang/String;ILjava/util/Map;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;)Lcom/huawei/hihealth/HiAccountInfo;"
        }
    .end annotation

    monitor-enter p0

    .line 139
    :try_start_0
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiAccountInfo;

    .line 140
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 141
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization getHiAccountInfo not in cache "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, p2, p1}, Lo/cpr;->c(ILjava/lang/String;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v4

    .line 143
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 144
    new-instance v4, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAccountInfo;-><init>()V

    .line 147
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization getHiAccountInfo accountInfo is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized i(Ljava/lang/String;)I
    .locals 10

    monitor-enter p0

    .line 492
    :try_start_0
    iget-object v0, p0, Lo/cnw;->h:Lo/cpu;

    invoke-virtual {v0, p1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v4

    .line 493
    if-gtz v4, :cond_0

    .line 494
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBinder() app <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cuz;->e(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v5

    .line 496
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBinder appInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    iget-object v0, p0, Lo/cnw;->h:Lo/cpu;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cpu;->b(Lcom/huawei/hihealth/HiAppInfo;I)J

    move-result-wide v0

    long-to-int v4, v0

    .line 499
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBinder() app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", packageName = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v4}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 502
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 503
    new-instance v6, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAccountInfo;-><init>()V

    .line 504
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAccountInfo;->setAppId(I)V

    .line 505
    invoke-virtual {v6, p1}, Lcom/huawei/hihealth/HiAccountInfo;->setHuid(Ljava/lang/String;)V

    .line 506
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 507
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v6}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    .line 509
    new-instance v7, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 510
    invoke-virtual {v7, p1}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 511
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiUserInfo;->setRelateType(I)V

    .line 512
    const-wide/16 v0, 0x1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 513
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v7, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v8

    .line 514
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBinder() who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    :cond_1
    invoke-virtual {p0}, Lo/cnw;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cnw;->a:Ljava/lang/String;

    .line 517
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBinder() currentHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnw;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 518
    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private m()Ljava/lang/String;
    .locals 5

    .line 270
    const/4 v2, 0x0

    .line 271
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 272
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getIsLogin()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getAppId()I

    move-result v0

    invoke-virtual {p0}, Lo/cnw;->p()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 273
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v2

    .line 275
    :cond_0
    goto :goto_0

    .line 276
    :cond_1
    return-object v2
.end method

.method private declared-synchronized q()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 410
    :try_start_0
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 411
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/cuz;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 412
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 413
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAppType() isAppValid true needn\'t to Auth, packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 416
    :cond_1
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 418
    :cond_2
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAppType() is thirdParty, packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method private declared-synchronized u()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 351
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cnw;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/cqf;->b(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 353
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() allowLogin is true but user is not Login yet , stop moveData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    monitor-exit p0

    return-void

    .line 356
    :cond_0
    const-string v0, "com.huawei.health"

    sget-object v1, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v1}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 357
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData other app should not move health old data !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    monitor-exit p0

    return-void

    .line 361
    :cond_1
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    const-string v1, "health_cloud.db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 362
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() startService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    new-instance v4, Landroid/content/Intent;

    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    const-class v1, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 364
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 366
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method


# virtual methods
.method a()Lo/crd;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 388
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 389
    invoke-virtual {p0}, Lo/cnw;->g()I

    move-result v0

    if-nez v0, :cond_0

    .line 390
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAppContext() isAppValid health or wear, packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    new-instance v0, Lo/crd;

    invoke-virtual {p0, v4}, Lo/cnw;->b(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1, v4}, Lo/crd;-><init>(ILjava/lang/String;)V

    return-object v0

    .line 393
    :cond_0
    new-instance v0, Lo/crd;

    invoke-virtual {p0}, Lo/cnw;->h()I

    move-result v1

    invoke-direct {v0, v1, v4}, Lo/crd;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method a(Ljava/lang/String;)V
    .locals 5

    .line 244
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 245
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 246
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiAccountInfo;

    .line 247
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 249
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    :cond_0
    goto :goto_0

    .line 253
    :cond_1
    return-void
.end method

.method b(Ljava/lang/String;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 373
    iget-object v0, p0, Lo/cnw;->d:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 374
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 375
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 378
    :cond_0
    invoke-virtual {p0, p1}, Lo/cnw;->d(Ljava/lang/String;)I

    move-result v5

    .line 379
    if-gtz v5, :cond_1

    .line 380
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAppId() app <= 0 packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    new-instance v0, Landroid/os/RemoteException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initAppId() app <= 0 packageName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",app = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 383
    :cond_1
    iget-object v0, p0, Lo/cnw;->d:Landroid/util/LruCache;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    return v5
.end method

.method declared-synchronized b()Ljava/lang/String;
    .locals 8

    monitor-enter p0

    .line 220
    :try_start_0
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    if-nez v0, :cond_0

    .line 221
    const-string v0, ""

    monitor-exit p0

    return-object v0

    .line 223
    :cond_0
    invoke-direct {p0}, Lo/cnw;->m()Ljava/lang/String;

    move-result-object v4

    .line 224
    invoke-static {v4}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 225
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringHuid() from cache who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    monitor-exit p0

    return-object v4

    .line 228
    :cond_1
    invoke-virtual {p0}, Lo/cnw;->p()I

    move-result v5

    .line 229
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v5}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 230
    new-instance v6, Landroid/util/ArrayMap;

    invoke-direct {v6}, Landroid/util/ArrayMap;-><init>()V

    .line 231
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, v5, v4}, Lo/cpr;->c(ILjava/lang/String;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v7

    .line 233
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 234
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 235
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringHuid() from DB who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    monitor-exit p0

    return-object v4

    .line 239
    :cond_2
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method b(Lcom/huawei/hihealth/HiDataInsertOption;Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataInsertOption;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 569
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 570
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cnw;->d()I

    move-result v1

    .line 571
    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    .line 570
    invoke-static {v0, v1, v2, p3}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v0

    int-to-double v4, v0

    .line 572
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v6

    .line 573
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() fitness exercise added sumCalories = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    add-double v2, v4, v6

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " totalCalories = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 574
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " fitnessCalories = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 573
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0, p3}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 576
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    add-double v1, v4, v6

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 577
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 578
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p0}, Lo/cnw;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 579
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() fitness exercise update hihealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    invoke-virtual {p1, p2}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 581
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setWriteStatType(I)V

    .line 582
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() fitness exercise update insertOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    invoke-direct {p0, p1, v6, v7}, Lo/cnw;->a(Lcom/huawei/hihealth/HiDataInsertOption;D)V

    .line 585
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 3

    .line 628
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    .line 629
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v2

    .line 630
    invoke-direct {p0, v0, v1, v2}, Lo/cnw;->b(JI)V

    .line 631
    return-void
.end method

.method b(Ljava/util/List;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)[I"
        }
    .end annotation

    .line 538
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    .line 539
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 540
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 541
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v1, v2

    .line 540
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 544
    :cond_0
    return-object v1
.end method

.method c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 369
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cnw;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method c(Ljava/lang/String;Lo/crd;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 1

    .line 106
    invoke-direct {p0, p1, p2}, Lo/cnw;->a(Ljava/lang/String;Lo/crd;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v0

    return-object v0
.end method

.method public c(J)V
    .locals 8

    .line 614
    invoke-virtual {p0}, Lo/cnw;->d()I

    move-result v4

    .line 615
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cpw;->c(I)Ljava/util/List;

    move-result-object v5

    .line 616
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateStepSumByClient clients is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 618
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateStepSumByClient clients is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    return-void

    .line 621
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 622
    invoke-direct {p0, p1, p2, v7}, Lo/cnw;->b(JI)V

    .line 623
    goto :goto_0

    .line 624
    :cond_2
    return-void
.end method

.method c(Ljava/lang/String;)V
    .locals 5

    .line 257
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 258
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 259
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiAccountInfo;

    .line 260
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 262
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    :cond_0
    goto :goto_0

    .line 266
    :cond_1
    return-void
.end method

.method public d()I
    .locals 5

    .line 212
    invoke-virtual {p0}, Lo/cnw;->b()Ljava/lang/String;

    move-result-object v4

    .line 213
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLoginUserId() huid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    .line 488
    invoke-direct {p0, p1}, Lo/cnw;->i(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method d(Ljava/lang/String;Lcom/huawei/hihealthservice/auth/HiAuthorization;Ljava/lang/String;)V
    .locals 0

    .line 172
    invoke-direct {p0, p1, p2, p3}, Lo/cnw;->c(Ljava/lang/String;Lcom/huawei/hihealthservice/auth/HiAuthorization;Ljava/lang/String;)V

    .line 173
    return-void
.end method

.method declared-synchronized d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/HiAccountInfo;Lcom/huawei/hihealthservice/auth/HiUserAuth;Lo/crd;)V
    .locals 10

    monitor-enter p0

    .line 154
    :try_start_0
    invoke-virtual {p3, p2}, Lcom/huawei/hihealth/HiAccountInfo;->setHuid(Ljava/lang/String;)V

    .line 155
    invoke-virtual {p3, p1}, Lcom/huawei/hihealth/HiAccountInfo;->setAccessToken(Ljava/lang/String;)V

    .line 156
    invoke-virtual {p4}, Lcom/huawei/hihealthservice/auth/HiUserAuth;->getOpen_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setThirdOpenId(Ljava/lang/String;)V

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 158
    invoke-virtual {p4}, Lcom/huawei/hihealthservice/auth/HiUserAuth;->getExpire_in()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v6, v0, v4

    .line 159
    invoke-virtual {p3, v6, v7}, Lcom/huawei/hihealth/HiAccountInfo;->setExpiresIn(J)V

    .line 160
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 161
    invoke-virtual {p5}, Lo/crd;->d()I

    move-result v8

    .line 162
    invoke-virtual {p3, v8}, Lcom/huawei/hihealth/HiAccountInfo;->setAppId(I)V

    .line 163
    iget-object v0, p0, Lo/cnw;->e:Lo/cpr;

    invoke-virtual {v0, p3}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    .line 164
    new-instance v9, Landroid/util/ArrayMap;

    invoke-direct {v9}, Landroid/util/ArrayMap;-><init>()V

    .line 165
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0, v9, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization updateAccountInfo accountInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method d(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hihealthservice/auth/HiUserAuth;Lo/crd;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/coa;>;Lcom/huawei/hihealthservice/auth/HiUserAuth;Lo/crd;)V"
        }
    .end annotation

    .line 185
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v2

    .line 186
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 187
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 188
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v5

    .line 189
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/coa;

    .line 190
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqk;->b(Landroid/content/Context;)Lo/cqk;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cqk;->d(Lo/coa;)Z

    .line 191
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqk;->b(Landroid/content/Context;)Lo/cqk;

    move-result-object v0

    invoke-virtual {v7}, Lo/coa;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cqk;->d(Ljava/lang/String;)I

    move-result v8

    .line 192
    new-instance v9, Lo/cnx;

    invoke-direct {v9}, Lo/cnx;-><init>()V

    .line 193
    invoke-virtual {p4}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {v9, v0}, Lo/cnx;->e(I)V

    .line 194
    invoke-virtual {v9, v2}, Lo/cnx;->a(I)V

    .line 195
    invoke-virtual {v7}, Lo/coa;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lo/cuw;->b(Ljava/lang/String;Lcom/huawei/hihealthservice/auth/HiUserAuth;)I

    move-result v10

    .line 196
    invoke-virtual {v9, v10}, Lo/cnx;->d(I)V

    .line 197
    invoke-virtual {v9, v7}, Lo/cnx;->e(Lo/coa;)V

    .line 198
    invoke-virtual {v9, v8}, Lo/cnx;->c(I)V

    .line 199
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    const/4 v0, 0x1

    if-ne v10, v0, :cond_0

    .line 201
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    :cond_0
    goto/16 :goto_0

    .line 204
    :cond_1
    invoke-virtual {p4}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {v5, v0, v2, v4}, Lo/cqr;->c(IILjava/util/List;)V

    .line 205
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cnx;

    .line 206
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpt;->e(Landroid/content/Context;)Lo/cpt;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cpt;->b(Lo/cnx;)Z

    .line 207
    goto :goto_1

    .line 208
    :cond_2
    return-void
.end method

.method e(I)I
    .locals 1

    .line 281
    invoke-direct {p0, p1}, Lo/cnw;->c(I)I

    move-result v0

    return v0
.end method

.method e()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 347
    invoke-direct {p0}, Lo/cnw;->u()V

    .line 348
    return-void
.end method

.method e(Ljava/util/List;Lo/crd;Lo/csk;Ljava/util/concurrent/ExecutorService;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/crd;Lo/csk;Ljava/util/concurrent/ExecutorService;)V"
        }
    .end annotation

    .line 522
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 523
    invoke-virtual {p0}, Lo/cnw;->p()I

    move-result v10

    .line 524
    invoke-interface {p4}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 525
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertBackground backgroudThread is closed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    return-void

    .line 528
    :cond_0
    new-instance v0, Lo/cnw$2;

    move-object v1, p0

    move-object v2, p3

    move v3, v10

    move-object v4, p1

    move-object v5, p2

    move-wide v6, v8

    invoke-direct/range {v0 .. v7}, Lo/cnw$2;-><init>(Lo/cnw;Lo/csk;ILjava/util/List;Lo/crd;J)V

    invoke-interface {p4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 535
    return-void
.end method

.method f()Lo/crd;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 397
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 398
    invoke-virtual {p0}, Lo/cnw;->g()I

    move-result v0

    if-nez v0, :cond_0

    .line 399
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLoginAppContext() isAppValid health or wear, packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    new-instance v0, Lo/crd;

    invoke-virtual {p0, v4}, Lo/cnw;->b(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1, v4}, Lo/crd;-><init>(ILjava/lang/String;)V

    return-object v0

    .line 402
    :cond_0
    new-instance v0, Lo/crd;

    invoke-virtual {p0}, Lo/cnw;->h()I

    move-result v1

    invoke-direct {v0, v1, v4}, Lo/crd;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method g()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 406
    invoke-direct {p0}, Lo/cnw;->q()I

    move-result v0

    return v0
.end method

.method h()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 423
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 424
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cnw;->b(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 426
    :cond_0
    iget-object v0, p0, Lo/cnw;->d:Landroid/util/LruCache;

    invoke-direct {p0, v0}, Lo/cnw;->a(Landroid/util/LruCache;)I

    move-result v0

    return v0
.end method

.method i()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 430
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 431
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cnw;->b(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 433
    :cond_0
    iget-object v0, p0, Lo/cnw;->d:Landroid/util/LruCache;

    invoke-direct {p0, v0}, Lo/cnw;->d(Landroid/util/LruCache;)I

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 1

    .line 437
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    return v0
.end method

.method public l()Z
    .locals 2

    .line 560
    sget-object v0, Lo/cnw;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 561
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method n()Z
    .locals 1

    .line 441
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    return v0
.end method

.method public o()V
    .locals 2

    .line 548
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 549
    sget-object v0, Lo/cnw;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 551
    :cond_0
    return-void
.end method

.method public p()I
    .locals 1

    .line 555
    const-string v0, "com.huawei.health"

    invoke-direct {p0, v0}, Lo/cnw;->e(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
