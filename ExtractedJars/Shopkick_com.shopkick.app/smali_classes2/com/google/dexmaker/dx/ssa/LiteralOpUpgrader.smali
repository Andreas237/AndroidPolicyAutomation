.class public Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;
.super Ljava/lang/Object;
.source "LiteralOpUpgrader.java"


# instance fields
.field private final ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)Z
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->tryReplacingWithConstant(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 0

    .line 41
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->isConstIntZeroOrKnownNull(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-void
.end method

.method private static isConstIntZeroOrKnownNull(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 6

    .line 71
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p0

    .line 72
    instance-of v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 73
    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;

    .line 74
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getLongBits()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method public static process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 1

    .line 54
    new-instance v0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 56
    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->run()V

    return-void
.end method

.method private replacePlainInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 8

    .line 189
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    .line 190
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-static {p3, v1, p2, p4}, Lcom/google/dexmaker/dx/rop/code/Rops;->ropFor(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v3

    if-nez p4, :cond_0

    .line 193
    new-instance p3, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object p4

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-direct {p3, v3, p4, v0, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    goto :goto_0

    .line 196
    :cond_0
    new-instance p3, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    move-object v2, p3

    move-object v6, p2

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 199
    :goto_0
    new-instance p2, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 201
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p3

    .line 203
    iget-object p4, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p4, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnRemoved(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    .line 204
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p3, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 205
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnAdded(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method private run()V
    .locals 3

    .line 83
    invoke-static {}, Lcom/google/dexmaker/dx/ssa/Optimizer;->getAdvice()Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    move-result-object v0

    .line 85
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v2, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;

    invoke-direct {v2, p0, v0}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;-><init>(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;)V

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    return-void
.end method

.method private tryReplacingWithConstant(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)Z
    .locals 6

    .line 147
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    .line 149
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 151
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v3, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->isRegALocal(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    const/4 v3, 0x5

    if-eq v1, v3, :cond_1

    .line 153
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v1

    .line 154
    invoke-interface {v1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicType()I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_1

    .line 156
    sget-object v4, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/Constant;

    invoke-direct {p0, p1, v4, v3, v1}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    .line 160
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v1, 0x38

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    .line 161
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    .line 162
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    .line 164
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    .line 166
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v5, v1}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    :cond_0
    return v3

    :cond_1
    return v2
.end method
