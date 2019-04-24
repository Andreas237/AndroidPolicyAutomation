.class public interface abstract Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;
.super Ljava/lang/Object;
.source "PurchasePathInterface.java"


# virtual methods
.method public abstract fetch(Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V
.end method

.method public abstract getExtension()Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
