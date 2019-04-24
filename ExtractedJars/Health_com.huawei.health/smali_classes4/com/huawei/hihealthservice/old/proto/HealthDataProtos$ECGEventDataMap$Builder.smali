.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;>;"
        }
    .end annotation
.end field

.field private eventDatas_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;>;"
        }
    .end annotation
.end field

.field private key_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 27656
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 27829
    .line 27830
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27657
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->maybeForceBuilderInitialization()V

    .line 27658
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 27662
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 27829
    .line 27830
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27663
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->maybeForceBuilderInitialization()V

    .line 27664
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 27639
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$38000()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27639
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27671
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;-><init>()V

    return-object v0
.end method

.method private ensureEventDatasIsMutable()V
    .locals 2

    .line 27832
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 27833
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27834
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27836
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 27645
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$37700()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;>;"
        }
    .end annotation

    .line 28063
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 28064
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 28068
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 28069
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 28070
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 28072
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 27666
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38200()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27667
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27669
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllEventDatas(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;"
        }
    .end annotation

    .line 27971
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27972
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27973
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 27975
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27977
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27979
    :goto_0
    return-object p0
.end method

.method public addEventDatas(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27957
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27958
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27959
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 27960
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27962
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27964
    :goto_0
    return-object p0
.end method

.method public addEventDatas(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27926
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 27927
    if-nez p2, :cond_0

    .line 27928
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27930
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27931
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 27932
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27934
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27936
    :goto_0
    return-object p0
.end method

.method public addEventDatas(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27943
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27944
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27945
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27946
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27948
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27950
    :goto_0
    return-object p0
.end method

.method public addEventDatas(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27909
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 27910
    if-nez p1, :cond_0

    .line 27911
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27913
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27914
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27915
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27917
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27919
    :goto_0
    return-object p0
.end method

.method public addEventDatasBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 28042
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 28043
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    .line 28042
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    return-object v0
.end method

.method public addEventDatasBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 2

    .line 28050
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 28051
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    .line 28050
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 2

    .line 27701
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    .line 27702
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 27703
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 27705
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 5

    .line 27709
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 27710
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27711
    const/4 v4, 0x0

    .line 27712
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 27713
    const/4 v4, 0x1

    .line 27715
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->key_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;I)I

    .line 27716
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 27717
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 27718
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27719
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27721
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 27723
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;Ljava/util/List;)Ljava/util/List;

    .line 27725
    :goto_0
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;I)I

    .line 27726
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onBuilt()V

    .line 27727
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27675
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 27676
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->key_:I

    .line 27677
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27678
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27679
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27680
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    goto :goto_0

    .line 27682
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 27684
    :goto_0
    return-object p0
.end method

.method public clearEventDatas()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27985
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27986
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27987
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27988
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27990
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 27992
    :goto_0
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27823
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27824
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->key_:I

    .line 27825
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    .line 27826
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27688
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

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

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 27639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1

    .line 27697
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 27693
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$37700()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getEventDatas(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
    .locals 1

    .line 27865
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 27866
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 27867
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 27869
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    return-object v0

    .line 27871
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    return-object v0
.end method

.method public getEventDatasBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;
    .locals 1

    .line 28012
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;

    return-object v0
.end method

.method public getEventDatasBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;>;"
        }
    .end annotation

    .line 28058
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEventDatasCount()I
    .locals 1

    .line 27855
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27856
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 27858
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getEventDatasList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;>;"
        }
    .end annotation

    .line 27845
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27846
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 27848
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEventDatasOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;
    .locals 1

    .line 28019
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 28020
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 28021
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 28023
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;

    return-object v0

    .line 28024
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;

    return-object v0
.end method

.method public getEventDatasOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;>;"
        }
    .end annotation

    .line 28032
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 28033
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 28035
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 27808
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->key_:I

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 27802
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

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

    .line 27650
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$37800()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    .line 27651
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 27650
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 27775
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

    .line 27639
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

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

    .line 27639
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

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

    .line 27639
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 27639
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

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

    .line 27639
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27782
    const/4 v1, 0x0

    .line 27784
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$33100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 27789
    if-eqz v1, :cond_1

    .line 27790
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    goto :goto_0

    .line 27785
    :catch_0
    move-exception v2

    .line 27786
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-object v1, v0

    .line 27787
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27789
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 27790
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    .line 27792
    :cond_0
    throw v3

    .line 27793
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27731
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    if-eqz v0, :cond_0

    .line 27732
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0

    .line 27734
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 27735
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27740
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 27741
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27742
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getKey()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    .line 27744
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_3

    .line 27745
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 27746
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 27747
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27748
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    goto :goto_0

    .line 27750
    :cond_2
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27751
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 27753
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_2

    .line 27756
    :cond_3
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 27757
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 27758
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 27759
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27760
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    .line 27761
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27762
    .line 27763
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38700()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 27764
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->getEventDatasFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 27766
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27770
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 27771
    return-object p0
.end method

.method public removeEventDatas(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27998
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27999
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 28000
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 28001
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 28003
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 28005
    :goto_0
    return-object p0
.end method

.method public setEventDatas(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27896
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 27897
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27898
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 27899
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27901
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27903
    :goto_0
    return-object p0
.end method

.method public setEventDatas(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27879
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 27880
    if-nez p2, :cond_0

    .line 27881
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 27883
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->ensureEventDatasIsMutable()V

    .line 27884
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 27885
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    goto :goto_0

    .line 27887
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->eventDatasBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 27889
    :goto_0
    return-object p0
.end method

.method public setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27814
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->bitField0_:I

    .line 27815
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->key_:I

    .line 27816
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->onChanged()V

    .line 27817
    return-object p0
.end method
