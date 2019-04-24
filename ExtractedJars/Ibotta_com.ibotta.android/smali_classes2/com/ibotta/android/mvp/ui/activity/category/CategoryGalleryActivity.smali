.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "CategoryGalleryActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;
.implements Lcom/ibotta/android/views/content/row/ContentRowViewEvents;
.implements Lcom/ibotta/android/views/featured/PagingBannerViewEvents;
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

.field protected appBarLayout:Landroid/support/design/widget/AppBarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090029
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

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090374
    .end annotation
.end field

.field private retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

.field protected scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field private tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field protected tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a2
    .end annotation
.end field

.field protected vpPager:Landroid/support/v4/view/ViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905cc
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    return-object p0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "CategoryGalleryActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNavButtonSelected"

    const-string v3, "com.ibotta.android.mvp.ui.activity.category.CategoryGalleryActivity"

    const-string v4, "com.ibotta.android.mvp.ui.view.nav.NavButtonType"

    const-string v5, "navButtonType"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x89

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initNavBar()V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    return-void
.end method

.method private initTabSelector()V
    .locals 4

    .line 153
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;-><init>(Landroid/support/design/widget/AppBarLayout;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->values()[Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "tab_context"

    .line 193
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v0, "retailer_category"

    .line 194
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    goto :goto_0

    .line 195
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 196
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "tab_context"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 197
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer_category"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;
    .locals 1

    .line 83
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;

    move-result-object v0

    .line 84
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;)V

    .line 85
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->categoryGalleryModule(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;)Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 73
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getRetailerCategoryId()I
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v0

    return v0
.end method

.method protected initToolBar()V
    .locals 2

    .line 111
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->initToolBar()V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 53
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;)V
    .locals 0

    .line 91
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)V

    return-void
.end method

.method public launchRoute(Ljava/lang/String;)V
    .locals 2

    .line 215
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

    return-void
.end method

.method public onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;->onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 96
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 98
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0025

    .line 100
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->setContentView(I)V

    .line 101
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 103
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->initTabSelector()V

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->initNavBar()V

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;->setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 137
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-ne p1, v1, :cond_1

    .line 138
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$2;->$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->ordinal()I

    move-result v1

    aget p1, p1, v1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    invoke-direct {p1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "scroll_to_top"

    .line 141
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 v1, 0x24000000

    .line 142
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 143
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 149
    :cond_1
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
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

.method protected onResume()V
    .locals 2

    .line 125
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onResume()V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackRetailerCategoryViewed(I)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onRowRetailerImageClicked()V
    .locals 0

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 186
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "tab_context"

    .line 187
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "retailer_category"

    .line 188
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 119
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStart()V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->onVisibilityChanged(Z)V

    .line 132
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStop()V

    return-void
.end method

.method public setDataMap(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;)V"
        }
    .end annotation

    .line 203
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    goto :goto_0

    .line 206
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 209
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->setDataMap(Ljava/util/Map;)V

    .line 210
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->onVisibilityChanged(Z)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f110143

    .line 225
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->setTitle(I)V

    return-void
.end method
