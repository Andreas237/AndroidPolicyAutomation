.class Lo/cby$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cby;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lo/cby;

.field private b:J

.field private c:I

.field d:I

.field private e:[F

.field private f:D

.field private h:D


# direct methods
.method private constructor <init>(Lo/cby;)V
    .locals 2

    .line 245
    iput-object p1, p0, Lo/cby$b;->a:Lo/cby;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    const/16 v0, 0x33

    new-array v0, v0, [F

    iput-object v0, p0, Lo/cby$b;->e:[F

    .line 251
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cby$b;->b:J

    .line 252
    const v0, 0x186a0

    iput v0, p0, Lo/cby$b;->c:I

    .line 253
    const-wide v0, 0x4020a8f5c28f5c29L    # 8.33

    iput-wide v0, p0, Lo/cby$b;->f:D

    .line 254
    const-wide v0, 0x408faa0000000000L    # 1013.25

    iput-wide v0, p0, Lo/cby$b;->h:D

    return-void
.end method

.method synthetic constructor <init>(Lo/cby;Lo/cby$1;)V
    .locals 0

    .line 245
    invoke-direct {p0, p1}, Lo/cby$b;-><init>(Lo/cby;)V

    return-void
.end method

.method private b()I
    .locals 1

    .line 257
    iget v0, p0, Lo/cby$b;->c:I

    return v0
.end method

.method private c()D
    .locals 10

    .line 268
    iget v0, p0, Lo/cby$b;->d:I

    if-gtz v0, :cond_0

    .line 269
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Sensor error,Pressure not report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    const-wide/16 v0, 0x1

    return-wide v0

    .line 274
    :cond_0
    const/4 v6, 0x0

    .line 275
    const/4 v7, 0x1

    .line 276
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    .line 277
    const/4 v9, 0x0

    :goto_0
    iget v0, p0, Lo/cby$b;->d:I

    if-ge v9, v0, :cond_3

    .line 278
    iget-object v0, p0, Lo/cby$b;->e:[F

    aget v0, v0, v9

    cmpg-float v0, v7, v0

    if-gez v0, :cond_1

    .line 279
    iget-object v0, p0, Lo/cby$b;->e:[F

    aget v7, v0, v9

    .line 281
    :cond_1
    iget-object v0, p0, Lo/cby$b;->e:[F

    aget v0, v0, v9

    cmpl-float v0, v8, v0

    if-lez v0, :cond_2

    .line 282
    iget-object v0, p0, Lo/cby$b;->e:[F

    aget v8, v0, v9

    .line 284
    :cond_2
    iget-object v0, p0, Lo/cby$b;->e:[F

    aget v0, v0, v9

    add-float/2addr v6, v0

    .line 277
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 287
    :cond_3
    sub-float v0, v7, v8

    const/high16 v1, 0x41700000    # 15.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_4

    .line 288
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pressure change over thres = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-float v2, v7, v8

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    const-wide/16 v0, 0x1

    return-wide v0

    .line 292
    :cond_4
    iget-wide v0, p0, Lo/cby$b;->f:D

    iget-wide v2, p0, Lo/cby$b;->h:D

    iget v4, p0, Lo/cby$b;->d:I

    int-to-float v4, v4

    div-float v4, v6, v4

    float-to-double v4, v4

    sub-double/2addr v2, v4

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method static synthetic e(Lo/cby$b;)I
    .locals 1

    .line 245
    invoke-direct {p0}, Lo/cby$b;->b()I

    move-result v0

    return v0
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 343
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 12

    .line 298
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-static {v0, v1}, Lo/cby;->c(Lo/cby;F)F

    .line 299
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v0}, Lo/cby;->c(Lo/cby;)F

    move-result v0

    float-to-double v0, v0

    iget-wide v2, p0, Lo/cby$b;->h:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v0}, Lo/cby;->c(Lo/cby;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    iget-wide v1, p0, Lo/cby$b;->f:D

    iget-wide v3, p0, Lo/cby$b;->h:D

    iget-object v5, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v5}, Lo/cby;->c(Lo/cby;)F

    move-result v5

    float-to-double v5, v5

    sub-double/2addr v3, v5

    mul-double/2addr v1, v3

    double-to-float v1, v1

    invoke-static {v0, v1}, Lo/cby;->a(Lo/cby;F)F

    .line 303
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 305
    iget-wide v0, p0, Lo/cby$b;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 306
    iput-wide v7, p0, Lo/cby$b;->b:J

    .line 309
    :cond_1
    iget-wide v0, p0, Lo/cby$b;->b:J

    sub-long v0, v7, v0

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-ltz v0, :cond_4

    .line 312
    invoke-direct {p0}, Lo/cby$b;->c()D

    move-result-wide v9

    .line 314
    const-wide/16 v0, 0x1

    sub-double v0, v9, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 315
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v0}, Lo/cby;->a(Lo/cby;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 316
    const/4 v0, 0x0

    iput v0, p0, Lo/cby$b;->d:I

    .line 317
    iput-wide v7, p0, Lo/cby$b;->b:J

    .line 318
    return-void

    .line 320
    :cond_2
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v0}, Lo/cby;->a(Lo/cby;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v1}, Lo/cby;->a(Lo/cby;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfb;

    invoke-virtual {v0}, Lo/cfb;->a()D

    move-result-wide v9

    .line 323
    :cond_3
    const-string v0, "Track_TrackAltitudeMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "h = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    new-instance v11, Lo/cfb;

    invoke-direct {v11, v7, v8, v9, v10}, Lo/cfb;-><init>(JD)V

    .line 326
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v0}, Lo/cby;->a(Lo/cby;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    iget-object v0, p0, Lo/cby$b;->a:Lo/cby;

    invoke-static {v0}, Lo/cby;->b(Lo/cby;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    const/4 v0, 0x0

    iput v0, p0, Lo/cby$b;->d:I

    .line 330
    iput-wide v7, p0, Lo/cby$b;->b:J

    .line 331
    goto :goto_0

    .line 332
    :cond_4
    iget v0, p0, Lo/cby$b;->d:I

    const/16 v1, 0x33

    if-ge v0, v1, :cond_5

    .line 333
    iget-object v0, p0, Lo/cby$b;->e:[F

    iget v1, p0, Lo/cby$b;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/cby$b;->d:I

    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    aput v2, v0, v1

    .line 338
    :cond_5
    :goto_0
    return-void
.end method
