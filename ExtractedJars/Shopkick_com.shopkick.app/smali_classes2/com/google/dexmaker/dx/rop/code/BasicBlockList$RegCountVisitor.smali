.class Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;
.super Ljava/lang/Object;
.source "BasicBlockList.java"

# interfaces
.implements Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/rop/code/BasicBlockList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RegCountVisitor"
.end annotation


# instance fields
.field private regCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 320
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 321
    iput v0, p0, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    return-void
.end method

.method private processReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 389
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getNextReg()I

    move-result p1

    .line 391
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    if-le p1, v0, :cond_0

    .line 392
    iput p1, p0, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    :cond_0
    return-void
.end method

.method private visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V
    .locals 3

    .line 369
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 372
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->processReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 375
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 376
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 379
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->processReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getRegCount()I
    .locals 1

    .line 330
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    return v0
.end method

.method public visitFillArrayDataInsn(Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;)V
    .locals 0

    .line 360
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitPlainCstInsn(Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;)V
    .locals 0

    .line 340
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitPlainInsn(Lcom/google/dexmaker/dx/rop/code/PlainInsn;)V
    .locals 0

    .line 335
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitSwitchInsn(Lcom/google/dexmaker/dx/rop/code/SwitchInsn;)V
    .locals 0

    .line 345
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitThrowingCstInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;)V
    .locals 0

    .line 350
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitThrowingInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;)V
    .locals 0

    .line 355
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method
