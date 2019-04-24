.class Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;
.super Ljava/lang/Object;
.source "WebViewPresenter.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/WebViewPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BrowserStateChangeListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;)V
    .locals 0

    .line 678
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/WebViewPresenter$1;)V
    .locals 0

    .line 678
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;)V

    return-void
.end method


# virtual methods
.method public onBatchComplete(Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 2

    .line 695
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$600(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 696
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$700(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/MainThreadExecutor;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$2;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$2;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/MainThreadExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onProductViewed(Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 2

    .line 707
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$600(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 708
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$700(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/MainThreadExecutor;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$3;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/MainThreadExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onPurchaseViewed(Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 2

    .line 719
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$600(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 720
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$700(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/MainThreadExecutor;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$4;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$4;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/MainThreadExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 683
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$600(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 684
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$700(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/MainThreadExecutor;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener$1;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/MainThreadExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
