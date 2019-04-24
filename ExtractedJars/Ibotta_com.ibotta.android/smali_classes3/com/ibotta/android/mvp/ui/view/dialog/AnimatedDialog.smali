.class public Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;
.super Landroid/app/Dialog;
.source "AnimatedDialog.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;,
        Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;
    }
.end annotation


# instance fields
.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bAction:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090079
    .end annotation
.end field

.field private displayValues:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

.field protected ibDismiss:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090233
    .end annotation
.end field

.field protected lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902e5
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;

.field private showDismissButton:Z

.field protected tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field

.field protected tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;-><init>(Landroid/content/Context;I)V

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

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 55
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->initLayout()V

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

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 64
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)V

    const/4 v0, 0x1

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->requestWindowFeature(I)Z

    const v0, 0x7f0c00d2

    .line 67
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->setContentView(I)V

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->ibDismiss:Landroid/widget/ImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/dialog/-$$Lambda$AnimatedDialog$4ZOZngs-j9n65faZ7FZAFSs-E4I;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/dialog/-$$Lambda$AnimatedDialog$4ZOZngs-j9n65faZ7FZAFSs-E4I;-><init>(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 73
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->bAction:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/dialog/-$$Lambda$AnimatedDialog$jAO1yU0X821LwoUsT6wWdeLf14k;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/dialog/-$$Lambda$AnimatedDialog$jAO1yU0X821LwoUsT6wWdeLf14k;-><init>(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;Landroid/view/View;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->onDismissClicked()V

    return-void
.end method

.method public static synthetic lambda$initLayout$1(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;Landroid/view/View;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->onActionClicked()V

    return-void
.end method

.method private onActionClicked()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->listener:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;

    if-eqz v0, :cond_0

    .line 118
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;->onActionClicked()V

    :cond_0
    return-void
.end method

.method private onDismissClicked()V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->listener:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;

    if-eqz v0, :cond_0

    .line 112
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;->onDismissedClicked()V

    :cond_0
    return-void
.end method

.method private onSetup()V
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->displayValues:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->getAnimationName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->loop(Z)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    .line 96
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->showDismissButton:Z

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->ibDismiss:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->ibDismiss:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 102
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->displayValues:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvDescription:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->displayValues:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/AppHelper;->getHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvDescription:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->bAction:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->displayValues:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->getButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->listener:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;

    return-void
.end method

.method public setup(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;)V
    .locals 1

    const/4 v0, 0x1

    .line 81
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->setup(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;Z)V

    return-void
.end method

.method public setup(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;Z)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->displayValues:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

    .line 86
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->showDismissButton:Z

    .line 88
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->onSetup()V

    return-void
.end method
