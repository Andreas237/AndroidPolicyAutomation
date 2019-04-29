.class public final Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;
.super Landroid/webkit/WebViewClient;
.source "WebViewJavaScriptInterpreter.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/JavaScriptInterpreter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebViewJavaScriptInterpreter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewJavaScriptInterpreter.kt\nio/streamroot/dna/core/js/WebViewJavaScriptInterpreter\n*L\n1#1,131:1\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0008\u0010\u001a\u001a\u00020\u001bH\u0016J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001dH\u0016J&\u0010$\u001a\u00020\u001b2\u0008\u0010%\u001a\u0004\u0018\u00010\u00192\u0008\u0010#\u001a\u0004\u0018\u00010\u001d2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0016J.\u0010(\u001a\u00020\u001b2\u0008\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010\u001d2\u0008\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006."
    }
    d2 = {
        "Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;",
        "Landroid/webkit/WebViewClient;",
        "Lio/streamroot/dna/core/js/JavaScriptInterpreter;",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "mediaWatcher",
        "Lio/streamroot/dna/core/media/MediaWatcher;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "context",
        "Landroid/content/Context;",
        "panamaInteractors",
        "",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "panamaConfig",
        "Lorg/json/JSONObject;",
        "(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/media/MediaWatcher;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V",
        "handler",
        "Landroid/os/Handler;",
        "mainJob",
        "Lkotlinx/coroutines/Job;",
        "webViewReference",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Landroid/webkit/WebView;",
        "close",
        "",
        "interpretString",
        "",
        "call",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "interpretVoid",
        "onPageFinished",
        "webView",
        "url",
        "onPageStarted",
        "view",
        "favicon",
        "Landroid/graphics/Bitmap;",
        "onReceivedError",
        "errorCode",
        "",
        "description",
        "failingUrl",
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
.field private static final BASE_URL:Ljava/lang/String; = "file:///android_asset/"

.field public static final Companion:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$Companion;

.field private static final ENCODING:Ljava/lang/String;

.field private static final MIME_TYPE:Ljava/lang/String; = "text/html"


# instance fields
.field private final callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final handler:Landroid/os/Handler;

.field private final mainJob:Lkotlinx/coroutines/Job;

.field private final mediaWatcher:Lio/streamroot/dna/core/media/MediaWatcher;

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field private final webViewReference:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->Companion:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$Companion;

    .line 126
    sget-object v0, Lokhttp3/internal/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->ENCODING:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/media/MediaWatcher;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/js/CallExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/media/MediaWatcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/streamroot/dna/core/js/CallExecutor;",
            "Lio/streamroot/dna/core/media/MediaWatcher;",
            "Lio/streamroot/dna/core/context/state/StateManager;",
            "Lio/streamroot/dna/core/error/ErrorAggregator;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Lio/streamroot/dna/core/js/PanamaInteractor;",
            ">;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaWatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "panamaInteractors"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "panamaConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    iput-object p2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->mediaWatcher:Lio/streamroot/dna/core/media/MediaWatcher;

    iput-object p3, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    iput-object p4, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 36
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/JobKt;->Job$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p2

    iput-object p2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->mainJob:Lkotlinx/coroutines/Job;

    .line 37
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->webViewReference:Ljava/util/concurrent/atomic/AtomicReference;

    .line 38
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->handler:Landroid/os/Handler;

    .line 41
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->handler:Landroid/os/Handler;

    new-instance p2, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;

    invoke-direct {p2, p0, p5, p6, p7}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V

    check-cast p2, Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final synthetic access$getENCODING$cp()Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->ENCODING:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getErrorAggregator$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Lio/streamroot/dna/core/error/ErrorAggregator;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-object p0
.end method

.method public static final synthetic access$getWebViewReference$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->webViewReference:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 103
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->mainJob:Lkotlinx/coroutines/Job;

    invoke-static {v0}, Lkotlinx/coroutines/JobKt;->cancelChildren(Lkotlinx/coroutines/Job;)V

    .line 104
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->mainJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 105
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->handler:Landroid/os/Handler;

    new-instance v1, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$close$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$close$1;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public interpretString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;

    iget v1, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;

    invoke-direct {v0, p0, p2}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 79
    iget v2, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->label:I

    packed-switch v2, :pswitch_data_0

    .line 99
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :pswitch_0
    iget-object p1, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$2:Ljava/lang/Object;

    iget-object v2, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v0, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    :try_start_0
    instance-of v0, p2, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p2, Lkotlin/Result$Failure;

    iget-object p2, p2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    move-object p2, v1

    goto :goto_1

    :pswitch_1
    instance-of v2, p2, Lkotlin/Result$Failure;

    if-eqz v2, :cond_2

    check-cast p2, Lkotlin/Result$Failure;

    iget-object p1, p2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 80
    :cond_2
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance v8, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-direct {v8, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 83
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lkotlin/coroutines/CoroutineContext;

    new-instance v10, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    const/4 v7, 0x0

    move-object v2, v10

    move-object v3, p0

    move-object v4, p1

    move-object v5, v8

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    check-cast v10, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->L$3:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$1;->label:I

    invoke-static {v9, v10, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v8

    .line 94
    :goto_1
    :try_start_2
    monitor-enter p2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    const-wide/16 v0, 0x3e8

    .line 95
    :try_start_3
    invoke-virtual {p2, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 96
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    :try_start_4
    monitor-exit p2

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit p2

    throw v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_0
    move-object p1, v8

    .line 99
    :catch_1
    :goto_2
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public interpretVoid(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->handler:Landroid/os/Handler;

    new-instance v1, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;

    invoke-direct {v1, p0, p1}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;-><init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "webView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "url"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    move-object p2, p0

    check-cast p2, Lio/streamroot/dna/core/js/JavaScriptInterpreter;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/js/CallExecutor;->register(Lio/streamroot/dna/core/js/JavaScriptInterpreter;)V

    .line 115
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->mediaWatcher:Lio/streamroot/dna/core/media/MediaWatcher;

    invoke-virtual {p1}, Lio/streamroot/dna/core/media/MediaWatcher;->start()V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 109
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 110
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    sget-object p2, Lio/streamroot/dna/core/State;->LOADING:Lio/streamroot/dna/core/State;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 119
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/state/StateManager;->getCurrentState()Lio/streamroot/dna/core/State;

    move-result-object p1

    sget-object v0, Lio/streamroot/dna/core/State;->LOADING:Lio/streamroot/dna/core/State;

    if-ne p1, v0, :cond_0

    .line 120
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    sget-object v0, Lio/streamroot/dna/core/State;->LOADING_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    .line 122
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[JS] DNA error: code ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "], description [["

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]], "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    return-void
.end method
