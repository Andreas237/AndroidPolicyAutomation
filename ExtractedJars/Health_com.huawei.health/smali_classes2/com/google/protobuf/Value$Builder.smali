.class public final Lcom/google/protobuf/Value$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Value;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/Value$Builder;>;Lcom/google/protobuf/ValueOrBuilder;"
    }
.end annotation


# instance fields
.field private kindCase_:I

.field private kind_:Ljava/lang/Object;

.field private listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<Lcom/google/protobuf/ListValue;Lcom/google/protobuf/ListValue$Builder;Lcom/google/protobuf/ListValueOrBuilder;>;"
        }
    .end annotation
.end field

.field private structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<Lcom/google/protobuf/Struct;Lcom/google/protobuf/Struct$Builder;Lcom/google/protobuf/StructOrBuilder;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 643
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 808
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 644
    invoke-direct {p0}, Lcom/google/protobuf/Value$Builder;->maybeForceBuilderInitialization()V

    .line 645
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 649
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 808
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 650
    invoke-direct {p0}, Lcom/google/protobuf/Value$Builder;->maybeForceBuilderInitialization()V

    .line 651
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Value$1;)V
    .locals 0

    .line 626
    invoke-direct {p0, p1}, Lcom/google/protobuf/Value$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/Value$1;)V
    .locals 0

    .line 626
    invoke-direct {p0}, Lcom/google/protobuf/Value$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 632
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Value_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private getListValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilderV3<Lcom/google/protobuf/ListValue;Lcom/google/protobuf/ListValue$Builder;Lcom/google/protobuf/ListValueOrBuilder;>;"
        }
    .end annotation

    .line 1409
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1410
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    .line 1411
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1413
    :cond_0
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    iget-object v1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/ListValue;

    .line 1416
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    move-result-object v2

    .line 1417
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1418
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1420
    :cond_1
    const/4 v0, 0x6

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1421
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1422
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object v0
.end method

.method private getStructValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilderV3<Lcom/google/protobuf/Struct;Lcom/google/protobuf/Struct$Builder;Lcom/google/protobuf/StructOrBuilder;>;"
        }
    .end annotation

    .line 1237
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1238
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 1239
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1241
    :cond_0
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    iget-object v1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/Struct;

    .line 1244
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    move-result-object v2

    .line 1245
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1246
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1248
    :cond_1
    const/4 v0, 0x5

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1249
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1250
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 653
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 656
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 738
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->build()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/Value;
    .locals 2

    .line 674
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->buildPartial()Lcom/google/protobuf/Value;

    move-result-object v1

    .line 675
    invoke-virtual {v1}, Lcom/google/protobuf/Value;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 676
    invoke-static {v1}, Lcom/google/protobuf/Value$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 678
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->buildPartial()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->buildPartial()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/Value;
    .locals 3

    .line 682
    new-instance v2, Lcom/google/protobuf/Value;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/google/protobuf/Value;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Value$1;)V

    .line 683
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 684
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 687
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 689
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 690
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    :cond_2
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 693
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    :cond_3
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 696
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_4

    .line 697
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 699
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    :cond_5
    :goto_0
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_7

    .line 703
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_6

    .line 704
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 706
    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    :cond_7
    :goto_1
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    invoke-static {v2, v0}, Lcom/google/protobuf/Value;->access$402(Lcom/google/protobuf/Value;I)I

    .line 710
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onBuilt()V

    .line 711
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clear()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clear()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clear()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clear()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 658
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 659
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 660
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 661
    return-object p0
.end method

.method public clearBoolValue()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1073
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 1074
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1075
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1076
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1078
    :cond_0
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 724
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public clearKind()Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 817
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 818
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 819
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 820
    return-object p0
.end method

.method public clearListValue()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1357
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 1358
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 1359
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1360
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1361
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_0

    .line 1364
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 1365
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1366
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1368
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->clear()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1370
    :cond_2
    :goto_0
    return-object p0
.end method

.method public clearNullValue()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 889
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 890
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 891
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 892
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 894
    :cond_0
    return-object p0
.end method

.method public clearNumberValue()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 931
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 932
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 933
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 934
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 936
    :cond_0
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 728
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public clearStringValue()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1013
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 1014
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1015
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1016
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1018
    :cond_0
    return-object p0
.end method

.method public clearStructValue()Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1185
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 1186
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 1187
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1188
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1189
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_0

    .line 1192
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 1193
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1194
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1196
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->clear()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1198
    :cond_2
    :goto_0
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clone()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clone()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clone()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clone()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clone()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 715
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->clone()Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBoolValue()Z
    .locals 2

    .line 1047
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 1048
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 1050
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 626
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Value;
    .locals 1

    .line 670
    invoke-static {}, Lcom/google/protobuf/Value;->getDefaultInstance()Lcom/google/protobuf/Value;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 666
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Value_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getKindCase()Lcom/google/protobuf/Value$KindCase;
    .locals 1

    .line 812
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    invoke-static {v0}, Lcom/google/protobuf/Value$KindCase;->forNumber(I)Lcom/google/protobuf/Value$KindCase;

    move-result-object v0

    return-object v0
