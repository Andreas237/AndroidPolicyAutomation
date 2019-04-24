.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;
.super Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;
.source "FeaturedActivity.java"

# interfaces
.implements Lcom/ibotta/android/activity/RootActivity;
.implements Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;
.implements Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;
.implements Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/search/SearchMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;",
        ">;",
        "Lcom/ibotta/android/activity/RootActivity;",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;",
        "Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;",
        "Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field app:Lcom/ibotta/android/App;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field appRater:Lcom/ibotta/android/AppRater;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private appRaterChecked:Z

.field currentBalanceActionProvider:Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field debugState:Lcom/ibotta/android/state/app/debug/DebugState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field deferredDeepLinkManager:Lcom/ibotta/android/routing/DeferredDeepLinkManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field deviceRegistrationAsync:Lcom/ibotta/android/async/device/DeviceRegistrationAsync;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090201
    .end annotation
.end field

.field handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024c
    .end annotation
.end field

.field private isSearchResultsGrid:Z

.field private localBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field protected nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090374
    .end annotation
.end field

.field notificationActionProvider:Lcom/ibotta/android/fragment/home/NotificationActionProvider;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected svSearchView:Lcom/ibotta/android/views/search/SearchView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090437
    .end annotation
.end field

.field tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "FeaturedActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "4"

    const-string v2, "onStart"

    const-string v3, "com.ibotta.android.mvp.ui.activity.featured.FeaturedActivity"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xa0

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNavButtonSelected"

    const-string v3, "com.ibotta.android.mvp.ui.activity.featured.FeaturedActivity"

    const-string v4, "com.ibotta.android.mvp.ui.view.nav.NavButtonType"

    const-string v5, "navButtonType"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x190

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private applyOfferTagStartParam()V
    .locals 2

    .line 255
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 259
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "offer_tag"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 260
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->setOfferTag(Ljava/lang/String;)V

    return-void
.end method

.method private applySearchStartParam()V
    .locals 2

    .line 246
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 250
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "search_param"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 251
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->setSearch(Ljava/lang/String;)V

    return-void
.end method

