.class public Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;
.super Ljava/lang/Object;
.source "EscapeAnalysis.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;,
        Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;
    }
.end annotation


# instance fields
.field private latticeValues:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;",
            ">;"
        }
    .end annotation
.end field

.field private regCount:I

.field private ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 114
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    .line 115
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method private addEdge(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V
    .locals 1

    .line 173
    iget-object v0, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    :cond_0
    iget-object v0, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 177
    iget-object p1, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private findSetIndex(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I
    .locals 3

    const/4 v0, 0x0

    .line 127
    :goto_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 128
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 129
    iget-object v1, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private getInsnForMove(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 1

    .line 144
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    .line 145
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    .line 146
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    return-object p1
.end method

.method private getMoveForInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 2

    .line 157
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    .line 158
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    .line 159
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    return-object p1
.end method

.method private insertExceptionThrow(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            "Ljava/util/HashSet<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    move-object v6, p0

    move-object/from16 v7, p3

    .line 738
    new-instance v8, Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArrayIndexOutOfBoundsException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-direct {v8, v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;-><init>(Lcom/google/dexmaker/dx/rop/type/Type;)V

    .line 740
    sget-object v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v3, 0x0

    const/16 v4, 0x28

    move-object v0, p0

    move-object v1, p1

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertThrowingInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 744
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    .line 745
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v9

    .line 747
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 748
    iget-object v0, v6, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->makeNewSsaReg()I

    move-result v0

    invoke-static {v0, v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v11

    .line 750
    sget-object v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/16 v4, 0x38

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, v11

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 754
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v9

    .line 756
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 757
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string v2, "<init>"

    invoke-direct {v1, v2}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string v3, "(I)V"

    invoke-direct {v2, v3}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/cst/CstNat;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    .line 758
    new-instance v5, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-direct {v5, v8, v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/cst/CstNat;)V

    move-object v0, p2

    .line 759
    invoke-static {v11, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v4, 0x34

    move-object v0, p0

    move-object v1, v12

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertThrowingInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 761
    invoke-virtual {v7, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 764
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v8

    .line 766
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 767
    invoke-static {v11}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    const/16 v4, 0x23

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v9

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertThrowingInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 769
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    move-result v0

    iget-object v1, v6, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->replaceSuccessor(II)V

    .line 771
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 7

    .line 788
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    const/16 v1, 0x38

    if-ne p4, v1, :cond_0

    .line 791
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p4

    invoke-static {p4}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p4

    move-object v2, p4

    goto :goto_0

    .line 793
    :cond_0
    invoke-static {p4, p3, p2, p5}, Lcom/google/dexmaker/dx/rop/code/Rops;->ropFor(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p4

    move-object v2, p4

    :goto_0
    if-nez p5, :cond_1

    .line 798
    new-instance p4, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object p5

    invoke-direct {p4, v2, p5, p3, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    goto :goto_1

    .line 801
    :cond_1
    new-instance p4, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v3

    move-object v1, p4

    move-object v4, p3

    move-object v5, p2

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 805
    :goto_1
    new-instance p2, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p3

    invoke-direct {p2, p4, p3}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 806
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p3

    .line 808
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p3, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 809
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnAdded(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method private insertThrowingInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 7

    .line 826
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    .line 827
    invoke-static {p4, p3, p2, p5}, Lcom/google/dexmaker/dx/rop/code/Rops;->ropFor(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    if-nez p5, :cond_0

    .line 830
    new-instance p3, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object p4

    sget-object p5, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {p3, v2, p4, p2, p5}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    goto :goto_0

    .line 833
    :cond_0
    new-instance p3, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v3

    sget-object v5, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-object v1, p3

    move-object v4, p2

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 837
    :goto_0
    new-instance p2, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 838
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p3

    .line 840
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p3, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 841
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnAdded(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method private movePropagate()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    .line 646
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 647
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 650
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    goto :goto_2

    .line 655
    :cond_0
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListCopy()[Ljava/util/ArrayList;

    move-result-object v3

    .line 656
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    .line 657
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 660
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    iget v6, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    if-ge v5, v6, :cond_1

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    iget v6, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    if-ge v5, v6, :cond_1

    goto :goto_2

    .line 665
    :cond_1
    new-instance v5, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;

    invoke-direct {v5, p0, v2, v4}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;-><init>(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 682
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 683
    invoke-virtual {v3, v5}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 1

    .line 209
    new-instance v0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->run()V

    return-void
.end method

.method private processInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 4

    .line 219
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    .line 220
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    const/16 v2, 0x9

    const/16 v3, 0x38

    if-ne v0, v3, :cond_0

    .line 224
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicType()I

    move-result v3

    if-ne v3, v2, :cond_0

    .line 227
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processMoveResultPseudoInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    move-result-object p1

    .line 228
    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processRegister(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    if-ne v0, p1, :cond_1

    .line 229
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicType()I

    move-result p1

    if-ne p1, v2, :cond_1

    .line 232
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v2, v3}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 233
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processRegister(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V

    goto :goto_0

    :cond_1
    const/16 p1, 0x37

    if-ne v0, p1, :cond_2

    .line 235
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicType()I

    move-result p1

    if-ne p1, v2, :cond_2

    .line 238
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v2, v3}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 239
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processRegister(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private processMoveResultPseudoInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;
    .locals 4

    .line 253
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 254
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->getInsnForMove(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    .line 255
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_4

    const/16 v2, 0x26

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    const/4 p1, 0x0

    return-object p1

    .line 283
    :pswitch_0
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    goto/16 :goto_0

    .line 269
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    .line 270
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 272
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    const/4 v0, 0x1

    .line 274
    iput-boolean v0, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    goto :goto_0

    .line 277
    :cond_0
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    goto :goto_0

    .line 290
    :cond_1
    :pswitch_2
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    .line 291
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I

    move-result v1

    .line 294
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eq v1, v2, :cond_2

    .line 295
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 296
    iget-object v1, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    return-object p1

    .line 301
    :cond_2
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    sget-object v1, Lcom/google/dexmaker/dx/rop/type/Type;->KNOWN_NULL:Lcom/google/dexmaker/dx/rop/type/Type;

    if-ne p1, v1, :cond_3

    .line 302
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    goto :goto_0

    .line 305
    :cond_3
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    goto :goto_0

    .line 263
    :cond_4
    :pswitch_3
    new-instance p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    sget-object v2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 314
    :goto_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2d
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private processPhiUse(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;)V"
        }
    .end annotation

    .line 361
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I

    move-result v0

    .line 362
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 364
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    if-eq p1, p2, :cond_2

    const/4 p3, 0x0

    .line 367
    iput-boolean p3, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 368
    iget-object p3, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    iget-object v1, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    invoke-virtual {p3, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 369
    iget-object p3, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iget-object v1, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-virtual {p3, v1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->compareTo(Ljava/lang/Enum;)I

    move-result p3

    if-gez p3, :cond_0

    .line 370
    iget-object p3, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object p3, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    .line 372
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->replaceNode(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 373
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 377
    :cond_1
    iget-object p2, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/util/BitSet;->set(I)V

    .line 378
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method private processRegister(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V
    .locals 4

    .line 325
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 326
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 330
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    .line 331
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 332
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object v1

    .line 335
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 336
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v3

    if-nez v3, :cond_1

    .line 340
    invoke-direct {p0, v2, p2, v0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processPhiUse(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 343
    :cond_1
    invoke-direct {p0, p1, v2, p2, v0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->processUse(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private processUse(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;)V"
        }
    .end annotation

    .line 394
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/16 p4, 0x21

    if-eq v0, p4, :cond_4

    const/16 p4, 0x23

    if-eq v0, p4, :cond_4

    const/16 p4, 0x2b

    if-eq v0, p4, :cond_3

    packed-switch v0, :pswitch_data_0

    const/4 p4, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_0

    .line 457
    :pswitch_0
    sget-object p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object p1, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    goto/16 :goto_0

    .line 411
    :pswitch_1
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 412
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v0

    if-nez v0, :cond_0

    .line 414
    iput-boolean v2, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 419
    :cond_0
    :pswitch_2
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 420
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicType()I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    goto/16 :goto_0

    .line 423
    :cond_1
    iput-boolean v2, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 426
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    .line 427
    invoke-virtual {p2, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    if-ne v0, p1, :cond_2

    .line 428
    invoke-virtual {p2, p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I

    move-result p1

    .line 429
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-eq p1, p2, :cond_6

    .line 430
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 431
    invoke-direct {p0, p1, p3}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->addEdge(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 432
    iget-object p2, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iget-object p4, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-virtual {p2, p4}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->compareTo(Ljava/lang/Enum;)I

    move-result p2

    if-gez p2, :cond_6

    .line 433
    iget-object p1, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object p1, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    goto :goto_0

    .line 437
    :cond_2
    invoke-virtual {p2, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I

    move-result p1

    .line 438
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-eq p1, p2, :cond_6

    .line 439
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 440
    invoke-direct {p0, p3, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->addEdge(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 441
    iget-object p2, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iget-object p4, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-virtual {p2, p4}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->compareTo(Ljava/lang/Enum;)I

    move-result p2

    if-gez p2, :cond_6

    .line 442
    iget-object p2, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object p2, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    goto :goto_0

    .line 449
    :pswitch_3
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    .line 450
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result p1

    if-nez p1, :cond_6

    .line 452
    iput-boolean v2, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    goto :goto_0

    .line 405
    :cond_3
    :pswitch_4
    iget-object p1, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    sget-object p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->METHOD:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-gez p1, :cond_6

    .line 406
    sget-object p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->METHOD:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object p1, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    goto :goto_0

    .line 467
    :cond_4
    :pswitch_5
    sget-object p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->INTER:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object p1, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    goto :goto_0

    .line 398
    :cond_5
    iget-object p1, p3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p3

    invoke-virtual {p1, p3}, Ljava/util/BitSet;->set(I)V

    .line 399
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x26
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method private replaceDef(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/SsaInsn;ILjava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;)V"
        }
    .end annotation

    .line 537
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    .line 541
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/type/Type;->getComponentType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/cst/Zeroes;->zeroFor(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v7

    .line 542
    move-object v1, v7

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    .line 543
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->makeNewSsaReg()I

    move-result v2

    invoke-static {v2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    .line 545
    invoke-virtual {p4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    sget-object v4, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v6, 0x5

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private replaceNode(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;)V
    .locals 3

    .line 190
    iget-object v0, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 191
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 192
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    iget-object v2, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 195
    :cond_0
    iget-object v0, p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 196
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 197
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    iget-object v2, p1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method

.method private replaceUse(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/SsaInsn;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;",
            "Ljava/util/HashSet<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    .line 567
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 573
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    const/16 v2, 0x22

    const/4 v3, 0x0

    if-eq v1, v2, :cond_3

    const/16 p2, 0x36

    if-eq v1, p2, :cond_4

    const/16 p2, 0x39

    if-eq v1, p2, :cond_2

    const/4 p2, 0x2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    .line 594
    :pswitch_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    .line 595
    invoke-virtual {v1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    .line 596
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getIntBits()I

    move-result v2

    if-ge v2, v0, :cond_0

    .line 598
    invoke-virtual {v1, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    .line 599
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p4

    invoke-virtual {p2, p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p4

    .line 600
    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v5

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v6, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 603
    invoke-virtual {p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withSimpleType()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p3, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 606
    :cond_0
    invoke-virtual {v1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-direct {p0, p1, p2, p4}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertExceptionThrow(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V

    goto/16 :goto_2

    .line 576
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->getMoveForInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v6

    .line 577
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    const/4 v1, 0x1

    .line 578
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    .line 579
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getIntBits()I

    move-result v2

    if-ge v2, v0, :cond_1

    .line 581
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 582
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    .line 583
    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    goto :goto_0

    .line 587
    :cond_1
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-direct {p0, v6, p1, p4}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertExceptionThrow(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V

    .line 588
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 590
    :goto_0
    invoke-virtual {p4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 624
    :cond_2
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object p2

    .line 625
    check-cast p2, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;

    .line 626
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;->getInitValues()Ljava/util/ArrayList;

    move-result-object p2

    :goto_1
    if-ge v3, v0, :cond_4

    .line 628
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p4

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-static {p4, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p4

    .line 631
    sget-object v6, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v8, 0x5

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-object v4, p0

    move-object v5, p1

    move-object v7, p4

    invoke-direct/range {v4 .. v9}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 634
    invoke-virtual {p3, v3, p4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 611
    :cond_3
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p2

    .line 613
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->getMoveForInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    .line 614
    sget-object v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    const/4 v4, 0x5

    move-object v5, p2

    check-cast v5, Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 617
    invoke-virtual {p4, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x26
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private run()V
    .locals 6

    .line 692
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;-><init>(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachBlockDepthFirstDom(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;)V

    .line 712
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 713
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    sget-object v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    if-eq v2, v3, :cond_0

    .line 714
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 715
    iget-object v4, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iget-object v5, v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    invoke-virtual {v4, v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-lez v4, :cond_1

    .line 716
    iget-object v4, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    iput-object v4, v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    goto :goto_0

    .line 723
    :cond_2
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->scalarReplacement()V

    return-void
.end method

.method private scalarReplacement()V
    .locals 7

    .line 479
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 480
    iget-boolean v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    sget-object v3, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 485
    :cond_1
    iget-object v1, v1, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    .line 486
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v3, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v3

    .line 487
    invoke-direct {p0, v3}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->getInsnForMove(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v4

    .line 490
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v2

    .line 491
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getIntBits()I

    move-result v2

    .line 492
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 494
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 497
    invoke-direct {p0, v3, v4, v2, v5}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->replaceDef(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/SsaInsn;ILjava/util/ArrayList;)V

    .line 500
    invoke-virtual {v6, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 501
    invoke-virtual {v6, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 504
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object v1

    .line 505
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 507
    invoke-direct {p0, v2, v4, v5, v6}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->replaceUse(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/ssa/SsaInsn;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 508
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 512
    :cond_2
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1, v6}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    .line 513
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnsChanged()V

    .line 516
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->regCount:I

    invoke-static {v1, v2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->updateSsaMethod(Lcom/google/dexmaker/dx/ssa/SsaMethod;I)V

    .line 519
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->movePropagate()V

    goto :goto_0

    :cond_3
    return-void
.end method
