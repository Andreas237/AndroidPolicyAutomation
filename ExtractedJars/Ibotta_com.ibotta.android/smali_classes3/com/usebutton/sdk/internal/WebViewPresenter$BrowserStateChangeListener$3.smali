.class Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;
.super Ljava/lang/Object;
.source "WebViewPresenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->onProductViewed(Lcom/usebutton/sdk/purchasepath/ProductPage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

.field final synthetic val$page:Lcom/usebutton/sdk/purchasepath/ProductPage;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 0

    .line 708
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;->this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;->val$page:Lcom/usebutton/sdk/purchasepath/ProductPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 711
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;->this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;->this$1:Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$600(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;->val$page:Lcom/usebutton/sdk/purchasepath/ProductPage;

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->notifyOnProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    return-void
.end method
