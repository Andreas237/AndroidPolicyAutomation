.class public final Lcom/google/protobuf/ListValue$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ListValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/ListValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/ListValue$Builder;>;Lcom/google/protobuf/ListValueOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<Lcom/google/protobuf/Value;Lcom/google/protobuf/Value$Builder;Lcom/google/protobuf/ValueOrBuilder;>;"
        }
    .end annotation
.end field

.field private values_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Value;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 327
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 477
    .line 478
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 328
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->maybeForceBuilderInitialization()V

    .line 329
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 333
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 477
    .line 478
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 334
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->maybeForceBuilderInitialization()V

    .line 335
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/ListValue$1;)V
    .locals 0

    .line 310
    invoke-direct {p0, p1}, Lcom/google/protobuf/ListValue$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/ListValue$1;)V
    .locals 0

    .line 310
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;-><init>()V

    return-void
.end method

.method private ensureValuesIsMutable()V
    .locals 2

    .line 480
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 481
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 482
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    .line 484
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 316
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_ListValue_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilderV3<Lcom/google/protobuf/Value;Lcom/google/protobuf/Value$Builder;Lcom/google/protobuf/ValueOrBuilder;>;"
        }
    .end annotation

    .line 777
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_1

    .line 778
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    iget-object v1, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    iget v2, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 782
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    move-result-object v3

    .line 783
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 784
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 786
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 337
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 339
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 341
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllValues(Ljava/lang/Iterable;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/google/protobuf/Value;>;)Lcom/google/protobuf/ListValue$Builder;"
        }
    .end annotation

    .line 656
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 657
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 658
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 660
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 662
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 664
    :goto_0
    return-object p0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 410
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addValues(ILcom/google/protobuf/Value$Builder;)Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 638
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 639
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 640
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 641
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 643
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {p2}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 645
    :goto_0
    return-object p0
.end method

