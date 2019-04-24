.class Lcom/google/dexmaker/dx/ssa/SsaRenamer$1;
.super Ljava/lang/Object;
.source "SsaRenamer.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/SsaRenamer;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$1;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 167
    new-instance p2, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;

    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$1;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-direct {p2, v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;-><init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->process()V

    return-void
.end method