.method private applyShareIntent()V
    .locals 3

    .line 264
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 268
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "shareable_subject"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 269
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "shareable_body"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 271
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 275
    :cond_1
    new-instance v2, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;

    invoke-direct {v2, p0, v0, v1}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method private changeToolbarLayout(Z)V
    .locals 5

    .line 660
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSearchView()Lcom/ibotta/android/views/search/SearchView;

    move-result-object v0

    .line 661
    invoke-virtual {v0}, Lcom/ibotta/android/views/search/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701bb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 662
    invoke-virtual {v0}, Lcom/ibotta/android/views/search/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07015e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 664
    invoke-virtual {v0}, Lcom/ibotta/android/views/search/SearchView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    .line 665
    :cond_0
    invoke-virtual {v3, v1, v2, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 667
    invoke-virtual {v0}, Lcom/ibotta/android/views/search/SearchView;->requestLayout()V

    .line 668
    invoke-virtual {v0, v4}, Lcom/ibotta/android/views/search/SearchView;->setVisibility(I)V

    return-void
.end method

.method private initCrashManager()V
    .locals 2

    .line 220
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->isIgnoreUpdates()Z

    move-result v1

    invoke-virtual {v0, p0, v1}, Lcom/ibotta/android/crash/CrashManager;->registerUpdateManager(Landroid/app/Activity;Z)V

    return-void
.end method

.method private initCurrentBalanceMenuItem(Landroid/view/MenuItem;)V
    .locals 2

    .line 309
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->currentBalanceActionProvider:Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->getCurrentBalanceViewState()Lcom/ibotta/android/views/featured/CurrentBalanceViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->updateViewState(Lcom/ibotta/android/views/featured/CurrentBalanceViewState;)V

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->currentBalanceActionProvider:Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->bindViewEvents(Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;)V

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->showAmountBadge()Z

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->currentBalanceActionProvider:Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompat;->setActionProvider(Landroid/view/MenuItem;Landroid/support/v4/view/ActionProvider;)Landroid/view/MenuItem;

    return-void
.end method

.method private initDeepLinkFetcher()V
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->deferredDeepLinkManager:Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    invoke-virtual {v0}, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->fetchDeepLink()V

    return-void
.end method

.method private initDeviceRegistration()V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->deviceRegistrationAsync:Lcom/ibotta/android/async/device/DeviceRegistrationAsync;

    invoke-interface {v0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsync;->registerDevice()V

    return-void
.end method

.method private initNavBar()V
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    return-void
.end method

.method private initNotificationMenuItem(Landroid/view/MenuItem;)V
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationActionProvider:Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->refresh()V

    .line 303
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationActionProvider:Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/featured/-$$Lambda$FeaturedActivity$liJ6-5QzWwm9hYyhs46VnrEAEl8;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/-$$Lambda$FeaturedActivity$liJ6-5QzWwm9hYyhs46VnrEAEl8;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 304
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationActionProvider:Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompat;->setActionProvider(Landroid/view/MenuItem;Landroid/support/v4/view/ActionProvider;)Landroid/view/MenuItem;

    return-void
.end method

.method private initPixelTracking()V
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->startIfWorkToDo()V

    return-void
.end method

.method private initRecycler()V
    .locals 3

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->setListener(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->onVisibilityChanged(Z)V

    return-void
.end method

.method private initScrollingBottomSpace()V
    .locals 2

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->setBottomPadding(Landroid/view/View;)V

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->setBottomPadding(Landroid/view/View;)V

    return-void
.end method

.method private initSearchBar()V
    .locals 1

    const v0, 0x7f09043a

    .line 209
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 210
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initToolBar()V

    return-void
.end method

.method public static synthetic lambda$initNotificationMenuItem$0(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Landroid/view/View;)V
    .locals 0

    .line 303
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->onNotificationMenuItemClicked()V

    return-void
.end method

.method private onNotificationMenuItemClicked()V
    .locals 2

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->onBellClicked(Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onActivityClicked()V

    return-void
.end method

.method private scrollToTop()V
    .locals 3

    .line 198
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "scroll_to_top"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->smoothScrollToPosition(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 98
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;
    .locals 1

    .line 127
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$Builder;

    move-result-object v0

    .line 128
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;Landroid/app/Activity;)V

    .line 129
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$Builder;->featuredModule(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$Builder;

    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;

    move-result-object p1

    return-object p1
.end method

.method public createRetailerModel(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_1

    .line 523
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 526
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/RetailerContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/RetailerContent;-><init>()V

    .line 527
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/RetailerContent;->setId(I)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 327
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method protected getMainView()Landroid/view/View;
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getSearchResultsView()Lcom/ibotta/android/views/list/IbottaListView;
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    return-object v0
.end method

.method protected getSearchView()Lcom/ibotta/android/views/search/SearchView;
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    return-object v0
.end method

.method public getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 651
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method public hideMainView()V
    .locals 2

    .line 478
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 479
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->onVisibilityChanged(Z)V

    .line 480
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->setRefreshing(Z)V

    .line 481
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->changeToolbarLayout(Z)V

    .line 483
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->hideMainView()V

    return-void
.end method

.method protected initToolBar()V
    .locals 2

    .line 361
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->initToolBar()V

    .line 363
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 364
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 365
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v1, 0x7f08028d

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setLogo(I)V

    .line 366
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 367
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 98
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;)V
    .locals 0

    .line 135
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V

    return-void
.end method

.method public launchRoute(Ljava/lang/String;)V
    .locals 5

    .line 418
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "unfavorite/retailer/\\d+"

    .line 419
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 423
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/"

    .line 424
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v3, 0x1

    add-int/2addr v0, v3

    .line 426
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 427
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 429
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v4, "Failed to parse retailer id: %1$s"

    .line 431
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    invoke-static {v0, v4, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 438
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->unfavorite(I)V

    goto :goto_2

    .line 439
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 440
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    invoke-direct {v0, p0, p1, v2}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0, v2}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V
    .locals 1

    .line 571
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onActionClicked(Lcom/ibotta/api/model/base/Actionable;)V

    .line 572
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackModuleActionClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public onBalanceClicked()V
    .locals 1

    .line 678
    new-instance v0, Lcom/ibotta/android/routing/intent/WithdrawIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/WithdrawIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/WithdrawIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 494
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/view/model/content/BonusItem;)V

    .line 495
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/base/Routable;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onBonusClicked(Lcom/ibotta/api/model/base/Routable;)V

    return-void
.end method

.method public onCategoryClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/retailer/Category;)V
    .locals 1

    .line 600
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    .line 601
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onCategoryClicked(Lcom/ibotta/api/model/retailer/Category;)V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 500
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onTrackContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    .line 501
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->createRetailerModel(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 140
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0036

    .line 142
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->setContentView(I)V

    .line 143
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 145
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initNavBar()V

    .line 146
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initSearchBar()V

    .line 147
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initRecycler()V

    .line 148
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initCrashManager()V

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initDeviceRegistration()V

    .line 150
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initPixelTracking()V

    .line 151
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initDeepLinkFetcher()V

    .line 152
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initScrollingBottomSpace()V

    .line 153
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->applySearchStartParam()V

    .line 154
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->applyOfferTagStartParam()V

    .line 155
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->applyShareIntent()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 289
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->isSearchResultsGrid:Z

    if-eqz v0, :cond_0

    .line 290
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1

    .line 293
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0007

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f090016

    .line 295
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initNotificationMenuItem(Landroid/view/MenuItem;)V

    const v0, 0x7f090018

    .line 296
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->initCurrentBalanceMenuItem(Landroid/view/MenuItem;)V

    .line 298
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 1

    .line 451
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->appRaterChecked:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 453
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->appRaterChecked:Z

    .line 454
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->appRater:Lcom/ibotta/android/AppRater;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/AppRater;->check(Ljava/lang/String;)Z

    .line 456
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->currentBalanceActionProvider:Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->getCurrentBalanceViewState()Lcom/ibotta/android/views/featured/CurrentBalanceViewState;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->updateViewState(Lcom/ibotta/android/views/featured/CurrentBalanceViewState;)V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/FeatureModel;Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 558
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    .line 559
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 566
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

    return-void
.end method

.method protected onLocalBroadcastReceived(Landroid/content/Intent;)V
    .locals 1

    .line 279
    invoke-static {p1}, Lcom/ibotta/android/LocalBroadcast;->isNotificationCount(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 280
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onCustomerNotificationReceived()V

    goto :goto_0

    .line 281
    :cond_0
    invoke-static {p1}, Lcom/ibotta/android/LocalBroadcast;->isRefreshData(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 282
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->setResetViewStatesOnRefreshDisabled()V

    .line 283
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onRefresh()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 400
    :try_start_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-ne p1, v1, :cond_0

    .line 401
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->smoothScrollToPosition(I)V

    .line 402
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onExitSearch()V

    goto :goto_0

    .line 406
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    :goto_0
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 189
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 191
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->setIntent(Landroid/content/Intent;)V

    .line 193
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->scrollToTop()V

    .line 194
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->applySearchStartParam()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 174
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onPause()V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->saveVisibleViewStates()V

    return-void
.end method

.method public onQuestClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/BonusModel;I)V
    .locals 3

    .line 594
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v1

    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/QuestModel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackQuestClick(Lcom/ibotta/api/model/base/Module;ILjava/lang/String;I)V

    .line 595
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onQuestClicked(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 372
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const-string v0, "Location permission prompt results received."

    const/4 v1, 0x0

    .line 374
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    return-void

    .line 380
    :cond_0
    sget-object p1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 382
    :goto_0
    array-length v3, p2

    if-ge v0, v3, :cond_2

    .line 383
    aget-object v3, p2, v0

    .line 384
    aget v4, p3, v0

    .line 385
    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 390
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne v2, p1, :cond_3

    const-string p1, "Location permissions granted."

    .line 391
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onLocationPermissionsGranted()V

    goto :goto_1

    :cond_3
    const-string p1, "Location permissions denied."

    .line 394
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/base/Module;)V
    .locals 2

    .line 487
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->getRetailerModel(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 488
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    .line 489
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 518
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    return-void
.end method

.method protected onStart()V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStart;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->FIRST_CONTENT:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 160
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onStart()V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    .line 163
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 169
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.ibotta.android.LOCAL"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 181
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 184
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onStop()V

    return-void
.end method

.method public onSubListContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 582
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    if-eqz v0, :cond_0

    .line 583
    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackSubListContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    :cond_0
    return-void
.end method

.method public onTitleMenuActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V
    .locals 0

    .line 577
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackModuleTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 589
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackModuleTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public onTrackContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 533
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method

.method public onTrackShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 548
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method

.method public onTrackUnlockClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 538
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method

.method public onTrackUnlockedClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 543
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 506
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onTrackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    .line 507
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->createRetailerModel(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 512
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onTrackUnlocked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    .line 513
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->createRetailerModel(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public promptForLocationPermissions()V
    .locals 2

    .line 629
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->app:Lcom/ibotta/android/App;

    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Prompting for Location permissions."

    .line 632
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    sget-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 636
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    .line 634
    invoke-static {p0, v0, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const-string v0, "Location permissions already granted."

    .line 639
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public resetViewStates()V
    .locals 1

    .line 673
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->resetViewStates()V

    return-void
.end method

.method public routeToDeepLink(Ljava/lang/String;)V
    .locals 2

    .line 645
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 646
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public setFeaturedRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;)V"
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->setRows(Ljava/util/List;)V

    .line 412
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->onVisibilityChanged(Z)V

    return-void
.end method

.method public showActivity()V
    .locals 1

    .line 446
    new-instance v0, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showBonusDetailQuest(Ljava/lang/String;I)V
    .locals 3

    .line 683
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 684
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput p2, v1, v2

    .line 685
    invoke-virtual {p1, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 686
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->explicitRequest(Z)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 687
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->isQuest(Z)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 688
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 683
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showCategoryGallery(I)V
    .locals 1

    .line 623
    new-instance v0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 624
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showMainView()V
    .locals 3

    .line 461
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 462
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v2, 0x7f08028d

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/Toolbar;->setLogo(I)V

    .line 464
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->flvRecycler:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->onVisibilityChanged(Z)V

    .line 465
    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->changeToolbarLayout(Z)V

    .line 466
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 468
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->isSearchResultsGrid:Z

    if-eqz v0, :cond_0

    .line 469
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->isSearchResultsGrid:Z

    .line 470
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->invalidateOptionsMenu()V

    .line 473
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->showMainView()V

    return-void
.end method

.method public showRetailerUnfavoritedFailed()V
    .locals 3

    const v0, 0x7f1102bf

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 618
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showRetailerUnfavoritedSuccess()V
    .locals 1

    const v0, 0x7f1102c0

    .line 613
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->showQuickMessage(I)V

    return-void
.end method

.method public updateNotificationCount(I)V
    .locals 0

    .line 606
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationActionProvider:Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    if-eqz p1, :cond_0

    .line 607
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->refresh()V

    :cond_0
    return-void
.end method

.method public updateSearchListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 2

    .line 337
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/views/list/GridLayout;

    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSearchView()Lcom/ibotta/android/views/search/SearchView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/search/SearchView;->setVisibility(I)V

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getSearchTerm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 342
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 343
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->isSearchResultsGrid:Z

    .line 344
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->invalidateOptionsMenu()V

    .line 346
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->updateSearchListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method
