.class public Lcom/usebutton/sdk/internal/browser/PurchasePageImpl;
.super Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;
.source "PurchasePageImpl.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/PurchasePage;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    return-void
.end method
