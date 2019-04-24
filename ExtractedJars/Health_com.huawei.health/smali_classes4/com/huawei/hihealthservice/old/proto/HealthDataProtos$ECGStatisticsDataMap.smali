.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGStatisticsDataMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    }
.end annotation


# static fields
.field public static final KEY_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;"
        }
    .end annotation
.end field

.field public static final VALUE_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private key_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;

.field private value_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29593
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    .line 29953
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    .line 29954
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->initFields()V

    .line 29955
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 29539
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 29643
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedIsInitialized:B

    .line 29665
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedSerializedSize:I

    .line 29540
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->initFields()V

    .line 29541
    const/4 v2, 0x0

    .line 29543
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 29545
    const/4 v4, 0x0

    .line 29546
    :goto_0
    if-nez v4, :cond_1

    .line 29547
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 29548
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 29550
    :sswitch_0
    const/4 v4, 0x1

    .line 29551
    goto :goto_2

    .line 29553
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 29555
    const/4 v4, 0x1

    goto :goto_2

    .line 29560
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    .line 29561
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->key_:I

    .line 29562
    goto :goto_2

    .line 29565
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    .line 29566
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->value_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29570
    :cond_0
    :goto_2
    goto :goto_0

    .line 29577
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 29578
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->makeExtensionsImmutable()V

    .line 29579
    goto :goto_3

    .line 29571
    :catch_0
    move-exception v4

    .line 29572
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 29573
    :catch_1
    move-exception v4

    .line 29574
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 29575
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29577
    :catchall_0
    move-exception v6

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 29578
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->makeExtensionsImmutable()V

    .line 29579
    throw v6

    .line 29580
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

    .line 29510
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 29516
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 29643
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedIsInitialized:B

    .line 29665
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedSerializedSize:I

    .line 29517
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 29518
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 29510
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 29519
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 29643
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedIsInitialized:B

    .line 29665
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedSerializedSize:I

    .line 29519
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$33000()Lcom/google/protobuf/Parser;
    .locals 1

    .line 29510
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$41700()Z
    .locals 1

    .line 29510
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$41902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;I)I
    .locals 0

    .line 29510
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->key_:I

    return p1
.end method

.method static synthetic access$42002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;I)I
    .locals 0

    .line 29510
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->value_:I

    return p1
.end method

.method static synthetic access$42102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;I)I
    .locals 0

    .line 29510
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1

    .line 29523
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 29583
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$41200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 29640
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->key_:I

    .line 29641
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->value_:I

    .line 29642
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29744
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->access$41500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29747
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29724
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29730
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 29694
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 29700
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29735
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29741
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29714
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29720
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 29704
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 29710
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 29510
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29510
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1

    .line 29527
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 29621
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->key_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;"
        }
    .end annotation

    .line 29605
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 29667
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedSerializedSize:I

    .line 29668
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 29670
    :cond_0
    const/4 v2, 0x0

    .line 29671
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 29672
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->key_:I

    .line 29673
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 29675
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 29676
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->value_:I

    .line 29677
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 29679
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 29680
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedSerializedSize:I

    .line 29681
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 29534
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 29636
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->value_:I

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 29615
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

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

.method public hasValue()Z
    .locals 2

    .line 29630
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

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

    .line 29588
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$41300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    .line 29589
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 29588
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 29645
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedIsInitialized:B

    .line 29646
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 29647
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 29649
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->memoizedIsInitialized:B

    .line 29650
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29510
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29510
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29510
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29745
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29754
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 29755
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29510
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29510
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29749
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

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

    .line 29688
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

    .line 29655
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getSerializedSize()I

    .line 29656
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 29657
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->key_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 29659
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 29660
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->value_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 29662
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 29663
    return-void
.end method
