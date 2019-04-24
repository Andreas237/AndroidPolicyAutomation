.class public interface abstract Lcom/usebutton/sdk/purchasepath/ProductPage;
.super Ljava/lang/Object;
.source "ProductPage.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/BrowserPage;


# virtual methods
.method public abstract getCommission()Lcom/usebutton/sdk/purchasepath/Commission;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract getProduct()Lcom/usebutton/sdk/purchasepath/Product;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method
