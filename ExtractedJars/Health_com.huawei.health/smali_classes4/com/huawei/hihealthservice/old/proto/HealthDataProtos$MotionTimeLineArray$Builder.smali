.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArrayOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;>;"
        }
    .end annotation
.end field

.field private motionTimeLine_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 17581
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 17711
    .line 17712
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17582
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->maybeForceBuilderInitialization()V

    .line 17583
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 17587
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 17711
    .line 17712
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17588
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->maybeForceBuilderInitialization()V

    .line 17589
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 17564
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$23800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17564
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17596
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;-><init>()V

    return-object v0
.end method

.method private ensureMotionTimeLineIsMutable()V
    .locals 2

    .line 17714
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 17715
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17716
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    .line 17718
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 17570
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$23500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;>;"
        }
    .end annotation

    .line 17945
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 17946
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 17950
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 17951
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17952
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17954
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 17591
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17592
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17594
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllMotionTimeLine(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;"
        }
    .end annotation

    .line 17853
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17854
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17855
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 17857
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17859
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17861
    :goto_0
    return-object p0
.end method

.method public addMotionTimeLine(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17839
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17840
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17841
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 17842
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17844
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17846
    :goto_0
    return-object p0
.end method

.method public addMotionTimeLine(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17808
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 17809
    if-nez p2, :cond_0

    .line 17810
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 17812
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17813
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 17814
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17816
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17818
    :goto_0
    return-object p0
.end method

.method public addMotionTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17825
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17826
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17827
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17828
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17830
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17832
    :goto_0
    return-object p0
.end method

.method public addMotionTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17791
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 17792
    if-nez p1, :cond_0

    .line 17793
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 17795
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17796
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17797
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17799
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17801
    :goto_0
    return-object p0
.end method

.method public addMotionTimeLineBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 17924
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 17925
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    .line 17924
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    return-object v0
.end method

.method public addMotionTimeLineBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 17932
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 17933
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    .line 17932
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 2

    .line 17624
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v1

    .line 17625
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17626
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 17628
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 4

    .line 17632
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 17633
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    .line 17634
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 17635
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 17636
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17637
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    .line 17639
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 17641
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;Ljava/util/List;)Ljava/util/List;

    .line 17643
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onBuilt()V

    .line 17644
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17600
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 17601
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17602
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17603
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    goto :goto_0

    .line 17605
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 17607
    :goto_0
    return-object p0
.end method

.method public clearMotionTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17867
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17868
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17869
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    .line 17870
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17872
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 17874
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17611
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

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

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 17564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1

    .line 17620
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 17616
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$23500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getMotionTimeLine(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1

    .line 17747
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 17748
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 17749
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 17751
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0

    .line 17753
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public getMotionTimeLineBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 17894
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    return-object v0
.end method

.method public getMotionTimeLineBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;>;"
        }
    .end annotation

    .line 17940
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMotionTimeLineCount()I
    .locals 1

    .line 17737
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17738
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 17740
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getMotionTimeLineList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;>;"
        }
    .end annotation

    .line 17727
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17728
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 17730
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMotionTimeLineOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;
    .locals 1

    .line 17901
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 17902
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 17903
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 17905
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;

    return-object v0

    .line 17906
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;

    return-object v0
.end method

.method public getMotionTimeLineOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;>;"
        }
    .end annotation

    .line 17914
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 17915
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 17917
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 17575
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$23600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    .line 17576
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 17575
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 17689
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

    .line 17564
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

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

    .line 17564
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

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

    .line 17564
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17564
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

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

    .line 17564
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17696
    const/4 v1, 0x0

    .line 17698
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 17703
    if-eqz v1, :cond_1

    .line 17704
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    goto :goto_0

    .line 17699
    :catch_0
    move-exception v2

    .line 17700
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-object v1, v0

    .line 17701
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17703
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 17704
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    .line 17706
    :cond_0
    throw v3

    .line 17707
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17648
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    if-eqz v0, :cond_0

    .line 17649
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0

    .line 17651
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 17652
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17657
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 17658
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 17659
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 17660
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17661
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17662
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    goto :goto_0

    .line 17664
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17665
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17667
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_2

    .line 17670
    :cond_2
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 17671
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 17672
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 17673
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17674
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    .line 17675
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->bitField0_:I

    .line 17676
    .line 17677
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24300()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 17678
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->getMotionTimeLineFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 17680
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17684
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 17685
    return-object p0
.end method

.method public removeMotionTimeLine(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17880
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17881
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17882
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 17883
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17885
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 17887
    :goto_0
    return-object p0
.end method

.method public setMotionTimeLine(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17778
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 17779
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17780
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 17781
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17783
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17785
    :goto_0
    return-object p0
.end method

.method public setMotionTimeLine(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17761
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 17762
    if-nez p2, :cond_0

    .line 17763
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 17765
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->ensureMotionTimeLineIsMutable()V

    .line 17766
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 17767
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->onChanged()V

    goto :goto_0

    .line 17769
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->motionTimeLineBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 17771
    :goto_0
    return-object p0
.end method
