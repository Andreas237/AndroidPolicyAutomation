.class public interface abstract Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;
.super Ljava/lang/Object;
.source "BrowserStateMachine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnStateChangeListener"
.end annotation


# virtual methods
.method public abstract onBatchComplete(Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
.end method

.method public abstract onProductViewed(Lcom/usebutton/sdk/purchasepath/ProductPage;)V
.end method

.method public abstract onPurchaseViewed(Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
.end method

.method public abstract onStart()V
.end method
