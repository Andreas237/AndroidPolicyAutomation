.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IntegerMapEntry"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    }
.end annotation


# static fields
.field public static final KEY_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;"
        }
    .end annotation
.end field

.field public static final STATE_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private key_:Ljava/lang/Object;

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private state_:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18769
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    .line 19200
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    .line 19201
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->initFields()V

    .line 19202
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18714
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 18846
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedIsInitialized:B

    .line 18868
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedSerializedSize:I

    .line 18715
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->initFields()V

    .line 18716
    const/4 v2, 0x0

    .line 18718
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 18720
    const/4 v4, 0x0

    .line 18721
    :goto_0
    if-nez v4, :cond_1

    .line 18722
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 18723
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 18725
    :sswitch_0
    const/4 v4, 0x1

    .line 18726
    goto :goto_2

    .line 18728
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 18730
    const/4 v4, 0x1

    goto :goto_2

    .line 18735
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 18736
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    .line 18737
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    .line 18738
    goto :goto_2

    .line 18741
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    .line 18742
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->state_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18746
    :cond_0
    :goto_2
    goto :goto_0

    .line 18753
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 18754
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->makeExtensionsImmutable()V

    .line 18755
    goto :goto_3

    .line 18747
    :catch_0
    move-exception v4

    .line 18748
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 18749
    :catch_1
    move-exception v4

    .line 18750
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 18751
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18753
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 18754
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->makeExtensionsImmutable()V

    .line 18755
    throw v7

    .line 18756
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
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

    .line 18685
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 18691
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 18846
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedIsInitialized:B

    .line 18868
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedSerializedSize:I

    .line 18692
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 18693
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 18685
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 18694
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 18846
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedIsInitialized:B

    .line 18868
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedSerializedSize:I

    .line 18694
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$26100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Ljava/lang/Object;
    .locals 1

    .line 18685
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$26102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18685
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$26202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;I)I
    .locals 0

    .line 18685
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->state_:I

    return p1
.end method

.method static synthetic access$26302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;I)I
    .locals 0

    .line 18685
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    return p1
.end method

.method static synthetic access$26400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 18685
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1

    .line 18698
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 18759
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$25500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 18843
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    .line 18844
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->state_:I

    .line 18845
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 18947
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->access$25800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 18950
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18927
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18933
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18897
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18903
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18938
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18944
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18917
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18923
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18907
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18913
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 18685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1

    .line 18702
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 4

    .line 18797
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    .line 18798
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 18799
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 18801
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 18803
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 18804
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18805
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    .line 18807
    :cond_1
    return-object v3
.end method

.method public getKeyBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 18815
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    .line 18816
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 18817
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 18818
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 18820
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->key_:Ljava/lang/Object;

    .line 18821
    return-object v2

    .line 18823
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;>;"
        }
    .end annotation

    .line 18781
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 18870
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedSerializedSize:I

    .line 18871
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 18873
    :cond_0
    const/4 v2, 0x0

    .line 18874
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 18875
    .line 18876
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getKeyBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 18878
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 18879
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->state_:I

    .line 18880
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 18882
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 18883
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedSerializedSize:I

    .line 18884
    return v2
.end method

.method public getState()I
    .locals 1

    .line 18839
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->state_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 18709
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasKey()Z
    .locals 2

    .line 18791
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

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

.method public hasState()Z
    .locals 2

    .line 18833
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

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

    .line 18764
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$25600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    .line 18765
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 18764
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 18848
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedIsInitialized:B

    .line 18849
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 18850
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 18852
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->memoizedIsInitialized:B

    .line 18853
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18685
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 18685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 18948
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 18957
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 18958
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 18685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 18952
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

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

    .line 18891
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

    .line 18858
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getSerializedSize()I

    .line 18859
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 18860
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getKeyBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 18862
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 18863
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->state_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 18865
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 18866
    return-void
.end method
