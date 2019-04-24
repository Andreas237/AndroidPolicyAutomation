.class public Lo/cby;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ccn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cby$b;
    }
.end annotation


# instance fields
.field private a:Landroid/hardware/SensorManager;

.field private b:D

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfb;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfb;>;"
        }
    .end annotation
.end field

.field private e:Landroid/hardware/Sensor;

.field private f:Lo/cby$b;

.field private h:D

.field private i:F

.field private k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cby;->c:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cby;->d:Ljava/util/List;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cby;->a:Landroid/hardware/SensorManager;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cby;->e:Landroid/hardware/Sensor;

    .line 28
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cby;->b:D

    .line 30
    const-wide v0, 0x3fe3333333333333L    # 0.6

    iput-wide v0, p0, Lo/cby;->h:D

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/cby;->i:F

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/cby;->k:F

    .line 37
    new-instance v0, Lo/cby$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cby$b;-><init>(Lo/cby;Lo/cby$1;)V

    iput-object v0, p0, Lo/cby;->f:Lo/cby$b;

    .line 40
    if-nez p1, :cond_0

    .line 41
    return-void

    .line 44
    :cond_0
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new TrackAltitudeMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lo/cby;->a:Landroid/hardware/SensorManager;

    .line 46
    iget-object v0, p0, Lo/cby;->a:Landroid/hardware/SensorManager;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lo/cby;->e:Landroid/hardware/Sensor;

    .line 47
    return-void
.end method

.method static synthetic a(Lo/cby;F)F
    .locals 0

    .line 20
    iput p1, p0, Lo/cby;->k:F

    return p1
.end method

.method static synthetic a(Lo/cby;)Ljava/util/List;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lo/cby;)Ljava/util/List;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/cby;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/cby;)F
    .locals 1

    .line 20
    iget v0, p0, Lo/cby;->i:F

    return v0
.end method

.method static synthetic c(Lo/cby;F)F
    .locals 0

    .line 20
    iput p1, p0, Lo/cby;->i:F

    return p1
.end method

