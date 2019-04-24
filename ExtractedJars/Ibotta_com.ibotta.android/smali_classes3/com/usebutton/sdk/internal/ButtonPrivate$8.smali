.class Lcom/usebutton/sdk/internal/ButtonPrivate$8;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/AppActionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;->fetch(Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

.field final synthetic val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePathListener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V
    .locals 0

    .line 562
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$8;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$8;->val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePathListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAction(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 565
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$8;->val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePathListener;

    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;

    invoke-direct {v1, p1}, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;-><init>(Lcom/usebutton/sdk/internal/models/AppAction;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathListener;->onComplete(Lcom/usebutton/sdk/purchasepath/PurchasePath;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNoAction()V
    .locals 3

    .line 571
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$8;->val$listener:Lcom/usebutton/sdk/purchasepath/PurchasePathListener;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Purchase Path request failed"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/usebutton/sdk/purchasepath/PurchasePathListener;->onComplete(Lcom/usebutton/sdk/purchasepath/PurchasePath;Ljava/lang/Throwable;)V

    return-void
.end method
