.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StringMapEntry"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    }
.end annotation


# static fields
.field public static final DOUBLEVALUE_FIELD_NUMBER:I = 0x4

.field public static final FLOATVALUE_FIELD_NUMBER:I = 0x7

.field public static final INTEGERMAPVALUE_FIELD_NUMBER:I = 0x8

.field public static final INTVALUE_FIELD_NUMBER:I = 0x2

.field public static final KEY_FIELD_NUMBER:I = 0x1

.field public static final LONGVALUE_FIELD_NUMBER:I = 0x3

.field public static final MAPVALUE_FIELD_NUMBER:I = 0x6

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;"
        }
    .end annotation
.end field

.field public static final STRINGVALUE_FIELD_NUMBER:I = 0x5

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private doubleValue_:D

.field private floatValue_:F

.field private intValue_:I

.field private integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

.field private key_:Ljava/lang/Object;

.field private longValue_:J

.field private mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private stringValue_:Ljava/lang/Object;

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 19435
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    .line 20523
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    .line 20524
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->initFields()V

    .line 20525
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19333
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 19647
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedIsInitialized:B

    .line 19687
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedSerializedSize:I

    .line 19334
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->initFields()V

    .line 19335
    const/4 v2, 0x0

    .line 19337
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 19339
    const/4 v4, 0x0

    .line 19340
    :goto_0
    if-nez v4, :cond_5

    .line 19341
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 19342
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 19344
    :sswitch_0
    const/4 v4, 0x1

    .line 19345
    goto/16 :goto_2

    .line 19347
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 19349
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 19354
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 19355
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19356
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    .line 19357
    goto/16 :goto_2

    .line 19360
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19361
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->intValue_:I

    .line 19362
    goto/16 :goto_2

    .line 19365
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19366
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->longValue_:J

    .line 19367
    goto/16 :goto_2

    .line 19370
    :sswitch_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19371
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->doubleValue_:D

    .line 19372
    goto/16 :goto_2

    .line 19375
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 19376
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19377
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    .line 19378
    goto/16 :goto_2

    .line 19381
    :sswitch_6
    const/4 v6, 0x0

    .line 19382
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    .line 19383
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v6

    .line 19385
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->access$26500()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 19386
    if-eqz v6, :cond_1

    .line 19387
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    .line 19388
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 19390
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19391
    goto :goto_2

    .line 19394
    :sswitch_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    .line 19395
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->floatValue_:F

    .line 19396
    goto :goto_2

    .line 19399
    :sswitch_8
    const/4 v6, 0x0

    .line 19400
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_2

    .line 19401
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v6

    .line 19403
    :cond_2
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->access$26600()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19404
    if-eqz v6, :cond_3

    .line 19405
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    .line 19406
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19408
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19409
    .line 19412
    :cond_4
    :goto_2
    goto/16 :goto_0

    .line 19419
    :cond_5
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 19420
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->makeExtensionsImmutable()V

    .line 19421
    goto :goto_3

    .line 19413
    :catch_0
    move-exception v4

    .line 19414
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 19415
    :catch_1
    move-exception v4

    .line 19416
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 19417
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19419
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 19420
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->makeExtensionsImmutable()V

    .line 19421
    throw v7

    .line 19422
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x21 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x3d -> :sswitch_7
        0x42 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19304
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 19310
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 19647
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedIsInitialized:B

    .line 19687
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedSerializedSize:I

    .line 19311
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 19312
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 19304
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 19313
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 19647
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedIsInitialized:B

    .line 19687
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedSerializedSize:I

    .line 19313
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$27200()Z
    .locals 1

    .line 19304
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$27400(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Ljava/lang/Object;
    .locals 1

    .line 19304
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$27402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19304
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$27502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;I)I
    .locals 0

    .line 19304
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->intValue_:I

    return p1
.end method

.method static synthetic access$27602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;J)J
    .locals 0

    .line 19304
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->longValue_:J

    return-wide p1
.end method

.method static synthetic access$27702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;D)D
    .locals 0

    .line 19304
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->doubleValue_:D

    return-wide p1
.end method

.method static synthetic access$27800(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Ljava/lang/Object;
    .locals 1

    .line 19304
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$27802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19304
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$27902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 0

    .line 19304
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object p1
.end method

.method static synthetic access$28002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;F)F
    .locals 0

    .line 19304
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->floatValue_:F

    return p1
