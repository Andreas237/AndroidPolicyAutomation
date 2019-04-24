.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;"
    }
.end annotation


# instance fields
.field private avgHeartRate_:I

.field private baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;>;"
        }
    .end annotation
.end field

.field private baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

.field private bitField0_:I

.field private heartRateValues_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private maxHeartRate_:I

.field private minHeartRate_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 10084
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 10236
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10448
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10085
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 10086
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 10090
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 10236
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10448
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10091
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 10092
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 10067
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$13700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10067
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10099
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;-><init>()V

    return-object v0
.end method

.method private ensureHeartRateValuesIsMutable()V
    .locals 2

    .line 10450
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    .line 10451
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10452
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10454
    :cond_0
    return-void
.end method

.method private getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;>;"
        }
    .end annotation

    .line 10341
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 10342
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 10344
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    .line 10345
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 10346
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 10347
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10349
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 10073
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$13400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 10094
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$13900()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10095
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 10097
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllHeartRateValues(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Ljava/lang/Integer;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;"
        }
    .end annotation

    .line 10501
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->ensureHeartRateValuesIsMutable()V

    .line 10502
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 10504
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10505
    return-object p0
.end method

.method public addHeartRateValues(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10491
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->ensureHeartRateValuesIsMutable()V

    .line 10492
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10493
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10494
    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 2

    .line 10135
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v1

    .line 10136
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 10137
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 10139
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 5

    .line 10143
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 10144
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10145
    const/4 v4, 0x0

    .line 10146
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 10147
    const/4 v4, 0x1

    .line 10149
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 10150
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 10152
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10154
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 10155
    or-int/lit8 v4, v4, 0x2

    .line 10157
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maxHeartRate_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I

    .line 10158
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 10159
    or-int/lit8 v4, v4, 0x4

    .line 10161
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->minHeartRate_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I

    .line 10162
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 10163
    or-int/lit8 v4, v4, 0x8

    .line 10165
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->avgHeartRate_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I

    .line 10166
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 10167
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10168
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10170
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Ljava/util/List;)Ljava/util/List;

    .line 10171
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I

    .line 10172
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onBuilt()V

    .line 10173
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10103
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 10104
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 10105
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 10107
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 10109
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10110
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maxHeartRate_:I

    .line 10111
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10112
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->minHeartRate_:I

    .line 10113
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->avgHeartRate_:I

    .line 10115
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10116
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10117
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10118
    return-object p0
.end method

.method public clearAvgHeartRate()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10442
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10443
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->avgHeartRate_:I

    .line 10444
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10445
    return-object p0
.end method

.method public clearBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10308
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 10309
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10310
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 10312
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 10314
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10315
    return-object p0
.end method

.method public clearHeartRateValues()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10511
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10512
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10514
    return-object p0
.end method

.method public clearMaxHeartRate()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10378
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10379
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maxHeartRate_:I

    .line 10380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10381
    return-object p0
.end method

.method public clearMinHeartRate()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10410
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10411
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->minHeartRate_:I

    .line 10412
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10413
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10122
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

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

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAvgHeartRate()I
    .locals 1

    .line 10427
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->avgHeartRate_:I

    return v0
.end method

.method public getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 10249
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 10250
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0

    .line 10252
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getBaseTimeLineBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 10321
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10322
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10323
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    return-object v0
.end method

.method public getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
    .locals 1

    .line 10329
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 10330
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    return-object v0

    .line 10332
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 10067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1

    .line 10131
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 10127
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$13400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getHeartRateValues(I)I
    .locals 1

    .line 10472
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 10473
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 10475
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getHeartRateValuesCount()I
    .locals 1

    .line 10466
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getHeartRateValuesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 10460
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 10363
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maxHeartRate_:I

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 10395
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->minHeartRate_:I

    return v0
.end method

.method public hasAvgHeartRate()Z
    .locals 2

    .line 10421
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

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

.method public hasBaseTimeLine()Z
    .locals 2

    .line 10243
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

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

.method public hasMaxHeartRate()Z
    .locals 2

    .line 10357
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

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

.method public hasMinHeartRate()Z
    .locals 2

    .line 10389
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 10078
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$13500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 10079
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 10078
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 10214
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10289
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 10290
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10291
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 10292
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10293
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 10295
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10297
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 10299
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 10301
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10302
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10067
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

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

    .line 10067
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

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

    .line 10067
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 10067
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

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

    .line 10067
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10221
    const/4 v1, 0x0

    .line 10223
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14700()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 10228
    if-eqz v1, :cond_1

    .line 10229
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    goto :goto_0

    .line 10224
    :catch_0
    move-exception v2

    .line 10225
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-object v1, v0

    .line 10226
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10228
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 10229
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 10231
    :cond_0
    throw v3

    .line 10232
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10177
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    if-eqz v0, :cond_0

    .line 10178
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0

    .line 10180
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 10181
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10186
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 10187
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasBaseTimeLine()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10188
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 10190
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasMaxHeartRate()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10191
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->setMaxHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 10193
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasMinHeartRate()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10194
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getMinHeartRate()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->setMinHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 10196
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasAvgHeartRate()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10197
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getAvgHeartRate()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->setAvgHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 10199
    :cond_4
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 10200
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10201
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    .line 10202
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    goto :goto_0

    .line 10204
    :cond_5
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->ensureHeartRateValuesIsMutable()V

    .line 10205
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 10207
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10209
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 10210
    return-object p0
.end method

.method public setAvgHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10433
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10434
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->avgHeartRate_:I

    .line 10435
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10436
    return-object p0
.end method

.method public setBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10276
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 10277
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10278
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 10280
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 10282
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10283
    return-object p0
.end method

.method public setBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10259
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 10260
    if-nez p1, :cond_0

    .line 10261
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 10263
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 10264
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 10266
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 10268
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10269
    return-object p0
.end method

.method public setHeartRateValues(II)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10482
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->ensureHeartRateValuesIsMutable()V

    .line 10483
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->heartRateValues_:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10484
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10485
    return-object p0
.end method

.method public setMaxHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10369
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10370
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->maxHeartRate_:I

    .line 10371
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10372
    return-object p0
.end method

.method public setMinHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10401
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->bitField0_:I

    .line 10402
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->minHeartRate_:I

    .line 10403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->onChanged()V

    .line 10404
    return-object p0
.end method
