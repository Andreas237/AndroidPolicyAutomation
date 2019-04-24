.class public final Lcom/google/dexmaker/dx/dex/code/form/Form21h;
.super Lcom/google/dexmaker/dx/dex/code/InsnFormat;
.source "Form21h.java"


# static fields
.field public static final THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/form/Form21h;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;-><init>()V

    return-void
.end method


# virtual methods
.method public codeSize()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public compatibleRegs(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/util/BitSet;
    .locals 2

    .line 103
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 104
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 106
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->unsignedFitsInByte(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public insnArgString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 3

    .line 48
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 49
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    .line 51
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

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->literalBitsString(Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public insnCommentString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 1

    .line 57
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    .line 58
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p2, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    const/16 p2, 0x20

    goto :goto_0

    :cond_0
    const/16 p2, 0x40

    :goto_0
    invoke-static {p1, p2}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->literalBitsComment(Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isCompatible(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z
    .locals 6

    .line 74
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 75
    instance-of v1, p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_5

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    invoke-static {v1}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->unsignedFitsInByte(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    .line 82
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    .line 84
    instance-of v1, p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    if-nez v1, :cond_1

    return v2

    .line 88
    :cond_1
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    .line 91
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 92
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getIntBits()I

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    move v2, v3

    :cond_2
    return v2

    .line 95
    :cond_3
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getLongBits()J

    move-result-wide v0

    const-wide v4, 0xffffffffffffL

    and-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-nez p1, :cond_4

    move v2, v3

    :cond_4
    return v2

    :cond_5
    :goto_0
    return v2
.end method

.method public writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 5

    .line 113
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 114
    move-object v1, p2

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    const/4 v2, 0x0

    .line 118
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 119
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getIntBits()I

    move-result v1

    ushr-int/lit8 v1, v1, 0x10

    int-to-short v1, v1

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getLongBits()J

    move-result-wide v3

    const/16 v1, 0x30

    ushr-long/2addr v3, v1

    long-to-int v1, v3

    int-to-short v1, v1

    .line 124
    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-static {p2, v0}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->opcodeUnit(Lcom/google/dexmaker/dx/dex/code/DalvInsn;I)S

    move-result p2

    invoke-static {p1, p2, v1}, Lcom/google/dexmaker/dx/dex/code/form/Form21h;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SS)V

    return-void
.end method
