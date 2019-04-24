.class Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;
.super Ljava/lang/Object;
.source "WebViewScreen.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/webview/WebViewScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PopScreenRunnable"
.end annotation


# instance fields
.field private killSwitch:Z

.field private webViewScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/webview/WebViewScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/webview/WebViewScreen;)V
    .locals 1

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;->webViewScreenWeakReference:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x0

    .line 229
    iput-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;->killSwitch:Z

    return-void
.end method


# virtual methods
.method public kill()V
    .locals 1

    const/4 v0, 0x1

    .line 244
    iput-boolean v0, p0, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;->killSwitch:Z

    return-void
.end method

.method public run()V
    .locals 1

    .line 234
    iget-boolean v0, p0, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;->killSwitch:Z

    if-eqz v0, :cond_0

    return-void

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;->webViewScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/webview/WebViewScreen;

    if-eqz v0, :cond_1

    .line 239
    invoke-virtual {v0}, Lcom/shopkick/app/webview/WebViewScreen;->popScreen()V

    :cond_1
    return-void
.end method
