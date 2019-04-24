.class public Lo/fro;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v0}, Lo/fro;-><init>(Ljava/security/SecureRandom;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/security/SecureRandom;)V
    .locals 5

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 51
    const/16 v0, 0x20

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fro;->e:[B

    .line 53
    iget-object v0, p0, Lo/fro;->e:[B

    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 56
    iget-object v0, p0, Lo/fro;->e:[B

    shr-int/lit8 v1, v4, 0x18

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    .line 57
    iget-object v0, p0, Lo/fro;->e:[B

    shr-int/lit8 v1, v4, 0x10

    int-to-byte v1, v1

    const/4 v2, 0x1

    aput-byte v1, v0, v2

    .line 58
    iget-object v0, p0, Lo/fro;->e:[B

    shr-int/lit8 v1, v4, 0x8

    int-to-byte v1, v1

    const/4 v2, 0x2

    aput-byte v1, v0, v2

    .line 59
    iget-object v0, p0, Lo/fro;->e:[B

    int-to-byte v1, v4

    const/4 v2, 0x3

    aput-byte v1, v0, v2

    .line 60
    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    if-nez p1, :cond_0

    .line 71
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Random bytes must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    array-length v0, p1

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    .line 73
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Random bytes array\'s length must be 32"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_1
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fro;->e:[B

    .line 77
    return-void
.end method


# virtual methods
.method public b()[B
    .locals 2

    .line 87
    iget-object v0, p0, Lo/fro;->e:[B

    iget-object v1, p0, Lo/fro;->e:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    .line 92
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    iget-object v0, p0, Lo/fro;->e:[B

    const/4 v1, 0x0

    aget-byte v4, v0, v1

    .line 96
    iget-object v0, p0, Lo/fro;->e:[B

    const/4 v1, 0x1

    aget-byte v5, v0, v1

    .line 97
    iget-object v0, p0, Lo/fro;->e:[B

    const/4 v1, 0x2

    aget-byte v6, v0, v1

    .line 98
    iget-object v0, p0, Lo/fro;->e:[B

    const/4 v1, 0x3

    aget-byte v7, v0, v1

    .line 100
    and-int/lit16 v0, v4, 0xff

    shl-int/lit8 v0, v0, 0x18

    and-int/lit16 v1, v5, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v6, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v7, 0xff

    or-int/2addr v0, v1

    int-to-long v8, v0

    .line 102
    new-instance v10, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v8

    invoke-direct {v10, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 104
    const-string v0, "\t\t\tGMT Unix Time: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    iget-object v0, p0, Lo/fro;->e:[B

    const/4 v1, 0x4

    const/16 v2, 0x20

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v11

    .line 108
    const-string v0, "\t\t\tRandom Bytes: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
