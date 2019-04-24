.class public Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "LoginActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/login/LoginView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginView;"
    }
.end annotation


# static fields
.field public static final RESP_CODE_SUCCESS:I = 0x1


# instance fields
.field protected bLogIn:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090092
    .end annotation
.end field

.field protected etEmail:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c5
    .end annotation
.end field

.field protected etPassword:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901cf
    .end annotation
.end field

.field protected tvForgotPassword:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090527
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initEmail()V
    .locals 3

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etEmail:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initPassword()V
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etPassword:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etPassword:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/login/-$$Lambda$LoginActivity$bwpekReiVxByQodR9wXGF4vO6iM;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/login/-$$Lambda$LoginActivity$bwpekReiVxByQodR9wXGF4vO6iM;-><init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public static synthetic lambda$initPassword$0(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->onLogInClicked()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 48
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static startForResult(Landroid/app/Activity;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 44
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;
    .locals 1

    .line 53
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent$Builder;

    move-result-object v0

    .line 54
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginView;)V

    .line 55
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent$Builder;->loginModule(Lcom/ibotta/android/mvp/ui/activity/login/LoginModule;)Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent$Builder;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/login/DaggerLoginComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;

    move-result-object p1

    return-object p1
.end method

.method protected initToolBar()V
    .locals 2

    .line 93
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->initToolBar()V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v1, 0x7f08028d

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setLogo(I)V

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;)V
    .locals 0

    .line 61
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)V

    return-void
.end method

.method public notifySuccess()V
    .locals 1

    const/4 v0, 0x1

    .line 129
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->setResult(I)V

    .line 130
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 66
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0048

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->setContentView(I)V

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->initEmail()V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->initPassword()V

    return-void
.end method

.method protected onForgotPasswordClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090527
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;->onForgotPasswordClicked()V

    return-void
.end method

.method protected onLogInClicked()V
    .locals 3
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090092
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etPassword:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;->onLogInClicked(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLogInAllowed(Z)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->bLogIn:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public showForgotPassword()V
    .locals 0

    .line 124
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->start(Landroid/content/Context;)V

    return-void
.end method
