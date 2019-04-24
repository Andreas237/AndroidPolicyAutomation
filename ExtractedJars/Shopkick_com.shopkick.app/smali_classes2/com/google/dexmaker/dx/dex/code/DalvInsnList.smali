.class public final Lcom/google/dexmaker/dx/dex/code/DalvInsnList;
.super Lcom/google/dexmaker/dx/util/FixedSizeList;
.source "DalvInsnList.java"


# instance fields
.field private final regCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/FixedSizeList;-><init>(I)V

    .line 76
    iput p2, p0, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->regCount:I

    return-void
.end method

.method public static makeImmutable(Ljava/util/ArrayList;I)Lcom/google/dexmaker/dx/dex/code/DalvInsnList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/DalvInsn;",
            ">;I)",
            "Lcom/google/dexmaker/dx/dex/code/DalvInsnList;"
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 59
    new-instance v1, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    invoke-direct {v1, v0, p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;-><init>(II)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    .line 62
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    invoke-virtual {v1, p1, v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->set(ILcom/google/dexmaker/dx/dex/code/DalvInsn;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->setImmutable()V

    return-object v1
.end method


# virtual methods
.method public codeSize()I
    .locals 1

    .line 109
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 115
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getNextAddress()I

    move-result v0

    return v0
.end method

.method public debugPrint(Ljava/io/OutputStream;Ljava/lang/String;Z)V
    .locals 1

    .line 260
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 261
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->debugPrint(Ljava/io/Writer;Ljava/lang/String;Z)V

    .line 264
    :try_start_0
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 266
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public debugPrint(Ljava/io/Writer;Ljava/lang/String;Z)V
    .locals 4

    .line 226
    new-instance v0, Lcom/google/dexmaker/dx/util/IndentingWriter;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2}, Lcom/google/dexmaker/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;ILjava/lang/String;)V

    .line 227
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->size()I

    move-result p1

    move p2, v1

    :goto_0
    if-ge p2, p1, :cond_3

    .line 231
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get0(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 234
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->codeSize()I

    move-result v3

    if-nez v3, :cond_1

    if-eqz p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const-string v3, ""

    .line 235
    invoke-virtual {v2, v3, v1, p3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->listingString(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v2

    :goto_2
    if-eqz v2, :cond_2

    .line 241
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/util/IndentingWriter;->write(Ljava/lang/String;)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 245
    :cond_3
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IndentingWriter;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 247
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public get(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 0

    .line 88
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get0(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    return-object p1
.end method

.method public getOutsSize()I
    .locals 7

    .line 188
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_4

    .line 192
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get0(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 194
    instance-of v5, v4, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    if-nez v5, :cond_0

    goto :goto_2

    .line 198
    :cond_0
    move-object v5, v4

    check-cast v5, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v5

    .line 200
    instance-of v6, v5, Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;

    if-nez v6, :cond_1

    goto :goto_2

    .line 204
    :cond_1
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/Dop;->getFamily()I

    move-result v4

    const/16 v6, 0x71

    if-ne v4, v6, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    move v4, v1

    .line 206
    :goto_1
    check-cast v5, Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;

    invoke-virtual {v5, v4}, Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;->getParameterWordCount(Z)I

    move-result v4

    if-le v4, v3, :cond_3

    move v3, v4

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v3
.end method

.method public getRegistersSize()I
    .locals 1

    .line 177
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->regCount:I

    return v0
.end method

.method public set(ILcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 0

    .line 98
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->set0(ILjava/lang/Object;)V

    return-void
.end method

.method public writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 10

    .line 126
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->getCursor()I

    move-result v0

    .line 127
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->size()I

    move-result v1

    .line 129
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    .line 130
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->isVerbose()Z

    move-result v2

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_4

    .line 133
    invoke-virtual {p0, v4}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get0(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 134
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->codeSize()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    if-nez v6, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const-string v7, "  "

    .line 138
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->getAnnotationWidth()I

    move-result v8

    const/4 v9, 0x1

    invoke-virtual {v5, v7, v8, v9}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->listingString(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v5

    :goto_2
    if-eqz v5, :cond_2

    .line 145
    invoke-interface {p1, v6, v5}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    goto :goto_3

    :cond_2
    if-eqz v6, :cond_3

    const-string v5, ""

    .line 147
    invoke-interface {p1, v6, v5}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_4
    if-ge v3, v1, :cond_5

    .line 153
    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get0(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 155
    :try_start_0
    invoke-virtual {v2, p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "...while writing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    move-result-object p1

    throw p1

    .line 163
    :cond_5
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->getCursor()I

    move-result p1

    sub-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    .line 164
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->codeSize()I

    move-result v0

    if-ne p1, v0, :cond_6

    return-void

    .line 165
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "write length mismatch; expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->codeSize()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " but actually wrote "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
