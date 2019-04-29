.class final Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ActivationRequests.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->injectedConfRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lokhttp3/Request;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "Lokhttp3/Request;",
        "availabilityZone",
        "",
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
    c = "io/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2"
    f = "ActivationRequests.kt"
    i = {}
    l = {
        0x76
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $backendUrl:Lokhttp3/HttpUrl;

.field final synthetic $sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

.field label:I

.field private p$0:Ljava/lang/String;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iput-object p2, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->$backendUrl:Lokhttp3/HttpUrl;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iget-object v2, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->$backendUrl:Lokhttp3/HttpUrl;

    invoke-direct {v0, v1, v2, p2}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;-><init>(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Ljava/lang/String;

    iput-object p1, v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->p$0:Ljava/lang/String;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 118
    iget v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->label:I

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->p$0:Ljava/lang/String;

    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;->$backendUrl:Lokhttp3/HttpUrl;

    invoke-static {v0, v1, p1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->access$buildInjectedConfRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object p1

    return-object p1
.end method
