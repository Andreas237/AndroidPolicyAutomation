.class public final Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;
.super Lcom/google/dexmaker/dx/io/instructions/BaseCodeCursor;
.source "ShortArrayCodeOutput.java"

# interfaces
.implements Lcom/google/dexmaker/dx/io/instructions/CodeOutput;


# instance fields
.field private final array:[S


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/google/dexmaker/dx/io/instructions/BaseCodeCursor;-><init>()V

    if-ltz p1, :cond_0

    .line 37
    new-array p1, p1, [S

    iput-object p1, p0, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->array:[S

    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxSize < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getArray()[S
    .locals 4

    .line 45
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->cursor()I

    move-result v0

    .line 47
    iget-object v1, p0, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->array:[S

    array-length v2, v1

    if-ne v0, v2, :cond_0

    return-object v1

    .line 51
    :cond_0
    new-array v2, v0, [S

    const/4 v3, 0x0

    .line 52
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public write(S)V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->array:[S

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->cursor()I

    move-result v1

    aput-short p1, v0, v1

    const/4 p1, 0x1

    .line 59
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->advance(I)V

    return-void
.end method

.method public write(SS)V
    .locals 0

    .line 64
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 65
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    return-void
.end method

.method public write(SSS)V
    .locals 0

    .line 70
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 71
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 72
    invoke-virtual {p0, p3}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    return-void
.end method

.method public write(SSSS)V
    .locals 0

    .line 77
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 78
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 79
    invoke-virtual {p0, p3}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 80
    invoke-virtual {p0, p4}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    return-void
.end method

.method public write(SSSSS)V
    .locals 0

    .line 85
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 86
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 87
    invoke-virtual {p0, p3}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 88
    invoke-virtual {p0, p4}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    .line 89
    invoke-virtual {p0, p5}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    return-void
.end method

.method public write([B)V
    .locals 7

    .line 110
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    move v4, v1

    move v3, v2

    move v5, v3

    :goto_0
    if-ge v3, v0, :cond_1

    aget-byte v6, p1, v3

    if-eqz v4, :cond_0

    and-int/lit16 v4, v6, 0xff

    move v5, v4

    move v4, v2

    goto :goto_1

    :cond_0
    shl-int/lit8 v4, v6, 0x8

    or-int/2addr v4, v5

    int-to-short v5, v4

    .line 116
    invoke-virtual {p0, v5}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    move v5, v4

    move v4, v1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    int-to-short p1, v5

    .line 122
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    :cond_2
    return-void
.end method

.method public write([I)V
    .locals 3

    .line 135
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 136
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->writeInt(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public write([J)V
    .locals 4

    .line 142
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-wide v2, p1, v1

    .line 143
    invoke-virtual {p0, v2, v3}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->writeLong(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public write([S)V
    .locals 3

    .line 128
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-short v2, p1, v1

    .line 129
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public writeInt(I)V
    .locals 1

    int-to-short v0, p1

    .line 94
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    shr-int/lit8 p1, p1, 0x10

    int-to-short p1, p1

    .line 95
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    return-void
.end method

.method public writeLong(J)V
    .locals 2

    long-to-int v0, p1

    int-to-short v0, v0

    .line 100
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    const/16 v0, 0x10

    shr-long v0, p1, v0

    long-to-int v0, v0

    int-to-short v0, v0

    .line 101
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    int-to-short v0, v0

    .line 102
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    const/16 v0, 0x30

    shr-long/2addr p1, v0

    long-to-int p1, p1

    int-to-short p1, p1

    .line 103
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeOutput;->write(S)V

    return-void
.end method