.end method

.method static synthetic access$28102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 0

    .line 19304
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object p1
.end method

.method static synthetic access$28202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;I)I
    .locals 0

    .line 19304
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    return p1
.end method

.method static synthetic access$28300()Lcom/google/protobuf/Parser;
    .locals 1

    .line 19304
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1

    .line 19317
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 19425
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$26700()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 19638
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    .line 19639
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->intValue_:I

    .line 19640
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->longValue_:J

    .line 19641
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->doubleValue_:D

    .line 19642
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    .line 19643
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 19644
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->floatValue_:F

    .line 19645
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19646
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19790
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->access$27000()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19793
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19770
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19776
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19740
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19746
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19781
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19787
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19760
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19766
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19750
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19756
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 19304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 19304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1

    .line 19321
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public getDoubleValue()D
    .locals 2

    .line 19535
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->doubleValue_:D

    return-wide v0
.end method

.method public getFloatValue()F
    .locals 1

    .line 19613
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->floatValue_:F

    return v0
.end method

.method public getIntValue()I
    .locals 1

    .line 19505
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->intValue_:I

    return v0
.end method

.method public getIntegerMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1

    .line 19628
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public getIntegerMapValueOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;
    .locals 1

    .line 19634
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 4

    .line 19463
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    .line 19464
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 19465
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 19467
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 19469
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 19470
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19471
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    .line 19473
    :cond_1
    return-object v3
.end method

.method public getKeyBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 19481
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    .line 19482
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 19483
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 19484
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 19486
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->key_:Ljava/lang/Object;

    .line 19487
    return-object v2

    .line 19489
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getLongValue()J
    .locals 2

    .line 19520
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->longValue_:J

    return-wide v0
.end method

.method public getMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1

    .line 19592
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public getMapValueOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;
    .locals 1

    .line 19598
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;"
        }
    .end annotation

    .line 19447
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 19689
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedSerializedSize:I

    .line 19690
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 19692
    :cond_0
    const/4 v3, 0x0

    .line 19693
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 19694
    .line 19695
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getKeyBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 19697
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 19698
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->intValue_:I

    .line 19699
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 19701
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 19702
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->longValue_:J

    .line 19703
    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 19705
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 19706
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->doubleValue_:D

    .line 19707
    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeDoubleSize(ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 19709
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 19710
    .line 19711
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getStringValueBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 19713
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 19714
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 19715
    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 19717
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 19718
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->floatValue_:F

    .line 19719
    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    move-result v0

    add-int/2addr v3, v0

    .line 19721
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 19722
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19723
    const/16 v1, 0x8

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 19725
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 19726
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedSerializedSize:I

    .line 19727
    return v3
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 4

    .line 19550
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    .line 19551
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 19552
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 19554
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 19556
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 19557
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19558
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    .line 19560
    :cond_1
    return-object v3
.end method

.method public getStringValueBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 19568
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    .line 19569
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 19570
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 19571
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 19573
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->stringValue_:Ljava/lang/Object;

    .line 19574
    return-object v2

    .line 19576
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 19328
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasDoubleValue()Z
    .locals 2

    .line 19529
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasFloatValue()Z
    .locals 2

    .line 19607
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasIntValue()Z
    .locals 2

    .line 19499
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

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

.method public hasIntegerMapValue()Z
    .locals 2

    .line 19622
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 19457
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

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

.method public hasLongValue()Z
    .locals 2

    .line 19514
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasMapValue()Z
    .locals 2

    .line 19586
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasStringValue()Z
    .locals 2

    .line 19544
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

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

    .line 19430
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$26800()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19431
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 19430
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 19649
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedIsInitialized:B

    .line 19650
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 19651
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 19653
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->memoizedIsInitialized:B

    .line 19654
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19304
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 19304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19791
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 19800
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 19801
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 19304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19795
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

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

    .line 19734
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

    .line 19659
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getSerializedSize()I

    .line 19660
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 19661
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getKeyBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 19663
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 19664
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->intValue_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 19666
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 19667
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->longValue_:J

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 19669
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 19670
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->doubleValue_:D

    const/4 v2, 0x4

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeDouble(ID)V

    .line 19672
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 19673
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getStringValueBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 19675
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 19676
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 19678
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 19679
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->floatValue_:F

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 19681
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_7

    .line 19682
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 19684
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 19685
    return-void
.end method
