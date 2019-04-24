.class public interface abstract Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;
.super Ljava/lang/Object;
.source "SsaInsn.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/SsaInsn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Visitor"
.end annotation


# virtual methods
.method public abstract visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
.end method

.method public abstract visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
.end method

.method public abstract visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
.end method
