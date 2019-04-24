.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private heartRate_:I

.field private time_:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22670
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 22671
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->maybeForceBuilderInitialization()V

    .line 22672
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 22676
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 22677
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->maybeForceBuilderInitialization()V

    .line 22678
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 22653
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$31400()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22653
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22682
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 22659
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$31100()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 22680
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 2

    .line 22708
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    .line 22709
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22710
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 22712
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 5

    .line 22716
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 22717
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22718
    const/4 v4, 0x0

    .line 22719
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 22720
    const/4 v4, 0x1

    .line 22722
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->heartRate_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->access$31702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;I)I

    .line 22723
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 22724
    or-int/lit8 v4, v4, 0x2

    .line 22726
    :cond_1
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->time_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->access$31802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;J)J

    .line 22727
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->access$31902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;I)I

    .line 22728
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->onBuilt()V

    .line 22729
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22686
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 22687
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->heartRate_:I

    .line 22688
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22689
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->time_:J

    .line 22690
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22691
    return-object p0
.end method

.method public clearHeartRate()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22802
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22803
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->heartRate_:I

    .line 22804
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->onChanged()V

    .line 22805
    return-object p0
.end method

.method public clearTime()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22834
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22835
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->time_:J

    .line 22836
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->onChanged()V

    .line 22837
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22695
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

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

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22653
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1

    .line 22704
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 22700
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$31100()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getHeartRate()I
    .locals 1

    .line 22787
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->heartRate_:I

    return v0
.end method

.method public getTime()J
    .locals 2

    .line 22819
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->time_:J

    return-wide v0
.end method

.method public hasHeartRate()Z
    .locals 2

    .line 22781
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

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

.method public hasTime()Z
    .locals 2

    .line 22813
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

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

    .line 22664
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$31200()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 22665
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 22664
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 22754
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

    .line 22653
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

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

    .line 22653
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

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

    .line 22653
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22653
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

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

    .line 22653
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22761
    const/4 v1, 0x0

    .line 22763
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->access$15900()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 22768
    if-eqz v1, :cond_1

    .line 22769
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    goto :goto_0

    .line 22764
    :catch_0
    move-exception v2

    .line 22765
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-object v1, v0

    .line 22766
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22768
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 22769
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 22771
    :cond_0
    throw v3

    .line 22772
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22733
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    if-eqz v0, :cond_0

    .line 22734
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0

    .line 22736
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 22737
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22742
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 22743
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->hasHeartRate()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22744
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getHeartRate()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->setHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 22746
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->hasTime()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 22747
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->setTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 22749
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 22750
    return-object p0
.end method

.method public setHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22793
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22794
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->heartRate_:I

    .line 22795
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->onChanged()V

    .line 22796
    return-object p0
.end method

.method public setTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22825
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->bitField0_:I

    .line 22826
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->time_:J

    .line 22827
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->onChanged()V

    .line 22828
    return-object p0
.end method
