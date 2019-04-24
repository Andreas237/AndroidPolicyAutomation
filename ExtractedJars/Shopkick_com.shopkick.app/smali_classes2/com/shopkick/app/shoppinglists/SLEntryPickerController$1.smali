.class Lcom/shopkick/app/shoppinglists/SLEntryPickerController$1;
.super Lcom/shopkick/app/shoppinglists/SLPopularItemsController;
.source "SLEntryPickerController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLEntryPickerController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 109
    invoke-super {p0, p1}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->onClick(Landroid/view/View;)V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->onClick(Landroid/view/View;)V

    return-void
.end method
