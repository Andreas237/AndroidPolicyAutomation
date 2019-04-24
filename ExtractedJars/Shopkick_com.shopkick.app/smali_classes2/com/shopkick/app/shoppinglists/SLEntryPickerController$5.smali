.class Lcom/shopkick/app/shoppinglists/SLEntryPickerController$5;
.super Lcom/shopkick/app/animation/AnimationEndListener;
.source "SLEntryPickerController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Landroid/view/View;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$5;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-direct {p0, p2}, Lcom/shopkick/app/animation/AnimationEndListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 288
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$5;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$300(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
