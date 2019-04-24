.class public final Lcom/newrelic/mobile/fbs/hex/Thread;
.super Lcom/newrelic/com/google/flatbuffers/Table;
.source "Thread.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/newrelic/com/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static addFrames(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0, p1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createFramesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2

    .line 30
    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p0

    return p0
.end method

.method public static createThread(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)I
    .locals 1

    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    .line 24
    invoke-static {p0, p1}, Lcom/newrelic/mobile/fbs/hex/Thread;->addFrames(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 25
    invoke-static {p0}, Lcom/newrelic/mobile/fbs/hex/Thread;->endThread(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endThread(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    .line 33
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endObject()I

    move-result p0

    return p0
.end method

.method public static getRootAsThread(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Thread;
    .locals 1

    .line 12
    new-instance v0, Lcom/newrelic/mobile/fbs/hex/Thread;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/hex/Thread;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Thread;->getRootAsThread(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/hex/Thread;)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsThread(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/hex/Thread;)Lcom/newrelic/mobile/fbs/hex/Thread;
    .locals 2

    .line 13
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0, p0}, Lcom/newrelic/mobile/fbs/hex/Thread;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static startFramesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    .line 31
    invoke-virtual {p0, v0, p1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startThread(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x1

    .line 28
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Thread;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/mobile/fbs/hex/Thread;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/newrelic/mobile/fbs/hex/Thread;->bb_pos:I

    iput-object p2, p0, Lcom/newrelic/mobile/fbs/hex/Thread;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public frames(I)Lcom/newrelic/mobile/fbs/hex/Frame;
    .locals 1

    .line 17
    new-instance v0, Lcom/newrelic/mobile/fbs/hex/Frame;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/hex/Frame;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/newrelic/mobile/fbs/hex/Thread;->frames(Lcom/newrelic/mobile/fbs/hex/Frame;I)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object p1

    return-object p1
.end method

.method public frames(Lcom/newrelic/mobile/fbs/hex/Frame;I)Lcom/newrelic/mobile/fbs/hex/Frame;
    .locals 2

    const/4 v0, 0x4

    .line 18
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Thread;->__offset(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/newrelic/mobile/fbs/hex/Thread;->__vector(I)I

    move-result v1

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v1, p2

    invoke-virtual {p0, v1}, Lcom/newrelic/mobile/fbs/hex/Thread;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/newrelic/mobile/fbs/hex/Thread;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public framesLength()I
    .locals 1

    const/4 v0, 0x4

    .line 19
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Thread;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Thread;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
