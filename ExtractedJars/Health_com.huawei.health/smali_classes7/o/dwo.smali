.class public Lo/dwo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static volatile c:Lo/dwr;

.field private static volatile d:Lo/dwo;

.field private static volatile e:Lo/dwu;

.field private static k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const-string v0, "PLGACHIEVE_AchieveKakaDataManager"

    sput-object v0, Lo/dwo;->a:Ljava/lang/String;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dwo;->k:Ljava/util/ArrayList;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    .line 75
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 528
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "enter dealSingleTrackTask"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 530
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealSingleTrackTask map is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    return-void

    .line 533
    :cond_0
    const-string v0, "trackTime"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, "trackDistance"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 535
    const-string v0, "trackTime"

    :try_start_0
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 536
    const-string v0, "trackDistance"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 537
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 538
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    .line 539
    float-to-long v0, v6

    invoke-static {v0, v1}, Lo/dzr;->e(J)D

    move-result-wide v7

    .line 540
    invoke-static {v4, v5}, Lo/dzo;->a(J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 541
    const v0, 0x1a17ce

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwo;->d(Ljava/lang/String;)V

    .line 542
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealSingleTrackTask track is valid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    cmpl-double v0, v7, v0

    if-ltz v0, :cond_1

    .line 544
    invoke-direct {p0, p1}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 545
    sget-object v0, Lo/dwo;->e:Lo/dwu;

    const/16 v1, 0x578

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dwu;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 546
    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v7, v0

    if-ltz v0, :cond_2

    .line 547
    invoke-direct {p0, p1}, Lo/dwo;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    :cond_2
    :goto_0
    goto :goto_1

    .line 550
    :catch_0
    move-exception v2

    .line 551
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealSingleTrackTask NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    :cond_3
    :goto_1
    return-void
.end method

.method private b(Lo/dwm;IJ)I
    .locals 4

    .line 1103
    invoke-static {p2, p1}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, p4, v0}, Lo/dzr;->a(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 1105
    invoke-static {p2, p1, v3}, Lo/dzr;->e(ILo/dwm;Ljava/lang/String;)Lo/dwm;

    .line 1106
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "str="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2, p1}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1107
    const/4 v0, 0x1

    return v0

    .line 1109
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 150
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealNoParamTask key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 152
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    .line 153
    new-instance v0, Lo/dwo$3;

    invoke-direct {v0, p0, p1}, Lo/dwo$3;-><init>(Lo/dwo;Ljava/lang/String;)V

    invoke-interface {v3, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 218
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 220
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 495
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "enter dealFitnessTask"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    new-instance v3, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 497
    const/4 v4, 0x0

    .line 498
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, "fitness_duration"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 499
    const-string v0, "fitness_duration"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 501
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v4, v0

    .line 502
    div-int/lit16 v0, v4, 0x3e8

    div-int/lit8 v0, v0, 0x3c
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    .line 505
    goto :goto_0

    .line 503
    :catch_0
    move-exception v6

    .line 504
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    :cond_0
    :goto_0
    const/4 v5, 0x0

    .line 508
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v6

    .line 509
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 510
    invoke-interface {v6, v3, v3}, Lo/dti;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v5

    .line 512
    :cond_1
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "duration="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "singleDuration="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    const v0, 0x187d9c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwo;->d(Ljava/lang/String;)V

    .line 514
    const/16 v0, 0xa

    if-ge v4, v0, :cond_2

    const/16 v0, 0xa

    if-lt v5, v0, :cond_3

    .line 515
    :cond_2
    invoke-direct {p0, p1}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 516
    sget-object v0, Lo/dwo;->e:Lo/dwu;

    const/16 v1, 0x514

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dwu;->d(Ljava/lang/String;)V

    .line 518
    :cond_3
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/dwo;
    .locals 4

    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    sput-object v0, Lo/dwo;->c:Lo/dwr;

    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwu;->e(Landroid/content/Context;)Lo/dwu;

    move-result-object v0

    sput-object v0, Lo/dwo;->e:Lo/dwu;

    .line 63
    sget-object v0, Lo/dwo;->d:Lo/dwo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 64
    const-class v2, Lo/dwr;

    monitor-enter v2

    .line 65
    :try_start_0
    sget-object v0, Lo/dwo;->d:Lo/dwo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 66
    new-instance v0, Lo/dwo;

    invoke-direct {v0, p0}, Lo/dwo;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dwo;->d:Lo/dwo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 70
    :cond_1
    :goto_0
    sget-object v0, Lo/dwo;->d:Lo/dwo;

    return-object v0
.end method

.method private c(JJLo/dwm;Ljava/util/Map;I)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .line 1029
    invoke-static {p7, p5}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p7

    invoke-static/range {v0 .. v5}, Lo/dzr;->d(Ljava/lang/String;JJI)Landroid/util/Pair;

    move-result-object v6

    .line 1030
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 1031
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "structBreakInfoByType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "first="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1032
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p6, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 564
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "enter dealStepsChangeTask"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 566
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealStepsChangeTask map is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    return-void

    .line 569
    :cond_0
    const-string v0, "step"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 571
    const-string v0, "step"

    :try_start_0
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 572
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 574
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0, v3}, Lo/dwr;->d(I)V

    .line 576
    const/16 v0, 0xbb8

    if-lt v3, v0, :cond_1

    .line 577
    invoke-direct {p0, p1}, Lo/dwo;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 581
    :cond_1
    goto :goto_0

    .line 579
    :catch_0
    move-exception v2

    .line 580
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealSingleTrackTask NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/dwo;Lo/dwm;IJ)I
    .locals 1

    .line 49
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dwo;->b(Lo/dwm;IJ)I

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/dwo;)Landroid/content/Context;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 49
    sput-object p0, Lo/dwo;->k:Ljava/util/ArrayList;

    return-object p0
