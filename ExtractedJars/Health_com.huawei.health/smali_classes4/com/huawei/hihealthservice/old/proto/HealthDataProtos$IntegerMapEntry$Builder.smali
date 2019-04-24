.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntryOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private key_:Ljava/lang/Object;

.field private state_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 18980
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 19088
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 18981
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->maybeForceBuilderInitialization()V

    .line 18982
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 18986
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 19088
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 18987
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->maybeForceBuilderInitialization()V

    .line 18988
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 18963
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$25800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 18963
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 18992
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 18969
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$25500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 18990
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 2

    .line 19018
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    .line 19019
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 19020
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 19022
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 5

    .line 19026
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 19027
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19028
    const/4 v4, 0x0

    .line 19029
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 19030
    const/4 v4, 0x1

    .line 19032
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->access$26102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19033
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 19034
    or-int/lit8 v4, v4, 0x2

    .line 19036
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->state_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->access$26202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;I)I

    .line 19037
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->access$26302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;I)I

    .line 19038
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onBuilt()V

    .line 19039
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 18996
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 18997
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 18998
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 18999
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->state_:I

    .line 19000
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19001
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19145
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19146
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getKey()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19147
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onChanged()V

    .line 19148
    return-object p0
.end method

.method public clearState()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19190
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19191
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->state_:I

    .line 19192
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onChanged()V

    .line 19193
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19005
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

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

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 18963
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    .locals 1

    .line 19014
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 19010
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$25500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 4

    .line 19099
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19100
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 19101
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 19103
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 19104
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19105
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19107
    :cond_0
    return-object v3

    .line 19109
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getKeyBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 19117
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19118
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 19119
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 19120
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 19122
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19123
    return-object v2

    .line 19125
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getState()I
    .locals 1

    .line 19175
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->state_:I

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 19093
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

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

.method public hasState()Z
    .locals 2

    .line 19169
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

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

    .line 18974
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$25600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    .line 18975
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 18974
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 19066
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

    .line 18963
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

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

    .line 18963
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

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

    .line 18963
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 18963
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

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

    .line 18963
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19073
    const/4 v1, 0x0

    .line 19075
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->access$26400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 19080
    if-eqz v1, :cond_1

    .line 19081
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    goto :goto_0

    .line 19076
    :catch_0
    move-exception v2

    .line 19077
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-object v1, v0

    .line 19078
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19080
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 19081
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    .line 19083
    :cond_0
    throw v3

    .line 19084
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 19043
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    if-eqz v0, :cond_0

    .line 19044
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    return-object v0

    .line 19046
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 19047
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19052
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 19053
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19054
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19055
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->access$26100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19056
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onChanged()V

    .line 19058
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->hasState()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19059
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getState()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->setState(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    .line 19061
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 19062
    return-object p0
.end method

.method public setKey(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19133
    if-nez p1, :cond_0

    .line 19134
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 19136
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19137
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19138
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onChanged()V

    .line 19139
    return-object p0
.end method

.method public setKeyBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19155
    if-nez p1, :cond_0

    .line 19156
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 19158
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19159
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19160
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onChanged()V

    .line 19161
    return-object p0
.end method

.method public setState(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 2

    .line 19181
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->bitField0_:I

    .line 19182
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->state_:I

    .line 19183
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;->onChanged()V

    .line 19184
    return-object p0
.end method
