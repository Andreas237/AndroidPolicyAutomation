.class public Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/perflib/io/HprofBuffer;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final DEFAULT_PADDING:I = 0x400

.field private static final DEFAULT_SIZE:I = 0x40000000


# instance fields
.field private final mBufferSize:I

.field private final mByteBuffers:[Ljava/nio/ByteBuffer;

.field private mCurrentPosition:J

.field private final mLength:J

.field private final mPadding:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->$assertionsDisabled:Z

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    const/high16 v0, 0x40000000    # 2.0f

    const/16 v1, 0x400

    invoke-direct {p0, p1, v0, v1}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;-><init>(Ljava/io/File;II)V

    .line 83
    return-void
.end method

.method constructor <init>(Ljava/io/File;II)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    move/from16 v0, p2

    iput v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    .line 52
    move/from16 v0, p3

    iput v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mPadding:I

    .line 53
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mLength:J

    .line 54
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mLength:J

    iget v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    add-int/lit8 v7, v0, 0x1

    .line 55
    new-array v0, v7, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    .line 57
    new-instance v8, Ljava/io/FileInputStream;

    move-object/from16 v0, p1

    invoke-direct {v8, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 59
    const-wide/16 v9, 0x0

    .line 60
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v7, :cond_0

    .line 61
    :try_start_0
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mLength:J

    sub-long/2addr v0, v9

    iget v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    iget v3, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mPadding:I

    add-int/2addr v2, v3

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    .line 62
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    sget-object v2, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    move-wide v3, v9

    move-wide v5, v12

    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v1

    aput-object v1, v0, v11

    .line 64
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v11

    sget-object v1, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->HPROF_BYTE_ORDER:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 65
    iget v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    int-to-long v0, v0

    add-long/2addr v9, v0

    .line 60
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 67
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V

    .line 70
    return-void

    .line 69
    :catchall_0
    move-exception v14

    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V

    throw v14
.end method

.method private getIndex()I
    .locals 4

    .line 214
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    iget v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private getOffset()I
    .locals 4

    .line 218
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    iget v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    int-to-long v2, v2

    rem-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 91
    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    array-length v0, v0

    if-ge v1, v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v1

    check-cast v0, Lsun/nio/ch/DirectBuffer;

    invoke-interface {v0}, Lsun/nio/ch/DirectBuffer;->cleaner()Lsun/misc/Cleaner;

    move-result-object v0

    invoke-virtual {v0}, Lsun/misc/Cleaner;->clean()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 96
    :cond_0
    return-void

    .line 94
    .line 97
    :catch_0
    return-void
.end method

.method public hasRemaining()Z
    .locals 4

    .line 205
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    iget-wide v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mLength:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public position()J
    .locals 2

    .line 200
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    return-wide v0
.end method

.method public read([B)V
    .locals 6

    .line 108
    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v4

    .line 109
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v4

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 110
    array-length v0, p1

    iget-object v1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 111
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v4

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 114
    :cond_0
    iget v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    iget-object v1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    sub-int v5, v0, v1

    .line 115
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v4

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 116
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v4, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 117
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v4, 0x1

    aget-object v0, v0, v1

    array-length v1, p1

    sub-int/2addr v1, v5

    invoke-virtual {v0, p1, v5, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 119
    :goto_0
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    array-length v2, p1

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 120
    return-void
.end method

.method public readByte()B
    .locals 5

    .line 101
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    .line 102
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 103
    return v4
.end method

.method public readChar()C
    .locals 5

    .line 153
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getChar(I)C

    move-result v4

    .line 154
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 155
    return v4
.end method

.method public readDouble()D
    .locals 6

    .line 188
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getDouble(I)D

    move-result-wide v4

    .line 189
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x8

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 190
    return-wide v4
.end method

.method public readFloat()F
    .locals 5

    .line 181
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getFloat(I)F

    move-result v4

    .line 182
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 183
    return v4
.end method

.method public readInt()I
    .locals 5

    .line 167
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v4

    .line 168
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 169
    return v4
.end method

.method public readLong()J
    .locals 6

    .line 174
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v4

    .line 175
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x8

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 176
    return-wide v4
.end method

.method public readShort()S
    .locals 5

    .line 160
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v4

    .line 161
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 162
    return v4
.end method

.method public readSubSequence([BII)V
    .locals 11

    .line 124
    sget-boolean v0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    int-to-long v0, p3

    iget-wide v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mLength:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 126
    :cond_0
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 128
    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getIndex()I

    move-result v4

    .line 129
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v4

    invoke-direct {p0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->getOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 130
    array-length v0, p1

    iget-object v1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    if-gt v0, v1, :cond_1

    .line 131
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v4

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    goto/16 :goto_1

    .line 133
    :cond_1
    iget v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    iget-object v1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    sub-int v5, v0, v1

    .line 134
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v4

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 136
    move v6, v5

    .line 137
    sub-int v0, p3, v5

    array-length v1, p1

    sub-int/2addr v1, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 138
    move v7, v0

    iget v1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    div-int v8, v0, v1

    .line 139
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    .line 140
    iget v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mBufferSize:I

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 141
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v4, 0x1

    add-int/2addr v1, v9

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 142
    iget-object v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mByteBuffers:[Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v4, 0x1

    add-int/2addr v1, v9

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, v6, v10}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 143
    add-int/2addr v6, v10

    .line 144
    sub-int/2addr v7, v10

    .line 139
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 148
    :cond_2
    :goto_1
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    array-length v2, p1

    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 149
    return-void
.end method

.method public remaining()J
    .locals 4

    .line 210
    iget-wide v0, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mLength:J

    iget-wide v2, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public setPosition(J)V
    .locals 0

    .line 195
    iput-wide p1, p0, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;->mCurrentPosition:J

    .line 196
    return-void
.end method
