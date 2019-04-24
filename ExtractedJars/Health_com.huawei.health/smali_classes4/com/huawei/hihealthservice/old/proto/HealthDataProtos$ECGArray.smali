.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGArray"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;
    }
.end annotation


# static fields
.field public static final ECG_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private ecg_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25663
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    .line 26229
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    .line 26230
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->initFields()V

    .line 26231
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 25608
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 25722
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedIsInitialized:B

    .line 25741
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedSerializedSize:I

    .line 25609
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->initFields()V

    .line 25610
    const/4 v2, 0x0

    .line 25612
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 25614
    const/4 v4, 0x0

    .line 25615
    :goto_0
    if-nez v4, :cond_2

    .line 25616
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 25617
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 25619
    :sswitch_0
    const/4 v4, 0x1

    .line 25620
    goto :goto_2

    .line 25622
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 25624
    const/4 v4, 0x1

    goto :goto_2

    .line 25629
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 25630
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    .line 25631
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 25633
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$35100()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25637
    :cond_1
    :goto_2
    goto :goto_0

    .line 25644
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 25645
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    .line 25647
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 25648
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->makeExtensionsImmutable()V

    .line 25649
    goto :goto_3

    .line 25638
    :catch_0
    move-exception v4

    .line 25639
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 25640
    :catch_1
    move-exception v4

    .line 25641
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 25642
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25644
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 25645
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    .line 25647
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 25648
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->makeExtensionsImmutable()V

    .line 25649
    throw v6

    .line 25650
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

    .line 25579
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 25585
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 25722
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedIsInitialized:B

    .line 25741
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedSerializedSize:I

    .line 25586
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 25587
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 25579
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 25588
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 25722
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedIsInitialized:B

    .line 25741
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedSerializedSize:I

    .line 25588
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$35700()Z
    .locals 1

    .line 25579
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$35900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;)Ljava/util/List;
    .locals 1

    .line 25579
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$35902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 25579
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$36000()Z
    .locals 1

    .line 25579
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$36100()Lcom/google/protobuf/Parser;
    .locals 1

    .line 25579
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1

    .line 25592
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 25653
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$35200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 25720
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    .line 25721
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;
    .locals 1

    .line 25816
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;->access$35500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;
    .locals 1

    .line 25819
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25796
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25802
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 25766
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 25772
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25807
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25813
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25786
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25792
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 25776
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 25782
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 25579
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 25579
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;
    .locals 1

    .line 25596
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    return-object v0
.end method

.method public getEcg(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1

    .line 25703
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 25704
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25706
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public getEcgCount()I
    .locals 1

    .line 25697
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getEcgList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;>;"
        }
    .end annotation

    .line 25684
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    return-object v0
.end method

.method public getEcgOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;
    .locals 1

    .line 25713
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 25714
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25716
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;

    return-object v0
.end method

.method public getEcgOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;>;"
        }
    .end annotation

    .line 25691
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;>;"
        }
    .end annotation

    .line 25675
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 25743
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedSerializedSize:I

    .line 25744
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 25746
    :cond_0
    const/4 v2, 0x0

    .line 25747
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 25748
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    .line 25749
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 25747
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25751
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 25752
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedSerializedSize:I

    .line 25753
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 25603
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 25658
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$35300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    .line 25659
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 25658
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 25724
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedIsInitialized:B

    .line 25725
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 25726
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 25728
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->memoizedIsInitialized:B

    .line 25729
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 25579
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 25579
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 25579
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;
    .locals 1

    .line 25817
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;
    .locals 2

    .line 25826
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 25827
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 25579
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 25579
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;
    .locals 1

    .line 25821
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray$Builder;

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

    .line 25760
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

    .line 25734
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->getSerializedSize()I

    .line 25735
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 25736
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->ecg_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 25735
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25738
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 25739
    return-void
.end method
