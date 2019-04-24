.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "MyOffersGalleryActivity.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;
.implements Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;
.implements Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;",
        "Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;",
        "Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;",
        "Lcom/ibotta/android/tracking/proprietary/event/EventContributor;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;"
    }
.end annotation


# static fields
.field public static final RESP_CODE_ALL_REBATES_REMOVED:I = 0x1

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private editAllowed:Z

.field protected galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09020d
    .end annotation
.end field

.field private imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field protected moevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090362
    .end annotation
.end field

.field protected nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090374
    .end annotation
.end field

.field private pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private selectedCategoryId:Ljava/lang/Integer;

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field private started:Z

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
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    return-object p0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "MyOffersGalleryActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNavButtonSelected"

    const-string v3, "com.ibotta.android.mvp.ui.activity.myoffers.retailer.MyOffersGalleryActivity"

    const-string v4, "com.ibotta.android.mvp.ui.view.nav.NavButtonType"

    const-string v5, "navButtonType"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x10d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onRedeemReceiptClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.myoffers.retailer.MyOffersGalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1d3

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onLinkLoyaltyCardClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.myoffers.retailer.MyOffersGalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1d8

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onBuyIgcClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.myoffers.retailer.MyOffersGalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1dd

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onImCardClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.myoffers.retailer.MyOffersGalleryActivity"

    const-string v4, "java.lang.String"

    const-string v5, "buttonText"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1e2

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initEditMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0d000f

    .line 203
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p2, 0x7f09001a

    .line 205
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    .line 206
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryActivity$ZPBBM8fZCOFg60oHzhKBIS104EA;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryActivity$ZPBBM8fZCOFg60oHzhKBIS104EA;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-object p1
.end method

.method private initEmpty()V
    .locals 2

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->moevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryActivity$5fSh4v9RxcDxHM79o6eS-CKmKLY;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryActivity$5fSh4v9RxcDxHM79o6eS-CKmKLY;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->bindViewEvents(Lcom/ibotta/android/views/rebate/MyRebatesEmptyViewEvents;)V

    return-void
.end method

.method private initNavBar()V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    return-void
.end method

.method private initRemoveMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0d0010

    .line 194
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p2, 0x7f090015

    .line 196
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 197
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->setRemoveButtonState(Landroid/view/MenuItem;)V

    .line 199
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method private initTabSelector()V
    .locals 3

    .line 239
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    return-void
.end method

.method public static synthetic lambda$initEditMenu$0(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;Landroid/view/View;)V
    .locals 0

    .line 206
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onEditClicked()V

    return-void
.end method

.method public static synthetic lambda$initEmpty$2(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onFindRebatesClicked()V

    return-void
.end method

.method public static synthetic lambda$setRemoveButtonState$1(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;Landroid/view/View;)V
    .locals 0

    .line 217
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onRemoveClicked()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 157
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v0, "im_connection_status"

    .line 158
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/im/ImConnectionStatus;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    goto :goto_0

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 160
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 161
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "im_connection_status"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/im/ImConnectionStatus;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "selected_category_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 164
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "selected_category_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->selectedCategoryId:Ljava/lang/Integer;

    :cond_1
    :goto_0
    return-void
.end method

.method private setRemoveButtonState(Landroid/view/MenuItem;)V
    .locals 2

    .line 212
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090023

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->getSelectedItemsListSize()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 215
    :goto_0
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->setTextStyle(ZLandroid/widget/TextView;)V

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 217
    :cond_1
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryActivity$sIZSSNMCZm9MPUSZGM9nYH4JEH8;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryActivity$sIZSSNMCZm9MPUSZGM9nYH4JEH8;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V

    :goto_1
    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method

.method private setTextStyle(ZLandroid/widget/TextView;)V
    .locals 0

    if-eqz p1, :cond_0

    const p1, 0x7f1201aa

    goto :goto_0

    :cond_0
    const p1, 0x7f1201a9

    .line 222
    :goto_0
    invoke-static {p2, p1}, Landroid/support/v4/widget/TextViewCompat;->setTextAppearance(Landroid/widget/TextView;I)V

    return-void
.end method

.method private updateDataMap(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V
    .locals 4

    .line 363
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    if-nez v0, :cond_0

    return-void

    .line 367
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getDataMap()Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 368
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getScrollX()I

    move-result v1

    .line 370
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setDataMap(Ljava/util/Map;)V

    .line 371
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->getSelectedItemsList()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setSelectedOfferModelIds(Ljava/util/Set;)V

    .line 373
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getDataMap()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v3}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    .line 374
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 375
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setScrollX(I)V

    .line 377
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz p1, :cond_1

    .line 378
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v2}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 379
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 380
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->moevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->setVisibility(I)V

    goto :goto_0

    .line 381
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-ne p1, v3, :cond_2

    .line 382
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 383
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 384
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->moevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->setVisibility(I)V

    goto :goto_0

    .line 386
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 387
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setVisibility(I)V

    .line 388
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->moevEmpty:Lcom/ibotta/android/views/rebate/MyOffersEmptyView;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/views/rebate/MyOffersEmptyView;->setVisibility(I)V

    .line 391
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->updateTabsVisible()V

    return-void
.end method

