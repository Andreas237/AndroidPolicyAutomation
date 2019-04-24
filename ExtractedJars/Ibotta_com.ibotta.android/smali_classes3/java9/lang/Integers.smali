.class public final Ljava9/lang/Integers;
.super Ljava/lang/Object;
.source "Integers.java"


# direct methods
.method public static sum(II)I
    .locals 0

    add-int/2addr p0, p1

    return p0
.end method

.method public static toUnsignedLong(I)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method