.end method

.method private e(Ljava/lang/String;ILjava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 356
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 357
    const-string v0, "taskId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    const-string v0, "status"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 360
    const-string v0, "productId"

    invoke-interface {v2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    :cond_0
    return-object v2
.end method

.method private e(Ljava/lang/String;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 430
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "enter dealBinderDeviceTask"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 432
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealBinderDeviceTask map is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    return-void

    .line 435
    :cond_0
    const-string v0, "productId"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 436
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealBinderDeviceTask productId is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    return-void

    .line 439
    :cond_1
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v3

    .line 440
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 441
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "pluginAchieveAdapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    return-void

    .line 445
    :cond_2
    const-string v0, "deviceId"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 446
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deviceId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    invoke-interface {v3, v4, v0}, Lo/dti;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 449
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "bindDeviceProductId"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 451
    invoke-virtual {p0, v6, v4, v3}, Lo/dwo;->c(Ljava/lang/String;Ljava/lang/String;Lo/dti;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 452
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealBinderDeviceTask device Already bound"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    return-void

    .line 456
    :cond_3
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 457
    move-object v7, v5

    goto :goto_0

    .line 459
    :cond_4
    const-string v0, ","

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 461
    :goto_0
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "bindDeviceProductId"

    invoke-static {v0, v1, v7}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, v4}, Lo/dwo;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 464
    invoke-virtual {p0, p1}, Lo/dwo;->d(Ljava/lang/String;)V

    .line 466
    return-void
.end method

.method private e(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 1042
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "enter dealDeleteTrackData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1044
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealDeleteTrackData map is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1045
    return-void

    .line 1047
    :cond_0
    const-string v0, "startTime"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, "type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1049
    const-string v0, "startTime"

    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1050
    const-string v0, "type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1051
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 1052
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 1053
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealDeleteTrackData type="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "trackTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1054
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    .line 1055
    new-instance v0, Lo/dwo$5;

    invoke-direct {v0, p0, v7, v5, v6}, Lo/dwo$5;-><init>(Lo/dwo;IJ)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1088
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1091
    goto :goto_0

    .line 1089
    :catch_0
    move-exception v3

    .line 1090
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealSingleTrackTask NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1093
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic g()Lo/dwu;
    .locals 1

    .line 49
    sget-object v0, Lo/dwo;->e:Lo/dwu;

    return-object v0
.end method

.method static synthetic h()Lo/dwr;
    .locals 1

    .line 49
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    return-object v0
.end method

.method static synthetic i()Ljava/lang/String;
    .locals 1

    .line 49
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k()Ljava/util/ArrayList;
    .locals 1

    .line 49
    sget-object v0, Lo/dwo;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private o()V
    .locals 3

    .line 418
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "taskReachInfo"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    return-void
.end method

.method private p()Z
    .locals 7

    .line 890
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "kakaLoginTask"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 891
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 892
    const/4 v0, 0x1

    return v0

    .line 894
    :cond_0
    const-wide/16 v4, -0x1

    .line 896
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 899
    goto :goto_0

    .line 897
    :catch_0
    move-exception v6

    .line 898
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "judgeRequireLoginTask"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 900
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-nez v0, :cond_1

    .line 901
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "all loginTask is finish"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 902
    const/4 v0, 0x0

    return v0

    .line 903
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-lez v0, :cond_3

    .line 904
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 906
    :cond_3
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "judgeRequireLoginTask today is dealed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()J
    .locals 7

    .line 474
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "kakaSyncDate"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 475
    const-wide/16 v4, 0x0

    .line 476
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 477
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncDate="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 482
    goto :goto_0

    .line 480
    :catch_0
    move-exception v6

    .line 481
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NumberFormatException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    :cond_0
    :goto_0
    return-wide v4
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 5

    .line 340
    invoke-static {p1}, Lo/dzo;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "taskId Not in the effective range"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    return-void

    .line 344
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 345
    invoke-direct {p0}, Lo/dwo;->o()V

    .line 347
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/dwo;->e(Ljava/lang/String;ILjava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 348
    invoke-static {}, Lo/dzo;->b()Ljava/lang/String;

    move-result-object v4

    .line 349
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateBinderaskStatusToCloud getCurrentTimeZone="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    const-string v0, "timeZone"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v3}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 352
    return-void
.end method

.method public b(Lo/dwr;)J
    .locals 5

    .line 808
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 809
    const-string v0, "page"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    const-string v0, "pageSize"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    const/4 v3, 0x0

    .line 812
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 813
    const/4 v0, 0x6

    invoke-virtual {p1, v0, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 815
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 816
    const-wide/16 v0, 0x0

    return-wide v0

    .line 818
    :cond_1
    move-object v4, v3

    check-cast v4, Lo/dvr;

    .line 819
    invoke-virtual {v4}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {v4}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 820
    invoke-virtual {v4}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dvo;

    invoke-virtual {v0}, Lo/dvo;->c()J

    move-result-wide v0

    return-wide v0

    .line 822
    :cond_2
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public b(JIZ)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIZ)Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/Double;Ljava/lang/Long;>;>;"
        }
    .end annotation

    .line 984
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 985
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dwm;

    .line 986
    const-wide/16 v10, 0x0

    .line 987
    move/from16 v0, p3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 988
    if-nez p4, :cond_0

    .line 989
    const-wide/32 v0, 0x5265c00

    sub-long/2addr p1, v0

    .line 991
    :cond_0
    const-wide/32 v0, 0x240c8400

    add-long/2addr v0, p1

    const-wide/16 v2, 0x1

    sub-long v10, v0, v2

    goto :goto_0

    .line 993
    :cond_1
    if-nez p3, :cond_2

    .line 994
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    .line 995
    move-wide v0, p1

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 996
    const/4 v0, 0x5

    invoke-virtual {v12, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v13

    .line 997
    const/4 v0, 0x5

    invoke-virtual {v12, v0, v13}, Ljava/util/Calendar;->set(II)V

    .line 998
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 999
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1000
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1001
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1002
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    .line 1004
    :cond_2
    :goto_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x2

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1005
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1006
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x3

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1007
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x4

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1008
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x5

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1009
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x6

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1010
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/4 v7, 0x7

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1011
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/16 v7, 0x8

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1012
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/16 v7, 0x9

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1013
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/16 v7, 0xa

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1014
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, v10

    move-object v5, v9

    move-object v6, v8

    const/16 v7, 0xb

    invoke-direct/range {v0 .. v7}, Lo/dwo;->c(JJLo/dwm;Ljava/util/Map;I)V

    .line 1015
    return-object v8
.end method

.method public b(I)V
    .locals 2

    .line 830
    const-string v1, ""

    .line 831
    const/4 v0, 0x6

    if-ne v0, p1, :cond_0

    .line 832
    const v0, 0x1a17ce

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 833
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 834
    const v0, 0x187d9c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 835
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p1, :cond_2

    .line 836
    const v0, 0x1c61c8

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 837
    :cond_2
    const/4 v0, 0x5

    if-ne v0, p1, :cond_3

    .line 838
    const v0, 0x170a7a

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 840
    :cond_3
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 841
    return-void

    .line 843
    :cond_4
    invoke-direct {p0, v1}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 844
    return-void
.end method

.method public b(Ljava/lang/String;Landroid/content/Context;)V
    .locals 8

    .line 592
    invoke-static {p1}, Lo/dzo;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 593
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "gotoTaskPageByTaskID key is invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    return-void

    .line 596
    :cond_0
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v3

    .line 597
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 598
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "pluginAchieveAdapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    return-void

    .line 601
    :cond_1
    const/4 v4, 0x0

    .line 603
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 606
    goto :goto_0

    .line 604
    :catch_0
    move-exception v5

    .line 605
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setEvent NumberFormatException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    .line 609
    :sswitch_0
    const-string v0, "com.huawei.ui.main.stories.me.activity.UserInfoActivity"

    invoke-virtual {p0, v0, p2}, Lo/dwo;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 610
    goto/16 :goto_2

    .line 612
    :sswitch_1
    invoke-interface {v3, p2}, Lo/dti;->c(Landroid/content/Context;)V

    .line 613
    goto/16 :goto_2

    .line 615
    :sswitch_2
    const-string v0, "HDK_BLOOD_PRESSURE"

    invoke-interface {v3, p2, v0}, Lo/dti;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 616
    goto/16 :goto_2

    .line 618
    :sswitch_3
    const-string v0, "HDK_BLOOD_SUGAR"

    invoke-interface {v3, p2, v0}, Lo/dti;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 619
    goto/16 :goto_2

    .line 621
    :sswitch_4
    const-string v0, "HDK_WEIGHT"

    invoke-interface {v3, p2, v0}, Lo/dti;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 622
    goto/16 :goto_2

    .line 624
    :sswitch_5
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v5

    .line 625
    invoke-interface {v3, p2, v5}, Lo/dti;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 626
    goto/16 :goto_2

    .line 628
    :sswitch_6
    invoke-interface {v3, p2}, Lo/dti;->d(Landroid/content/Context;)V

    .line 629
    goto :goto_2

    .line 632
    :sswitch_7
    invoke-interface {v3}, Lo/dti;->e()V

    .line 633
    goto :goto_2

    .line 635
    :sswitch_8
    const-string v0, "huaweischeme://healthapp/track?sportType=2&targetType=m&targetValue=1000"

    invoke-virtual {p0, v0}, Lo/dwo;->c(Ljava/lang/String;)V

    .line 636
    goto :goto_2

    .line 638
    :sswitch_9
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v6

    .line 639
    invoke-interface {v3, p2, v6}, Lo/dti;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 640
    goto :goto_2

    .line 642
    :sswitch_a
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v7

    .line 643
    invoke-interface {v3, p2, v7}, Lo/dti;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 644
    goto :goto_2

    .line 646
    :sswitch_b
    invoke-interface {v3}, Lo/dti;->c()V

    .line 647
    goto :goto_2

    .line 649
    :sswitch_c
    invoke-interface {v3, p2}, Lo/dti;->e(Landroid/content/Context;)V

    .line 650
    goto :goto_2

    .line 652
    :sswitch_d
    invoke-interface {v3, p2}, Lo/dti;->b(Landroid/content/Context;)V

    .line 653
    goto :goto_2

    .line 655
    :sswitch_e
    invoke-interface {v3, p2}, Lo/dti;->a(Landroid/content/Context;)V

    .line 656
    goto :goto_2

    .line 658
    :sswitch_f
    invoke-static {p2}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dth;->k(Landroid/content/Context;)V

    .line 659
    goto :goto_2

    .line 661
    :goto_1
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "invalid key"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_5
        0x44c -> :sswitch_0
        0x4b0 -> :sswitch_1
        0x76c -> :sswitch_9
        0x1fbda -> :sswitch_6
        0x6903c -> :sswitch_7
        0x83f86 -> :sswitch_4
        0x9ef34 -> :sswitch_2
        0xb9906 -> :sswitch_3
        0x170a7a -> :sswitch_f
        0x187d9c -> :sswitch_b
        0x1a17ce -> :sswitch_d
        0x1c61c8 -> :sswitch_c
        0x1dc162 -> :sswitch_e
        0x1eabc2 -> :sswitch_a
        0x20f59e -> :sswitch_8
    .end sparse-switch
.end method

.method public b(Z)V
    .locals 3

    .line 391
    if-eqz p1, :cond_0

    .line 392
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "coupon_kaka"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 394
    :cond_0
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "coupon_kaka"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 3

    .line 380
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "wechatBindStatus"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 381
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "false"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 384
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x4
    .end annotation

    .line 689
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 690
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "url is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 691
    return-void

    .line 693
    :cond_0
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "huaweihealth"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "huaweischeme"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "geo:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "mailto:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "tel:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 695
    :cond_1
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 696
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 697
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 698
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 699
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 700
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "jump to scheme view"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 703
    goto :goto_0

    .line 701
    :catch_0
    move-exception v2

    .line 702
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 705
    :cond_2
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 89
    const/4 v3, 0x0

    .line 91
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 94
    goto :goto_0

    .line 92
    :catch_0
    move-exception v4

    .line 93
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setEvent NumberFormatException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    .line 97
    :sswitch_0
    invoke-direct {p0, p1}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 98
    goto/16 :goto_2

    .line 100
    :sswitch_1
    invoke-direct {p0, p1}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 101
    goto/16 :goto_2

    .line 103
    :sswitch_2
    const v0, 0x9ef34

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 104
    goto/16 :goto_2

    .line 106
    :sswitch_3
    const v0, 0xb9906

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 107
    goto :goto_2

    .line 109
    :sswitch_4
    sget-object v0, Lo/dwo;->e:Lo/dwu;

    invoke-virtual {v0, p1}, Lo/dwu;->d(Ljava/lang/String;)V

    .line 110
    goto :goto_2

    .line 112
    :sswitch_5
    const v0, 0x83f86

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dwo;->b(Ljava/lang/String;)V

    .line 113
    sget-object v0, Lo/dwo;->e:Lo/dwu;

    const/16 v1, 0x4ba

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dwu;->d(Ljava/lang/String;)V

    .line 114
    goto :goto_2

    .line 117
    :sswitch_6
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "invalid key=1000"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    goto :goto_2

    .line 120
    :sswitch_7
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lo/dwo;->e(Ljava/lang/String;Ljava/util/Map;)V

    .line 121
    sget-object v0, Lo/dwo;->e:Lo/dwu;

    invoke-virtual {v0, p1}, Lo/dwu;->d(Ljava/lang/String;)V

    .line 122
    goto :goto_2

    .line 124
    :sswitch_8
    const v0, 0x6903c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lo/dwo;->b(Ljava/lang/String;Ljava/util/Map;)V

    .line 125
    goto :goto_2

    .line 127
    :sswitch_9
    const v0, 0x20f59e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lo/dwo;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 128
    goto :goto_2

    .line 130
    :sswitch_a
    invoke-direct {p0, p1, p2}, Lo/dwo;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 131
    goto :goto_2

    .line 133
    :sswitch_b
    invoke-direct {p0, p2}, Lo/dwo;->e(Ljava/util/Map;)V

    .line 134
    goto :goto_2

    .line 136
    :goto_1
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "invalid key"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_b
        0x3e8 -> :sswitch_6
        0x44c -> :sswitch_0
        0x4b0 -> :sswitch_1
        0x4ba -> :sswitch_4
        0x514 -> :sswitch_8
        0x578 -> :sswitch_9
        0x5dc -> :sswitch_7
        0x640 -> :sswitch_2
        0x6a4 -> :sswitch_3
        0x33464 -> :sswitch_a
        0x83f86 -> :sswitch_5
    .end sparse-switch
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 929
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 930
    const v0, 0xc356e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 931
    const v0, 0xde2ba

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 932
    const v0, 0xf55dc

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 933
    const v0, 0x10f00e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 935
    const v0, 0x133a08

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 936
    const v0, 0x1499a2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    const v0, 0x155d2e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 939
    :cond_0
    return-void
.end method

.method public c(Ljava/util/ArrayList;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Lo/dvq;>;)V"
        }
    .end annotation

    .line 948
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 949
    const-wide/16 v5, 0x0

    .line 950
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_3

    .line 951
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dvq;

    .line 952
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 953
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 954
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v5, v6, v0, v1}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 955
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "kakaLoginTask"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 956
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 957
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0, v8}, Lo/dwr;->d(Lo/dvf;)Z

    .line 958
    invoke-virtual {v8}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/dwo;->d(Ljava/lang/String;I)V

    .line 959
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finish Id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    goto :goto_1

    .line 962
    :cond_0
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealTodayLoginTask same day!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 963
    goto :goto_1

    .line 966
    :cond_1
    invoke-virtual {v8}, Lo/dvq;->u()J

    move-result-wide v5

    .line 967
    const v0, 0x155d2e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 968
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "kakaLoginTask"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 974
    :cond_3
    :goto_1
    return-void
.end method

.method public c(Ljava/util/Map;Ljava/lang/String;Lo/dvq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lo/dvq;>;Ljava/lang/String;Lo/dvq;)V"
        }
    .end annotation

    .line 918
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 919
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 3

    .line 369
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "coupon_kaka"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 370
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 371
    const/4 v0, 0x1

    return v0

    .line 373
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lo/dti;)Z
    .locals 6

    .line 754
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 755
    const/4 v0, 0x1

    return v0

    .line 757
    :cond_0
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 758
    array-length v2, v1

    .line 759
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    .line 760
    aget-object v4, v1, v3

    .line 761
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 762
    goto :goto_1

    .line 764
    :cond_1
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    invoke-interface {p3, v4, v0}, Lo/dti;->d(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 765
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 766
    const/4 v0, 0x0

    return v0

    .line 759
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 769
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 2

    .line 776
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 777
    new-instance v0, Lo/dwo$2;

    invoke-direct {v0, p0}, Lo/dwo$2;-><init>(Lo/dwo;)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 801
    return-void
.end method

.method public d(I)V
    .locals 7

    .line 731
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 732
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 733
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    instance-of v0, v4, Lo/dvh;

    if-eqz v0, :cond_1

    .line 734
    move-object v5, v4

    check-cast v5, Lo/dvh;

    .line 735
    invoke-virtual {v5}, Lo/dvh;->c()I

    move-result v6

    .line 736
    if-le p1, v6, :cond_0

    .line 737
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kakaTotalNum="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    invoke-virtual {v5, p1}, Lo/dvh;->d(I)V

    .line 739
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0, v5}, Lo/dwr;->d(Lo/dvf;)Z

    goto :goto_0

    .line 741
    :cond_0
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kaka="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    :cond_1
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 6

    .line 257
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "updateUserTaskStatusToDB fail taskId is invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    return-void

    .line 261
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 262
    const-string v0, "taskId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 264
    instance-of v0, v3, Lo/dvq;

    if-eqz v0, :cond_2

    .line 265
    move-object v4, v3

    check-cast v4, Lo/dvq;

    .line 266
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/dvq;->c(J)V

    .line 267
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    invoke-virtual {v4}, Lo/dvq;->k()I

    move-result v5

    .line 269
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {v4, v0}, Lo/dvq;->b(I)V

    .line 271
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/dvq;->g(I)V

    .line 272
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/dvq;->h(I)V

    .line 273
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0, v4}, Lo/dwr;->d(Lo/dvf;)Z

    .line 275
    :cond_2
    return-void
