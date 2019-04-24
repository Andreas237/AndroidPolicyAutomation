.class public Lcom/usebutton/sdk/internal/NoOpPurchasePath;
.super Ljava/lang/Object;
.source "NoOpPurchasePath.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public fetch(Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/PurchasePathListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Button.configure() must be called before using Purchase Path API"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathListener;->onComplete(Lcom/usebutton/sdk/purchasepath/PurchasePath;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getExtension()Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method
