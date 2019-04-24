.class Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;
.super Ljava/lang/Object;
.source "MoveParamCombiner.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;

.field final synthetic val$deletedInsns:Ljava/util/HashSet;

.field final synthetic val$paramSpecs:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;

    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->val$paramSpecs:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    iput-object p3, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->val$deletedInsns:Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 5

    .line 68
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    return-void

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;

    invoke-static {v0, p1}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->access$000(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)I

    move-result v0

    .line 74
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->val$paramSpecs:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    aget-object v2, v1, v0

    if-nez v2, :cond_1

    .line 75
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    aput-object p1, v1, v0

    goto :goto_2

    .line 77
    :cond_1
    aget-object v0, v1, v0

    .line 78
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    .line 79
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v2

    .line 80
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v3

    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v3, :cond_3

    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 101
    :goto_0
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;

    invoke-static {v3}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->access$100(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->setResultLocal(Lcom/google/dexmaker/dx/rop/code/LocalItem;)V

    .line 108
    new-instance v2, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1$1;

    invoke-direct {v2, p0, v1, v0}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1$1;-><init>(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 124
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->access$100(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object v0

    .line 128
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_4

    .line 129
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 130
    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 133
    :cond_4
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;->val$deletedInsns:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_2
    return-void

    :cond_5
    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 0

    return-void
.end method
