.class public final Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;
.super Lcom/google/dexmaker/dx/rop/code/CstInsn;
.source "ThrowingCstInsn.java"


# instance fields
.field private final catches:Lcom/google/dexmaker/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    .line 45
    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/CstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 47
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 p2, 0x6

    if-ne p1, p2, :cond_1

    if-eqz p4, :cond_0

    .line 55
    iput-object p4, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    return-void

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "catches == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus branchingness"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 78
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;->visitThrowingCstInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;)V

    return-void
.end method

.method public getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    return-object v0
.end method

.method public getInlineString()Ljava/lang/String;
    .locals 3

    .line 61
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/Constant;->toHuman()Ljava/lang/String;

    move-result-object v1

    .line 63
    instance-of v2, v0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    if-eqz v2, :cond_0

    .line 64
    check-cast v0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    move-result-object v1

    .line 66
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->toCatchString(Lcom/google/dexmaker/dx/rop/type/TypeList;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withAddedCatch(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 7

    .line 84
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-interface {v0, p1}, Lcom/google/dexmaker/dx/rop/type/TypeList;->withAddedType(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object v6
.end method

.method public withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 6

    .line 103
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    iget-object v4, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v5

    move-object v0, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object p1
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 7

    .line 92
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object v6
.end method
