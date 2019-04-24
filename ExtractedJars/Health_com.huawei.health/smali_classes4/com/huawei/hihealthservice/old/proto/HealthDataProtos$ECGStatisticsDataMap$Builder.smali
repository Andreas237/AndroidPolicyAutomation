.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private key_:I

.field private value_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 29777
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 29778
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->maybeForceBuilderInitialization()V

    .line 29779
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 29783
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 29784
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->maybeForceBuilderInitialization()V

    .line 29785
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 29760
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$41500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29760
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29791
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 29766
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$41200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 29787
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->access$41700()Z

    move-result v0

    .line 29789
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 2

    .line 29817
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    .line 29818
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 29819
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 29821
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 5

    .line 29825
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 29826
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29827
    const/4 v4, 0x0

    .line 29828
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 29829
    const/4 v4, 0x1

    .line 29831
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->key_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->access$41902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;I)I

    .line 29832
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 29833
    or-int/lit8 v4, v4, 0x2

    .line 29835
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->value_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->access$42002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;I)I

    .line 29836
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->access$42102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;I)I

    .line 29837
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->onBuilt()V

    .line 29838
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29795
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 29796
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->key_:I

    .line 29797
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29798
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->value_:I

    .line 29799
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29800
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29911
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29912
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->key_:I

    .line 29913
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->onChanged()V

    .line 29914
    return-object p0
.end method

.method public clearValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29943
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29944
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->value_:I

    .line 29945
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->onChanged()V

    .line 29946
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29804
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

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

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 29760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1

    .line 29813
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 29809
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$41200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 29896
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->key_:I

    return v0
.end method

.method public getValue()I
    .locals 1

    .line 29928
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->value_:I

    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 29890
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

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

.method public hasValue()Z
    .locals 2

    .line 29922
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

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

    .line 29771
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$41300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    .line 29772
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 29771
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 29863
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

    .line 29760
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

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

    .line 29760
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

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

    .line 29760
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 29760
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

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

    .line 29760
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29870
    const/4 v1, 0x0

    .line 29872
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->access$33000()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 29877
    if-eqz v1, :cond_1

    .line 29878
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    goto :goto_0

    .line 29873
    :catch_0
    move-exception v2

    .line 29874
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-object v1, v0

    .line 29875
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29877
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 29878
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    .line 29880
    :cond_0
    throw v3

    .line 29881
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29842
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    if-eqz v0, :cond_0

    .line 29843
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    move-result-object v0

    return-object v0

    .line 29845
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 29846
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 29851
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 29852
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 29853
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getKey()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    .line 29855
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29856
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->setValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    .line 29858
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 29859
    return-object p0
.end method

.method public setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29902
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29903
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->key_:I

    .line 29904
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->onChanged()V

    .line 29905
    return-object p0
.end method

.method public setValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 29934
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->bitField0_:I

    .line 29935
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->value_:I

    .line 29936
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->onChanged()V

    .line 29937
    return-object p0
.end method
