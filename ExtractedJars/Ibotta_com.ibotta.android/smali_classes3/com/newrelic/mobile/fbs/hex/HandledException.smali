.class public final Lcom/newrelic/mobile/fbs/hex/HandledException;
.super Lcom/newrelic/com/google/flatbuffers/Table;
.source "HandledException.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/newrelic/com/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static addAppUuidHigh(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x1

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 63
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addAppUuidLow(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 62
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addCause(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 68
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addLibraries(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 72
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addMessage(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 67
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 66
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addSessionId(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 64
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addThreads(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 69
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addTimestampMs(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x3

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static createHandledException(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;JJIJIIIII)I
    .locals 1

    const/16 v0, 0x9

    .line 48
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    .line 49
    invoke-static {p0, p6, p7}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addTimestampMs(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 50
    invoke-static {p0, p3, p4}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addAppUuidHigh(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 51
    invoke-static {p0, p1, p2}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addAppUuidLow(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 52
    invoke-static {p0, p12}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addLibraries(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 53
    invoke-static {p0, p11}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addThreads(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 54
    invoke-static {p0, p10}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addCause(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 55
    invoke-static {p0, p9}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addMessage(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 56
    invoke-static {p0, p8}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 57
    invoke-static {p0, p5}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addSessionId(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 58
    invoke-static {p0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->endHandledException(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static createLibrariesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2

    .line 73
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

.method public static createThreadsVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2

    .line 70
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

.method public static endHandledException(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    .line 76
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endObject()I

    move-result p0

    return p0
.end method

.method public static finishHandledExceptionBuffer(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 0

    .line 79
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return-void
.end method

.method public static getRootAsHandledException(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/HandledException;
    .locals 1

    .line 12
    new-instance v0, Lcom/newrelic/mobile/fbs/hex/HandledException;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->getRootAsHandledException(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/hex/HandledException;)Lcom/newrelic/mobile/fbs/hex/HandledException;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsHandledException(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/hex/HandledException;)Lcom/newrelic/mobile/fbs/hex/HandledException;
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

    invoke-virtual {p1, v0, p0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/HandledException;

    move-result-object p0

    return-object p0
.end method

.method public static startHandledException(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/16 v0, 0x9

    .line 61
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    return-void
.end method

.method public static startLibrariesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    .line 74
    invoke-virtual {p0, v0, p1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startThreadsVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    .line 71
    invoke-virtual {p0, v0, p1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/HandledException;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    iput-object p2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public appUuidHigh()J
    .locals 3

    const/4 v0, 0x6

    .line 19
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public appUuidLow()J
    .locals 3

    const/4 v0, 0x4

    .line 17
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public cause()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x10

    .line 29
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public causeAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x10

    const/4 v1, 0x1

    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public libraries(I)Lcom/newrelic/mobile/fbs/ios/Library;
    .locals 1

    .line 34
    new-instance v0, Lcom/newrelic/mobile/fbs/ios/Library;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/ios/Library;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->libraries(Lcom/newrelic/mobile/fbs/ios/Library;I)Lcom/newrelic/mobile/fbs/ios/Library;

    move-result-object p1

    return-object p1
.end method

.method public libraries(Lcom/newrelic/mobile/fbs/ios/Library;I)Lcom/newrelic/mobile/fbs/ios/Library;
    .locals 1

    const/16 v0, 0x14

    .line 35
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ios/Library;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public librariesLength()I
    .locals 1

    const/16 v0, 0x14

    .line 36
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public message()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xe

    .line 27
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public messageAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0xe

    const/4 v1, 0x1

    .line 28
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public mutateAppUuidHigh(J)Z
    .locals 3

    const/4 v0, 0x6

    .line 20
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateAppUuidLow(J)Z
    .locals 3

    const/4 v0, 0x4

    .line 18
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateTimestampMs(J)Z
    .locals 3

    const/16 v0, 0xa

    .line 24
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public name()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    .line 25
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public nameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0xc

    const/4 v1, 0x1

    .line 26
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public sessionId()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x8

    .line 21
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public sessionIdAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public threads(I)Lcom/newrelic/mobile/fbs/hex/Thread;
    .locals 1

    .line 31
    new-instance v0, Lcom/newrelic/mobile/fbs/hex/Thread;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/hex/Thread;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threads(Lcom/newrelic/mobile/fbs/hex/Thread;I)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object p1

    return-object p1
.end method

.method public threads(Lcom/newrelic/mobile/fbs/hex/Thread;I)Lcom/newrelic/mobile/fbs/hex/Thread;
    .locals 1

    const/16 v0, 0x12

    .line 32
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/newrelic/mobile/fbs/hex/Thread;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public threadsLength()I
    .locals 1

    const/16 v0, 0x12

    .line 33
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public timestampMs()J
    .locals 3

    const/16 v0, 0xa

    .line 23
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/HandledException;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/HandledException;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method
