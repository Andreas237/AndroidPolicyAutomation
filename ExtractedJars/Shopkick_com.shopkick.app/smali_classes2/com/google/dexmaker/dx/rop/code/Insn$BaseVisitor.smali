.class public Lcom/google/dexmaker/dx/rop/code/Insn$BaseVisitor;
.super Ljava/lang/Object;
.source "Insn.java"

# interfaces
.implements Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/rop/code/Insn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BaseVisitor"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 425
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitFillArrayDataInsn(Lcom/google/dexmaker/dx/rop/code/FillArrayDataInsn;)V
    .locals 0

    return-void
.end method

.method public visitPlainCstInsn(Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;)V
    .locals 0

    return-void
.end method

.method public visitPlainInsn(Lcom/google/dexmaker/dx/rop/code/PlainInsn;)V
    .locals 0

    return-void
.end method

.method public visitSwitchInsn(Lcom/google/dexmaker/dx/rop/code/SwitchInsn;)V
    .locals 0

    return-void
.end method

.method public visitThrowingCstInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;)V
    .locals 0

    return-void
.end method

.method public visitThrowingInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;)V
    .locals 0

    return-void
.end method
