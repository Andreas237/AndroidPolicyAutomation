.class public final Lcom/google/dexmaker/dx/rop/code/PlainInsn;
.super Lcom/google/dexmaker/dx/rop/code/Insn;
.source "PlainInsn.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 68
    invoke-static {p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/dexmaker/dx/rop/code/Insn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 44
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p2

    packed-switch p2, :pswitch_data_0

    if-eqz p3, :cond_1

    .line 51
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 47
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus branchingness"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "can\'t mix branchingness with result"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 80
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;->visitPlainInsn(Lcom/google/dexmaker/dx/rop/code/PlainInsn;)V

    return-void
.end method

.method public getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;
    .locals 1

    .line 74
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-object v0
.end method

.method public withAddedCatch(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 1

    .line 86
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 3

    .line 152
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-object v0
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 5

    .line 92
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-object v0
.end method

.method public withSourceLiteral()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 9

    .line 100
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    add-int/lit8 v2, v1, -0x1

    .line 107
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v2

    .line 109
    invoke-interface {v2}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v2, 0x0

    .line 111
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 112
    invoke-interface {v2}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 113
    move-object v8, v2

    check-cast v8, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 114
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withoutFirst()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v7

    .line 115
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-static {v0, v1, v7, v8}, Lcom/google/dexmaker/dx/rop/code/Rops;->ropFor(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v4

    .line 117
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object v0

    :cond_1
    return-object p0

    .line 123
    :cond_2
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 125
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withoutLast()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v7

    .line 130
    :try_start_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_3

    .line 131
    instance-of v1, v2, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    if-eqz v1, :cond_3

    const/16 v0, 0xe

    .line 133
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result v1

    neg-int v1, v1

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->make(I)Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    move-result-object v2

    move-object v8, v2

    goto :goto_0

    :cond_3
    move-object v8, v2

    .line 135
    :goto_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-static {v0, v1, v7, v8}, Lcom/google/dexmaker/dx/rop/code/Rops;->ropFor(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object v0

    :catch_0
    return-object p0
.end method
