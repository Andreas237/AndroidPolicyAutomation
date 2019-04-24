.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "MyOffersActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;
.implements Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;
.implements Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;",
        "Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;",
        "Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;"
    }
.end annotation


# static fields
.field private static final ACTION_SHEET_OPTION_SEE_MORE:I = 0x1

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

.field protected brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private moreStoresVisible:Z

.field protected mrevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090362
    .end annotation
.end field

.field protected nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090374
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

.field protected toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09043a
    .end annotation
.end field

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
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    const/4 v0, 0x0

    .line 75
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->moreStoresVisible:Z

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    return-object p0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "MyOffersActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNavButtonSelected"

    const-string v3, "com.ibotta.android.mvp.ui.activity.myoffers.main.MyOffersActivity"

    const-string v4, "com.ibotta.android.mvp.ui.view.nav.NavButtonType"

    const-string v5, "navButtonType"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xe4

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initEmpty()V
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mrevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/-$$Lambda$MyOffersActivity$FFikIMZIsM41IHK6MQfw8vCT_6M;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/-$$Lambda$MyOffersActivity$FFikIMZIsM41IHK6MQfw8vCT_6M;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->bindViewEvents(Lcom/ibotta/android/views/rebate/MyRebatesEmptyViewEvents;)V

    return-void
.end method

.method private initNavBar()V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    return-void
.end method

.method private initTabSelector()V
    .locals 3

    .line 152
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;-><init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->setSwipeRefresh(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    return-void
.end method

.method public static synthetic lambda$initEmpty$0(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;->onFindRebatesClicked()V

    return-void
.end method

.method private scrollToFirstTabTop()V
    .locals 3

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 189
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "scroll_to_top"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    .line 192
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->scrollToTopOfCurrentList()V

    :cond_1
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 59
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;
    .locals 1

    .line 89
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;

    move-result-object v0

    .line 90
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;)V

    .line 91
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->myOffersModule(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;

    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 79
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MY_REBATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 338
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method protected initToolBar()V
    .locals 2

    .line 141
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->initToolBar()V

    .line 143
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 146
    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    const v1, 0x7f110434

    .line 147
    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 59
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;)V
    .locals 0

    .line 97
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V

    return-void
.end method

.method public onActionSheetOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1

    .line 326
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 327
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;->onSeeMoreClicked()V

    :cond_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 243
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x12

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 247
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;->onRebatesRemoved()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 102
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0051

    .line 104
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->setContentView(I)V

    .line 105
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->initTabSelector()V

    .line 108
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->initEmpty()V

    .line 109
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->initNavBar()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 198
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d000e

    .line 199
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 201
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 228
    :try_start_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-ne p1, v1, :cond_1

    .line 229
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 230
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 233
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    .line 234
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->scrollToTopOfCurrentList()V

    goto :goto_0

    .line 238
    :cond_1
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
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

    .line 114
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 115
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->setIntent(Landroid/content/Intent;)V

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->scrollToFirstTabTop()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 212
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 215
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f090021

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 217
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;->onMoreEllipsesClicked()V

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const v0, 0x7f090021

    .line 206
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->moreStoresVisible:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 207
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 1

    .line 127
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onResume()V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackMyRebatesView()V

    return-void
.end method

.method public onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;->onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 121
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStart()V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->onVisibilityChanged(Z)V

    .line 136
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStop()V

    return-void
.end method

.method public onTrackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V
    .locals 1

    .line 333
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->trackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V

    return-void
.end method

.method public setDataMap(Ljava/util/LinkedHashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;>;)V"
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->setDataMap(Ljava/util/LinkedHashMap;)V

    .line 255
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    if-le v0, v3, :cond_0

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    goto :goto_0

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 261
    :goto_0
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 262
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mrevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->setVisibility(I)V

    goto :goto_1

    .line 264
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->mrevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->setVisibility(I)V

    .line 267
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;

    invoke-virtual {p1, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->onVisibilityChanged(Z)V

    return-void
.end method

.method public setMoreMenuVisible(Z)V
    .locals 0

    .line 297
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->moreStoresVisible:Z

    .line 298
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->invalidateOptionsMenu()V

    return-void
.end method

.method public showMoreMenu()V
    .locals 3

    .line 303
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v1, 0x1

    .line 304
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v2, 0x7f0802a3

    .line 305
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    const v2, 0x7f11042f

    .line 306
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 308
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 311
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 312
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    const v1, 0x7f110430

    .line 313
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setTitle(I)V

    .line 314
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 316
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method

.method public showMoreStores()V
    .locals 0

    .line 321
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;->start(Landroid/content/Context;)V

    return-void
.end method

.method public showMyOffersGallery(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/im/ImConnectionStatus;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 281
    :cond_0
    new-instance v0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;-><init>(Landroid/content/Context;)V

    .line 282
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId(I)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object v0

    .line 283
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object v0

    .line 284
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->verificationType(Lcom/ibotta/api/model/common/VerificationType;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object p1

    .line 285
    invoke-virtual {p1, p2}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->imConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object p1

    .line 286
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0x12

    .line 287
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showRemovedRebatesSuccess()V
    .locals 1

    const v0, 0x7f110431

    .line 292
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;->showQuickMessage(I)V

    return-void
.end method
