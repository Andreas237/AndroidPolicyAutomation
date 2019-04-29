.class final Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;
.super Ljava/lang/Object;
.source "WebViewJavaScriptInterpreter.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->interpretVoid(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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
.field final synthetic $call:Ljava/lang/String;

.field final synthetic this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    iput-object p2, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;->$call:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 71
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    invoke-static {v0}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->access$getWebViewReference$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 72
    iget-object v1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;->$call:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 74
    iget-object v1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretVoid$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    invoke-static {v1}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->access$getErrorAggregator$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Lio/streamroot/dna/core/error/ErrorAggregator;

    move-result-object v1

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
