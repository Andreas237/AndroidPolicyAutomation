.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MotionPathHeartRateData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    }
.end annotation


# static fields
.field public static final HEARTRATE_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;>;"
        }
    .end annotation
.end field

.field public static final TIME_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private heartRate_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private time_:J

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 22486
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    .line 22844
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    .line 22845
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->initFields()V

    .line 22846
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22432
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 22536
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedIsInitialized:B

    .line 22558
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedSerializedSize:I

    .line 22433
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->initFields()V

    .line 22434
    const/4 v2, 0x0

    .line 22436
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 22438
    const/4 v4, 0x0

    .line 22439
    :goto_0
    if-nez v4, :cond_1

    .line 22440
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 22441
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 22443
    :sswitch_0
    const/4 v4, 0x1

    .line 22444
    goto :goto_2

    .line 22446
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 22448
    const/4 v4, 0x1

    goto :goto_2

    .line 22453
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    .line 22454
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->heartRate_:I

    .line 22455
    goto :goto_2

    .line 22458
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    .line 22459
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->time_:J
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22463
    :cond_0
    :goto_2
    goto :goto_0

    .line 22470
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 22471
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->makeExtensionsImmutable()V

    .line 22472
    goto :goto_3

    .line 22464
    :catch_0
    move-exception v4

    .line 22465
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 22466
    :catch_1
    move-exception v4

    .line 22467
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 22468
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22470
    :catchall_0
    move-exception v6

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 22471
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->makeExtensionsImmutable()V

    .line 22472
    throw v6

    .line 22473
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22403
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 22409
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 22536
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedIsInitialized:B

    .line 22558
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedSerializedSize:I

    .line 22410
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 22411
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 22403
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 22412
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 22536
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedIsInitialized:B

    .line 22558
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedSerializedSize:I

    .line 22412
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$15900()Lcom/google/protobuf/Parser;
    .locals 1

    .line 22403
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$31702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;I)I
    .locals 0

    .line 22403
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->heartRate_:I

    return p1
.end method

.method static synthetic access$31802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;J)J
    .locals 0

    .line 22403
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->time_:J

    return-wide p1
.end method

.method static synthetic access$31902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;I)I
    .locals 0

    .line 22403
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1

    .line 22416
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 22476
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$31100()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 22533
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->heartRate_:I

    .line 22534
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->time_:J

    .line 22535
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22637
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->access$31400()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22640
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22617
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22623
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22587
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22593
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22628
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22634
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22607
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22613
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22597
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22603
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 22403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 22403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1

    .line 22420
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public getHeartRate()I
    .locals 1

    .line 22514
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->heartRate_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;>;"
        }
    .end annotation

    .line 22498
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 22560
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedSerializedSize:I

    .line 22561
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 22563
    :cond_0
    const/4 v3, 0x0

    .line 22564
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 22565
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->heartRate_:I

    .line 22566
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 22568
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 22569
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->time_:J

    .line 22570
    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 22572
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 22573
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedSerializedSize:I

    .line 22574
    return v3
.end method

.method public getTime()J
    .locals 2

    .line 22529
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->time_:J

    return-wide v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 22427
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasHeartRate()Z
    .locals 2

    .line 22508
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

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

.method public hasTime()Z
    .locals 2

    .line 22523
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 22481
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$31200()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 22482
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 22481
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 22538
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedIsInitialized:B

    .line 22539
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 22540
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 22542
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->memoizedIsInitialized:B

    .line 22543
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22403
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 22403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22638
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 22647
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 22648
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 22403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 22403
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 22642
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

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

    .line 22581
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

    .line 22548
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getSerializedSize()I

    .line 22549
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 22550
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->heartRate_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 22552
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 22553
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->time_:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 22555
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 22556
    return-void
.end method
