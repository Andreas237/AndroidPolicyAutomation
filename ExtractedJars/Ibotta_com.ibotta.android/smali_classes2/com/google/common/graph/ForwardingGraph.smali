.class abstract Lcom/google/common/graph/ForwardingGraph;
.super Lcom/google/common/graph/AbstractGraph;
.source "ForwardingGraph.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<N:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/graph/AbstractGraph<",
        "TN;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/google/common/graph/AbstractGraph;-><init>()V

    return-void
.end method


# virtual methods
.method public adjacentNodes(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)",
            "Ljava/util/Set<",
            "TN;>;"
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/graph/BaseGraph;->adjacentNodes(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public allowsSelfLoops()Z
    .locals 1

    .line 48
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/graph/BaseGraph;->allowsSelfLoops()Z

    move-result v0

    return v0
.end method

.method public degree(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)I"
        }
    .end annotation

    .line 73
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/graph/BaseGraph;->degree(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method protected abstract delegate()Lcom/google/common/graph/BaseGraph;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/graph/BaseGraph<",
            "TN;>;"
        }
    .end annotation
.end method

.method public edges()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/common/graph/EndpointPair<",
            "TN;>;>;"
        }
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/graph/BaseGraph;->edges()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public inDegree(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)I"
        }
    .end annotation

    .line 78
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/graph/BaseGraph;->inDegree(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isDirected()Z
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/graph/BaseGraph;->isDirected()Z

    move-result v0

    return v0
.end method

.method public nodeOrder()Lcom/google/common/graph/ElementOrder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/graph/ElementOrder<",
            "TN;>;"
        }
    .end annotation

    .line 53
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/graph/BaseGraph;->nodeOrder()Lcom/google/common/graph/ElementOrder;

    move-result-object v0

    return-object v0
.end method

.method public nodes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TN;>;"
        }
    .end annotation

    .line 33
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/graph/BaseGraph;->nodes()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public outDegree(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)I"
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/graph/BaseGraph;->outDegree(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public predecessors(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)",
            "Ljava/util/Set<",
            "TN;>;"
        }
    .end annotation

    .line 63
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/graph/BaseGraph;->predecessors(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public successors(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)",
            "Ljava/util/Set<",
            "TN;>;"
        }
    .end annotation

    .line 68
    invoke-virtual {p0}, Lcom/google/common/graph/ForwardingGraph;->delegate()Lcom/google/common/graph/BaseGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/common/graph/BaseGraph;->successors(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
