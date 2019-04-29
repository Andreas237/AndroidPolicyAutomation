.class final Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DnaContext.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/context/DnaContext;->asyncLoad$dna_core_release(Lokhttp3/HttpUrl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDnaContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DnaContext.kt\nio/streamroot/dna/core/context/DnaContext$asyncLoad$1\n*L\n1#1,100:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "dnaConfiguration",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "invoke",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io/streamroot/dna/core/context/DnaContext$asyncLoad$1"
    f = "DnaContext.kt"
    i = {}
    l = {
        0x38
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field private p$0:Lio/streamroot/dna/core/context/config/DnaConfiguration;

.field final synthetic this$0:Lio/streamroot/dna/core/context/DnaContext;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/context/DnaContext;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;

    iget-object v1, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;-><init>(Lio/streamroot/dna/core/context/DnaContext;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lio/streamroot/dna/core/context/config/DnaConfiguration;

    iput-object p1, v0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->p$0:Lio/streamroot/dna/core/context/config/DnaConfiguration;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 56
    iget v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->label:I

    if-eqz v0, :cond_0

    .line 75
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->p$0:Lio/streamroot/dna/core/context/config/DnaConfiguration;

    .line 58
    :try_start_0
    invoke-interface {p0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/JobKt;->isActive(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 60
    :cond_2
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/DnaContext;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v0

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->isQosTester()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lio/streamroot/dna/core/State;->QOS_TESTER:Lio/streamroot/dna/core/State;

    goto :goto_0

    :cond_3
    sget-object v1, Lio/streamroot/dna/core/State;->DNA_ACCESS_GRANTED:Lio/streamroot/dna/core/State;

    :goto_0
    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    .line 61
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->isQosTester()Z

    move-result v0

    if-nez v0, :cond_4

    .line 62
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    invoke-static {v0, p1}, Lio/streamroot/dna/core/context/DnaContext;->access$triggerLoadingTimeout(Lio/streamroot/dna/core/context/DnaContext;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 64
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    check-cast v0, Lio/streamroot/dna/core/context/bean/BeanStore;

    invoke-static {v0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerDnaBeans(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    goto :goto_1

    .line 67
    :cond_4
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/DnaContext;->disableDna()V

    .line 69
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    check-cast v0, Lio/streamroot/dna/core/context/bean/BeanStore;

    invoke-static {v0, p1}, Lio/streamroot/dna/core/context/injection/QosBeanInjectionKt;->registerQosTesterBeans(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 72
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;->this$0:Lio/streamroot/dna/core/context/DnaContext;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/DnaContext;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/State;->LOADING_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    .line 73
    invoke-interface {p0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v1, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v0, :cond_5

    invoke-interface {p0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    new-instance v2, Lio/streamroot/dna/core/context/loader/DnaInitializationException;

    const-string v3, "Dna initialization exception."

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Impossible to initialize properly DNA client, cause:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4, p1}, Lio/streamroot/dna/core/context/loader/DnaInitializationException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 75
    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
