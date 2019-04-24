.class public final Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;
.super Ljava/lang/Object;
.source "DebugInfoEncoder.java"


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private address:I

.field private annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

.field private final codeSize:I

.field private debugPrint:Ljava/io/PrintWriter;

.field private final desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

.field private final file:Lcom/google/dexmaker/dx/dex/file/DexFile;

.field private final isStatic:Z

.field private final lastEntryForReg:[Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

.field private line:I

.field private final locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

.field private final output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

.field private final positions:Lcom/google/dexmaker/dx/dex/code/PositionList;

.field private prefix:Ljava/lang/String;

.field private final regSize:I

.field private shouldConsume:Z


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/code/PositionList;Lcom/google/dexmaker/dx/dex/code/LocalList;Lcom/google/dexmaker/dx/dex/file/DexFile;IIZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;)V
    .locals 1

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 73
    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    const/4 v0, 0x1

    .line 76
    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    .line 111
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->positions:Lcom/google/dexmaker/dx/dex/code/PositionList;

    .line 112
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    .line 113
    iput-object p3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->file:Lcom/google/dexmaker/dx/dex/file/DexFile;

    .line 114
    invoke-virtual {p7}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->getPrototype()Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    .line 115
    iput-boolean p6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->isStatic:Z

    .line 116
    iput p4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->codeSize:I

    .line 117
    iput p5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->regSize:I

    .line 119
    new-instance p1, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-direct {p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    .line 120
    new-array p1, p5, [Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    return-void
.end method

.method private annotate(ILjava/lang/String;)V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->prefix:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->prefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-eqz v0, :cond_2

    .line 136
    iget-boolean v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->shouldConsume:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1, p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 139
    :cond_2
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz p1, :cond_3

    .line 140
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private buildSortedPositions()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;",
            ">;"
        }
    .end annotation

    .line 487
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->positions:Lcom/google/dexmaker/dx/dex/code/PositionList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/PositionList;->size()I

    move-result v0

    .line 488
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v1, v0, :cond_1

    .line 491
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->positions:Lcom/google/dexmaker/dx/dex/code/PositionList;

    invoke-virtual {v3, v1}, Lcom/google/dexmaker/dx/dex/code/PositionList;->get(I)Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 495
    :cond_1
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder$1;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder$1;-><init>(Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v2
.end method

.method private static computeOpcode(II)I
    .locals 2

    const/4 v0, -0x4

    if-lt p0, v0, :cond_0

    const/16 v1, 0xa

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    mul-int/lit8 p1, p1, 0xf

    add-int/2addr p0, p1

    add-int/2addr p0, v1

    return p0

    .line 836
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Parameter out of range"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private convert0()[B
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 194
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->buildSortedPositions()Ljava/util/ArrayList;

    move-result-object v0

    .line 195
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->extractMethodArguments()Ljava/util/ArrayList;

    move-result-object v1

    .line 197
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitHeader(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 200
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 202
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v1, :cond_1

    :cond_0
    const-string v1, "%04x: prologue end"

    const/4 v3, 0x1

    .line 203
    new-array v4, v3, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 206
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 207
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result v3

    move v4, v2

    .line 219
    :goto_0
    invoke-direct {p0, v2}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitLocalsAtAddress(I)I

    move-result v2

    .line 220
    invoke-direct {p0, v4, v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitPositionsAtAddress(ILjava/util/ArrayList;)I

    move-result v4

    const v5, 0x7fffffff

    if-ge v2, v3, :cond_2

    .line 231
    iget-object v6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-virtual {v6, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v6

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    if-ge v4, v1, :cond_3

    .line 235
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getAddress()I

    move-result v7

    goto :goto_2

    :cond_3
    move v7, v5

    .line 238
    :goto_2
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ne v8, v5, :cond_4

    goto :goto_3

    .line 249
    :cond_4
    iget v9, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->codeSize:I

    if-ne v8, v9, :cond_5

    if-ne v6, v5, :cond_5

    if-ne v7, v5, :cond_5

    .line 263
    :goto_3
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitEndSequence()V

    .line 265
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    move-result-object v0

    return-object v0

    :cond_5
    if-ne v8, v7, :cond_6

    add-int/lit8 v5, v4, 0x1

    .line 257
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    invoke-direct {p0, v4}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitPosition(Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;)V

    move v4, v5

    goto :goto_0

    .line 259
    :cond_6
    iget v5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    sub-int/2addr v8, v5

    invoke-direct {p0, v8}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitAdvancePc(I)V

    goto :goto_0
.end method

.method private emitAdvanceLine(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 851
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v0

    .line 853
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 854
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeSleb128(I)I

    .line 855
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    .line 857
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz p1, :cond_1

    .line 858
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result p1

    sub-int/2addr p1, v0

    const-string v0, "line = %d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private emitAdvancePc(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 875
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v0

    .line 877
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 878
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 879
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    .line 881
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz p1, :cond_1

    .line 882
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result p1

    sub-int/2addr p1, v0

    const-string v0, "%04x: advance pc"

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private emitEndSequence()V
    .locals 2

    .line 914
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 916
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    const-string v1, "end sequence"

    .line 917
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private emitHeader(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 371
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    .line 372
    :goto_1
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v3

    .line 375
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 376
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    .line 377
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->getLine()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    .line 379
    :cond_2
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    iget v4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    invoke-virtual {p1, v4}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    if-eqz v0, :cond_3

    .line 382
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result p1

    sub-int/2addr p1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "line_start: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 385
    :cond_3
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->getParamBase()I

    move-result p1

    .line 387
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/type/Prototype;->getParameterTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v3

    .line 388
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->size()I

    move-result v4

    .line 394
    iget-boolean v5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->isStatic:Z

    if-nez v5, :cond_6

    .line 395
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    .line 396
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v7

    if-ne p1, v7, :cond_4

    .line 397
    iget-object v5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    aput-object v6, v5, p1

    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 405
    :cond_6
    iget-object v5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v5

    .line 406
    iget-object v6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v6, v4}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    if-eqz v0, :cond_7

    .line 409
    iget-object v6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v6

    sub-int/2addr v6, v5

    const-string v5, "parameters_size: %04x"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v2, v1

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v6, v2}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_7
    move v2, p1

    move p1, v1

    :goto_2
    if-ge p1, v4, :cond_f

    .line 418
    invoke-virtual {v3, p1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->get(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v5

    .line 421
    iget-object v6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v6

    .line 423
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    .line 424
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v10

    if-ne v2, v10, :cond_8

    .line 427
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v7

    if-eqz v7, :cond_9

    .line 432
    invoke-direct {p0, v9}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    goto :goto_3

    .line 434
    :cond_9
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    .line 436
    :goto_3
    iget-object v7, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    aput-object v8, v7, v2

    goto :goto_4

    :cond_a
    move-object v8, v9

    :goto_4
    if-nez v8, :cond_b

    .line 448
    invoke-direct {p0, v9}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    :cond_b
    if-eqz v0, :cond_e

    if-eqz v8, :cond_d

    .line 452
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v7

    if-eqz v7, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :cond_d
    :goto_5
    const-string v7, "<unnamed>"

    .line 455
    :goto_6
    iget-object v8, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v8}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v8

    sub-int/2addr v8, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "parameter "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v7, "v"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v8, v6}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 460
    :cond_e
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/type/Type;->getCategory()I

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_2

    .line 468
    :cond_f
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    array-length p2, p1

    :goto_7
    if-ge v1, p2, :cond_12

    aget-object v0, p1, v1

    if-nez v0, :cond_10

    goto :goto_8

    .line 473
    :cond_10
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v2

    if-eqz v2, :cond_11

    .line 476
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitLocalStartExtended(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V

    :cond_11
    :goto_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_12
    return-void
.end method

.method private emitLocalEnd(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 748
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v0

    .line 750
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 751
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 753
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v1, :cond_1

    .line 754
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v1

    sub-int/2addr v1, v0

    const-string v0, "%04x: -local %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private emitLocalRestart(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 614
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v0

    .line 616
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 617
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitUnsignedLeb128(I)V

    .line 619
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v1, :cond_1

    .line 620
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v1

    sub-int/2addr v1, v0

    const-string v0, "%04x: +local restart %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private emitLocalStart(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 685
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 686
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitLocalStartExtended(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V

    return-void

    .line 690
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v0

    .line 692
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 694
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitUnsignedLeb128(I)V

    .line 695
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    .line 696
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitTypeIndex(Lcom/google/dexmaker/dx/rop/cst/CstType;)V

    .line 698
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v1, :cond_2

    .line 699
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v1

    sub-int/2addr v1, v0

    const-string v0, "%04x: +local %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method private emitLocalStartExtended(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 719
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v0

    .line 721
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 723
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitUnsignedLeb128(I)V

    .line 724
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    .line 725
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitTypeIndex(Lcom/google/dexmaker/dx/rop/cst/CstType;)V

    .line 726
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    .line 728
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz v1, :cond_1

    .line 729
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v1

    sub-int/2addr v1, v0

    const-string v0, "%04x: +localx %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private emitLocalsAtAddress(I)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 280
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result v0

    :goto_0
    if-ge p1, v0, :cond_5

    .line 285
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v1

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    if-ne v1, v2, :cond_5

    .line 286
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object p1

    .line 287
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v1

    .line 288
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    aget-object v4, v3, v1

    if-ne p1, v4, :cond_0

    goto :goto_1

    .line 300
    :cond_0
    aput-object p1, v3, v1

    .line 302
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v4, :cond_2

    .line 303
    invoke-virtual {p1, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->matches(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 309
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v1

    if-nez v1, :cond_1

    .line 316
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitLocalRestart(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V

    goto :goto_1

    .line 314
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 318
    :cond_2
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitLocalStart(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V

    goto :goto_1

    .line 330
    :cond_3
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getDisposition()Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    move-result-object v1

    sget-object v3, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    if-eq v1, v3, :cond_4

    .line 332
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitLocalEnd(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V

    :cond_4
    :goto_1
    move p1, v2

    goto :goto_0

    :cond_5
    return p1
.end method

.method private emitPosition(Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 775
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v0

    .line 776
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->getLine()I

    move-result v0

    .line 777
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getAddress()I

    move-result p1

    .line 781
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    sub-int/2addr v0, v1

    .line 782
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    sub-int/2addr p1, v1

    if-ltz p1, :cond_6

    const/4 v1, -0x4

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    .line 791
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitAdvanceLine(I)V

    move v0, v2

    .line 795
    :cond_1
    invoke-static {v0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->computeOpcode(II)I

    move-result v1

    and-int/lit16 v3, v1, -0x100

    if-lez v3, :cond_3

    .line 798
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitAdvancePc(I)V

    .line 800
    invoke-static {v0, v2}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->computeOpcode(II)I

    move-result v1

    and-int/lit16 p1, v1, -0x100

    if-lez p1, :cond_2

    .line 803
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitAdvanceLine(I)V

    .line 805
    invoke-static {v2, v2}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->computeOpcode(II)I

    move-result v1

    move p1, v2

    move v0, p1

    goto :goto_0

    :cond_2
    move p1, v2

    .line 809
    :cond_3
    :goto_0
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v3, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 811
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    .line 812
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    .line 814
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    if-eqz p1, :cond_5

    :cond_4
    const-string p1, "%04x: line %d"

    const/4 v0, 0x2

    .line 815
    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->line:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    :cond_5
    return-void

    .line 785
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Position entries must be in ascending address order"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private emitPositionsAtAddress(ILjava/util/ArrayList;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 351
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge p1, v0, :cond_0

    .line 353
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getAddress()I

    move-result v1

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->address:I

    if-ne v1, v2, :cond_0

    add-int/lit8 v1, p1, 0x1

    .line 355
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->emitPosition(Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;)V

    move p1, v1

    goto :goto_0

    :cond_0
    return p1
.end method

.method private emitStringIndex(Lcom/google/dexmaker/dx/rop/cst/CstString;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 640
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->file:Lcom/google/dexmaker/dx/dex/file/DexFile;

    if-nez v0, :cond_0

    goto :goto_0

    .line 643
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getStringIds()Lcom/google/dexmaker/dx/dex/file/StringIdsSection;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstString;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    goto :goto_1

    .line 641
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    :goto_1
    return-void
.end method

.method private emitTypeIndex(Lcom/google/dexmaker/dx/rop/cst/CstType;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 661
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->file:Lcom/google/dexmaker/dx/dex/file/DexFile;

    if-nez v0, :cond_0

    goto :goto_0

    .line 664
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstType;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    goto :goto_1

    .line 662
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    :goto_1
    return-void
.end method

.method private emitUnsignedLeb128(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 906
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->output:Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    return-void

    .line 902
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Signed value where unsigned required: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private entryAnnotationString(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Ljava/lang/String;
    .locals 3

    .line 573
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "v"

    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 577
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 579
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "null"

    .line 581
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 583
    :cond_0
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 587
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "null"

    .line 589
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 591
    :cond_1
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    :goto_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 597
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 598
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private extractMethodArguments()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;",
            ">;"
        }
    .end annotation

    .line 528
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->getParameterTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 530
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->getParamBase()I

    move-result v1

    .line 531
    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->regSize:I

    sub-int/2addr v3, v1

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 532
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 535
    iget-object v5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->locals:Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-virtual {v5, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v5

    .line 536
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v6

    if-ge v6, v1, :cond_0

    goto :goto_1

    :cond_0
    sub-int/2addr v6, v1

    .line 543
    invoke-virtual {v2, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    .line 547
    :cond_1
    invoke-virtual {v2, v6}, Ljava/util/BitSet;->set(I)V

    .line 548
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 552
    :cond_2
    new-instance v1, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder$2;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder$2;-><init>(Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method private getParamBase()I
    .locals 2

    .line 515
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->regSize:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->getParameterTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->getWordCount()I

    move-result v1

    sub-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->isStatic:Z

    xor-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public convert()[B
    .locals 2

    .line 154
    :try_start_0
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->convert0()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "...while encoding debug info"

    .line 164
    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    move-result-object v0

    throw v0
.end method

.method public convertAndAnnotate(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->prefix:Ljava/lang/String;

    .line 184
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 185
    iput-object p3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/google/dexmaker/dx/util/AnnotatedOutput;

    .line 186
    iput-boolean p4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->shouldConsume:Z

    .line 188
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->convert()[B

    move-result-object p1

    return-object p1
.end method
