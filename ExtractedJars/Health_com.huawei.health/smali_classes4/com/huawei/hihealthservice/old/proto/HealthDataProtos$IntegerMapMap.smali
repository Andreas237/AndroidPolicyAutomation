.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IntegerMapMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    }
.end annotation


# static fields
.field public static final ENTRIES_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private entries_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 20644
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    .line 21210
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 21211
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->initFields()V

    .line 21212
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 20589
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 20703
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedIsInitialized:B

    .line 20722
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedSerializedSize:I

    .line 20590
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->initFields()V

    .line 20591
    const/4 v2, 0x0

    .line 20593
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 20595
    const/4 v4, 0x0

    .line 20596
    :goto_0
    if-nez v4, :cond_2

    .line 20597
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 20598
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 20600
    :sswitch_0
    const/4 v4, 0x1

    .line 20601
    goto :goto_2

    .line 20603
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 20605
    const/4 v4, 0x1

    goto :goto_2

    .line 20610
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 20611
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    .line 20612
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 20614
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->access$26400()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20618
    :cond_1
    :goto_2
    goto :goto_0

    .line 20625
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 20626
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    .line 20628
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 20629
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->makeExtensionsImmutable()V

    .line 20630
    goto :goto_3

    .line 20619
    :catch_0
    move-exception v4

    .line 20620
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 20621
    :catch_1
    move-exception v4

    .line 20622
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 20623
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20625
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 20626
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    .line 20628
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 20629
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->makeExtensionsImmutable()V

    .line 20630
    throw v6

    .line 20631
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

    .line 20560
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 20566
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 20703
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedIsInitialized:B

    .line 20722
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedSerializedSize:I

    .line 20567
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 20568
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 20560
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 20569
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 20703
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedIsInitialized:B

    .line 20722
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedSerializedSize:I

    .line 20569
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$26600()Lcom/google/protobuf/Parser;
    .locals 1

    .line 20560
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$28900()Z
    .locals 1

    .line 20560
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$29100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/List;
    .locals 1

    .line 20560
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$29102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 20560
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$29200()Z
    .locals 1

    .line 20560
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1

    .line 20573
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 20634
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$28400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 20701
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    .line 20702
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20797
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->access$28700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20800
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20777
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20783
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 20747
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 20753
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20788
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20794
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20767
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20773
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 20757
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 20763
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 20560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 20560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1

    .line 20577
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public getEntries(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1

    .line 20684
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 20685
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 20687
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public getEntriesCount()I
    .locals 1

    .line 20678
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getEntriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;"
        }
    .end annotation

    .line 20665
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    return-object v0
.end method

.method public getEntriesOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;
    .locals 1

    .line 20694
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 20695
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 20697
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;

    return-object v0
.end method

.method public getEntriesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;>;"
        }
    .end annotation

    .line 20672
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;>;"
        }
    .end annotation

    .line 20656
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 20724
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedSerializedSize:I

    .line 20725
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 20727
    :cond_0
    const/4 v2, 0x0

    .line 20728
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 20729
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    .line 20730
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 20728
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 20732
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 20733
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedSerializedSize:I

    .line 20734
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 20584
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 20639
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$28500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    .line 20640
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 20639
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 20705
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedIsInitialized:B

    .line 20706
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 20707
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 20709
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->memoizedIsInitialized:B

    .line 20710
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 20560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 20560
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 20560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20798
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 20807
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 20808
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 20560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 20560
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 20802
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

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

    .line 20741
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

    .line 20715
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getSerializedSize()I

    .line 20716
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 20717
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 20716
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 20719
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 20720
    return-void
.end method
