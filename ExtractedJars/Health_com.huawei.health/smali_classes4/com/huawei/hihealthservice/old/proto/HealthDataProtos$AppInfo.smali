.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AppInfo"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    }
.end annotation


# static fields
.field public static final APPID_FIELD_NUMBER:I = 0x1

.field public static final AUTHORIZATIONLIST_FIELD_NUMBER:I = 0xa

.field public static final CLOUDUSERAPPCODE_FIELD_NUMBER:I = 0x5

.field public static final HUID_FIELD_NUMBER:I = 0x6

.field public static final ICONURL_FIELD_NUMBER:I = 0x9

.field public static final LOCALUSERAPPCODE_FIELD_NUMBER:I = 0x4

.field public static final NAMEBUNDLELIST_FIELD_NUMBER:I = 0xb

.field public static final PACKAGENAME_FIELD_NUMBER:I = 0x2

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;>;"
        }
    .end annotation
.end field

.field public static final SYSTEMRATING_FIELD_NUMBER:I = 0x8

.field public static final TYPE_FIELD_NUMBER:I = 0x7

.field public static final VERSION_FIELD_NUMBER:I = 0x3

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private appId_:I

.field private authorizationList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private cloudUserAppCode_:J

.field private huid_:J

.field private iconUrl_:Ljava/lang/Object;

.field private localUserAppCode_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private nameBundleList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation
.end field

.field private packageName_:Ljava/lang/Object;

.field private systemRating_:I

.field private type_:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;

.field private version_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 3707
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    .line 5408
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    .line 5409
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->initFields()V

    .line 5410
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3593
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 4034
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedIsInitialized:B

    .line 4083
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedSerializedSize:I

    .line 3594
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->initFields()V

    .line 3595
    const/4 v2, 0x0

    .line 3597
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 3599
    const/4 v4, 0x0

    .line 3600
    :goto_0
    if-nez v4, :cond_3

    .line 3601
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 3602
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 3604
    :sswitch_0
    const/4 v4, 0x1

    .line 3605
    goto/16 :goto_2

    .line 3607
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3609
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 3614
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3615
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->appId_:I

    .line 3616
    goto/16 :goto_2

    .line 3619
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 3620
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3621
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    .line 3622
    goto/16 :goto_2

    .line 3625
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 3626
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3627
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    .line 3628
    goto/16 :goto_2

    .line 3631
    :sswitch_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3632
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->localUserAppCode_:I

    .line 3633
    goto/16 :goto_2

    .line 3636
    :sswitch_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3637
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->cloudUserAppCode_:J

    .line 3638
    goto/16 :goto_2

    .line 3641
    :sswitch_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3642
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->huid_:J

    .line 3643
    goto/16 :goto_2

    .line 3646
    :sswitch_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3647
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->type_:I

    .line 3648
    goto/16 :goto_2

    .line 3651
    :sswitch_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3652
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->systemRating_:I

    .line 3653
    goto :goto_2

    .line 3656
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 3657
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    .line 3658
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    .line 3659
    goto :goto_2

    .line 3662
    :sswitch_a
    and-int/lit16 v0, v2, 0x200

    const/16 v1, 0x200

    if-eq v0, v1, :cond_0

    .line 3663
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    .line 3664
    or-int/lit16 v0, v2, 0x200

    move v2, v0

    .line 3666
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->access$4300()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3667
    goto :goto_2

    .line 3670
    :sswitch_b
    and-int/lit16 v0, v2, 0x400

    const/16 v1, 0x400

    if-eq v0, v1, :cond_1

    .line 3671
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    .line 3672
    or-int/lit16 v0, v2, 0x400

    move v2, v0

    .line 3674
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5300()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3678
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 3685
    :cond_3
    and-int/lit16 v0, v2, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_4

    .line 3686
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    .line 3688
    :cond_4
    and-int/lit16 v0, v2, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_5

    .line 3689
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    .line 3691
    :cond_5
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 3692
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->makeExtensionsImmutable()V

    .line 3693
    goto :goto_3

    .line 3679
    :catch_0
    move-exception v4

    .line 3680
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 3681
    :catch_1
    move-exception v4

    .line 3682
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 3683
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3685
    :catchall_0
    move-exception v7

    and-int/lit16 v0, v2, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_6

    .line 3686
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    .line 3688
    :cond_6
    and-int/lit16 v0, v2, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_7

    .line 3689
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    .line 3691
    :cond_7
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 3692
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->makeExtensionsImmutable()V

    .line 3693
    throw v7

    .line 3694
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
        0x38 -> :sswitch_7
        0x40 -> :sswitch_8
        0x4a -> :sswitch_9
        0x52 -> :sswitch_a
        0x5a -> :sswitch_b
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3564
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 3570
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 4034
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedIsInitialized:B

    .line 4083
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedSerializedSize:I

    .line 3571
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 3572
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 3564
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 3573
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 4034
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedIsInitialized:B

    .line 4083
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedSerializedSize:I

    .line 3573
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$100()Lcom/google/protobuf/Parser;
    .locals 1

    .line 3564
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$5900()Z
    .locals 1

    .line 3564
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$6102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I
    .locals 0

    .line 3564
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->appId_:I

    return p1
