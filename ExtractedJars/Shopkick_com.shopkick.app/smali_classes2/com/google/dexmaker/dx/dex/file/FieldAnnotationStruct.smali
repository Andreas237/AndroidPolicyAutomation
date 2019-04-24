.class public final Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;
.super Ljava/lang/Object;
.source "FieldAnnotationStruct.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/dexmaker/dx/util/ToHuman;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;",
        ">;"
    }
.end annotation


# instance fields
.field private annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

.field private final field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 52
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    .line 53
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    return-void

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "annotations == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "field == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    .line 77
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getFieldIds()Lcom/google/dexmaker/dx/dex/file/FieldIdsSection;

    move-result-object v0

    .line 78
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getWordData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object p1

    .line 80
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/dex/file/FieldIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;)Lcom/google/dexmaker/dx/dex/file/FieldIdItem;

    .line 81
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->intern(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)Lcom/google/dexmaker/dx/dex/file/OffsettedItem;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    return-void
.end method

.method public compareTo(Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;)I
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 28
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->compareTo(Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 63
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getAnnotations()Lcom/google/dexmaker/dx/rop/annotation/Annotations;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->getAnnotations()Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    move-result-object v0

    return-object v0
.end method

.method public getField()Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->hashCode()I

    move-result v0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 4

    .line 86
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getFieldIds()Lcom/google/dexmaker/dx/dex/file/FieldIdsSection;

    move-result-object p1

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/FieldIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;)I

    move-result p1

    .line 87
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->getAbsoluteOffset()I

    move-result v0

    .line 89
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->field:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "      field_idx:       "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {p2, v2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 92
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

    .line 96
    :cond_0
    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 97
    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void
.end method
