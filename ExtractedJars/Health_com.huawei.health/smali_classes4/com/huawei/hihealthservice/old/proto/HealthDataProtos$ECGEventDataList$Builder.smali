.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private data_:I

.field private stamp_:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 29302
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 29303
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->maybeForceBuilderInitialization()V

    .line 29304
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 29308
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 29309
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->maybeForceBuilderInitialization()V

    .line 29310
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 29285
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$40500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 1

    .line 29285
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 1

    .line 29316
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 29291
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$40200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 29312
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->access$40700()Z

    move-result v0

    .line 29314
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
    .locals 2

    .line 29342
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    .line 29343
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 29344
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 29346
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
    .locals 5

    .line 29350
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 29351
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29352
    const/4 v4, 0x0

    .line 29353
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 29354
    const/4 v4, 0x1

    .line 29356
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->stamp_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->access$40902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;J)J

    .line 29357
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 29358
    or-int/lit8 v4, v4, 0x2

    .line 29360
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->data_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->access$41002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;I)I

    .line 29361
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->access$41102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;I)I

    .line 29362
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->onBuilt()V

    .line 29363
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29320
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 29321
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->stamp_:J

    .line 29322
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29323
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->data_:I

    .line 29324
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29325
    return-object p0
.end method

.method public clearData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29468
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29469
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->data_:I

    .line 29470
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->onChanged()V

    .line 29471
    return-object p0
.end method

.method public clearStamp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29436
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29437
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->stamp_:J

    .line 29438
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->onChanged()V

    .line 29439
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29329
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

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

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getData()I
    .locals 1

    .line 29453
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->data_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
    .locals 1

    .line 29338
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 29334
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$40200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getStamp()J
    .locals 2

    .line 29421
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->stamp_:J

    return-wide v0
.end method

.method public hasData()Z
    .locals 2

    .line 29447
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

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

.method public hasStamp()Z
    .locals 2

    .line 29415
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 29296
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$40300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    .line 29297
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 29296
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 29388
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

    .line 29285
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

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

    .line 29285
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

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

    .line 29285
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29285
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

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

    .line 29285
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29395
    const/4 v1, 0x0

    .line 29397
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->access$37600()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 29402
    if-eqz v1, :cond_1

    .line 29403
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    goto :goto_0

    .line 29398
    :catch_0
    move-exception v2

    .line 29399
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-object v1, v0

    .line 29400
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29402
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 29403
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    .line 29405
    :cond_0
    throw v3

    .line 29406
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 1

    .line 29367
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    if-eqz v0, :cond_0

    .line 29368
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    move-result-object v0

    return-object v0

    .line 29370
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 29371
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29376
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 29377
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->hasStamp()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 29378
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getStamp()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->setStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    .line 29380
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->hasData()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29381
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getData()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->setData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    .line 29383
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 29384
    return-object p0
.end method

.method public setData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29459
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29460
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->data_:I

    .line 29461
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->onChanged()V

    .line 29462
    return-object p0
.end method

.method public setStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 29427
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->bitField0_:I

    .line 29428
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->stamp_:J

    .line 29429
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->onChanged()V

    .line 29430
    return-object p0
.end method
