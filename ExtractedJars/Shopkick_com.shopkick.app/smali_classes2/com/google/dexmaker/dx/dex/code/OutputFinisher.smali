.class public final Lcom/google/dexmaker/dx/dex/code/OutputFinisher;
.super Ljava/lang/Object;
.source "OutputFinisher.java"


# instance fields
.field private final dexOptions:Lcom/google/dexmaker/dx/dex/DexOptions;

.field private hasAnyLocalInfo:Z

.field private hasAnyPositionInfo:Z

.field private insns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/DalvInsn;",
            ">;"
        }
    .end annotation
.end field

.field private reservedCount:I

.field private final unreservedRegCount:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/DexOptions;II)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->dexOptions:Lcom/google/dexmaker/dx/dex/DexOptions;

    .line 79
    iput p3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->unreservedRegCount:I

    .line 80
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    const/4 p1, -0x1

    .line 81
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    const/4 p1, 0x0

    .line 82
    iput-boolean p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyPositionInfo:Z

    .line 83
    iput-boolean p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyLocalInfo:Z

    return-void
.end method

.method private static addConstants(Ljava/util/HashSet;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;",
            "Lcom/google/dexmaker/dx/dex/code/DalvInsn;",
            ")V"
        }
    .end annotation

    .line 171
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    if-eqz v0, :cond_0

    .line 172
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    .line 173
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 174
    :cond_0
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;

    if-eqz v0, :cond_1

    .line 175
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;->getLocals()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    .line 176
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 178
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->addConstants(Ljava/util/HashSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 180
    :cond_1
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    if-eqz v0, :cond_2

    .line 181
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/LocalStart;->getLocal()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    .line 182
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->addConstants(Ljava/util/HashSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private static addConstants(Ljava/util/HashSet;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 199
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v0

    .line 200
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v1

    .line 201
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->getSignature()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    .line 202
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    .line 204
    sget-object v2, Lcom/google/dexmaker/dx/rop/type/Type;->KNOWN_NULL:Lcom/google/dexmaker/dx/rop/type/Type;

    if-eq p1, v2, :cond_1

    .line 205
    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v1, :cond_2

    .line 209
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v0, :cond_3

    .line 213
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method private assignAddresses()V
    .locals 4

    .line 658
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 661
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 662
    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->setAddress(I)V

    .line 663
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->codeSize()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private assignAddressesAndFixBranches()V
    .locals 1

    .line 645
    :cond_0
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->assignAddresses()V

    .line 646
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->fixBranches()Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method private static assignIndices(Lcom/google/dexmaker/dx/dex/code/CstInsn;Lcom/google/dexmaker/dx/dex/code/DalvCode$AssignIndicesCallback;)V
    .locals 2

    .line 316
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v0

    .line 317
    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode$AssignIndicesCallback;->getIndex(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result v1

    if-ltz v1, :cond_0

    .line 320
    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->setIndex(I)V

    .line 323
    :cond_0
    instance-of v1, v0, Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;

    if-eqz v1, :cond_1

    .line 324
    check-cast v0, Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;

    .line 325
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    .line 326
    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/dex/code/DalvCode$AssignIndicesCallback;->getIndex(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 328
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->setClassIndex(I)V

    :cond_1
    return-void
.end method

.method private calculateReservedCount([Lcom/google/dexmaker/dx/dex/code/Dop;)I
    .locals 6

    .line 447
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 455
    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 458
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 459
    aget-object v4, p1, v2

    .line 460
    invoke-direct {p0, v3, v4}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->findOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v5

    if-nez v5, :cond_0

    .line 467
    invoke-direct {p0, v3}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->findExpandedOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v4

    .line 468
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/Dop;->getFormat()Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->compatibleRegs(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/util/BitSet;

    move-result-object v4

    .line 469
    invoke-virtual {v3, v4}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getMinimumRegisterRequirement(Ljava/util/BitSet;)I

    move-result v3

    if-le v3, v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_0
    if-ne v4, v5, :cond_1

    goto :goto_2

    .line 477
    :cond_1
    :goto_1
    aput-object v5, p1, v2

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private findExpandedOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Lcom/google/dexmaker/dx/dex/code/Dop;
    .locals 3

    .line 524
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getLowRegVersion()Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->findOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 526
    :cond_0
    new-instance v0, Lcom/google/dexmaker/dx/util/DexException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No expanded opcode for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/dexmaker/dx/util/DexException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private findOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/Dop;
    .locals 1

    :goto_0
    if-eqz p2, :cond_1

    .line 506
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/Dop;->getFormat()Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->isCompatible(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->dexOptions:Lcom/google/dexmaker/dx/dex/DexOptions;

    invoke-static {p2, v0}, Lcom/google/dexmaker/dx/dex/code/Dops;->getNextOrNull(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/dex/DexOptions;)Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object p2

    goto :goto_0

    :cond_1
    :goto_1
    return-object p2
.end method

.method private fixBranches()Z
    .locals 11

    .line 679
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    .line 683
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 684
    instance-of v4, v3, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    const/4 v5, 0x1

    if-nez v4, :cond_0

    goto :goto_2

    .line 689
    :cond_0
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v4

    .line 690
    move-object v6, v3

    check-cast v6, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    .line 692
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/Dop;->getFormat()Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->branchFits(Lcom/google/dexmaker/dx/dex/code/TargetInsn;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_2

    .line 696
    :cond_1
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/Dop;->getFamily()I

    move-result v2

    const/16 v7, 0x28

    if-ne v2, v7, :cond_3

    .line 698
    invoke-direct {p0, v3, v4}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->findOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 707
    iget-object v4, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->withOpcode(Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 705
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "method too long"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 728
    :cond_3
    :try_start_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/code/CodeAddress;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 737
    new-instance v4, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    sget-object v7, Lcom/google/dexmaker/dx/dex/code/Dops;->GOTO:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v8

    sget-object v9, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getTarget()Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    move-result-object v10

    invoke-direct {v4, v7, v8, v9, v10}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/dex/code/CodeAddress;)V

    .line 740
    iget-object v7, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v7, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 741
    iget-object v4, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->withNewTargetAndReversed(Lcom/google/dexmaker/dx/dex/code/CodeAddress;)Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    move v1, v3

    :goto_1
    move v2, v5

    :goto_2
    add-int/2addr v1, v5

    goto :goto_0

    .line 735
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "unpaired TargetInsn"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 731
    :catch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "unpaired TargetInsn (dangling)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    return v2
.end method

.method private static hasLocalInfo(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z
    .locals 5

    .line 115
    instance-of v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 116
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;->getLocals()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->size()I

    move-result v0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_2

    .line 119
    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-static {v4}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasLocalInfo(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 123
    :cond_1
    instance-of v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    if-eqz v0, :cond_2

    .line 124
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalStart;->getLocal()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    .line 125
    invoke-static {p0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasLocalInfo(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method private static hasLocalInfo(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 142
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private makeOpcodesArray()[Lcom/google/dexmaker/dx/dex/code/Dop;
    .locals 4

    .line 375
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 376
    new-array v1, v0, [Lcom/google/dexmaker/dx/dex/code/Dop;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 379
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private massageInstructions([Lcom/google/dexmaker/dx/dex/code/Dop;)V
    .locals 5

    .line 554
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    if-nez v0, :cond_1

    .line 562
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 565
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 566
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v3

    .line 567
    aget-object v4, p1, v1

    if-eq v3, v4, :cond_0

    .line 570
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->withOpcode(Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 578
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->performExpansion([Lcom/google/dexmaker/dx/dex/code/Dop;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    :cond_2
    return-void
.end method

.method private performExpansion([Lcom/google/dexmaker/dx/dex/code/Dop;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/dexmaker/dx/dex/code/Dop;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/DalvInsn;",
            ">;"
        }
    .end annotation

    .line 594
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 595
    new-instance v1, Ljava/util/ArrayList;

    mul-int/lit8 v2, v0, 0x2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 598
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 599
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v4

    .line 600
    aget-object v5, p1, v2

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    move-object v8, v6

    goto :goto_1

    .line 610
    :cond_0
    invoke-direct {p0, v3}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->findExpandedOpcodeForInsn(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v5

    .line 611
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/dex/code/Dop;->getFormat()Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->compatibleRegs(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/util/BitSet;

    move-result-object v6

    .line 613
    invoke-virtual {v3, v6}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->expandedPrefix(Ljava/util/BitSet;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v7

    .line 614
    invoke-virtual {v3, v6}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->expandedSuffix(Ljava/util/BitSet;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v8

    .line 617
    invoke-virtual {v3, v6}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->expandedVersion(Ljava/util/BitSet;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v3

    move-object v6, v7

    :goto_1
    if-eqz v6, :cond_1

    .line 621
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eq v5, v4, :cond_2

    .line 625
    invoke-virtual {v3, v5}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->withOpcode(Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v3

    .line 627
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v8, :cond_3

    .line 630
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method private reserveRegisters([Lcom/google/dexmaker/dx/dex/code/Dop;)V
    .locals 7

    .line 396
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    move v0, v1

    .line 403
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->calculateReservedCount([Lcom/google/dexmaker/dx/dex/code/Dop;)I

    move-result v2

    if-lt v0, v2, :cond_1

    .line 432
    iput v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    return-void

    :cond_1
    sub-int v0, v2, v0

    .line 409
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_3

    .line 419
    iget-object v5, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 420
    instance-of v6, v5, Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    if-nez v6, :cond_2

    .line 425
    iget-object v6, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->withRegisterOffset(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v5

    invoke-virtual {v6, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method private updateInfo(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 2

    .line 245
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyPositionInfo:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 246
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v0

    .line 247
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->getLine()I

    move-result v0

    if-ltz v0, :cond_0

    .line 248
    iput-boolean v1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyPositionInfo:Z

    .line 252
    :cond_0
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyLocalInfo:Z

    if-nez v0, :cond_1

    .line 253
    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasLocalInfo(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 254
    iput-boolean v1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyLocalInfo:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public add(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->updateInfo(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V

    return-void
.end method

.method public assignIndices(Lcom/google/dexmaker/dx/dex/code/DalvCode$AssignIndicesCallback;)V
    .locals 3

    .line 300
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 301
    instance-of v2, v1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    if-eqz v2, :cond_0

    .line 302
    check-cast v1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-static {v1, p1}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->assignIndices(Lcom/google/dexmaker/dx/dex/code/CstInsn;Lcom/google/dexmaker/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public finishProcessingAndGetList()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;
    .locals 3

    .line 354
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    if-gez v0, :cond_0

    .line 358
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->makeOpcodesArray()[Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v0

    .line 359
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reserveRegisters([Lcom/google/dexmaker/dx/dex/code/Dop;)V

    .line 360
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->massageInstructions([Lcom/google/dexmaker/dx/dex/code/Dop;)V

    .line 361
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->assignAddressesAndFixBranches()V

    .line 363
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->reservedCount:I

    iget v2, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->unreservedRegCount:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->makeImmutable(Ljava/util/ArrayList;I)Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object v0

    return-object v0

    .line 355
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "already processed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getAllConstants()Ljava/util/HashSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation

    .line 153
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 155
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    .line 156
    invoke-static {v0, v2}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->addConstants(Ljava/util/HashSet;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public hasAnyLocalInfo()Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyLocalInfo:Z

    return v0
.end method

.method public hasAnyPositionInfo()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->hasAnyPositionInfo:Z

    return v0
.end method

.method public insert(ILcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 235
    invoke-direct {p0, p2}, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->updateInfo(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V

    return-void
.end method

.method public reverseBranch(ILcom/google/dexmaker/dx/dex/code/CodeAddress;)V
    .locals 2

    .line 271
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 276
    :try_start_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/code/TargetInsn;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/OutputFinisher;->insns:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->withNewTargetAndReversed(Lcom/google/dexmaker/dx/dex/code/CodeAddress;)Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 282
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "non-reversible instruction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 279
    :catch_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "too few instructions"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
