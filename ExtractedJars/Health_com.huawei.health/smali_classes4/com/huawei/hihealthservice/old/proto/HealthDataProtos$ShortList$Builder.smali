.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortListOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortListOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private value_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33069
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 33070
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->maybeForceBuilderInitialization()V

    .line 33071
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 33075
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 33076
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->maybeForceBuilderInitialization()V

    .line 33077
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 33052
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$47200()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 1

    .line 33052
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 1

    .line 33083
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 33058
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$46900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 33079
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->access$47400()Z

    move-result v0

    .line 33081
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;
    .locals 2

    .line 33107
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v1

    .line 33108
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 33109
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 33111
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;
    .locals 5

    .line 33115
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 33116
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    .line 33117
    const/4 v4, 0x0

    .line 33118
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 33119
    const/4 v4, 0x1

    .line 33121
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->value_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->access$47602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;I)I

    .line 33122
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->access$47702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;I)I

    .line 33123
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->onBuilt()V

    .line 33124
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 2

    .line 33087
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 33088
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->value_:I

    .line 33089
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    .line 33090
    return-object p0
.end method

.method public clearValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 2

    .line 33194
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    .line 33195
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->value_:I

    .line 33196
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->onChanged()V

    .line 33197
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 2

    .line 33094
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

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

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 33052
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;
    .locals 1

    .line 33103
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 33099
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$46900()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 33179
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->value_:I

    return v0
.end method

.method public hasValue()Z
    .locals 2

    .line 33173
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

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

    .line 33063
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$47000()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    .line 33064
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 33063
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 33146
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

    .line 33052
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

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

    .line 33052
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

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

    .line 33052
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 33052
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

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

    .line 33052
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 33153
    const/4 v1, 0x0

    .line 33155
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->access$45900()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 33160
    if-eqz v1, :cond_1

    .line 33161
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    goto :goto_0

    .line 33156
    :catch_0
    move-exception v2

    .line 33157
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-object v1, v0

    .line 33158
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33160
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 33161
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    .line 33163
    :cond_0
    throw v3

    .line 33164
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 1

    .line 33128
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    if-eqz v0, :cond_0

    .line 33129
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    move-result-object v0

    return-object v0

    .line 33131
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 33132
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 1

    .line 33137
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 33138
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33139
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->getValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->setValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;

    .line 33141
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 33142
    return-object p0
.end method

.method public setValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;
    .locals 2

    .line 33185
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->bitField0_:I

    .line 33186
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->value_:I

    .line 33187
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ShortList$Builder;->onChanged()V

    .line 33188
    return-object p0
.end method