.end method

.method static synthetic access$6200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/lang/Object;
    .locals 1

    .line 3564
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$6202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3564
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$6300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/lang/Object;
    .locals 1

    .line 3564
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$6302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3564
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$6402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I
    .locals 0

    .line 3564
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->localUserAppCode_:I

    return p1
.end method

.method static synthetic access$6502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;J)J
    .locals 0

    .line 3564
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->cloudUserAppCode_:J

    return-wide p1
.end method

.method static synthetic access$6602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;J)J
    .locals 0

    .line 3564
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->huid_:J

    return-wide p1
.end method

.method static synthetic access$6702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I
    .locals 0

    .line 3564
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->type_:I

    return p1
.end method

.method static synthetic access$6802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I
    .locals 0

    .line 3564
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->systemRating_:I

    return p1
.end method

.method static synthetic access$6900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/lang/Object;
    .locals 1

    .line 3564
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$6902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3564
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;
    .locals 1

    .line 3564
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$7002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 3564
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;
    .locals 1

    .line 3564
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$7102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 3564
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$7202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I
    .locals 0

    .line 3564
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    return p1
.end method

.method static synthetic access$7300()Z
    .locals 1

    .line 3564
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$7400()Z
    .locals 1

    .line 3564
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1

    .line 3577
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 3697
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$5400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 4022
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->appId_:I

    .line 4023
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    .line 4024
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    .line 4025
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->localUserAppCode_:I

    .line 4026
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->cloudUserAppCode_:J

    .line 4027
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->huid_:J

    .line 4028
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->type_:I

    .line 4029
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->systemRating_:I

    .line 4030
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    .line 4031
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    .line 4032
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    .line 4033
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4198
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->access$5700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4201
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4178
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4184
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4148
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4154
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4189
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4195
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4168
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4174
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4158
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4164
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method


# virtual methods
.method public getAppId()I
    .locals 1

    .line 3735
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->appId_:I

    return v0
.end method

.method public getAuthorizationList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1

    .line 3964
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 3965
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 3967
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public getAuthorizationListCount()I
    .locals 1

    .line 3958
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getAuthorizationListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation

    .line 3945
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    return-object v0
.end method

.method public getAuthorizationListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;
    .locals 1

    .line 3974
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 3975
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 3977
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;

    return-object v0
.end method

.method public getAuthorizationListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;>;"
        }
    .end annotation

    .line 3952
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    return-object v0
.end method

.method public getCloudUserAppCode()J
    .locals 2

    .line 3849
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->cloudUserAppCode_:J

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 3564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 3564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1

    .line 3581
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 3864
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->huid_:J

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 4

    .line 3909
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    .line 3910
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3911
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3913
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3915
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3916
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3917
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    .line 3919
    :cond_1
    return-object v3
.end method

.method public getIconUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3927
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    .line 3928
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3929
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3930
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3932
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->iconUrl_:Ljava/lang/Object;

    .line 3933
    return-object v2

    .line 3935
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getLocalUserAppCode()I
    .locals 1

    .line 3834
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->localUserAppCode_:I

    return v0
