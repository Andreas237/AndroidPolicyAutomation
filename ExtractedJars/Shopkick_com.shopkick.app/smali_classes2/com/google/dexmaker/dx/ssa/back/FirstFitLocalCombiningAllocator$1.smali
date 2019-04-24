.class Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;
.super Ljava/lang/Object;
.source "FirstFitLocalCombiningAllocator.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->analyzeInstructions()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)V
    .locals 0

    .line 620
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private processInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 4

    .line 651
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 654
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v1

    .line 656
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    invoke-static {v2}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$000(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    if-nez v2, :cond_0

    .line 660
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 661
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    invoke-static {v3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$000(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    :cond_0
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    :cond_1
    instance-of v0, p1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    if-eqz v0, :cond_3

    .line 668
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v1, 0x38

    if-ne v0, v1, :cond_2

    .line 670
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$100(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 671
    :cond_2
    invoke-static {}, Lcom/google/dexmaker/dx/ssa/Optimizer;->getAdvice()Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;->requiresSourcesInOrder(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 674
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$200(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 676
    :cond_3
    instance-of v0, p1, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v0, :cond_4

    .line 677
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$300(Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 623
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->processInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 633
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->processInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 0

    .line 628
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->processInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method
