.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private lang_:Ljava/lang/Object;

.field private name_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3142
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 3252
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3328
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3143
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->maybeForceBuilderInitialization()V

    .line 3144
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 3148
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 3252
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3328
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3149
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->maybeForceBuilderInitialization()V

    .line 3150
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 3125
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$4700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3125
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3154
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 3131
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$4400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 3152
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 2

    .line 3180
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    .line 3181
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3182
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 3184
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 5

    .line 3188
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 3189
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3190
    const/4 v4, 0x0

    .line 3191
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3192
    const/4 v4, 0x1

    .line 3194
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3195
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3196
    or-int/lit8 v4, v4, 0x2

    .line 3198
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3199
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;I)I

    .line 3200
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onBuilt()V

    .line 3201
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3158
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 3159
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3160
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3161
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3162
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3163
    return-object p0
.end method

.method public clearLang()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3309
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3310
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getLang()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3311
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3312
    return-object p0
.end method

.method public clearName()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3385
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3386
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3387
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3388
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3167
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

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

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 3125
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1

    .line 3176
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 3172
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$4400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 4

    .line 3263
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3264
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 3265
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3267
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3268
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3269
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3271
    :cond_0
    return-object v3

    .line 3273
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLangBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3281
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3282
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3283
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3284
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3286
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3287
    return-object v2

    .line 3289
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 3339
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3340
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 3341
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 3343
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 3344
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3345
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3347
    :cond_0
    return-object v3

    .line 3349
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 3357
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3358
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3359
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 3360
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 3362
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3363
    return-object v2

    .line 3365
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasLang()Z
    .locals 2

    .line 3257
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

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

.method public hasName()Z
    .locals 2

    .line 3333
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

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

    .line 3136
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$4500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    .line 3137
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 3136
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 3230
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

    .line 3125
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

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

    .line 3125
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

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

    .line 3125
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3125
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

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

    .line 3125
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3237
    const/4 v1, 0x0

    .line 3239
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5300()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 3244
    if-eqz v1, :cond_1

    .line 3245
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    goto :goto_0

    .line 3240
    :catch_0
    move-exception v2

    .line 3241
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-object v1, v0

    .line 3242
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3244
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 3245
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    .line 3247
    :cond_0
    throw v3

    .line 3248
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 3205
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    if-eqz v0, :cond_0

    .line 3206
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    return-object v0

    .line 3208
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 3209
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3214
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 3215
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->hasLang()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3216
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3217
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3218
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3220
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->hasName()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3221
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3222
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->access$5100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3223
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3225
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 3226
    return-object p0
.end method

.method public setLang(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3297
    if-nez p1, :cond_0

    .line 3298
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3300
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3301
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3302
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3303
    return-object p0
.end method

.method public setLangBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3319
    if-nez p1, :cond_0

    .line 3320
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3322
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3323
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->lang_:Ljava/lang/Object;

    .line 3324
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3325
    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3373
    if-nez p1, :cond_0

    .line 3374
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3376
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3377
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3378
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3379
    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 3395
    if-nez p1, :cond_0

    .line 3396
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3398
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->bitField0_:I

    .line 3399
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->name_:Ljava/lang/Object;

    .line 3400
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->onChanged()V

    .line 3401
    return-object p0
.end method
