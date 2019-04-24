.class public Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;
.super Landroid/app/Dialog;
.source "NotificationDialog.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;
    }
.end annotation


# instance fields
.field private countDownTimer:Landroid/os/CountDownTimer;

.field protected flRoot:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f6
    .end annotation
.end field

.field protected ibDismiss:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090233
    .end annotation
.end field

.field protected ivStar:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c9
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;

.field private message:Ljava/lang/String;

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->initLayout()V

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

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/DialogInterface$OnCancelListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->onDismissClicked()V

    return-void
.end method

.method static synthetic access$102(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->countDownTimer:Landroid/os/CountDownTimer;

    return-object p1
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->requestWindowFeature(I)Z

    const v0, 0x7f0c00d9

    .line 67
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->setContentView(I)V

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    .line 76
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    const/16 v1, 0x30

    .line 77
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 78
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit8 v1, v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ibDismiss:Landroid/widget/ImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$1;-><init>(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private onDismissClicked()V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    .line 148
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->countDownTimer:Landroid/os/CountDownTimer;

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->listener:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;

    if-eqz v0, :cond_1

    .line 152
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;->onDismissedNotificationClicked()V

    .line 155
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->dismiss()V

    :cond_2
    return-void
.end method

.method private onSetup()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->tvMessage:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->startHideTimer()V

    return-void
.end method

.method private startHideTimer()V
    .locals 7

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 131
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;

    const-wide/16 v3, 0xbb8

    const-wide/16 v5, 0x3e8

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;-><init>(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;JJ)V

    .line 142
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->countDownTimer:Landroid/os/CountDownTimer;

    return-void
.end method


# virtual methods
.method public cancelTimer()V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    return-void
.end method

.method public hideStar()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ivStar:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public makeGreen()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->flRoot:Landroid/widget/FrameLayout;

    const v1, 0x7f0600c3

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V

    return-void
.end method

.method public makePink()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->flRoot:Landroid/widget/FrameLayout;

    const v1, 0x7f0600c5

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->cancelTimer()V

    .line 62
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->listener:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;

    return-void
.end method

.method public setup(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->message:Ljava/lang/String;

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->onSetup()V

    return-void
.end method

.method public showStar()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ivStar:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
