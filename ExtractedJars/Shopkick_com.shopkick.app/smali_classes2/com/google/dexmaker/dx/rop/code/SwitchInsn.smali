.class public final Lcom/google/dexmaker/dx/rop/code/SwitchInsn;
.super Lcom/google/dexmaker/dx/rop/code/Insn;
.source "SwitchInsn.java"


# instance fields
.field private final cases:Lcom/google/dexmaker/dx/util/IntList;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/util/IntList;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/dexmaker/dx/rop/code/Insn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 45
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 p2, 0x5

    if-ne p1, p2, :cond_1

    if-eqz p5, :cond_0

    .line 53
    iput-object p5, p0, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->cases:Lcom/google/dexmaker/dx/util/IntList;

    return-void

    .line 50
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "cases == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus branchingness"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 71
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;->visitSwitchInsn(Lcom/google/dexmaker/dx/rop/code/SwitchInsn;)V

    return-void
.end method

.method public contentEquals(Lcom/google/dexmaker/dx/rop/code/Insn;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getCases()Lcom/google/dexmaker/dx/util/IntList;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->cases:Lcom/google/dexmaker/dx/util/IntList;

    return-object v0
.end method

.method public getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;
    .locals 1

    .line 65
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-object v0
.end method

.method public getInlineString()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->cases:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IntList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withAddedCatch(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 1

    .line 77
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 7

    .line 105
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    iget-object v5, p0, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->cases:Lcom/google/dexmaker/dx/util/IntList;

    move-object v0, v6

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/util/IntList;)V

    return-object v6
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 7

    .line 83
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v4

    iget-object v5, p0, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;->cases:Lcom/google/dexmaker/dx/util/IntList;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/SwitchInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/util/IntList;)V

    return-object v6
.end method
