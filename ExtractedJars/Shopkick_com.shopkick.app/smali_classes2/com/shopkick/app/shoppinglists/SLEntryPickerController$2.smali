.class Lcom/shopkick/app/shoppinglists/SLEntryPickerController$2;
.super Ljava/lang/Object;
.source "SLEntryPickerController.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


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
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    if-nez p2, :cond_0

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$000(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 133
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->hideKeyboard()V

    :cond_0
    return-void
.end method
