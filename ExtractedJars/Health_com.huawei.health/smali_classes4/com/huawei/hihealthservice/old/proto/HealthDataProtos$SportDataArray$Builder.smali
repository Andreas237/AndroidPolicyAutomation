.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArrayOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private sportData_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 18268
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 18398
    .line 18399
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18269
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->maybeForceBuilderInitialization()V

    .line 18270
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 18274
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 18398
    .line 18399
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18275
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->maybeForceBuilderInitialization()V

    .line 18276
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 18251
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$24800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18251
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18283
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;-><init>()V

    return-object v0
.end method

.method private ensureSportDataIsMutable()V
    .locals 2

    .line 18401
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 18402
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18403
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    .line 18405
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 18257
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$24500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;>;"
        }
    .end annotation

    .line 18632
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 18633
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 18637
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 18638
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18639
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18641
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 18278
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18279
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18281
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllSportData(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;"
        }
    .end annotation

    .line 18540
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18541
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18542
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 18544
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18546
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18548
    :goto_0
    return-object p0
.end method

.method public addSportData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18526
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18527
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18528
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 18529
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18531
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18533
    :goto_0
    return-object p0
.end method

.method public addSportData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18495
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 18496
    if-nez p2, :cond_0

    .line 18497
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 18499
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18500
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 18501
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18503
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18505
    :goto_0
    return-object p0
.end method

.method public addSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18512
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18513
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18514
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18515
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18517
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18519
    :goto_0
    return-object p0
.end method

.method public addSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18478
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 18479
    if-nez p1, :cond_0

    .line 18480
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 18482
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18483
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18484
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18486
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18488
    :goto_0
    return-object p0
.end method

.method public addSportDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 18611
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 18612
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    .line 18611
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    return-object v0
.end method

.method public addSportDataBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 18619
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 18620
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    .line 18619
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 2

    .line 18311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v1

    .line 18312
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18313
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 18315
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 4

    .line 18319
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 18320
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    .line 18321
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 18322
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 18323
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18324
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    .line 18326
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 18328
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;Ljava/util/List;)Ljava/util/List;

    .line 18330
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onBuilt()V

    .line 18331
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18287
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 18288
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18289
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18290
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    goto :goto_0

    .line 18292
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 18294
    :goto_0
    return-object p0
.end method

.method public clearSportData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18554
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18555
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18556
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    .line 18557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18559
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 18561
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18298
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

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

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1

    .line 18307
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 18303
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$24500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getSportData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1

    .line 18434
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 18435
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 18436
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 18438
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0

    .line 18440
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public getSportDataBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 18581
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    return-object v0
.end method

.method public getSportDataBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;>;"
        }
    .end annotation

    .line 18627
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSportDataCount()I
    .locals 1

    .line 18424
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18425
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 18427
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getSportDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;"
        }
    .end annotation

    .line 18414
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18415
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 18417
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSportDataOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;
    .locals 1

    .line 18588
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 18589
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 18590
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 18592
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;

    return-object v0

    .line 18593
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;

    return-object v0
.end method

.method public getSportDataOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;>;"
        }
    .end annotation

    .line 18601
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 18602
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 18604
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 18262
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$24600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 18263
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 18262
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 18376
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

    .line 18251
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

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

    .line 18251
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

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

    .line 18251
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18251
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

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

    .line 18251
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18383
    const/4 v1, 0x0

    .line 18385
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 18390
    if-eqz v1, :cond_1

    .line 18391
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    goto :goto_0

    .line 18386
    :catch_0
    move-exception v2

    .line 18387
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-object v1, v0

    .line 18388
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18390
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 18391
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 18393
    :cond_0
    throw v3

    .line 18394
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18335
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    if-eqz v0, :cond_0

    .line 18336
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0

    .line 18338
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 18339
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18344
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 18345
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 18346
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 18347
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18348
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18349
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    goto :goto_0

    .line 18351
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18352
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18354
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_2

    .line 18357
    :cond_2
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 18358
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 18359
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 18360
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18361
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    .line 18362
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->bitField0_:I

    .line 18363
    .line 18364
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25300()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 18365
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->getSportDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 18367
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18371
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 18372
    return-object p0
.end method

.method public removeSportData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18567
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18568
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18569
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 18570
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18572
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 18574
    :goto_0
    return-object p0
.end method

.method public setSportData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18465
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 18466
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18467
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18468
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18470
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18472
    :goto_0
    return-object p0
.end method

.method public setSportData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18448
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 18449
    if-nez p2, :cond_0

    .line 18450
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 18452
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->ensureSportDataIsMutable()V

    .line 18453
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18454
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 18456
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->sportDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 18458
    :goto_0
    return-object p0
.end method
