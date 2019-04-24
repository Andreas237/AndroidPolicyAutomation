.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NameBundleItem"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    }
.end annotation


# static fields
.field public static final LANG_FIELD_NUMBER:I = 0x1

.field public static final NAME_FIELD_NUMBER:I = 0x2

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private lang_:Ljava/lang/Object;

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private name_:Ljava/lang/Object;

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 2904
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    .line 3408
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    .line 3409
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->initFields()V

    .line 3410
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2848
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 3008
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedIsInitialized:B

    .line 3030
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedSerializedSize:I

    .line 2849
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->initFields()V

    .line 2850
    const/4 v2, 0x0

    .line 2852
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 2854
    const/4 v4, 0x0

    .line 2855
    :goto_0
    if-nez v4, :cond_1

    .line 2856
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 2857
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 2859
    :sswitch_0
    const/4 v4, 0x1

    .line 2860
    goto :goto_2

    .line 2862
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2864
    const/4 v4, 0x1

    goto :goto_2

    .line 2869
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 2870
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    .line 2871
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    .line 2872
    goto :goto_2

    .line 2875
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 2876
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    .line 2877
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2878
    .line 2881
    :cond_0
    :goto_2
    goto :goto_0

    .line 2888
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 2889
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->makeExtensionsImmutable()V

    .line 2890
    goto :goto_3

    .line 2882
    :catch_0
    move-exception v4

    .line 2883
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 2884
    :catch_1
    move-exception v4

    .line 2885
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 2886
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2888
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 2889
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->makeExtensionsImmutable()V

    .line 2890
    throw v7

    .line 2891
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2819
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 2825
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 3008
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedIsInitialized:B

    .line 3030
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedSerializedSize:I

    .line 2826
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 2827
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 2819
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 2828
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 3008
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedIsInitialized:B

    .line 3030
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedSerializedSize:I

    .line 2828
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$5000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Ljava/lang/Object;
    .locals 1

    .line 2819
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$5002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2819
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$5100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Ljava/lang/Object;
    .locals 1

    .line 2819
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$5102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2819
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$5202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;I)I
    .locals 0

    .line 2819
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    return p1
.end method

.method static synthetic access$5300()Lcom/google/protobuf/Parser;
    .locals 1

    .line 2819
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1

    .line 2832
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 2894
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$4400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 3005
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    .line 3006
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    .line 3007
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3109
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->access$4700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3112
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3089
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3095
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3059
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3065
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3100
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3106
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3079
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3085
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3069
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3075
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 2819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1

    .line 2836
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 4

    .line 2932
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    .line 2933
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2934
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 2936
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 2938
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 2939
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2940
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    .line 2942
    :cond_1
    return-object v3
.end method

.method public getLangBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 2950
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    .line 2951
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2952
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 2953
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 2955
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->lang_:Ljava/lang/Object;

    .line 2956
    return-object v2

    .line 2958
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 2974
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    .line 2975
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2976
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 2978
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 2980
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 2981
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2982
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    .line 2984
    :cond_1
    return-object v3
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 2992
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    .line 2993
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2994
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 2995
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 2997
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->name_:Ljava/lang/Object;

    .line 2998
    return-object v2

    .line 3000
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation

    .line 2916
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 3032
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedSerializedSize:I

    .line 3033
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 3035
    :cond_0
    const/4 v2, 0x0

    .line 3036
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 3037
    .line 3038
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getLangBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 3040
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 3041
    .line 3042
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 3044
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 3045
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedSerializedSize:I

    .line 3046
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 2843
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasLang()Z
    .locals 2

    .line 2926
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

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

    .line 2968
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

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

    .line 2899
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$4500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    .line 2900
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 2899
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 3010
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedIsInitialized:B

    .line 3011
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 3012
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 3014
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->memoizedIsInitialized:B

    .line 3015
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2819
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3110
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3119
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 3120
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2819
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3114
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

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

    .line 3053
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

    .line 3020
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getSerializedSize()I

    .line 3021
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3022
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getLangBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 3024
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3025
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 3027
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 3028
    return-void
.end method
