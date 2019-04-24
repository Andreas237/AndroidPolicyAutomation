.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MotionTimeLine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    }
.end annotation


# static fields
.field public static final BASETIMELINE_FIELD_NUMBER:I = 0x1

.field public static final HEARTRATETIMELINE_FIELD_NUMBER:I = 0x3

.field public static final MOTIONPATH_FIELD_NUMBER:I = 0x4

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;>;"
        }
    .end annotation
.end field

.field public static final SPORTTIMELINE_FIELD_NUMBER:I = 0x2

.field public static final TOTALCALORY_FIELD_NUMBER:I = 0x5

.field public static final TOTALDISTANCE_FIELD_NUMBER:I = 0x6

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

.field private bitField0_:I

.field private heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

.field private sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

.field private totalCalory_:I

.field private totalDistance_:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14380
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    .line 15392
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    .line 15393
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->initFields()V

    .line 15394
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14274
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 14518
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedIsInitialized:B

    .line 14552
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedSerializedSize:I

    .line 14275
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->initFields()V

    .line 14276
    const/4 v2, 0x0

    .line 14278
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 14280
    const/4 v4, 0x0

    .line 14281
    :goto_0
    if-nez v4, :cond_9

    .line 14282
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 14283
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 14285
    :sswitch_0
    const/4 v4, 0x1

    .line 14286
    goto/16 :goto_2

    .line 14288
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_8

    .line 14290
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 14295
    :sswitch_1
    const/4 v6, 0x0

    .line 14296
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 14297
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v6

    .line 14299
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11800()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14300
    if-eqz v6, :cond_1

    .line 14301
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 14302
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14304
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    .line 14305
    goto/16 :goto_2

    .line 14308
    :sswitch_2
    const/4 v6, 0x0

    .line 14309
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 14310
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v6

    .line 14312
    :cond_2
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->access$13300()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 14313
    if-eqz v6, :cond_3

    .line 14314
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 14315
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 14317
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    .line 14318
    goto/16 :goto_2

    .line 14321
    :sswitch_3
    const/4 v6, 0x0

    .line 14322
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 14323
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v6

    .line 14325
    :cond_4
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->access$14700()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 14326
    if-eqz v6, :cond_5

    .line 14327
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 14328
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 14330
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    .line 14331
    goto :goto_2

    .line 14334
    :sswitch_4
    const/4 v6, 0x0

    .line 14335
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_6

    .line 14336
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v6

    .line 14338
    :cond_6
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18900()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14339
    if-eqz v6, :cond_7

    .line 14340
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 14341
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14343
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    .line 14344
    goto :goto_2

    .line 14347
    :sswitch_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    .line 14348
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalCalory_:I

    .line 14349
    goto :goto_2

    .line 14352
    :sswitch_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    .line 14353
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalDistance_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14357
    :cond_8
    :goto_2
    goto/16 :goto_0

    .line 14364
    :cond_9
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 14365
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->makeExtensionsImmutable()V

    .line 14366
    goto :goto_3

    .line 14358
    :catch_0
    move-exception v4

    .line 14359
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 14360
    :catch_1
    move-exception v4

    .line 14361
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 14362
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14364
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 14365
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->makeExtensionsImmutable()V

    .line 14366
    throw v7

    .line 14367
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14245
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 14251
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 14518
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedIsInitialized:B

    .line 14552
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedSerializedSize:I

    .line 14252
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 14253
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 14245
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 14254
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 14518
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedIsInitialized:B

    .line 14552
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedSerializedSize:I

    .line 14254
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$19500()Z
    .locals 1

    .line 14245
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$19702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 0

    .line 14245
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object p1
.end method

.method static synthetic access$19802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 0

    .line 14245
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object p1
.end method

.method static synthetic access$19902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 0

    .line 14245
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object p1
.end method

.method static synthetic access$20002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 0

    .line 14245
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object p1
.end method

.method static synthetic access$20102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;I)I
    .locals 0

    .line 14245
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalCalory_:I

    return p1
.end method

.method static synthetic access$20202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;I)I
    .locals 0

    .line 14245
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalDistance_:I

    return p1
.end method

.method static synthetic access$20302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;I)I
    .locals 0

    .line 14245
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    return p1
.end method

.method static synthetic access$20400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 14245
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1

    .line 14258
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 14370
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$19000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 14511
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14512
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 14513
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 14514
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14515
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalCalory_:I

    .line 14516
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalDistance_:I

    .line 14517
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14647
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->access$19300()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14650
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14627
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14633
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14597
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14603
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14638
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14644
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14617
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14623
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14607
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14613
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method


# virtual methods
.method public getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 14408
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
    .locals 1

    .line 14414
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 14245
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 14245
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;
    .locals 1

    .line 14262
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    return-object v0
.end method

.method public getHeartRateTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1

    .line 14450
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public getHeartRateTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;
    .locals 1

    .line 14456
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public getMotionPath()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1

    .line 14471
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public getMotionPathOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;
    .locals 1

    .line 14477
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;>;"
        }
    .end annotation

    .line 14392
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 14554
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedSerializedSize:I

    .line 14555
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 14557
    :cond_0
    const/4 v2, 0x0

    .line 14558
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 14559
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 14560
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 14562
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 14563
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 14564
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 14566
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 14567
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 14568
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 14570
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 14571
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14572
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 14574
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 14575
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalCalory_:I

    .line 14576
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 14578
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 14579
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalDistance_:I

    .line 14580
    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 14582
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 14583
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedSerializedSize:I

    .line 14584
    return v2
.end method

.method public getSportTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1

    .line 14429
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public getSportTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;
    .locals 1

    .line 14435
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public getTotalCalory()I
    .locals 1

    .line 14492
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalCalory_:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 14507
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalDistance_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 14269
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasBaseTimeLine()Z
    .locals 2

    .line 14402
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

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

.method public hasHeartRateTimeLine()Z
    .locals 2

    .line 14444
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

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

.method public hasMotionPath()Z
    .locals 2

    .line 14465
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

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

.method public hasSportTimeLine()Z
    .locals 2

    .line 14423
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

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

.method public hasTotalCalory()Z
    .locals 2

    .line 14486
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

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

.method public hasTotalDistance()Z
    .locals 2

    .line 14501
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 14375
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$19100()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    .line 14376
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 14375
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 14520
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedIsInitialized:B

    .line 14521
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 14522
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 14524
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->memoizedIsInitialized:B

    .line 14525
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14245
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14245
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14245
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14648
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 2

    .line 14657
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 14658
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14245
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14245
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;
    .locals 1

    .line 14652
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine$Builder;

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

    .line 14591
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

    .line 14530
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getSerializedSize()I

    .line 14531
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 14532
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 14534
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 14535
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->sportTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 14537
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 14538
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->heartRateTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 14540
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 14541
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->motionPath_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 14543
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 14544
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalCalory_:I

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 14546
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 14547
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->totalDistance_:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 14549
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 14550
    return-void
.end method
