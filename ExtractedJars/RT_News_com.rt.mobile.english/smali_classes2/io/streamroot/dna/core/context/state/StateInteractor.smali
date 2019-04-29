.class public final Lio/streamroot/dna/core/context/state/StateInteractor;
.super Ljava/lang/Object;
.source "StateInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/state/StateInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;)V",
        "name",
        "",
        "onReady",
        "",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateInteractor;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    iput-object p2, p0, Lio/streamroot/dna/core/context/state/StateInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-void
.end method


# virtual methods
.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "StateInteractor"

    return-object v0
.end method

.method public final onReady()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 20
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/context/state/StateInteractor;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    sget-object v1, Lio/streamroot/dna/core/State;->RUNNING:Lio/streamroot/dna/core/State;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 22
    iget-object v1, p0, Lio/streamroot/dna/core/context/state/StateInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
