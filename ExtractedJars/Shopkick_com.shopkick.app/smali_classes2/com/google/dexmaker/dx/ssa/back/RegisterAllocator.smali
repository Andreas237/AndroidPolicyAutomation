.class public abstract Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;
.super Ljava/lang/Object;
.source "RegisterAllocator.java"


# instance fields
.field protected final interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

.field protected final ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 55
    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    return-void
.end method


# virtual methods
.method public abstract allocateRegisters()Lcom/google/dexmaker/dx/ssa/RegisterMapper;
.end method

.method protected final getCategoryForSsaReg(I)I
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 88
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result p1

    return p1
.end method

.method protected final getDefinitionSpecForSsaReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected final insertMoveBefore(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 7

    .line 137
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v1

    .line 139
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_3

    .line 146
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_2

    .line 161
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->makeNewSsaReg()I

    move-result v3

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    .line 164
    new-instance v4, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v5

    invoke-static {v5}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMove(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v5

    sget-object v6, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    invoke-direct {v4, v5, v6, v3, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-static {v4, v0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->makeFromRop(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p2

    .line 169
    invoke-virtual {v1, v2, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 171
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    .line 178
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getLiveOutRegs()Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object v0

    .line 179
    invoke-interface {v0}, Lcom/google/dexmaker/dx/util/IntSet;->iterator()Lcom/google/dexmaker/dx/util/IntIterator;

    move-result-object v0

    .line 181
    :goto_0
    invoke-interface {v0}, Lcom/google/dexmaker/dx/util/IntIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 182
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/util/IntIterator;->next()I

    move-result v2

    invoke-virtual {v1, p2, v2}, Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;->add(II)V

    goto :goto_0

    .line 186
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 187
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    .line 190
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    invoke-virtual {v2, p2, v4}, Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;->add(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 193
    :cond_1
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnsChanged()V

    return-object v3

    .line 152
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Adding move here not supported:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->toHuman()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 142
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "specified insn is not in this block"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected isDefinitionMoveParam(I)Z
    .locals 2

    .line 113
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object p1

    .line 115
    instance-of v0, p1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 116
    check-cast p1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    .line 118
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method public abstract wantsParamsMovedHigh()Z
.end method
