.class public Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "DebugMenuActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;
.implements Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;
.implements Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;"
    }
.end annotation


# instance fields
.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rvMenu:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903da
    .end annotation
.end field

.field private semiModal:Lcom/ibotta/android/views/messages/alert/SemiModal;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private initAdapter()V
    .locals 4

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->rvMenu:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->rvMenu:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method private showSemiModal(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 160
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    const v1, 0x7f08029a

    .line 161
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 162
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 163
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    const p2, 0x104000a

    .line 164
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 165
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    .line 167
    invoke-static {p0, p1, p0}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->semiModal:Lcom/ibotta/android/views/messages/alert/SemiModal;

    .line 168
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->semiModal:Lcom/ibotta/android/views/messages/alert/SemiModal;

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method


# virtual methods
.method public clearImageCache()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-interface {v0, p0}, Lcom/ibotta/android/images/ImageCache;->freeMemory(Landroid/content/Context;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;
    .locals 1

    .line 51
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;)V

    .line 53
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent$Builder;->debugMenuModule(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;)Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DaggerDebugMenuComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;

    move-result-object p1

    return-object p1
.end method

.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;)V
    .locals 0

    .line 59
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c002e

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->setContentView(I)V

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->initAdapter()V

    return-void
.end method

.method public onDebugMenuItemClicked(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;->onDebugMenuItemClicked(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;)V

    return-void
.end method

.method public onNegativeTapped()V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->semiModal:Lcom/ibotta/android/views/messages/alert/SemiModal;

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/SemiModal;->dismiss()V

    :cond_0
    return-void
.end method

.method public onPositiveTapped()V
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->semiModal:Lcom/ibotta/android/views/messages/alert/SemiModal;

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/SemiModal;->dismiss()V

    :cond_0
    return-void
.end method

.method public requestDebugLoadingPermissions()V
    .locals 3

    .line 84
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_1

    .line 85
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    .line 88
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->startActivity(Landroid/content/Intent;)V

    const-string v0, "Please grant Ibotta permission to draw over apps."

    .line 90
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 93
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {v0, p0}, Lcom/ibotta/android/service/debug/DebugOverlayService;->start(Lcom/ibotta/android/profile/BuildProfile;Landroid/content/Context;)V

    :goto_2
    return-void
.end method

.method public showDebugFeatureFlags()V
    .locals 1

    .line 114
    new-instance v0, Lcom/ibotta/android/routing/intent/DebugFeatureFlagsIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/DebugFeatureFlagsIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/DebugFeatureFlagsIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showFindEngagements()V
    .locals 0

    .line 109
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->start(Landroid/content/Context;)V

    return-void
.end method

.method public showGeneralDebugSettings()V
    .locals 1

    .line 79
    new-instance v0, Lcom/ibotta/android/routing/intent/DebugSettingsIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/DebugSettingsIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/DebugSettingsIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showGeofenceTest()V
    .locals 2

    .line 104
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showImageTransparencyChangeToast(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const p1, 0x7f11023d

    .line 125
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const p1, 0x7f11023c

    .line 126
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 124
    :goto_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->showQuickMessage(Ljava/lang/String;)V

    return-void
.end method

.method public showOfferIdInSpotlightChangeToast(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const p1, 0x7f11023f

    .line 132
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const p1, 0x7f11023e

    .line 133
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 131
    :goto_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->showQuickMessage(Ljava/lang/String;)V

    return-void
.end method

.method public showPermissionPrimersToast(Z)V
    .locals 3

    const-string v0, "Permission Primers, Location: %1$b"

    const/4 v1, 0x1

    .line 143
    new-array v1, v1, [Ljava/lang/Object;

    .line 144
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 143
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->showQuickMessage(Ljava/lang/String;)V

    return-void
.end method

.method public showPwiOnboardingFlagClearedToast()V
    .locals 1

    const-string v0, "PWI Onboarding Completion Flag Cleared"

    .line 138
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->showQuickMessage(Ljava/lang/String;)V

    return-void
.end method

.method public showSemiModalDialog()V
    .locals 2

    const v0, 0x7f110503

    .line 154
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1104ff

    .line 155
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 156
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->showSemiModal(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public showTestRoutes()V
    .locals 1

    .line 99
    new-instance v0, Lcom/ibotta/android/routing/intent/DebugRoutesIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/DebugRoutesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/DebugRoutesIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
