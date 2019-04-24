.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;
.super Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;
.source "GalleryActivity.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;
.implements Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;
.implements Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;
.implements Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/search/SearchMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;",
        "Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;",
        "Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;",
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_6:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

.field protected appBarLayout:Landroid/support/design/widget/AppBarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090029
    .end annotation
.end field

.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f8
    .end annotation
.end field

.field protected clSearchContainer:Landroid/support/design/widget/CoordinatorLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f9
    .end annotation
.end field

.field protected evEmpty:Lcom/ibotta/android/views/empty/EmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d8
    .end annotation
.end field

.field private favorited:Z

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09020c
    .end annotation
.end field

.field protected ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024c
    .end annotation
.end field

.field protected imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090374
    .end annotation
.end field

.field protected nbvNavBarSearch:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090376
    .end annotation
.end field

.field private retailerCategoryId:Ljava/lang/Integer;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected routeHandler:Lcom/ibotta/android/routing/RouteHandler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private search:Ljava/lang/String;

.field private selectedCategoryId:Ljava/lang/Integer;

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field private started:Z

.field protected svSearchView:Lcom/ibotta/android/views/search/SearchView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090437
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
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;
    .locals 0

    .line 92
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    return-object p0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "GalleryActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNavButtonSelected"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "com.ibotta.android.mvp.ui.view.nav.NavButtonType"

    const-string v5, "navButtonType"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x169

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "setDataMap"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "java.util.LinkedHashMap"

    const-string v5, "dataMap"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x184

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onShopClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "com.ibotta.api.model.ContentModel:com.ibotta.api.model.RetailerModel"

    const-string v5, "contentModel:retailerModel"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x218

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onRedeemReceiptClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x25d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onBuyIgcClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x262

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onLinkLoyaltyCardClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x267

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onImCardClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.gallery.GalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x26c

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_6:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initAppBar()V
    .locals 2

    .line 227
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    :cond_0
    return-void
.end method

.method private initNavBar()V
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBarSearch:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    return-void
.end method

.method private initRetailerHeaderButtons()V
    .locals 1

    .line 499
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->bindViewEvents(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;)V

    return-void
.end method

.method private initSearch()V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/views/search/SearchViewEvents;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/search/SearchView;->bindViewEvents(Lcom/ibotta/android/views/search/SearchViewEvents;)V

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->initSearch()V

    return-void
.end method

.method private initTabSelector()V
    .locals 3

    .line 233
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;-><init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    return-void
.end method

.method public static synthetic lambda$getSearchHint$0(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    .line 271
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f1102fe

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "tab_context"

    .line 189
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v1, "retailer"

    .line 190
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v1, "favorited"

    .line 191
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->favorited:Z

    const-string v0, "retailer_category_id"

    .line 193
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "retailer_category_id"

    .line 194
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerCategoryId:Ljava/lang/Integer;

    goto :goto_0

    .line 196
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 197
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "tab_context"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 198
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 200
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer_category_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 201
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer_category_id"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerCategoryId:Ljava/lang/Integer;

    .line 204
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "selected_category_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 205
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "selected_category_id"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->selectedCategoryId:Ljava/lang/Integer;

    .line 208
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "search"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 209
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "search"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->search:Ljava/lang/String;

    :cond_3
    :goto_0
    return-void
.end method

.method private updateTabsVisible()V
    .locals 2

    .line 503
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->started:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->onVisibilityChanged(Z)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 92
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;
    .locals 1

    .line 133
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;

    move-result-object v0

    .line 134
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;)V

    .line 135
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->galleryModule(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;)Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;-><init>(Landroid/app/Activity;)V

    .line 136
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->imScreenModule(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 295
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->GALLERY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method protected getMainView()Landroid/view/View;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    return-object v0
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getRetailerCategoryId()Ljava/lang/Integer;
    .locals 1

    .line 584
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerCategoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 579
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    return v0
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 421
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 600
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public getSearchHint()Ljava/lang/String;
    .locals 2

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$5nx9TMJmc_Wi4bhm4gpJs59MlI0;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$5nx9TMJmc_Wi4bhm4gpJs59MlI0;

    .line 270
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryActivity$haoVEB2xdL2_i0W6h1s4JoyG2pY;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryActivity$haoVEB2xdL2_i0W6h1s4JoyG2pY;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V

    .line 271
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    const v1, 0x7f1101e0

    .line 272
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method protected getSearchResultsView()Lcom/ibotta/android/views/list/IbottaListView;
    .locals 1

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ilvSearchResults:Lcom/ibotta/android/views/list/IbottaListView;

    return-object v0
.end method

.method protected getSearchView()Lcom/ibotta/android/views/search/SearchView;
    .locals 1

    .line 300
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->svSearchView:Lcom/ibotta/android/views/search/SearchView;

    return-object v0
.end method

.method public getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 595
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method public hideSearch()V
    .locals 2

    .line 451
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clSearchContainer:Landroid/support/design/widget/CoordinatorLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/design/widget/CoordinatorLayout;->setVisibility(I)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 92
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;)V
    .locals 0

    .line 142
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V

    return-void
