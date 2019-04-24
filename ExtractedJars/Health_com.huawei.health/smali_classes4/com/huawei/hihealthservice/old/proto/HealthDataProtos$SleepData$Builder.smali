.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;"
    }
.end annotation


# instance fields
.field private baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 15672
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 15780
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15673
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->maybeForceBuilderInitialization()V

    .line 15674
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 15678
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 15780
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15679
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->maybeForceBuilderInitialization()V

    .line 15680
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 15655
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$20800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15655
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15687
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;-><init>()V

    return-object v0
.end method

.method private getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation

    .line 15885
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15886
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 15888
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    .line 15889
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 15890
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 15891
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15893
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 15661
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$20500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 15682
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->access$21000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15683
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 15685
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 2

    .line 15715
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    .line 15716
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 15717
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 15719
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 5

    .line 15723
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 15724
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15725
    const/4 v4, 0x0

    .line 15726
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 15727
    const/4 v4, 0x1

    .line 15729
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15730
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->access$21202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 15732
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->access$21202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15734
    :goto_0
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->access$21302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;I)I

    .line 15735
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->onBuilt()V

    .line 15736
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15691
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 15692
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15693
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 15695
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 15697
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15698
    return-object p0
.end method

.method public clearBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15852
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15853
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15854
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->onChanged()V

    goto :goto_0

    .line 15856
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 15858
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15859
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15702
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

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

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 15793
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15794
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0

    .line 15796
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 15865
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15866
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->onChanged()V

    .line 15867
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 15873
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 15874
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;

    return-object v0

    .line 15876
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 15655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1

    .line 15711
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 15707
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$20500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 15787
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

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

    .line 15666
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$20600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    .line 15667
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 15666
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 15758
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15833
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15834
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15835
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 15836
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15837
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 15839
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15841
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->onChanged()V

    goto :goto_1

    .line 15843
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15845
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15846
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15655
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

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

    .line 15655
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

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

    .line 15655
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15655
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

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

    .line 15655
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15765
    const/4 v1, 0x0

    .line 15767
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->access$21400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 15772
    if-eqz v1, :cond_1

    .line 15773
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    goto :goto_0

    .line 15768
    :catch_0
    move-exception v2

    .line 15769
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-object v1, v0

    .line 15770
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15772
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 15773
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    .line 15775
    :cond_0
    throw v3

    .line 15776
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15740
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    if-eqz v0, :cond_0

    .line 15741
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0

    .line 15743
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15744
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15749
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 15750
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->hasBaseHealthData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15751
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    .line 15753
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 15754
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15820
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15821
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15822
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->onChanged()V

    goto :goto_0

    .line 15824
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15826
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15827
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15803
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15804
    if-nez p1, :cond_0

    .line 15805
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 15807
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15808
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->onChanged()V

    goto :goto_0

    .line 15810
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15812
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->bitField0_:I

    .line 15813
    return-object p0
.end method
