.class public final Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;
.super Lcom/google/dexmaker/dx/dex/file/OffsettedItem;
.source "AnnotationSetItem.java"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final ENTRY_WRITE_SIZE:I = 0x4


# instance fields
.field private final annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

.field private final items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V
    .locals 4

    .line 50
    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->writeSize(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)I

    move-result v0

    const/4 v1, 0x4

    invoke-direct {p0, v1, v0}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 52
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    .line 53
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    .line 56
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->getAnnotations()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    .line 57
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    new-instance v3, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    invoke-direct {v3, v1}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;-><init>(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static writeSize(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)I
    .locals 1

    .line 72
    :try_start_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->size()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    mul-int/lit8 p0, p0, 0x4

    add-int/lit8 p0, p0, 0x4

    return p0

    .line 75
    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "list == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 4

    .line 116
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getByteData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object p1

    .line 117
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 120
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    aget-object v3, v2, v1

    invoke-virtual {p1, v3}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->intern(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)Lcom/google/dexmaker/dx/dex/file/OffsettedItem;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected compareTo0(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)I
    .locals 1

    .line 97
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    .line 99
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)I

    move-result p1

    return p1
.end method

.method public getAnnotations()Lcom/google/dexmaker/dx/rop/annotation/Annotations;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->hashCode()I

    move-result v0

    return v0
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 105
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method

.method protected place0(Lcom/google/dexmaker/dx/dex/file/Section;I)V
    .locals 0

    .line 128
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->sortByTypeIdIndex([Lcom/google/dexmaker/dx/dex/file/AnnotationItem;)V

    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->annotations:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeTo0(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 134
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result p1

    .line 135
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    array-length v0, v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 138
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->offsetString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " annotation set"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v2, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 139
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "  size: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v1, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 142
    :cond_0
    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    :goto_0
    if-ge v2, v0, :cond_2

    .line 145
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    aget-object v3, v3, v2

    .line 146
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->getAbsoluteOffset()I

    move-result v3

    if-eqz p1, :cond_1

    .line 149
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "  entries["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v1, v4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 151
    iget-object v4, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->items:[Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    aget-object v4, v4, v2

    const-string v5, "    "

    invoke-virtual {v4, p2, v5}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotateTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Ljava/lang/String;)V

    .line 154
    :cond_1
    invoke-interface {p2, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
