.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "VerifyDeviceActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;"
    }
.end annotation


# instance fields
.field appConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bStartVerification:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900aa
    .end annotation
.end field

.field protected bWhyDoThis:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b3
    .end annotation
.end field

.field protected tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initStartVerificationButton()V
    .locals 3

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->bStartVerification:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/-$$Lambda$VerifyDeviceActivity$MUJMg-NWhVSbPG0B2-8GYZGw7Oc;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/-$$Lambda$VerifyDeviceActivity$MUJMg-NWhVSbPG0B2-8GYZGw7Oc;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;)V

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

.method private initWhyDoThisButton()V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->bWhyDoThis:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/-$$Lambda$VerifyDeviceActivity$uhTA8ILiXlAwNgcrPdzPgOBNQDw;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/-$$Lambda$VerifyDeviceActivity$uhTA8ILiXlAwNgcrPdzPgOBNQDw;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;)V

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

.method public static synthetic lambda$initStartVerificationButton$0(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;Landroid/view/View;)V
    .locals 0

    .line 123
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;->onStartVerificationClicked()V

    return-void
.end method

.method public static synthetic lambda$initWhyDoThisButton$1(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;Landroid/view/View;)V
    .locals 0

    .line 127
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;->onWhyDoThisClicked()V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 47
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static startForResult(Landroid/app/Activity;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x15

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;
    .locals 1

    .line 52
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;

    move-result-object v0

    .line 53
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;)V

    .line 54
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->verifyDeviceModule(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;

    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishSuccessfully()V
    .locals 1

    const/4 v0, -0x1

    .line 143
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->setResult(I)V

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->finish()V

    return-void
.end method

.method protected initToolBar()V
    .locals 2

    .line 113
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->initToolBar()V

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v1, 0x7f08028d

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setLogo(I)V

    .line 118
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;)V
    .locals 0

    .line 60
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;)V

    return-void
.end method

.method public launchVerifyPhoneNumber()V
    .locals 2

    .line 132
    new-instance v0, Lcom/ibotta/android/routing/intent/VerifyPhoneNumberIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/VerifyPhoneNumberIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/VerifyPhoneNumberIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x15

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public launchWhyDoThis()V
    .locals 2

    .line 137
    new-instance v0, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->appConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    .line 138
    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->getHelpLinkUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 137
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x15

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;->onVerifyComplete()V

    goto :goto_0

    .line 107
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

    .line 65
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0077

    .line 67
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->setContentView(I)V

    .line 68
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->initStartVerificationButton()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->initWhyDoThisButton()V

    return-void
.end method
