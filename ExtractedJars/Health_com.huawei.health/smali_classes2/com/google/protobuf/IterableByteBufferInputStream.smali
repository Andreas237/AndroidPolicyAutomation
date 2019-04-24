.class Lcom/google/protobuf/IterableByteBufferInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private currentAddress:J

.field private currentArray:[B

.field private currentArrayOffset:I

.field private currentByteBuffer:Ljava/nio/ByteBuffer;

.field private currentByteBufferPos:I

.field private currentIndex:I

.field private dataSize:I

.field private hasArray:Z

.field private iterator:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Ljava/nio/ByteBuffer;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Iterable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<Ljava/nio/ByteBuffer;>;)V"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 71
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->iterator:Ljava/util/Iterator;

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->dataSize:I

    .line 73
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/nio/ByteBuffer;

    .line 74
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->dataSize:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->dataSize:I

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentIndex:I

    .line 78
    invoke-direct {p0}, Lcom/google/protobuf/IterableByteBufferInputStream;->getNextByteBuffer()Z

    move-result v0

    if-nez v0, :cond_1

    .line 79
    sget-object v0, Lcom/google/protobuf/Internal;->EMPTY_BYTE_BUFFER:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentIndex:I

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    .line 82
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentAddress:J

    .line 84
    :cond_1
    return-void
.end method

.method private getNextByteBuffer()Z
    .locals 2

    .line 87
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentIndex:I

    .line 88
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->iterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    const/4 v0, 0x0

    return v0

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->iterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    .line 92
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    .line 93
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->hasArray:Z

    .line 95
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArray:[B

    .line 96
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArrayOffset:I

    goto :goto_0

    .line 98
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->hasArray:Z

    .line 99
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/google/protobuf/UnsafeUtil;->addressOffset(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentAddress:J

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArray:[B

    .line 102
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private updateCurrentByteBufferPos(I)V
    .locals 2

    .line 106
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    .line 107
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    iget-object v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 108
    invoke-direct {p0}, Lcom/google/protobuf/IterableByteBufferInputStream;->getNextByteBuffer()Z

    .line 110
    :cond_0
    return-void
.end method


# virtual methods
.method public read()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 114
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentIndex:I

    iget v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->dataSize:I

    if-ne v0, v1, :cond_0

    .line 115
    const/4 v0, -0x1

    return v0

    .line 117
    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->hasArray:Z

    if-eqz v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArray:[B

    iget v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    iget v2, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArrayOffset:I

    add-int/2addr v1, v2

    aget-byte v0, v0, v1

    and-int/lit16 v4, v0, 0xff

    .line 119
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/protobuf/IterableByteBufferInputStream;->updateCurrentByteBufferPos(I)V

    .line 120
    return v4

    .line 122
    :cond_1
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentAddress:J

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    and-int/lit16 v4, v0, 0xff

    .line 123
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/protobuf/IterableByteBufferInputStream;->updateCurrentByteBufferPos(I)V

    .line 124
    return v4
.end method

.method public read([BII)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 130
    iget v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentIndex:I

    iget v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->dataSize:I

    if-ne v0, v1, :cond_0

    .line 131
    const/4 v0, -0x1

    return v0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    sub-int v3, v0, v1

    .line 134
    if-le p3, v3, :cond_1

    .line 135
    move p3, v3

    .line 137
    :cond_1
    iget-boolean v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->hasArray:Z

    if-eqz v0, :cond_2

    .line 138
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArray:[B

    iget v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    iget v2, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentArrayOffset:I

    add-int/2addr v1, v2

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 140
    invoke-direct {p0, p3}, Lcom/google/protobuf/IterableByteBufferInputStream;->updateCurrentByteBufferPos(I)V

    goto :goto_0

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    .line 143
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBufferPos:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 144
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 145
    iget-object v0, p0, Lcom/google/protobuf/IterableByteBufferInputStream;->currentByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 146
    invoke-direct {p0, p3}, Lcom/google/protobuf/IterableByteBufferInputStream;->updateCurrentByteBufferPos(I)V

    .line 148
    :goto_0
    return p3
.end method
