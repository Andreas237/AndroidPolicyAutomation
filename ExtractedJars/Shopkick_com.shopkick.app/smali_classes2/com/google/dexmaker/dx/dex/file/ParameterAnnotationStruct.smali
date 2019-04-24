.class public final Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;
.super Ljava/lang/Object;
.source "ParameterAnnotationStruct.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/dexmaker/dx/util/ToHuman;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;",
        ">;"
    }
.end annotation


# instance fields
.field private final annotationsItem:Lcom/google/dexmaker/dx/dex/file/UniformListItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/dx/dex/file/UniformListItem<",
            "Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;",
            ">;"
        }
    .end annotation
.end field

.field private final annotationsList:Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;

.field private final method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;)V
    .locals 4

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 58
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    .line 59
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->annotationsList:Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;

    .line 66
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;->size()I

    move-result p1

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 71
    invoke-virtual {p2, v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;->get(I)Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    move-result-object v2

    .line 72
    new-instance v3, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-direct {v3, v2}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;-><init>(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    .line 73
    new-instance v2, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;

    invoke-direct {v2, v3}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;-><init>(Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 76
    :cond_0
    new-instance p1, Lcom/google/dexmaker/dx/dex/file/UniformListItem;

    sget-object p2, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    invoke-direct {p1, p2, v0}, Lcom/google/dexmaker/dx/dex/file/UniformListItem;-><init>(Lcom/google/dexmaker/dx/dex/file/ItemType;Ljava/util/List;)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/google/dexmaker/dx/dex/file/UniformListItem;

    return-void

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "annotationsList == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    .line 101
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getMethodIds()Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;

    move-result-object v0

    .line 102
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getWordData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object p1

    .line 104
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)Lcom/google/dexmaker/dx/dex/file/MethodIdItem;

    .line 105
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/google/dexmaker/dx/dex/file/UniformListItem;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->add(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)V

    return-void
.end method

.method public compareTo(Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;)I
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 31
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->compareTo(Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 87
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getAnnotationsList()Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->annotationsList:Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;

    return-object v0
.end method

.method public getMethod()Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->hashCode()I

    move-result v0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 5

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/google/dexmaker/dx/dex/file/UniformListItem;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/file/UniformListItem;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 136
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    :goto_1
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 141
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 4

    .line 110
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getMethodIds()Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;

    move-result-object p1

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)I

    move-result p1

    .line 111
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/google/dexmaker/dx/dex/file/UniformListItem;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/UniformListItem;->getAbsoluteOffset()I

    move-result v0

    .line 113
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "      method_idx:      "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {p2, v2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "      annotations_off: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 120
    :cond_0
    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 121
    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void
.end method
