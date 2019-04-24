.class public Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;
.super Ljava/lang/Object;
.source "FlatBufferBuilder.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field static final utf8charset:Ljava/nio/charset/Charset;


# instance fields
.field bb:Ljava/nio/ByteBuffer;

.field dst:Ljava/nio/ByteBuffer;

.field encoder:Ljava/nio/charset/CharsetEncoder;

.field finished:Z

.field force_defaults:Z

.field minalign:I

.field nested:Z

.field num_vtables:I

.field object_start:I

.field space:I

.field vector_num_elems:I

.field vtable:[I

.field vtable_in_use:I

.field vtables:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    .line 42
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->utf8charset:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x400

    .line 72
    invoke-direct {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    const/4 v1, 0x0

    .line 44
    iput-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    const/4 v1, 0x0

    .line 45
    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 46
    iput-boolean v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 47
    iput-boolean v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished:Z

    const/16 v2, 0x10

    .line 49
    new-array v2, v2, [I

    iput-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    .line 50
    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    .line 51
    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    .line 52
    iput-boolean v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    .line 53
    sget-object v1, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->utf8charset:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    iput-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->encoder:Ljava/nio/charset/CharsetEncoder;

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    .line 64
    :cond_0
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 65
    invoke-static {p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->newByteBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    const/4 v0, 0x0

    .line 45
    iput v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 46
    iput-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 47
    iput-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished:Z

    const/16 v1, 0x10

    .line 49
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    .line 50
    iput v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    .line 51
    iput v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    .line 52
    iput-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    .line 53
    sget-object v0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->utf8charset:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->encoder:Ljava/nio/charset/CharsetEncoder;

    .line 83
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->init(Ljava/nio/ByteBuffer;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;

    return-void
.end method

.method private dataStart()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 811
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 812
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    return v0
.end method

.method static growByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 3

    .line 131
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    const/high16 v1, -0x40000000    # -2.0f

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    shl-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    .line 135
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 136
    invoke-static {v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->newByteBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sub-int/2addr v1, v0

    .line 137
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 138
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-object v2

    .line 133
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string v0, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method static newByteBuffer(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 117
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 118
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-object p0
.end method


# virtual methods
.method public Nested(I)V
    .locals 1

    .line 505
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    .line 506
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "FlatBuffers: struct must be serialized inline."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public addBoolean(IZZ)V
    .locals 1

    .line 567
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addBoolean(Z)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addBoolean(Z)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 247
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putBoolean(Z)V

    return-void
.end method

.method public addByte(B)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 254
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putByte(B)V

    return-void
.end method

.method public addByte(IBI)V
    .locals 1

    .line 578
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addDouble(D)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 289
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putDouble(D)V

    return-void
.end method

.method public addDouble(IDD)V
    .locals 1

    .line 633
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    cmpl-double v0, p2, p4

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addDouble(D)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addFloat(F)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 282
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putFloat(F)V

    return-void
.end method

.method public addFloat(IFD)V
    .locals 3

    .line 622
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    float-to-double v0, p2

    cmpl-double v2, v0, p3

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addFloat(F)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addInt(I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 268
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putInt(I)V

    return-void
.end method

.method public addInt(III)V
    .locals 1

    .line 600
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addInt(I)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addLong(IJJ)V
    .locals 1

    .line 611
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    cmp-long v0, p2, p4

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addLong(J)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addLong(J)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 275
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putLong(J)V

    return-void
.end method

.method public addOffset(I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 297
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 299
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v1

    sub-int/2addr v1, p1

    add-int/2addr v1, v0

    .line 300
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putInt(I)V

    return-void
.end method

.method public addOffset(III)V
    .locals 1

    .line 644
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addShort(ISI)V
    .locals 1

    .line 589
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addShort(S)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 261
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putShort(S)V

    return-void
.end method

.method public addStruct(III)V
    .locals 0

    if-eq p2, p3, :cond_0

    .line 655
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->Nested(I)V

    .line 656
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_0
    return-void
.end method

.method public createByteVector([B)I
    .locals 3

    .line 470
    array-length v0, p1

    const/4 v1, 0x1

    .line 471
    invoke-virtual {p0, v1, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 472
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 473
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 474
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public createSortedVectorOfTables(Lcom/newrelic/com/google/flatbuffers/Table;[I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/newrelic/com/google/flatbuffers/Table;",
            ">(TT;[I)I"
        }
    .end annotation

    .line 413
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/newrelic/com/google/flatbuffers/Table;->sortTables([ILjava/nio/ByteBuffer;)V

    .line 414
    invoke-virtual {p0, p2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result p1

    return p1
.end method

.method public createString(Ljava/lang/CharSequence;)I
    .locals 3

    .line 425
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    int-to-float v0, v0

    .line 426
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->encoder:Ljava/nio/charset/CharsetEncoder;

    invoke-virtual {v1}, Ljava/nio/charset/CharsetEncoder;->maxBytesPerChar()F

    move-result v1

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 427
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dst:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    if-ge v1, v0, :cond_1

    :cond_0
    const/16 v1, 0x80

    .line 428
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dst:Ljava/nio/ByteBuffer;

    .line 431
    :cond_1
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dst:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 433
    instance-of v0, p1, Ljava/nio/CharBuffer;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/nio/CharBuffer;

    goto :goto_0

    .line 434
    :cond_2
    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object p1

    .line 435
    :goto_0
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->encoder:Ljava/nio/charset/CharsetEncoder;

    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dst:Ljava/nio/ByteBuffer;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object p1

    .line 436
    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 438
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->throwException()V
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 440
    new-instance v0, Ljava/lang/Error;

    invoke-direct {v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 444
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dst:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 445
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dst:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public createString(Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 455
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/4 v1, 0x0

    .line 456
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    const/4 v1, 0x1

    .line 457
    invoke-virtual {p0, v1, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 458
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 459
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 460
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public createUnintializedVector(III)Ljava/nio/ByteBuffer;
    .locals 1

    mul-int v0, p1, p2

    .line 382
    invoke-virtual {p0, p1, p2, p3}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 384
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget p2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr p2, v0

    iput p2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 387
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 388
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object p1
.end method

.method public createVectorOfTables([I)I
    .locals 2

    .line 399
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->notNested()V

    .line 400
    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 401
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 402
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public dataBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 797
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 798
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public endObject()I
    .locals 11

    .line 677
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    .line 679
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addInt(I)V

    .line 680
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v1

    .line 682
    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    .line 684
    iget-object v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    aget v4, v3, v2

    if-eqz v4, :cond_0

    aget v3, v3, v2

    sub-int v3, v1, v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    int-to-short v3, v3

    .line 685
    invoke-virtual {p0, v3}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 689
    :cond_1
    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->object_start:I

    sub-int v2, v1, v2

    int-to-short v2, v2

    invoke-virtual {p0, v2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    .line 690
    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    const/4 v3, 0x2

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x2

    int-to-short v2, v2

    invoke-virtual {p0, v2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    const/4 v2, 0x0

    .line 695
    :goto_2
    iget v4, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    if-ge v2, v4, :cond_5

    .line 696
    iget-object v4, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v4

    iget-object v5, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    aget v5, v5, v2

    sub-int/2addr v4, v5

    .line 697
    iget v5, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 698
    iget-object v6, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v6

    .line 699
    iget-object v7, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v7

    if-ne v6, v7, :cond_4

    const/4 v7, 0x2

    :goto_3
    if-ge v7, v6, :cond_3

    .line 701
    iget-object v8, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    add-int v9, v4, v7

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v8

    iget-object v9, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    add-int v10, v5, v7

    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v9

    if-eq v8, v9, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v7, v7, 0x2

    goto :goto_3

    .line 705
    :cond_3
    iget-object v4, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    aget v2, v4, v2

    goto :goto_5

    :cond_4
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_6

    .line 713
    iget-object v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    iput v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 715
    iget-object v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v4, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v1

    invoke-virtual {v3, v4, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    goto :goto_6

    .line 719
    :cond_6
    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    iget-object v4, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    array-length v5, v4

    if-ne v2, v5, :cond_7

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    .line 720
    :cond_7
    iget-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    iget v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v4

    aput v4, v2, v3

    .line 722
    iget-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 725
    :goto_6
    iput-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    return v1

    .line 678
    :cond_8
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endObject called without startObject"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public endVector()I
    .locals 2

    .line 362
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 364
    iput-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 365
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->putInt(I)V

    .line 366
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v0

    return v0

    .line 363
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endVector called without startVector"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public finish(I)V
    .locals 2

    .line 752
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 753
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    .line 754
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 p1, 0x1

    .line 755
    iput-boolean p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished:Z

    return-void
.end method

.method public finish(ILjava/lang/String;)V
    .locals 2

    .line 766
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 767
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    .line 771
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 773
    :cond_0
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return-void

    .line 768
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "FlatBuffers: file identifier must be length 4"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public finished()V
    .locals 2

    .line 482
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished:Z

    if-eqz v0, :cond_0

    return-void

    .line 483
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public forceDefaults(Z)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;
    .locals 0

    .line 785
    iput-boolean p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    return-object p0
.end method

.method public init(Ljava/nio/ByteBuffer;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;
    .locals 1

    .line 95
    iput-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 96
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 97
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    .line 98
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    .line 99
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result p1

    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    const/4 p1, 0x0

    .line 100
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 101
    iput-boolean p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 102
    iput-boolean p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished:Z

    .line 103
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->object_start:I

    .line 104
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    .line 105
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    return-object p0
.end method

.method public notNested()V
    .locals 2

    .line 493
    iget-boolean v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    if-nez v0, :cond_0

    return-void

    .line 494
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: object serialization must not be nested."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public offset()I
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public pad(I)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 157
    iget-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v2, v3, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public prep(II)V
    .locals 4

    .line 172
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->minalign:I

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v0, v1

    add-int/2addr v0, p2

    not-int v0, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, p1, -0x1

    and-int/2addr v0, v1

    .line 177
    :goto_0
    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int v2, v0, p1

    add-int/2addr v2, p2

    if-ge v1, v2, :cond_1

    .line 178
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    .line 179
    iget-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v2}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->growByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 180
    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    iget-object v3, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    add-int/2addr v2, v3

    iput v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    goto :goto_0

    .line 182
    :cond_1
    invoke-virtual {p0, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->pad(I)V

    return-void
.end method

.method public putBoolean(Z)V
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    int-to-byte p1, p1

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putByte(B)V
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putDouble(D)V
    .locals 2

    .line 239
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x8

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1, p2}, Ljava/nio/ByteBuffer;->putDouble(ID)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putFloat(F)V
    .locals 2

    .line 231
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x4

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putInt(I)V
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x4

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putLong(J)V
    .locals 2

    .line 223
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x8

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putShort(S)V
    .locals 2

    .line 207
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public required(II)V
    .locals 2

    .line 737
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    sub-int/2addr v0, p1

    .line 738
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    sub-int/2addr v0, p1

    .line 739
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    add-int/2addr v0, p2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    .line 742
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FlatBuffers: field "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " must be set"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public sizedByteArray()[B
    .locals 3

    .line 838
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    iget v2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->sizedByteArray(II)[B

    move-result-object v0

    return-object v0
.end method

.method public sizedByteArray(II)[B
    .locals 1

    .line 825
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 826
    new-array p2, p2, [B

    .line 827
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 828
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object p2
.end method

.method public slot(I)V
    .locals 2

    .line 667
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v1

    aput v1, v0, p1

    return-void
.end method

.method public startObject(I)V
    .locals 2

    .line 550
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->notNested()V

    .line 551
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    .line 552
    :cond_1
    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 553
    iget-object p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    const/4 p1, 0x1

    .line 554
    iput-boolean p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 555
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result p1

    iput p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->object_start:I

    return-void
.end method

.method public startVector(III)V
    .locals 0

    .line 347
    invoke-virtual {p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->notNested()V

    .line 348
    iput p2, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    mul-int p1, p1, p2

    const/4 p2, 0x4

    .line 349
    invoke-virtual {p0, p2, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 350
    invoke-virtual {p0, p3, p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    const/4 p1, 0x1

    .line 351
    iput-boolean p1, p0, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->nested:Z

    return-void
.end method
