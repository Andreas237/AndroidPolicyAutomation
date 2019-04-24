.class public final Lcom/newrelic/mobile/fbs/RequestInformation;
.super Lcom/newrelic/com/google/flatbuffers/Table;
.source "RequestInformation.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/newrelic/com/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static addRequestAddress(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 1

    long-to-int p2, p1

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, p1, p2, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public static addRequestTimestampMs(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 32
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static createRequestInformation(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;JJ)I
    .locals 1

    const/4 v0, 0x2

    .line 25
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    .line 26
    invoke-static {p0, p1, p2}, Lcom/newrelic/mobile/fbs/RequestInformation;->addRequestTimestampMs(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 27
    invoke-static {p0, p3, p4}, Lcom/newrelic/mobile/fbs/RequestInformation;->addRequestAddress(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 28
    invoke-static {p0}, Lcom/newrelic/mobile/fbs/RequestInformation;->endRequestInformation(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endRequestInformation(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    .line 35
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endObject()I

    move-result p0

    return p0
.end method

.method public static getRootAsRequestInformation(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/RequestInformation;
    .locals 1

    .line 12
    new-instance v0, Lcom/newrelic/mobile/fbs/RequestInformation;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/RequestInformation;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/mobile/fbs/RequestInformation;->getRootAsRequestInformation(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/RequestInformation;)Lcom/newrelic/mobile/fbs/RequestInformation;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsRequestInformation(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/RequestInformation;)Lcom/newrelic/mobile/fbs/RequestInformation;
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

    invoke-virtual {p1, v0, p0}, Lcom/newrelic/mobile/fbs/RequestInformation;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/RequestInformation;

    move-result-object p0

    return-object p0
.end method

.method public static startRequestInformation(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x2

    .line 31
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/RequestInformation;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/mobile/fbs/RequestInformation;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb_pos:I

    iput-object p2, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public mutateRequestAddress(J)Z
    .locals 3

    const/4 v0, 0x6

    .line 20
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/RequestInformation;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb_pos:I

    add-int/2addr v0, v2

    long-to-int p2, p1

    invoke-virtual {v1, v0, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateRequestTimestampMs(J)Z
    .locals 3

    const/4 v0, 0x4

    .line 18
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/RequestInformation;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public requestAddress()J
    .locals 4

    const/4 v0, 0x6

    .line 19
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/RequestInformation;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public requestTimestampMs()J
    .locals 3

    const/4 v0, 0x4

    .line 17
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/RequestInformation;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/RequestInformation;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method
