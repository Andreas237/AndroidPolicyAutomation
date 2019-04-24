.class public final Lcom/google/protobuf/Struct$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/StructOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Struct;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/Struct$Builder;>;Lcom/google/protobuf/StructOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private fields_:Lcom/google/protobuf/MapField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/MapField<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 416
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 417
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->maybeForceBuilderInitialization()V

    .line 418
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 422
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 423
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->maybeForceBuilderInitialization()V

    .line 424
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Struct$1;)V
    .locals 0

    .line 377
    invoke-direct {p0, p1}, Lcom/google/protobuf/Struct$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/Struct$1;)V
    .locals 0

    .line 377
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 383
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Struct_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private internalGetFields()Lcom/google/protobuf/MapField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapField<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 533
    iget-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    if-nez v0, :cond_0

    .line 534
    sget-object v0, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    invoke-static {v0}, Lcom/google/protobuf/MapField;->emptyMapField(Lcom/google/protobuf/MapEntry;)Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0

    .line 537
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    return-object v0
.end method

.method private internalGetMutableFields()Lcom/google/protobuf/MapField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapField<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 541
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->onChanged()V

    .line 542
    iget-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    if-nez v0, :cond_0

    .line 543
    sget-object v0, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    invoke-static {v0}, Lcom/google/protobuf/MapField;->newMapField(Lcom/google/protobuf/MapEntry;)Lcom/google/protobuf/MapField;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    .line 546
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->isMutable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 547
    iget-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->copy()Lcom/google/protobuf/MapField;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    .line 549
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Struct$Builder;->fields_:Lcom/google/protobuf/MapField;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 426
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 429
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 486
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->build()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->build()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/Struct;
    .locals 2

    .line 446
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->buildPartial()Lcom/google/protobuf/Struct;

    move-result-object v1

    .line 447
    invoke-virtual {v1}, Lcom/google/protobuf/Struct;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 448
    invoke-static {v1}, Lcom/google/protobuf/Struct$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 450
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->buildPartial()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->buildPartial()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/Struct;
    .locals 3

    .line 454
    new-instance v1, Lcom/google/protobuf/Struct;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/protobuf/Struct;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Struct$1;)V

    .line 455
    iget v2, p0, Lcom/google/protobuf/Struct$Builder;->bitField0_:I

    .line 456
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/protobuf/Struct;->access$302(Lcom/google/protobuf/Struct;Lcom/google/protobuf/MapField;)Lcom/google/protobuf/MapField;

    .line 457
    invoke-static {v1}, Lcom/google/protobuf/Struct;->access$300(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->makeImmutable()V

    .line 458
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->onBuilt()V

    .line 459
    return-object v1
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clear()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clear()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clear()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clear()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 431
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 432
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->clear()V

    .line 433
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 472
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public clearFields()Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 622
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    .line 623
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 624
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 476
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clone()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clone()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clone()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clone()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clone()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 463
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->clone()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public containsFields(Ljava/lang/String;)Z
    .locals 1

    .line 565
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 566
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Struct;
    .locals 1

    .line 442
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 438
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Struct_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 573
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->getFieldsMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getFieldsCount()I
    .locals 1

    .line 553
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getFieldsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 584
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getFieldsOrDefault(Ljava/lang/String;Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value;
    .locals 2

    .line 597
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 598
    .line 599
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    .line 600
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public getFieldsOrThrow(Ljava/lang/String;)Lcom/google/protobuf/Value;
    .locals 2

    .line 612
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 613
    .line 614
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    .line 615
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 616
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 618
    :cond_1
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    return-object v0
.end method

.method public getMutableFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 647
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 410
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Struct_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Struct;

    const-class v2, Lcom/google/protobuf/Struct$Builder;

    .line 411
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 410
    return-object v0
.end method

.method protected internalGetMapField(I)Lcom/google/protobuf/MapField;
    .locals 3

    .line 389
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 391
    :sswitch_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0

    .line 393
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid map field number: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method protected internalGetMutableMapField(I)Lcom/google/protobuf/MapField;
    .locals 3

    .line 400
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 402
    :sswitch_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0

    .line 404
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid map field number: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public final isInitialized()Z
    .locals 1

    .line 507
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

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Struct$Builder;

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

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct$Builder;

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

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Struct$Builder;

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

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 514
    const/4 v1, 0x0

    .line 516
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/Struct;->access$500()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 521
    if-eqz v1, :cond_1

    .line 522
    invoke-virtual {p0, v1}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    goto :goto_0

    .line 517
    :catch_0
    move-exception v2

    .line 518
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    move-object v1, v0

    .line 519
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 521
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 522
    invoke-virtual {p0, v1}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    :cond_0
    throw v3

    .line 525
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 489
    instance-of v0, p1, Lcom/google/protobuf/Struct;

    if-eqz v0, :cond_0

    .line 490
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/Struct;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0

    .line 492
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 493
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;
    .locals 2

    .line 498
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 499
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    .line 500
    invoke-static {p1}, Lcom/google/protobuf/Struct;->access$400(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/MapField;

    move-result-object v1

    .line 499
    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapField;->mergeFrom(Lcom/google/protobuf/MapField;)V

    .line 501
    iget-object v0, p1, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Struct$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;

    .line 502
    invoke-virtual {p0}, Lcom/google/protobuf/Struct$Builder;->onChanged()V

    .line 503
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 686
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public putAllFields(Ljava/util/Map;)Lcom/google/protobuf/Struct$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/google/protobuf/Value;>;)Lcom/google/protobuf/Struct$Builder;"
        }
    .end annotation

    .line 675
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    .line 676
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 677
    return-object p0
.end method

.method public putFields(Ljava/lang/String;Lcom/google/protobuf/Value;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 659
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 660
    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 661
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    .line 662
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    return-object p0
.end method

.method public removeFields(Ljava/lang/String;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 636
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 637
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct$Builder;->internalGetMutableFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    .line 638
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Struct$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 468
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/Struct$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/Struct$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 481
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 681
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method
