.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MotionPathPaceData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    }
.end annotation


# static fields
.field public static final KEY_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;>;"
        }
    .end annotation
.end field

.field public static final VALUE_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private key_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;

.field private value_:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 22012
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    .line 22371
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    .line 22372
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->initFields()V

    .line 22373
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21958
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 22062
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedIsInitialized:B

    .line 22084
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedSerializedSize:I

    .line 21959
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->initFields()V

    .line 21960
    const/4 v2, 0x0

    .line 21962
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 21964
    const/4 v4, 0x0

    .line 21965
    :goto_0
    if-nez v4, :cond_1

    .line 21966
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 21967
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 21969
    :sswitch_0
    const/4 v4, 0x1

    .line 21970
    goto :goto_2

    .line 21972
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 21974
    const/4 v4, 0x1

    goto :goto_2

    .line 21979
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    .line 21980
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->key_:I

    .line 21981
    goto :goto_2

    .line 21984
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    .line 21985
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->value_:F
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21989
    :cond_0
    :goto_2
    goto :goto_0

    .line 21996
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 21997
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->makeExtensionsImmutable()V

    .line 21998
    goto :goto_3

    .line 21990
    :catch_0
    move-exception v4

    .line 21991
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 21992
    :catch_1
    move-exception v4

    .line 21993
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 21994
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21996
    :catchall_0
    move-exception v6

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 21997
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->makeExtensionsImmutable()V

    .line 21998
    throw v6

    .line 21999
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x15 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21929
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 21935
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 22062
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedIsInitialized:B

    .line 22084
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedSerializedSize:I

    .line 21936
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 21937
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 21929
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 21938
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 22062
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedIsInitialized:B

    .line 22084
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedSerializedSize:I

    .line 21938
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$15800()Lcom/google/protobuf/Parser;
    .locals 1

    .line 21929
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$30802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;I)I
    .locals 0

    .line 21929
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->key_:I

    return p1
.end method

.method static synthetic access$30902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;F)F
    .locals 0

    .line 21929
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->value_:F

    return p1
.end method

.method static synthetic access$31002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;I)I
    .locals 0

    .line 21929
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1

    .line 21942
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 22002
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$30200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 22059
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->key_:I

    .line 22060
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->value_:F

    .line 22061
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22163
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->access$30500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22166
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22143
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22149
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22113
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22119
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22154
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22160
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22133
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22139
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22123
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 22129
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 21929
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 21929
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1

    .line 21946
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 22040
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->key_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;>;"
        }
    .end annotation

    .line 22024
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 22086
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedSerializedSize:I

    .line 22087
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 22089
    :cond_0
    const/4 v2, 0x0

    .line 22090
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 22091
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->key_:I

    .line 22092
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 22094
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 22095
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->value_:F

    .line 22096
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    move-result v0

    add-int/2addr v2, v0

    .line 22098
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 22099
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedSerializedSize:I

    .line 22100
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 21953
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getValue()F
    .locals 1

    .line 22055
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->value_:F

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 22034
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

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

    .line 22049
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

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

    .line 22007
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$30300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 22008
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 22007
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 22064
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedIsInitialized:B

    .line 22065
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 22066
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 22068
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->memoizedIsInitialized:B

    .line 22069
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21929
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21929
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 21929
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22164
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 22173
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 22174
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21929
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 21929
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 22168
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

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

    .line 22107
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

    .line 22074
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getSerializedSize()I

    .line 22075
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 22076
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->key_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 22078
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 22079
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->value_:F

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 22081
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 22082
    return-void
.end method
