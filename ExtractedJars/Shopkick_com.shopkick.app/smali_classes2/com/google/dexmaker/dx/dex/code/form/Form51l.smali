.class public final Lcom/google/dexmaker/dx/dex/code/form/Form51l;
.super Lcom/google/dexmaker/dx/dex/code/InsnFormat;
.source "Form51l.java"


# static fields
.field public static final THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/form/Form51l;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;-><init>()V

    return-void
.end method


# virtual methods
.method public codeSize()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public compatibleRegs(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/util/BitSet;
    .locals 2

    .line 87
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 88
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 90
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->unsignedFitsInByte(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public insnArgString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 3

    .line 49
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 50
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->literalBitsString(Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public insnCommentString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 0

    .line 58
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    const/16 p2, 0x40

    .line 59
    invoke-static {p1, p2}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->literalBitsComment(Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isCompatible(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z
    .locals 4

    .line 71
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 72
    instance-of v1, p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->unsignedFitsInByte(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    .line 79
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    .line 81
    instance-of p1, p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;

    return p1

    :cond_1
    :goto_0
    return v2
.end method

.method public writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 4

    .line 97
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 98
    move-object v1, p2

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;->getLongBits()J

    move-result-wide v1

    const/4 v3, 0x0

    .line 101
    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-static {p2, v0}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->opcodeUnit(Lcom/google/dexmaker/dx/dex/code/DalvInsn;I)S

    move-result p2

    invoke-static {p1, p2, v1, v2}, Lcom/google/dexmaker/dx/dex/code/form/Form51l;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SJ)V

    return-void
.end method
