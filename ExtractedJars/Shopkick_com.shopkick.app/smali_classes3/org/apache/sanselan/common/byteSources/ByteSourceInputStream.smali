.class public Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;
.super Lorg/apache/sanselan/common/byteSources/ByteSource;
.source "ByteSourceInputStream.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;,
        Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    }
.end annotation


# static fields
.field private static final BLOCK_SIZE:I = 0x400


# instance fields
.field private cacheHead:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

.field private final is:Ljava/io/InputStream;

.field private length:Ljava/lang/Long;

.field private readBuffer:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p2}, Lorg/apache/sanselan/common/byteSources/ByteSource;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 27
    iput-object p2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->cacheHead:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    .line 60
    iput-object p2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    .line 188
    iput-object p2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->length:Ljava/lang/Long;

    .line 33
    new-instance p2, Ljava/io/BufferedInputStream;

    invoke-direct {p2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object p2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->is:Ljava/io/InputStream;

    return-void
.end method

.method static synthetic access$000(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBlock()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->getFirstBlock()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object p0

    return-object p0
.end method

.method private getFirstBlock()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->cacheHead:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v0, :cond_0

    .line 89
    invoke-direct {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBlock()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->cacheHead:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    .line 90
    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->cacheHead:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    return-object v0
.end method

.method private readBlock()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    const/16 v1, 0x400

    if-nez v0, :cond_0

    .line 65
    new-array v0, v1, [B

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    .line 67
    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->is:Ljava/io/InputStream;

    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge v0, v2, :cond_1

    return-object v3

    :cond_1
    if-ge v0, v1, :cond_2

    .line 73
    new-array v1, v0, [B

    .line 74
    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 75
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-direct {v0, p0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;[B)V

    return-object v0

    .line 80
    :cond_2
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    .line 81
    iput-object v3, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->readBuffer:[B

    .line 82
    new-instance v1, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-direct {v1, p0, v0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;[B)V

    return-object v1
.end method


# virtual methods
.method public getAll()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 206
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 208
    invoke-direct {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->getFirstBlock()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_0

    .line 211
    iget-object v2, v1, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 212
    invoke-virtual {v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->getNext()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v1

    goto :goto_0

    .line 214
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getBlock(II)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 172
    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    int-to-long v1, p1

    .line 173
    invoke-virtual {v0, v1, v2}, Ljava/io/InputStream;->skip(J)J

    .line 175
    new-array p1, p2, [B

    const/4 v1, 0x0

    .line 179
    :cond_0
    array-length v2, p1

    sub-int/2addr v2, v1

    invoke-virtual {v0, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_1

    add-int/2addr v1, v2

    if-lt v1, p2, :cond_0

    return-object p1

    .line 181
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Could not read block."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 2

    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Inputstream: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->filename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 167
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$1;)V

    return-object v0
.end method

.method public getLength()J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->length:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 193
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 195
    :cond_0
    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    :goto_0
    const-wide/16 v5, 0x400

    .line 198
    invoke-virtual {v0, v5, v6}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-lez v7, :cond_1

    add-long/2addr v3, v5

    goto :goto_0

    .line 200
    :cond_1
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v3, v4}, Ljava/lang/Long;-><init>(J)V

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->length:Ljava/lang/Long;

    return-wide v3
.end method
