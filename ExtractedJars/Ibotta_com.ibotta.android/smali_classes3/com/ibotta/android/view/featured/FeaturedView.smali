.class public Lcom/ibotta/android/view/featured/FeaturedView;
.super Landroid/widget/LinearLayout;
.source "FeaturedView.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;,
        Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Landroid/support/v4/view/ViewPager$OnPageChangeListener;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;",
        ">;"
    }
.end annotation


# static fields
.field private static final AUTO_ROTATE_DELAY:J


# instance fields
.field private adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

.field private autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

.field featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private pagerMoved:Z

.field trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

.field private viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

.field protected vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905c9
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 39
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x6

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/view/featured/FeaturedView;->AUTO_ROTATE_DELAY:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    sget-object p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;->EMPTY:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->initLayout()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/view/featured/FeaturedView;)Z
    .locals 0

    .line 36
    iget-boolean p0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->pagerMoved:Z

    return p0
.end method

.method static synthetic access$200()J
    .locals 2

    .line 36
    sget-wide v0, Lcom/ibotta/android/view/featured/FeaturedView;->AUTO_ROTATE_DELAY:J

    return-wide v0
.end method

.method private initDefaultHeight()V
    .locals 3

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    sget-object v1, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->SHORT:Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    iget-object v2, p0, Lcom/ibotta/android/view/featured/FeaturedView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-static {v1, v2}, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->access$000(Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;Lcom/ibotta/android/hardware/Hardware;)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 173
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->invalidate()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 146
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/featured/FeaturedView;)V

    const/4 v0, 0x1

    .line 148
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/featured/FeaturedView;->setOrientation(I)V

    .line 150
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0159

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 152
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 154
    new-instance v0, Lcom/ibotta/android/view/featured/FeaturedAdapter;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;-><init>(Lcom/ibotta/android/images/ImageCache;)V

    iput-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    new-instance v1, Lcom/ibotta/android/view/featured/-$$Lambda$FeaturedView$D_pcmKGdkaOyMgkSeXEflBbAgMQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/view/featured/-$$Lambda$FeaturedView$D_pcmKGdkaOyMgkSeXEflBbAgMQ;-><init>(Lcom/ibotta/android/view/featured/FeaturedView;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->setTouchInterceptListener(Landroid/view/View$OnTouchListener;)V

    .line 167
    invoke-direct {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->initDefaultHeight()V

    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/view/featured/FeaturedView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 158
    iget-boolean p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->pagerMoved:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 159
    iput-boolean p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->pagerMoved:Z

    .line 160
    iget-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    if-eqz p1, :cond_0

    .line 161
    iget-object p2, p0, Lcom/ibotta/android/view/featured/FeaturedView;->handler:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 36
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedView;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V
    .locals 2

    .line 203
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->setListener(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method

.method public getPosition()I
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->getCurrentItem()I

    move-result v0

    return v0
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    invoke-virtual {v2, p1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->getActualPosition(I)I

    move-result p1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/featured/BannerViewState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->onBannerViewed(Lcom/ibotta/android/views/featured/BannerViewState;)V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    .line 136
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->startAutoRotation()V

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->stopAutoRotation()V

    :goto_0
    return-void
.end method

.method public restore(Ljava/lang/Integer;)V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 112
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 115
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/featured/FeaturedAdapter;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;-><init>(Lcom/ibotta/android/images/ImageCache;)V

    iput-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    .line 120
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->setCurrentItem(I)V

    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedView;->onPageSelected(I)V

    .line 125
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    .line 130
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->setVisibility(I)V

    return-void
.end method

.method public startAutoRotation()V
    .locals 4

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedView;->getWindowVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Window is not visible. Won\'t start auto rotation"

    .line 75
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    if-eqz v0, :cond_1

    const-string v0, "Already started."

    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/featured/FeaturedAdapter;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    .line 86
    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->getActualCount()I

    move-result v0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_3

    goto :goto_1

    .line 90
    :cond_3
    iput-boolean v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->pagerMoved:Z

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 93
    new-instance v0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;-><init>(Lcom/ibotta/android/view/featured/FeaturedView;)V

    iput-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    sget-wide v2, Lcom/ibotta/android/view/featured/FeaturedView;->AUTO_ROTATE_DELAY:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public stopAutoRotation()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Already stopped."

    .line 100
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "Removing autoRotator callbacks"

    .line 104
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->autoRotator:Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 36
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedView;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V
    .locals 4

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->adapter:Lcom/ibotta/android/view/featured/FeaturedAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView;->featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    .line 195
    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v1

    .line 196
    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getRetailerCategoryId()I

    move-result v2

    .line 197
    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v3

    .line 194
    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->setIbottaEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)V

    .line 198
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    return-void
.end method
