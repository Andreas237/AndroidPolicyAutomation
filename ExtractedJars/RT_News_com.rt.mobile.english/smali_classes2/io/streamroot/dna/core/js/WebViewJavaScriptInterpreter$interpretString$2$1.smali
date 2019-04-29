.class final Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;
.super Ljava/lang/Object;
.source "WebViewJavaScriptInterpreter.kt"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebViewJavaScriptInterpreter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewJavaScriptInterpreter.kt\nio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1\n*L\n1#1,131:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "value",
        "",
        "kotlin.jvm.PlatformType",
        "onReceiveValue"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 27
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public final onReceiveValue(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "null"

    .line 85
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    iget-object v0, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$data:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    iget-object p1, p1, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$lock:Ljava/lang/Object;

    monitor-enter p1

    .line 89
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2$1;->this$0:Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;

    iget-object v0, v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter$interpretString$2;->$lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 90
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method
