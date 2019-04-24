.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AuthorizationItem"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    }
.end annotation


# static fields
.field public static final AUTHORIZATION_FIELD_NUMBER:I = 0x2

.field public static final ITEMID_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private authorization_:I

.field private bitField0_:I

.field private itemId_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 2419
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    .line 2777
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    .line 2778
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->initFields()V

    .line 2779
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2365
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 2469
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedIsInitialized:B

    .line 2491
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedSerializedSize:I

    .line 2366
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->initFields()V

    .line 2367
    const/4 v2, 0x0

    .line 2369
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 2371
    const/4 v4, 0x0

    .line 2372
    :goto_0
    if-nez v4, :cond_1

    .line 2373
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 2374
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 2376
    :sswitch_0
    const/4 v4, 0x1

    .line 2377
    goto :goto_2

    .line 2379
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2381
    const/4 v4, 0x1

    goto :goto_2

    .line 2386
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    .line 2387
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->itemId_:I

    .line 2388
    goto :goto_2

    .line 2391
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    .line 2392
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->authorization_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2396
    :cond_0
    :goto_2
    goto :goto_0

    .line 2403
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 2404
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->makeExtensionsImmutable()V

    .line 2405
    goto :goto_3

    .line 2397
    :catch_0
    move-exception v4

    .line 2398
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 2399
    :catch_1
    move-exception v4

    .line 2400
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 2401
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2403
    :catchall_0
    move-exception v6

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 2404
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->makeExtensionsImmutable()V

    .line 2405
    throw v6

    .line 2406
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

    .line 2336
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 2342
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 2469
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedIsInitialized:B

    .line 2491
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedSerializedSize:I

    .line 2343
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 2344
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 2336
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 2345
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 2469
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedIsInitialized:B

    .line 2491
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedSerializedSize:I

    .line 2345
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$4002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;I)I
    .locals 0

    .line 2336
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->itemId_:I

    return p1
.end method

.method static synthetic access$4102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;I)I
    .locals 0

    .line 2336
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->authorization_:I

    return p1
.end method

.method static synthetic access$4202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;I)I
    .locals 0

    .line 2336
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    return p1
.end method

.method static synthetic access$4300()Lcom/google/protobuf/Parser;
    .locals 1

    .line 2336
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1

    .line 2349
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 2409
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$3400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 2466
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->itemId_:I

    .line 2467
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->authorization_:I

    .line 2468
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2570
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->access$3700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2573
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2550
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2556
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2520
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2526
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2561
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2567
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2540
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2546
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2530
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2536
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method


# virtual methods
.method public getAuthorization()I
    .locals 1

    .line 2462
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->authorization_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1

    .line 2353
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    .line 2447
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->itemId_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation

    .line 2431
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 2493
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedSerializedSize:I

    .line 2494
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 2496
    :cond_0
    const/4 v2, 0x0

    .line 2497
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2498
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->itemId_:I

    .line 2499
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 2501
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 2502
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->authorization_:I

    .line 2503
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 2505
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 2506
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedSerializedSize:I

    .line 2507
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 2360
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasAuthorization()Z
    .locals 2

    .line 2456
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

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

.method public hasItemId()Z
    .locals 2

    .line 2441
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 2414
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$3500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    .line 2415
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 2414
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 2471
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedIsInitialized:B

    .line 2472
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 2473
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 2475
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->memoizedIsInitialized:B

    .line 2476
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2336
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2571
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2580
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 2581
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2575
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

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

    .line 2514
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

    .line 2481
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getSerializedSize()I

    .line 2482
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2483
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->itemId_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 2485
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2486
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->authorization_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 2488
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 2489
    return-void
.end method
