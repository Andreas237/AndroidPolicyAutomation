.class public Lo/fsp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 231
    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lo/fsp;->c:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BI)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI)Ljava/util/List<[B>;"
        }
    .end annotation

    .line 126
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 127
    array-length v0, p0

    int-to-double v0, v0

    int-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    .line 129
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 131
    new-array v7, p1, [B

    .line 132
    const/4 v0, 0x0

    invoke-static {v7, v0}, Ljava/util/Arrays;->fill([BB)V

    .line 133
    add-int/lit8 v0, v6, 0x1

    if-ne v0, v5, :cond_0

    .line 135
    array-length v0, p0

    mul-int v1, v6, p1

    sub-int v8, v0, v1

    .line 136
    mul-int v0, v6, p1

    const/4 v1, 0x0

    invoke-static {p0, v0, v7, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 137
    goto :goto_1

    .line 138
    :cond_0
    mul-int v0, v6, p1

    const/4 v1, 0x0

    invoke-static {p0, v0, v7, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 140
    :goto_1
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 143
    :cond_1
    return-object v4
.end method

.method public static a([B)[B
    .locals 4

    .line 213
    const/4 v2, 0x0

    .line 214
    :goto_0
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    if-ge v2, v0, :cond_0

    aget-byte v0, p0, v2

    if-nez v0, :cond_0

    .line 215
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 217
    :cond_0
    if-nez v2, :cond_1

    .line 219
    return-object p0

    .line 221
    :cond_1
    array-length v0, p0

    sub-int/2addr v0, v2

    new-array v3, v0, [B

    .line 222
    array-length v0, v3

    const/4 v1, 0x0

    invoke-static {p0, v2, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 223
    return-object v3
.end method

.method public static a([BBI)[B
    .locals 4

    .line 41
    array-length v1, p0

    .line 42
    sub-int v2, p2, v1

    .line 44
    const/4 v0, 0x1

    if-ge v2, v0, :cond_0

    .line 45
    return-object p0

    .line 47
    :cond_0
    new-array v3, v2, [B

    .line 48
    invoke-static {v3, p1}, Ljava/util/Arrays;->fill([BB)V

    .line 50
    invoke-static {p0, v3}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static a([B[B)[B
    .locals 4

    .line 106
    array-length v0, p0

    new-array v2, v0, [B

    .line 108
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_0

    .line 109
    aget-byte v0, p0, v3

    aget-byte v1, p1, v3

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 108
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 112
    :cond_0
    return-object v2
.end method

.method public static b([B)Ljava/lang/String;
    .locals 7

    .line 157
    if-eqz p0, :cond_1

    array-length v0, p0

    if-eqz v0, :cond_1

    .line 158
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x3

    new-array v3, v0, [C

    .line 159
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_0

    .line 160
    aget-byte v0, p0, v4

    and-int/lit16 v6, v0, 0xff

    .line 161
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lo/fsp;->c:[C

    ushr-int/lit8 v2, v6, 0x4

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 162
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lo/fsp;->c:[C

    and-int/lit8 v2, v6, 0xf

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 163
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x20

    aput-char v1, v3, v0

    .line 159
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 165
    :cond_0
    new-instance v0, Ljava/lang/String;

    array-length v1, v3

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v3, v2, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 167
    :cond_1
    const-string v0, "--"

    return-object v0
.end method

.method public static c([B[B)[B
    .locals 5

    .line 85
    array-length v2, p0

    .line 86
    array-length v3, p1

    .line 88
    add-int v0, v2, v3

    new-array v4, v0, [B

    .line 90
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    const/4 v0, 0x0

    invoke-static {p1, v0, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    return-object v4
.end method

.method public static d([B)Ljava/lang/String;
    .locals 7

    .line 179
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [C

    .line 180
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_0

    .line 181
    aget-byte v0, p0, v4

    and-int/lit16 v6, v0, 0xff

    .line 182
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lo/fsp;->c:[C

    ushr-int/lit8 v2, v6, 0x4

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 183
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lo/fsp;->c:[C

    and-int/lit8 v2, v6, 0xf

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 180
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 185
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static e([BI)[B
    .locals 3

    .line 65
    array-length v0, p0

    if-ge v0, p1, :cond_0

    .line 66
    return-object p0

    .line 68
    :cond_0
    new-array v2, p1, [B

    .line 69
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    return-object v2
.end method
