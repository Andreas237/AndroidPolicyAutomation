.class Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ShoppingListSyncAlertController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->showAlert()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Landroid/view/View;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->val$view:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onAnimationEnd$65(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;)V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->hideAlert()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 107
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$000(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->val$view:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListSyncAlertController$1$vbdb0oC-AgN-VvEEHYf11MaSk-Y;

    invoke-direct {v0, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListSyncAlertController$1$vbdb0oC-AgN-VvEEHYf11MaSk-Y;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$102(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Z)Z

    .line 114
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$200(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 120
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$300(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$300(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    .line 125
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 130
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_1

    .line 133
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method
