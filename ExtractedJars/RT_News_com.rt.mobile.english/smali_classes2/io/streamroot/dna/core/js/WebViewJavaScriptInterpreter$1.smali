.class final Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;
.super Ljava/lang/Object;
.source "WebViewJavaScriptInterpreter.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;-><init>(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/media/MediaWatcher;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebViewJavaScriptInterpreter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewJavaScriptInterpreter.kt\nio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1561#2,2:132\n*E\n*S KotlinDebug\n*F\n+ 1 WebViewJavaScriptInterpreter.kt\nio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1\n*L\n50#1,2:132\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $panamaConfig:Lorg/json/JSONObject;

.field final synthetic $panamaInteractors:Ljava/util/List;

.field final synthetic this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    iput-object p2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->$context:Landroid/content/Context;

    iput-object p3, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->$panamaInteractors:Ljava/util/List;

    iput-object p4, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->$panamaConfig:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 42
    new-instance v6, Landroid/webkit/WebView;

    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->$context:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v1, "webView.settings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 46
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v1, "webView.settings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 47
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v1, "file:///android_asset/"

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    check-cast v0, Landroid/webkit/WebViewClient;

    invoke-virtual {v6, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 50
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->$panamaInteractors:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/js/PanamaInteractor;

    .line 50
    invoke-interface {v1}, Lio/streamroot/dna/core/js/PanamaInteractor;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Panama.createService("

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    iget-object v1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->$panamaConfig:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "panamaConfig.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppend(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, ");"

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "file:///android_asset/"

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<html><head><title>Streamroot DNA</title><script src=\"file:///android_asset/panama.js\" type=\"text/javascript\"></script><script>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</script></head></html>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "text/html"

    .line 61
    invoke-static {}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->access$getENCODING$cp()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    .line 57
    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    invoke-static {v0}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->access$getWebViewReference$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