.end method

.method public getListValue()Lcom/google/protobuf/ListValue;
    .locals 2

    .line 1273
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1274
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1275
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0

    .line 1277
    :cond_0
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0

    .line 1279
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 1280
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0

    .line 1282
    :cond_2
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public getListValueBuilder()Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 1380
    invoke-direct {p0}, Lcom/google/protobuf/Value$Builder;->getListValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue$Builder;

    return-object v0
.end method

.method public getListValueOrBuilder()Lcom/google/protobuf/ListValueOrBuilder;
    .locals 2

    .line 1390
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-eqz v0, :cond_0

    .line 1391
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValueOrBuilder;

    return-object v0

    .line 1393
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 1394
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0

    .line 1396
    :cond_1
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public getNullValue()Lcom/google/protobuf/NullValue;
    .locals 3

    .line 858
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 859
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    .line 860
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 859
    invoke-static {v0}, Lcom/google/protobuf/NullValue;->valueOf(I)Lcom/google/protobuf/NullValue;

    move-result-object v2

    .line 861
    if-nez v2, :cond_0

    sget-object v0, Lcom/google/protobuf/NullValue;->UNRECOGNIZED:Lcom/google/protobuf/NullValue;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    return-object v0

    .line 863
    :cond_1
    sget-object v0, Lcom/google/protobuf/NullValue;->NULL_VALUE:Lcom/google/protobuf/NullValue;

    return-object v0
.end method

.method public getNullValueValue()I
    .locals 2

    .line 832
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 833
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 835
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getNumberValue()D
    .locals 2

    .line 905
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 906
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 908
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 5

    .line 947
    const-string v2, ""

    .line 948
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 949
    iget-object v2, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 951
    :cond_0
    instance-of v0, v2, Ljava/lang/String;

    if-nez v0, :cond_2

    .line 952
    move-object v3, v2

    check-cast v3, Lcom/google/protobuf/ByteString;

    .line 954
    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v4

    .line 955
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 956
    iput-object v4, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 958
    :cond_1
    return-object v4

    .line 960
    :cond_2
    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getStringValueBytes()Lcom/google/protobuf/ByteString;
    .locals 4

    .line 972
    const-string v2, ""

    .line 973
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 974
    iget-object v2, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 976
    :cond_0
    instance-of v0, v2, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 977
    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    .line 978
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v3

    .line 980
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 981
    iput-object v3, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 983
    :cond_1
    return-object v3

    .line 985
    :cond_2
    move-object v0, v2

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getStructValue()Lcom/google/protobuf/Struct;
    .locals 2

    .line 1101
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1102
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 1103
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0

    .line 1105
    :cond_0
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0

    .line 1107
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 1108
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0

    .line 1110
    :cond_2
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public getStructValueBuilder()Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 1208
    invoke-direct {p0}, Lcom/google/protobuf/Value$Builder;->getStructValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct$Builder;

    return-object v0
.end method

