.class Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;
.super Ljava/lang/Object;
.source "LiteralOpUpgrader.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;

.field final synthetic val$advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;

    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->val$advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 7

    .line 96
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    .line 98
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    .line 101
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;

    invoke-static {v2, p1}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->access$000(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 103
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    return-void

    .line 108
    :cond_1
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_3

    .line 112
    invoke-virtual {v1, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->access$100(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 113
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withoutFirst()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/RegOps;->flippedIfOpcode(I)I

    move-result v0

    invoke-static {v2, p1, v1, v0, v3}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->access$200(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    goto :goto_0

    .line 115
    :cond_2
    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->access$100(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 116
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withoutLast()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    invoke-static {v2, p1, v1, v0, v3}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->access$200(Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    goto :goto_0

    .line 119
    :cond_3
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->val$advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    invoke-virtual {v1, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    invoke-interface {v2, v0, v3, v6}, Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;->hasConstantOperation(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 121
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->upgradeToLiteral()V

    goto :goto_0

    .line 122
    :cond_4
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->isCommutative()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader$1;->val$advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v1, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v6

    invoke-interface {v2, v0, v3, v6}, Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;->hasConstantOperation(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 129
    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v1, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->setNewSources(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 133
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->upgradeToLiteral()V

    :cond_5
    :goto_0
    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 0

    return-void
.end method
