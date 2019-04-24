.class public abstract Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "AbstractResponseDialogFragment.java"


# static fields
.field protected static final HIDE_DELAY_TIMER:J = 0x7d0L

.field private static final KEY_FULL_SCREEN:Ljava/lang/String; = "full_screen"

.field private static final KEY_HIDE_DELAY:Ljava/lang/String; = "hide_delay"


# instance fields
.field private dismissRunnable:Ljava/lang/Runnable;

.field private hideDelay:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    return-void
.end method

.method protected static newArgs(JZ)Landroid/os/Bundle;
    .locals 2

    .line 26
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "hide_delay"

    .line 27
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "full_screen"

    .line 28
    invoke-virtual {v0, p0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 34
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x1030009

    .line 35
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->setStyle(II)V

    return-void
.end method

.method public abstract onCreateResponseView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 41
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->onCreateResponseView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "hide_delay"

    const-wide/16 v1, 0x7d0

    invoke-virtual {p3, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->hideDelay:J

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "full_screen"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p3, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 p3, 0x400

    invoke-virtual {p2, p3, p3}, Landroid/view/Window;->setFlags(II)V

    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    new-instance p3, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$1;

    invoke-direct {p3, p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$1;-><init>(Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;)V

    invoke-virtual {p2, p3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-object p1
.end method

.method protected onDialogShown()V
    .locals 5

    .line 72
    iget-wide v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->hideDelay:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 74
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 77
    :cond_0
    new-instance v0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$2;-><init>(Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;)V

    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissRunnable:Ljava/lang/Runnable;

    .line 84
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissRunnable:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->hideDelay:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 65
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissAllowingStateLoss()V

    .line 68
    invoke-super {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onPause()V

    return-void
.end method
