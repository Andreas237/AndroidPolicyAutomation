.class Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2$1;
.super Ljava/lang/Object;
.source "EscapeAnalysis.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;->visitBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;)V
    .locals 0

    .line 695
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2$1;->this$1:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 1

    .line 705
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2$1;->this$1:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;

    iget-object v0, v0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;->this$0:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;

    invoke-static {v0, p1}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->access$100(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 0

    return-void
.end method
