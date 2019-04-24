.class public Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;
.super Ljava/lang/Object;
.source "BrowserStateMachineImpl.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;
.implements Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;
    }
.end annotation


# instance fields
.field private final client:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

.field private committedUrl:Ljava/lang/String;

.field private currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

.field private javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

.field private lastResponse:Lcom/usebutton/sdk/internal/purchasepath/PageView;

.field private listener:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->COMMITTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    const-string v0, ""

    .line 42
    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->committedUrl:Ljava/lang/String;

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->lastResponse:Lcom/usebutton/sdk/internal/purchasepath/PageView;

    .line 65
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->client:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

    .line 66
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->listener:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;

    .line 67
    invoke-virtual {p1, p0}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->setListener(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;)V

    return-void
.end method


# virtual methods
.method public commit(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 94
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->COMMITTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 95
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->committedUrl:Ljava/lang/String;

    .line 97
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->lastResponse:Lcom/usebutton/sdk/internal/purchasepath/PageView;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->onReceiveResult(Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/PageView;)V

    :cond_0
    return-void
.end method

.method public declared-synchronized onReceiveResult(Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/PageView;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/purchasepath/PageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 108
    :try_start_0
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->getType()Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->ORDER_CHECKOUT:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->PURCHASED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    if-eq v0, v1, :cond_0

    .line 109
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->listener:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;

    new-instance v1, Lcom/usebutton/sdk/internal/browser/PurchasePageImpl;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-direct {v1, p1, v2}, Lcom/usebutton/sdk/internal/browser/PurchasePageImpl;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;->onPurchaseViewed(Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    .line 110
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->PURCHASED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->PURCHASED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_1

    .line 115
    monitor-exit p0

    return-void

    .line 119
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->COMMITTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    if-eq v0, v1, :cond_2

    .line 120
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->lastResponse:Lcom/usebutton/sdk/internal/purchasepath/PageView;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    monitor-exit p0

    return-void

    .line 126
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->committedUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_3

    .line 127
    monitor-exit p0

    return-void

    .line 131
    :cond_3
    :try_start_3
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->VERIFIED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 133
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->getType()Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->PRODUCT_VIEWED:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    if-ne v0, v1, :cond_6

    .line 134
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->getProduct()Lcom/usebutton/sdk/purchasepath/Product;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->getCommission()Lcom/usebutton/sdk/purchasepath/Commission;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 135
    :cond_4
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->listener:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;

    new-instance v1, Lcom/usebutton/sdk/internal/browser/ProductPageImpl;

    .line 137
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->getProduct()Lcom/usebutton/sdk/purchasepath/Product;

    move-result-object v2

    .line 138
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->getCommission()Lcom/usebutton/sdk/purchasepath/Commission;

    move-result-object p2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-direct {v1, p1, v2, p2, v3}, Lcom/usebutton/sdk/internal/browser/ProductPageImpl;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/purchasepath/Product;Lcom/usebutton/sdk/purchasepath/Commission;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    .line 135
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;->onProductViewed(Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    monitor-exit p0

    return-void

    .line 134
    :cond_5
    :goto_0
    monitor-exit p0

    return-void

    .line 145
    :cond_6
    :try_start_4
    iget-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->listener:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;

    new-instance v0, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-direct {v0, p1, v1}, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    invoke-interface {p2, v0}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;->onBatchComplete(Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 146
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setJavascriptInterface(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 72
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    return-void
.end method

.method public start(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, ""

    .line 78
    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->committedUrl:Ljava/lang/String;

    const/4 v0, 0x0

    .line 79
    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->lastResponse:Lcom/usebutton/sdk/internal/purchasepath/PageView;

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->client:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->executePageViewRequest(Ljava/lang/String;)V

    .line 84
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->STARTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    if-ne p1, v0, :cond_0

    return-void

    .line 88
    :cond_0
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->STARTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->currentState:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 89
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;->listener:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;->onStart()V

    return-void
.end method
