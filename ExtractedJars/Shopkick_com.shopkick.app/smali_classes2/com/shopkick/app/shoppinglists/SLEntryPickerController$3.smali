.class Lcom/shopkick/app/shoppinglists/SLEntryPickerController$3;
.super Ljava/lang/Object;
.source "SLEntryPickerController.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


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

    .line 146
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$100(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V

    const/4 p1, 0x0

    return p1
.end method
