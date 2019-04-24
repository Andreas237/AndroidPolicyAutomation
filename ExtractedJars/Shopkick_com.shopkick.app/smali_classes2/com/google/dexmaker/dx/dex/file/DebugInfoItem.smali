.class public Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;
.super Lcom/google/dexmaker/dx/dex/file/OffsettedItem;
.source "DebugInfoItem.java"


# static fields
.field private static final ALIGNMENT:I = 0x1

.field private static final ENABLE_ENCODER_SELF_CHECK:Z = false


# instance fields
.field private final code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

.field private encoded:[B

.field private final isStatic:Z

.field private final ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/code/DalvCode;ZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 45
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;-><init>(II)V

    if-eqz p1, :cond_0

    .line 51
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    .line 52
    iput-boolean p2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->isStatic:Z

    .line 53
    iput-object p3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "code == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private encode(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B
    .locals 0

    .line 142
    invoke-direct/range {p0 .. p5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encode0(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B

    move-result-object p1

    return-object p1
.end method

.method private encode0(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B
    .locals 9

    .line 173
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getPositions()Lcom/google/dexmaker/dx/dex/code/PositionList;

    move-result-object v2

    .line 174
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getLocals()Lcom/google/dexmaker/dx/dex/code/LocalList;

    move-result-object v3

    .line 175
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object v0

    .line 176
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->codeSize()I

    move-result v5

    .line 177
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->getRegistersSize()I

    move-result v6

    .line 179
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;

    iget-boolean v7, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->isStatic:Z

    iget-object v8, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    move-object v1, v0

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;-><init>(Lcom/google/dexmaker/dx/dex/code/PositionList;Lcom/google/dexmaker/dx/dex/code/LocalList;Lcom/google/dexmaker/dx/dex/file/DexFile;IIZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;)V

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    .line 186
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->convert()[B

    move-result-object p1

    goto :goto_0

    .line 188
    :cond_0
    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoEncoder;->convertAndAnnotate(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 0

    return-void
.end method

.method public annotateTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Ljava/lang/String;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v4, p2

    .line 99
    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encode(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B

    return-void
.end method

.method public debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p1

    .line 109
    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encode(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B

    return-void
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 59
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_DEBUG_INFO_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method

.method protected place0(Lcom/google/dexmaker/dx/dex/file/Section;I)V
    .locals 6

    .line 74
    :try_start_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/Section;->getFile()Lcom/google/dexmaker/dx/dex/file/DexFile;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encode(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encoded:[B

    .line 75
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encoded:[B

    array-length p1, p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->setWriteSize(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "...while placing debug info for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    move-result-object p1

    throw p1
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 85
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected writeTo0(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 7

    .line 115
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->offsetString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " debug info"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 122
    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encode(Lcom/google/dexmaker/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/PrintWriter;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Z)[B

    .line 125
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->encoded:[B

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->write([B)V

    return-void
.end method
