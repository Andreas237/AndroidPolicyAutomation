.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;"
    }
.end annotation


# instance fields
.field private authorization_:I

.field private bitField0_:I

.field private itemId_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2603
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 2604
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->maybeForceBuilderInitialization()V

    .line 2605
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 0

    .line 2609
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 2610
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->maybeForceBuilderInitialization()V

    .line 2611
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 2586
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$3700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2586
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2615
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 2592
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$3400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 2613
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 2

    .line 2641
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    .line 2642
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2643
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 2645
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 5

    .line 2649
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 2650
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2651
    const/4 v4, 0x0

    .line 2652
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2653
    const/4 v4, 0x1

    .line 2655
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->itemId_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->access$4002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;I)I

    .line 2656
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2657
    or-int/lit8 v4, v4, 0x2

    .line 2659
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->authorization_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->access$4102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;I)I

    .line 2660
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->access$4202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;I)I

    .line 2661
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->onBuilt()V

    .line 2662
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2619
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 2620
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->itemId_:I

    .line 2621
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2622
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->authorization_:I

    .line 2623
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2624
    return-object p0
.end method

.method public clearAuthorization()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2767
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2768
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->authorization_:I

    .line 2769
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->onChanged()V

    .line 2770
    return-object p0
.end method

.method public clearItemId()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2735
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2736
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->itemId_:I

    .line 2737
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->onChanged()V

    .line 2738
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2628
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

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

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAuthorization()I
    .locals 1

    .line 2752
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->authorization_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2586
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1

    .line 2637
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 2633
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$3400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    .line 2720
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->itemId_:I

    return v0
.end method

.method public hasAuthorization()Z
    .locals 2

    .line 2746
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

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

.method public hasItemId()Z
    .locals 2

    .line 2714
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

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

    .line 2597
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$3500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    .line 2598
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 2597
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 2687
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

    .line 2586
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

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

    .line 2586
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

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

    .line 2586
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2586
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

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

    .line 2586
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2694
    const/4 v1, 0x0

    .line 2696
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->access$4300()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 2701
    if-eqz v1, :cond_1

    .line 2702
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    goto :goto_0

    .line 2697
    :catch_0
    move-exception v2

    .line 2698
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-object v1, v0

    .line 2699
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2701
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 2702
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    .line 2704
    :cond_0
    throw v3

    .line 2705
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2666
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    if-eqz v0, :cond_0

    .line 2667
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    return-object v0

    .line 2669
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 2670
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 2675
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 2676
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->hasItemId()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2677
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getItemId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->setItemId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    .line 2679
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->hasAuthorization()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2680
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getAuthorization()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->setAuthorization(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    .line 2682
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 2683
    return-object p0
.end method

.method public setAuthorization(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2758
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2759
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->authorization_:I

    .line 2760
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->onChanged()V

    .line 2761
    return-object p0
.end method

.method public setItemId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 2726
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->bitField0_:I

    .line 2727
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->itemId_:I

    .line 2728
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->onChanged()V

    .line 2729
    return-object p0
.end method
