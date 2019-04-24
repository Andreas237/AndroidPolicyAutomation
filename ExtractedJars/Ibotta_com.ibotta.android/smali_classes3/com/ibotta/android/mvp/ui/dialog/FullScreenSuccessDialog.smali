.class public Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;
.super Landroid/app/Dialog;
.source "FullScreenSuccessDialog.java"


# static fields
.field private static final DEFAULT_AUTO_HIDE_DELAY:J = 0x5dcL


# instance fields
.field private autoHideDelay:J

.field private autoHideRunnable:Ljava/lang/Runnable;

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x103000e

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;-><init>(Landroid/content/Context;I)V

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

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const-wide/16 p1, 0x5dc

    .line 25
    iput-wide p1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideDelay:J

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->initLayout()V

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

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    const-wide/16 p1, 0x5dc

    .line 25
    iput-wide p1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideDelay:J

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->initLayout()V

    return-void
.end method

.method static synthetic access$002(Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    return-object p1
.end method

.method private initLayout()V
    .locals 2

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const v0, 0x7f0c00d6

    .line 53
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->setContentView(I)V

    .line 54
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 78
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 81
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setAutoHideAfter(J)V
    .locals 0

    .line 48
    iput-wide p1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideDelay:J

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public show()V
    .locals 4

    .line 59
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 62
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 65
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    .line 73
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideRunnable:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->autoHideDelay:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
