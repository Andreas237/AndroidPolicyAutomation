.class public final Lcom/google/protobuf/UnknownFieldSetLite;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/UnknownFieldSetLite;

.field private static final MIN_CAPACITY:I = 0x8


# instance fields
.field private count:I

.field private isMutable:Z

.field private memoizedSerializedSize:I

.field private objects:[Ljava/lang/Object;

.field private tags:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 53
    new-instance v0, Lcom/google/protobuf/UnknownFieldSetLite;

    const/4 v1, 0x0

    new-array v1, v1, [I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v1, v2, v4}, Lcom/google/protobuf/UnknownFieldSetLite;-><init>(I[I[Ljava/lang/Object;Z)V

    sput-object v0, Lcom/google/protobuf/UnknownFieldSetLite;->DEFAULT_INSTANCE:Lcom/google/protobuf/UnknownFieldSetLite;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 114
    const/16 v0, 0x8

    new-array v0, v0, [I

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {p0, v2, v0, v1, v3}, Lcom/google/protobuf/UnknownFieldSetLite;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 115
    return-void
.end method

.method private constructor <init>(I[I[Ljava/lang/Object;Z)V
    .locals 1

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->memoizedSerializedSize:I

    .line 121
    iput p1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    .line 122
    iput-object p2, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    .line 123
    iput-object p3, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    .line 124
    iput-boolean p4, p0, Lcom/google/protobuf/UnknownFieldSetLite;->isMutable:Z

    .line 125
    return-void
.end method

.method private ensureCapacity()V
    .locals 4

    .line 338
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    iget-object v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    array-length v1, v1

    if-ne v0, v1, :cond_1

    .line 339
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    shr-int/lit8 v2, v0, 0x1

    .line 340
    :goto_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    add-int v3, v0, v2

    .line 342
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    .line 343
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    .line 345
    :cond_1
    return-void
.end method

.method private static equals([I[II)Z
    .locals 3

    .line 257
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    .line 258
    aget v0, p0, v2

    aget v1, p1, v2

    if-eq v0, v1, :cond_0

    .line 259
    const/4 v0, 0x0

    return v0

    .line 257
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 262
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private static equals([Ljava/lang/Object;[Ljava/lang/Object;I)Z
    .locals 3

    .line 266
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    .line 267
    aget-object v0, p0, v2

    aget-object v1, p1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    const/4 v0, 0x0

    return v0

    .line 266
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 271
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 1

    .line 62
    sget-object v0, Lcom/google/protobuf/UnknownFieldSetLite;->DEFAULT_INSTANCE:Lcom/google/protobuf/UnknownFieldSetLite;

    return-object v0
.end method

.method private mergeFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 426
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v1

    .line 427
    if-eqz v1, :cond_1

    invoke-virtual {p0, v1, p1}, Lcom/google/protobuf/UnknownFieldSetLite;->mergeFieldFrom(ILcom/google/protobuf/CodedInputStream;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 428
    goto :goto_1

    .line 430
    :cond_0
    goto :goto_0

    .line 431
    :cond_1
    :goto_1
    return-object p0
.end method

.method static mutableCopyOf(Lcom/google/protobuf/UnknownFieldSetLite;Lcom/google/protobuf/UnknownFieldSetLite;)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 7

    .line 77
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    iget v1, p1, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    add-int v4, v0, v1

    .line 78
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    .line 79
    iget-object v0, p1, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    iget v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    iget v2, p1, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    .line 81
    iget-object v0, p1, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    iget v2, p1, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v6, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    new-instance v0, Lcom/google/protobuf/UnknownFieldSetLite;

    const/4 v1, 0x1

    invoke-direct {v0, v4, v5, v6, v1}, Lcom/google/protobuf/UnknownFieldSetLite;-><init>(I[I[Ljava/lang/Object;Z)V

    return-object v0
.end method

.method static newInstance()Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 1

    .line 69
    new-instance v0, Lcom/google/protobuf/UnknownFieldSetLite;

    invoke-direct {v0}, Lcom/google/protobuf/UnknownFieldSetLite;-><init>()V

    return-object v0
.end method


# virtual methods
.method checkMutable()V
    .locals 1

    .line 140
    iget-boolean v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->isMutable:Z

    if-nez v0, :cond_0

    .line 141
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 143
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 276
    if-ne p0, p1, :cond_0

    .line 277
    const/4 v0, 0x1

    return v0

    .line 280
    :cond_0
    if-nez p1, :cond_1

    .line 281
    const/4 v0, 0x0

    return v0

    .line 284
    :cond_1
    instance-of v0, p1, Lcom/google/protobuf/UnknownFieldSetLite;

    if-nez v0, :cond_2

    .line 285
    const/4 v0, 0x0

    return v0

    .line 288
    :cond_2
    move-object v3, p1

    check-cast v3, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 289
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    iget v1, v3, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    iget-object v1, v3, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    iget v2, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    .line 290
    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnknownFieldSetLite;->equals([I[II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    iget-object v1, v3, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    .line 291
    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnknownFieldSetLite;->equals([Ljava/lang/Object;[Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 292
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 295
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 220
    iget v2, p0, Lcom/google/protobuf/UnknownFieldSetLite;->memoizedSerializedSize:I

    .line 221
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 222
    return v2

    .line 225
    :cond_0
    const/4 v2, 0x0

    .line 226
    const/4 v3, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    if-ge v3, v0, :cond_1

    .line 227
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    aget v4, v0, v3

    .line 228
    invoke-static {v4}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    move-result v5

    .line 229
    invoke-static {v4}, Lcom/google/protobuf/WireFormat;->getTagWireType(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 231
    :pswitch_0
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v3

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v5, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 232
    goto :goto_2

    .line 234
    :pswitch_1
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v3

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v5, v0}, Lcom/google/protobuf/CodedOutputStream;->computeFixed32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 235
    goto :goto_2

    .line 237
    :pswitch_2
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v3

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v5, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFixed64Size(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 238
    goto :goto_2

    .line 240
    :pswitch_3
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v3

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-static {v5, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 241
    goto :goto_2

    .line 243
    :pswitch_4
    invoke-static {v5}, Lcom/google/protobuf/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v1, v1, v3

    check-cast v1, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 244
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSetLite;->getSerializedSize()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v2, v0

    .line 245
    goto :goto_2

    .line 247
    :goto_1
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 226
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 251
    :cond_1
    iput v2, p0, Lcom/google/protobuf/UnknownFieldSetLite;->memoizedSerializedSize:I

    .line 253
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method

.method public getSerializedSizeAsMessageSet()I
    .locals 5

    .line 196
    iget v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->memoizedSerializedSize:I

    .line 197
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 198
    return v1

    .line 201
    :cond_0
    const/4 v1, 0x0

    .line 202
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    if-ge v2, v0, :cond_1

    .line 203
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    aget v3, v0, v2

    .line 204
    invoke-static {v3}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    move-result v4

    .line 205
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-static {v4, v0}, Lcom/google/protobuf/CodedOutputStream;->computeRawMessageSetExtensionSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v1, v0

    .line 202
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 209
    :cond_1
    iput v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->memoizedSerializedSize:I

    .line 211
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 300
    const/16 v2, 0x11

    .line 302
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    add-int/lit16 v2, v0, 0x20f

    .line 303
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int v2, v0, v1

    .line 304
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->deepHashCode([Ljava/lang/Object;)I

    move-result v1

    add-int v2, v0, v1

    .line 306
    return v2
.end method

.method public makeImmutable()V
    .locals 1

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->isMutable:Z

    .line 134
    return-void
.end method

.method mergeFieldFrom(ILcom/google/protobuf/CodedInputStream;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 356
    invoke-virtual {p0}, Lcom/google/protobuf/UnknownFieldSetLite;->checkMutable()V

    .line 357
    invoke-static {p1}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    move-result v2

    .line 358
    invoke-static {p1}, Lcom/google/protobuf/WireFormat;->getTagWireType(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 360
    :pswitch_0
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 361
    const/4 v0, 0x1

    return v0

    .line 363
    :pswitch_1
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readFixed32()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 364
    const/4 v0, 0x1

    return v0

    .line 366
    :pswitch_2
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readFixed64()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 367
    const/4 v0, 0x1

    return v0

    .line 369
    :pswitch_3
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 370
    const/4 v0, 0x1

    return v0

    .line 372
    :pswitch_4
    new-instance v3, Lcom/google/protobuf/UnknownFieldSetLite;

    invoke-direct {v3}, Lcom/google/protobuf/UnknownFieldSetLite;-><init>()V

    .line 373
    invoke-direct {v3, p2}, Lcom/google/protobuf/UnknownFieldSetLite;->mergeFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/UnknownFieldSetLite;

    .line 374
    .line 375
    const/4 v0, 0x4

    invoke-static {v2, v0}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    move-result v0

    .line 374
    invoke-virtual {p2, v0}, Lcom/google/protobuf/CodedInputStream;->checkLastTagWas(I)V

    .line 376
    invoke-virtual {p0, p1, v3}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 377
    const/4 v0, 0x1

    return v0

    .line 379
    :pswitch_5
    const/4 v0, 0x0

    return v0

    .line 381
    :goto_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method

.method mergeLengthDelimitedField(ILcom/google/protobuf/ByteString;)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 2

    .line 409
    invoke-virtual {p0}, Lcom/google/protobuf/UnknownFieldSetLite;->checkMutable()V

    .line 410
    if-nez p1, :cond_0

    .line 411
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 414
    :cond_0
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 416
    return-object p0
.end method

.method mergeVarintField(II)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 3

    .line 393
    invoke-virtual {p0}, Lcom/google/protobuf/UnknownFieldSetLite;->checkMutable()V

    .line 394
    if-nez p1, :cond_0

    .line 395
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 398
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    move-result v0

    int-to-long v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 400
    return-object p0
.end method

.method final printWithIndent(Ljava/lang/StringBuilder;I)V
    .locals 4

    .line 318
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    if-ge v2, v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    aget v0, v0, v2

    invoke-static {v0}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    move-result v3

    .line 320
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v1, v1, v2

    invoke-static {p1, p2, v0, v1}, Lcom/google/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 318
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 322
    :cond_0
    return-void
.end method

.method storeField(ILjava/lang/Object;)V
    .locals 2

    .line 326
    invoke-virtual {p0}, Lcom/google/protobuf/UnknownFieldSetLite;->checkMutable()V

    .line 327
    invoke-direct {p0}, Lcom/google/protobuf/UnknownFieldSetLite;->ensureCapacity()V

    .line 329
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    iget v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    aput p1, v0, v1

    .line 330
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    aput-object p2, v0, v1

    .line 331
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    .line 332
    return-void
.end method

.method public writeAsMessageSetTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    const/4 v1, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    if-ge v1, v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    aget v0, v0, v1

    invoke-static {v0}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    move-result v2

    .line 186
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-virtual {p1, v2, v0}, Lcom/google/protobuf/CodedOutputStream;->writeRawMessageSetExtension(ILcom/google/protobuf/ByteString;)V

    .line 184
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 188
    :cond_0
    return-void
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 151
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->count:I

    if-ge v2, v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->tags:[I

    aget v3, v0, v2

    .line 153
    invoke-static {v3}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    move-result v4

    .line 154
    invoke-static {v3}, Lcom/google/protobuf/WireFormat;->getTagWireType(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 156
    :pswitch_0
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v4, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeUInt64(IJ)V

    .line 157
    goto :goto_2

    .line 159
    :pswitch_1
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v4, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFixed32(II)V

    .line 160
    goto :goto_2

    .line 162
    :pswitch_2
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v4, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFixed64(IJ)V

    .line 163
    goto :goto_2

    .line 165
    :pswitch_3
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-virtual {p1, v4, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 166
    goto :goto_2

    .line 168
    :pswitch_4
    const/4 v0, 0x3

    invoke-virtual {p1, v4, v0}, Lcom/google/protobuf/CodedOutputStream;->writeTag(II)V

    .line 169
    iget-object v0, p0, Lcom/google/protobuf/UnknownFieldSetLite;->objects:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Lcom/google/protobuf/UnknownFieldSetLite;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSetLite;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 170
    const/4 v0, 0x4

    invoke-virtual {p1, v4, v0}, Lcom/google/protobuf/CodedOutputStream;->writeTag(II)V

    .line 171
    goto :goto_2

    .line 173
    :goto_1
    :pswitch_5
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object v0

    throw v0

    .line 151
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 176
    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method