.method public getStructValueOrBuilder()Lcom/google/protobuf/StructOrBuilder;
    .locals 2

    .line 1218
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-eqz v0, :cond_0

    .line 1219
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StructOrBuilder;

    return-object v0

    .line 1221
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 1222
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0

    .line 1224
    :cond_1
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public hasListValue()Z
    .locals 2

    .line 1263
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasStructValue()Z
    .locals 2

    .line 1091
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 637
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Value_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Value;

    const-class v2, Lcom/google/protobuf/Value$Builder;

    .line 638
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 637
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 788
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

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Value$Builder;

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

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Value$Builder;

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

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Value$Builder;

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

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Value$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 795
    const/4 v1, 0x0

    .line 797
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/Value;->access$500()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 802
    if-eqz v1, :cond_1

    .line 803
    invoke-virtual {p0, v1}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value$Builder;

    goto :goto_0

    .line 798
    :catch_0
    move-exception v2

    .line 799
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    move-object v1, v0

    .line 800
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 802
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 803
    invoke-virtual {p0, v1}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value$Builder;

    :cond_0
    throw v3

    .line 806
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 741
    instance-of v0, p1, Lcom/google/protobuf/Value;

    if-eqz v0, :cond_0

    .line 742
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/Value;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$Builder;->mergeFrom(Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0

    .line 744
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 745
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 750
    invoke-static {}, Lcom/google/protobuf/Value;->getDefaultInstance()Lcom/google/protobuf/Value;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 751
    :cond_0
    sget-object v0, Lcom/google/protobuf/Value$2;->$SwitchMap$com$google$protobuf$Value$KindCase:[I

    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getKindCase()Lcom/google/protobuf/Value$KindCase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/Value$KindCase;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 753
    :pswitch_0
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getNullValueValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$Builder;->setNullValueValue(I)Lcom/google/protobuf/Value$Builder;

    .line 754
    goto :goto_0

    .line 757
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getNumberValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/Value$Builder;->setNumberValue(D)Lcom/google/protobuf/Value$Builder;

    .line 758
    goto :goto_0

    .line 761
    :pswitch_2
    const/4 v0, 0x3

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 762
    invoke-static {p1}, Lcom/google/protobuf/Value;->access$300(Lcom/google/protobuf/Value;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 763
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 764
    goto :goto_0

    .line 767
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getBoolValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$Builder;->setBoolValue(Z)Lcom/google/protobuf/Value$Builder;

    .line 768
    goto :goto_0

    .line 771
    :pswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getStructValue()Lcom/google/protobuf/Struct;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$Builder;->mergeStructValue(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Value$Builder;

    .line 772
    goto :goto_0

    .line 775
    :pswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getListValue()Lcom/google/protobuf/ListValue;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$Builder;->mergeListValue(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/Value$Builder;

    .line 776
    .line 782
    :goto_0
    :pswitch_6
    iget-object v0, p1, Lcom/google/protobuf/Value;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;

    .line 783
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 784
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public mergeListValue(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1331
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1332
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1333
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1334
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/ListValue;

    invoke-static {v0}, Lcom/google/protobuf/ListValue;->newBuilder(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    .line 1335
    invoke-virtual {v0, p1}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ListValue$Builder;->buildPartial()Lcom/google/protobuf/ListValue;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    goto :goto_0

    .line 1337
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1339
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_1

    .line 1341
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 1342
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1344
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1346
    :goto_1
    const/4 v0, 0x6

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1347
    return-object p0
.end method

.method public mergeStructValue(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1159
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1160
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1161
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1162
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/Struct;

    invoke-static {v0}, Lcom/google/protobuf/Struct;->newBuilder(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    .line 1163
    invoke-virtual {v0, p1}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Struct$Builder;->buildPartial()Lcom/google/protobuf/Struct;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    goto :goto_0

    .line 1165
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1167
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_1

    .line 1169
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 1170
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1172
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1174
    :goto_1
    const/4 v0, 0x5

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1175
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 1431
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public setBoolValue(Z)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 1060
    const/4 v0, 0x4

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1061
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1062
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1063
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 720
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public setListValue(Lcom/google/protobuf/ListValue$Builder;)Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1314
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 1315
    invoke-virtual {p1}, Lcom/google/protobuf/ListValue$Builder;->build()Lcom/google/protobuf/ListValue;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1316
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_0

    .line 1318
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {p1}, Lcom/google/protobuf/ListValue$Builder;->build()Lcom/google/protobuf/ListValue;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1320
    :goto_0
    const/4 v0, 0x6

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1321
    return-object p0
.end method

.method public setListValue(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 1293
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1294
    if-nez p1, :cond_0

    .line 1295
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1297
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1298
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_0

    .line 1300
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->listValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1302
    :goto_0
    const/4 v0, 0x6

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1303
    return-object p0
.end method

.method public setNullValue(Lcom/google/protobuf/NullValue;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 873
    if-nez p1, :cond_0

    .line 874
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 876
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 877
    invoke-virtual {p1}, Lcom/google/protobuf/NullValue;->getNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 878
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 879
    return-object p0
.end method

.method public setNullValueValue(I)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 845
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 846
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 847
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 848
    return-object p0
.end method

.method public setNumberValue(D)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 918
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 919
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 920
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 921
    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/Value$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/Value$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 733
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method

.method public setStringValue(Ljava/lang/String;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 997
    if-nez p1, :cond_0

    .line 998
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1000
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1001
    iput-object p1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1002
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1003
    return-object p0
.end method

.method public setStringValueBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 1029
    if-nez p1, :cond_0

    .line 1030
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1032
    :cond_0
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 1033
    const/4 v0, 0x3

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1034
    iput-object p1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1035
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    .line 1036
    return-object p0
.end method

.method public setStructValue(Lcom/google/protobuf/Struct$Builder;)Lcom/google/protobuf/Value$Builder;
    .locals 2

    .line 1142
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 1143
    invoke-virtual {p1}, Lcom/google/protobuf/Struct$Builder;->build()Lcom/google/protobuf/Struct;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1144
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_0

    .line 1146
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {p1}, Lcom/google/protobuf/Struct$Builder;->build()Lcom/google/protobuf/Struct;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1148
    :goto_0
    const/4 v0, 0x5

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1149
    return-object p0
.end method

.method public setStructValue(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 1121
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 1122
    if-nez p1, :cond_0

    .line 1123
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1125
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Value$Builder;->kind_:Ljava/lang/Object;

    .line 1126
    invoke-virtual {p0}, Lcom/google/protobuf/Value$Builder;->onChanged()V

    goto :goto_0

    .line 1128
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Value$Builder;->structValueBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 1130
    :goto_0
    const/4 v0, 0x5

    iput v0, p0, Lcom/google/protobuf/Value$Builder;->kindCase_:I

    .line 1131
    return-object p0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 626
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Value$Builder;
    .locals 1

    .line 1426
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value$Builder;

    return-object v0
.end method
