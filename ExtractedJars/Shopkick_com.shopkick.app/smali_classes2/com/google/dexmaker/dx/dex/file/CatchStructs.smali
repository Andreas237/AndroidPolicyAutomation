.class public final Lcom/google/dexmaker/dx/dex/file/CatchStructs;
.super Ljava/lang/Object;
.source "CatchStructs.java"


# static fields
.field private static final TRY_ITEM_WRITE_SIZE:I = 0x8


# instance fields
.field private final code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

.field private encodedHandlerHeaderSize:I

.field private encodedHandlers:[B

.field private handlerOffsets:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private table:Lcom/google/dexmaker/dx/dex/code/CatchTable;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/code/DalvCode;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    const/4 p1, 0x0

    .line 77
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    .line 78
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlers:[B

    const/4 v0, 0x0

    .line 79
    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlerHeaderSize:I

    .line 80
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    return-void
.end method

.method private static annotateAndConsumeHandlers(Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;IILjava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;->toHuman(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p4, :cond_0

    .line 310
    invoke-virtual {p4, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 313
    :cond_0
    invoke-interface {p5, p2, p0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    return-void
.end method

.method private annotateEntries(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    .line 232
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    const/4 v2, 0x0

    if-eqz v8, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_1

    const/4 v4, 0x6

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eqz v3, :cond_2

    const/4 v5, 0x2

    goto :goto_2

    :cond_2
    move v5, v2

    .line 237
    :goto_2
    iget-object v6, v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->size()I

    move-result v6

    .line 238
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "  "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v3, :cond_3

    .line 241
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v11, "tries:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v2, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    goto :goto_3

    .line 243
    :cond_3
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v11, "tries:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_3
    move v10, v2

    :goto_4
    if-ge v10, v6, :cond_5

    .line 247
    iget-object v11, v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {v11, v10}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->get(I)Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;

    move-result-object v11

    .line 248
    invoke-virtual {v11}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getHandlers()Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;

    move-result-object v12

    .line 249
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v14, "try "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getStart()I

    move-result v14

    invoke-static {v14}, Lcom/google/dexmaker/dx/util/Hex;->u2or4(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ".."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getEnd()I

    move-result v11

    invoke-static {v11}, Lcom/google/dexmaker/dx/util/Hex;->u2or4(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v13, ""

    .line 251
    invoke-virtual {v12, v9, v13}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;->toHuman(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v3, :cond_4

    .line 254
    invoke-interface {v8, v4, v11}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 255
    invoke-interface {v8, v5, v12}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    goto :goto_5

    .line 257
    :cond_4
    invoke-virtual {v7, v11}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 258
    invoke-virtual {v7, v12}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_5
    if-nez v3, :cond_6

    return-void

    .line 267
    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "handlers:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 268
    iget v1, v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlerHeaderSize:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "size: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    move-result v4

    invoke-static {v4}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v8, v1, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    const/4 v1, 0x0

    .line 275
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    invoke-virtual {v3}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 276
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;

    .line 277
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eqz v1, :cond_7

    sub-int v3, v12, v2

    move-object v4, v9

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    .line 280
    invoke-static/range {v1 .. v6}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->annotateAndConsumeHandlers(Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;IILjava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    :cond_7
    move-object v1, v11

    move v2, v12

    goto :goto_6

    .line 288
    :cond_8
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlers:[B

    array-length v3, v3

    sub-int/2addr v3, v2

    move-object v4, v9

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v6}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->annotateAndConsumeHandlers(Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;IILjava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    return-void
.end method

.method private finishProcessingIfNecessary()V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getCatches()Lcom/google/dexmaker/dx/dex/code/CatchTable;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    :cond_0
    return-void
.end method


# virtual methods
.method public debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, p2, p1, v0}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->annotateEntries(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    return-void
.end method

.method public encode(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 9

    .line 118
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 120
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object p1

    .line 121
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->size()I

    move-result v0

    .line 123
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    .line 130
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    iget-object v4, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {v4, v2}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->get(I)Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getHandlers()Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    const v2, 0xffff

    if-gt v0, v2, :cond_5

    .line 138
    new-instance v0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    .line 141
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    move-result v2

    iput v2, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlerHeaderSize:I

    .line 146
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 147
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;

    .line 148
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;->size()I

    move-result v5

    .line 149
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;->catchesAll()Z

    move-result v6

    .line 152
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v6, :cond_2

    add-int/lit8 v3, v5, -0x1

    neg-int v3, v3

    .line 156
    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeSleb128(I)I

    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 159
    :cond_2
    invoke-virtual {v0, v5}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeSleb128(I)I

    :goto_2
    move v3, v1

    :goto_3
    if-ge v3, v5, :cond_3

    .line 163
    invoke-virtual {v4, v3}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;->get(I)Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;

    move-result-object v7

    .line 164
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->getExceptionType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstType;)I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 166
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->getHandler()I

    move-result v7

    invoke-virtual {v0, v7}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    if-eqz v6, :cond_1

    .line 170
    invoke-virtual {v4, v5}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;->get(I)Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->getHandler()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    goto :goto_1

    .line 174
    :cond_4
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlers:[B

    return-void

    .line 134
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "too many catch handlers"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public triesSize()I
    .locals 1

    .line 98
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 99
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->size()I

    move-result v0

    return v0
.end method

.method public writeSize()I
    .locals 2

    .line 183
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->triesSize()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlers:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 194
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 196
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "  "

    const/4 v0, 0x0

    .line 197
    invoke-direct {p0, p1, v0, p2}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->annotateEntries(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    .line 200
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 202
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->table:Lcom/google/dexmaker/dx/dex/code/CatchTable;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/dex/code/CatchTable;->get(I)Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;

    move-result-object v1

    .line 203
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getStart()I

    move-result v2

    .line 204
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getEnd()I

    move-result v3

    sub-int v4, v3, v2

    const/high16 v5, 0x10000

    if-ge v4, v5, :cond_1

    .line 213
    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 214
    invoke-interface {p2, v4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 215
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CatchTable$Entry;->getHandlers()Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 208
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "bogus exception range: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 218
    :cond_2
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encodedHandlers:[B

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->write([B)V

    return-void
.end method
