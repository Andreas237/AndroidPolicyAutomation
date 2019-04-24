.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArrayOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SleepDataArray"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    }
.end annotation


# static fields
.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;>;"
        }
    .end annotation
.end field

.field public static final SLEEPDATA_FIELD_NUMBER:I = 0x1

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private sleepData_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;"
        }
    .end annotation
.end field

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 16021
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    .line 16587
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    .line 16588
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->initFields()V

    .line 16589
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 15966
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 16080
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedIsInitialized:B

    .line 16099
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedSerializedSize:I

    .line 15967
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->initFields()V

    .line 15968
    const/4 v2, 0x0

    .line 15970
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 15972
    const/4 v4, 0x0

    .line 15973
    :goto_0
    if-nez v4, :cond_2

    .line 15974
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 15975
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 15977
    :sswitch_0
    const/4 v4, 0x1

    .line 15978
    goto :goto_2

    .line 15980
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 15982
    const/4 v4, 0x1

    goto :goto_2

    .line 15987
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 15988
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    .line 15989
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 15991
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->access$21400()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15995
    :cond_1
    :goto_2
    goto :goto_0

    .line 16002
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 16003
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    .line 16005
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 16006
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->makeExtensionsImmutable()V

    .line 16007
    goto :goto_3

    .line 15996
    :catch_0
    move-exception v4

    .line 15997
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 15998
    :catch_1
    move-exception v4

    .line 15999
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 16000
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16002
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 16003
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    .line 16005
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 16006
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->makeExtensionsImmutable()V

    .line 16007
    throw v6

    .line 16008
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

    .line 15937
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 15943
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 16080
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedIsInitialized:B

    .line 16099
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedSerializedSize:I

    .line 15944
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 15945
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 15937
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 15946
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 16080
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedIsInitialized:B

    .line 16099
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedSerializedSize:I

    .line 15946
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$22000()Z
    .locals 1

    .line 15937
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$22200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Ljava/util/List;
    .locals 1

    .line 15937
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$22202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 15937
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$22300()Z
    .locals 1

    .line 15937
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$22400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 15937
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1

    .line 15950
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 16011
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$21500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 16078
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    .line 16079
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16174
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->access$21800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16177
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16154
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16160
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 16124
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 16130
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16165
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16171
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16144
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16150
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 16134
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 16140
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 15937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 15937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;
    .locals 1

    .line 15954
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;>;"
        }
    .end annotation

    .line 16033
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 16101
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedSerializedSize:I

    .line 16102
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 16104
    :cond_0
    const/4 v2, 0x0

    .line 16105
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 16106
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    .line 16107
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 16105
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 16109
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 16110
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedSerializedSize:I

    .line 16111
    return v2
.end method

.method public getSleepData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;
    .locals 1

    .line 16061
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 16062
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 16064
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;

    return-object v0
.end method

.method public getSleepDataCount()I
    .locals 1

    .line 16055
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getSleepDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;>;"
        }
    .end annotation

    .line 16042
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    return-object v0
.end method

.method public getSleepDataOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;
    .locals 1

    .line 16071
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 16072
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 16074
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;

    return-object v0
.end method

.method public getSleepDataOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataOrBuilder;>;"
        }
    .end annotation

    .line 16049
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 15961
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 16016
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$21600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    .line 16017
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 16016
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 16082
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedIsInitialized:B

    .line 16083
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 16084
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 16086
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->memoizedIsInitialized:B

    .line 16087
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15937
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 15937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16175
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 2

    .line 16184
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 16185
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 15937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 15937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;
    .locals 1

    .line 16179
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

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

    .line 16118
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

    .line 16092
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getSerializedSize()I

    .line 16093
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 16094
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->sleepData_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 16093
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 16096
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 16097
    return-void
.end method