.method private updateHeader(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V
    .locals 2

    .line 357
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getGalleryHeaderViewState()Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V

    .line 358
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getTotalOffers()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateSubtitleAndLogo(I)V

    return-void
.end method

.method private updateNavBar(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V
    .locals 4

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    if-eqz v0, :cond_1

    .line 336
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    .line 337
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getImConnectionStatus()Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p1

    sget-object v2, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    const/4 v3, 0x0

    if-eq p1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 335
    :goto_0
    invoke-virtual {v0, v1, p1, v3}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V

    :cond_1
    return-void
.end method

.method private updateTabsVisible()V
    .locals 2

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->started:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->onVisibilityChanged(Z)V

    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 72
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;)V

    return-void
.end method

.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 439
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MY_REBATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 441
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    .line 442
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerId(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 72
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;
    .locals 1

    .line 103
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;

    move-result-object v0

    .line 104
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 105
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->myOffersGalleryModule(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;-><init>(Landroid/app/Activity;)V

    .line 106
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->imScreenModule(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;

    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithAllRebatesRemoved()V
    .locals 1

    const/4 v0, 0x1

    .line 433
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->setResult(I)V

    .line 434
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->finish()V

    return-void
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

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
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 457
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 452
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method public hideRemovingRebatesMessage()V
    .locals 0

    .line 419
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->hideSubmittedJobLoading()V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 72
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;)V
    .locals 0

    .line 112
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public navigateBack()V
    .locals 0

    .line 506
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onBackPressed()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 501
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onBackClicked()V

    return-void
.end method

.method public onBuyIgcClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 477
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onHeaderBuyIgcClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 478
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

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->isEditing()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 288
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 289
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onViewMyRebateClicked(ILjava/lang/Integer;)V

    goto :goto_1

    .line 291
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onMyRebatesSelectionChanged(Ljava/lang/Integer;)V

    .line 292
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->getSelectedItemsList()Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setSelectedOfferModelIds(Ljava/util/Set;)V

    .line 293
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->isEditing()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setEditing(Z)V

    .line 294
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->supportInvalidateOptionsMenu()V

    :goto_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 122
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 124
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0052

    .line 126
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->setContentView(I)V

    .line 127
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->bindViewEvents(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;)V

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 132
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->setImConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)V

    .line 133
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->selectedCategoryId:Ljava/lang/Integer;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->setSelectedCategoryId(Ljava/lang/Integer;)V

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->initTabSelector()V

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->initNavBar()V

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->initEmpty()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 181
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->editAllowed:Z

    if-eqz v1, :cond_1

    .line 182
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->isEditing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 183
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->initRemoveMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 185
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->initEditMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/View;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 187
    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 190
    :cond_1
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 0

    return-void
.end method

.method public onImCardClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 482
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onHeaderImCardClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 483
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

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 472
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onHeaderLoyaltyCardClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 473
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

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 269
    :try_start_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-ne p1, v1, :cond_0

    .line 270
    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "scroll_to_top"

    const/4 v2, 0x1

    .line 271
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p1

    const/high16 v1, 0x24000000

    .line 272
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    .line 273
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 277
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
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

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 227
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onOptionsItemSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 231
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onRedeemReceiptClicked(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 467
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onHeaderRedeemClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 468
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

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 171
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 172
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "im_connection_status"

    .line 173
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 142
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStart()V

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->nbvNavBar:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->started:Z

    return-void
.end method

.method public onStop()V
    .locals 1

    const/4 v0, 0x0

    .line 149
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->started:Z

    .line 150
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->updateTabsVisible()V

    .line 152
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onStop()V

    return-void
.end method

.method public onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public selectCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)V
    .locals 1

    .line 400
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getPosition(Lcom/ibotta/android/view/common/TabSelectorView$TabOption;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 402
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 403
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    :cond_0
    return-void
.end method

.method public setEditAllowed(Z)V
    .locals 0

    .line 344
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->editAllowed:Z

    .line 345
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method public setEditing(Z)V
    .locals 2

    .line 350
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->supportInvalidateOptionsMenu()V

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->setEditing(Z)V

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->setEnabled(Z)V

    .line 353
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->header:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->setEditing(Z)V

    return-void
.end method

.method public showRemoveConfirmation(I)V
    .locals 0

    .line 409
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;->onRemoveConfirmed()V

    return-void
.end method

.method public showRemovedRebatesSuccess()V
    .locals 4

    .line 424
    new-instance v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;-><init>()V

    const v1, 0x7f110431

    .line 425
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    .line 426
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->duration(J)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    move-result-object v0

    .line 427
    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;

    move-result-object v0

    .line 428
    sget-object v1, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

    invoke-virtual {v1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;->getNO_OP()Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/ibotta/android/views/messages/alert/AlertMessage;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)Lcom/ibotta/android/views/messages/alert/AlertMessage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessage;->show()V

    return-void
.end method

.method public showRemovingRebatesMessage()V
    .locals 1

    const v0, 0x7f110432

    .line 414
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V
    .locals 0

    .line 487
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->updateNavBar(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V

    .line 488
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->initToolBar()V

    .line 489
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->updateHeader(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V

    .line 490
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->updateDataMap(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V

    .line 491
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getSelectedCategory()Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->selectCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 72
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;)V

    return-void
.end method
