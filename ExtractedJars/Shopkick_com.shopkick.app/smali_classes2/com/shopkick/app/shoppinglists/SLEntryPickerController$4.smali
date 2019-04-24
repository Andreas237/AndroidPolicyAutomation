.class Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;
.super Lcom/shopkick/app/animation/AnimationEndListener;
.source "SLEntryPickerController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->showPicker(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

.field final synthetic val$finalAppScreen:Lcom/shopkick/app/screens/AppScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Landroid/view/View;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;->val$finalAppScreen:Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {p0, p2}, Lcom/shopkick/app/animation/AnimationEndListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 238
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$200(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Landroid/widget/EditText;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 239
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;->val$finalAppScreen:Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 240
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->showKeyboard()V

    .line 241
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$200(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$200(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Landroid/widget/EditText;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    return-void
.end method
