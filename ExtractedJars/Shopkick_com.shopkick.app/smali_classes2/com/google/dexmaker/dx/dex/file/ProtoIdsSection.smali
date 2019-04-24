.class public final Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;
.super Lcom/google/dexmaker/dx/dex/file/UniformItemSection;
.source "ProtoIdsSection.java"


# instance fields
.field private final protoIds:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/rop/type/Prototype;",
            "Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    const-string v0, "proto_ids"

    const/4 v1, 0x4

    .line 43
    invoke-direct {p0, v0, p1, v1}, Lcom/google/dexmaker/dx/dex/file/UniformItemSection;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/dex/file/DexFile;I)V

    .line 45
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->protoIds:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public get(Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/dex/file/IndexedItem;
    .locals 1

    .line 57
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public indexOf(Lcom/google/dexmaker/dx/rop/type/Prototype;)I
    .locals 1

    if-eqz p1, :cond_1

    .line 119
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->throwIfNotPrepared()V

    .line 121
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->protoIds:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;

    if-eqz p1, :cond_0

    .line 127
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;->getIndex()I

    move-result p1

    return p1

    .line 124
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "prototype == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public intern(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;
    .locals 2

    if-eqz p1, :cond_1

    .line 95
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->throwIfPrepared()V

    .line 97
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->protoIds:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;

    invoke-direct {v0, p1}, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;-><init>(Lcom/google/dexmaker/dx/rop/type/Prototype;)V

    .line 101
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->protoIds:Ljava/util/TreeMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "prototype == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public items()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lcom/google/dexmaker/dx/dex/file/Item;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->protoIds:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method protected orderItems()V
    .locals 3

    .line 135
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->items()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/Item;

    .line 136
    check-cast v2, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/dex/file/ProtoIdItem;->setIndex(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public writeHeaderPart(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 5

    .line 66
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->throwIfNotPrepared()V

    .line 68
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->protoIds:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ProtoIdsSection;->getFileOffset()I

    move-result v1

    :goto_0
    const/high16 v2, 0x10000

    if-gt v0, v2, :cond_2

    .line 75
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "proto_ids_size:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "proto_ids_off:   "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 80
    :cond_1
    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 81
    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "too many proto ids"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
