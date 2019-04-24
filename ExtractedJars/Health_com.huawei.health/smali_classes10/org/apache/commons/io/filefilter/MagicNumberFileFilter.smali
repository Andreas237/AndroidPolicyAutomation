.class public Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;
.super Lorg/apache/commons/io/filefilter/AbstractFileFilter;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x799f06c25c62aacL


# instance fields
.field private final byteOffset:J

.field private final magicNumbers:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 137
    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;-><init>(Ljava/lang/String;J)V

    .line 138
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 2

    .line 160
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;-><init>()V

    .line 161
    if-nez p1, :cond_0

    .line 162
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The magic number cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 164
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The magic number must contain at least one byte"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_2

    .line 168
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The offset cannot be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_2
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 173
    iput-wide p2, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    .line 174
    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 112
    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;-><init>([BJ)V

    .line 113
    return-void
.end method

.method public constructor <init>([BJ)V
    .locals 4

    .line 200
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;-><init>()V

    .line 201
    if-nez p1, :cond_0

    .line 202
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The magic number cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 205
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The magic number must contain at least one byte"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_2

    .line 208
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The offset cannot be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :cond_2
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 212
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 213
    iput-wide p2, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    .line 214
    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 10

    .line 234
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 236
    :try_start_0
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v0, "r"

    invoke-direct {v2, p1, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x0

    .line 237
    :try_start_1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    array-length v0, v0

    new-array v4, v0, [B

    .line 238
    iget-wide v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    invoke-virtual {v2, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 239
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v5

    .line 240
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    array-length v0, v0
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v5, v0, :cond_1

    .line 241
    const/4 v6, 0x0

    .line 244
    if-eqz v2, :cond_0

    nop

    :try_start_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 241
    :cond_0
    return v6

    .line 243
    :cond_1
    :try_start_3
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    invoke-static {v0, v4}, Ljava/util/Arrays;->equals([B[B)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v6

    .line 244
    if-eqz v2, :cond_2

    nop

    :try_start_4
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 243
    :cond_2
    return v6

    .line 236
    :catch_0
    move-exception v4

    move-object v3, v4

    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 244
    :catchall_0
    move-exception v8

    if-eqz v2, :cond_4

    if-eqz v3, :cond_3

    :try_start_6
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_0

    :catch_1
    move-exception v9

    :try_start_7
    invoke-virtual {v3, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    :cond_4
    :goto_0
    throw v8
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 246
    :catch_2
    move-exception v2

    .line 251
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 262
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    const-string v0, "("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    iget-wide v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 268
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
