.class public final Lcom/google/dexmaker/dx/dex/code/form/Form5rc;
.super Lcom/google/dexmaker/dx/dex/code/InsnFormat;
.source "Form5rc.java"


# static fields
.field public static final THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;-><init>()V

    return-void
.end method


# virtual methods
.method public codeSize()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public insnArgString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    invoke-static {v1}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->regRangeString(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->cstString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public insnCommentString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    .line 55
    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->cstComment(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public isCompatible(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z
    .locals 3

    .line 70
    sget-boolean v0, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->ALLOW_EXTENDED_OPCODES:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 74
    :cond_0
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    if-nez v0, :cond_1

    return v1

    .line 78
    :cond_1
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    .line 79
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v0

    .line 81
    instance-of v2, v0, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    if-nez v2, :cond_2

    instance-of v0, v0, Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-nez v0, :cond_2

    return v1

    .line 86
    :cond_2
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    .line 89
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->isRegListSequential(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->unsignedFitsInShort(I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->getWordCount()I

    move-result p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->unsignedFitsInShort(I)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method public writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 4

    .line 98
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 99
    move-object v1, p2

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getIndex()I

    move-result v1

    .line 100
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    .line 101
    :goto_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->getWordCount()I

    move-result v0

    .line 103
    invoke-static {p2}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->opcodeUnit(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)S

    move-result p2

    int-to-short v0, v0

    int-to-short v2, v3

    invoke-static {p1, p2, v1, v0, v2}, Lcom/google/dexmaker/dx/dex/code/form/Form5rc;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SISS)V

    return-void
.end method
