.class public final Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;
.super Lcom/google/dexmaker/dx/dex/file/MemberIdsSection;
.source "MethodIdsSection.java"


# instance fields
.field private final methodIds:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;",
            "Lcom/google/dexmaker/dx/dex/file/MethodIdItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 1

    const-string v0, "method_ids"

    .line 43
    invoke-direct {p0, v0, p1}, Lcom/google/dexmaker/dx/dex/file/MemberIdsSection;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    .line 45
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public get(Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/dex/file/IndexedItem;
    .locals 1

    if-eqz p1, :cond_1

    .line 61
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->throwIfNotPrepared()V

    .line 63
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/IndexedItem;

    if-eqz p1, :cond_0

    return-object p1

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public indexOf(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)I
    .locals 1

    if-eqz p1, :cond_1

    .line 127
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->throwIfNotPrepared()V

    .line 129
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/MethodIdItem;

    if-eqz p1, :cond_0

    .line 135
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/MethodIdItem;->getIndex()I

    move-result p1

    return p1

    .line 132
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "ref == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public intern(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)Lcom/google/dexmaker/dx/dex/file/MethodIdItem;
    .locals 2

    if-eqz p1, :cond_1

    .line 103
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->throwIfPrepared()V

    .line 105
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/dex/file/MethodIdItem;

    if-nez v0, :cond_0

    .line 108
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/MethodIdItem;

    invoke-direct {v0, p1}, Lcom/google/dexmaker/dx/dex/file/MethodIdItem;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)V

    .line 109
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0

    .line 100
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "method == null"

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
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public writeHeaderPart(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 5

    .line 78
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->throwIfNotPrepared()V

    .line 80
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->methodIds:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->getFileOffset()I

    move-result v1

    .line 83
    :goto_0
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method_ids_size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 85
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "method_ids_off:  "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 88
    :cond_1
    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 89
    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void
.end method
