.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private key_:D

.field private value_:D


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 23143
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 23144
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->maybeForceBuilderInitialization()V

    .line 23145
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 23149
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 23150
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->maybeForceBuilderInitialization()V

    .line 23151
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 23126
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$32300()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 1

    .line 23126
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 1

    .line 23155
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 23132
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$32000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 23153
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
    .locals 2

    .line 23181
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    .line 23182
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23183
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 23185
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
    .locals 5

    .line 23189
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 23190
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23191
    const/4 v4, 0x0

    .line 23192
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 23193
    const/4 v4, 0x1

    .line 23195
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->key_:D

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->access$32602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;D)D

    .line 23196
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 23197
    or-int/lit8 v4, v4, 0x2

    .line 23199
    :cond_1
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->value_:D

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->access$32702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;D)D

    .line 23200
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->access$32802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;I)I

    .line 23201
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->onBuilt()V

    .line 23202
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23159
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 23160
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->key_:D

    .line 23161
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23162
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->value_:D

    .line 23163
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23164
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23275
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23276
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->key_:D

    .line 23277
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->onChanged()V

    .line 23278
    return-object p0
.end method

.method public clearValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23307
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23308
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->value_:D

    .line 23309
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->onChanged()V

    .line 23310
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23168
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

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

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 23126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
    .locals 1

    .line 23177
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 23173
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$32000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getKey()D
    .locals 2

    .line 23260
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->key_:D

    return-wide v0
.end method

.method public getValue()D
    .locals 2

    .line 23292
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->value_:D

    return-wide v0
.end method

.method public hasKey()Z
    .locals 2

    .line 23254
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

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

    .line 23286
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

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

    .line 23137
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$32100()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 23138
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 23137
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 23227
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

    .line 23126
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

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

    .line 23126
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

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

    .line 23126
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 23126
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

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

    .line 23126
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23234
    const/4 v1, 0x0

    .line 23236
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->access$16000()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 23241
    if-eqz v1, :cond_1

    .line 23242
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    goto :goto_0

    .line 23237
    :catch_0
    move-exception v2

    .line 23238
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-object v1, v0

    .line 23239
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23241
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 23242
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 23244
    :cond_0
    throw v3

    .line 23245
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 1

    .line 23206
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    if-eqz v0, :cond_0

    .line 23207
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v0

    return-object v0

    .line 23209
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 23210
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23215
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 23216
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23217
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getKey()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->setKey(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 23219
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 23220
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->setValue(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 23222
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 23223
    return-object p0
.end method

.method public setKey(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23266
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23267
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->key_:D

    .line 23268
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->onChanged()V

    .line 23269
    return-object p0
.end method

.method public setValue(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 23298
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->bitField0_:I

    .line 23299
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->value_:D

    .line 23300
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->onChanged()V

    .line 23301
    return-object p0
.end method
