.class Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;
.super Ljava/lang/Object;
.source "EscapeAnalysis.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;)V
    .locals 0

    .line 692
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;->this$0:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 0

    .line 695
    new-instance p2, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2$1;

    invoke-direct {p2, p0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2$1;-><init>(Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$2;)V

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    return-void
.end method
