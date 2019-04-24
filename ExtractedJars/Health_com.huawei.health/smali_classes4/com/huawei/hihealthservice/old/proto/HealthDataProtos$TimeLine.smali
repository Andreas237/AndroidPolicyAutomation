.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TimeLine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    }
.end annotation


# static fields
.field public static final BASEHEALTHDATA_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;>;"
        }
    .end annotation
.end field

.field public static final SPORTDURATION_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private sportDuration_:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 8261
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    .line 8720
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 8721
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->initFields()V

    .line 8722
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8199
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 8317
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedIsInitialized:B

    .line 8339
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedSerializedSize:I

    .line 8200
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->initFields()V

    .line 8201
    const/4 v2, 0x0

    .line 8203
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 8205
    const/4 v4, 0x0

    .line 8206
    :goto_0
    if-nez v4, :cond_3

    .line 8207
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 8208
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 8210
    :sswitch_0
    const/4 v4, 0x1

    .line 8211
    goto :goto_2

    .line 8213
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8215
    const/4 v4, 0x1

    goto :goto_2

    .line 8220
    :sswitch_1
    const/4 v6, 0x0

    .line 8221
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 8222
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v6

    .line 8224
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8225
    if-eqz v6, :cond_1

    .line 8226
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 8227
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8229
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    .line 8230
    goto :goto_2

    .line 8233
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    .line 8234
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->sportDuration_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8238
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 8245
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8246
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->makeExtensionsImmutable()V

    .line 8247
    goto :goto_3

    .line 8239
    :catch_0
    move-exception v4

    .line 8240
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 8241
    :catch_1
    move-exception v4

    .line 8242
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 8243
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8245
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8246
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->makeExtensionsImmutable()V

    .line 8247
    throw v7

    .line 8248
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

    .line 8170
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 8176
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 8317
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedIsInitialized:B

    .line 8339
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedSerializedSize:I

    .line 8177
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8178
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 8170
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 8179
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 8317
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedIsInitialized:B

    .line 8339
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedSerializedSize:I

    .line 8179
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$11300()Z
    .locals 1

    .line 8170
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$11502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 0

    .line 8170
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object p1
.end method

.method static synthetic access$11602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;I)I
    .locals 0

    .line 8170
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->sportDuration_:I

    return p1
.end method

.method static synthetic access$11702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;I)I
    .locals 0

    .line 8170
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    return p1
.end method

.method static synthetic access$11800()Lcom/google/protobuf/Parser;
    .locals 1

    .line 8170
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 8183
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 8251
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$10800()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 8314
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8315
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->sportDuration_:I

    .line 8316
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8418
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->access$11100()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8421
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8398
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8404
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8368
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8374
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8409
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8415
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8388
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8394
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8378
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8384
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method


# virtual methods
.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 8289
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 8295
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 8170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 8170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 8187
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;>;"
        }
    .end annotation

    .line 8273
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 8341
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedSerializedSize:I

    .line 8342
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 8344
    :cond_0
    const/4 v2, 0x0

    .line 8345
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 8346
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 8347
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 8349
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 8350
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->sportDuration_:I

    .line 8351
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 8353
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 8354
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedSerializedSize:I

    .line 8355
    return v2
.end method

.method public getSportDuration()I
    .locals 1

    .line 8310
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->sportDuration_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 8194
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 8283
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

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

.method public hasSportDuration()Z
    .locals 2

    .line 8304
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

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

    .line 8256
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$10900()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 8257
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 8256
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 8319
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedIsInitialized:B

    .line 8320
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 8321
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 8323
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->memoizedIsInitialized:B

    .line 8324
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8170
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 8170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8419
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 2

    .line 8428
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 8429
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 8170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;
    .locals 1

    .line 8423
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

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

    .line 8362
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

    .line 8329
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getSerializedSize()I

    .line 8330
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 8331
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 8333
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 8334
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->sportDuration_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 8336
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 8337
    return-void
.end method
