.class Lcom/google/dexmaker/dx/ssa/SsaMethod$2;
.super Ljava/lang/Object;
.source "SsaMethod.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/SsaMethod;->buildUseList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/SsaMethod;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;->this$0:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addToUses(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 5

    .line 470
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 471
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 474
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;->this$0:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-static {v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->access$100(Lcom/google/dexmaker/dx/ssa/SsaMethod;)[Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    aget-object v3, v3, v4

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 455
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;->addToUses(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 463
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;->addToUses(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 0

    .line 459
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;->addToUses(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method
