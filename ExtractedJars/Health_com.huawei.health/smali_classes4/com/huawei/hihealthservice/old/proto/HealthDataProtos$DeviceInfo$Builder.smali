.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private cloudUserDeviceCode_:J

.field private deviceId_:Ljava/lang/Object;

.field private huid_:J

.field private localUserDeviceCode_:I

.field private productId_:I

.field private productName_:Ljava/lang/Object;

.field private productTypes_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private version_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 6066
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 6336
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6444
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6520
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6589
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6067
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->maybeForceBuilderInitialization()V

    .line 6068
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 6072
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 6336
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6444
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6520
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6589
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6073
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->maybeForceBuilderInitialization()V

    .line 6074
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 6049
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$7800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6049
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6078
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;-><init>()V

    return-object v0
.end method

.method private ensureProductTypesIsMutable()V
    .locals 2

    .line 6522
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_0

    .line 6523
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6524
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6526
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 6055
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$7500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 6076
    return-void
.end method


# virtual methods
.method public addAllProductTypes(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Ljava/lang/Integer;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;"
        }
    .end annotation

    .line 6573
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->ensureProductTypesIsMutable()V

    .line 6574
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 6576
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6577
    return-object p0
.end method

.method public addProductTypes(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6563
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->ensureProductTypesIsMutable()V

    .line 6564
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6565
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6566
    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 2

    .line 6116
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v1

    .line 6117
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6118
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 6120
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 5

    .line 6124
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 6125
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6126
    const/4 v4, 0x0

    .line 6127
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 6128
    const/4 v4, 0x1

    .line 6130
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->localUserDeviceCode_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;I)I

    .line 6131
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 6132
    or-int/lit8 v4, v4, 0x2

    .line 6134
    :cond_1
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->cloudUserDeviceCode_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;J)J

    .line 6135
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 6136
    or-int/lit8 v4, v4, 0x4

    .line 6138
    :cond_2
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->huid_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;J)J

    .line 6139
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 6140
    or-int/lit8 v4, v4, 0x8

    .line 6142
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6143
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 6144
    or-int/lit8 v4, v4, 0x10

    .line 6146
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productId_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;I)I

    .line 6147
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 6148
    or-int/lit8 v4, v4, 0x20

    .line 6150
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6151
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 6152
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6153
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6155
    :cond_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/util/List;)Ljava/util/List;

    .line 6156
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_7

    .line 6157
    or-int/lit8 v4, v4, 0x40

    .line 6159
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6160
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;I)I

    .line 6161
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onBuilt()V

    .line 6162
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6082
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 6083
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->localUserDeviceCode_:I

    .line 6084
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6085
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->cloudUserDeviceCode_:J

    .line 6086
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6087
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->huid_:J

    .line 6088
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6089
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6090
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6091
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productId_:I

    .line 6092
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6093
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6094
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6095
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6096
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6097
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6098
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6099
    return-object p0
.end method

.method public clearCloudUserDeviceCode()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6298
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6299
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->cloudUserDeviceCode_:J

    .line 6300
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6301
    return-object p0
.end method

.method public clearDeviceId()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6393
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6394
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6395
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6396
    return-object p0
.end method

.method public clearHuid()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6330
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6331
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->huid_:J

    .line 6332
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6333
    return-object p0
.end method

.method public clearLocalUserDeviceCode()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6266
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6267
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->localUserDeviceCode_:I

    .line 6268
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6269
    return-object p0
.end method

.method public clearProductId()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6438
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6439
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productId_:I

    .line 6440
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6441
    return-object p0
.end method

.method public clearProductName()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6501
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6502
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6503
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6504
    return-object p0
.end method

.method public clearProductTypes()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6583
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6584
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6585
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6586
    return-object p0
.end method

.method public clearVersion()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6646
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6647
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6648
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6649
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6103
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getCloudUserDeviceCode()J
    .locals 2

    .line 6283
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->cloudUserDeviceCode_:J

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 6049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1

    .line 6112
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 6108
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$7500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 4

    .line 6347
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6348
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 6349
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 6351
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 6352
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6353
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6355
    :cond_0
    return-object v3

    .line 6357
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceIdBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 6365
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6366
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 6367
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 6368
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 6370
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6371
    return-object v2

    .line 6373
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 6315
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->huid_:J

    return-wide v0
.end method

.method public getLocalUserDeviceCode()I
    .locals 1

    .line 6251
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->localUserDeviceCode_:I

    return v0
.end method

