.class Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;
.super Lcom/shopkick/app/shoppinglists/SLListDropdownController;
.source "ShoppingListsScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 9

    move-object v8, p0

    move-object v0, p1

    .line 154
    iput-object v0, v8, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onListSelected(Ljava/lang/String;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$000(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Ljava/lang/String;)V

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$100(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$200(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->resetListAddController()V

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$300(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->maybeDisplayFirstUseView()V

    return-void
.end method
