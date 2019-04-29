.class public Lkotlin/reflect/jvm/internal/impl/utils/DFS;
.super Ljava/lang/Object;
.source "DFS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandlerWithListResult;,
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler;,
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet;,
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$AbstractNodeHandler;,
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;,
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;,
        Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;
    }
.end annotation


# direct methods
.method public static dfs(Ljava/util/Collection;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler<",
            "TN;TR;>;)TR;"
        }
    .end annotation

    .line 37
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet;-><init>()V

    invoke-static {p0, p1, v0, p2}, Lkotlin/reflect/jvm/internal/impl/utils/DFS;->dfs(Ljava/util/Collection;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static dfs(Ljava/util/Collection;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler<",
            "TN;TR;>;)TR;"
        }
    .end annotation

    .line 26
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 27
    invoke-static {v0, p1, p2, p3}, Lkotlin/reflect/jvm/internal/impl/utils/DFS;->doDfs(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)V

    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p3}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;->result()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static doDfs(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)V
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Ljava/lang/Object;",
            ">(TN;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler<",
            "TN;*>;)V"
        }
    .end annotation

    .line 95
    invoke-interface {p2, p0}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;->checkAndMarkVisited(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 96
    :cond_0
    invoke-interface {p3, p0}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;->beforeChildren(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 98
    :cond_1
    invoke-interface {p1, p0}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;->getNeighbors(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 99
    invoke-static {v1, p1, p2, p3}, Lkotlin/reflect/jvm/internal/impl/utils/DFS;->doDfs(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Visited;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)V

    goto :goto_0

    .line 101
    :cond_2
    invoke-interface {p3, p0}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;->afterChildren(Ljava/lang/Object;)V

    return-void
.end method

.method public static ifAny(Ljava/util/Collection;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 2
    .param p0    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TN;>;",
            "Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors<",
            "TN;>;",
            "Lkotlin/jvm/functions/Function1<",
            "TN;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 45
    new-array v0, v0, [Z

    .line 47
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/utils/DFS$1;

    invoke-direct {v1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/utils/DFS$1;-><init>(Lkotlin/jvm/functions/Function1;[Z)V

    invoke-static {p0, p1, v1}, Lkotlin/reflect/jvm/internal/impl/utils/DFS;->dfs(Ljava/util/Collection;Lkotlin/reflect/jvm/internal/impl/utils/DFS$Neighbors;Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandler;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method
