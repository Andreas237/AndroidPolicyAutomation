.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;"
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

.field private sportDuration_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 8451
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 8568
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8452
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 8453
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 8457
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 8568
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8458
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 8459
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 8434
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$11100()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8434
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8466
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;-><init>()V

    return-object v0
.end method

.method private getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation

    .line 8673
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 8674
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 8676
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    .line 8677
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 8678
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 8679
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8681
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 8440
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$10800()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 8461
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11300()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8462
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 8464
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 2

    .line 8496
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    .line 8497
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8498
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 8500
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 5

    .line 8504
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 8505
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8506
    const/4 v4, 0x0

    .line 8507
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 8508
    const/4 v4, 0x1

    .line 8510
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 8511
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 8513
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8515
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 8516
    or-int/lit8 v4, v4, 0x2

    .line 8518
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->sportDuration_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;I)I

    .line 8519
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;I)I

    .line 8520
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onBuilt()V

    .line 8521
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8470
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 8471
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 8472
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 8474
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 8476
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8477
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->sportDuration_:I

    .line 8478
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8479
    return-object p0
.end method

.method public clearBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8640
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 8641
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8642
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 8644
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 8646
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8647
    return-object p0
.end method

.method public clearSportDuration()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8710
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8711
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->sportDuration_:I

    .line 8712
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    .line 8713
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8483
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

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

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 8581
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 8582
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0

    .line 8584
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 8653
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8654
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    .line 8655
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 8661
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 8662
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;

    return-object v0

    .line 8664
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 8434
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 8492
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 8488
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$10800()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getSportDuration()I
    .locals 1

    .line 8695
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->sportDuration_:I

    return v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 8575
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

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

.method public hasSportDuration()Z
    .locals 2

    .line 8689
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

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

    .line 8445
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$10900()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 8446
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 8445
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 8546
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8621
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 8622
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8623
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 8624
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8625
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 8627
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8629
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 8631
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 8633
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8634
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8434
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

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

    .line 8434
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

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

    .line 8434
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8434
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

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

    .line 8434
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8553
    const/4 v1, 0x0

    .line 8555
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11800()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 8560
    if-eqz v1, :cond_1

    .line 8561
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    goto :goto_0

    .line 8556
    :catch_0
    move-exception v2

    .line 8557
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-object v1, v0

    .line 8558
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8560
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 8561
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 8563
    :cond_0
    throw v3

    .line 8564
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8525
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    if-eqz v0, :cond_0

    .line 8526
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0

    .line 8528
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 8529
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8534
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 8535
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->hasBaseHealthData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8536
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 8538
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->hasSportDuration()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8539
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getSportDuration()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->setSportDuration(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 8541
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 8542
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8608
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 8609
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8610
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 8612
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 8614
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8615
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8591
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 8592
    if-nez p1, :cond_0

    .line 8593
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 8595
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8596
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 8598
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 8600
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8601
    return-object p0
.end method

.method public setSportDuration(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8701
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->bitField0_:I

    .line 8702
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->sportDuration_:I

    .line 8703
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->onChanged()V

    .line 8704
    return-object p0
.end method
