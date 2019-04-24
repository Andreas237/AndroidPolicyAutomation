.class public Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;
.super Landroid/app/Dialog;
.source "RebatesFoundDialog.java"


# static fields
.field private static final DISMISS_DELAY:J = 0x7d0L


# instance fields
.field private delayedDismissRunnable:Ljava/lang/Runnable;

.field protected tvRebatesFound:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090566
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x103005a

    .line 28
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->initLayout()V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/DialogInterface$OnCancelListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->initLayout()V

    return-void
.end method

.method private cancelDelayedDismiss()V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->delayedDismissRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 74
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->delayedDismissRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->delayedDismissRunnable:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const v0, 0x7f0c00db

    .line 57
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setContentView(I)V

    .line 58
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->cancelDelayedDismiss()V

    .line 62
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->delayedDismissRunnable:Ljava/lang/Runnable;

    .line 69
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->delayedDismissRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public onDetachedFromWindow()V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->cancelDelayedDismiss()V

    .line 45
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    return-void
.end method

.method public setRebatesFound(I)V
    .locals 4

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/high16 v2, 0x7f0f0000

    .line 49
    invoke-virtual {v0, v2, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->tvRebatesFound:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
