.class Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ShoppingListSyncAlertController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->hideAlert()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 157
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$300(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$300(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 164
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 168
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_2

    .line 171
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 175
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$102(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Z)Z

    .line 178
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->access$200(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method
