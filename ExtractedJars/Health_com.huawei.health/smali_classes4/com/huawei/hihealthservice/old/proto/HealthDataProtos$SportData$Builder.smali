.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;"
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

.field private calories_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private distances_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private steps_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private storeys_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private totalCalories_:J

.field private totalDistance_:J

.field private totalSteps_:J

.field private totalStoreys_:J


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 7397
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 7609
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7821
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7890
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7959
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 8060
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 7398
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->maybeForceBuilderInitialization()V

    .line 7399
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 7403
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 7609
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7821
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7890
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7959
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 8060
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 7404
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->maybeForceBuilderInitialization()V

    .line 7405
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 7380
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$9300()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7380
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7412
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;-><init>()V

    return-object v0
.end method

.method private ensureCaloriesIsMutable()V
    .locals 2

    .line 7892
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    .line 7893
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7894
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7896
    :cond_0
    return-void
.end method

.method private ensureDistancesIsMutable()V
    .locals 2

    .line 7961
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_0

    .line 7962
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 7963
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7965
    :cond_0
    return-void
.end method

.method private ensureStepsIsMutable()V
    .locals 2

    .line 7823
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    .line 7824
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7825
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7827
    :cond_0
    return-void
.end method

.method private ensureStoreysIsMutable()V
    .locals 2

    .line 8062
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-eq v0, v1, :cond_0

    .line 8063
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 8064
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 8066
    :cond_0
    return-void
.end method

.method private getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation

    .line 7714
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 7715
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 7717
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    .line 7718
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 7719
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 7720
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7722
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 7386
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$9000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 7407
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$9500()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7408
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 7410
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllCalories(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Ljava/lang/Integer;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;"
        }
    .end annotation

    .line 7943
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureCaloriesIsMutable()V

    .line 7944
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7946
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7947
    return-object p0
.end method

.method public addAllDistances(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Ljava/lang/Integer;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;"
        }
    .end annotation

    .line 8012
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureDistancesIsMutable()V

    .line 8013
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 8015
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8016
    return-object p0
.end method

.method public addAllSteps(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Ljava/lang/Integer;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;"
        }
    .end annotation

    .line 7874
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStepsIsMutable()V

    .line 7875
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7877
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7878
    return-object p0
.end method

.method public addAllStoreys(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Ljava/lang/Integer;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;"
        }
    .end annotation

    .line 8114
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStoreysIsMutable()V

    .line 8115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 8117
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8118
    return-object p0
.end method

