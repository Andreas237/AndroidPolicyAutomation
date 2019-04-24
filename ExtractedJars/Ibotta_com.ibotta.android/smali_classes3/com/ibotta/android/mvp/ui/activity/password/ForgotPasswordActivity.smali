.class public Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ForgotPasswordActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;"
    }
.end annotation


# instance fields
.field protected bResetPassword:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a0
    .end annotation
.end field

.field protected etEmail:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c5
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initEmail()V
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->etEmail:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 39
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 35
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;
    .locals 1

    .line 44
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$Builder;

    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;)V

    .line 46
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$Builder;->forgotPasswordModule(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordModule;)Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$Builder;

    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;

    move-result-object p1

    return-object p1
.end method

.method protected initToolBar()V
    .locals 2

    .line 71
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->initToolBar()V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v1, 0x7f08028d

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setLogo(I)V

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;)V
    .locals 0

    .line 52
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 57
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0038

    .line 59
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->setContentView(I)V

    .line 60
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->initEmail()V

    return-void
.end method

.method protected onResetPasswordClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a0
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;->onResetPasswordClicked(Ljava/lang/String;)V

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setResetPasswordEnabled(Z)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->bResetPassword:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public showResetPasswordSuccess()V
    .locals 2

    const v0, 0x7f1102f3

    const/4 v1, 0x0

    .line 97
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->showQuickMessage(IZ)V

    return-void
.end method
