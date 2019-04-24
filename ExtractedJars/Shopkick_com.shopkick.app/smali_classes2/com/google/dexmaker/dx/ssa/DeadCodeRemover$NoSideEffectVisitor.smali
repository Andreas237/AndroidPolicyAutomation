.class Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;
.super Ljava/lang/Object;
.source "DeadCodeRemover.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NoSideEffectVisitor"
.end annotation


# instance fields
.field noSideEffectRegs:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljava/util/BitSet;)V
    .locals 0

    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;->noSideEffectRegs:Ljava/util/BitSet;

    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 1

    .line 251
    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->access$000(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;->noSideEffectRegs:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 1

    .line 266
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 267
    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->access$000(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    .line 268
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;->noSideEffectRegs:Ljava/util/BitSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 1

    .line 259
    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->access$000(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;->noSideEffectRegs:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method
