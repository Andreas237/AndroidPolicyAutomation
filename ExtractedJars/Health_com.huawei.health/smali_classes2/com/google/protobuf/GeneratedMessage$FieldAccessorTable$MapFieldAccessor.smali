.class Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MapFieldAccessor"
.end annotation


# instance fields
.field private final field:Lcom/google/protobuf/Descriptors$FieldDescriptor;

.field private final mapEntryMessageDefaultInstance:Lcom/google/protobuf/Message;


# direct methods
.method constructor <init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage;>;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage$Builder;>;)V"
        }
    .end annotation

    .line 2532
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2533
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->field:Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 2534
    const-string v0, "getDefaultInstance"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    .line 2535
    invoke-static {p3, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 2536
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2537
    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage;

    .line 2536
    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMapField(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/MapField;

    move-result-object v3

    .line 2538
    .line 2539
    invoke-virtual {v3}, Lcom/google/protobuf/MapField;->getMapEntryMessageDefaultInstance()Lcom/google/protobuf/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->mapEntryMessageDefaultInstance:Lcom/google/protobuf/Message;

    .line 2540
    return-void
.end method

.method private getMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField<**>;"
        }
    .end annotation

    .line 2550
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->field:Lcom/google/protobuf/Descriptors$FieldDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/protobuf/GeneratedMessage$Builder;->internalGetMapField(I)Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0
.end method

.method private getMapField(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/MapField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/MapField<**>;"
        }
    .end annotation

    .line 2546
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->field:Lcom/google/protobuf/Descriptors$FieldDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/protobuf/GeneratedMessage;->internalGetMapField(I)Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0
.end method

.method private getMutableMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField<**>;"
        }
    .end annotation

    .line 2555
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->field:Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 2556
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    .line 2555
    invoke-virtual {p1, v0}, Lcom/google/protobuf/GeneratedMessage$Builder;->internalGetMutableMapField(I)Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addRepeated(Lcom/google/protobuf/GeneratedMessage$Builder;Ljava/lang/Object;)V
    .locals 2

    .line 2624
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMutableMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableList()Ljava/util/List;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lcom/google/protobuf/Message;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2625
    return-void
.end method

.method public clear(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1

    .line 2651
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMutableMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2652
    return-void
.end method

.method public get(Lcom/google/protobuf/GeneratedMessage$Builder;)Ljava/lang/Object;
    .locals 3

    .line 2572
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2573
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getRepeatedCount(Lcom/google/protobuf/GeneratedMessage$Builder;)I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 2574
    invoke-virtual {p0, p1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getRepeated(Lcom/google/protobuf/GeneratedMessage$Builder;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2573
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2576
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public get(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;
    .locals 3

    .line 2562
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2563
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getRepeatedCount(Lcom/google/protobuf/GeneratedMessage;)I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 2564
    invoke-virtual {p0, p1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getRepeated(Lcom/google/protobuf/GeneratedMessage;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2563
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2566
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBuilder(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/Message$Builder;
    .locals 2

    .line 2661
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Nested builder not supported for map fields."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getRaw(Lcom/google/protobuf/GeneratedMessage$Builder;)Ljava/lang/Object;
    .locals 1

    .line 2586
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->get(Lcom/google/protobuf/GeneratedMessage$Builder;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRaw(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;
    .locals 1

    .line 2581
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->get(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeated(Lcom/google/protobuf/GeneratedMessage$Builder;I)Ljava/lang/Object;
    .locals 1

    .line 2604
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeated(Lcom/google/protobuf/GeneratedMessage;I)Ljava/lang/Object;
    .locals 1

    .line 2599
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMapField(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeatedBuilder(Lcom/google/protobuf/GeneratedMessage$Builder;I)Lcom/google/protobuf/Message$Builder;
    .locals 2

    .line 2667
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Nested builder not supported for map fields."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getRepeatedCount(Lcom/google/protobuf/GeneratedMessage$Builder;)I
    .locals 1

    .line 2646
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getRepeatedCount(Lcom/google/protobuf/GeneratedMessage;)I
    .locals 1

    .line 2641
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMapField(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getRepeatedRaw(Lcom/google/protobuf/GeneratedMessage$Builder;I)Ljava/lang/Object;
    .locals 1

    .line 2614
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getRepeated(Lcom/google/protobuf/GeneratedMessage$Builder;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRepeatedRaw(Lcom/google/protobuf/GeneratedMessage;I)Ljava/lang/Object;
    .locals 1

    .line 2609
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getRepeated(Lcom/google/protobuf/GeneratedMessage;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public has(Lcom/google/protobuf/GeneratedMessage$Builder;)Z
    .locals 2

    .line 2635
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "hasField() is not supported for repeated fields."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public has(Lcom/google/protobuf/GeneratedMessage;)Z
    .locals 2

    .line 2629
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "hasField() is not supported for repeated fields."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public newBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 2656
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->mapEntryMessageDefaultInstance:Lcom/google/protobuf/Message;

    invoke-interface {v0}, Lcom/google/protobuf/Message;->newBuilderForType()Lcom/google/protobuf/Message$Builder;

    move-result-object v0

    return-object v0
.end method

.method public set(Lcom/google/protobuf/GeneratedMessage$Builder;Ljava/lang/Object;)V
    .locals 3

    .line 2591
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->clear(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 2592
    move-object v0, p2

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 2593
    invoke-virtual {p0, p1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->addRepeated(Lcom/google/protobuf/GeneratedMessage$Builder;Ljava/lang/Object;)V

    .line 2594
    goto :goto_0

    .line 2595
    :cond_0
    return-void
.end method

.method public setRepeated(Lcom/google/protobuf/GeneratedMessage$Builder;ILjava/lang/Object;)V
    .locals 2

    .line 2619
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;->getMutableMapField(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableList()Ljava/util/List;

    move-result-object v0

    move-object v1, p3

    check-cast v1, Lcom/google/protobuf/Message;

    invoke-interface {v0, p2, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2620
    return-void
.end method
