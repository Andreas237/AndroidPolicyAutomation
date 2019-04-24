.class public final Lcom/google/dexmaker/dx/dex/file/AnnotationItem;
.super Lcom/google/dexmaker/dx/dex/file/OffsettedItem;
.source "AnnotationItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/dex/file/AnnotationItem$TypeIdSorter;
    }
.end annotation


# static fields
.field private static final ALIGNMENT:I = 0x1

.field private static final TYPE_ID_SORTER:Lcom/google/dexmaker/dx/dex/file/AnnotationItem$TypeIdSorter;

.field private static final VISIBILITY_BUILD:I = 0x0

.field private static final VISIBILITY_RUNTIME:I = 0x1

.field private static final VISIBILITY_SYSTEM:I = 0x2


# instance fields
.field private final annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

.field private encodedForm:[B

.field private type:Lcom/google/dexmaker/dx/dex/file/TypeIdItem;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 48
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$TypeIdSorter;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$TypeIdSorter;-><init>(Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->TYPE_ID_SORTER:Lcom/google/dexmaker/dx/dex/file/AnnotationItem$TypeIdSorter;

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 105
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;-><init>(II)V

    if-eqz p1, :cond_0

    .line 111
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    const/4 p1, 0x0

    .line 112
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->type:Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    .line 113
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->encodedForm:[B

    return-void

    .line 108
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "annotation == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/dex/file/AnnotationItem;)Lcom/google/dexmaker/dx/dex/file/TypeIdItem;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->type:Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    return-object p0
.end method

.method public static sortByTypeIdIndex([Lcom/google/dexmaker/dx/dex/file/AnnotationItem;)V
    .locals 1

    .line 92
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->TYPE_ID_SORTER:Lcom/google/dexmaker/dx/dex/file/AnnotationItem$TypeIdSorter;

    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    .line 144
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object v0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->getType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstType;)Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->type:Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    .line 145
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-static {p1, v0}, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;->addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V

    return-void
.end method

.method public annotateTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Ljava/lang/String;)V
    .locals 5

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "visibility: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->getVisibility()Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "type: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->getType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->getNameValuePairs()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    .line 177
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v3

    .line 178
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->getValue()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v2

    .line 180
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;->constantToHuman(Lcom/google/dexmaker/dx/rop/cst/Constant;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected compareTo0(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)I
    .locals 1

    .line 131
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;

    .line 133
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->hashCode()I

    move-result v0

    return v0
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 119
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method

.method protected place0(Lcom/google/dexmaker/dx/dex/file/Section;I)V
    .locals 2

    .line 153
    new-instance p2, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-direct {p2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    .line 154
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/Section;->getFile()Lcom/google/dexmaker/dx/dex/file/DexFile;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;-><init>(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    .line 156
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;->writeAnnotation(Lcom/google/dexmaker/dx/rop/annotation/Annotation;Z)V

    .line 157
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->encodedForm:[B

    .line 160
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->encodedForm:[B

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->setWriteSize(I)V

    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeTo0(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 188
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v0

    .line 189
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->getVisibility()Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    .line 192
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->offsetString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " annotation"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v2, v4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 193
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "  visibility: VISBILITY_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v3, v4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 196
    :cond_0
    sget-object v4, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;->$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->ordinal()I

    move-result v1

    aget v1, v4, v1

    packed-switch v1, :pswitch_data_0

    .line 202
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 v1, 0x2

    .line 199
    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeByte(I)V

    goto :goto_0

    .line 198
    :pswitch_1
    invoke-interface {p2, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeByte(I)V

    goto :goto_0

    .line 197
    :pswitch_2
    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeByte(I)V

    :goto_0
    if-eqz v0, :cond_1

    .line 212
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;

    invoke-direct {v0, p1, p2}, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;-><init>(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    .line 213
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->annotation:Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {v0, p1, v3}, Lcom/google/dexmaker/dx/dex/file/ValueEncoder;->writeAnnotation(Lcom/google/dexmaker/dx/rop/annotation/Annotation;Z)V

    goto :goto_1

    .line 215
    :cond_1
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem;->encodedForm:[B

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->write([B)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
