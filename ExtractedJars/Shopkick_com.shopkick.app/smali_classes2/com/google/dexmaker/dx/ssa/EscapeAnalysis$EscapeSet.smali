.class Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;
.super Ljava/lang/Object;
.source "EscapeAnalysis.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EscapeSet"
.end annotation


# instance fields
.field childSets:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;",
            ">;"
        }
    .end annotation
.end field

.field escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

.field parentSets:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;",
            ">;"
        }
    .end annotation
.end field

.field regSet:Ljava/util/BitSet;

.field replaceableArray:Z


# direct methods
.method constructor <init>(IILcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 77
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V

    .line 78
    iput-object p3, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeState;

    .line 79
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 80
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p0, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    return-void
.end method
