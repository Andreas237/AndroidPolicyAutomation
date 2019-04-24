.class public final Lcom/newrelic/mobile/fbs/ApplicationInfo;
.super Lcom/newrelic/com/google/flatbuffers/Table;
.source "ApplicationInfo.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/newrelic/com/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static addAppVersion(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 42
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addAppVersionId(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x3

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    .line 43
    invoke-virtual/range {v0 .. v5}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addApplicationLicense(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, v0, p1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addPlatform(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    int-to-byte p1, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 41
    invoke-virtual {p0, v0, p1, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public static createApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;IIIJ)I
    .locals 1

    const/4 v0, 0x4

    .line 31
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    .line 32
    invoke-static {p0, p4, p5}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->addAppVersionId(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 33
    invoke-static {p0, p3}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->addAppVersion(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 34
    invoke-static {p0, p1}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->addApplicationLicense(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 35
    invoke-static {p0, p2}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->addPlatform(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 36
    invoke-static {p0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->endApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    .line 45
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endObject()I

    move-result p0

    return p0
.end method

.method public static getRootAsApplicationInfo(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ApplicationInfo;
    .locals 1

    .line 12
    new-instance v0, Lcom/newrelic/mobile/fbs/ApplicationInfo;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->getRootAsApplicationInfo(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/ApplicationInfo;)Lcom/newrelic/mobile/fbs/ApplicationInfo;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsApplicationInfo(Ljava/nio/ByteBuffer;Lcom/newrelic/mobile/fbs/ApplicationInfo;)Lcom/newrelic/mobile/fbs/ApplicationInfo;
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

    invoke-virtual {p1, v0, p0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ApplicationInfo;

    move-result-object p0

    return-object p0
.end method

.method public static startApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x4

    .line 39
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startObject(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ApplicationInfo;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

    iput-object p2, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public appVersion()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x8

    .line 21
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public appVersionAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public appVersionId()J
    .locals 3

    const/16 v0, 0xa

    .line 23
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public applicationLicense()Lcom/newrelic/mobile/fbs/ApplicationLicense;
    .locals 1

    .line 17
    new-instance v0, Lcom/newrelic/mobile/fbs/ApplicationLicense;

    invoke-direct {v0}, Lcom/newrelic/mobile/fbs/ApplicationLicense;-><init>()V

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->applicationLicense(Lcom/newrelic/mobile/fbs/ApplicationLicense;)Lcom/newrelic/mobile/fbs/ApplicationLicense;

    move-result-object v0

    return-object v0
.end method

.method public applicationLicense(Lcom/newrelic/mobile/fbs/ApplicationLicense;)Lcom/newrelic/mobile/fbs/ApplicationLicense;
    .locals 2

    const/4 v0, 0x4

    .line 18
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/newrelic/mobile/fbs/ApplicationLicense;->__assign(ILjava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/ApplicationLicense;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public mutateAppVersionId(J)Z
    .locals 3

    const/16 v0, 0xa

    .line 24
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public mutatePlatform(I)Z
    .locals 3

    const/4 v0, 0x6

    .line 20
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

    add-int/2addr v0, v2

    int-to-byte p1, p1

    invoke-virtual {v1, v0, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public platform()I
    .locals 3

    const/4 v0, 0x6

    .line 19
    invoke-virtual {p0, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/mobile/fbs/ApplicationInfo;->bb_pos:I

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
