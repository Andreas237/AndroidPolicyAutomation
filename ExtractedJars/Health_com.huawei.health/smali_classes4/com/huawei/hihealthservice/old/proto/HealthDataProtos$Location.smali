.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$LocationOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Location"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    }
.end annotation


# static fields
.field public static final ALTITUDE_FIELD_NUMBER:I = 0x3

.field public static final LATITUDE_FIELD_NUMBER:I = 0x2

.field private static final LOCATION:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

.field private static LOCATIONPARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;>;"
        }
    .end annotation
.end field

.field public static final LONGITUDE_FIELD_NUMBER:I = 0x1

.field public static final NAME_FIELD_NUMBER:I = 0x4

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private altitude_:D

.field private bitField0_:I

.field private latitude_:D

.field private longitude_:D

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private name_:Ljava/lang/Object;

.field private final unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1743
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    .line 2304
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATION:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    .line 2305
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATION:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->initFields()V

    .line 2306
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1678
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 1852
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedIsInitialized:B

    .line 1880
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedSerializedSize:I

    .line 1679
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->initFields()V

    .line 1680
    const/4 v2, 0x0

    .line 1682
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 1684
    const/4 v4, 0x0

    .line 1685
    :goto_0
    if-nez v4, :cond_1

    .line 1686
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 1687
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_1

    .line 1689
    :sswitch_0
    const/4 v4, 0x1

    .line 1690
    goto :goto_2

    .line 1692
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    .line 1693
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->longitude_:D

    .line 1694
    goto :goto_2

    .line 1697
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    .line 1698
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->latitude_:D

    .line 1699
    goto :goto_2

    .line 1702
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    .line 1703
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->altitude_:D

    .line 1704
    goto :goto_2

    .line 1707
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 1708
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    .line 1709
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    .line 1710
    goto :goto_2

    .line 1713
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 1715
    const/4 v4, 0x1

    .line 1720
    :cond_0
    :goto_2
    goto/16 :goto_0

    .line 1727
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    .line 1728
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->makeExtensionsImmutable()V

    .line 1729
    goto :goto_3

    .line 1721
    :catch_0
    move-exception v4

    .line 1722
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 1723
    :catch_1
    move-exception v4

    .line 1724
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 1725
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1727
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    .line 1728
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->makeExtensionsImmutable()V

    .line 1729
    throw v7

    .line 1730
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x9 -> :sswitch_1
        0x11 -> :sswitch_2
        0x19 -> :sswitch_3
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

    .line 1649
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 1655
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 1852
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedIsInitialized:B

    .line 1880
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedSerializedSize:I

    .line 1656
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    .line 1657
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 1649
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 1658
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 1852
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedIsInitialized:B

    .line 1880
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedSerializedSize:I

    .line 1658
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$200()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1649
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$2700()Z
    .locals 1

    .line 1649
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$2902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;D)D
    .locals 0

    .line 1649
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->longitude_:D

    return-wide p1
.end method

.method static synthetic access$3002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;D)D
    .locals 0

    .line 1649
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->latitude_:D

    return-wide p1
.end method

.method static synthetic access$3102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;D)D
    .locals 0

    .line 1649
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->altitude_:D

    return-wide p1
.end method

.method static synthetic access$3200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Ljava/lang/Object;
    .locals 1

    .line 1649
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$3202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1649
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$3302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;I)I
    .locals 0

    .line 1649
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1

    .line 1662
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATION:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1733
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$2200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 1847
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->longitude_:D

    .line 1848
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->latitude_:D

    .line 1849
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->altitude_:D

    .line 1850
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    .line 1851
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 1967
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->access$2500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 1970
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1947
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1953
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1917
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1923
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1958
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1964
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1937
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1943
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1927
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1933
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method


# virtual methods
.method public getAltitude()D
    .locals 2

    .line 1801
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->altitude_:D

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1649
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 1649
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;
    .locals 1

    .line 1666
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATION:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    .line 1786
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->latitude_:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 1771
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->longitude_:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 1816
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    .line 1817
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1818
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 1820
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 1822
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 1823
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1824
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    .line 1826
    :cond_1
    return-object v3
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 1834
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    .line 1835
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1836
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 1837
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 1839
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->name_:Ljava/lang/Object;

    .line 1840
    return-object v2

    .line 1842
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;>;"
        }
    .end annotation

    .line 1755
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->LOCATIONPARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 1882
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedSerializedSize:I

    .line 1883
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 1885
    :cond_0
    const/4 v3, 0x0

    .line 1886
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1887
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->longitude_:D

    .line 1888
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeDoubleSize(ID)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 1890
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 1891
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->latitude_:D

    .line 1892
    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeDoubleSize(ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 1894
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 1895
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->altitude_:D

    .line 1896
    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeDoubleSize(ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 1898
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v1, v0, :cond_4

    .line 1899
    .line 1900
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 1902
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 1903
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedSerializedSize:I

    .line 1904
    return v3
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 1673
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->unknownFieldSet:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasAltitude()Z
    .locals 2

    .line 1795
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

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

.method public hasLatitude()Z
    .locals 2

    .line 1780
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

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

.method public hasLongitude()Z
    .locals 2

    .line 1765
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

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

.method public hasName()Z
    .locals 2

    .line 1810
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 1738
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$2300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 1739
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 1738
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1854
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedIsInitialized:B

    .line 1855
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 1856
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 1858
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->memoizedIsInitialized:B

    .line 1859
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1649
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1649
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1649
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 1968
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 2

    .line 1977
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 1978
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1649
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 1649
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    .locals 1

    .line 1972
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

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

    .line 1911
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

    .line 1864
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getSerializedSize()I

    .line 1865
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1866
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->longitude_:D

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeDouble(ID)V

    .line 1868
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 1869
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->latitude_:D

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeDouble(ID)V

    .line 1871
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v1, v0, :cond_2

    .line 1872
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->altitude_:D

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeDouble(ID)V

    .line 1874
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v1, v0, :cond_3

    .line 1875
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 1877
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 1878
    return-void
.end method
