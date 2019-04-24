.class Lcom/shopkick/app/account/ResetPasswordScreen$1;
.super Ljava/lang/Object;
.source "ResetPasswordScreen.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/account/ResetPasswordScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/ResetPasswordScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/ResetPasswordScreen;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen$1;->this$0:Lcom/shopkick/app/account/ResetPasswordScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    if-nez p2, :cond_0

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen$1;->this$0:Lcom/shopkick/app/account/ResetPasswordScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/ResetPasswordScreen;->access$000(Lcom/shopkick/app/account/ResetPasswordScreen;)Lcom/shopkick/app/widget/SKEditText;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen$1;->this$0:Lcom/shopkick/app/account/ResetPasswordScreen;

    .line 105
    invoke-virtual {p2}, Lcom/shopkick/app/account/ResetPasswordScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0800d8

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x0

    .line 103
    invoke-virtual {p1, v0, v0, p2, v0}, Lcom/shopkick/app/widget/SKEditText;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen$1;->this$0:Lcom/shopkick/app/account/ResetPasswordScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/ResetPasswordScreen;->access$100(Lcom/shopkick/app/account/ResetPasswordScreen;)V

    :cond_0
    return-void
.end method
