.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MotionTimeLineArray"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    }
.end annotation


# static fields
.field public static final MOTIONTIMELINE_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private motionTimeLine_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;>;"
        }
    .end annotation
.end field

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17395
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    .line 17961
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    .line 17962
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->initFields()V

    .line 17963
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 17340
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 17454
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedIsInitialized:B

    .line 17473
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedSerializedSize:I

    .line 17341
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->initFields()V

    .line 17342
    const/4 v2, 0x0

    .line 17344
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 17346
    const/4 v4, 0x0

    .line 17347
    :goto_0
    if-nez v4, :cond_2

    .line 17348
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 17349
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 17351
    :sswitch_0
    const/4 v4, 0x1

    .line 17352
    goto :goto_2

    .line 17354
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 17356
    const/4 v4, 0x1

    goto :goto_2

    .line 17361
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 17362
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    .line 17363
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 17365
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->access$20400()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17369
    :cond_1
    :goto_2
    goto :goto_0

    .line 17376
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 17377
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    .line 17379
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 17380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->makeExtensionsImmutable()V

    .line 17381
    goto :goto_3

    .line 17370
    :catch_0
    move-exception v4

    .line 17371
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 17372
    :catch_1
    move-exception v4

    .line 17373
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 17374
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17376
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 17377
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    .line 17379
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 17380
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->makeExtensionsImmutable()V

    .line 17381
    throw v6

    .line 17382
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 17311
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 17317
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 17454
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedIsInitialized:B

    .line 17473
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedSerializedSize:I

    .line 17318
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 17319
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 17311
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 17320
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 17454
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedIsInitialized:B

    .line 17473
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedSerializedSize:I

    .line 17320
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$24000()Z
    .locals 1

    .line 17311
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$24200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Ljava/util/List;
    .locals 1

    .line 17311
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$24202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 17311
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$24300()Z
    .locals 1

    .line 17311
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$24400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 17311
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1

    .line 17324
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 17385
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$23500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 17452
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    .line 17453
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17548
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->access$23800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17551
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17528
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17534
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 17498
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 17504
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17539
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17545
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17518
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17524
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 17508
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 17514
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 17311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 17311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;
    .locals 1

    .line 17328
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    return-object v0
.end method

.method public getMotionTimeLine(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1

    .line 17435
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 17436
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 17438
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public getMotionTimeLineCount()I
    .locals 1

    .line 17429
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

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

    .line 17416
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    return-object v0
.end method

.method public getMotionTimeLineOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;
    .locals 1

    .line 17445
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 17446
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 17448
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

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

    .line 17423
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;>;"
        }
    .end annotation

    .line 17407
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 17475
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedSerializedSize:I

    .line 17476
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 17478
    :cond_0
    const/4 v2, 0x0

    .line 17479
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 17480
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    .line 17481
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 17479
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 17483
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 17484
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedSerializedSize:I

    .line 17485
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 17335
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 17390
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$23600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    .line 17391
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 17390
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 17456
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedIsInitialized:B

    .line 17457
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 17458
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 17460
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->memoizedIsInitialized:B

    .line 17461
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17311
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 17311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17549
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 2

    .line 17558
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 17559
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 17311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;
    .locals 1

    .line 17553
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 17492
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17466
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getSerializedSize()I

    .line 17467
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 17468
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->motionTimeLine_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 17467
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 17470
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 17471
    return-void
.end method
