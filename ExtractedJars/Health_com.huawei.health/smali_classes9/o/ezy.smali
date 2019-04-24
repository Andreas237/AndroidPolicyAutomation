.class public Lo/ezy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(II)I
    .locals 8

    .line 12
    if-nez p0, :cond_0

    .line 14
    const/16 v0, 0x2ee0

    return v0

    .line 16
    :cond_0
    const/4 v0, 0x1

    if-gt p1, v0, :cond_1

    .line 17
    return p0

    .line 35
    :cond_1
    add-int/lit8 v4, p1, -0x1

    .line 36
    invoke-static {p0}, Lo/ezy;->d(I)I

    move-result v5

    .line 37
    const/4 v0, 0x1

    if-ge v5, v0, :cond_2

    .line 39
    const/4 v5, 0x1

    .line 42
    :cond_2
    add-int/lit8 v0, v5, -0x1

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int v0, v0

    mul-int v6, v4, v0

    .line 44
    const/4 v7, 0x0

    .line 45
    :goto_0
    if-ge v7, p0, :cond_3

    .line 46
    add-int/2addr v7, v6

    goto :goto_0

    .line 49
    :cond_3
    return v7
.end method

.method private static d(I)I
    .locals 2

    .line 56
    const/4 v1, 0x0

    .line 58
    :cond_0
    div-int/lit8 p0, p0, 0xa

    .line 59
    if-eqz p0, :cond_1

    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 62
    :cond_1
    if-nez p0, :cond_0

    .line 64
    return v1
.end method
