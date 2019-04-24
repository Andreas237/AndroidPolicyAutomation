.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "VerifyPhoneNumberActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

.field protected bSendVerificationCode:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a6
    .end annotation
.end field

.field deviceAuthConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected etPhoneNumber:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d0
    .end annotation
.end field

.field protected sCountryCode:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e2
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->adapter:Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initCountryCodeSpinner()V
    .locals 5

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->deviceAuthConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->getCountryCodes()Ljava/util/List;

    move-result-object v0

    .line 87
    new-instance v1, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->getActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->adapter:Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->sCountryCode:Landroid/widget/Spinner;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->adapter:Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->sCountryCode:Landroid/widget/Spinner;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->adapter:Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->addAll(Ljava/util/Collection;)V

    .line 101
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 102
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->sCountryCode:Landroid/widget/Spinner;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setVisibility(I)V

    .line 104
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;->onCountryCodeChanged(Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)V

    :cond_2
    return-void
.end method

.method private initPhoneNumberInput()V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->etPhoneNumber:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initSendVerificationCodeButton()V
    .locals 3

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->bSendVerificationCode:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->bSendVerificationCode:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/-$$Lambda$VerifyPhoneNumberActivity$6KpY5dNGBHdf2suy8bxJUAUrSn8;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/-$$Lambda$VerifyPhoneNumberActivity$6KpY5dNGBHdf2suy8bxJUAUrSn8;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)V

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

.method public static synthetic lambda$initSendVerificationCodeButton$0(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;Landroid/view/View;)V
    .locals 0

    .line 120
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;->onVerifyPhoneNumberClicked()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;
    .locals 1

    .line 50
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;)V

    .line 52
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent$Builder;->verifyPhoneNumberModule(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberModule;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent$Builder;

    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/DaggerVerifyPhoneNumberComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishSuccessfully()V
    .locals 1

    const/4 v0, -0x1

    .line 136
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->setResult(I)V

    .line 137
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;)V
    .locals 0

    .line 58
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)V

    return-void
.end method

.method public launchVerifyCode(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 130
    new-instance v0, Lcom/ibotta/android/routing/intent/VerifyCodeIntentCreator;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/routing/intent/VerifyCodeIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/VerifyCodeIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0x15

    .line 130
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x15

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 78
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;->onVerifyComplete()V

    goto :goto_0

    .line 80
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 63
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0079

    .line 65
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->setContentView(I)V

    .line 66
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const p1, 0x7f110665

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->setTitle(I)V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->initCountryCodeSpinner()V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->initPhoneNumberInput()V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->initSendVerificationCodeButton()V

    return-void
.end method

.method public setSendVerificationCodeEnabled(Z)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->bSendVerificationCode:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method
