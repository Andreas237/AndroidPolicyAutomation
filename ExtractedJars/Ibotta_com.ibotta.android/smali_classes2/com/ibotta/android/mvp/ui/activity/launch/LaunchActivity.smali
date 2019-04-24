.class public Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "LaunchActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;
.implements Lcom/ibotta/android/social/google/GoogleSignInListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;",
        "Lcom/ibotta/android/social/google/GoogleSignInListener;"
    }
.end annotation


# instance fields
.field protected app:Lcom/ibotta/android/App;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private authLost:Z

.field protected authManager:Lcom/ibotta/android/state/user/auth/AuthManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected deferredDeepLinkManager:Lcom/ibotta/android/routing/DeferredDeepLinkManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected gControls:Landroid/support/constraint/Group;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090209
    .end annotation
.end field

.field protected gLoading:Landroid/support/constraint/Group;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09020a
    .end annotation
.end field

.field protected googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private mediaPlayer:Landroid/media/MediaPlayer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvVideo:Landroid/view/TextureView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090599
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->destroyVideo()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Landroid/media/MediaPlayer;
    .locals 0

    .line 62
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    return-object p1
.end method

.method private destroyVideo()V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    .line 218
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    :cond_0
    return-void
.end method

.method private initDebugMenuAccess()V
    .locals 3

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugMenuAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->tvVideo:Landroid/view/TextureView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$LaunchActivity$lBZWvciJJNiwMSEnlV01yTGK0Ag;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$LaunchActivity$lBZWvciJJNiwMSEnlV01yTGK0Ag;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnLongClickListener(Landroid/view/View;Landroid/view/View$OnLongClickListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private initFullScreen()V
    .locals 2

    .line 199
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x500

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 202
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method public static synthetic lambda$initDebugMenuAccess$0(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Landroid/view/View;)Z
    .locals 0

    .line 208
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onDebugMenuRequested()V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 62
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;
    .locals 1

    .line 84
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;

    move-result-object v0

    .line 85
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;)V

    .line 86
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->launchModule(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;

    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;

    move-result-object p1

    return-object p1
.end method

.method public executeRoute(Ljava/lang/String;)V
    .locals 2

    .line 249
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 250
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public getRoute()Ljava/lang/String;
    .locals 2

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/push/PushMessaging;->getRoute(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hideFacebookLoading()V
    .locals 0

    .line 350
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->hideSubmittedJobLoading()V

    return-void
.end method

.method protected initToolBar()V
    .locals 2

    .line 135
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->initToolBar()V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 62
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;)V
    .locals 0

    .line 92
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    return-void
.end method

.method public isAutoSocialConnect()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public loadVideo()V
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->tvVideo:Landroid/view/TextureView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 176
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/social/facebook/FacebookManager;->onActivityResult(IILandroid/content/Intent;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/social/google/GoogleSignInManager;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x1

    const/16 v1, 0x10

    if-ne p1, v1, :cond_0

    if-ne p2, v0, :cond_0

    .line 182
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onEmailLoginSuccess()V

    goto :goto_1

    :cond_0
    const/16 v1, 0x11

    if-ne p1, v1, :cond_3

    if-ne p2, v0, :cond_3

    if-eqz p3, :cond_1

    const-string p1, "onboarding_retailers"

    .line 187
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_2

    .line 190
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 193
    :cond_2
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    .line 194
    invoke-static {p1}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleHelper;->convertToOnboardingModulesParcels(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 193
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onRegistrationSuccess(Ljava/util/List;)V

    :cond_3
    :goto_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->isTaskRoot()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->finish()V

    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setUiListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setInfoListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setAuthListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;)V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setLoginListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;)V

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-interface {v0, p0}, Lcom/ibotta/android/social/google/GoogleSignInManager;->setGoogleSignInListener(Lcom/ibotta/android/social/google/GoogleSignInListener;)V

    if-eqz p1, :cond_1

    const-string v0, "auth_lost"

    .line 117
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authLost:Z

    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "auth_lost"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authLost:Z

    :cond_2
    :goto_0
    const p1, 0x7f0c0043

    .line 122
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->setContentView(I)V

    .line 123
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 125
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->initFullScreen()V

    .line 126
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->initDebugMenuAccess()V

    const/4 p1, 0x0

    .line 127
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 128
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onCreate()V

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->setFacebookManager(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->setGoogleSignInManager(Lcom/ibotta/android/social/google/GoogleSignInManager;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onDestroy()V

    .line 170
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->destroyVideo()V

    .line 171
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDestroy()V

    return-void
.end method

.method public onFacebookAuthFailed()V
    .locals 1

    .line 355
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onFacebookInteractionFailed()V

    return-void
.end method

.method public onFacebookAuthSuccess()V
    .locals 1

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onFacebookAuthSuccess()V

    return-void
.end method

.method public onFacebookInfoFailed()V
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onFacebookInteractionFailed()V

    return-void
.end method

.method public onFacebookInfoSuccess()V
    .locals 1

    .line 365
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onFacebookInfoSuccess()V

    return-void
.end method

.method public onFacebookLoginFailed()V
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onFacebookInteractionFailed()V

    return-void
.end method

.method public onFacebookLoginSuccess(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 375
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onLoginSuccess()V

    return-void
.end method

.method public onGoogleAuthFailure(Lcom/google/android/gms/common/api/ApiException;)V
    .locals 3

    .line 396
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/ApiException;->getStatusCode()I

    move-result p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;

    const/4 v1, 0x0

    const/4 v2, 0x5

    .line 395
    invoke-static {p1, p0, v1, v2, v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorDialogFragment(ILandroid/app/Activity;Landroid/support/v4/app/Fragment;ILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void
.end method

.method public onGoogleAuthSuccess(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onGoogleSignInSuccess(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V

    return-void
.end method

.method protected onLogInClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090543
        }
    .end annotation

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onLogInClicked()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 149
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onResume()V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->deferredDeepLinkManager:Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    invoke-virtual {v0}, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->fetchDeepLink()V

    .line 157
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authLost:Z

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onLostAuthDetected()V

    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 143
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "auth_lost"

    .line 144
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authLost:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onSignInFacebookClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09021f
        }
    .end annotation

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onSignInFacebookClicked()V

    return-void
.end method

.method protected onSignInGoogleClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090220
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onSignInGoogleClicked()V

    return-void
.end method

.method protected onSignUpEmailClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090221
        }
    .end annotation

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;->onSignUpEmailClicked()V

    return-void
.end method

.method protected onStop()V
    .locals 0

    .line 164
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStop()V

    return-void
.end method

.method public showAuthLostMessage()V
    .locals 3

    const v0, 0x7f11013f

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 306
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showControls()V
    .locals 2

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->gLoading:Landroid/support/constraint/Group;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/constraint/Group;->setVisibility(I)V

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->tvVideo:Landroid/view/TextureView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->gControls:Landroid/support/constraint/Group;

    invoke-virtual {v0, v1}, Landroid/support/constraint/Group;->setVisibility(I)V

    return-void
.end method

.method public showDebugMenu()V
    .locals 1

    .line 301
    new-instance v0, Lcom/ibotta/android/routing/intent/DebugSettingsIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/DebugSettingsIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/DebugSettingsIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showFacebookLoading(Ljava/lang/String;)V
    .locals 0

    .line 345
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method

.method public showFeatured()V
    .locals 0

    .line 324
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->showFeatured()V

    .line 325
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->finish()V

    return-void
.end method

.method public showLogIn()V
    .locals 0

    .line 335
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->startForResult(Landroid/app/Activity;)V

    return-void
.end method

.method public showPersonalStoreChooser(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation

    const-string p1, "Prince data in the Launch Activity"

    const/4 v0, 0x0

    .line 317
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->start(Landroid/content/Context;)V

    .line 319
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->finish()V

    return-void
.end method

.method public showRegistration()V
    .locals 0

    .line 330
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->startForResult(Landroid/app/Activity;)V

    return-void
.end method

.method public signInWithGoogle()V
    .locals 2

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-interface {v0}, Lcom/ibotta/android/social/google/GoogleSignInManager;->getSignInIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
