.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArrayOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private sleepData_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 16207
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 16337
    .line 16338
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16208
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->maybeForceBuilderInitialization()V

    .line 16209
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 16213
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 16337
    .line 16338
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16214
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->maybeForceBuilderInitialization()V

    .line 16215
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 16190
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$21800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16190
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16222
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;-><init>()V

    return-object v0
.end method

.method private ensureSleepDataIsMutable()V
    .locals 2

    .line 16340
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 16341
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16342
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    .line 16344
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 16196
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$21500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;>;"
        }
    .end annotation

    .line 16571
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 16572
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 16576
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 16577
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16578
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16580
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 16217
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16218
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16220
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllSleepData(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;"
        }
    .end annotation

    .line 16479
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16480
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16481
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 16483
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16485
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16487
    :goto_0
    return-object p0
.end method

.method public addSleepData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16465
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16466
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16467
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 16468
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16470
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16472
    :goto_0
    return-object p0
.end method

.method public addSleepData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16434
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 16435
    if-nez p2, :cond_0

    .line 16436
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 16438
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16439
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 16440
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16442
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16444
    :goto_0
    return-object p0
.end method

.method public addSleepData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16451
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16452
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16453
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16454
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16456
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16458
    :goto_0
    return-object p0
.end method

.method public addSleepData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16417
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 16418
    if-nez p1, :cond_0

    .line 16419
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 16421
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16422
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16423
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16425
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16427
    :goto_0
    return-object p0
.end method

.method public addSleepDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 16550
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 16551
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    .line 16550
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    return-object v0
.end method

.method public addSleepDataBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 16558
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 16559
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    .line 16558
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 2

    .line 16250
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v1

    .line 16251
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 16252
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 16254
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 4

    .line 16258
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 16259
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    .line 16260
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 16261
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 16262
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16263
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    .line 16265
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 16267
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;Ljava/util/List;)Ljava/util/List;

    .line 16269
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onBuilt()V

    .line 16270
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16226
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 16227
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16228
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16229
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    goto :goto_0

    .line 16231
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 16233
    :goto_0
    return-object p0
.end method

.method public clearSleepData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16493
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16494
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16495
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    .line 16496
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16498
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 16500
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16237
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

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

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 16190
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1

    .line 16246
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 16242
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$21500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getSleepData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1

    .line 16373
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 16374
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 16375
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 16377
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0

    .line 16379
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public getSleepDataBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 16520
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    return-object v0
.end method

.method public getSleepDataBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;>;"
        }
    .end annotation

    .line 16566
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSleepDataCount()I
    .locals 1

    .line 16363
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16364
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 16366
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getSleepDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;"
        }
    .end annotation

    .line 16353
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16354
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 16356
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSleepDataOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;
    .locals 1

    .line 16527
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 16528
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 16529
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 16531
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;

    return-object v0

    .line 16532
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;

    return-object v0
.end method

.method public getSleepDataOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;>;"
        }
    .end annotation

    .line 16540
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 16541
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 16543
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 16201
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$21600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    .line 16202
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 16201
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 16315
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

    .line 16190
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

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

    .line 16190
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

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

    .line 16190
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 16190
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

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

    .line 16190
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16322
    const/4 v1, 0x0

    .line 16324
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 16329
    if-eqz v1, :cond_1

    .line 16330
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    goto :goto_0

    .line 16325
    :catch_0
    move-exception v2

    .line 16326
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-object v1, v0

    .line 16327
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16329
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 16330
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    .line 16332
    :cond_0
    throw v3

    .line 16333
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16274
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    if-eqz v0, :cond_0

    .line 16275
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0

    .line 16277
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 16278
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16283
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 16284
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 16285
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 16286
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16287
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16288
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    goto :goto_0

    .line 16290
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16291
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 16293
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_2

    .line 16296
    :cond_2
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 16297
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16298
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 16299
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16300
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    .line 16301
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->bitField0_:I

    .line 16302
    .line 16303
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22300()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 16304
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->getSleepDataFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 16306
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16310
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 16311
    return-object p0
.end method

.method public removeSleepData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16506
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16507
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16508
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 16509
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16511
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 16513
    :goto_0
    return-object p0
.end method

.method public setSleepData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16404
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 16405
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16406
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 16407
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16409
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16411
    :goto_0
    return-object p0
.end method

.method public setSleepData(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16387
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 16388
    if-nez p2, :cond_0

    .line 16389
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 16391
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->ensureSleepDataIsMutable()V

    .line 16392
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 16393
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->onChanged()V

    goto :goto_0

    .line 16395
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->sleepDataBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 16397
    :goto_0
    return-object p0
.end method
