.class public Lcom/usebutton/thirdparty/com/squareup/QueueFile;
.super Ljava/lang/Object;
.source "QueueFile.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;,
        Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;,
        Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;,
        Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;
    }
.end annotation


# static fields
.field static final HEADER_LENGTH:I = 0x10

.field private static final INITIAL_LENGTH:I = 0x1000

.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final ZEROES:[B


# instance fields
.field private final buffer:[B

.field private elementCount:I

.field fileLength:I

.field private first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

.field private last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

.field final raf:Ljava/io/RandomAccessFile;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const-class v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->LOGGER:Ljava/util/logging/Logger;

    const/16 v0, 0x1000

    .line 58
    new-array v0, v0, [B

    sput-object v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ZEROES:[B

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 103
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    .line 110
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    invoke-static {p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->initialize(Ljava/io/File;)V

    .line 113
    :cond_0
    invoke-static {p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->open(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    .line 114
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readHeader()V

    return-void
.end method

.method constructor <init>(Ljava/io/RandomAccessFile;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 103
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    .line 118
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    .line 119
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readHeader()V

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/thirdparty/com/squareup/QueueFile;I)I
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/usebutton/thirdparty/com/squareup/QueueFile;I[BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringRead(I[BII)V

    return-void
.end method

.method private expandIfNecessary(I)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    add-int/lit8 p1, p1, 0x4

    .line 350
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->remainingBytes()I

    move-result v0

    if-lt v0, p1, :cond_0

    return-void

    .line 354
    :cond_0
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    :cond_1
    add-int/2addr v0, v1

    shl-int/lit8 v1, v1, 0x1

    if-lt v0, p1, :cond_1

    .line 363
    invoke-direct {p0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->setLength(I)V

    .line 366
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget p1, p1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/lit8 p1, p1, 0x4

    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    add-int/2addr p1, v0

    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result p1

    .line 369
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    const/16 v2, 0x10

    if-gt p1, v0, :cond_3

    .line 370
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v8

    .line 371
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    int-to-long v3, v0

    invoke-virtual {v8, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    sub-int/2addr p1, v2

    const-wide/16 v4, 0x10

    int-to-long v9, p1

    move-object v3, v8

    move-wide v6, v9

    .line 373
    invoke-virtual/range {v3 .. v8}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    move-result-wide v3

    cmp-long v0, v3, v9

    if-nez v0, :cond_2

    .line 376
    invoke-direct {p0, v2, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringErase(II)V

    goto :goto_0

    .line 374
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Copied insufficient number of bytes!"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 380
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget p1, p1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    if-ge p1, v0, :cond_4

    .line 381
    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/2addr p1, v0

    sub-int/2addr p1, v2

    .line 382
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    invoke-direct {p0, v1, v0, v2, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeHeader(IIII)V

    .line 383
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    invoke-direct {v0, p1, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;-><init>(II)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    goto :goto_1

    .line 385
    :cond_4
    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    invoke-direct {p0, v1, p1, v0, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeHeader(IIII)V

    .line 388
    :goto_1
    iput v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    return-void
.end method

.method private static initialize(Ljava/io/File;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".tmp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 185
    invoke-static {v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->open(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v1

    const-wide/16 v2, 0x1000

    .line 187
    :try_start_0
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->setLength(J)V

    const-wide/16 v2, 0x0

    .line 188
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v2, 0x10

    .line 189
    new-array v2, v2, [B

    const/4 v3, 0x0

    const/16 v4, 0x1000

    .line 190
    invoke-static {v2, v3, v4}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeInt([BII)V

    .line 191
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 197
    invoke-virtual {v0, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 198
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Rename failed!"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 193
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    throw p0
.end method

.method private static open(Ljava/io/File;)Ljava/io/RandomAccessFile;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 204
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rwd"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private readElement(I)Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 176
    sget-object p1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->NULL:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    return-object p1

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringRead(I[BII)V

    .line 178
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    invoke-static {v0, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readInt([BI)I

    move-result v0

    .line 179
    new-instance v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    invoke-direct {v1, p1, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;-><init>(II)V

    return-object v1
.end method

.method private readHeader()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 143
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 144
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readInt([BI)I

    move-result v0

    iput v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    .line 145
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    int-to-long v0, v0

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 148
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    if-lez v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readInt([BI)I

    move-result v0

    iput v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    .line 153
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readInt([BI)I

    move-result v0

    .line 154
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/16 v2, 0xc

    invoke-static {v1, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readInt([BI)I

    move-result v1

    .line 155
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readElement(I)Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    .line 156
    invoke-direct {p0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readElement(I)Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    return-void

    .line 149
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "File is corrupt; length stored in header ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") is invalid."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 146
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "File is truncated. Expected length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", Actual length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    .line 147
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static readInt([BI)I
    .locals 2

    .line 135
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    add-int/2addr v0, p0

    return v0
.end method

.method private remainingBytes()I
    .locals 2

    .line 335
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->usedBytes()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private ringErase(II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    if-lez p2, :cond_0

    .line 239
    sget-object v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ZEROES:[B

    array-length v0, v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 240
    sget-object v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ZEROES:[B

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringWrite(I[BII)V

    sub-int/2addr p2, v0

    add-int/2addr p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ringRead(I[BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 254
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result p1

    add-int v0, p1, p4

    .line 255
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    if-gt v0, v1, :cond_0

    .line 256
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 257
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p1

    .line 262
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 263
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 264
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x10

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 265
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V

    :goto_0
    return-void
.end method

.method private ringWrite(I[BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 222
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result p1

    add-int v0, p1, p4

    .line 223
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    if-gt v0, v1, :cond_0

    .line 224
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 225
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->write([BII)V

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p1

    .line 230
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 231
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, v1}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 232
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x10

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 233
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->write([BII)V

    :goto_0
    return-void
.end method

.method private setLength(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 394
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 395
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    return-void
.end method

.method private usedBytes()I
    .locals 3

    .line 319
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    const/16 v1, 0x10

    if-nez v0, :cond_0

    return v1

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    if-lt v0, v2, :cond_1

    .line 323
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x4

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    add-int/2addr v0, v2

    add-int/2addr v0, v1

    return v0

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v1, v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v1, v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    sub-int/2addr v0, v1

    return v0
.end method

.method private wrapPosition(I)I
    .locals 1

    .line 209
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x10

    sub-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method private writeHeader(IIII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeInt([BII)V

    .line 168
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v0, 0x4

    invoke-static {p1, v0, p2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeInt([BII)V

    .line 169
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/16 p2, 0x8

    invoke-static {p1, p2, p3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeInt([BII)V

    .line 170
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/16 p2, 0xc

    invoke-static {p1, p2, p4}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeInt([BII)V

    .line 171
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    const-wide/16 p2, 0x0

    invoke-virtual {p1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 172
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    iget-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    invoke-virtual {p1, p2}, Ljava/io/RandomAccessFile;->write([B)V

    return-void
.end method

.method public static writeInt([BII)V
    .locals 2

    shr-int/lit8 v0, p2, 0x18

    int-to-byte v0, v0

    .line 127
    aput-byte v0, p0, p1

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    .line 128
    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 129
    aput-byte v1, p0, v0

    add-int/lit8 p1, p1, 0x3

    int-to-byte p2, p2

    .line 130
    aput-byte p2, p0, p1

    return-void
.end method


# virtual methods
.method public add([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 275
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->add([BII)V

    return-void
.end method

.method public declared-synchronized add([BII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_4

    or-int v0, p2, p3

    if-ltz v0, :cond_3

    .line 291
    :try_start_0
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_3

    .line 295
    invoke-direct {p0, p3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->expandIfNecessary(I)V

    .line 298
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->isEmpty()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    const/16 v2, 0x10

    goto :goto_0

    .line 299
    :cond_0
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/2addr v2, v1

    iget-object v3, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v3, v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    add-int/2addr v2, v3

    .line 300
    invoke-direct {p0, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result v2

    .line 301
    :goto_0
    new-instance v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    invoke-direct {v3, v2, p3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;-><init>(II)V

    .line 304
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v4, 0x0

    invoke-static {v2, v4, p3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeInt([BII)V

    .line 305
    iget v2, v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    iget-object v5, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    invoke-direct {p0, v2, v5, v4, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringWrite(I[BII)V

    .line 308
    iget v2, v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/2addr v2, v1

    invoke-direct {p0, v2, p1, p2, p3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringWrite(I[BII)V

    if-eqz v0, :cond_1

    .line 311
    iget p1, v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget p1, p1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    .line 312
    :goto_1
    iget p2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    iget p3, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    add-int/lit8 p3, p3, 0x1

    iget v1, v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    invoke-direct {p0, p2, p3, p1, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeHeader(IIII)V

    .line 313
    iput-object v3, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    .line 314
    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    if-eqz v0, :cond_2

    .line 315
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    :cond_2
    monitor-exit p0

    return-void

    .line 292
    :cond_3
    :try_start_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 289
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "data == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized clear()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    const/16 v0, 0x1000

    const/4 v1, 0x0

    .line 556
    :try_start_0
    invoke-direct {p0, v0, v1, v1, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeHeader(IIII)V

    .line 559
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    const-wide/16 v3, 0x10

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 560
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    sget-object v3, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ZEROES:[B

    const/16 v4, 0xff0

    invoke-virtual {v2, v3, v1, v4}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 562
    iput v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    .line 563
    sget-object v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->NULL:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iput-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    .line 564
    sget-object v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->NULL:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iput-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    .line 565
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    if-le v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->setLength(I)V

    .line 566
    :cond_0
    iput v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 567
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 571
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 572
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 448
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    const/4 v1, 0x0

    .line 449
    :goto_0
    iget v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    if-ge v1, v2, :cond_1

    .line 450
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readElement(I)Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    move-result-object v0

    .line 451
    new-instance v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;-><init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;)V

    iget v3, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    invoke-interface {p1, v2, v3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;->read(Ljava/io/InputStream;I)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 453
    monitor-exit p0

    return v1

    .line 455
    :cond_0
    :try_start_1
    iget v2, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/lit8 v2, v2, 0x4

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    add-int/2addr v2, v0

    invoke-direct {p0, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 457
    :cond_1
    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    monitor-enter p0

    .line 432
    :try_start_0
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;-><init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;)V

    invoke-virtual {p0, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized isEmpty()Z
    .locals 1

    monitor-enter p0

    .line 340
    :try_start_0
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized peek(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    monitor-enter p0

    .line 413
    :try_start_0
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    if-lez v0, :cond_0

    .line 414
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;-><init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;)V

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v1, v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    invoke-interface {p1, v0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;->read(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 416
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized peek(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 420
    :try_start_0
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    if-lez v0, :cond_0

    .line 421
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;-><init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;)V

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v1, v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    invoke-interface {p1, v0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;->read(Ljava/io/InputStream;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized peek()[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 400
    :try_start_0
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    .line 401
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    .line 402
    new-array v1, v0, [B

    .line 403
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/lit8 v2, v2, 0x4

    const/4 v3, 0x0

    invoke-direct {p0, v2, v1, v3, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringRead(I[BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 404
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized remove()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x1

    .line 504
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->remove(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 505
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized remove(I)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 513
    :try_start_0
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_5

    if-ltz p1, :cond_4

    if-nez p1, :cond_0

    .line 520
    monitor-exit p0

    return-void

    .line 522
    :cond_0
    :try_start_1
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    if-ne p1, v0, :cond_1

    .line 523
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 524
    monitor-exit p0

    return-void

    .line 526
    :cond_1
    :try_start_2
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    if-gt p1, v0, :cond_3

    .line 531
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    .line 535
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v1, v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    .line 536
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v2, v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    const/4 v3, 0x0

    move v5, v1

    move v4, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    add-int/lit8 v6, v4, 0x4

    add-int/2addr v2, v6

    add-int/lit8 v5, v5, 0x4

    add-int/2addr v5, v4

    .line 539
    invoke-direct {p0, v5}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->wrapPosition(I)I

    move-result v5

    .line 540
    iget-object v4, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    const/4 v6, 0x4

    invoke-direct {p0, v5, v4, v3, v6}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringRead(I[BII)V

    .line 541
    iget-object v4, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->buffer:[B

    invoke-static {v4, v3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->readInt([BI)I

    move-result v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 545
    :cond_2
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    iget v3, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    sub-int/2addr v3, p1

    iget-object v6, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    iget v6, v6, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    invoke-direct {p0, v1, v3, v5, v6}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->writeHeader(IIII)V

    .line 546
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    sub-int/2addr v1, p1

    iput v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    .line 547
    new-instance p1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    invoke-direct {p1, v5, v4}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;-><init>(II)V

    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    .line 550
    invoke-direct {p0, v0, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->ringErase(II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 551
    monitor-exit p0

    return-void

    .line 527
    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot remove more elements ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") than present in queue ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 517
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot remove negative ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") number of elements."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 514
    :cond_5
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized size()I
    .locals 1

    monitor-enter p0

    .line 495
    :try_start_0
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 575
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 576
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "fileLength="

    .line 577
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->fileLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    .line 578
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->elementCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", first="

    .line 579
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->first:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", last="

    .line 580
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->last:Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", element lengths=["

    .line 581
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    :try_start_0
    new-instance v1, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;

    invoke-direct {v1, p0, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;-><init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 596
    sget-object v2, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->LOGGER:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v4, "read error"

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const-string v1, "]]"

    .line 598
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
