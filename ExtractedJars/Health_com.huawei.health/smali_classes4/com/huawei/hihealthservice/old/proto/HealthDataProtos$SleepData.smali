.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SleepData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    }
.end annotation


# static fields
.field public static final BASEHEALTHDATA_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 15505
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    .line 15900
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    .line 15901
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->initFields()V

    .line 15902
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 15448
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 15545
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedIsInitialized:B

    .line 15564
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedSerializedSize:I

    .line 15449
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->initFields()V

    .line 15450
    const/4 v2, 0x0

    .line 15452
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 15454
    const/4 v4, 0x0

    .line 15455
    :goto_0
    if-nez v4, :cond_3

    .line 15456
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 15457
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 15459
    :sswitch_0
    const/4 v4, 0x1

    .line 15460
    goto :goto_2

    .line 15462
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 15464
    const/4 v4, 0x1

    goto :goto_2

    .line 15469
    :sswitch_1
    const/4 v6, 0x0

    .line 15470
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 15471
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v6

    .line 15473
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15474
    if-eqz v6, :cond_1

    .line 15475
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 15476
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15478
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15479
    .line 15482
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 15489
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 15490
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->makeExtensionsImmutable()V

    .line 15491
    goto :goto_3

    .line 15483
    :catch_0
    move-exception v4

    .line 15484
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 15485
    :catch_1
    move-exception v4

    .line 15486
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 15487
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15489
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 15490
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->makeExtensionsImmutable()V

    .line 15491
    throw v7

    .line 15492
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

    .line 15419
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 15425
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 15545
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedIsInitialized:B

    .line 15564
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedSerializedSize:I

    .line 15426
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 15427
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 15419
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 15428
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 15545
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedIsInitialized:B

    .line 15564
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedSerializedSize:I

    .line 15428
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$21000()Z
    .locals 1

    .line 15419
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$21202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 0

    .line 15419
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object p1
.end method

.method static synthetic access$21302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;I)I
    .locals 0

    .line 15419
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I

    return p1
.end method

.method static synthetic access$21400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 15419
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1

    .line 15432
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 15495
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$20500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 15543
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15544
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15639
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->access$20800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15642
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15619
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15625
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 15589
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 15595
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15630
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15636
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15609
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15615
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 15599
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 15605
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method


# virtual methods
.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 15533
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 15539
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 15419
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 15419
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1

    .line 15436
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;"
        }
    .end annotation

    .line 15517
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 15566
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedSerializedSize:I

    .line 15567
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 15569
    :cond_0
    const/4 v2, 0x0

    .line 15570
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 15571
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 15572
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 15574
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 15575
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedSerializedSize:I

    .line 15576
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 15443
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 15527
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I

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

    .line 15500
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$20600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    .line 15501
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 15500
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 15547
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedIsInitialized:B

    .line 15548
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 15549
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 15551
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->memoizedIsInitialized:B

    .line 15552
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15419
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15419
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 15419
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15640
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 2

    .line 15649
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 15650
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15419
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 15419
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;
    .locals 1

    .line 15644
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

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

    .line 15583
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getSerializedSize()I

    .line 15558
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 15559
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 15561
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 15562
    return-void
.end method
