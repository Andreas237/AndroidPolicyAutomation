.class public final Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;
.super Lcom/google/dexmaker/dx/rop/code/Insn;
.source "FillArrayDataInsn.java"


# instance fields
.field private final arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

.field private final initValues:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Ljava/util/ArrayList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/rop/code/Rop;",
            "Lcom/google/dexmaker/dx/rop/code/SourcePosition;",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/dexmaker/dx/rop/code/Insn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 57
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 61
    iput-object p4, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->initValues:Ljava/util/ArrayList;

    .line 62
    iput-object p5, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

    return-void

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus branchingness"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 91
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;->visitFillArrayDataInsn(Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;)V

    return-void
.end method

.method public getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;
    .locals 1

    .line 69
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-object v0
.end method

.method public getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

    return-object v0
.end method

.method public getInitValues()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->initValues:Ljava/util/ArrayList;

    return-object v0
.end method

.method public withAddedCatch(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 1

    .line 97
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 6

    .line 113
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    iget-object v4, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->initValues:Ljava/util/ArrayList;

    iget-object v5, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-object v0, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Ljava/util/ArrayList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object p1
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 7

    .line 103
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->initValues:Ljava/util/ArrayList;

    iget-object v5, p0, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Ljava/util/ArrayList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object v6
.end method
