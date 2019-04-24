.class public Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;
.super Ljava/lang/Object;
.source "ListAddController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/ListAddController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ItemExistsDialogClickListener"
.end annotation


# instance fields
.field private entry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

.field private shoppingListId:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ListAddController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 450
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->entry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 451
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->shoppingListId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 456
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->access$200(Lcom/shopkick/app/shoppinglists/ListAddController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 461
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xf7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 462
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->access$300(Lcom/shopkick/app/shoppinglists/ListAddController;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 464
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->entry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->shoppingListId:Ljava/lang/String;

    invoke-static {p2, v0, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->access$400(Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V

    .line 466
    :cond_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 467
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController;->access$200(Lcom/shopkick/app/shoppinglists/ListAddController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;

    if-eqz p1, :cond_2

    .line 468
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController;->access$200(Lcom/shopkick/app/shoppinglists/ListAddController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    :cond_2
    return-void
.end method
