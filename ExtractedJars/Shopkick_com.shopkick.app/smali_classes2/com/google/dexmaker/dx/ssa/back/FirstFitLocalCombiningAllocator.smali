.class public Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;
.super Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;
.source "FirstFitLocalCombiningAllocator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private final invokeRangeInsns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private final localVariables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/dexmaker/dx/rop/code/LocalItem;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

.field private final minimizeRegisters:Z

.field private final moveResultPseudoInsns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private final paramRangeEnd:I

.field private final phiInsns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/PhiInsn;",
            ">;"
        }
    .end annotation
.end field

.field private final reservedRopRegs:Ljava/util/BitSet;

.field private final ssaRegsMapped:Ljava/util/BitSet;

.field private final usedRopRegs:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;Z)V
    .locals 2

    .line 87
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;)V

    .line 89
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    .line 91
    new-instance v0, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v1

    invoke-direct {v0, p2, v1}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;-><init>(Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;I)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    .line 94
    iput-boolean p3, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->minimizeRegisters:Z

    .line 102
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getParamWidth()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    .line 104
    new-instance p1, Ljava/util/BitSet;

    iget p2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    mul-int/lit8 p2, p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    .line 105
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    iget p2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p2}, Ljava/util/BitSet;->set(II)V

    .line 106
    new-instance p1, Ljava/util/BitSet;

    iget p2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    mul-int/lit8 p2, p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->usedRopRegs:Ljava/util/BitSet;

    .line 107
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    .line 108
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->moveResultPseudoInsns:Ljava/util/ArrayList;

    .line 109
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->invokeRangeInsns:Ljava/util/ArrayList;

    .line 110
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->phiInsns:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/Map;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->moveResultPseudoInsns:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$200(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->invokeRangeInsns:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$300(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->phiInsns:Ljava/util/ArrayList;

    return-object p0
.end method

.method private addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V
    .locals 3

    .line 692
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 695
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->canMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 705
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v1

    .line 706
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-virtual {v2, p1, p2, v1}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->addMapping(III)V

    .line 707
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    .line 708
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->usedRopRegs:Ljava/util/BitSet;

    add-int/2addr v1, p2

    invoke-virtual {p1, p2, v1}, Ljava/util/BitSet;->set(II)V

    return-void

    .line 696
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "attempt to add invalid register mapping"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private adjustAndMapSourceRangeRange(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 12

    .line 720
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findRangeAndAdjust(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)I

    move-result v0

    .line 722
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 723
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v0

    move v0, v2

    :goto_0
    if-ge v0, v1, :cond_3

    .line 727
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    .line 728
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    .line 729
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v6

    add-int v7, v3, v6

    .line 733
    iget-object v8, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v8, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_3

    .line 737
    :cond_0
    invoke-direct {p0, v5}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->getLocalItemForReg(I)Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v5

    .line 738
    invoke-direct {p0, v4, v3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V

    if-eqz v5, :cond_2

    .line 741
    invoke-direct {p0, v3, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->markReserved(II)V

    .line 742
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 745
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v8, v2

    :goto_1
    if-ge v8, v5, :cond_2

    .line 752
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 753
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v10

    const/4 v11, -0x1

    .line 756
    invoke-virtual {p1, v10}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->indexOfRegister(I)I

    move-result v10

    if-eq v11, v10, :cond_1

    goto :goto_2

    .line 761
    :cond_1
    invoke-direct {p0, v9, v3, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)Z

    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    :goto_3
    add-int/lit8 v0, v0, 0x1

    move v3, v7

    goto :goto_0

    :cond_3
    return-void
.end method

.method private analyzeInstructions()V
    .locals 2

    .line 620
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v1, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;-><init>(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    return-void
.end method

.method private canMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z
    .locals 1

    .line 594
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v0

    .line 595
    invoke-direct {p0, p2, v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->spansParamRange(II)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v0, p1, p2}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->interferes(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private canMapRegs(Ljava/util/ArrayList;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;I)Z"
        }
    .end annotation

    .line 577
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 578
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 579
    :cond_1
    invoke-direct {p0, v0, p2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->canMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private findAnyFittingRange(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;I[ILjava/util/BitSet;)I
    .locals 2

    .line 885
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    .line 887
    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result v0

    .line 888
    invoke-direct {p0, v0, p1, p3, p4}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->fitPlanForRange(ILcom/google/dexmaker/dx/ssa/NormalSsaInsn;[ILjava/util/BitSet;)I

    move-result v1

    if-ltz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 896
    invoke-virtual {p4}, Ljava/util/BitSet;->clear()V

    goto :goto_0
.end method

.method private findNextUnreservedRopReg(II)I
    .locals 3

    .line 374
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result p1

    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-ge v0, p2, :cond_0

    .line 379
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    add-int v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    if-ne v0, p2, :cond_1

    return p1

    .line 387
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    add-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result p1

    goto :goto_0
.end method

.method private findRangeAndAdjust(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 778
    invoke-virtual/range {p1 .. p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    .line 779
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v3

    .line 781
    new-array v4, v3, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v3, :cond_0

    .line 786
    invoke-virtual {v2, v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v8

    .line 787
    aput v8, v4, v6

    .line 788
    aget v8, v4, v6

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    const/high16 v6, -0x80000000

    const/4 v8, 0x0

    const/4 v9, -0x1

    move v10, v6

    move-object v12, v8

    move v11, v9

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v6, v3, :cond_8

    .line 805
    invoke-virtual {v2, v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v13

    if-eqz v6, :cond_1

    add-int/lit8 v14, v6, -0x1

    .line 808
    aget v14, v4, v14

    sub-int/2addr v8, v14

    .line 810
    :cond_1
    iget-object v14, v0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v14, v13}, Ljava/util/BitSet;->get(I)Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_3

    .line 814
    :cond_2
    iget-object v14, v0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v14, v13}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v13

    add-int/2addr v13, v8

    if-ltz v13, :cond_7

    .line 816
    invoke-direct {v0, v13, v7}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->spansParamRange(II)Z

    move-result v14

    if-eqz v14, :cond_3

    goto :goto_3

    .line 820
    :cond_3
    new-instance v14, Ljava/util/BitSet;

    invoke-direct {v14, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 822
    invoke-direct {v0, v13, v1, v4, v14}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->fitPlanForRange(ILcom/google/dexmaker/dx/ssa/NormalSsaInsn;[ILjava/util/BitSet;)I

    move-result v15

    if-gez v15, :cond_4

    goto :goto_3

    .line 830
    :cond_4
    invoke-virtual {v14}, Ljava/util/BitSet;->cardinality()I

    move-result v16

    sub-int v5, v15, v16

    if-le v5, v10, :cond_5

    move v11, v13

    move-object v12, v14

    goto :goto_2

    :cond_5
    move v5, v10

    :goto_2
    if-ne v15, v7, :cond_6

    goto :goto_4

    :cond_6
    move v10, v5

    :cond_7
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_8
    :goto_4
    if-ne v11, v9, :cond_9

    .line 851
    new-instance v12, Ljava/util/BitSet;

    invoke-direct {v12, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 853
    invoke-direct {v0, v1, v7, v4, v12}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findAnyFittingRange(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;I[ILjava/util/BitSet;)I

    move-result v11

    const/4 v3, 0x0

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    .line 861
    :goto_5
    invoke-virtual {v12, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    :goto_6
    if-ltz v3, :cond_a

    .line 863
    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->insertMoveBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->changeOneSource(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v3, v3, 0x1

    .line 862
    invoke-virtual {v12, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    goto :goto_6

    :cond_a
    return v11
.end method

.method private findRopRegForLocal(II)I
    .locals 3

    .line 403
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->usedRopRegs:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result p1

    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-ge v0, p2, :cond_0

    .line 408
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->usedRopRegs:Ljava/util/BitSet;

    add-int v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    if-ne v0, p2, :cond_1

    return p1

    .line 416
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->usedRopRegs:Ljava/util/BitSet;

    add-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result p1

    goto :goto_0
.end method

.method private fitPlanForRange(ILcom/google/dexmaker/dx/ssa/NormalSsaInsn;[ILjava/util/BitSet;)I
    .locals 10

    .line 917
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 918
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    .line 920
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getLiveOutRegs()Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object p2

    .line 921
    invoke-virtual {p0, p2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaSetToSpecs(Lcom/google/dexmaker/dx/util/IntSet;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    .line 924
    new-instance v2, Ljava/util/BitSet;

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, -0x1

    if-ge v3, v1, :cond_4

    .line 927
    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    .line 928
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    .line 929
    aget v8, p3, v3

    if-eqz v3, :cond_0

    add-int/lit8 v9, v3, -0x1

    .line 932
    aget v9, p3, v9

    add-int/2addr p1, v9

    .line 935
    :cond_0
    iget-object v9, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v9, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_1

    iget-object v9, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v9, v7}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v9

    if-ne v9, p1, :cond_1

    add-int/2addr v4, v8

    goto :goto_1

    .line 939
    :cond_1
    invoke-direct {p0, p1, v8}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->rangeContainsReserved(II)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    .line 942
    :cond_2
    iget-object v9, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v9, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-direct {p0, v6, p1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->canMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v2, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-nez v6, :cond_3

    add-int/2addr v4, v8

    goto :goto_1

    .line 947
    :cond_3
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v6, p2, p1, v8}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->areAnyPinned(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;II)Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v6, v0, p1, v8}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->areAnyPinned(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;II)Z

    move-result v6

    if-nez v6, :cond_5

    .line 961
    invoke-virtual {p4, v3}, Ljava/util/BitSet;->set(I)V

    .line 967
    :goto_1
    invoke-virtual {v2, v7}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    move v5, v4

    :cond_5
    :goto_2
    return v5
.end method

.method private getLocalItemForReg(I)Lcom/google/dexmaker/dx/rop/code/LocalItem;
    .locals 4

    .line 1000
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1001
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 1002
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    if-ne v3, p1, :cond_1

    .line 1003
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/LocalItem;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private getParameterIndexForReg(I)I
    .locals 3

    .line 217
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    .line 222
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 225
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 226
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/CstInsn;

    .line 227
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method private handleCheckCastResults()V
    .locals 12

    .line 457
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->moveResultPseudoInsns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    .line 458
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 459
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    .line 460
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v1

    .line 463
    invoke-virtual {v1}, Ljava/util/BitSet;->cardinality()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    goto :goto_0

    .line 467
    :cond_1
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 469
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v1

    .line 475
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 476
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v4

    const/16 v7, 0x2b

    if-eq v4, v7, :cond_2

    goto :goto_0

    .line 480
    :cond_2
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    .line 481
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    .line 488
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v8

    .line 489
    iget-object v9, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v9, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    .line 490
    iget-object v10, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v10, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v10

    xor-int/lit8 v11, v10, 0x1

    and-int/2addr v11, v9

    if-eqz v11, :cond_3

    .line 492
    iget-object v10, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v10, v3}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v10

    .line 493
    invoke-direct {p0, v4, v10, v8}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)Z

    move-result v10

    :cond_3
    xor-int/lit8 v11, v9, 0x1

    and-int/2addr v11, v10

    if-eqz v11, :cond_4

    .line 496
    iget-object v9, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v9, v7}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v9

    .line 497
    invoke-direct {p0, v2, v9, v8}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)Z

    move-result v9

    :cond_4
    if-eqz v9, :cond_5

    if-nez v10, :cond_6

    .line 502
    :cond_5
    iget v9, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    invoke-direct {p0, v9, v8}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result v9

    .line 503
    new-instance v10, Ljava/util/ArrayList;

    const/4 v11, 0x2

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 505
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    :goto_1
    invoke-direct {p0, v10, v9, v8, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapRegs(Ljava/util/ArrayList;IIZ)Z

    move-result v2

    if-nez v2, :cond_6

    add-int/lit8 v9, v9, 0x1

    .line 509
    invoke-direct {p0, v9, v8}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result v9

    goto :goto_1

    .line 518
    :cond_6
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/Insn;->getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/dexmaker/dx/rop/type/TypeList;->size()I

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    move v5, v6

    .line 520
    :goto_2
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v2

    .line 521
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v3, v7}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v3

    if-eq v2, v3, :cond_0

    if-nez v5, :cond_0

    .line 523
    move-object v3, v1

    check-cast v3, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {p0, v1, v4}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->insertMoveBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-virtual {v3, v6, v4}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->changeOneSource(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 525
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-direct {p0, v1, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method private handleInvokeRangeInsns()V
    .locals 2

    .line 446
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->invokeRangeInsns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    .line 447
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->adjustAndMapSourceRangeRange(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private handleLocalAssociatedOther()V
    .locals 12

    .line 241
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 242
    iget v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    const/4 v3, 0x0

    move v4, v3

    .line 249
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    move v7, v3

    move v8, v6

    :goto_1
    if-ge v7, v5, :cond_2

    .line 251
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 252
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v10

    .line 253
    iget-object v11, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v9

    invoke-virtual {v11, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-nez v9, :cond_1

    if-le v10, v8, :cond_1

    move v8, v10

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 259
    :cond_2
    invoke-direct {p0, v2, v8}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findRopRegForLocal(II)I

    move-result v2

    .line 260
    invoke-direct {p0, v1, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->canMapRegs(Ljava/util/ArrayList;I)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 261
    invoke-direct {p0, v1, v2, v8, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapRegs(Ljava/util/ArrayList;IIZ)Z

    move-result v4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_4
    return-void
.end method

.method private handleLocalAssociatedParams()V
    .locals 7

    .line 180
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 181
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    move v5, v3

    move v3, v4

    :goto_1
    if-ge v3, v2, :cond_1

    .line 187
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 188
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v6

    .line 190
    invoke-direct {p0, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->getParameterIndexForReg(I)I

    move-result v6

    if-ltz v6, :cond_0

    .line 193
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v4

    .line 194
    invoke-direct {p0, v5, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V

    move v5, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    move v5, v6

    goto :goto_1

    :cond_1
    :goto_2
    if-gez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    .line 205
    invoke-direct {p0, v1, v5, v4, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapRegs(Ljava/util/ArrayList;IIZ)Z

    goto :goto_0

    :cond_3
    return-void
.end method

.method private handleNormalUnassociated()V
    .locals 6

    .line 543
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 546
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    .line 551
    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->getDefinitionSpecForSsaReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_2

    .line 555
    :cond_1
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v3

    .line 557
    iget v4, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    invoke-direct {p0, v4, v3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result v4

    .line 558
    :goto_1
    invoke-direct {p0, v2, v4}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->canMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z

    move-result v5

    if-nez v5, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 559
    invoke-direct {p0, v4, v3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result v4

    goto :goto_1

    .line 562
    :cond_2
    invoke-direct {p0, v2, v4}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private handlePhiInsns()V
    .locals 2

    .line 534
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->phiInsns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    .line 535
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->processPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private handleUnassociatedParameters()V
    .locals 4

    .line 425
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 428
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 433
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->getParameterIndexForReg(I)I

    move-result v2

    .line 435
    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->getDefinitionSpecForSsaReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    if-ltz v2, :cond_1

    .line 437
    invoke-direct {p0, v3, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private isThisPointerReg(I)Z
    .locals 0

    if-nez p1, :cond_0

    .line 361
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->isStatic()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private markReserved(II)V
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    add-int/2addr p2, p1

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Ljava/util/BitSet;->set(IIZ)V

    return-void
.end method

.method private printLocalVars()V
    .locals 7

    .line 159
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Printing local vars"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->localVariables:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 162
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x7b

    .line 164
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    const/16 v6, 0x76

    .line 167
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/16 v3, 0x7d

    .line 171
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 172
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "Local: %s Registers: %s\n"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    invoke-virtual {v3, v4, v5}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private processPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 9

    .line 1017
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 1018
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    .line 1019
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v2

    .line 1021
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 1022
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v3

    .line 1025
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1028
    new-instance v5, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;

    add-int/lit8 v6, v3, 0x1

    invoke-direct {v5, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;-><init>(I)V

    .line 1034
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 1035
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->add(I)V

    goto :goto_0

    .line 1037
    :cond_0
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_2

    .line 1041
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    .line 1042
    iget-object v7, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v6

    invoke-virtual {v7, v6}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v6

    .line 1043
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    .line 1044
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    .line 1050
    iget-object v8, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v8, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 1051
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    invoke-virtual {v6, v7}, Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;->oldToNew(I)I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->add(I)V

    goto :goto_2

    .line 1053
    :cond_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move p1, v0

    .line 1058
    :goto_3
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->getSize()I

    move-result v1

    if-ge p1, v1, :cond_3

    .line 1059
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->getAndRemoveHighestCount()I

    move-result v1

    .line 1060
    invoke-direct {p0, v4, v1, v2, v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapRegs(Ljava/util/ArrayList;IIZ)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 1064
    :cond_3
    iget p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    invoke-direct {p0, p1, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result p1

    .line 1065
    :goto_4
    invoke-direct {p0, v4, p1, v2, v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapRegs(Ljava/util/ArrayList;IIZ)Z

    move-result v1

    if-nez v1, :cond_4

    add-int/lit8 p1, p1, 0x1

    .line 1066
    invoke-direct {p0, p1, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->findNextUnreservedRopReg(II)I

    move-result p1

    goto :goto_4

    :cond_4
    return-void
.end method

.method private rangeContainsReserved(II)Z
    .locals 2

    move v0, p1

    :goto_0
    add-int v1, p1, p2

    if-ge v0, v1, :cond_1

    .line 345
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->reservedRopRegs:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private spansParamRange(II)Z
    .locals 1

    .line 611
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->paramRangeEnd:I

    if-ge p1, v0, :cond_0

    add-int/2addr p1, p2

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private tryMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)Z
    .locals 1

    .line 315
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v0

    if-gt v0, p3, :cond_0

    iget-object p3, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->canMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 318
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->addMapping(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private tryMapRegs(Ljava/util/ArrayList;IIZ)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;IIZ)Z"
        }
    .end annotation

    .line 287
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 288
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->ssaRegsMapped:Ljava/util/BitSet;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 293
    :cond_1
    invoke-direct {p0, v2, p2, p3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->tryMapReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v0

    goto :goto_2

    :cond_3
    :goto_1
    move v1, v3

    :goto_2
    if-eqz v4, :cond_0

    if-eqz p4, :cond_0

    .line 298
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v2

    invoke-direct {p0, p2, v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->markReserved(II)V

    goto :goto_0

    :cond_4
    xor-int/lit8 p1, v1, 0x1

    return p1
.end method


# virtual methods
.method public allocateRegisters()Lcom/google/dexmaker/dx/ssa/RegisterMapper;
    .locals 1

    .line 123
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->analyzeInstructions()V

    .line 130
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handleLocalAssociatedParams()V

    .line 133
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handleUnassociatedParameters()V

    .line 136
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handleInvokeRangeInsns()V

    .line 141
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handleLocalAssociatedOther()V

    .line 144
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handleCheckCastResults()V

    .line 147
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handlePhiInsns()V

    .line 150
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->handleNormalUnassociated()V

    .line 152
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->mapper:Lcom/google/dexmaker/dx/ssa/InterferenceRegisterMapper;

    return-object v0
.end method

.method ssaSetToSpecs(Lcom/google/dexmaker/dx/util/IntSet;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
    .locals 4

    .line 980
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/IntSet;->elements()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 982
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/IntSet;->iterator()Lcom/google/dexmaker/dx/util/IntIterator;

    move-result-object p1

    const/4 v1, 0x0

    .line 985
    :goto_0
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/IntIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 986
    invoke-interface {p1}, Lcom/google/dexmaker/dx/util/IntIterator;->next()I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->getDefinitionSpecForSsaReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->set(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public wantsParamsMovedHigh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
