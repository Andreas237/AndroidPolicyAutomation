.class public interface abstract Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;
.super Ljava/lang/Object;
.source "Insn.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/rop/code/Insn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Visitor"
.end annotation


# virtual methods
.method public abstract visitFillArrayDataInsn(Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;)V
.end method

.method public abstract visitPlainCstInsn(Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;)V
.end method

.method public abstract visitPlainInsn(Lcom/google/dexmaker/dx/rop/code/PlainInsn;)V
.end method

.method public abstract visitSwitchInsn(Lcom/google/dexmaker/dx/rop/code/SwitchInsn;)V
.end method

.method public abstract visitThrowingCstInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;)V
.end method

.method public abstract visitThrowingInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;)V
.end method
