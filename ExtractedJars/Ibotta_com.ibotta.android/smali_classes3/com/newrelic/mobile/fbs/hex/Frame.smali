.class public final Lcom/newrelic/mobile/fbs/hex/Frame;
.super Lcom/newrelic/com/google/flatbuffers/Table;
.source "Frame.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/newrelic/com/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static addAddress(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x5

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 53
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addClassName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 49
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFileName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 51
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addLineNumber(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x4

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 52
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addMethodName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 50
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addValue(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, v0, p1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createFrame(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;IIIIJJ)I
    .locals 1

    const/4 v0, 0x6

    .line 37
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    .line 38
    invoke-static {p0, p7, p8}, Lcom/newrelic/mobile/fbs/hex/Frame;->addAddress(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 39
    invoke-static {p0, p5, p6}, Lcom/newrelic/mobile/fbs/hex/Frame;->addLineNumber(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 40
    invoke-static {p0, p4}, Lcom/newrelic/mobile/fbs/hex/Frame;->addFileName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 41
    invoke-static {p0, p3}, Lcom/newrelic/mobile/fbs/hex/Frame;->addMethodName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 42
    invoke-static {p0, p2}, Lcom/newrelic/mobile/fbs/hex/Frame;->addClassName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 43
    invoke-static {p0, p1}, Lcom/newrelic/mobile/fbs/hex/Frame;->addValue(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 44
    invoke-static {p0}, Lcom/newrelic/mobile/fbs/hex/Frame;->endFrame(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endFrame(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    .line 55
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endObject()I

    move-result p0

    return p0
.end method

.method public static getRootAsFrame(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Frame;
    .locals 1

    .line 12
    new-instance v0, Lcom/newrelic/mobile/fbs/hex/Frame;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/hex/Frame;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->getRootAsFrame(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/hex/Frame;)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsFrame(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/hex/Frame;)Lcom/newrelic/mobile/fbs/hex/Frame;
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

    invoke-virtual {p1, v0, p0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object p0

    return-object p0
.end method

.method public static startFrame(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x6

    .line 47
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/hex/Frame;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/mobile/fbs/hex/Frame;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    iput-object p2, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public address()J
    .locals 3

    const/16 v0, 0xe

    .line 27
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public className()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x6

    .line 19
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public classNameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/Frame;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public fileName()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xa

    .line 23
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public fileNameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0xa

    const/4 v1, 0x1

    .line 24
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/Frame;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public lineNumber()J
    .locals 3

    const/16 v0, 0xc

    .line 25
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public methodName()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x8

    .line 21
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public methodNameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/Frame;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public mutateAddress(J)Z
    .locals 3

    const/16 v0, 0xe

    .line 28
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateLineNumber(J)Z
    .locals 3

    const/16 v0, 0xc

    .line 26
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public value()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x4

    .line 17
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/hex/Frame;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/hex/Frame;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public valueAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x1

    .line 18
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/hex/Frame;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method
