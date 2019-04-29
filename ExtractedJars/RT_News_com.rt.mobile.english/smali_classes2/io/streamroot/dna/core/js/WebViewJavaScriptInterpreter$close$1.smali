.class final Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$close$1;
.super Ljava/lang/Object;
.source "WebViewJavaScriptInterpreter.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->close()V
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
.field final synthetic this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$close$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 105
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$close$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    invoke-static {v0}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;->access$getWebViewReference$p(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    :cond_0
    return-void
.end method