.method public addValues(ILcom/google/protobuf/Value;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_1

    .line 600
    if-nez p2, :cond_0

    .line 601
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 603
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 604
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 605
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 607
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 609
    :goto_0
    return-object p0
.end method

.method public addValues(Lcom/google/protobuf/Value$Builder;)Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 620
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 621
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 622
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 623
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 625
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {p1}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 627
    :goto_0
    return-object p0
.end method

.method public addValues(Lcom/google/protobuf/Value;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 578
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_1

    .line 579
    if-nez p1, :cond_0

    .line 580
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 582
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 583
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 584
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 586
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 588
    :goto_0
    return-object p0
.end method

.method public addValuesBuilder()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 748
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 749
    invoke-static {}, Lcom/google/protobuf/Value;->getDefaultInstance()Lcom/google/protobuf/Value;

    move-result-object v1

    .line 748
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public addValuesBuilder(I)Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 760
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 761
    invoke-static {}, Lcom/google/protobuf/Value;->getDefaultInstance()Lcom/google/protobuf/Value;

    move-result-object v1

    .line 760
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public build()Lcom/google/protobuf/ListValue;
    .locals 2

    .line 363
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->buildPartial()Lcom/google/protobuf/ListValue;

    move-result-object v1

    .line 364
    invoke-virtual {v1}, Lcom/google/protobuf/ListValue;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    invoke-static {v1}, Lcom/google/protobuf/ListValue$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 367
    :cond_0
    return-object v1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->build()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->build()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/ListValue;
    .locals 4

    .line 371
    new-instance v2, Lcom/google/protobuf/ListValue;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/google/protobuf/ListValue;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/ListValue$1;)V

    .line 372
    iget v3, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    .line 373
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_1

    .line 374
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 375
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 376
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/google/protobuf/ListValue;->access$302(Lcom/google/protobuf/ListValue;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 380
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/protobuf/ListValue;->access$302(Lcom/google/protobuf/ListValue;Ljava/util/List;)Ljava/util/List;

    .line 382
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onBuilt()V

    .line 383
    return-object v2
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->buildPartial()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->buildPartial()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clear()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clear()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 343
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 344
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 345
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 346
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    goto :goto_0

    .line 348
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 350
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clear()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clear()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 396
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 400
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearValues()Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 674
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 675
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 676
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    .line 677
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 679
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 681
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clone()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clone()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clone()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 387
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clone()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clone()Lcom/google/protobuf/ListValue$Builder;

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

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->clone()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/ListValue;
    .locals 1

    .line 359
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 310
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 355
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_ListValue_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getValues(I)Lcom/google/protobuf/Value;
    .locals 1

    .line 525
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 526
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    return-object v0

    .line 528
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(I)Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    return-object v0
.end method

.method public getValuesBuilder(I)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 709
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilder(I)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public getValuesBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Value$Builder;>;"
        }
    .end annotation

    .line 772
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getValuesCount()I
    .locals 1

    .line 511
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 512
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 514
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    move-result v0

    return v0
.end method

.method public getValuesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 497
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 498
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 500
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getValuesOrBuilder(I)Lcom/google/protobuf/ValueOrBuilder;
    .locals 1

    .line 720
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 721
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ValueOrBuilder;

    return-object v0

    .line 722
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ValueOrBuilder;

    return-object v0
.end method

.method public getValuesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/google/protobuf/ValueOrBuilder;>;"
        }
    .end annotation

    .line 734
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-eqz v0, :cond_0

    .line 735
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 737
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 321
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_ListValue_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/ListValue;

    const-class v2, Lcom/google/protobuf/ListValue$Builder;

    .line 322
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 321
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 455
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

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/ListValue$Builder;

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

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 462
    const/4 v1, 0x0

    .line 464
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/ListValue;->access$400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 469
    if-eqz v1, :cond_1

    .line 470
    invoke-virtual {p0, v1}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    goto :goto_0

    .line 465
    :catch_0
    move-exception v2

    .line 466
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    move-object v1, v0

    .line 467
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 469
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 470
    invoke-virtual {p0, v1}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    :cond_0
    throw v3

    .line 473
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 422
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_2

    .line 424
    invoke-static {p1}, Lcom/google/protobuf/ListValue;->access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 425
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    invoke-static {p1}, Lcom/google/protobuf/ListValue;->access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 427
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    goto :goto_0

    .line 429
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 430
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-static {p1}, Lcom/google/protobuf/ListValue;->access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 432
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_2

    .line 435
    :cond_2
    invoke-static {p1}, Lcom/google/protobuf/ListValue;->access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 436
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 437
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 438
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 439
    invoke-static {p1}, Lcom/google/protobuf/ListValue;->access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    .line 440
    iget v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/protobuf/ListValue$Builder;->bitField0_:I

    .line 441
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_3

    .line 443
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->getValuesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    goto :goto_2

    .line 445
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-static {p1}, Lcom/google/protobuf/ListValue;->access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 449
    :cond_5
    :goto_2
    iget-object v0, p1, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/ListValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;

    .line 450
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    .line 451
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 413
    instance-of v0, p1, Lcom/google/protobuf/ListValue;

    if-eqz v0, :cond_0

    .line 414
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/ListValue;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0

    .line 416
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 417
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/ListValue$Builder;

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

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 795
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public removeValues(I)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 691
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 692
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 693
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 694
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 696
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->remove(I)V

    .line 698
    :goto_0
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 392
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/ListValue$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/ListValue$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 405
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/ListValue$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 790
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 310
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setValues(ILcom/google/protobuf/Value$Builder;)Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 561
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 562
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 563
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 564
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 566
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {p2}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 568
    :goto_0
    return-object p0
.end method

.method public setValues(ILcom/google/protobuf/Value;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 540
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_1

    .line 541
    if-nez p2, :cond_0

    .line 542
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 544
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/ListValue$Builder;->ensureValuesIsMutable()V

    .line 545
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->values_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 546
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue$Builder;->onChanged()V

    goto :goto_0

    .line 548
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue$Builder;->valuesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 550
    :goto_0
    return-object p0
.end method