.method private d([DD)D
    .locals 21

    .line 372
    const-wide/16 v4, 0x0

    .line 373
    if-eqz p1, :cond_0

    move-object/from16 v0, p1

    array-length v0, v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p1

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 374
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 377
    :cond_1
    move-object/from16 v0, p1

    array-length v6, v0

    .line 379
    const/4 v7, 0x0

    .line 380
    const/4 v8, 0x0

    .line 381
    const/4 v9, 0x0

    .line 382
    const/4 v10, 0x0

    .line 384
    const/4 v0, 0x0

    aget-wide v11, p1, v0

    .line 387
    const/4 v13, 0x0

    :goto_0
    add-int/lit8 v0, v6, -0x1

    if-ge v13, v0, :cond_6

    .line 388
    aget-wide v14, p1, v13

    .line 389
    add-int/lit8 v0, v13, 0x1

    aget-wide v16, p1, v0

    .line 391
    sub-double v18, v16, v14

    .line 392
    const-wide/16 v0, 0x0

    cmpg-double v0, v18, v0

    if-gez v0, :cond_5

    .line 393
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v13}, Lo/cby;->b([DI)I

    move-result v10

    .line 394
    move v8, v13

    .line 395
    move v9, v13

    .line 396
    aget-wide v0, p1, v10

    sub-double v0, v14, v0

    cmpl-double v0, v0, p2

    if-gtz v0, :cond_2

    aget-wide v0, p1, v10

    cmpg-double v0, v0, v11

    if-gez v0, :cond_3

    .line 397
    :cond_2
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upS = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " upE = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " downS = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " downE = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " elva = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    move v7, v10

    .line 404
    aget-wide v11, p1, v10

    goto :goto_2

    .line 407
    :cond_3
    add-int/lit8 v20, v13, 0x1

    :goto_1
    move/from16 v0, v20

    if-gt v0, v10, :cond_4

    .line 408
    aput-wide v14, p1, v20

    .line 407
    add-int/lit8 v20, v20, 0x1

    goto :goto_1

    .line 411
    :cond_4
    :goto_2
    move v13, v10

    goto :goto_3

    .line 413
    :cond_5
    move v7, v13

    .line 414
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v13}, Lo/cby;->c([DI)I

    move-result v13

    .line 418
    :goto_3
    goto/16 :goto_0

    .line 421
    :cond_6
    const/4 v13, 0x1

    :goto_4
    if-ge v13, v6, :cond_8

    .line 422
    aget-wide v0, p1, v13

    add-int/lit8 v2, v13, -0x1

    aget-wide v2, p1, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_7

    .line 423
    aget-wide v0, p1, v13

    add-int/lit8 v2, v13, -0x1

    aget-wide v2, p1, v2

    sub-double/2addr v0, v2

    add-double/2addr v4, v0

    .line 421
    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 427
    :cond_8
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCreepingWave = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    return-wide v4
.end method

.method private g()V
    .locals 4

    .line 202
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterPressureSensor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lo/cby;->e:Landroid/hardware/Sensor;

    if-nez v0, :cond_0

    .line 205
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterPressureSensor No PressureSensor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :cond_0
    iget-object v0, p0, Lo/cby;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/cby;->f:Lo/cby$b;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 209
    return-void
.end method

.method private i()V
    .locals 4

    .line 192
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerPressureSensor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lo/cby;->e:Landroid/hardware/Sensor;

    if-nez v0, :cond_0

    .line 195
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerPressureSensor No PressureSensor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void

    .line 198
    :cond_0
    iget-object v0, p0, Lo/cby;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/cby;->f:Lo/cby$b;

    iget-object v2, p0, Lo/cby;->e:Landroid/hardware/Sensor;

    iget-object v3, p0, Lo/cby;->f:Lo/cby$b;

    invoke-static {v3}, Lo/cby$b;->e(Lo/cby$b;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 199
    return-void
.end method

.method private n()[D
    .locals 8

    .line 347
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 348
    const/4 v0, 0x0

    return-object v0

    .line 350
    :cond_0
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v5, v0, 0x2

    .line 351
    new-array v6, v5, [D

    .line 352
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v7, v0, :cond_1

    .line 353
    div-int/lit8 v0, v7, 0x2

    iget-object v1, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cfb;

    invoke-virtual {v1}, Lo/cfb;->a()D

    move-result-wide v1

    iget-object v3, p0, Lo/cby;->c:Ljava/util/List;

    add-int/lit8 v4, v7, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/cfb;

    invoke-virtual {v3}, Lo/cfb;->a()D

    move-result-wide v3

    add-double/2addr v1, v3

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    aput-wide v1, v6, v0

    .line 352
    add-int/lit8 v7, v7, 0x2

    goto :goto_0

    .line 356
    :cond_1
    return-object v6
.end method

.method private o()D
    .locals 3

    .line 241
    invoke-direct {p0}, Lo/cby;->n()[D

    move-result-object v2

    .line 242
    iget-wide v0, p0, Lo/cby;->h:D

    invoke-direct {p0, v2, v0, v1}, Lo/cby;->d([DD)D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 174
    return-void
.end method

.method public b()F
    .locals 1

    .line 462
    iget v0, p0, Lo/cby;->k:F

    return v0
.end method

.method b([DI)I
    .locals 6

    .line 446
    array-length v4, p1

    .line 447
    move v5, p2

    :goto_0
    add-int/lit8 v0, v4, -0x1

    if-ge v5, v0, :cond_1

    .line 448
    aget-wide v0, p1, v5

    add-int/lit8 v2, v5, 0x1

    aget-wide v2, p1, v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 449
    return v5

    .line 447
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 453
    :cond_1
    add-int/lit8 v0, v4, -0x1

    return v0
.end method

.method c([DI)I
    .locals 6

    .line 433
    array-length v4, p1

    .line 434
    move v5, p2

    :goto_0
    add-int/lit8 v0, v4, -0x1

    if-ge v5, v0, :cond_1

    .line 435
    aget-wide v0, p1, v5

    add-int/lit8 v2, v5, 0x1

    aget-wide v2, p1, v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 436
    return v5

    .line 434
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 440
    :cond_1
    add-int/lit8 v0, v4, -0x1

    return v0
.end method

.method public c()V
    .locals 4

    .line 74
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAltitudeMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-direct {p0}, Lo/cby;->i()V

    .line 76
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 77
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfb;>;)V"
        }
    .end annotation

    .line 50
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryAltitudeList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 52
    iget-object v0, p0, Lo/cby;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 53
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 54
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 55
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recovery AltitudeList size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cby;->b:D

    .line 60
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 62
    const/4 v8, 0x1

    :goto_0
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 63
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfb;

    invoke-virtual {v0}, Lo/cfb;->a()D

    move-result-wide v4

    .line 64
    iget-object v0, p0, Lo/cby;->c:Ljava/util/List;

    add-int/lit8 v1, v8, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfb;

    invoke-virtual {v0}, Lo/cfb;->a()D

    move-result-wide v6

    .line 65
    sub-double v0, v4, v6

    iget-wide v2, p0, Lo/cby;->h:D

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    .line 66
    iget-wide v0, p0, Lo/cby;->b:D

    sub-double v2, v4, v6

    add-double/2addr v0, v2

    iput-wide v0, p0, Lo/cby;->b:D

    .line 62
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 71
    :cond_2
    return-void
.end method

.method public d(Z)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/ArrayList<Lo/cfb;>;"
        }
    .end annotation

    .line 110
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 111
    iget-object v0, p0, Lo/cby;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/cby;->d:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 113
    if-eqz p1, :cond_0

    .line 114
    iget-object v0, p0, Lo/cby;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 118
    :cond_0
    return-object v1
.end method

.method public d()V
    .locals 6

    .line 81
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopAltitudeMgr mAltitudeList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cby;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-direct {p0}, Lo/cby;->o()D

    move-result-wide v4

    .line 84
    iget-wide v0, p0, Lo/cby;->b:D

    cmpg-double v0, v0, v4

    if-gez v0, :cond_0

    .line 85
    iput-wide v4, p0, Lo/cby;->b:D

    .line 87
    :cond_0
    invoke-direct {p0}, Lo/cby;->g()V

    .line 103
    return-void
.end method

.method public e()D
    .locals 2

    .line 123
    iget-wide v0, p0, Lo/cby;->b:D

    return-wide v0
.end method

.method public f()V
    .locals 0

    .line 189
    return-void
.end method

.method public h()V
    .locals 0

    .line 178
    invoke-direct {p0}, Lo/cby;->g()V

    .line 179
    return-void
.end method

.method public k()V
    .locals 0

    .line 183
    invoke-direct {p0}, Lo/cby;->i()V

    .line 184
    return-void
.end method
