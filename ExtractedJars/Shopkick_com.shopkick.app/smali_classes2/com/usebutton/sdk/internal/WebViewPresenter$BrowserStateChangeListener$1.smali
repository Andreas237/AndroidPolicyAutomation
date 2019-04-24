.class Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$1;
.super Ljava/lang/Object;
.source "WebViewPresenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;)V
    .locals 0

    .line 652
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$1;->this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 655
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$1;->this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$1;->this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$500(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->notifyOnStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method
