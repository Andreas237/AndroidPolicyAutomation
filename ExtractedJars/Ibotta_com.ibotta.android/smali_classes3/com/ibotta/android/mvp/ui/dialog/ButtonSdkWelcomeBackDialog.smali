.class public Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;
.super Landroid/app/Dialog;
.source "ButtonSdkWelcomeBackDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;
    }
.end annotation


# instance fields
.field protected bGotIt:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090089
    .end annotation
.end field

.field private buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

.field protected flContentContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ed
    .end annotation
.end field

.field protected ibClose:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090231
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;

.field tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvShoppingTrip:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090574
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

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initLayout()V

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

    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initLayout()V

    return-void
.end method

.method private initContainer(Landroid/view/View;)V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->flContentContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->flContentContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initCtaButton()V
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->bGotIt:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private initDefaultContainer()V
    .locals 2

    .line 127
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initContainer(Landroid/view/View;)V

    return-void
.end method

.method private initDetails()V
    .locals 2

    .line 93
    sget-object v0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$1;->$SwitchMap$com$ibotta$api$model$buttonsdk$ButtonTxStatus:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 109
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initDefaultContainer()V

    goto :goto_0

    .line 105
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initNoOffersContainer()V

    goto :goto_0

    .line 102
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initDefaultContainer()V

    goto :goto_0

    .line 97
    :pswitch_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initSuccessContainer()V

    .line 113
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getLaunchId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initShoppingTrip(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initLayout()V
    .locals 2

    .line 62
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)V

    const v0, 0x7f0c00de

    .line 64
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->setContentView(I)V

    .line 65
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    return-void
.end method

.method private initNoOffersContainer()V
    .locals 2

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initContainer(Landroid/view/View;)V

    return-void
.end method

.method private initShoppingTrip(Ljava/lang/String;)V
    .locals 4

    .line 140
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tvShoppingTrip:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tvShoppingTrip:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f110286

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tvShoppingTrip:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initSuccessContainer()V
    .locals 2

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;-><init>(Landroid/content/Context;)V

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->setup(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    .line 119
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initContainer(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected onCloseClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090231
        }
    .end annotation

    .line 152
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->dismiss()V

    return-void
.end method

.method protected onGotItClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090089
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "welcome_back_got_it_click"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    .line 158
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->dismiss()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;

    return-void
.end method

.method public showTransactionDetails(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    goto :goto_0

    :cond_0
    const-string p1, "No recent Button transaction found."

    const/4 v0, 0x0

    .line 78
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    new-instance p1, Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-direct {p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    .line 82
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initCtaButton()V

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->initDetails()V

    .line 85
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v0, "button_welcome_back_shown"

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;

    if-eqz p1, :cond_1

    .line 88
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;->onWelcomeBackDialogDisplayed()V

    :cond_1
    return-void
.end method
