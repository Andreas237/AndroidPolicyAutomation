.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private key_:I

.field private value_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 30252
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 30253
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->maybeForceBuilderInitialization()V

    .line 30254
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 30258
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 30259
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->maybeForceBuilderInitialization()V

    .line 30260
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 30235
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$42500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30235
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30266
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 30241
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$42200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 30262
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->access$42700()Z

    move-result v0

    .line 30264
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 2

    .line 30292
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    .line 30293
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 30294
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 30296
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 5

    .line 30300
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 30301
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30302
    const/4 v4, 0x0

    .line 30303
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 30304
    const/4 v4, 0x1

    .line 30306
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->key_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->access$42902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;I)I

    .line 30307
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 30308
    or-int/lit8 v4, v4, 0x2

    .line 30310
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->value_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->access$43002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;I)I

    .line 30311
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->access$43102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;I)I

    .line 30312
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->onBuilt()V

    .line 30313
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30270
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 30271
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->key_:I

    .line 30272
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30273
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->value_:I

    .line 30274
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30275
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30386
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30387
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->key_:I

    .line 30388
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->onChanged()V

    .line 30389
    return-object p0
.end method

.method public clearValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30418
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30419
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->value_:I

    .line 30420
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->onChanged()V

    .line 30421
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30279
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1

    .line 30288
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 30284
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$42200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 30371
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->key_:I

    return v0
.end method

.method public getValue()I
    .locals 1

    .line 30403
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->value_:I

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 30365
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasValue()Z
    .locals 2

    .line 30397
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 30246
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$42300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    .line 30247
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 30246
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 30338
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30235
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30235
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30235
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30235
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30235
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30345
    const/4 v1, 0x0

    .line 30347
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->access$38800()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 30352
    if-eqz v1, :cond_1

    .line 30353
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    goto :goto_0

    .line 30348
    :catch_0
    move-exception v2

    .line 30349
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-object v1, v0

    .line 30350
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30352
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 30353
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    .line 30355
    :cond_0
    throw v3

    .line 30356
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30317
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    if-eqz v0, :cond_0

    .line 30318
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0

    .line 30320
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 30321
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30326
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 30327
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30328
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getKey()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    .line 30330
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 30331
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->setValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    .line 30333
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 30334
    return-object p0
.end method

.method public setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30377
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30378
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->key_:I

    .line 30379
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->onChanged()V

    .line 30380
    return-object p0
.end method

.method public setValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30409
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->bitField0_:I

    .line 30410
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->value_:I

    .line 30411
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->onChanged()V

    .line 30412
    return-object p0
.end method