.method public getProductId()I
    .locals 1

    .line 6423
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productId_:I

    return v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 4

    .line 6455
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6456
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 6457
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 6459
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 6460
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6461
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6463
    :cond_0
    return-object v3

    .line 6465
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 6473
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6474
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 6475
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 6476
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 6478
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6479
    return-object v2

    .line 6481
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getProductTypes(I)I
    .locals 1

    .line 6544
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 6545
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 6547
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getProductTypesCount()I
    .locals 1

    .line 6538
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getProductTypesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 6532
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 4

    .line 6600
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6601
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 6602
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 6604
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 6605
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6606
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6608
    :cond_0
    return-object v3

    .line 6610
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getVersionBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 6618
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6619
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 6620
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 6621
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 6623
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6624
    return-object v2

    .line 6626
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasCloudUserDeviceCode()Z
    .locals 2

    .line 6277
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public hasDeviceId()Z
    .locals 2

    .line 6341
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public hasHuid()Z
    .locals 2

    .line 6309
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public hasLocalUserDeviceCode()Z
    .locals 2

    .line 6245
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public hasProductId()Z
    .locals 2

    .line 6417
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public hasProductName()Z
    .locals 2

    .line 6449
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public hasVersion()Z
    .locals 2

    .line 6594
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 6060
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$7600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 6061
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 6060
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 6218
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6049
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6049
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6049
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 6049
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6049
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6225
    const/4 v1, 0x0

    .line 6227
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$000()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 6232
    if-eqz v1, :cond_1

    .line 6233
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    goto :goto_0

    .line 6228
    :catch_0
    move-exception v2

    .line 6229
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-object v1, v0

    .line 6230
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6232
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 6233
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 6235
    :cond_0
    throw v3

    .line 6236
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6166
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    if-eqz v0, :cond_0

    .line 6167
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0

    .line 6169
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 6170
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6175
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 6176
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasLocalUserDeviceCode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6177
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getLocalUserDeviceCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setLocalUserDeviceCode(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 6179
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasCloudUserDeviceCode()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6180
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getCloudUserDeviceCode()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setCloudUserDeviceCode(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 6182
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6183
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getHuid()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 6185
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasDeviceId()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6186
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6187
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8400(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6188
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6190
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasProductId()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 6191
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setProductId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 6193
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasProductName()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 6194
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6195
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6196
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6198
    :cond_6
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 6199
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 6200
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    .line 6201
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    goto :goto_0

    .line 6203
    :cond_7
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->ensureProductTypesIsMutable()V

    .line 6204
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 6206
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6208
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasVersion()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 6209
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6210
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->access$8800(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6211
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6213
    :cond_9
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 6214
    return-object p0
.end method

.method public setCloudUserDeviceCode(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6289
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6290
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->cloudUserDeviceCode_:J

    .line 6291
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6292
    return-object p0
.end method

.method public setDeviceId(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6381
    if-nez p1, :cond_0

    .line 6382
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6384
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6385
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6386
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6387
    return-object p0
.end method

.method public setDeviceIdBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6403
    if-nez p1, :cond_0

    .line 6404
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6406
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6407
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->deviceId_:Ljava/lang/Object;

    .line 6408
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6409
    return-object p0
.end method

.method public setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6321
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6322
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->huid_:J

    .line 6323
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6324
    return-object p0
.end method

.method public setLocalUserDeviceCode(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6257
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6258
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->localUserDeviceCode_:I

    .line 6259
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6260
    return-object p0
.end method

.method public setProductId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6429
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6430
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productId_:I

    .line 6431
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6432
    return-object p0
.end method

.method public setProductName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6489
    if-nez p1, :cond_0

    .line 6490
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6492
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6493
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6494
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6495
    return-object p0
.end method

.method public setProductNameBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6511
    if-nez p1, :cond_0

    .line 6512
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6514
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6515
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productName_:Ljava/lang/Object;

    .line 6516
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6517
    return-object p0
.end method

.method public setProductTypes(II)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6554
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->ensureProductTypesIsMutable()V

    .line 6555
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->productTypes_:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 6556
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6557
    return-object p0
.end method

.method public setVersion(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6634
    if-nez p1, :cond_0

    .line 6635
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6637
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6638
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6639
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6640
    return-object p0
.end method

.method public setVersionBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6656
    if-nez p1, :cond_0

    .line 6657
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 6659
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->bitField0_:I

    .line 6660
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->version_:Ljava/lang/Object;

    .line 6661
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->onChanged()V

    .line 6662
    return-object p0
.end method
