.class public final Lo/rb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c(IIII)F
    .locals 4

    .line 44
    sub-int v2, p0, p2

    .line 45
    sub-int v3, p1, p3

    .line 46
    mul-int v0, v2, v2

    mul-int v1, v3, v3

    add-int/2addr v0, v1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public static c(F)I
    .locals 1

    .line 34
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/high16 v0, -0x41000000    # -0.5f

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    :goto_0
    add-float/2addr v0, p0

    float-to-int v0, v0

    return v0
.end method

.method public static e(FFFF)F
    .locals 4

    .line 38
    sub-float v2, p0, p2

    .line 39
    sub-float v3, p1, p3

    .line 40
    mul-float v0, v2, v2

    mul-float v1, v3, v3

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method
