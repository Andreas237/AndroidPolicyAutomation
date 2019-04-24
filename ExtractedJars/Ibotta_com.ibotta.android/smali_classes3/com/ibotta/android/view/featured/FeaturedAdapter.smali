.class public Lcom/ibotta/android/view/featured/FeaturedAdapter;
.super Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;
.source "FeaturedAdapter.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

.field private viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/images/ImageCache;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;-><init>()V

    .line 29
    sget-object v0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->EMPTY:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    iput-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method private initPage(Landroid/widget/ImageView;I)V
    .locals 4

    .line 61
    invoke-virtual {p0, p2}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->getActualPosition(I)I

    move-result p2

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/featured/BannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/BannerViewState;->getBannerUrl()Ljava/lang/String;

    move-result-object v0

    .line 63
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->FEATURED:Lcom/ibotta/android/views/images/Sizes;

    .line 65
    invoke-static {v0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 66
    iget-object v2, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {v2, v3, v0, p1, v1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 69
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/featured/-$$Lambda$FeaturedAdapter$VX33rEhzZQDJ4MXLYO1gbVzm61k;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/view/featured/-$$Lambda$FeaturedAdapter$VX33rEhzZQDJ4MXLYO1gbVzm61k;-><init>(Lcom/ibotta/android/view/featured/FeaturedAdapter;I)V

    instance-of p2, p1, Landroid/view/View;

    if-nez p2, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initPage$0(Lcom/ibotta/android/view/featured/FeaturedAdapter;ILandroid/view/View;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->onBannerClicked(I)V

    return-void
.end method

.method private onBannerClicked(I)V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/featured/BannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/BannerViewState;->getLink()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/featured/BannerViewState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;->onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    return-void
.end method

.method getActualCount()I
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method getActualPosition(I)I
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr p1, v0

    return p1
.end method

.method public getCount()I
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getBannerViewStates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const v0, 0x7fffffff

    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->getActualCount()I

    move-result v0

    :goto_1
    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p2, :cond_0

    .line 51
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const p3, 0x7f0c015a

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p2, p3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 54
    :cond_0
    check-cast p2, Landroid/widget/ImageView;

    .line 55
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->initPage(Landroid/widget/ImageView;I)V

    return-object p2
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedAdapter;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/view/featured/FeaturedAdapter;->notifyDataSetChanged()V

    return-void
.end method