.end method

.method public getNameBundleList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1

    .line 4005
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4006
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 4008
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public getNameBundleListCount()I
    .locals 1

    .line 3999
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getNameBundleListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation

    .line 3986
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    return-object v0
.end method

.method public getNameBundleListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;
    .locals 1

    .line 4015
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4016
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 4018
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;

    return-object v0
.end method

.method public getNameBundleListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;>;"
        }
    .end annotation

    .line 3993
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 4

    .line 3750
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    .line 3751
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3752
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3754
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3756
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3757
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3758
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    .line 3760
    :cond_1
    return-object v3
.end method

.method public getPackageNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3768
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    .line 3769
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3770
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3771
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3773
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->packageName_:Ljava/lang/Object;

    .line 3774
    return-object v2

    .line 3776
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;>;"
        }
    .end annotation

    .line 3719
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 4085
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedSerializedSize:I

    .line 4086
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 4088
    :cond_0
    const/4 v3, 0x0

    .line 4089
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 4090
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->appId_:I

    .line 4091
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 4093
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 4094
    .line 4095
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getPackageNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 4097
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 4098
    .line 4099
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getVersionBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 4101
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 4102
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->localUserAppCode_:I

    .line 4103
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 4105
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 4106
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->cloudUserAppCode_:J

    .line 4107
    const/4 v2, 0x5

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 4109
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 4110
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->huid_:J

    .line 4111
    const/4 v2, 0x6

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 4113
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 4114
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->type_:I

    .line 4115
    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 4117
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 4118
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->systemRating_:I

    .line 4119
    const/16 v1, 0x8

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 4121
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_9

    .line 4122
    .line 4123
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getIconUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 4125
    :cond_9
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_a

    .line 4126
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    .line 4127
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 4125
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 4129
    :cond_a
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_b

    .line 4130
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    .line 4131
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xb

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 4129
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 4133
    :cond_b
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 4134
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedSerializedSize:I

    .line 4135
    return v3
.end method

.method public getSystemRating()I
    .locals 1

    .line 3894
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->systemRating_:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 3879
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->type_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 3588
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 4

    .line 3792
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    .line 3793
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3794
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3796
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3798
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3799
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3800
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    .line 3802
    :cond_1
    return-object v3
.end method

.method public getVersionBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3810
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    .line 3811
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3812
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3813
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3815
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->version_:Ljava/lang/Object;

    .line 3816
    return-object v2

    .line 3818
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasAppId()Z
    .locals 2

    .line 3729
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasCloudUserAppCode()Z
    .locals 2

    .line 3843
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasHuid()Z
    .locals 2

    .line 3858
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasIconUrl()Z
    .locals 2

    .line 3903
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLocalUserAppCode()Z
    .locals 2

    .line 3828
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasPackageName()Z
    .locals 2

    .line 3744
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasSystemRating()Z
    .locals 2

    .line 3888
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasType()Z
    .locals 2

    .line 3873
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public hasVersion()Z
    .locals 2

    .line 3786
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 3702
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$5500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 3703
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 3702
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 4036
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedIsInitialized:B

    .line 4037
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 4038
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 4040
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->memoizedIsInitialized:B

    .line 4041
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3564
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4199
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4208
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 4209
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3564
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4203
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

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

    .line 4142
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

    .line 4046
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getSerializedSize()I

    .line 4047
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 4048
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->appId_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 4050
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4051
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getPackageNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 4053
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 4054
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getVersionBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 4056
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 4057
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->localUserAppCode_:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 4059
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 4060
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->cloudUserAppCode_:J

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 4062
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 4063
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->huid_:J

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 4065
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 4066
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->type_:I

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 4068
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_7

    .line 4069
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->systemRating_:I

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 4071
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_8

    .line 4072
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getIconUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 4074
    :cond_8
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_9

    .line 4075
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 4074
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4077
    :cond_9
    const/4 v3, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_a

    .line 4078
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xb

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 4077
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 4080
    :cond_a
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 4081
    return-void
.end method
