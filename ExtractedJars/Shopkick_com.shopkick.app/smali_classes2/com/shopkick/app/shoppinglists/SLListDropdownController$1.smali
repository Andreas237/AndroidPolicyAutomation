.class Lcom/shopkick/app/shoppinglists/SLListDropdownController$1;
.super Lcom/shopkick/app/shoppinglists/SLListController;
.source "SLListDropdownController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListDropdownController;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/ListView;)V
    .locals 6

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/shoppinglists/SLListController;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/ListView;)V

    return-void
.end method


# virtual methods
.method public onSelect(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    iget-object p1, p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->onListSelected(Ljava/lang/String;)V

    return-void
.end method
