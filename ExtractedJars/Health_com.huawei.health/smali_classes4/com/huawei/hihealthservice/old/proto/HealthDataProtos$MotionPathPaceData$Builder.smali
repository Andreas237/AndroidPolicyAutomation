.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private key_:I

.field private value_:F


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22196
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 22197
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->maybeForceBuilderInitialization()V

    .line 22198
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 22202
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 22203
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->maybeForceBuilderInitialization()V

    .line 22204
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 22179
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$30500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22179
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22209
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 22185
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$30200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 22207
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 2

    .line 22235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    .line 22236
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22237
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 22239
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 5

    .line 22243
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 22244
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22245
    const/4 v4, 0x0

    .line 22246
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 22247
    const/4 v4, 0x1

    .line 22249
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->key_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->access$30802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;I)I

    .line 22250
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 22251
    or-int/lit8 v4, v4, 0x2

    .line 22253
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->value_:F

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->access$30902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;F)F

    .line 22254
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->access$31002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;I)I

    .line 22255
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->onBuilt()V

    .line 22256
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22213
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 22214
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->key_:I

    .line 22215
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22216
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->value_:F

    .line 22217
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22218
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22329
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22330
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->key_:I

    .line 22331
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->onChanged()V

    .line 22332
    return-object p0
.end method

.method public clearValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22361
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22362
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->value_:F

    .line 22363
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->onChanged()V

    .line 22364
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22222
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

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

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1

    .line 22231
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 22227
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$30200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 22314
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->key_:I

    return v0
.end method

.method public getValue()F
    .locals 1

    .line 22346
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->value_:F

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 22308
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

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

    .line 22340
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

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

    .line 22190
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$30300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 22191
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 22190
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 22281
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

    .line 22179
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

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

    .line 22179
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

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

    .line 22179
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22179
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

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

    .line 22179
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22288
    const/4 v1, 0x0

    .line 22290
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->access$15800()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 22295
    if-eqz v1, :cond_1

    .line 22296
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    goto :goto_0

    .line 22291
    :catch_0
    move-exception v2

    .line 22292
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-object v1, v0

    .line 22293
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22295
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 22296
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 22298
    :cond_0
    throw v3

    .line 22299
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22260
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    if-eqz v0, :cond_0

    .line 22261
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0

    .line 22263
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 22264
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22269
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 22270
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22271
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getKey()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 22273
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 22274
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->setValue(F)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 22276
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 22277
    return-object p0
.end method

.method public setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22320
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22321
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->key_:I

    .line 22322
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->onChanged()V

    .line 22323
    return-object p0
.end method

.method public setValue(F)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22352
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->bitField0_:I

    .line 22353
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->value_:F

    .line 22354
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->onChanged()V

    .line 22355
    return-object p0
.end method
