.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceDataOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private realTimeDataList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation
.end field

.field private stamp_:J


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 30773
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 30946
    .line 30947
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30774
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->maybeForceBuilderInitialization()V

    .line 30775
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 30779
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 30946
    .line 30947
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30780
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->maybeForceBuilderInitialization()V

    .line 30781
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 30756
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$43600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30756
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30788
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;-><init>()V

    return-object v0
.end method

.method private ensureRealTimeDataListIsMutable()V
    .locals 2

    .line 30949
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 30950
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30951
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30953
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 30762
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$43300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;>;"
        }
    .end annotation

    .line 31180
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 31181
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 31185
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 31186
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31187
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 31189
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 30783
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$43800()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30784
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 30786
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllRealTimeDataList(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;"
        }
    .end annotation

    .line 31088
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31089
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31090
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 31092
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31094
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31096
    :goto_0
    return-object p0
.end method

.method public addRealTimeDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 31074
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31075
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31076
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 31077
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31079
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31081
    :goto_0
    return-object p0
.end method

.method public addRealTimeDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 31043
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 31044
    if-nez p2, :cond_0

    .line 31045
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 31047
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31048
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 31049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31051
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31053
    :goto_0
    return-object p0
.end method

.method public addRealTimeDataList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 31060
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31061
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31062
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31063
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31065
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31067
    :goto_0
    return-object p0
.end method

.method public addRealTimeDataList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 31026
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 31027
    if-nez p1, :cond_0

    .line 31028
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 31030
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31031
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31032
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31034
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31036
    :goto_0
    return-object p0
.end method

.method public addRealTimeDataListBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31159
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 31160
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    .line 31159
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    return-object v0
.end method

.method public addRealTimeDataListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31167
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 31168
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    .line 31167
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 2

    .line 30818
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v1

    .line 30819
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 30820
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 30822
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 5

    .line 30826
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 30827
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30828
    const/4 v4, 0x0

    .line 30829
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 30830
    const/4 v4, 0x1

    .line 30832
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->stamp_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;J)J

    .line 30833
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 30834
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 30835
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30836
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30838
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 30840
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;Ljava/util/List;)Ljava/util/List;

    .line 30842
    :goto_0
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;I)I

    .line 30843
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onBuilt()V

    .line 30844
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 30792
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 30793
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->stamp_:J

    .line 30794
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30795
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 30796
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30797
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    goto :goto_0

    .line 30799
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 30801
    :goto_0
    return-object p0
.end method

.method public clearRealTimeDataList()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 31102
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31103
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 31104
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 31105
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31107
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 31109
    :goto_0
    return-object p0
.end method

.method public clearStamp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 30940
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30941
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->stamp_:J

    .line 30942
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    .line 30943
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 30805
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

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

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30756
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1

    .line 30814
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 30810
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$43300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1

    .line 30982
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 30983
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 30984
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 30986
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0

    .line 30988
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public getRealTimeDataListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31129
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    return-object v0
.end method

.method public getRealTimeDataListBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;>;"
        }
    .end annotation

    .line 31175
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeDataListCount()I
    .locals 1

    .line 30972
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 30973
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 30975
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getRealTimeDataListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation

    .line 30962
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 30963
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 30965
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeDataListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;
    .locals 1

    .line 31136
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 31137
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 31138
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 31140
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;

    return-object v0

    .line 31141
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;

    return-object v0
.end method

.method public getRealTimeDataListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;>;"
        }
    .end annotation

    .line 31149
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 31150
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 31152
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStamp()J
    .locals 2

    .line 30925
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->stamp_:J

    return-wide v0
.end method

.method public hasStamp()Z
    .locals 2

    .line 30919
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

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

    .line 30767
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$43400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    .line 30768
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 30767
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 30892
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

    .line 30756
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

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

    .line 30756
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

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

    .line 30756
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30756
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

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

    .line 30756
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30899
    const/4 v1, 0x0

    .line 30901
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 30906
    if-eqz v1, :cond_1

    .line 30907
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    goto :goto_0

    .line 30902
    :catch_0
    move-exception v2

    .line 30903
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-object v1, v0

    .line 30904
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30906
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 30907
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    .line 30909
    :cond_0
    throw v3

    .line 30910
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30848
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    if-eqz v0, :cond_0

    .line 30849
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0

    .line 30851
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 30852
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 30857
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 30858
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->hasStamp()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30859
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getStamp()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->setStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    .line 30861
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_3

    .line 30862
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 30863
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 30864
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30865
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    goto :goto_0

    .line 30867
    :cond_2
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 30868
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 30870
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_2

    .line 30873
    :cond_3
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 30874
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 30875
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 30876
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 30877
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    .line 30878
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30879
    .line 30880
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44300()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 30881
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->getRealTimeDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 30883
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 30887
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 30888
    return-object p0
.end method

.method public removeRealTimeDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 31115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31116
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31117
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 31118
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31120
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 31122
    :goto_0
    return-object p0
.end method

.method public setRealTimeDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 31013
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31014
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31015
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 31016
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31018
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31020
    :goto_0
    return-object p0
.end method

.method public setRealTimeDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30996
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 30997
    if-nez p2, :cond_0

    .line 30998
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 31000
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->ensureRealTimeDataListIsMutable()V

    .line 31001
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 31002
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    goto :goto_0

    .line 31004
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->realTimeDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31006
    :goto_0
    return-object p0
.end method

.method public setStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 30931
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->bitField0_:I

    .line 30932
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->stamp_:J

    .line 30933
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->onChanged()V

    .line 30934
    return-object p0
.end method
