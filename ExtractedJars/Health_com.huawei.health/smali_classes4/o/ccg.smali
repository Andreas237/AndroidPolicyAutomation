.class public Lo/ccg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c([F)F
    .locals 11

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v7, p0

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_0

    aget v10, v7, v9

    .line 18
    float-to-double v0, v6

    float-to-double v2, v10

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 17
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 20
    :cond_0
    return v6
.end method

.method public static d([F[F)F
    .locals 4

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_0

    .line 27
    aget v0, p0, v3

    aget v1, p1, v3

    mul-float/2addr v0, v1

    add-float/2addr v2, v0

    .line 26
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 29
    :cond_0
    return v2
.end method

.method public static e(FFFF)F
    .locals 7

    .line 39
    float-to-double v0, p0

    neg-float v2, p1

    sub-float v3, p3, p2

    mul-float/2addr v2, v3

    float-to-double v2, v2

    const-wide v4, 0x4005bf0a8b145769L    # Math.E

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double/2addr v2, v4

    div-double/2addr v0, v2

    double-to-float v6, v0

    .line 40
    return v6
.end method

.method public static e([F)F
    .locals 6

    .line 7
    const/4 v1, 0x0

    .line 8
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    .line 9
    add-float/2addr v1, v5

    .line 8
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 11
    :cond_0
    return v1
.end method
