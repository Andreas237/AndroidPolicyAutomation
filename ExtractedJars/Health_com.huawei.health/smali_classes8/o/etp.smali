.class public Lo/etp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(FF)F
    .locals 6

    .line 79
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 80
    :cond_0
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRatio: width or height is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_1
    const/high16 v0, 0x44480000    # 800.0f

    div-float v4, v0, p0

    .line 84
    const/high16 v0, 0x44110000    # 580.0f

    div-float v5, v0, p1

    .line 85
    cmpg-float v0, v4, v5

    if-gez v0, :cond_2

    .line 86
    return v4

    .line 88
    :cond_2
    return v5
.end method

.method static synthetic a(Ljava/util/ArrayList;FFFF)Ljava/util/ArrayList;
    .locals 1

    .line 27
    invoke-static {p0, p1, p2, p3, p4}, Lo/etp;->c(Ljava/util/ArrayList;FFFF)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static a(JJLandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 146
    if-nez p5, :cond_0

    .line 147
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void

    .line 151
    :cond_0
    if-nez p4, :cond_1

    .line 152
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackDraw:context ==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p5, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 154
    return-void

    .line 157
    :cond_1
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, p0

    move-wide v3, p2

    new-instance v5, Lo/etp$5;

    invoke-direct {v5, p4, p5}, Lo/etp$5;-><init>(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 256
    return-void
.end method

.method private static a(Ljava/util/ArrayList;Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fbu;>;Landroid/graphics/Canvas;Landroid/graphics/Paint;)V"
        }
    .end annotation

    .line 93
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 94
    :cond_0
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paintTrackMap: pointList is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 99
    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 100
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 101
    goto :goto_1

    .line 99
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 103
    :cond_3
    :goto_1
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fbu;

    .line 104
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 105
    invoke-virtual {v5}, Lo/fbu;->e()F

    move-result v0

    invoke-virtual {v5}, Lo/fbu;->b()F

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 107
    add-int/lit8 v7, v4, 0x1

    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 108
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fbu;

    .line 109
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lo/fbu;->e()F

    move-result v0

    invoke-virtual {v5}, Lo/fbu;->b()F

    move-result v1

    invoke-static {v0, v1}, Lo/etp;->c(FF)Z

    move-result v0

    if-nez v0, :cond_4

    .line 111
    invoke-virtual {v5}, Lo/fbu;->e()F

    move-result v0

    invoke-virtual {v5}, Lo/fbu;->b()F

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 107
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {p1, v6, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 116
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 117
    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 118
    const/16 v0, 0xff

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 119
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fbu;

    iget v0, v0, Lo/fbu;->d:F

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fbu;

    iget v1, v1, Lo/fbu;->b:F

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 120
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fbu;

    iget v0, v0, Lo/fbu;->d:F

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fbu;

    iget v1, v1, Lo/fbu;->b:F

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 121
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 122
    const-string v0, "#FFF9AC89"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 123
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fbu;

    iget v0, v0, Lo/fbu;->d:F

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fbu;

    iget v1, v1, Lo/fbu;->b:F

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 124
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fbu;

    iget v0, v0, Lo/fbu;->d:F

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fbu;

    iget v1, v1, Lo/fbu;->b:F

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 127
    return-void
.end method

.method static synthetic b(Ljava/util/ArrayList;Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 0

    .line 27
    invoke-static {p0, p1, p2}, Lo/etp;->a(Ljava/util/ArrayList;Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    return-void
.end method

.method private static c(Ljava/util/ArrayList;FFFF)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fbu;>;FFFF)Ljava/util/ArrayList<Lo/fbu;>;"
        }
    .end annotation

    .line 49
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_1
    sub-float v4, p2, p1

    .line 53
    sub-float v5, p4, p3

    .line 54
    invoke-static {v4, v5}, Lo/etp;->a(FF)F

    move-result v6

    .line 56
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 59
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adaptToCanvas: ratio is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_2
    const/16 v0, 0x35c

    move/from16 v1, p2

    invoke-static {v6, v0, v1, p1}, Lo/etp;->d(FIFF)F

    move-result v8

    .line 63
    const/16 v0, 0x280

    move/from16 v1, p4

    move/from16 v2, p3

    invoke-static {v6, v0, v1, v2}, Lo/etp;->d(FIFF)F

    move-result v9

    .line 64
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/fbu;

    .line 66
    invoke-virtual {v11}, Lo/fbu;->e()F

    move-result v0

    sub-float/2addr v0, p1

    mul-float/2addr v0, v6

    add-float v12, v0, v8

    .line 67
    invoke-virtual {v11}, Lo/fbu;->b()F

    move-result v0

    sub-float v0, p4, v0

    mul-float/2addr v0, v6

    add-float v13, v0, v9

    .line 68
    new-instance v0, Lo/fbu;

    invoke-direct {v0, v12, v13}, Lo/fbu;-><init>(FF)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    goto :goto_0

    .line 71
    :cond_3
    return-object v7
.end method

.method private static c(FF)Z
    .locals 4

    .line 140
    float-to-double v0, p0

    const-wide/high16 v2, -0x3fac000000000000L    # -80.0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3f1a36e2e0000000L    # 9.999999747378752E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    float-to-double v0, p1

    const-wide v2, 0x4056800000000000L    # 90.0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3f1a36e2e0000000L    # 9.999999747378752E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 141
    const/4 v0, 0x1

    return v0

    .line 142
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static d(FIFF)F
    .locals 2

    .line 75
    int-to-float v0, p1

    sub-float v1, p2, p3

    mul-float/2addr v1, p0

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0
.end method

.method static synthetic e(FF)Z
    .locals 1

    .line 27
    invoke-static {p0, p1}, Lo/etp;->c(FF)Z

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 4

    .line 261
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 262
    :cond_0
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "str is null or content is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    const/4 v0, 0x0

    return v0

    .line 265
    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_stretch_after_run:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 266
    const/4 v0, 0x1

    return v0

    .line 268
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
