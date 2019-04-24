.class public Lo/bzr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 255
    rem-int/lit8 v0, p0, 0x3c

    return v0
.end method

.method public static a(D)Ljava/lang/String;
    .locals 4

    .line 61
    const/4 v0, 0x1

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lo/cxh;->e(DIIZ)Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzr;->d(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(F)Ljava/lang/String;
    .locals 4

    .line 123
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, p0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(F)I
    .locals 1

    .line 30
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, p0

    float-to-int v0, v0

    return v0
.end method

.method public static b(I)I
    .locals 1

    .line 245
    div-int/lit8 v0, p0, 0x3c

    return v0
.end method

.method public static b(D)Ljava/lang/String;
    .locals 2

    .line 72
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(I)D
    .locals 4

    .line 289
    int-to-double v0, p0

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x40f0000000000000L    # 65536.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static c()I
    .locals 1

    .line 341
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 342
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    return v0

    .line 344
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    return v0
.end method

.method public static c(D)I
    .locals 4

    .line 299
    const-wide/high16 v0, 0x40f0000000000000L    # 65536.0

    mul-double/2addr v0, p0

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    div-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public static c(F)Ljava/lang/String;
    .locals 4

    .line 134
    float-to-double v0, p0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(F)F
    .locals 1

    .line 102
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, p0, v0

    return v0
.end method

.method public static d(I)F
    .locals 2

    .line 40
    int-to-float v0, p0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public static d(D)Ljava/lang/String;
    .locals 3

    .line 50
    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lo/cxh;->e(DIIZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(D)D
    .locals 3

    .line 232
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    :cond_0
    const-wide/16 p0, 0x0

    .line 235
    :cond_1
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0, p1}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    float-to-double v0, v0

    return-wide v0
.end method

.method public static e()I
    .locals 1

    .line 363
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 364
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_pace_mile:I

    return v0

    .line 366
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_event_time_formart:I

    return v0
.end method

.method public static e(F)I
    .locals 1

    .line 92
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, p0

    float-to-int v0, v0

    return v0
.end method

.method public static e(I)I
    .locals 1

    .line 186
    mul-int/lit16 v0, p0, 0x3e8

    return v0
.end method

.method public static f(F)Ljava/lang/String;
    .locals 4

    .line 176
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, p0, v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g(F)I
    .locals 4

    .line 266
    float-to-double v0, p0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 267
    const v0, 0x7fffffff

    return v0

    .line 269
    :cond_0
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr v0, p0

    float-to-int v0, v0

    return v0
.end method

.method public static h(D)F
    .locals 3

    .line 337
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0, p1}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0
.end method

.method public static h(F)Ljava/lang/String;
    .locals 4

    .line 166
    const/high16 v0, 0x42700000    # 60.0f

    div-float v0, p0, v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static i(D)D
    .locals 2

    .line 349
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    const/4 v0, 0x3

    invoke-static {p0, p1, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    return-wide v0

    .line 352
    :cond_0
    return-wide p0
.end method

.method public static i(F)F
    .locals 3

    .line 221
    new-instance v0, Ljava/math/BigDecimal;

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-static {p0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v1, v1

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0
.end method

.method public static k(D)F
    .locals 2

    .line 318
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    int-to-float v0, v0

    return v0
.end method

.method public static k(F)Ljava/lang/String;
    .locals 4

    .line 155
    const v0, 0x476a6000    # 60000.0f

    div-float v0, p0, v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static m(F)F
    .locals 1

    .line 279
    const v0, 0x40666666    # 3.6f

    mul-float/2addr v0, p0

    return v0
.end method
