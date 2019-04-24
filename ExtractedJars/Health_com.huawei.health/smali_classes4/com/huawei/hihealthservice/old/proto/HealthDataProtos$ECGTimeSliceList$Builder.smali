.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;"
    }
.end annotation


# instance fields
.field private arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;>;"
        }
    .end annotation
.end field

.field private arrTypeMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private mEndStamp_:J

.field private mHeartRate_:I

.field private mStartStamp_:J


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 28498
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 28753
    .line 28754
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28499
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->maybeForceBuilderInitialization()V

    .line 28500
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 28504
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 28753
    .line 28754
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28505
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->maybeForceBuilderInitialization()V

    .line 28506
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 28481
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$39200()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28481
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28513
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;-><init>()V

    return-object v0
.end method

.method private ensureArrTypeMapIsMutable()V
    .locals 2

    .line 28756
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 28757
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28758
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28760
    :cond_0
    return-void
.end method

.method private getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;>;"
        }
    .end annotation

    .line 28987
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 28988
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 28992
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 28993
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28994
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28996
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 28487
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$38900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 28508
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39400()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28509
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28511
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllArrTypeMap(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;"
        }
    .end annotation

    .line 28895
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28896
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28897
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 28899
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28901
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28903
    :goto_0
    return-object p0
.end method

.method public addArrTypeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28881
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28882
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28883
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 28884
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28886
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28888
    :goto_0
    return-object p0
.end method

.method public addArrTypeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28850
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 28851
    if-nez p2, :cond_0

    .line 28852
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 28854
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28855
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 28856
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28858
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28860
    :goto_0
    return-object p0
.end method

.method public addArrTypeMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28867
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28868
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28869
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28870
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28872
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28874
    :goto_0
    return-object p0
.end method

.method public addArrTypeMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28833
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 28834
    if-nez p1, :cond_0

    .line 28835
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 28837
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28838
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28839
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28841
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28843
    :goto_0
    return-object p0
.end method

.method public addArrTypeMapBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 28966
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 28967
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    .line 28966
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    return-object v0
.end method

.method public addArrTypeMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 28974
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 28975
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    .line 28974
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 2

    .line 28547
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    .line 28548
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 28549
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 28551
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 5

    .line 28555
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 28556
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28557
    const/4 v4, 0x0

    .line 28558
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 28559
    const/4 v4, 0x1

    .line 28561
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mEndStamp_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;J)J

    .line 28562
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 28563
    or-int/lit8 v4, v4, 0x2

    .line 28565
    :cond_1
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mStartStamp_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;J)J

    .line 28566
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 28567
    or-int/lit8 v4, v4, 0x4

    .line 28569
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mHeartRate_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;I)I

    .line 28570
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_4

    .line 28571
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 28572
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28573
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28575
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 28577
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;Ljava/util/List;)Ljava/util/List;

    .line 28579
    :goto_0
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$40002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;I)I

    .line 28580
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onBuilt()V

    .line 28581
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28517
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 28518
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mEndStamp_:J

    .line 28519
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28520
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mStartStamp_:J

    .line 28521
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28522
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mHeartRate_:I

    .line 28523
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28524
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28525
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28526
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    goto :goto_0

    .line 28528
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 28530
    :goto_0
    return-object p0
.end method

.method public clearArrTypeMap()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28909
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28910
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28911
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28912
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28914
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 28916
    :goto_0
    return-object p0
.end method

.method public clearMEndStamp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28683
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28684
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mEndStamp_:J

    .line 28685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    .line 28686
    return-object p0
.end method

.method public clearMHeartRate()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28747
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28748
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mHeartRate_:I

    .line 28749
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    .line 28750
    return-object p0
.end method

.method public clearMStartStamp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28715
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28716
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mStartStamp_:J

    .line 28717
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    .line 28718
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28534
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

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

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getArrTypeMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1

    .line 28789
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 28790
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 28791
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 28793
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0

    .line 28795
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public getArrTypeMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 28936
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    return-object v0
.end method

.method public getArrTypeMapBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;>;"
        }
    .end annotation

    .line 28982
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getArrTypeMapCount()I
    .locals 1

    .line 28779
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28780
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 28782
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getArrTypeMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;"
        }
    .end annotation

    .line 28769
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28770
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 28772
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getArrTypeMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;
    .locals 1

    .line 28943
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 28944
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 28945
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 28947
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;

    return-object v0

    .line 28948
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;

    return-object v0
.end method

.method public getArrTypeMapOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;>;"
        }
    .end annotation

    .line 28956
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 28957
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 28959
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 28481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1

    .line 28543
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 28539
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$38900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getMEndStamp()J
    .locals 2

    .line 28668
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mEndStamp_:J

    return-wide v0
.end method

.method public getMHeartRate()I
    .locals 1

    .line 28732
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mHeartRate_:I

    return v0
.end method

.method public getMStartStamp()J
    .locals 2

    .line 28700
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mStartStamp_:J

    return-wide v0
.end method

.method public hasMEndStamp()Z
    .locals 2

    .line 28662
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

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

.method public hasMHeartRate()Z
    .locals 2

    .line 28726
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

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

.method public hasMStartStamp()Z
    .locals 2

    .line 28694
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

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

    .line 28492
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$39000()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    .line 28493
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 28492
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 28635
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

    .line 28481
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

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

    .line 28481
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

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

    .line 28481
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 28481
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

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

    .line 28481
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28642
    const/4 v1, 0x0

    .line 28644
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$36200()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 28649
    if-eqz v1, :cond_1

    .line 28650
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    goto :goto_0

    .line 28645
    :catch_0
    move-exception v2

    .line 28646
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-object v1, v0

    .line 28647
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28649
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 28650
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    .line 28652
    :cond_0
    throw v3

    .line 28653
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28585
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    if-eqz v0, :cond_0

    .line 28586
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0

    .line 28588
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 28589
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28594
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 28595
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->hasMEndStamp()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28596
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getMEndStamp()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->setMEndStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    .line 28598
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->hasMStartStamp()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 28599
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getMStartStamp()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->setMStartStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    .line 28601
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->hasMHeartRate()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 28602
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getMHeartRate()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->setMHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    .line 28604
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_5

    .line 28605
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 28606
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 28607
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28608
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    goto :goto_0

    .line 28610
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28611
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 28613
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_2

    .line 28616
    :cond_5
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 28617
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 28618
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 28619
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28620
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    .line 28621
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28622
    .line 28623
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$40100()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 28624
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->getArrTypeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 28626
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28630
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 28631
    return-object p0
.end method

.method public removeArrTypeMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28922
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28923
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28924
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 28925
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28927
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 28929
    :goto_0
    return-object p0
.end method

.method public setArrTypeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28820
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 28821
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28822
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28823
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28825
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28827
    :goto_0
    return-object p0
.end method

.method public setArrTypeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28803
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 28804
    if-nez p2, :cond_0

    .line 28805
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 28807
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->ensureArrTypeMapIsMutable()V

    .line 28808
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28809
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    goto :goto_0

    .line 28811
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->arrTypeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28813
    :goto_0
    return-object p0
.end method

.method public setMEndStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28674
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28675
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mEndStamp_:J

    .line 28676
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    .line 28677
    return-object p0
.end method

.method public setMHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28738
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28739
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mHeartRate_:I

    .line 28740
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    .line 28741
    return-object p0
.end method

.method public setMStartStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28706
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->bitField0_:I

    .line 28707
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mStartStamp_:J

    .line 28708
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->onChanged()V

    .line 28709
    return-object p0
.end method
