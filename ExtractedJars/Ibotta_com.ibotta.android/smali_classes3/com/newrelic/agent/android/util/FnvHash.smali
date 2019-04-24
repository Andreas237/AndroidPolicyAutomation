.class public Lcom/newrelic/agent/android/util/FnvHash;
.super Ljava/lang/Object;
.source "FnvHash.java"


# static fields
.field private static final FNV32basis:I = -0x7ee3623b

.field private static final FNV32prime:I = 0x1000193

.field private static final FNV64basis:J = -0x340d631b7bdddcdbL

.field private static final FNV64prime:J = 0x100000001b3L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fnv32(Ljava/lang/String;)I
    .locals 0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lcom/newrelic/agent/android/util/FnvHash;->fnv32([B)I

    move-result p0

    return p0
.end method

.method public static fnv32([B)I
    .locals 5

    .line 22
    array-length v0, p0

    const v1, -0x7ee3623b

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-byte v3, p0, v2

    const v4, 0x1000193

    xor-int/2addr v1, v3

    mul-int v1, v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static fnv64(Ljava/lang/String;)J
    .locals 2

    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lcom/newrelic/agent/android/util/FnvHash;->fnv64([B)J

    move-result-wide v0

    return-wide v0
.end method

.method public static fnv64([B)J
    .locals 9

    .line 44
    array-length v0, p0

    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p0, v3

    const-wide v5, 0x100000001b3L

    int-to-long v7, v4

    xor-long/2addr v1, v7

    mul-long v1, v1, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method
