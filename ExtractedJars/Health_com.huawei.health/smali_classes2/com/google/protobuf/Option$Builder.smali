.class public final Lcom/google/protobuf/Option$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/OptionOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Option;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/Option$Builder;>;Lcom/google/protobuf/OptionOrBuilder;"
    }
.end annotation


# instance fields
.field private name_:Ljava/lang/Object;

.field private valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<Lcom/google/protobuf/Any;Lcom/google/protobuf/Any$Builder;Lcom/google/protobuf/AnyOrBuilder;>;"
        }
    .end annotation
.end field

.field private value_:Lcom/google/protobuf/Any;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 382
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 509
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 613
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 383
    invoke-direct {p0}, Lcom/google/protobuf/Option$Builder;->maybeForceBuilderInitialization()V

    .line 384
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 388
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 509
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 613
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 389
    invoke-direct {p0}, Lcom/google/protobuf/Option$Builder;->maybeForceBuilderInitialization()V

    .line 390
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Option$1;)V
    .locals 0

    .line 365
    invoke-direct {p0, p1}, Lcom/google/protobuf/Option$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/Option$1;)V
    .locals 0

    .line 365
    invoke-direct {p0}, Lcom/google/protobuf/Option$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 371
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Option_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private getValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilderV3<Lcom/google/protobuf/Any;Lcom/google/protobuf/Any$Builder;Lcom/google/protobuf/AnyOrBuilder;>;"
        }
    .end annotation

    .line 782
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 783
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 785
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->getValue()Lcom/google/protobuf/Any;

    move-result-object v1

    .line 786
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    move-result-object v2

    .line 787
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 788
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 790
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 392
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 395
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 462
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->build()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->build()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/Option;
    .locals 2

    .line 419
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->buildPartial()Lcom/google/protobuf/Option;

    move-result-object v1

    .line 420
    invoke-virtual {v1}, Lcom/google/protobuf/Option;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    invoke-static {v1}, Lcom/google/protobuf/Option$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 423
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->buildPartial()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->buildPartial()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/Option;
    .locals 2

    .line 427
    new-instance v1, Lcom/google/protobuf/Option;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/protobuf/Option;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Option$1;)V

    .line 428
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/google/protobuf/Option;->access$302(Lcom/google/protobuf/Option;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    invoke-static {v1, v0}, Lcom/google/protobuf/Option;->access$402(Lcom/google/protobuf/Option;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;

    goto :goto_0

    .line 432
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Any;

    invoke-static {v1, v0}, Lcom/google/protobuf/Option;->access$402(Lcom/google/protobuf/Option;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;

    .line 434
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onBuilt()V

    .line 435
    return-object v1
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clear()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clear()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clear()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clear()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 397
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 398
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 400
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 401
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    goto :goto_0

    .line 403
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 404
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 406
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 448
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public clearName()Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 587
    invoke-static {}, Lcom/google/protobuf/Option;->getDefaultInstance()Lcom/google/protobuf/Option;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Option;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 588
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    .line 589
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 452
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public clearValue()Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 726
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 727
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 728
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    goto :goto_0

    .line 730
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 731
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 734
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clone()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clone()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clone()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clone()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clone()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 439
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->clone()Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 365
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Option;
    .locals 1

    .line 415
    invoke-static {}, Lcom/google/protobuf/Option;->getDefaultInstance()Lcom/google/protobuf/Option;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 411
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Option_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 521
    iget-object v1, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 522
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 523
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 525
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 526
    iput-object v3, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 527
    return-object v3

    .line 529
    :cond_0
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 544
    iget-object v1, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 545
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 546
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 547
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 549
    iput-object v2, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 550
    return-object v2

    .line 552
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getValue()Lcom/google/protobuf/Any;
    .locals 1

    .line 640
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 641
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    :goto_0
    return-object v0

    .line 643
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Any;

    return-object v0
.end method

.method public getValueBuilder()Lcom/google/protobuf/Any$Builder;
    .locals 1

    .line 748
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    .line 749
    invoke-direct {p0}, Lcom/google/protobuf/Option$Builder;->getValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Any$Builder;

    return-object v0
.end method

.method public getValueOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
    .locals 1

    .line 762
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-eqz v0, :cond_0

    .line 763
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AnyOrBuilder;

    return-object v0

    .line 765
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    if-nez v0, :cond_1

    .line 766
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 765
    :goto_0
    return-object v0
.end method

.method public hasValue()Z
    .locals 1

    .line 627
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 376
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Option_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Option;

    const-class v2, Lcom/google/protobuf/Option$Builder;

    .line 377
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 376
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 488
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

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Option$Builder;

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

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Option$Builder;

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

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Option$Builder;

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

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Option$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 495
    const/4 v1, 0x0

    .line 497
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/Option;->access$500()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 502
    if-eqz v1, :cond_1

    .line 503
    invoke-virtual {p0, v1}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/Option;)Lcom/google/protobuf/Option$Builder;

    goto :goto_0

    .line 498
    :catch_0
    move-exception v2

    .line 499
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option;

    move-object v1, v0

    .line 500
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 502
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 503
    invoke-virtual {p0, v1}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/Option;)Lcom/google/protobuf/Option$Builder;

    :cond_0
    throw v3

    .line 506
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 465
    instance-of v0, p1, Lcom/google/protobuf/Option;

    if-eqz v0, :cond_0

    .line 466
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/Option;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Option$Builder;->mergeFrom(Lcom/google/protobuf/Option;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0

    .line 468
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 469
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Option;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 474
    invoke-static {}, Lcom/google/protobuf/Option;->getDefaultInstance()Lcom/google/protobuf/Option;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 475
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Option;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 476
    invoke-static {p1}, Lcom/google/protobuf/Option;->access$300(Lcom/google/protobuf/Option;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 477
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    .line 479
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/Option;->hasValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 480
    invoke-virtual {p1}, Lcom/google/protobuf/Option;->getValue()Lcom/google/protobuf/Any;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Option$Builder;->mergeValue(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Option$Builder;

    .line 482
    :cond_2
    iget-object v0, p1, Lcom/google/protobuf/Option;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Option$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;

    .line 483
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    .line 484
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 799
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public mergeValue(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 701
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 702
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    if-eqz v0, :cond_0

    .line 703
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 704
    invoke-static {v0}, Lcom/google/protobuf/Any;->newBuilder(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/Any$Builder;->mergeFrom(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Any$Builder;->buildPartial()Lcom/google/protobuf/Any;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    goto :goto_0

    .line 706
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 708
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    goto :goto_1

    .line 710
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 713
    :goto_1
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Option$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 444
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 567
    if-nez p1, :cond_0

    .line 568
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 571
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 572
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    .line 573
    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 603
    if-nez p1, :cond_0

    .line 604
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 606
    :cond_0
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 608
    iput-object p1, p0, Lcom/google/protobuf/Option$Builder;->name_:Ljava/lang/Object;

    .line 609
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    .line 610
    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/Option$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/Option$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 457
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Option$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 794
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option$Builder;

    return-object v0
.end method

.method public setValue(Lcom/google/protobuf/Any$Builder;)Lcom/google/protobuf/Option$Builder;
    .locals 2

    .line 681
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 682
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 683
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    goto :goto_0

    .line 685
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 688
    :goto_0
    return-object p0
.end method

.method public setValue(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Option$Builder;
    .locals 1

    .line 657
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 658
    if-nez p1, :cond_0

    .line 659
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 661
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Option$Builder;->value_:Lcom/google/protobuf/Any;

    .line 662
    invoke-virtual {p0}, Lcom/google/protobuf/Option$Builder;->onChanged()V

    goto :goto_0

    .line 664
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Option$Builder;->valueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 667
    :goto_0
    return-object p0
.end method
