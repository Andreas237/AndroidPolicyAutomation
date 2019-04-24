.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;"
    }
.end annotation


# instance fields
.field private baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;>;"
        }
    .end annotation
.end field

.field private baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

.field private bitField0_:I

.field private heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;>;"
        }
    .end annotation
.end field

.field private heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

.field private motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;>;"
        }
    .end annotation
.end field

.field private motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

.field private sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;>;"
        }
    .end annotation
.end field

.field private sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

.field private totalCalory_:I

.field private totalDistance_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 14680
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 14860
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14976
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15092
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15208
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14681
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 14682
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 14686
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 14860
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14976
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15092
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15208
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14687
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 14688
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 14663
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$19300()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14663
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14698
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;-><init>()V

    return-object v0
.end method

.method private getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;>;"
        }
    .end annotation

    .line 14965
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 14966
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 14968
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    .line 14969
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 14970
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 14971
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14973
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 14669
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$19000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getHeartRateTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;>;"
        }
    .end annotation

    .line 15197
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15198
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 15200
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getHeartRateTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v1

    .line 15201
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 15202
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 15203
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15205
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private getMotionPathFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;>;"
        }
    .end annotation

    .line 15313
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15314
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 15316
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getMotionPath()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v1

    .line 15317
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 15318
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 15319
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15321
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private getSportTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;>;"
        }
    .end annotation

    .line 15081
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15082
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 15084
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getSportTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v1

    .line 15085
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 15086
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 15087
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15089
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 14690
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19500()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14691
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14692
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getSportTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14693
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getHeartRateTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14694
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getMotionPathFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14696
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 2

    .line 14748
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    .line 14749
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14750
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 14752
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 5

    .line 14756
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 14757
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14758
    const/4 v4, 0x0

    .line 14759
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 14760
    const/4 v4, 0x1

    .line 14762
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 14763
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 14765
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14767
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 14768
    or-int/lit8 v4, v4, 0x2

    .line 14770
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_3

    .line 14771
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    goto :goto_1

    .line 14773
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 14775
    :goto_1
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 14776
    or-int/lit8 v4, v4, 0x4

    .line 14778
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_5

    .line 14779
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    goto :goto_2

    .line 14781
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$19902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 14783
    :goto_2
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_6

    .line 14784
    or-int/lit8 v4, v4, 0x8

    .line 14786
    :cond_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_7

    .line 14787
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    goto :goto_3

    .line 14789
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14791
    :goto_3
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_8

    .line 14792
    or-int/lit8 v4, v4, 0x10

    .line 14794
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalCalory_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;I)I

    .line 14795
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_9

    .line 14796
    or-int/lit8 v4, v4, 0x20

    .line 14798
    :cond_9
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalDistance_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;I)I

    .line 14799
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;I)I

    .line 14800
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onBuilt()V

    .line 14801
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14702
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 14703
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 14704
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 14706
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14708
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14709
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 14710
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    goto :goto_1

    .line 14712
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14714
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14715
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_2

    .line 14716
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    goto :goto_2

    .line 14718
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14720
    :goto_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14721
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_3

    .line 14722
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    goto :goto_3

    .line 14724
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14726
    :goto_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14727
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalCalory_:I

    .line 14728
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14729
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalDistance_:I

    .line 14730
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14731
    return-object p0
.end method

.method public clearBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14932
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 14933
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14934
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 14936
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 14938
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14939
    return-object p0
.end method

.method public clearHeartRateTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15164
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15165
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15166
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15168
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 15170
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15171
    return-object p0
.end method

.method public clearMotionPath()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15280
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15281
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15282
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15284
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 15286
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15287
    return-object p0
.end method

.method public clearSportTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15048
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15049
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15050
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15052
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 15054
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15055
    return-object p0
.end method

.method public clearTotalCalory()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15350
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15351
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalCalory_:I

    .line 15352
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15353
    return-object p0
.end method

.method public clearTotalDistance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15382
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15383
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalDistance_:I

    .line 15384
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15385
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14735
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

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

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 14873
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 14874
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0

    .line 14876
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getBaseTimeLineBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 14945
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14946
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 14947
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    return-object v0
.end method

.method public getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
    .locals 1

    .line 14953
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 14954
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    return-object v0

    .line 14956
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 14663
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1

    .line 14744
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 14740
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$19000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getHeartRateTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1

    .line 15105
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15106
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0

    .line 15108
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public getHeartRateTimeLineBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 15177
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15178
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15179
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getHeartRateTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    return-object v0
.end method

