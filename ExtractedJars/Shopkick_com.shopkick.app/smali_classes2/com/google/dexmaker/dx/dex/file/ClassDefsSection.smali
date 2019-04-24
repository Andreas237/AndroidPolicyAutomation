.class public final Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;
.super Lcom/google/dexmaker/dx/dex/file/UniformItemSection;
.source "ClassDefsSection.java"


# instance fields
.field private final classDefs:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/rop/type/Type;",
            "Lcom/google/dexmaker/dx/dex/file/ClassDefItem;",
            ">;"
        }
    .end annotation
.end field

.field private orderedDefs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/file/ClassDefItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    const-string v0, "class_defs"

    const/4 v1, 0x4

    .line 49
    invoke-direct {p0, v0, p1, v1}, Lcom/google/dexmaker/dx/dex/file/UniformItemSection;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/dex/file/DexFile;I)V

    .line 51
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderedDefs:Ljava/util/ArrayList;

    return-void
.end method

.method private orderItems0(Lcom/google/dexmaker/dx/rop/type/Type;II)I
    .locals 4

    .line 159
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;

    if-eqz v0, :cond_4

    .line 161
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->hasIndex()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-ltz p3, :cond_3

    add-int/lit8 p3, p3, -0x1

    .line 171
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->getSuperclass()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 173
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->getClassType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    .line 174
    invoke-direct {p0, p1, p2, p3}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderItems0(Lcom/google/dexmaker/dx/rop/type/Type;II)I

    move-result p2

    .line 177
    :cond_1
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->getInterfaces()Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object p1

    .line 178
    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 180
    invoke-interface {p1, v2}, Lcom/google/dexmaker/dx/rop/type/TypeList;->getType(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v3

    invoke-direct {p0, v3, p2, p3}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderItems0(Lcom/google/dexmaker/dx/rop/type/Type;II)I

    move-result p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 183
    :cond_2
    invoke-virtual {v0, p2}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->setIndex(I)V

    .line 184
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderedDefs:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    return p2

    .line 166
    :cond_3
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "class circularity with "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_1
    return p2
.end method


# virtual methods
.method public add(Lcom/google/dexmaker/dx/dex/file/ClassDefItem;)V
    .locals 3

    .line 114
    :try_start_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->getThisClass()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->getClassType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->throwIfPrepared()V

    .line 122
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 126
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "already added: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 117
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "clazz == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get(Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/dex/file/IndexedItem;
    .locals 1

    if-eqz p1, :cond_1

    .line 72
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->throwIfNotPrepared()V

    .line 74
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->getClassType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    .line 75
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/IndexedItem;

    if-eqz p1, :cond_0

    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

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

    .line 58
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderedDefs:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    return-object v0

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method protected orderItems()V
    .locals 5

    .line 132
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderedDefs:Ljava/util/ArrayList;

    .line 143
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/rop/type/Type;

    sub-int v4, v0, v2

    .line 144
    invoke-direct {p0, v3, v2, v4}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->orderItems0(Lcom/google/dexmaker/dx/rop/type/Type;II)I

    move-result v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public writeHeaderPart(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 5

    .line 90
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->throwIfNotPrepared()V

    .line 92
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->classDefs:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/ClassDefsSection;->getFileOffset()I

    move-result v1

    .line 95
    :goto_0
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "class_defs_size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "class_defs_off:  "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v3, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 100
    :cond_1
    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 101
    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void
.end method
