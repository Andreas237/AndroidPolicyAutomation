.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGArrTypeMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    }
.end annotation


# static fields
.field public static final KEY_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;"
        }
    .end annotation
.end field

.field public static final VALUE_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

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

    .line 30068
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    .line 30428
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    .line 30429
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->initFields()V

    .line 30430
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30014
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 30118
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedIsInitialized:B

    .line 30140
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedSerializedSize:I

    .line 30015
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->initFields()V

    .line 30016
    const/4 v2, 0x0

    .line 30018
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 30020
    const/4 v4, 0x0

    .line 30021
    :goto_0
    if-nez v4, :cond_1

    .line 30022
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 30023
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 30025
    :sswitch_0
    const/4 v4, 0x1

    .line 30026
    goto :goto_2

    .line 30028
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30030
    const/4 v4, 0x1

    goto :goto_2

    .line 30035
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    .line 30036
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->key_:I

    .line 30037
    goto :goto_2

    .line 30040
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    .line 30041
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->value_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30045
    :cond_0
    :goto_2
    goto :goto_0

    .line 30052
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 30053
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->makeExtensionsImmutable()V

    .line 30054
    goto :goto_3

    .line 30046
    :catch_0
    move-exception v4

    .line 30047
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 30048
    :catch_1
    move-exception v4

    .line 30049
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 30050
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30052
    :catchall_0
    move-exception v6

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 30053
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->makeExtensionsImmutable()V

    .line 30054
    throw v6

    .line 30055
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

    .line 29985
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 29991
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 30118
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedIsInitialized:B

    .line 30140
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedSerializedSize:I

    .line 29992
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 29993
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 29985
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 29994
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 30118
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedIsInitialized:B

    .line 30140
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedSerializedSize:I

    .line 29994
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$38800()Lcom/google/protobuf/Parser;
    .locals 1

    .line 29985
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$42700()Z
    .locals 1

    .line 29985
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$42902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;I)I
    .locals 0

    .line 29985
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->key_:I

    return p1
.end method

.method static synthetic access$43002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;I)I
    .locals 0

    .line 29985
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->value_:I

    return p1
.end method

.method static synthetic access$43102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;I)I
    .locals 0

    .line 29985
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1

    .line 29998
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 30058
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$42200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 30115
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->key_:I

    .line 30116
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->value_:I

    .line 30117
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30219
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->access$42500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30222
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30199
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30205
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30169
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30175
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30210
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30216
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30189
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30195
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30179
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30185
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 29985
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29985
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1

    .line 30002
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 30096
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->key_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;"
        }
    .end annotation

    .line 30080
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 30142
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedSerializedSize:I

    .line 30143
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 30145
    :cond_0
    const/4 v2, 0x0

    .line 30146
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 30147
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->key_:I

    .line 30148
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 30150
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 30151
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->value_:I

    .line 30152
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 30154
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 30155
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedSerializedSize:I

    .line 30156
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 30009
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 30111
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->value_:I

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 30090
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

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

    .line 30105
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

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

    .line 30063
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$42300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    .line 30064
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 30063
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 30120
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedIsInitialized:B

    .line 30121
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 30122
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 30124
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->memoizedIsInitialized:B

    .line 30125
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29985
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29985
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29985
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30220
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 2

    .line 30229
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 30230
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29985
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29985
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;
    .locals 1

    .line 30224
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap$Builder;

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

    .line 30163
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

    .line 30130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getSerializedSize()I

    .line 30131
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 30132
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->key_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 30134
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 30135
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->value_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 30137
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 30138
    return-void
.end method
