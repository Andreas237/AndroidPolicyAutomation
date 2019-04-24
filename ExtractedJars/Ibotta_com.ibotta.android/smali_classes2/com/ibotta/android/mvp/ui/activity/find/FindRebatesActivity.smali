.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;
.super Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;
.source "FindRebatesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;
.implements Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/search/SearchMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;",
        "Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected appBarLayout:Landroid/support/design/widget/AppBarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09005e
    .end annotation
.end field

.field protected brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f8
    .end annotation
.end field

.field protected frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090205
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024c
    .end annotation
.end field

.field protected nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090374
    .end annotation
.end field

.field protected retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "FindRebatesActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNavButtonSelected"

    const-string v3, "com.ibotta.android.mvp.ui.activity.find.FindRebatesActivity"

    const-string v4, "com.ibotta.android.mvp.ui.view.nav.NavButtonType"

    const-string v5, "navButtonType"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x4c

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initFullScreen()V
    .locals 2

    .line 156
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    const/16 v1, 0x2000

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/search/SearchView;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

.method private initNavBar()V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    return-void
.end method

.method private initRecycler()V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->setListener(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->onVisibilityChanged(Z)V

    return-void
.end method

.method private initScrollingBottomSpace()V
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->setBottomPadding(Landroid/view/View;)V

    return-void
.end method

.method private scrollToTop()V
    .locals 3

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "scroll_to_top"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->smoothScrollToPosition(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 52
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;
    .locals 1

    .line 92
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent$Builder;

    move-result-object v0

    .line 93
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;)V

    .line 94
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent$Builder;->findRebatesModule(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;)Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent$Builder;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/DaggerFindRebatesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 137
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FIND_REBATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method protected getMainView()Landroid/view/View;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

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

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    return-object v0
.end method

.method protected getSearchView()Lcom/ibotta/android/views/search/SearchView;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    return-object v0
.end method

.method public getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 238
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 52
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;)V
    .locals 0

    .line 100
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public launchFavoriteRetailerGallery(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 190
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 192
    invoke-interface {v1, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    sget-object p1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 193
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->tabContext(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 194
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 190
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public launchManageFavorites()V
    .locals 1

    .line 226
    new-instance v0, Lcom/ibotta/android/routing/intent/FavoritesIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/FavoritesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/FavoritesIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public launchRetailerCategoryGallery(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
    .locals 1

    .line 231
    new-instance v0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V

    sget-object p1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 232
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->tabContext(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;

    move-result-object p1

    .line 233
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 231
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 105
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0037

    .line 107
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->setContentView(I)V

    .line 108
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->initFullScreen()V

    .line 111
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->initNavBar()V

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->initRecycler()V

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->initScrollingBottomSpace()V

    return-void
.end method

.method public onFavoriteRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;->favoriteRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onManageFavoritesClicked()V
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;->onManageFavoritesClicked()V

    return-void
.end method

.method public onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 76
    :try_start_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-ne p1, v1, :cond_0

    .line 77
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;->onExitSearch()V

    .line 78
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->smoothScrollToPosition(I)V

    goto :goto_0

    .line 82
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
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

    .line 118
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 119
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->setIntent(Landroid/content/Intent;)V

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->scrollToTop()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 131
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onResume()V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackFindRebatesView()V

    return-void
.end method

.method public onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;->onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 125
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onStart()V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    return-void
.end method

.method public onSubListContentVisible(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackSubListContentVisible(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V

    :cond_0
    return-void
.end method

.method public onTitleMenuClicked()V
    .locals 0

    return-void
.end method

.method public onTrackRetailerClicked(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackRetailerClicked(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V

    return-void
.end method

.method public setFindRebatesRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;)V"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->setRows(Ljava/util/List;)V

    .line 185
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->frlvRecycler:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->onVisibilityChanged(Z)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f11016c

    .line 248
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->setTitle(I)V

    return-void
.end method

.method public updateSearchListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 2

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->setIlvBottomPadding(Landroid/content/res/Resources;Lcom/ibotta/android/views/list/IbottaListViewState;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->updateSearchListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method
