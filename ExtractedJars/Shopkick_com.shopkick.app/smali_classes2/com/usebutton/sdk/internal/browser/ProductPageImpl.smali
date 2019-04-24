.class public Lcom/usebutton/sdk/internal/browser/ProductPageImpl;
.super Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;
.source "ProductPageImpl.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/ProductPage;


# instance fields
.field private final commission:Lcom/usebutton/sdk/purchasepath/Commission;

.field private final product:Lcom/usebutton/sdk/purchasepath/Product;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/purchasepath/Product;Lcom/usebutton/sdk/purchasepath/Commission;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/Product;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/purchasepath/Commission;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0, p1, p4}, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    .line 28
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/ProductPageImpl;->product:Lcom/usebutton/sdk/purchasepath/Product;

    .line 29
    iput-object p3, p0, Lcom/usebutton/sdk/internal/browser/ProductPageImpl;->commission:Lcom/usebutton/sdk/purchasepath/Commission;

    return-void
.end method


# virtual methods
.method public getCommission()Lcom/usebutton/sdk/purchasepath/Commission;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/ProductPageImpl;->commission:Lcom/usebutton/sdk/purchasepath/Commission;

    return-object v0
.end method

.method public getProduct()Lcom/usebutton/sdk/purchasepath/Product;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/ProductPageImpl;->product:Lcom/usebutton/sdk/purchasepath/Product;

    return-object v0
.end method
