.class Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;
.super Lcom/google/dexmaker/dx/ssa/RegisterMapper;
.source "SsaRenamer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RenamingMapper"
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;->this$1:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;-><init>()V

    return-void
.end method


# virtual methods
.method public getNewRegisterCount()I
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;->this$1:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;

    iget-object v0, v0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$100(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I

    move-result v0

    return v0
.end method

.method public map(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 342
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 358
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;->this$1:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;

    invoke-static {v1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->access$200(Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;)[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    aget-object v0, v1, v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    return-object p1
.end method
