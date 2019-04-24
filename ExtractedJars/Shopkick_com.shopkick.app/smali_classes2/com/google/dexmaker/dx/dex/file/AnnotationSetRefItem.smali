.class public final Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;
.super Lcom/google/dexmaker/dx/dex/file/OffsettedItem;
.source "AnnotationSetRefItem.java"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final WRITE_SIZE:I = 0x4


# instance fields
.field private annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;)V
    .locals 1

    const/4 v0, 0x4

    .line 41
    invoke-direct {p0, v0, v0}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;-><init>(II)V

    if-eqz p1, :cond_0

    .line 47
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    return-void

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "annotations == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 1

    .line 58
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getWordData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object p1

    .line 60
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->intern(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)Lcom/google/dexmaker/dx/dex/file/OffsettedItem;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    return-void
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 53
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeTo0(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 3

    .line 72
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetRefItem;->annotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->getAbsoluteOffset()I

    move-result p1

    .line 74
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "  annotations_off: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 78
    :cond_0
    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    return-void
.end method
