.class public final Lcom/google/dexmaker/dx/dex/file/StringIdsSection;
.super Lcom/google/dexmaker/dx/dex/file/UniformItemSection;
.source "StringIdsSection.java"


# instance fields
.field private final strings:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/rop/cst/CstString;",
            "Lcom/google/dexmaker/dx/dex/file/StringIdItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    const-string/jumbo v0, "string_ids"

    const/4 v1, 0x4

    .line 45
    invoke-direct {p0, v0, p1, v1}, Lcom/google/dexmaker/dx/dex/file/UniformItemSection;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/dex/file/DexFile;I)V

    .line 47
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public get(Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/dex/file/IndexedItem;
    .locals 1

    if-eqz p1, :cond_1

    .line 63
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->throwIfNotPrepared()V

    .line 65
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/IndexedItem;

    if-eqz p1, :cond_0

    return-object p1

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public indexOf(Lcom/google/dexmaker/dx/rop/cst/CstString;)I
    .locals 1

    if-eqz p1, :cond_1

    .line 161
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->throwIfNotPrepared()V

    .line 163
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    if-eqz p1, :cond_0

    .line 169
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/StringIdItem;->getIndex()I

    move-result p1

    return p1

    .line 166
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 158
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "string == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public intern(Lcom/google/dexmaker/dx/dex/file/StringIdItem;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;
    .locals 2

    if-eqz p1, :cond_1

    .line 126
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->throwIfPrepared()V

    .line 128
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/StringIdItem;->getValue()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    if-eqz v1, :cond_0

    return-object v1

    .line 135
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 123
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "string == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public intern(Lcom/google/dexmaker/dx/rop/cst/CstString;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;
    .locals 1

    .line 112
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    invoke-direct {v0, p1}, Lcom/google/dexmaker/dx/dex/file/StringIdItem;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->intern(Lcom/google/dexmaker/dx/dex/file/StringIdItem;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    move-result-object p1

    return-object p1
.end method

.method public intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;
    .locals 2

    .line 102
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, p1}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/StringIdItem;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->intern(Lcom/google/dexmaker/dx/dex/file/StringIdItem;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    move-result-object p1

    return-object p1
.end method

.method public intern(Lcom/google/dexmaker/dx/rop/cst/CstNat;)V
    .locals 1

    .line 145
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstString;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    .line 146
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->getDescriptor()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstString;)Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    return-void
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

    .line 53
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method protected orderItems()V
    .locals 3

    .line 177
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

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

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/StringIdItem;

    .line 178
    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/dex/file/StringIdItem;->setIndex(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public writeHeaderPart(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 5

    .line 80
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->throwIfNotPrepared()V

    .line 82
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->getFileOffset()I

    move-result v1

    .line 85
    :goto_0
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "string_ids_size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "string_ids_off:  "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 90
    :cond_1
    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 91
    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void
.end method
