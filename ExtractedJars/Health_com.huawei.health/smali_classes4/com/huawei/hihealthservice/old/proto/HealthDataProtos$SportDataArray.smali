.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportDataArray"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    }
.end annotation


# static fields
.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;>;"
        }
    .end annotation
.end field

.field public static final SPORTDATA_FIELD_NUMBER:I = 0x1

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private sportData_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;"
        }
    .end annotation
.end field

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18082
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    .line 18648
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    .line 18649
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->initFields()V

    .line 18650
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18027
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 18141
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedIsInitialized:B

    .line 18160
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedSerializedSize:I

    .line 18028
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->initFields()V

    .line 18029
    const/4 v2, 0x0

    .line 18031
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 18033
    const/4 v4, 0x0

    .line 18034
    :goto_0
    if-nez v4, :cond_2

    .line 18035
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 18036
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 18038
    :sswitch_0
    const/4 v4, 0x1

    .line 18039
    goto :goto_2

    .line 18041
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 18043
    const/4 v4, 0x1

    goto :goto_2

    .line 18048
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 18049
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    .line 18050
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 18052
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->access$10700()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18056
    :cond_1
    :goto_2
    goto :goto_0

    .line 18063
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 18064
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    .line 18066
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 18067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->makeExtensionsImmutable()V

    .line 18068
    goto :goto_3

    .line 18057
    :catch_0
    move-exception v4

    .line 18058
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 18059
    :catch_1
    move-exception v4

    .line 18060
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 18061
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18063
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 18064
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    .line 18066
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 18067
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->makeExtensionsImmutable()V

    .line 18068
    throw v6

    .line 18069
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

    .line 17998
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 18004
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 18141
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedIsInitialized:B

    .line 18160
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedSerializedSize:I

    .line 18005
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 18006
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 17998
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 18007
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 18141
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedIsInitialized:B

    .line 18160
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedSerializedSize:I

    .line 18007
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$25000()Z
    .locals 1

    .line 17998
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$25200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Ljava/util/List;
    .locals 1

    .line 17998
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$25202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 17998
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$25300()Z
    .locals 1

    .line 17998
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$25400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 17998
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1

    .line 18011
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 18072
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$24500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 18139
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    .line 18140
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18235
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->access$24800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18238
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18215
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18221
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18185
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18191
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18226
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18232
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18205
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18211
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18195
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 18201
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 17998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 17998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;
    .locals 1

    .line 18015
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;>;"
        }
    .end annotation

    .line 18094
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 18162
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedSerializedSize:I

    .line 18163
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 18165
    :cond_0
    const/4 v2, 0x0

    .line 18166
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 18167
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    .line 18168
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 18166
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 18170
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 18171
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedSerializedSize:I

    .line 18172
    return v2
.end method

.method public getSportData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1

    .line 18122
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 18123
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 18125
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public getSportDataCount()I
    .locals 1

    .line 18116
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getSportDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;"
        }
    .end annotation

    .line 18103
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    return-object v0
.end method

.method public getSportDataOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;
    .locals 1

    .line 18132
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 18133
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 18135
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;

    return-object v0
.end method

.method public getSportDataOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;>;"
        }
    .end annotation

    .line 18110
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 18022
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 18077
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$24600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 18078
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 18077
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 18143
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedIsInitialized:B

    .line 18144
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 18145
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 18147
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->memoizedIsInitialized:B

    .line 18148
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17998
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 17998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18236
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 2

    .line 18245
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 18246
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 17998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 17998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 18240
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

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

    .line 18179
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

    .line 18153
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getSerializedSize()I

    .line 18154
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 18155
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->sportData_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 18154
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 18157
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 18158
    return-void
.end method
