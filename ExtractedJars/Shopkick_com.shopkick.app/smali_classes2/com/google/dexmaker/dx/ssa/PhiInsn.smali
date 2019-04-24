.class public final Lcom/google/dexmaker/dx/ssa/PhiInsn;
.super Lcom/google/dexmaker/dx/ssa/SsaInsn;
.source "PhiInsn.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;,
        Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;
    }
.end annotation


# instance fields
.field private final operands:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;",
            ">;"
        }
    .end annotation
.end field

.field private final ropResultReg:I

.field private sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;


# direct methods
.method public constructor <init>(ILcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 71
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->VOID:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 44
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 72
    iput p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->ropResultReg:I

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 44
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 57
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->ropResultReg:I

    return-void
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V
    .locals 0

    .line 323
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;->visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    return-void
.end method

.method public addPhiOperand(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 3

    .line 130
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabel()I

    move-result p2

    invoke-direct {v1, p1, v2, p2}, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;-><init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 134
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-void
.end method

.method public areAllOperandsEqual()Z
    .locals 5

    .line 248
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 253
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    iget-object v0, v0, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 254
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 255
    iget-object v4, v4, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    if-eq v0, v4, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public canThrow()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public changeResultType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)V
    .locals 1

    .line 109
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-static {v0, p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->setResult(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-void
.end method

.method public clone()Lcom/google/dexmaker/dx/ssa/PhiInsn;
    .locals 2

    .line 78
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "can\'t clone phi"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic clone()Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->clone()Lcom/google/dexmaker/dx/ssa/PhiInsn;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 32
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->clone()Lcom/google/dexmaker/dx/ssa/PhiInsn;

    move-result-object v0

    return-object v0
.end method

.method public getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRopResultReg()I
    .locals 1

    .line 119
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->ropResultReg:I

    return v0
.end method

.method public getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
    .locals 4

    .line 205
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    if-eqz v0, :cond_0

    return-object v0

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 211
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-object v0

    .line 214
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 215
    new-instance v1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;-><init>(I)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 218
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 220
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    iget-object v2, v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v3, v1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->set(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 223
    :cond_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->setImmutable()V

    .line 224
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-object v0
.end method

.method public hasSideEffect()Z
    .locals 1

    .line 317
    invoke-static {}, Lcom/google/dexmaker/dx/ssa/Optimizer;->getPreserveLocals()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPhiOrMove()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isRegASource(I)Z
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 236
    iget-object v1, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V
    .locals 4

    .line 266
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 267
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 268
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;->map(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    iput-object v3, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 269
    iget-object v3, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-eq v2, v3, :cond_0

    .line 270
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getParent()Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v3

    iget-object v1, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v3, p0, v2, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onSourceChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 273
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-void
.end method

.method public predBlockIndexForSourcesIndex(I)I
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    iget p1, p1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->blockIndex:I

    return p1
.end method

.method public predBlocksForReg(ILcom/google/dexmaker/dx/ssa/SsaMethod;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/dexmaker/dx/ssa/SsaMethod;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation

    .line 297
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 299
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 300
    iget-object v3, v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 301
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v3

    iget v2, v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->blockIndex:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public removePhiRegister(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 144
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 145
    iget-object v3, v2, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    if-ne v3, v4, :cond_0

    .line 146
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 150
    :cond_1
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    .line 153
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 328
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->toHumanWithInline(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final toHumanWithInline(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 339
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 341
    sget-object v1, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, ": phi"

    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p1, :cond_0

    const-string v1, "("

    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 346
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ")"

    .line 347
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 350
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, " ."

    .line 353
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    const-string v1, " "

    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 356
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toHuman()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_0
    const-string p1, " <-"

    .line 359
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 361
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result p1

    if-nez p1, :cond_2

    const-string p1, " ."

    .line 363
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_3

    const-string v2, " "

    .line 366
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {v3, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[b="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    iget v3, v3, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->ropLabel:I

    invoke-static {v3}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 373
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 2

    .line 284
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot convert phi insns to rop form"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public updateSourcesToDefinitions(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;

    .line 92
    iget-object v2, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 96
    iget-object v3, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    iput-object v2, v1, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 99
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-void
.end method
