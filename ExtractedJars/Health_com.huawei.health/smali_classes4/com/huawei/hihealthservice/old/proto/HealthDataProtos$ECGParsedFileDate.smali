.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGParsedFileDate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    }
.end annotation


# static fields
.field public static final DIR_FIELD_NUMBER:I = 0x3

.field public static final DURATIONPERPOINT_FIELD_NUMBER:I = 0x4

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;>;"
        }
    .end annotation
.end field

.field public static final TIMESLICELIST_FIELD_NUMBER:I = 0x1

.field public static final WEBURL_FIELD_NUMBER:I = 0x2

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private dir_:Ljava/lang/Object;

.field private durationPerPoint_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private timeSliceList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation
.end field

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;

.field private webUrl_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26404
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    .line 27311
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 27312
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->initFields()V

    .line 27313
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 26332
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 26566
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedIsInitialized:B

    .line 26594
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedSerializedSize:I

    .line 26333
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->initFields()V

    .line 26334
    const/4 v2, 0x0

    .line 26336
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 26338
    const/4 v4, 0x0

    .line 26339
    :goto_0
    if-nez v4, :cond_2

    .line 26340
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 26341
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 26343
    :sswitch_0
    const/4 v4, 0x1

    .line 26344
    goto/16 :goto_2

    .line 26346
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 26348
    const/4 v4, 0x1

    goto :goto_2

    .line 26353
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 26354
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    .line 26355
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 26357
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->access$36200()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26358
    goto :goto_2

    .line 26361
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 26362
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    .line 26363
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    .line 26364
    goto :goto_2

    .line 26367
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 26368
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    .line 26369
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    .line 26370
    goto :goto_2

    .line 26373
    :sswitch_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    .line 26374
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->durationPerPoint_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26378
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 26385
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 26386
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    .line 26388
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 26389
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->makeExtensionsImmutable()V

    .line 26390
    goto :goto_3

    .line 26379
    :catch_0
    move-exception v4

    .line 26380
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 26381
    :catch_1
    move-exception v4

    .line 26382
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 26383
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26385
    :catchall_0
    move-exception v7

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 26386
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    .line 26388
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 26389
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->makeExtensionsImmutable()V

    .line 26390
    throw v7

    .line 26391
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 26303
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 26309
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 26566
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedIsInitialized:B

    .line 26594
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedSerializedSize:I

    .line 26310
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 26311
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 26303
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 26312
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 26566
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedIsInitialized:B

    .line 26594
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedSerializedSize:I

    .line 26312
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$32900()Lcom/google/protobuf/Parser;
    .locals 1

    .line 26303
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$36800()Z
    .locals 1

    .line 26303
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$37000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/util/List;
    .locals 1

    .line 26303
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$37002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 26303
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$37100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/lang/Object;
    .locals 1

    .line 26303
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$37102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 26303
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$37200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Ljava/lang/Object;
    .locals 1

    .line 26303
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$37202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 26303
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$37302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;I)I
    .locals 0

    .line 26303
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->durationPerPoint_:I

    return p1
.end method

.method static synthetic access$37402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;I)I
    .locals 0

    .line 26303
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    return p1
.end method

.method static synthetic access$37500()Z
    .locals 1

    .line 26303
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1

    .line 26316
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 26394
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$36300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 26561
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    .line 26562
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    .line 26563
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    .line 26564
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->durationPerPoint_:I

    .line 26565
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26681
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->access$36600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26684
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26661
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26667
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 26631
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 26637
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26672
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26678
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26651
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26657
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 26641
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 26647
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 26303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 26303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1

    .line 26320
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public getDir()Ljava/lang/String;
    .locals 4

    .line 26515
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    .line 26516
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 26517
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 26519
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 26521
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 26522
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26523
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    .line 26525
    :cond_1
    return-object v3
.end method

.method public getDirBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 26533
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    .line 26534
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 26535
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 26536
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 26538
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->dir_:Ljava/lang/Object;

    .line 26539
    return-object v2

    .line 26541
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getDurationPerPoint()I
    .locals 1

    .line 26557
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->durationPerPoint_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;>;"
        }
    .end annotation

    .line 26416
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 26596
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedSerializedSize:I

    .line 26597
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 26599
    :cond_0
    const/4 v2, 0x0

    .line 26600
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 26601
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    .line 26602
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 26600
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 26604
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 26605
    .line 26606
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getWebUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 26608
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 26609
    .line 26610
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDirBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 26612
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 26613
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->durationPerPoint_:I

    .line 26614
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 26616
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 26617
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedSerializedSize:I

    .line 26618
    return v2
.end method

.method public getTimeSliceList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1

    .line 26445
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 26446
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 26448
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public getTimeSliceListCount()I
    .locals 1

    .line 26439
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getTimeSliceListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation

    .line 26426
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    return-object v0
.end method

.method public getTimeSliceListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;
    .locals 1

    .line 26455
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 26456
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 26458
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;

    return-object v0
.end method

.method public getTimeSliceListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;>;"
        }
    .end annotation

    .line 26433
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 26327
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getWebUrl()Ljava/lang/String;
    .locals 4

    .line 26473
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    .line 26474
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 26475
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 26477
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 26479
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 26480
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26481
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    .line 26483
    :cond_1
    return-object v3
.end method

.method public getWebUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 26491
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    .line 26492
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 26493
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 26494
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 26496
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->webUrl_:Ljava/lang/Object;

    .line 26497
    return-object v2

    .line 26499
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasDir()Z
    .locals 2

    .line 26509
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

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

.method public hasDurationPerPoint()Z
    .locals 2

    .line 26551
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

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

.method public hasWebUrl()Z
    .locals 2

    .line 26467
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

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

    .line 26399
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$36400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    .line 26400
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 26399
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 26568
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedIsInitialized:B

    .line 26569
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 26570
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 26572
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->memoizedIsInitialized:B

    .line 26573
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 26303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 26303
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 26303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26682
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 26691
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 26692
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 26303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 26303
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 1

    .line 26686
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

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

    .line 26625
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

    .line 26578
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getSerializedSize()I

    .line 26579
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 26580
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->timeSliceList_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 26579
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 26582
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 26583
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getWebUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 26585
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 26586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDirBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 26588
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 26589
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->durationPerPoint_:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 26591
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 26592
    return-void
.end method
