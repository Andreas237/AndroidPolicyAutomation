.class public Lorg/apache/sanselan/common/BitInputStreamFlexible;
.super Ljava/io/InputStream;
.source "BitInputStreamFlexible.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private bytesRead:J

.field private cache:I

.field private cacheBitsRemaining:I

.field private final is:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    const-wide/16 v0, 0x0

    .line 45
    iput-wide v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->bytesRead:J

    .line 32
    iput-object p1, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->is:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public flushCache()V
    .locals 1

    const/4 v0, 0x0

    .line 107
    iput v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    return-void
.end method

.method public getBytesRead()J
    .locals 2

    .line 112
    iget-wide v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->bytesRead:J

    return-wide v0
.end method

.method public read()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 38
    iget v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    if-gtz v0, :cond_0

    .line 40
    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0

    .line 39
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "BitInputStream: incomplete bit read"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final readBits(I)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x20

    if-gt p1, v0, :cond_6

    .line 55
    iget v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_1

    if-lt p1, v0, :cond_0

    shl-int v3, v2, v0

    sub-int/2addr v3, v2

    .line 59
    iget v4, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    and-int/2addr v3, v4

    sub-int/2addr p1, v0

    .line 61
    iput v1, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    move v1, v3

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p1

    .line 66
    iput v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    shl-int p1, v2, p1

    sub-int/2addr p1, v2

    .line 67
    iget v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    iget v3, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    shr-int/2addr v0, v3

    and-int/2addr p1, v0

    move v8, v1

    move v1, p1

    move p1, v8

    :cond_1
    :goto_0
    const-wide/16 v3, 0x1

    const/16 v0, 0x8

    if-lt p1, v0, :cond_3

    .line 73
    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    .line 74
    iget v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    if-ltz v0, :cond_2

    .line 76
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "cache 1: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    .line 77
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    .line 78
    invoke-static {v6}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 76
    invoke-virtual {v0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 79
    iget-wide v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->bytesRead:J

    add-long/2addr v5, v3

    iput-wide v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->bytesRead:J

    shl-int/lit8 v0, v1, 0x8

    .line 80
    iget v1, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v1, v0

    add-int/lit8 p1, p1, -0x8

    goto :goto_0

    .line 75
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "couldn\'t read bits"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-lez p1, :cond_5

    .line 85
    iget-object v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->is:Ljava/io/InputStream;

    invoke-virtual {v5}, Ljava/io/InputStream;->read()I

    move-result v5

    iput v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    .line 86
    iget v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    if-ltz v5, :cond_4

    .line 88
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "cache 2: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " ("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    .line 89
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    .line 90
    invoke-static {v7}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 88
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 91
    iget-wide v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->bytesRead:J

    add-long/2addr v5, v3

    iput-wide v5, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->bytesRead:J

    sub-int/2addr v0, p1

    .line 92
    iput v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    shl-int v0, v1, p1

    shl-int p1, v2, p1

    sub-int/2addr p1, v2

    .line 93
    iget v1, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cache:I

    iget v2, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->cacheBitsRemaining:I

    shr-int/2addr v1, v2

    and-int/2addr p1, v1

    or-int v1, v0, p1

    goto :goto_1

    .line 87
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "couldn\'t read bits"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    return v1

    .line 101
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "BitInputStream: unknown error"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
