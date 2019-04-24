.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "VerifyCodeActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;"
    }
.end annotation


# instance fields
.field protected bResendVerificationCode:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09009e
    .end annotation
.end field

.field protected bVerify:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b0
    .end annotation
.end field

.field protected etCode:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c2
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initCodeInput()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->etCode:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initDialog()V
    .locals 4

    .line 112
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f11029e

    .line 113
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(I)Landroid/support/v7/app/AlertDialog$Builder;

    const v1, 0x7f11029f

    .line 115
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(I)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x0

    .line 116
    invoke-virtual {v1, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setCancelable(Z)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/-$$Lambda$VerifyCodeActivity$NCUPoTUoxqjtb2L7KDOhKgaSzNM;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/-$$Lambda$VerifyCodeActivity$NCUPoTUoxqjtb2L7KDOhKgaSzNM;

    const v3, 0x7f1101c8

    .line 117
    invoke-virtual {v1, v3, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 118
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method

.method private initResendCodeButton()V
    .locals 3

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->bResendVerificationCode:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/-$$Lambda$VerifyCodeActivity$JmW17Ea1ZUBJq4orhqURN-EA7jI;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/-$$Lambda$VerifyCodeActivity$JmW17Ea1ZUBJq4orhqURN-EA7jI;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initVerifyButton()V
    .locals 3

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->bVerify:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->bVerify:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/-$$Lambda$VerifyCodeActivity$9F7J7K04EbdokrKwy83QF32mMAY;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/-$$Lambda$VerifyCodeActivity$9F7J7K04EbdokrKwy83QF32mMAY;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method static synthetic lambda$initDialog$2(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 117
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$initResendCodeButton$1(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;Landroid/view/View;)V
    .locals 0

    .line 108
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->onResendVerificationCodeClicked()V

    return-void
.end method

.method public static synthetic lambda$initVerifyButton$0(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;Landroid/view/View;)V
    .locals 0

    .line 103
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->onVerifyCodeClicked()V

    return-void
.end method

.method private loadParams()V
    .locals 3

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "phone_number"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "reference_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 71
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->setPhoneNumber(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->setReferenceId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;
    .locals 1

    .line 38
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;

    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;)V

    .line 40
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->verifyCodeModule(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishSuccessfully()V
    .locals 1

    const/4 v0, -0x1

    .line 135
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->setResult(I)V

    .line 136
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;)V
    .locals 0

    .line 46
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)V

    return-void
.end method

.method public launchVerifyDeviceComplete()V
    .locals 2

    .line 129
    new-instance v0, Lcom/ibotta/android/routing/intent/VerifyDeviceCompleteIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/VerifyDeviceCompleteIntentCreator;-><init>(Landroid/content/Context;)V

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/VerifyDeviceCompleteIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x15

    .line 129
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x15

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 86
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->onVerifyComplete()V

    goto :goto_0

    .line 88
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 51
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0076

    .line 53
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->setContentView(I)V

    .line 54
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const p1, 0x7f11029d

    .line 56
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->setTitle(I)V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->loadParams()V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->initCodeInput()V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->initVerifyButton()V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->initResendCodeButton()V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->initDialog()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 78
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "phone_number"

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "reference_id"

    .line 80
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->getReferenceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setVerifyEnabled(Z)V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->bVerify:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method
