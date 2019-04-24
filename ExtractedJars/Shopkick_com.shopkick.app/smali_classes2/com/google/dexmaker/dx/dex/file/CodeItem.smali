.class public final Lcom/google/dexmaker/dx/dex/file/CodeItem;
.super Lcom/google/dexmaker/dx/dex/file/OffsettedItem;
.source "CodeItem.java"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final HEADER_SIZE:I = 0x10


# instance fields
.field private catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

.field private final code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

.field private debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

.field private final isStatic:Z

.field private final ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

.field private final throwsList:Lcom/google/dexmaker/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/code/DalvCode;ZLcom/google/dexmaker/dx/rop/type/TypeList;)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, -0x1

    .line 87
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;-><init>(II)V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_0

    .line 101
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    .line 102
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    .line 103
    iput-boolean p3, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->isStatic:Z

    .line 104
    iput-object p4, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->throwsList:Lcom/google/dexmaker/dx/rop/type/TypeList;

    const/4 p1, 0x0

    .line 105
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    .line 106
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    return-void

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "throwsList == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 94
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "code == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ref == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getInsSize()I
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    iget-boolean v1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->isStatic:Z

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->getParameterWordCount(Z)I

    move-result v0

    return v0
.end method

.method private getOutsSize()I
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->getOutsSize()I

    move-result v0

    return v0
.end method

.method private getRegistersSize()I
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->getRegistersSize()I

    move-result v0

    return v0
.end method

.method private writeCodes(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 298
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object p1

    .line 301
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 303
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "...while writing instructions for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 6

    .line 117
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getByteData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object v0

    .line 118
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object v1

    .line 120
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->hasPositions()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->hasLocals()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 121
    :cond_0
    new-instance v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    iget-boolean v4, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->isStatic:Z

    iget-object v5, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-direct {v2, v3, v4, v5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;-><init>(Lcom/google/dexmaker/dx/dex/code/DalvCode;ZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;)V

    iput-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    .line 122
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->add(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)V

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->hasAnyCatches()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getCatchTypes()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/type/Type;

    .line 127
    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    goto :goto_0

    .line 129
    :cond_2
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;-><init>(Lcom/google/dexmaker/dx/dex/code/DalvCode;)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    .line 132
    :cond_3
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsnConstants()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 133
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->internIfAppropriate(Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;Z)V
    .locals 3

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object v0

    .line 169
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "regs: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->getRegistersSize()I

    move-result v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; ins: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->getInsSize()I

    move-result v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; outs: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->getOutsSize()I

    move-result v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->debugPrint(Ljava/io/Writer;Ljava/lang/String;Z)V

    .line 175
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 177
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    if-eqz v0, :cond_0

    .line 178
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "catches"

    .line 179
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    invoke-virtual {v0, p1, p3}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    if-eqz v0, :cond_1

    .line 184
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "debug info"

    .line 185
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 186
    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    invoke-virtual {p2, p1, p3}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public getRef()Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    return-object v0
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 112
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method

.method protected place0(Lcom/google/dexmaker/dx/dex/file/Section;I)V
    .locals 1

    .line 193
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/Section;->getFile()Lcom/google/dexmaker/dx/dex/file/DexFile;

    move-result-object p1

    .line 200
    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    new-instance v0, Lcom/google/dexmaker/dx/dex/file/CodeItem$1;

    invoke-direct {v0, p0, p1}, Lcom/google/dexmaker/dx/dex/file/CodeItem$1;-><init>(Lcom/google/dexmaker/dx/dex/file/CodeItem;Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    invoke-virtual {p2, v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->assignIndices(Lcom/google/dexmaker/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    .line 210
    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    if-eqz p2, :cond_0

    .line 211
    invoke-virtual {p2, p1}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->encode(Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    .line 212
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->writeSize()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 223
    :goto_0
    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->codeSize()I

    move-result p2

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    add-int/lit8 p2, p2, 0x1

    :cond_1
    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x10

    add-int/2addr p2, p1

    .line 228
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->setWriteSize(I)V

    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CodeItem{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeTo0(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 13

    .line 234
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v0

    .line 235
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->getRegistersSize()I

    move-result v1

    .line 236
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->getOutsSize()I

    move-result v2

    .line 237
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->getInsSize()I

    move-result v3

    .line 238
    iget-object v4, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->code:Lcom/google/dexmaker/dx/dex/code/DalvCode;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->codeSize()I

    move-result v4

    and-int/lit8 v5, v4, 0x1

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v6

    .line 240
    :goto_0
    iget-object v7, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    if-nez v7, :cond_1

    move v7, v6

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->triesSize()I

    move-result v7

    .line 241
    :goto_1
    iget-object v8, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    if-nez v8, :cond_2

    move v8, v6

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->getAbsoluteOffset()I

    move-result v8

    :goto_2
    const/4 v9, 0x2

    if-eqz v0, :cond_3

    .line 244
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->offsetString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x20

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v11, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->ref:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v11}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v6, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 245
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "  registers_size: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v9, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 246
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "  ins_size:       "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v9, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 247
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "  outs_size:      "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v9, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 248
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "  tries_size:     "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v9, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 249
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "  debug_off:      "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x4

    invoke-interface {p2, v11, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 250
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "  insns_size:     "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v11, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 253
    iget-object v10, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->throwsList:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-interface {v10}, Lcom/google/dexmaker/dx/rop/type/TypeList;->size()I

    move-result v10

    if-eqz v10, :cond_3

    .line 255
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "  throws "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->throwsList:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-static {v11}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->toHuman(Lcom/google/dexmaker/dx/rop/type/TypeList;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v6, v10}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 259
    :cond_3
    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 260
    invoke-interface {p2, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 261
    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 262
    invoke-interface {p2, v7}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 263
    invoke-interface {p2, v8}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 264
    invoke-interface {p2, v4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 266
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->writeCodes(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    .line 268
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    if-eqz v1, :cond_6

    if-eqz v5, :cond_5

    if-eqz v0, :cond_4

    const-string v1, "  padding: 0"

    .line 271
    invoke-interface {p2, v9, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 273
    :cond_4
    invoke-interface {p2, v6}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 276
    :cond_5
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->catches:Lcom/google/dexmaker/dx/dex/file/CatchStructs;

    invoke-virtual {v1, p1, p2}, Lcom/google/dexmaker/dx/dex/file/CatchStructs;->writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V

    :cond_6
    if-eqz v0, :cond_7

    .line 284
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    if-eqz v0, :cond_7

    const-string v0, "  debug info"

    .line 285
    invoke-interface {p2, v6, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 286
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugInfo:Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;

    const-string v1, "    "

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoItem;->annotateTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;Ljava/lang/String;)V

    :cond_7
    return-void
.end method
