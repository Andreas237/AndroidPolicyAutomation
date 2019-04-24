.class public interface abstract Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;
.super Ljava/lang/Object;
.source "IWebviewEventListener.java"


# virtual methods
.method public abstract onWebviewClosed()V
.end method

.method public abstract onWebviewPageFinished(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onWebviewPageStarted(Ljava/lang/String;)V
.end method

.method public abstract onWebviewReceiveJsAlert()V
.end method

.method public abstract onWebviewReceivedError(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
.end method

.method public abstract shouldWebviewLoadUrl(Ljava/lang/String;)Z
.end method
