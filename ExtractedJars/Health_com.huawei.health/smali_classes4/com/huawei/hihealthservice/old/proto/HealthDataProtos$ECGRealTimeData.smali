.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGRealTimeData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    }
.end annotation


# static fields
.field public static final ARRHYTHMIA_FIELD_NUMBER:I = 0x3

.field public static final ECGVALUE_FIELD_NUMBER:I = 0x4

.field public static final HEARTRATE_FIELD_NUMBER:I = 0x2

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation
.end field

.field public static final TIMESTAMP_FIELD_NUMBER:I = 0x1

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private arrhythmia_:I

.field private bitField0_:I

.field private ecgValue_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;>;"
        }
    .end annotation
.end field

.field private heartRate_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private timeStamp_:J

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31359
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    .line 32120
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    .line 32121
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->initFields()V

    .line 32122
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 31289
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 31467
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedIsInitialized:B

    .line 31495
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedSerializedSize:I

    .line 31290
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->initFields()V

    .line 31291
    const/4 v2, 0x0

    .line 31293
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 31295
    const/4 v4, 0x0

    .line 31296
    :goto_0
    if-nez v4, :cond_2

    .line 31297
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 31298
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 31300
    :sswitch_0
    const/4 v4, 0x1

    .line 31301
    goto/16 :goto_2

    .line 31303
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 31305
    const/4 v4, 0x1

    goto :goto_2

    .line 31310
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    .line 31311
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->timeStamp_:J

    .line 31312
    goto :goto_2

    .line 31315
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    .line 31316
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->heartRate_:I

    .line 31317
    goto :goto_2

    .line 31320
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    .line 31321
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->arrhythmia_:I

    .line 31322
    goto :goto_2

    .line 31325
    :sswitch_4
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 31326
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    .line 31327
    or-int/lit8 v0, v2, 0x8

    move v2, v0

    .line 31329
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;->access$44500()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31333
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 31340
    :cond_2
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 31341
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    .line 31343
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 31344
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->makeExtensionsImmutable()V

    .line 31345
    goto :goto_3

    .line 31334
    :catch_0
    move-exception v4

    .line 31335
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 31336
    :catch_1
    move-exception v4

    .line 31337
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 31338
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31340
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 31341
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    .line 31343
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 31344
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->makeExtensionsImmutable()V

    .line 31345
    throw v6

    .line 31346
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 31260
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 31266
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 31467
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedIsInitialized:B

    .line 31495
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedSerializedSize:I

    .line 31267
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 31268
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 31260
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 31269
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 31467
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedIsInitialized:B

    .line 31495
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedSerializedSize:I

    .line 31269
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$43200()Lcom/google/protobuf/Parser;
    .locals 1

    .line 31260
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$45100()Z
    .locals 1

    .line 31260
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$45302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;J)J
    .locals 0

    .line 31260
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->timeStamp_:J

    return-wide p1
.end method

.method static synthetic access$45402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;I)I
    .locals 0

    .line 31260
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->heartRate_:I

    return p1
.end method

.method static synthetic access$45502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;I)I
    .locals 0

    .line 31260
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->arrhythmia_:I

    return p1
.end method

.method static synthetic access$45600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Ljava/util/List;
    .locals 1

    .line 31260
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$45602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 31260
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$45702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;I)I
    .locals 0

    .line 31260
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    return p1
.end method

.method static synthetic access$45800()Z
    .locals 1

    .line 31260
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1

    .line 31273
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 31349
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$44600()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 31462
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->timeStamp_:J

    .line 31463
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->heartRate_:I

    .line 31464
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->arrhythmia_:I

    .line 31465
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    .line 31466
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31582
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->access$44900()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31585
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31562
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31568
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 31532
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 31538
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31573
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31579
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31552
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31558
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 31542
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 31548
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method


# virtual methods
.method public getArrhythmia()I
    .locals 1

    .line 31417
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->arrhythmia_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 31260
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 31260
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1

    .line 31277
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public getEcgValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;
    .locals 1

    .line 31445
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 31446
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 31448
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;

    return-object v0
.end method

.method public getEcgValueCount()I
    .locals 1

    .line 31439
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

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

    .line 31426
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    return-object v0
.end method

.method public getEcgValueOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;
    .locals 1

    .line 31455
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 31456
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 31458
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

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

    .line 31433
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    return-object v0
.end method

.method public getHeartRate()I
    .locals 1

    .line 31402
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->heartRate_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation

    .line 31371
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 31497
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedSerializedSize:I

    .line 31498
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 31500
    :cond_0
    const/4 v3, 0x0

    .line 31501
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 31502
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->timeStamp_:J

    .line 31503
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 31505
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 31506
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->heartRate_:I

    .line 31507
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 31509
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 31510
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->arrhythmia_:I

    .line 31511
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 31513
    :cond_3
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 31514
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    .line 31515
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 31513
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 31517
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 31518
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedSerializedSize:I

    .line 31519
    return v3
.end method

.method public getTimeStamp()J
    .locals 2

    .line 31387
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->timeStamp_:J

    return-wide v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 31284
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasArrhythmia()Z
    .locals 2

    .line 31411
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

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

    .line 31396
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

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

    .line 31381
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

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

    .line 31354
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$44700()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    .line 31355
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 31354
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 31469
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedIsInitialized:B

    .line 31470
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 31471
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 31473
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->memoizedIsInitialized:B

    .line 31474
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 31260
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 31260
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 31260
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31583
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 2

    .line 31592
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 31593
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 31260
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 31260
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;
    .locals 1

    .line 31587
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData$Builder;

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

    .line 31526
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31479
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getSerializedSize()I

    .line 31480
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 31481
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->timeStamp_:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 31483
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 31484
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->heartRate_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 31486
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 31487
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->arrhythmia_:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 31489
    :cond_2
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 31490
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->ecgValue_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 31489
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 31492
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 31493
    return-void
.end method
