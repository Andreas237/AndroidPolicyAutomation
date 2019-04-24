.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;"
    }
.end annotation


# instance fields
.field private arrhythmia_:I

.field private bitField0_:I

.field private ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;>;"
        }
    .end annotation
.end field

.field private ecgValue_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;>;"
        }
    .end annotation
.end field

.field private heartRate_:I

.field private timeStamp_:J


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31615
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 31870
    .line 31871
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31616
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->maybeForceBuilderInitialization()V

    .line 31617
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 31621
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 31870
    .line 31871
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31622
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->maybeForceBuilderInitialization()V

    .line 31623
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 31598
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$44900()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31598
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31630
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;-><init>()V

    return-object v0
.end method

.method private ensureEcgValueIsMutable()V
    .locals 2

    .line 31873
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 31874
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31875
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31877
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 31604
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$44600()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;>;"
        }
    .end annotation

    .line 32104
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 32105
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 32109
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 32110
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 32111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 32113
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 31625
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45100()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31626
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31628
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllEcgValue(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;"
        }
    .end annotation

    .line 32012
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 32013
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 32014
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 32016
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 32018
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 32020
    :goto_0
    return-object p0
.end method

.method public addEcgValue(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31998
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31999
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 32000
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 32001
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 32003
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 32005
    :goto_0
    return-object p0
.end method

.method public addEcgValue(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31967
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 31968
    if-nez p2, :cond_0

    .line 31969
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 31971
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 31972
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 31973
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 31975
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31977
    :goto_0
    return-object p0
.end method

.method public addEcgValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31984
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31985
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 31986
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31987
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 31989
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31991
    :goto_0
    return-object p0
.end method

.method public addEcgValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31950
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 31951
    if-nez p1, :cond_0

    .line 31952
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 31954
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 31955
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31956
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 31958
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31960
    :goto_0
    return-object p0
.end method

.method public addEcgValueBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;
    .locals 2

    .line 32083
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 32084
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    .line 32083
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;

    return-object v0
.end method

.method public addEcgValueBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;
    .locals 2

    .line 32091
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 32092
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    .line 32091
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 2

    .line 31664
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    .line 31665
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 31666
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 31668
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 5

    .line 31672
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 31673
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31674
    const/4 v4, 0x0

    .line 31675
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 31676
    const/4 v4, 0x1

    .line 31678
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->timeStamp_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;J)J

    .line 31679
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 31680
    or-int/lit8 v4, v4, 0x2

    .line 31682
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->heartRate_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;I)I

    .line 31683
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 31684
    or-int/lit8 v4, v4, 0x4

    .line 31686
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->arrhythmia_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;I)I

    .line 31687
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_4

    .line 31688
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 31689
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31690
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31692
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 31694
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;Ljava/util/List;)Ljava/util/List;

    .line 31696
    :goto_0
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;I)I

    .line 31697
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onBuilt()V

    .line 31698
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31634
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 31635
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->timeStamp_:J

    .line 31636
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31637
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->heartRate_:I

    .line 31638
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31639
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->arrhythmia_:I

    .line 31640
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31641
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31642
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31643
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    goto :goto_0

    .line 31645
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 31647
    :goto_0
    return-object p0
.end method

.method public clearArrhythmia()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31864
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31865
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->arrhythmia_:I

    .line 31866
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    .line 31867
    return-object p0
.end method

.method public clearEcgValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 32026
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 32027
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 32028
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 32029
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 32031
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 32033
    :goto_0
    return-object p0
.end method

.method public clearHeartRate()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31832
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31833
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->heartRate_:I

    .line 31834
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    .line 31835
    return-object p0
.end method

.method public clearTimeStamp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31800
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31801
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->timeStamp_:J

    .line 31802
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    .line 31803
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31651
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

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

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getArrhythmia()I
    .locals 1

    .line 31849
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->arrhythmia_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 31598
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1

    .line 31660
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 31656
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$44600()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getEcgValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;
    .locals 1

    .line 31906
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 31907
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 31908
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 31910
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    return-object v0

    .line 31912
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    return-object v0
.end method

.method public getEcgValueBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;
    .locals 1

    .line 32053
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;

    return-object v0
.end method

.method public getEcgValueBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;>;"
        }
    .end annotation

    .line 32099
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEcgValueCount()I
    .locals 1

    .line 31896
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31897
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 31899
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getEcgValueList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;>;"
        }
    .end annotation

    .line 31886
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31887
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 31889
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEcgValueOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;
    .locals 1

    .line 32060
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 32061
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 32062
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 32064
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;

    return-object v0

    .line 32065
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;

    return-object v0
.end method

.method public getEcgValueOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;>;"
        }
    .end annotation

    .line 32073
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 32074
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 32076
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getHeartRate()I
    .locals 1

    .line 31817
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->heartRate_:I

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 31785
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->timeStamp_:J

    return-wide v0
.end method

.method public hasArrhythmia()Z
    .locals 2

    .line 31843
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

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

.method public hasHeartRate()Z
    .locals 2

    .line 31811
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

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

.method public hasTimeStamp()Z
    .locals 2

    .line 31779
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

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

    .line 31609
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$44700()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    .line 31610
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 31609
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 31752
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

    .line 31598
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

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

    .line 31598
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

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

    .line 31598
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 31598
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

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

    .line 31598
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31759
    const/4 v1, 0x0

    .line 31761
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$43200()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 31766
    if-eqz v1, :cond_1

    .line 31767
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    goto :goto_0

    .line 31762
    :catch_0
    move-exception v2

    .line 31763
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-object v1, v0

    .line 31764
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31766
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 31767
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    .line 31769
    :cond_0
    throw v3

    .line 31770
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31702
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    if-eqz v0, :cond_0

    .line 31703
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0

    .line 31705
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 31706
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31711
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 31712
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->hasTimeStamp()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31713
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getTimeStamp()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->setTimeStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    .line 31715
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->hasHeartRate()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31716
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getHeartRate()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->setHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    .line 31718
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->hasArrhythmia()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31719
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getArrhythmia()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->setArrhythmia(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    .line 31721
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_5

    .line 31722
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 31723
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 31724
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31725
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    goto :goto_0

    .line 31727
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 31728
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 31730
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_2

    .line 31733
    :cond_5
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 31734
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 31735
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 31736
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31737
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    .line 31738
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31739
    .line 31740
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45800()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 31741
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->getEcgValueFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 31743
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31747
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 31748
    return-object p0
.end method

.method public removeEcgValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 32039
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 32040
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 32041
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 32042
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 32044
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 32046
    :goto_0
    return-object p0
.end method

.method public setArrhythmia(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31855
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31856
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->arrhythmia_:I

    .line 31857
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    .line 31858
    return-object p0
.end method

.method public setEcgValue(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31937
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 31938
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 31939
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 31940
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 31942
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31944
    :goto_0
    return-object p0
.end method

.method public setEcgValue(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31920
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 31921
    if-nez p2, :cond_0

    .line 31922
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 31924
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ensureEcgValueIsMutable()V

    .line 31925
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 31926
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    goto :goto_0

    .line 31928
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->ecgValueBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 31930
    :goto_0
    return-object p0
.end method

.method public setHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31823
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31824
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->heartRate_:I

    .line 31825
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    .line 31826
    return-object p0
.end method

.method public setTimeStamp(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31791
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->bitField0_:I

    .line 31792
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->timeStamp_:J

    .line 31793
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->onChanged()V

    .line 31794
    return-object p0
.end method
