.class final Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WebViewJavaScriptInterpreter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->interpretString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
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
    c = "io/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2"
    f = "WebViewJavaScriptInterpreter.kt"
    i = {}
    l = {
        0x53
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $call:Ljava/lang/String;

.field final synthetic $data:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic $lock:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    iput-object p2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$call:Ljava/lang/String;

    iput-object p3, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$data:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$lock:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    iget-object v2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    iget-object v3, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$call:Ljava/lang/String;

    iget-object v4, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$data:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v5, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$lock:Ljava/lang/Object;

    move-object v1, v0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 83
    iget v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->label:I

    if-eqz v0, :cond_0

    .line 91
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 84
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    invoke-static {p1}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->access$getWebViewReference$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$call:Ljava/lang/String;

    new-instance v1, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;)V

    check-cast v1, Landroid/webkit/ValueCallback;

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