.end method

.method public d(Ljava/lang/String;I)V
    .locals 5

    .line 324
    invoke-static {p1}, Lo/dzo;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 325
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "taskId Not in the effective range"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    return-void

    .line 328
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 329
    invoke-direct {p0}, Lo/dwo;->o()V

    .line 331
    :cond_1
    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lo/dwo;->e(Ljava/lang/String;ILjava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 332
    invoke-static {}, Lo/dzo;->b()Ljava/lang/String;

    move-result-object v4

    .line 333
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserTaskStatus getCurrentTimeZone="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const-string v0, "timeZone"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v3}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 336
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .line 713
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 714
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 715
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 716
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 717
    invoke-virtual {p2, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 720
    goto :goto_0

    .line 718
    :catch_0
    move-exception v2

    .line 719
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;I)V
    .locals 6

    .line 229
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "updateUserTaskStatusToDB fail taskId is invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    return-void

    .line 233
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 234
    const-string v0, "taskId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 236
    instance-of v0, v3, Lo/dvq;

    if-eqz v0, :cond_2

    .line 237
    move-object v4, v3

    check-cast v4, Lo/dvq;

    .line 238
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 239
    invoke-virtual {v4}, Lo/dvq;->k()I

    move-result v5

    .line 240
    add-int/lit8 v0, v5, -0x1

    invoke-virtual {v4, v0}, Lo/dvq;->b(I)V

    .line 243
    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 244
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/dvq;->g(I)V

    .line 245
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/dvq;->h(I)V

    .line 246
    sget-object v0, Lo/dwo;->c:Lo/dwr;

    invoke-virtual {v0, v4}, Lo/dwr;->d(Lo/dvf;)Z

    .line 248
    :cond_2
    return-void
.end method

.method public e()Z
    .locals 4

    .line 404
    iget-object v0, p0, Lo/dwo;->b:Landroid/content/Context;

    const-string v1, "taskReachInfo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 405
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    const/4 v0, 0x0

    return v0

    .line 408
    :cond_0
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRedDotResult is true"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    const/4 v0, 0x1

    return v0
.end method

.method public f()V
    .locals 3

    .line 850
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "enter dealLoginTask"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 851
    invoke-direct {p0}, Lo/dwo;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 852
    sget-object v0, Lo/dwo;->a:Ljava/lang/String;

    const-string v1, "dealLoginTask return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 853
    return-void

    .line 855
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    .line 856
    new-instance v0, Lo/dwo$1;

    invoke-direct {v0, p0}, Lo/dwo$1;-><init>(Lo/dwo;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 885
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 886
    return-void
.end method