.end method

.method public launchRoute(Ljava/lang/String;)V
    .locals 2

    .line 426
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onBuyIgcClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 610
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onHeaderBuyIgcClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 611
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v0
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 519
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 147
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 149
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c003a

    .line 151
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->setContentView(I)V

    .line 152
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 154
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initTabSelector()V

    .line 155
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initNavBar()V

    .line 156
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initSearch()V

    .line 157
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initAppBar()V

    .line 159
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyViewState;

    const v1, 0x7f1101cd

    .line 160
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const v3, 0x7f0801a3

    invoke-direct {v0, v3, v1, v2}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 159
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    .line 162
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 163
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerCategoryId:Ljava/lang/Integer;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->setRetailerCategoryId(Ljava/lang/Integer;)V

    .line 164
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->selectedCategoryId:Ljava/lang/Integer;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->setSelectedCategoryId(Ljava/lang/Integer;)V

    .line 165
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->search:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->setSearch(Ljava/lang/String;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->menu:Landroid/view/Menu;

    .line 183
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onCreateOptionsMenu()V

    const/4 p1, 0x1

    return p1
.end method

.method public onDismissedNotificationClicked(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V
    .locals 0

    .line 589
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onDismissedNotificationClicked(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V

    .line 590
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->finish()V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 2

    .line 508
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/routing/RoutePreviewer;->isFeaturedSearch(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/routing/RouteHandler;->getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "search_param"

    .line 510
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 511
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onSearchFeatureClicked(Ljava/lang/String;)V

    goto :goto_0

    .line 513
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

    :goto_0
    return-void
.end method

.method public onImCardClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_6:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 620
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onHeaderImCardClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 621
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v0
.end method

.method public onLinkLoyaltyCardClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 615
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onHeaderLoyaltyCardClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 616
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v0
.end method

.method public onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->RETAILER_BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 361
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    .line 364
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$2;->$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType:[I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 370
    :pswitch_0
    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "scroll_to_top"

    .line 371
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    .line 366
    :pswitch_1
    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "scroll_to_top"

    .line 367
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_0
    if-eqz p1, :cond_1

    const/high16 v1, 0x24000000

    .line 376
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 377
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 383
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 384
    :cond_1
    :goto_1
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

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 331
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 334
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v2, 0x7f09001b

    if-eq p1, v2, :cond_2

    const v2, 0x7f090025

    if-eq p1, v2, :cond_1

    const v2, 0x7f090028

    if-eq p1, v2, :cond_0

    goto :goto_0

    .line 344
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onUnfavoriteClicked()V

    goto :goto_1

    .line 336
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onSearchClicked()V

    goto :goto_1

    .line 340
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onFavoriteClicked()V

    goto :goto_1

    :cond_3
    :goto_0
    move v1, v0

    :goto_1
    return v1
.end method

.method public onRedeemReceiptClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 605
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onHeaderRedeemClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 606
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v0
.end method

.method protected onResume()V
    .locals 3

    .line 170
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onResume()V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 173
    invoke-interface {v0, v1}, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;->createRetailerTrackingData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    move-result-object v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackGalleryView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V

    .line 176
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackGalleryRetailerView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V

    .line 177
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerCategoryId:Ljava/lang/Integer;

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackGalleryRetailerCategoryView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Ljava/lang/Integer;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 216
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "tab_context"

    .line 217
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "retailer"

    .line 218
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "favorited"

    .line 219
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->favorited:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerCategoryId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const-string v1, "retailer_category_id"

    .line 222
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_MCOMM_SHOP:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1, p2}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 536
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 537
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method public onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 541
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 315
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onStart()V

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBarSearch:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    const/4 v0, 0x1

    .line 319
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->started:Z

    return-void
.end method

.method public onStop()V
    .locals 1

    const/4 v0, 0x0

    .line 324
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->started:Z

    .line 325
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->updateTabsVisible()V

    .line 326
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->onStop()V

    return-void
.end method

.method public onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 546
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->trackCardClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 551
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 524
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 530
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public selectCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)V
    .locals 1

    .line 431
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getPosition(Lcom/ibotta/android/view/common/TabSelectorView$TabOption;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 433
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    :cond_0
    return-void
.end method

.method public setDataMap(Ljava/util/LinkedHashMap;)V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->EMPTY_GALLERY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 388
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/TabSelectorView;->getScrollX()I

    move-result v0

    .line 390
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    .line 391
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->setDataMap(Ljava/util/LinkedHashMap;)V

    .line 392
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 394
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/view/common/TabSelectorView;->setScrollX(I)V

    .line 396
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    .line 397
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v2}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 398
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 399
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/empty/EmptyView;->setVisibility(I)V

    goto :goto_0

    .line 400
    :cond_0
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-ne p1, v3, :cond_1

    .line 401
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 402
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 403
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/views/empty/EmptyView;->setVisibility(I)V

    goto :goto_0

    .line 405
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 406
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 407
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/views/empty/EmptyView;->setVisibility(I)V

    .line 410
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->updateTabsVisible()V

    return-void
.end method

.method public setFavorited(Z)V
    .locals 0

    .line 415
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->favorited:Z

    .line 416
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Lcom/ibotta/api/model/customer/Customer;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 465
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 467
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 468
    invoke-interface {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v0

    .line 470
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 472
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    if-eqz v1, :cond_3

    .line 473
    sget-object v2, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-eq v0, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v1, p1, v0, p4}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V

    .line 477
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    if-eqz v0, :cond_4

    .line 478
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;ZZ)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object p2

    .line 481
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {p3, p2}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V

    .line 484
    :cond_4
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initRetailerHeaderButtons()V

    .line 486
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p2

    .line 487
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isCardLinked()Z

    move-result p3

    if-nez p3, :cond_5

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 488
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    .line 489
    invoke-interface {p2, p1}, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;->createRetailerTrackingData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    move-result-object p1

    .line 491
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackGalleryRetailerViewNonLinkedCard(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V

    .line 492
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackGalleryRetailerViewNonLinkedCardById(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V

    .line 495
    :cond_5
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initSearch()V

    return-void
.end method

.method public showGcsFeatureDisabled()V
    .locals 5

    .line 571
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v1, Lcom/ibotta/android/views/empty/EmptyViewState;

    const v2, 0x7f110504

    .line 573
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    const v4, 0x7f0801a3

    invoke-direct {v1, v4, v2, v3}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 571
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method

.method public showMenuFavorited(Z)V
    .locals 2

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->menu:Landroid/view/Menu;

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    .line 281
    :cond_0
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->favorited:Z

    if-eqz p1, :cond_1

    .line 282
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p1

    const v0, 0x7f0d0008

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->menu:Landroid/view/Menu;

    invoke-virtual {p1, v0, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    goto :goto_0

    .line 284
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p1

    const v0, 0x7f0d0009

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->menu:Landroid/view/Menu;

    invoke-virtual {p1, v0, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public showRetailerNotFound()V
    .locals 3

    const v0, 0x7f1101e1

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 566
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showSearch()V
    .locals 2

    .line 445
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->clSearchContainer:Landroid/support/design/widget/CoordinatorLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/CoordinatorLayout;->setVisibility(I)V

    .line 446
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;->onSearchTextFocusChanged(Z)V

    return-void
.end method

.method public showSearchView()V
    .locals 0

    .line 355
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;->showSearchView()V

    .line 356
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->invalidateOptionsMenu()V

    return-void
.end method

.method public showSpecialConditionsLearnMore(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 440
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method
