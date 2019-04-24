.class public final Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
.super Ljava/lang/Object;
.source "SsaBasicBlock.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$LabelComparator;,
        Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;
    }
.end annotation


# static fields
.field public static final LABEL_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final domChildren:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private index:I

.field private insns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private liveIn:Lcom/google/dexmaker/dx/util/IntSet;

.field private liveOut:Lcom/google/dexmaker/dx/util/IntSet;

.field private movesFromPhisAtBeginning:I

.field private movesFromPhisAtEnd:I

.field private parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

.field private predecessors:Ljava/util/BitSet;

.field private primarySuccessor:I

.field private reachable:I

.field private ropLabel:I

.field private successorList:Lcom/google/dexmaker/dx/util/IntList;

.field private successors:Ljava/util/BitSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$LabelComparator;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$LabelComparator;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->LABEL_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(IILcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 2

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 70
    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    const/4 v1, 0x0

    .line 88
    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtEnd:I

    .line 94
    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtBeginning:I

    .line 100
    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->reachable:I

    .line 123
    iput-object p3, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 124
    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    .line 125
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    .line 126
    iput p2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->ropLabel:I

    .line 128
    new-instance p1, Ljava/util/BitSet;

    invoke-virtual {p3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    .line 129
    new-instance p1, Ljava/util/BitSet;

    invoke-virtual {p3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    .line 130
    new-instance p1, Lcom/google/dexmaker/dx/util/IntList;

    invoke-direct {p1}, Lcom/google/dexmaker/dx/util/IntList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    .line 132
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->domChildren:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)I
    .locals 0

    .line 43
    iget p0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->ropLabel:I

    return p0
.end method

.method private static checkRegUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 3

    .line 671
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 672
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result p1

    .line 674
    invoke-virtual {p0, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    add-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method private getCountPhiInsns()I
    .locals 3

    .line 293
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 295
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 296
    instance-of v2, v2, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method public static newFromRop(Lcom/google/dexmaker/dx/rop/code/RopMethod;ILcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 7

    .line 146
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object v0

    .line 147
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->get(I)Lcom/google/dexmaker/dx/rop/code/BasicBlock;

    move-result-object v1

    .line 148
    new-instance v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getLabel()I

    move-result v3

    invoke-direct {v2, p1, v3, p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;-><init>(IILcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 150
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getInsns()Lcom/google/dexmaker/dx/rop/code/InsnList;

    move-result-object p1

    .line 152
    iget-object p2, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/InsnList;->size()I

    move-result v3

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 154
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/InsnList;->size()I

    move-result p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_0

    .line 155
    iget-object v4, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    new-instance v5, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {p1, v3}, Lcom/google/dexmaker/dx/rop/code/InsnList;->get(I)Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v6

    invoke-direct {v5, v6, v2}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getLabel()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->labelToPredecessors(I)Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->bitSetFromLabelList(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;Lcom/google/dexmaker/dx/util/IntList;)Ljava/util/BitSet;

    move-result-object p0

    iput-object p0, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    .line 162
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getSuccessors()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->bitSetFromLabelList(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;Lcom/google/dexmaker/dx/util/IntList;)Ljava/util/BitSet;

    move-result-object p0

    iput-object p0, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    .line 165
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getSuccessors()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->indexListFromLabelList(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;Lcom/google/dexmaker/dx/util/IntList;)Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p0

    iput-object p0, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    .line 169
    iget-object p0, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result p0

    if-eqz p0, :cond_2

    .line 170
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    move-result p0

    if-gez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_1

    .line 172
    :cond_1
    invoke-virtual {v0, p0}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->indexOfLabel(I)I

    move-result p0

    :goto_1
    iput p0, v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    :cond_2
    return-object v2
.end method

.method private scheduleUseBeforeAssigned(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    .line 690
    new-instance v0, Ljava/util/BitSet;

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 693
    new-instance v1, Ljava/util/BitSet;

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 695
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v2

    move v2, v3

    :goto_0
    if-ge v2, v4, :cond_6

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_0

    .line 704
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    invoke-static {v0, v6}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->setRegsUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 707
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->setRegsUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v2

    move v6, v5

    :goto_2
    if-ge v5, v4, :cond_2

    .line 716
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 722
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->checkRegUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v7

    if-nez v7, :cond_1

    add-int/lit8 v7, v6, 0x1

    .line 723
    invoke-static {p1, v5, v6}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    move v6, v7

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    if-ne v2, v6, :cond_5

    const/4 v2, 0x0

    move v5, v6

    :goto_3
    if-ge v5, v4, :cond_4

    .line 737
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 738
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->checkRegUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v8

    invoke-virtual {v8, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    invoke-static {v1, v8}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->checkRegUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 747
    invoke-static {p1, v6, v5}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    move-object v2, v7

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 754
    :cond_4
    :goto_4
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    .line 755
    iget-object v5, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->borrowSpareRegister(I)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    .line 758
    new-instance v7, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    new-instance v8, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v9

    invoke-static {v9}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMove(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v9

    sget-object v10, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    invoke-direct {v8, v9, v10, v5, v2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {v7, v8, p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    add-int/lit8 v2, v6, 0x1

    .line 764
    invoke-interface {p1, v6, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 766
    invoke-static {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v5

    .line 768
    new-instance v6, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    new-instance v7, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v8

    invoke-static {v8}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMove(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v8

    sget-object v9, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-direct {v7, v8, v9, v4, v5}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {v6, v7, p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 774
    invoke-interface {p1, v2, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 777
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_5

    :cond_5
    move v2, v6

    .line 780
    :goto_5
    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 781
    invoke-virtual {v1}, Ljava/util/BitSet;->clear()V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private static setRegsUsed(Ljava/util/BitSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 655
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/util/BitSet;->set(I)V

    .line 656
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 657
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addDomChild(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->domChildren:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addInsnToHead(Lcom/google/dexmaker/dx/rop/code/Insn;)V
    .locals 2

    .line 226
    invoke-static {p1, p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->makeFromRop(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    .line 227
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getCountPhiInsns()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnAdded(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public addLiveIn(I)V
    .locals 1

    .line 806
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveIn:Lcom/google/dexmaker/dx/util/IntSet;

    if-nez v0, :cond_0

    .line 807
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/SetFactory;->makeLivenessSet(I)Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveIn:Lcom/google/dexmaker/dx/util/IntSet;

    .line 810
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveIn:Lcom/google/dexmaker/dx/util/IntSet;

    invoke-interface {v0, p1}, Lcom/google/dexmaker/dx/util/IntSet;->add(I)V

    return-void
.end method

.method public addLiveOut(I)V
    .locals 1

    .line 792
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveOut:Lcom/google/dexmaker/dx/util/IntSet;

    if-nez v0, :cond_0

    .line 793
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/SetFactory;->makeLivenessSet(I)Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveOut:Lcom/google/dexmaker/dx/util/IntSet;

    .line 796
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveOut:Lcom/google/dexmaker/dx/util/IntSet;

    invoke-interface {v0, p1}, Lcom/google/dexmaker/dx/util/IntSet;->add(I)V

    return-void
.end method

.method public addMoveToBeginning(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 4

    .line 633
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 638
    :cond_0
    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    .line 639
    new-instance v0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    new-instance v1, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMove(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {v0, v1, p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 643
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getCountPhiInsns()I

    move-result p2

    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 644
    iget p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtBeginning:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtBeginning:I

    return-void
.end method

.method public addMoveToEnd(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 4

    .line 577
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    .line 589
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    .line 615
    :cond_1
    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    .line 616
    new-instance v0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    new-instance v1, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMove(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {v0, v1, p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 620
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 622
    iget p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtEnd:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtEnd:I

    goto :goto_2

    .line 600
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    :goto_1
    if-ltz v0, :cond_3

    .line 606
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 607
    invoke-virtual {v1, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->addMoveToBeginning(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 602
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public addPhiInsnForReg(I)V
    .locals 2

    .line 205
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-direct {v1, p1, p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;-><init>(ILcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public addPhiInsnForReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-direct {v1, p1, p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public exitBlockFixup(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 2

    if-ne p0, p1, :cond_0

    return-void

    .line 554
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 559
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget v1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 560
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    iget v1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/util/IntList;->add(I)V

    .line 561
    iget v0, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    .line 562
    iget-object p1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    :cond_1
    return-void
.end method

.method public forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V
    .locals 3

    .line 988
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 990
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v2, p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->accept(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public forEachPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;)V
    .locals 4

    .line 257
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 260
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 261
    instance-of v3, v2, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v3, :cond_0

    .line 262
    check-cast v2, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-interface {p1, v2}, Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;->visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getDomChildren()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->domChildren:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 323
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    return v0
.end method

.method public getInsns()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation

    .line 309
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLiveInRegs()Lcom/google/dexmaker/dx/util/IntSet;
    .locals 1

    .line 820
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveIn:Lcom/google/dexmaker/dx/util/IntSet;

    if-nez v0, :cond_0

    .line 821
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/SetFactory;->makeLivenessSet(I)Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveIn:Lcom/google/dexmaker/dx/util/IntSet;

    .line 823
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveIn:Lcom/google/dexmaker/dx/util/IntSet;

    return-object v0
.end method

.method public getLiveOutRegs()Lcom/google/dexmaker/dx/util/IntSet;
    .locals 1

    .line 833
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveOut:Lcom/google/dexmaker/dx/util/IntSet;

    if-nez v0, :cond_0

    .line 834
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/SetFactory;->makeLivenessSet(I)Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveOut:Lcom/google/dexmaker/dx/util/IntSet;

    .line 836
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->liveOut:Lcom/google/dexmaker/dx/util/IntSet;

    return-object v0
.end method

.method public getParent()Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 1

    .line 407
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-object v0
.end method

.method public getPhiInsns()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation

    .line 316
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getCountPhiInsns()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPredecessors()Ljava/util/BitSet;
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    return-object v0
.end method

.method public getPrimarySuccessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 2

    .line 382
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 385
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    return-object v0
.end method

.method public getPrimarySuccessorIndex()I
    .locals 1

    .line 367
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    return v0
.end method

.method public getPrimarySuccessorRopLabel()I
    .locals 2

    .line 374
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blockIndexToRopLabel(I)I

    move-result v0

    return v0
.end method

.method public getRopLabel()I
    .locals 1

    .line 330
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->ropLabel:I

    return v0
.end method

.method public getRopLabelString()Ljava/lang/String;
    .locals 1

    .line 337
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->ropLabel:I

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRopLabelSuccessorList()Lcom/google/dexmaker/dx/util/IntList;
    .locals 5

    .line 393
    new-instance v0, Lcom/google/dexmaker/dx/util/IntList;

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/util/IntList;-><init>(I)V

    .line 395
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 398
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v4, v2}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blockIndexToRopLabel(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/util/IntList;->add(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    return-object v0
.end method

.method public getSuccessors()Ljava/util/BitSet;
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    return-object v0
.end method

.method public insertNewPredecessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 5

    .line 417
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->makeNewGotoBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    .line 420
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iput-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    .line 421
    iget-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 422
    iget-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/IntList;->add(I)V

    .line 423
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iput v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    .line 427
    new-instance v1, Ljava/util/BitSet;

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    .line 428
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v2, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 431
    iget-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    :goto_0
    if-ltz v1, :cond_0

    .line 434
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 436
    iget v3, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iget v4, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v2, v3, v4}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->replaceSuccessor(II)V

    .line 432
    iget-object v2, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public insertNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 4

    .line 454
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->makeNewGotoBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    .line 456
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget v2, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 462
    iget-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 463
    iget-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget v2, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 464
    iget-object v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    iget v2, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/IntList;->add(I)V

    .line 465
    iget v1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iput v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    .line 468
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    .line 469
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v2

    iget v3, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    if-ne v2, v3, :cond_0

    .line 470
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    iget v3, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v2, v1, v3}, Lcom/google/dexmaker/dx/util/IntList;->set(II)V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 474
    :cond_1
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    iget v2, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    if-ne v1, v2, :cond_2

    .line 475
    iget v1, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    .line 477
    :cond_2
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget v2, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->clear(I)V

    .line 478
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget v2, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 481
    iget-object v1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v2, v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 482
    iget-object v1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    iget p1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v3, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    invoke-virtual {v1, v2, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0

    .line 457
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Block "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabelString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " not successor of "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabelString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isExitBlock()Z
    .locals 2

    .line 843
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlockIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isReachable()Z
    .locals 2

    .line 853
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->reachable:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 854
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->computeReachability()V

    .line 856
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->reachable:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public removeAllPhiInsns()V
    .locals 3

    .line 282
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getCountPhiInsns()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public removeSuccessor(I)V
    .locals 3

    .line 529
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ltz v0, :cond_1

    .line 530
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v2, v0}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v2

    if-ne v2, p1, :cond_0

    move v1, v0

    goto :goto_1

    .line 533
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v2, v0}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v2

    iput v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 537
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/util/IntList;->removeIndex(I)V

    .line 538
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->clear(I)V

    .line 539
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    iget-object p1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->clear(I)V

    return-void
.end method

.method public replaceLastInsn(Lcom/google/dexmaker/dx/rop/code/Insn;)V
    .locals 4

    .line 238
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 242
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 243
    invoke-static {p1, p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->makeFromRop(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    .line 245
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v2, v3, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 247
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnRemoved(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    .line 248
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnAdded(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void

    .line 239
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "last insn must branch"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public replaceSuccessor(II)V
    .locals 2

    if-ne p1, p2, :cond_0

    return-void

    .line 500
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 502
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    if-ne v0, p1, :cond_1

    .line 503
    iput p2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->primarySuccessor:I

    .line 506
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    .line 507
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v1

    if-ne v1, p1, :cond_2

    .line 508
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successorList:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v1, v0, p2}, Lcom/google/dexmaker/dx/util/IntList;->set(II)V

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 512
    :cond_3
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->successors:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->clear(I)V

    .line 515
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    iget-object p2, p2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {p2, v0}, Ljava/util/BitSet;->set(I)V

    .line 518
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    iget-object p1, p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->predecessors:Ljava/util/BitSet;

    iget p2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {p1, p2}, Ljava/util/BitSet;->clear(I)V

    return-void
.end method

.method public scheduleMovesFromPhis()V
    .locals 4

    .line 880
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtBeginning:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 883
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 885
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->scheduleUseBeforeAssigned(Ljava/util/List;)V

    .line 887
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtBeginning:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 894
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->isMoveException()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 901
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected: moves from phis before move-exception"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 969
    :cond_1
    :goto_0
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtEnd:I

    if-le v0, v1, :cond_2

    .line 970
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->movesFromPhisAtEnd:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->scheduleUseBeforeAssigned(Ljava/util/List;)V

    .line 976
    :cond_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->parent:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->returnSpareRegisters()V

    return-void
.end method

.method public setReachable(I)V
    .locals 0

    .line 865
    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->reachable:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 997
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->ropLabel:I

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
