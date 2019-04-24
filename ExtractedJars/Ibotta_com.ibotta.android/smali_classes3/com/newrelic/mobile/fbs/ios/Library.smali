.class public final Lcom/newrelic/mobile/fbs/ios/Library;
.super Lcom/newrelic/com/google/flatbuffers/Table;
.source "Library.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/newrelic/com/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static addAddress(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x2

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 46
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addArch(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    int-to-byte p1, p1

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 48
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public static addUserLibrary(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 47
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addUuidHigh(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x1

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 45
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addUuidLow(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 44
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static createLibrary(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;JJJZI)I
    .locals 1

    const/4 v0, 0x5

    .line 34
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    .line 35
    invoke-static {p0, p5, p6}, Lcom/newrelic/mobile/fbs/ios/Library;->addAddress(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 36
    invoke-static {p0, p3, p4}, Lcom/newrelic/mobile/fbs/ios/Library;->addUuidHigh(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 37
    invoke-static {p0, p1, p2}, Lcom/newrelic/mobile/fbs/ios/Library;->addUuidLow(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 38
    invoke-static {p0, p8}, Lcom/newrelic/mobile/fbs/ios/Library;->addArch(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 39
    invoke-static {p0, p7}, Lcom/newrelic/mobile/fbs/ios/Library;->addUserLibrary(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 40
    invoke-static {p0}, Lcom/newrelic/mobile/fbs/ios/Library;->endLibrary(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endLibrary(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    .line 50
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endObject()I

    move-result p0

    return p0
.end method

.method public static finishLibraryBuffer(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return-void
.end method

.method public static getRootAsLibrary(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ios/Library;
    .locals 1

    .line 12
    new-instance v0, Lcom/newrelic/mobile/fbs/ios/Library;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/ios/Library;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->getRootAsLibrary(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/ios/Library;)Lcom/newrelic/mobile/fbs/ios/Library;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsLibrary(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/ios/Library;)Lcom/newrelic/mobile/fbs/ios/Library;
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

    invoke-virtual {p1, v0, p0}, Lcom/newrelic/mobile/fbs/ios/Library;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ios/Library;

    move-result-object p0

    return-object p0
.end method

.method public static startLibrary(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x5

    .line 43
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ios/Library;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/mobile/fbs/ios/Library;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    iput-object p2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public address()J
    .locals 3

    const/16 v0, 0x8

    .line 21
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public arch()I
    .locals 3

    const/16 v0, 0xc

    .line 25
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public mutateAddress(J)Z
    .locals 3

    const/16 v0, 0x8

    .line 22
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateArch(I)Z
    .locals 3

    const/16 v0, 0xc

    .line 26
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    int-to-byte p1, p1

    invoke-virtual {v1, v0, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateUserLibrary(Z)Z
    .locals 3

    const/16 v0, 0xa

    .line 24
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    int-to-byte p1, p1

    invoke-virtual {v1, v0, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateUuidHigh(J)Z
    .locals 3

    const/4 v0, 0x6

    .line 20
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutateUuidLow(J)Z
    .locals 3

    const/4 v0, 0x4

    .line 18
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public userLibrary()Z
    .locals 4

    const/16 v0, 0xa

    .line 23
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v3

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public uuidHigh()J
    .locals 3

    const/4 v0, 0x6

    .line 19
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public uuidLow()J
    .locals 3

    const/4 v0, 0x4

    .line 17
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ios/Library;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ios/Library;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method
