.class Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->getDom(Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

.field final synthetic val$listener:Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;->val$listener:Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 188
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 2

    .line 191
    new-instance v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;->val$listener:Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;

    invoke-direct {v0, p1, v1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    instance-of v1, v0, Landroid/os/AsyncTask;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method
