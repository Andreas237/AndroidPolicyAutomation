.class public final Lo/fpp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:B

.field private final d:Ljava/io/ByteArrayOutputStream;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lo/fpp;->d:Ljava/io/ByteArrayOutputStream;

    .line 45
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/fpp;->b:B

    .line 46
    const/4 v0, 0x7

    iput v0, p0, Lo/fpp;->e:I

    .line 47
    return-void
.end method

.method private a()V
    .locals 2

    .line 185
    iget v0, p0, Lo/fpp;->e:I

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    .line 187
    iget-object v0, p0, Lo/fpp;->d:Ljava/io/ByteArrayOutputStream;

    iget-byte v1, p0, Lo/fpp;->b:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 189
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/fpp;->b:B

    .line 190
    const/4 v0, 0x7

    iput v0, p0, Lo/fpp;->e:I

    .line 192
    :cond_0
    return-void
.end method


# virtual methods
.method public b(B)V
    .locals 2

    .line 153
    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    invoke-virtual {p0, v0}, Lo/fpp;->e([B)V

    .line 154
    return-void
.end method

.method public b(JI)V
    .locals 7

    .line 62
    const/16 v0, 0x20

    if-ge p3, v0, :cond_0

    const/4 v0, 0x1

    shl-int/2addr v0, p3

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 63
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Truncating value %d to %d-bit integer"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_0
    add-int/lit8 v5, p3, -0x1

    :goto_0
    if-ltz v5, :cond_4

    .line 69
    shr-long v0, p1, v5

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 70
    :goto_1
    if-eqz v6, :cond_2

    .line 72
    iget-byte v0, p0, Lo/fpp;->b:B

    iget v1, p0, Lo/fpp;->e:I

    const/4 v2, 0x1

    shl-int v1, v2, v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    iput-byte v0, p0, Lo/fpp;->b:B

    .line 76
    :cond_2
    iget v0, p0, Lo/fpp;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fpp;->e:I

    .line 79
    iget v0, p0, Lo/fpp;->e:I

    if-gez v0, :cond_3

    .line 80
    invoke-direct {p0}, Lo/fpp;->a()V

    .line 66
    :cond_3
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 83
    :cond_4
    return-void
.end method

.method public c(II)V
    .locals 7

    .line 96
    const/16 v0, 0x20

    if-ge p2, v0, :cond_0

    const/4 v0, 0x1

    shl-int/2addr v0, p2

    if-lt p1, v0, :cond_0

    .line 97
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Truncating value %d to %d-bit integer"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_0
    add-int/lit8 v5, p2, -0x1

    :goto_0
    if-ltz v5, :cond_4

    .line 103
    shr-int v0, p1, v5

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 104
    :goto_1
    if-eqz v6, :cond_2

    .line 106
    iget-byte v0, p0, Lo/fpp;->b:B

    iget v1, p0, Lo/fpp;->e:I

    const/4 v2, 0x1

    shl-int v1, v2, v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    iput-byte v0, p0, Lo/fpp;->b:B

    .line 110
    :cond_2
    iget v0, p0, Lo/fpp;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fpp;->e:I

    .line 113
    iget v0, p0, Lo/fpp;->e:I

    if-gez v0, :cond_3

    .line 114
    invoke-direct {p0}, Lo/fpp;->a()V

    .line 100
    :cond_3
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 117
    :cond_4
    return-void
.end method

.method public e([B)V
    .locals 4

    .line 128
    if-nez p1, :cond_0

    .line 129
    return-void

    .line 132
    :cond_0
    iget v0, p0, Lo/fpp;->e:I

    const/4 v1, 0x7

    if-ge v0, v1, :cond_2

    .line 134
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_1

    .line 135
    aget-byte v0, p1, v3

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Lo/fpp;->c(II)V

    .line 134
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 142
    :cond_2
    iget-object v0, p0, Lo/fpp;->d:Ljava/io/ByteArrayOutputStream;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 144
    :goto_1
    return-void
.end method

.method public e()[B
    .locals 2

    .line 166
    invoke-direct {p0}, Lo/fpp;->a()V

    .line 169
    iget-object v0, p0, Lo/fpp;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 172
    iget-object v0, p0, Lo/fpp;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 175
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 196
    iget-object v0, p0, Lo/fpp;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    .line 197
    if-eqz v4, :cond_2

    array-length v0, v4

    if-eqz v0, :cond_2

    .line 199
    new-instance v5, Ljava/lang/StringBuilder;

    array-length v0, v4

    mul-int/lit8 v0, v0, 0x3

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 200
    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v6, v0, :cond_1

    .line 201
    const-string v0, "%02X"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aget-byte v2, v4, v6

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    if-ge v6, v0, :cond_0

    .line 204
    const/16 v0, 0x20

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 200
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 207
    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 209
    :cond_2
    const-string v0, "--"

    return-object v0
.end method