.method public getHeartRateTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;
    .locals 1

    .line 15185
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 15186
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;

    return-object v0

    .line 15188
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public getMotionPath()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1

    .line 15221
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15222
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0

    .line 15224
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public getMotionPathBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 15293
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15294
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15295
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getMotionPathFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    return-object v0
.end method

.method public getMotionPathOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;
    .locals 1

    .line 15301
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 15302
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;

    return-object v0

    .line 15304
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public getSportTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1

    .line 14989
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 14990
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0

    .line 14992
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public getSportTimeLineBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 15061
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15062
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15063
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->getSportTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    return-object v0
.end method

.method public getSportTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;
    .locals 1

    .line 15069
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 15070
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;

    return-object v0

    .line 15072
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public getTotalCalory()I
    .locals 1

    .line 15335
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalCalory_:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 15367
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalDistance_:I

    return v0
.end method

.method public hasBaseTimeLine()Z
    .locals 2

    .line 14867
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

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

.method public hasHeartRateTimeLine()Z
    .locals 2

    .line 15099
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

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

.method public hasMotionPath()Z
    .locals 2

    .line 15215
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

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

.method public hasSportTimeLine()Z
    .locals 2

    .line 14983
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

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

.method public hasTotalCalory()Z
    .locals 2

    .line 15329
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

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

    .line 15361
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

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

    .line 14674
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$19100()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14675
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 14674
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 14838
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14913
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 14914
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14915
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 14916
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14917
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 14919
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14921
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 14923
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 14925
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14926
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14663
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

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

    .line 14663
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

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

    .line 14663
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14663
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

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

    .line 14663
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14845
    const/4 v1, 0x0

    .line 14847
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 14852
    if-eqz v1, :cond_1

    .line 14853
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    goto :goto_0

    .line 14848
    :catch_0
    move-exception v2

    .line 14849
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-object v1, v0

    .line 14850
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14852
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 14853
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14855
    :cond_0
    throw v3

    .line 14856
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14805
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    if-eqz v0, :cond_0

    .line 14806
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0

    .line 14808
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 14809
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14814
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 14815
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasBaseTimeLine()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14816
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14818
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasSportTimeLine()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14819
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getSportTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeSportTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14821
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasHeartRateTimeLine()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14822
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getHeartRateTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeHeartRateTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14824
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasMotionPath()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14825
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getMotionPath()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14827
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasTotalCalory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14828
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getTotalCalory()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->setTotalCalory(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14830
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasTotalDistance()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14831
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getTotalDistance()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14833
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 14834
    return-object p0
.end method

.method public mergeHeartRateTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15145
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15146
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15147
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 15148
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15149
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    goto :goto_0

    .line 15151
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15153
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 15155
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15157
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15158
    return-object p0
.end method

.method public mergeMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15261
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15262
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15263
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 15264
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15265
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    goto :goto_0

    .line 15267
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15269
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 15271
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15273
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15274
    return-object p0
.end method

.method public mergeSportTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15029
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15030
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15031
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 15032
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15033
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    goto :goto_0

    .line 15035
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15037
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 15039
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15041
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15042
    return-object p0
.end method

.method public setBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14900
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 14901
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14902
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 14904
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 14906
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14907
    return-object p0
.end method

.method public setBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14883
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 14884
    if-nez p1, :cond_0

    .line 14885
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 14887
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14888
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 14890
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 14892
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 14893
    return-object p0
.end method

.method public setHeartRateTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15132
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15133
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15134
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15136
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15138
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15139
    return-object p0
.end method

.method public setHeartRateTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15116
    if-nez p1, :cond_0

    .line 15117
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 15119
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 15120
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15122
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->heartRateTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15124
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15125
    return-object p0
.end method

.method public setMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15248
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15249
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15250
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15252
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15254
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15255
    return-object p0
.end method

.method public setMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15231
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15232
    if-nez p1, :cond_0

    .line 15233
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 15235
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 15236
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15238
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->motionPathBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15240
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15241
    return-object p0
.end method

.method public setSportTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15016
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 15017
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15018
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15020
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15022
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15023
    return-object p0
.end method

.method public setSportTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14999
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 15000
    if-nez p1, :cond_0

    .line 15001
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 15003
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 15004
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 15006
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->sportTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 15008
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15009
    return-object p0
.end method

.method public setTotalCalory(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15341
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15342
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalCalory_:I

    .line 15343
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15344
    return-object p0
.end method

.method public setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 15373
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->bitField0_:I

    .line 15374
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->totalDistance_:I

    .line 15375
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->onChanged()V

    .line 15376
    return-object p0
.end method
