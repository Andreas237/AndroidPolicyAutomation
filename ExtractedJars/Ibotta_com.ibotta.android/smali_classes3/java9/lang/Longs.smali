.class public final Ljava9/lang/Longs;
.super Ljava/lang/Object;
.source "Longs.java"


# direct methods
.method public static compare(JJ)I
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static compareUnsigned(JJ)I
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    add-long/2addr p0, v0

    add-long/2addr p2, v0

    .line 133
    invoke-static {p0, p1, p2, p3}, Ljava9/lang/Longs;->compare(JJ)I

    move-result p0

    return p0
.end method

.method public static divideUnsigned(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-gez v2, :cond_1

    .line 68
    invoke-static {p0, p1, p2, p3}, Ljava9/lang/Longs;->compareUnsigned(JJ)I

    move-result p0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0

    :cond_1
    cmp-long v2, p0, v0

    if-lez v2, :cond_2

    .line 72
    div-long/2addr p0, p2

    return-wide p0

    .line 80
    :cond_2
    invoke-static {p0, p1}, Ljava9/lang/Longs;->toUnsignedBigInteger(J)Ljava/math/BigInteger;

    move-result-object p0

    .line 81
    invoke-static {p2, p3}, Ljava9/lang/Longs;->toUnsignedBigInteger(J)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static hashCode(J)I
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p1, p0

    return p1
.end method

.method public static sum(JJ)J
    .locals 0

    add-long/2addr p0, p2

    return-wide p0
.end method

.method private static toUnsignedBigInteger(J)Ljava/math/BigInteger;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    .line 91
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x20

    ushr-long v1, p0, v0

    long-to-int v2, v1

    long-to-int p1, p0

    .line 97
    invoke-static {v2}, Ljava9/lang/Integers;->toUnsignedLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p0

    .line 98
    invoke-static {p1}, Ljava9/lang/Integers;->toUnsignedLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method
