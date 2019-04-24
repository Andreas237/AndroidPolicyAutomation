.class public abstract Lcom/shopkick/app/screens/BottomDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "BottomDialogFragment.java"


# instance fields
.field protected haveReachedOnStartOnce:Z

.field protected layout:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Lcom/shopkick/app/screens/BottomDialogFragment;->haveReachedOnStartOnce:Z

    return-void
.end method


# virtual methods
.method protected abstract animateForHide()V
.end method

.method protected abstract animateForReveal()V
.end method

.method public dismiss()V
    .locals 0

    .line 89
    invoke-virtual {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method

.method protected abstract getLayoutId()I
.end method

.method protected abstract obliterateAnimations()V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 31
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    const v0, 0x7f120192

    .line 33
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/screens/BottomDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 42
    invoke-virtual {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->getLayoutId()I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/screens/BottomDialogFragment;->layout:Landroid/view/ViewGroup;

    .line 44
    iget-object p1, p0, Lcom/shopkick/app/screens/BottomDialogFragment;->layout:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->obliterateAnimations()V

    .line 81
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 62
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStart()V

    .line 64
    invoke-virtual {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x7f120166

    .line 66
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 69
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/screens/BottomDialogFragment;->haveReachedOnStartOnce:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Lcom/shopkick/app/screens/BottomDialogFragment;->haveReachedOnStartOnce:Z

    .line 71
    invoke-virtual {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->animateForReveal()V

    :cond_1
    return-void
.end method
