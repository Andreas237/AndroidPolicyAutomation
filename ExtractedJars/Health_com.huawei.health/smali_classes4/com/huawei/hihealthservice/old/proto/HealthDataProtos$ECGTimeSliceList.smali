.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGTimeSliceList"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    }
.end annotation


# static fields
.field public static final ARRTYPEMAP_FIELD_NUMBER:I = 0x4

.field public static final MENDSTAMP_FIELD_NUMBER:I = 0x1

.field public static final MHEARTRATE_FIELD_NUMBER:I = 0x3

.field public static final MSTARTSTAMP_FIELD_NUMBER:I = 0x2

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private arrTypeMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private mEndStamp_:J

.field private mHeartRate_:I

.field private mStartStamp_:J

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28242
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    .line 29003
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    .line 29004
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->initFields()V

    .line 29005
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 28172
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 28350
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedIsInitialized:B

    .line 28378
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedSerializedSize:I

    .line 28173
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->initFields()V

    .line 28174
    const/4 v2, 0x0

    .line 28176
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 28178
    const/4 v4, 0x0

    .line 28179
    :goto_0
    if-nez v4, :cond_2

    .line 28180
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 28181
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 28183
    :sswitch_0
    const/4 v4, 0x1

    .line 28184
    goto/16 :goto_2

    .line 28186
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 28188
    const/4 v4, 0x1

    goto :goto_2

    .line 28193
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    .line 28194
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mEndStamp_:J

    .line 28195
    goto :goto_2

    .line 28198
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    .line 28199
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mStartStamp_:J

    .line 28200
    goto :goto_2

    .line 28203
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    .line 28204
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mHeartRate_:I

    .line 28205
    goto :goto_2

    .line 28208
    :sswitch_4
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 28209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    .line 28210
    or-int/lit8 v0, v2, 0x8

    move v2, v0

    .line 28212
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;->access$38800()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28216
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 28223
    :cond_2
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 28224
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    .line 28226
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 28227
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->makeExtensionsImmutable()V

    .line 28228
    goto :goto_3

    .line 28217
    :catch_0
    move-exception v4

    .line 28218
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 28219
    :catch_1
    move-exception v4

    .line 28220
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 28221
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28223
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 28224
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    .line 28226
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 28227
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->makeExtensionsImmutable()V

    .line 28228
    throw v6

    .line 28229
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 28143
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 28149
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 28350
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedIsInitialized:B

    .line 28378
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedSerializedSize:I

    .line 28150
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 28151
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 28143
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 28152
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 28350
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedIsInitialized:B

    .line 28378
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedSerializedSize:I

    .line 28152
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$36200()Lcom/google/protobuf/Parser;
    .locals 1

    .line 28143
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$39400()Z
    .locals 1

    .line 28143
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$39602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;J)J
    .locals 0

    .line 28143
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mEndStamp_:J

    return-wide p1
.end method

.method static synthetic access$39702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;J)J
    .locals 0

    .line 28143
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mStartStamp_:J

    return-wide p1
.end method

.method static synthetic access$39802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;I)I
    .locals 0

    .line 28143
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mHeartRate_:I

    return p1
.end method

.method static synthetic access$39900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Ljava/util/List;
    .locals 1

    .line 28143
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$39902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 28143
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$40002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;I)I
    .locals 0

    .line 28143
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    return p1
.end method

.method static synthetic access$40100()Z
    .locals 1

    .line 28143
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1

    .line 28156
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 28232
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$38900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 28345
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mEndStamp_:J

    .line 28346
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mStartStamp_:J

    .line 28347
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mHeartRate_:I

    .line 28348
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    .line 28349
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28465
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->access$39200()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28468
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28445
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28451
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 28415
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 28421
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28456
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28462
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28435
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28441
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 28425
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 28431
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method


# virtual methods
.method public getArrTypeMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;
    .locals 1

    .line 28328
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 28329
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 28331
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;

    return-object v0
.end method

.method public getArrTypeMapCount()I
    .locals 1

    .line 28322
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getArrTypeMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMap;>;"
        }
    .end annotation

    .line 28309
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    return-object v0
.end method

.method public getArrTypeMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;
    .locals 1

    .line 28338
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 28339
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 28341
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;

    return-object v0
.end method

.method public getArrTypeMapOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGArrTypeMapOrBuilder;>;"
        }
    .end annotation

    .line 28316
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 28143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 28143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
    .locals 1

    .line 28160
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    return-object v0
.end method

.method public getMEndStamp()J
    .locals 2

    .line 28270
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mEndStamp_:J

    return-wide v0
.end method

.method public getMHeartRate()I
    .locals 1

    .line 28300
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mHeartRate_:I

    return v0
.end method

.method public getMStartStamp()J
    .locals 2

    .line 28285
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mStartStamp_:J

    return-wide v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation

    .line 28254
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 28380
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedSerializedSize:I

    .line 28381
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 28383
    :cond_0
    const/4 v3, 0x0

    .line 28384
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 28385
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mEndStamp_:J

    .line 28386
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 28388
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 28389
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mStartStamp_:J

    .line 28390
    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 28392
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 28393
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mHeartRate_:I

    .line 28394
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 28396
    :cond_3
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 28397
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    .line 28398
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 28396
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 28400
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 28401
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedSerializedSize:I

    .line 28402
    return v3
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 28167
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasMEndStamp()Z
    .locals 2

    .line 28264
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

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

.method public hasMHeartRate()Z
    .locals 2

    .line 28294
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

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

.method public hasMStartStamp()Z
    .locals 2

    .line 28279
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

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

    .line 28237
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$39000()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    .line 28238
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 28237
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 28352
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedIsInitialized:B

    .line 28353
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 28354
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 28356
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->memoizedIsInitialized:B

    .line 28357
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 28143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 28143
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 28143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28466
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 2

    .line 28475
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 28476
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 28143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 28143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;
    .locals 1

    .line 28470
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList$Builder;

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

    .line 28409
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28362
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getSerializedSize()I

    .line 28363
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 28364
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mEndStamp_:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 28366
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 28367
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mStartStamp_:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 28369
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 28370
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->mHeartRate_:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 28372
    :cond_2
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 28373
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->arrTypeMap_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 28372
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 28375
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 28376
    return-void
.end method
