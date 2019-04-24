.class public Lo/cbf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(IF)D
    .locals 6

    .line 32
    if-gtz p0, :cond_0

    .line 33
    const-wide/16 v0, 0x0

    return-wide v0

    .line 35
    :cond_0
    int-to-double v0, p0

    float-to-double v2, p1

    const-wide v4, 0x3fdae147ae147ae1L    # 0.42

    mul-double/2addr v2, v4

    const-wide v4, 0x40f86a0000000000L    # 100000.0

    div-double/2addr v2, v4

    mul-double/2addr v0, v2

    return-wide v0
.end method