.method public addCalories(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7933
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureCaloriesIsMutable()V

    .line 7934
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7935
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7936
    return-object p0
.end method

.method public addDistances(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8002
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureDistancesIsMutable()V

    .line 8003
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8004
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8005
    return-object p0
.end method

.method public addSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7864
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStepsIsMutable()V

    .line 7865
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7866
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7867
    return-object p0
.end method

.method public addStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8104
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStoreysIsMutable()V

    .line 8105
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8106
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8107
    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 2

    .line 7456
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    .line 7457
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7458
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 7460
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 5

    .line 7464
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 7465
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7466
    const/4 v4, 0x0

    .line 7467
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 7468
    const/4 v4, 0x1

    .line 7470
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 7471
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$9702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 7473
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$9702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7475
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 7476
    or-int/lit8 v4, v4, 0x2

    .line 7478
    :cond_2
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalSteps_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$9802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J

    .line 7479
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 7480
    or-int/lit8 v4, v4, 0x4

    .line 7482
    :cond_3
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalDistance_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$9902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J

    .line 7483
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 7484
    or-int/lit8 v4, v4, 0x8

    .line 7486
    :cond_4
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalCalories_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J

    .line 7487
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 7488
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7489
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7491
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;

    .line 7492
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 7493
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7494
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7496
    :cond_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;

    .line 7497
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 7498
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 7499
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7501
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;

    .line 7502
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 7503
    or-int/lit8 v4, v4, 0x10

    .line 7505
    :cond_8
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalStoreys_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J

    .line 7506
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_9

    .line 7507
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 7508
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7510
    :cond_9
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;

    .line 7511
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;I)I

    .line 7512
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onBuilt()V

    .line 7513
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7416
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 7417
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 7418
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 7420
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 7422
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7423
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalSteps_:J

    .line 7424
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7425
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalDistance_:J

    .line 7426
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7427
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalCalories_:J

    .line 7428
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7429
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7430
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7431
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7432
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7433
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 7434
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7435
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalStoreys_:J

    .line 7436
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7437
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 7438
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7439
    return-object p0
.end method

.method public clearBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7681
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 7682
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7683
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    goto :goto_0

    .line 7685
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 7687
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7688
    return-object p0
.end method

.method public clearCalories()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7953
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7954
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7955
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7956
    return-object p0
.end method

.method public clearDistances()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8022
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 8023
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 8024
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8025
    return-object p0
.end method

.method public clearSteps()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7884
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7885
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7886
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7887
    return-object p0
.end method

.method public clearStoreys()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8124
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 8125
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 8126
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8127
    return-object p0
.end method

.method public clearTotalCalories()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7815
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7816
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalCalories_:J

    .line 7817
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7818
    return-object p0
.end method

.method public clearTotalDistance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7783
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7784
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalDistance_:J

    .line 7785
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7786
    return-object p0
.end method

.method public clearTotalSteps()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7751
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7752
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalSteps_:J

    .line 7753
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7754
    return-object p0
.end method

.method public clearTotalStoreys()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8054
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 8055
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalStoreys_:J

    .line 8056
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8057
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7443
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

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

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 7622
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 7623
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0

    .line 7625
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 7694
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7695
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7696
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 7702
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 7703
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;

    return-object v0

    .line 7705
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getCalories(I)I
    .locals 1

    .line 7914
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7915
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7917
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCaloriesCount()I
    .locals 1

    .line 7908
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getCaloriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7902
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 7380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1

    .line 7452
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 7448
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$9000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getDistances(I)I
    .locals 1

    .line 7983
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7984
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7986
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDistancesCount()I
    .locals 1

    .line 7977
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getDistancesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7971
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSteps(I)I
    .locals 1

    .line 7845
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7846
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7848
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStepsCount()I
    .locals 1

    .line 7839
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getStepsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7833
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStoreys(I)I
    .locals 1

    .line 8085
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 8086
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 8088
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStoreysCount()I
    .locals 1

    .line 8078
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getStoreysList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 8072
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTotalCalories()J
    .locals 2

    .line 7800
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalCalories_:J

    return-wide v0
.end method

.method public getTotalDistance()J
    .locals 2

    .line 7768
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalDistance_:J

    return-wide v0
.end method

.method public getTotalSteps()J
    .locals 2

    .line 7736
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalSteps_:J

    return-wide v0
.end method

.method public getTotalStoreys()J
    .locals 2

    .line 8039
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalStoreys_:J

    return-wide v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 7616
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

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

.method public hasTotalCalories()Z
    .locals 2

    .line 7794
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasTotalDistance()Z
    .locals 2

    .line 7762
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasTotalSteps()Z
    .locals 2

    .line 7730
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

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

.method public hasTotalStoreys()Z
    .locals 2

    .line 8033
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

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

    .line 7391
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$9100()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7392
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 7391
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 7587
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7662
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 7663
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7664
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 7665
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7666
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 7668
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7670
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    goto :goto_1

    .line 7672
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 7674
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7675
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7380
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

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

    .line 7380
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

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

    .line 7380
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 7380
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

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

    .line 7380
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7594
    const/4 v1, 0x0

    .line 7596
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10700()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 7601
    if-eqz v1, :cond_1

    .line 7602
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    goto :goto_0

    .line 7597
    :catch_0
    move-exception v2

    .line 7598
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-object v1, v0

    .line 7599
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7601
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 7602
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7604
    :cond_0
    throw v3

    .line 7605
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7517
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    if-eqz v0, :cond_0

    .line 7518
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0

    .line 7520
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 7521
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7526
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 7527
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->hasBaseHealthData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7528
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7530
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->hasTotalSteps()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7531
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalSteps()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalSteps(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7533
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->hasTotalDistance()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7534
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalDistance()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalDistance(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7536
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->hasTotalCalories()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 7537
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalCalories()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalCalories(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7539
    :cond_4
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 7540
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 7541
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    .line 7542
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    goto :goto_0

    .line 7544
    :cond_5
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStepsIsMutable()V

    .line 7545
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7547
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7549
    :cond_6
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 7550
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 7551
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    .line 7552
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    goto :goto_1

    .line 7554
    :cond_7
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureCaloriesIsMutable()V

    .line 7555
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7557
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7559
    :cond_8
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 7560
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 7561
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    .line 7562
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    goto :goto_2

    .line 7564
    :cond_9
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureDistancesIsMutable()V

    .line 7565
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7567
    :goto_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7569
    :cond_a
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->hasTotalStoreys()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 7570
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalStoreys()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalStoreys(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 7572
    :cond_b
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 7573
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 7574
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    .line 7575
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    goto :goto_3

    .line 7577
    :cond_c
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStoreysIsMutable()V

    .line 7578
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7580
    :goto_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7582
    :cond_d
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 7583
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7649
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 7650
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7651
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    goto :goto_0

    .line 7653
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 7655
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7656
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7632
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 7633
    if-nez p1, :cond_0

    .line 7634
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 7636
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7637
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    goto :goto_0

    .line 7639
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 7641
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7642
    return-object p0
.end method

.method public setCalories(II)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7924
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureCaloriesIsMutable()V

    .line 7925
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->calories_:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 7926
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7927
    return-object p0
.end method

.method public setDistances(II)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7993
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureDistancesIsMutable()V

    .line 7994
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->distances_:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 7995
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7996
    return-object p0
.end method

.method public setSteps(II)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7855
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStepsIsMutable()V

    .line 7856
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->steps_:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 7857
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7858
    return-object p0
.end method

.method public setStoreys(II)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8095
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->ensureStoreysIsMutable()V

    .line 8096
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->storeys_:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 8097
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8098
    return-object p0
.end method

.method public setTotalCalories(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7806
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7807
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalCalories_:J

    .line 7808
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7809
    return-object p0
.end method

.method public setTotalDistance(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7774
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7775
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalDistance_:J

    .line 7776
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7777
    return-object p0
.end method

.method public setTotalSteps(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7742
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 7743
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalSteps_:J

    .line 7744
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 7745
    return-object p0
.end method

.method public setTotalStoreys(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 8045
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->bitField0_:I

    .line 8046
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->totalStoreys_:J

    .line 8047
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->onChanged()V

    .line 8048
    return-object p0
.end method
