.class Lcom/usebutton/sdk/purchasepath/PurchasePath$1;
.super Ljava/lang/Object;
.source "PurchasePath.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/models/AppAction$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/purchasepath/PurchasePath;->start(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/purchasepath/PurchasePath;

.field final synthetic val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/purchasepath/PurchasePath;Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath$1;->this$0:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    iput-object p2, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath$1;->val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath$1;->val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;

    if-eqz v0, :cond_0

    .line 59
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;->onStartResult(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onSuccess()V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath$1;->val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 52
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;->onStartResult(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
