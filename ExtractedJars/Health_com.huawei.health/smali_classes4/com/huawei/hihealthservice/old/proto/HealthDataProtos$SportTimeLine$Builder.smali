.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;"
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

.field private realSteps_:I

.field private totalCalory_:I

.field private totalDistance_:I

.field private totalSteps_:I

.field private totalStoreys_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 9185
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 9338
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9186
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 9187
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 9191
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 9338
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9192
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->maybeForceBuilderInitialization()V

    .line 9193
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 9168
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$12200()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9168
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9200
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;-><init>()V

    return-object v0
.end method

.method private getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;>;"
        }
    .end annotation

    .line 9443
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 9444
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 9446
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    .line 9447
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 9448
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 9449
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9451
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 9174
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$11900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 9195
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$12400()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9196
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 9198
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 2

    .line 9238
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v1

    .line 9239
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9240
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 9242
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 5

    .line 9246
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 9247
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9248
    const/4 v4, 0x0

    .line 9249
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 9250
    const/4 v4, 0x1

    .line 9252
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 9253
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$12602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 9255
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$12602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9257
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 9258
    or-int/lit8 v4, v4, 0x2

    .line 9260
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalSteps_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$12702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I

    .line 9261
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 9262
    or-int/lit8 v4, v4, 0x4

    .line 9264
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalCalory_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$12802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I

    .line 9265
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 9266
    or-int/lit8 v4, v4, 0x8

    .line 9268
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalDistance_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$12902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I

    .line 9269
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 9270
    or-int/lit8 v4, v4, 0x10

    .line 9272
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalStoreys_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$13002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I

    .line 9273
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 9274
    or-int/lit8 v4, v4, 0x20

    .line 9276
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->realSteps_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$13102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I

    .line 9277
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$13202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I

    .line 9278
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onBuilt()V

    .line 9279
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9204
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 9205
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 9206
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 9208
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 9210
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9211
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalSteps_:I

    .line 9212
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9213
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalCalory_:I

    .line 9214
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9215
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalDistance_:I

    .line 9216
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9217
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalStoreys_:I

    .line 9218
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9219
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->realSteps_:I

    .line 9220
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9221
    return-object p0
.end method

.method public clearBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9410
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 9411
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9412
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 9414
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 9416
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9417
    return-object p0
.end method

.method public clearRealSteps()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9608
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9609
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->realSteps_:I

    .line 9610
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9611
    return-object p0
.end method

.method public clearTotalCalory()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9512
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9513
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalCalory_:I

    .line 9514
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9515
    return-object p0
.end method

.method public clearTotalDistance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9544
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9545
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalDistance_:I

    .line 9546
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9547
    return-object p0
.end method

.method public clearTotalSteps()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9480
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9481
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalSteps_:I

    .line 9482
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9483
    return-object p0
.end method

.method public clearTotalStoreys()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9576
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9577
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalStoreys_:I

    .line 9578
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9579
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9225
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

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

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 9351
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 9352
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0

    .line 9354
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getBaseTimeLineBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 9423
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9424
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9425
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->getBaseTimeLineFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    return-object v0
.end method

.method public getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
    .locals 1

    .line 9431
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 9432
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    return-object v0

    .line 9434
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 9168
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1

    .line 9234
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 9230
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$11900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getRealSteps()I
    .locals 1

    .line 9593
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->realSteps_:I

    return v0
.end method

.method public getTotalCalory()I
    .locals 1

    .line 9497
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalCalory_:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 9529
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalDistance_:I

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 9465
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalSteps_:I

    return v0
.end method

.method public getTotalStoreys()I
    .locals 1

    .line 9561
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalStoreys_:I

    return v0
.end method

.method public hasBaseTimeLine()Z
    .locals 2

    .line 9345
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

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

.method public hasRealSteps()Z
    .locals 2

    .line 9587
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

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

.method public hasTotalCalory()Z
    .locals 2

    .line 9491
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

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

.method public hasTotalDistance()Z
    .locals 2

    .line 9523
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

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

.method public hasTotalSteps()Z
    .locals 2

    .line 9459
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

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

    .line 9555
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 9179
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$12000()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9180
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 9179
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 9316
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9391
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 9392
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9393
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 9394
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9395
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    goto :goto_0

    .line 9397
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9399
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    goto :goto_1

    .line 9401
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 9403
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9404
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9168
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

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

    .line 9168
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

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

    .line 9168
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 9168
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

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

    .line 9168
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9323
    const/4 v1, 0x0

    .line 9325
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$13300()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 9330
    if-eqz v1, :cond_1

    .line 9331
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    goto :goto_0

    .line 9326
    :catch_0
    move-exception v2

    .line 9327
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-object v1, v0

    .line 9328
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9330
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 9331
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9333
    :cond_0
    throw v3

    .line 9334
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9283
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    if-eqz v0, :cond_0

    .line 9284
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0

    .line 9286
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 9287
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9292
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 9293
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasBaseTimeLine()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9294
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9296
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalSteps()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9297
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalSteps()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->setTotalSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9299
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalCalory()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9300
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalCalory()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->setTotalCalory(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9302
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalDistance()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9303
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalDistance()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9305
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalStoreys()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 9306
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalStoreys()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->setTotalStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9308
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasRealSteps()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 9309
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getRealSteps()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->setRealSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 9311
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 9312
    return-object p0
.end method

.method public setBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9378
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 9379
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 9382
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 9384
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9385
    return-object p0
.end method

.method public setBaseTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9361
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 9362
    if-nez p1, :cond_0

    .line 9363
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 9365
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9366
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    goto :goto_0

    .line 9368
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->baseTimeLineBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 9370
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9371
    return-object p0
.end method

.method public setRealSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9599
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9600
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->realSteps_:I

    .line 9601
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9602
    return-object p0
.end method

.method public setTotalCalory(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9503
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9504
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalCalory_:I

    .line 9505
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9506
    return-object p0
.end method

.method public setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9535
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9536
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalDistance_:I

    .line 9537
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9538
    return-object p0
.end method

.method public setTotalSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9471
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9472
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalSteps_:I

    .line 9473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9474
    return-object p0
.end method

.method public setTotalStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9567
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->bitField0_:I

    .line 9568
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->totalStoreys_:I

    .line 9569
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->onChanged()V

    .line 9570
    return-object p0
.end method
