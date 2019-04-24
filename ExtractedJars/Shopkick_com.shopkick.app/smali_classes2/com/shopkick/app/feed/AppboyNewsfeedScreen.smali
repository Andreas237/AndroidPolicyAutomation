.class public Lcom/shopkick/app/feed/AppboyNewsfeedScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "AppboyNewsfeedScreen.java"


# static fields
.field private static final ANNOUNCEMENT_TAB:I = 0x0

.field private static final KICKS_ACTIVITY_TAB:I = 0x1


# instance fields
.field private currentTab:I

.field private tabLayout:Landroid/support/design/widget/TabLayout;

.field private tabViewPager:Lcom/shopkick/app/view/TabViewPager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->currentTab:I

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)Lcom/shopkick/app/application/ScreenGlobals;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)Lcom/shopkick/app/application/ScreenGlobals;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)I
    .locals 0

    .line 23
    iget p0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->currentTab:I

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;I)I
    .locals 0

    .line 23
    iput p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->currentTab:I

    return p1
.end method

.method public static synthetic lambda$setupTab$73(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)V
    .locals 4

    const/4 v0, 0x0

    .line 127
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 128
    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0022

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 129
    iget-object v2, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v2, v0}, Landroid/support/design/widget/TabLayout;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/support/design/widget/TabLayout$Tab;->setCustomView(Landroid/view/View;)Landroid/support/design/widget/TabLayout$Tab;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private setupTab()V
    .locals 3

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabLayout:Landroid/support/design/widget/TabLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->setTabMode(I)V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabViewPager:Lcom/shopkick/app/view/TabViewPager;

    new-instance v1, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;

    invoke-virtual {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;-><init>(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;Landroid/support/v4/app/FragmentManager;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/TabViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabViewPager:Lcom/shopkick/app/view/TabViewPager;

    new-instance v1, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;-><init>(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/TabViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabLayout:Landroid/support/design/widget/TabLayout;

    new-instance v1, Lcom/shopkick/app/feed/-$$Lambda$AppboyNewsfeedScreen$u0-Xr7T4bIHbVLJS4SVtQRiZWO0;

    invoke-direct {v1, p0}, Lcom/shopkick/app/feed/-$$Lambda$AppboyNewsfeedScreen$u0-Xr7T4bIHbVLJS4SVtQRiZWO0;-><init>(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0024

    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f11003c

    .line 39
    invoke-virtual {p0, p2}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0906b2

    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/design/widget/TabLayout;

    iput-object p2, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabLayout:Landroid/support/design/widget/TabLayout;

    const p2, 0x7f09071f

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/TabViewPager;

    iput-object p2, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->tabViewPager:Lcom/shopkick/app/view/TabViewPager;

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->setupTab()V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 57
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 58
    iget v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->currentTab:I

    if-nez v0, :cond_0

    .line 59
    invoke-virtual {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->logFeedbackDisplayed()V

    :cond_0
    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 49
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 52
    iget v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->currentTab:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedTab(Ljava/lang/Integer;)V

    return-void
.end method
