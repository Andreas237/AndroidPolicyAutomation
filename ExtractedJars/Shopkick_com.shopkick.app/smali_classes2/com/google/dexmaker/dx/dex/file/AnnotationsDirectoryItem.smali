.class public final Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;
.super Lcom/google/dexmaker/dx/dex/file/OffsettedItem;
.source "AnnotationsDirectoryItem.java"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final ELEMENT_SIZE:I = 0x8

.field private static final HEADER_SIZE:I = 0x10


# instance fields
.field private classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

.field private fieldAnnotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;",
            ">;"
        }
    .end annotation
.end field

.field private methodAnnotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;",
            ">;"
        }
    .end annotation
.end field

.field private parameterAnnotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, -0x1

    .line 59
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;-><init>(II)V

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    .line 62
    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 63
    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 64
    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    return-void
.end method

.method private static listSize(Ljava/util/ArrayList;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "*>;)I"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 350
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    .line 241
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getWordData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object v0

    .line 243
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    if-eqz v1, :cond_0

    .line 244
    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->intern(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)Lcom/google/dexmaker/dx/dex/file/OffsettedItem;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 248
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    .line 249
    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    goto :goto_0

    .line 253
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 254
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;

    .line 255
    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;->addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    goto :goto_1

    .line 259
    :cond_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 260
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    .line 261
    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public addFieldAnnotations(Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V
    .locals 3

    .line 158
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    new-instance v2, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-direct {v2, p2}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;-><init>(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    invoke-direct {v1, p1, v2}, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMethodAnnotations(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V
    .locals 3

    .line 174
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;

    new-instance v2, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-direct {v2, p2}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;-><init>(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    invoke-direct {v1, p1, v2}, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addParameterAnnotations(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;)V
    .locals 2

    .line 190
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    invoke-direct {v1, p1, p2}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public compareTo0(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)I
    .locals 1

    .line 121
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->isInternable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;

    .line 127
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->compareTo(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)I

    move-result p1

    return p1

    .line 122
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "uninternable instance"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method debugPrint(Ljava/io/PrintWriter;)V
    .locals 4

    .line 360
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    if-eqz v0, :cond_0

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  class annotations: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const-string v0, "  field annotations:"

    .line 365
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 371
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    const-string v0, "  method annotations:"

    .line 372
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 373
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;

    .line 374
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_1

    .line 378
    :cond_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    const-string v0, "  parameter annotations:"

    .line 379
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 380
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    .line 381
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public getMethodAnnotations(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;)Lcom/google/dexmaker/dx/rop/annotation/Annotations;
    .locals 4

    .line 205
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 209
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;

    .line 210
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;->getMethod()Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 211
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;->getAnnotations()Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method public getParameterAnnotations(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;)Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;
    .locals 4

    .line 226
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 230
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    .line 231
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->getMethod()Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 232
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->getAnnotationsList()Lcom/google/dexmaker/dx/rop/annotation/AnnotationsList;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method public hashCode()I
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 108
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isInternable()Z
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 70
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method

.method protected place0(Lcom/google/dexmaker/dx/dex/file/Section;I)V
    .locals 0

    .line 277
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    move-result p1

    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    invoke-static {p2}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    move-result p2

    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    invoke-static {p2}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    move-result p2

    add-int/2addr p1, p2

    mul-int/lit8 p1, p1, 0x8

    add-int/lit8 p1, p1, 0x10

    .line 279
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->setWriteSize(I)V

    return-void
.end method

.method public setClassAnnotations(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 142
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    if-nez v0, :cond_0

    .line 147
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-direct {v0, p1}, Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;-><init>(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    return-void

    .line 143
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "class annotations already set"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 139
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "annotations == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 269
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected writeTo0(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 9

    .line 285
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v0

    .line 286
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/google/dexmaker/dx/dex/file/AnnotationSetItem;

    invoke-static {v1}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)I

    move-result v1

    .line 287
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    move-result v2

    .line 288
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    invoke-static {v3}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    move-result v3

    .line 289
    iget-object v4, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    invoke-static {v4}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    .line 292
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->offsetString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " annotations directory"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p2, v5, v6}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 293
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "  class_annotations_off: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x4

    invoke-interface {p2, v7, v6}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 294
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "  fields_size:           "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p2, v7, v6}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 296
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "  methods_size:          "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p2, v7, v6}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 298
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "  parameters_size:       "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p2, v7, v6}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 302
    :cond_0
    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 303
    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 304
    invoke-interface {p2, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 305
    invoke-interface {p2, v4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    if-eqz v2, :cond_2

    .line 308
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz v0, :cond_1

    const-string v1, "  fields:"

    .line 310
    invoke-interface {p2, v5, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 312
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;

    .line 313
    invoke-virtual {v2, p1, p2}, Lcom/google/dexmaker/dx/dex/file/FieldAnnotationStruct;->writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_4

    .line 318
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz v0, :cond_3

    const-string v1, "  methods:"

    .line 320
    invoke-interface {p2, v5, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 322
    :cond_3
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;

    .line 323
    invoke-virtual {v2, p1, p2}, Lcom/google/dexmaker/dx/dex/file/MethodAnnotationStruct;->writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    goto :goto_1

    :cond_4
    if-eqz v4, :cond_6

    .line 328
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz v0, :cond_5

    const-string v0, "  parameters:"

    .line 330
    invoke-interface {p2, v5, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 332
    :cond_5
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;

    .line 333
    invoke-virtual {v1, p1, p2}, Lcom/google/dexmaker/dx/dex/file/ParameterAnnotationStruct;->writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    goto :goto_2

    :cond_6
    return-void
.end method
