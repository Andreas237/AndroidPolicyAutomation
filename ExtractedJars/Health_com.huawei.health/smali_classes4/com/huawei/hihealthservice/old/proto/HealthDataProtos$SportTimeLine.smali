.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportTimeLine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    }
.end annotation


# static fields
.field public static final BASETIMELINE_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;>;"
        }
    .end annotation
.end field

.field public static final REALSTEPS_FIELD_NUMBER:I = 0x6

.field public static final TOTALCALORY_FIELD_NUMBER:I = 0x3

.field public static final TOTALDISTANCE_FIELD_NUMBER:I = 0x4

.field public static final TOTALSTEPS_FIELD_NUMBER:I = 0x2

.field public static final TOTALSTOREYS_FIELD_NUMBER:I = 0x5

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private realSteps_:I

.field private totalCalory_:I

.field private totalDistance_:I

.field private totalSteps_:I

.field private totalStoreys_:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 8903
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    .line 9618
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    .line 9619
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->initFields()V

    .line 9620
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8821
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 9023
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedIsInitialized:B

    .line 9057
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedSerializedSize:I

    .line 8822
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->initFields()V

    .line 8823
    const/4 v2, 0x0

    .line 8825
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 8827
    const/4 v4, 0x0

    .line 8828
    :goto_0
    if-nez v4, :cond_3

    .line 8829
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 8830
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 8832
    :sswitch_0
    const/4 v4, 0x1

    .line 8833
    goto/16 :goto_2

    .line 8835
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8837
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 8842
    :sswitch_1
    const/4 v6, 0x0

    .line 8843
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 8844
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v6

    .line 8846
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11800()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 8847
    if-eqz v6, :cond_1

    .line 8848
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 8849
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 8851
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    .line 8852
    goto :goto_2

    .line 8855
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    .line 8856
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalSteps_:I

    .line 8857
    goto :goto_2

    .line 8860
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    .line 8861
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalCalory_:I

    .line 8862
    goto :goto_2

    .line 8865
    :sswitch_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    .line 8866
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalDistance_:I

    .line 8867
    goto :goto_2

    .line 8870
    :sswitch_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    .line 8871
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalStoreys_:I

    .line 8872
    goto :goto_2

    .line 8875
    :sswitch_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    .line 8876
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->realSteps_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8880
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 8887
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8888
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->makeExtensionsImmutable()V

    .line 8889
    goto :goto_3

    .line 8881
    :catch_0
    move-exception v4

    .line 8882
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 8883
    :catch_1
    move-exception v4

    .line 8884
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 8885
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8887
    :catchall_0
    move-exception v7

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8888
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->makeExtensionsImmutable()V

    .line 8889
    throw v7

    .line 8890
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
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

    .line 8792
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 8798
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 9023
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedIsInitialized:B

    .line 9057
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedSerializedSize:I

    .line 8799
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8800
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 8792
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 8801
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 9023
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedIsInitialized:B

    .line 9057
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedSerializedSize:I

    .line 8801
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$12400()Z
    .locals 1

    .line 8792
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$12602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 0

    .line 8792
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object p1
.end method

.method static synthetic access$12702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I
    .locals 0

    .line 8792
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalSteps_:I

    return p1
.end method

.method static synthetic access$12802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I
    .locals 0

    .line 8792
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalCalory_:I

    return p1
.end method

.method static synthetic access$12902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I
    .locals 0

    .line 8792
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalDistance_:I

    return p1
.end method

.method static synthetic access$13002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I
    .locals 0

    .line 8792
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalStoreys_:I

    return p1
.end method

.method static synthetic access$13102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I
    .locals 0

    .line 8792
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->realSteps_:I

    return p1
.end method

.method static synthetic access$13202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;I)I
    .locals 0

    .line 8792
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    return p1
.end method

.method static synthetic access$13300()Lcom/google/protobuf/Parser;
    .locals 1

    .line 8792
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1

    .line 8805
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 8893
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$11900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 9016
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9017
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalSteps_:I

    .line 9018
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalCalory_:I

    .line 9019
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalDistance_:I

    .line 9020
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalStoreys_:I

    .line 9021
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->realSteps_:I

    .line 9022
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9152
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->access$12200()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9155
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9132
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9138
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 9102
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 9108
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9143
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9149
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9122
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9128
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 9112
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 9118
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method


# virtual methods
.method public getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 8931
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
    .locals 1

    .line 8937
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 8792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 8792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;
    .locals 1

    .line 8809
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;>;"
        }
    .end annotation

    .line 8915
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getRealSteps()I
    .locals 1

    .line 9012
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->realSteps_:I

    return v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 9059
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedSerializedSize:I

    .line 9060
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 9062
    :cond_0
    const/4 v2, 0x0

    .line 9063
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 9064
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9065
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 9067
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 9068
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalSteps_:I

    .line 9069
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9071
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 9072
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalCalory_:I

    .line 9073
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9075
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 9076
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalDistance_:I

    .line 9077
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9079
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 9080
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalStoreys_:I

    .line 9081
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9083
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 9084
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->realSteps_:I

    .line 9085
    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9087
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 9088
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedSerializedSize:I

    .line 9089
    return v2
.end method

.method public getTotalCalory()I
    .locals 1

    .line 8967
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalCalory_:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 8982
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalDistance_:I

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 8952
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalSteps_:I

    return v0
.end method

.method public getTotalStoreys()I
    .locals 1

    .line 8997
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalStoreys_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 8816
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasBaseTimeLine()Z
    .locals 2

    .line 8925
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

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

.method public hasRealSteps()Z
    .locals 2

    .line 9006
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

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

.method public hasTotalCalory()Z
    .locals 2

    .line 8961
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

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

.method public hasTotalDistance()Z
    .locals 2

    .line 8976
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

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

.method public hasTotalSteps()Z
    .locals 2

    .line 8946
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

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

.method public hasTotalStoreys()Z
    .locals 2

    .line 8991
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

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

    .line 8898
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$12000()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    .line 8899
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 8898
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 9025
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedIsInitialized:B

    .line 9026
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 9027
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 9029
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->memoizedIsInitialized:B

    .line 9030
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8792
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 8792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9153
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 2

    .line 9162
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 9163
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 8792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;
    .locals 1

    .line 9157
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine$Builder;

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

    .line 9096
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

    .line 9035
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getSerializedSize()I

    .line 9036
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 9037
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 9039
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 9040
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalSteps_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9042
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 9043
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalCalory_:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9045
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 9046
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalDistance_:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9048
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 9049
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->totalStoreys_:I

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9051
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 9052
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->realSteps_:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9054
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 9055
    return-void
.end method
