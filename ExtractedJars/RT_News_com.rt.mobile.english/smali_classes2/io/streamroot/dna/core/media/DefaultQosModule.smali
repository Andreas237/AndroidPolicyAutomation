.class public final Lio/streamroot/dna/core/media/DefaultQosModule;
.super Lio/streamroot/dna/core/QosModule;
.source "DefaultQosModule.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/media/DefaultQosModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u000c2\u00020\u00012\u00020\u0002:\u0001\u000cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/streamroot/dna/core/media/DefaultQosModule;",
        "Lio/streamroot/dna/core/QosModule;",
        "Ljava/lang/AutoCloseable;",
        "player",
        "Lio/streamroot/dna/core/media/PlayerWrapper;",
        "dnaCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/CoroutineContext;)V",
        "qosJob",
        "Lkotlinx/coroutines/Job;",
        "close",
        "",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/media/DefaultQosModule$Companion;

.field private static final ERROR_MARGIN_RATIO:D = 0.5

.field private static final refreshDelayInMs:J = 0x3e8L


# instance fields
.field private final player:Lio/streamroot/dna/core/media/PlayerWrapper;

.field private final qosJob:Lkotlinx/coroutines/Job;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/media/DefaultQosModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/media/DefaultQosModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/media/DefaultQosModule;->Companion:Lio/streamroot/dna/core/media/DefaultQosModule$Companion;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/CoroutineContext;)V
    .locals 6
    .param p1    # Lio/streamroot/dna/core/media/PlayerWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnaCoroutineContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Lio/streamroot/dna/core/QosModule;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/media/DefaultQosModule;->player:Lio/streamroot/dna/core/media/PlayerWrapper;

    .line 21
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p2, p1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    new-instance p1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;-><init>(Lio/streamroot/dna/core/media/DefaultQosModule;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/media/DefaultQosModule;->qosJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getPlayer$p(Lio/streamroot/dna/core/media/DefaultQosModule;)Lio/streamroot/dna/core/media/PlayerWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object p0, p0, Lio/streamroot/dna/core/media/DefaultQosModule;->player:Lio/streamroot/dna/core/media/PlayerWrapper;

    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 58
    iget-object v0, p0, Lio/streamroot/dna/core/media/DefaultQosModule;->qosJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    return-void
.end method
