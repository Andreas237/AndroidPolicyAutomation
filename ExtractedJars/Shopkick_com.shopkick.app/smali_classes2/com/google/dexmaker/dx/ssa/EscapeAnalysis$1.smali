.class Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;
.super Lcom/google/dexmaker/dx/ssa/RegisterMapper;
.source "EscapeAnalysis.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->movePropagate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;

.field final synthetic val$result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

.field final synthetic val$source:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 665
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;->this$0:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;

    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;->val$result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    iput-object p3, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;->val$source:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;-><init>()V

    return-void
.end method


# virtual methods
.method public getNewRegisterCount()I
    .locals 1

    .line 668
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;->this$0:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->access$000(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    return v0
.end method

.method public map(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    .line 673
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;->val$result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 674
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$1;->val$source:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object p1

    :cond_0
    return-object p1
.end method