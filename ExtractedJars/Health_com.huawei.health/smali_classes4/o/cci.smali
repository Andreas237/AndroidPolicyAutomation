.class public Lo/cci;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([F[FF)F
    .locals 4

    .line 35
    array-length v3, p0

    .line 36
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 39
    :cond_0
    invoke-static {p1}, Lo/ccg;->e([F)F

    move-result v0

    int-to-float v1, v3

    div-float/2addr v0, v1

    invoke-static {p0}, Lo/ccg;->e([F)F

    move-result v1

    mul-float/2addr v1, p2

    int-to-float v2, v3

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method public static e([F[F)F
    .locals 8

    .line 17
    array-length v6, p0

    .line 18
    const/4 v0, 0x1

    if-ne v6, v0, :cond_0

    .line 19
    const/4 v0, 0x0

    return v0

    .line 21
    :cond_0
    int-to-float v0, v6

    invoke-static {p0}, Lo/ccg;->c([F)F

    move-result v1

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {p0}, Lo/ccg;->e([F)F

    move-result v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    sub-double/2addr v0, v2

    double-to-float v7, v0

    .line 22
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-nez v0, :cond_1

    .line 23
    const/4 v0, 0x0

    return v0

    .line 26
    :cond_1
    int-to-float v0, v6

    invoke-static {p0, p1}, Lo/ccg;->d([F[F)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {p0}, Lo/ccg;->e([F)F

    move-result v1

    invoke-static {p1}, Lo/ccg;->e([F)F

    move-result v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    div-float/2addr v0, v7

    return v0
.end method
