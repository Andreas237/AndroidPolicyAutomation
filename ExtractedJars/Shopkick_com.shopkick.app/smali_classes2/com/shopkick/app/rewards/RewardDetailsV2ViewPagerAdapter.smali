.class public Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "RewardDetailsV2ViewPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;
    }
.end annotation


# instance fields
.field private final callbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final rewardCarouselImageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final rewardCarouselViewPager:Landroid/support/v4/view/ViewPager;

.field private final rewardThumbnailImageUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/view/ViewPager;Ljava/util/List;Ljava/lang/String;Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/support/v4/view/ViewPager;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;",
            ")V"
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Context cannot be null"

    .line 59
    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->context:Landroid/content/Context;

    if-eqz p2, :cond_1

    move p1, v0

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    const-string v2, "View Pager must not be null"

    .line 62
    invoke-static {p1, v2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p3, :cond_2

    move p1, v0

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    const-string p2, "List of reward image urls must not be null"

    .line 65
    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 66
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_3

    move p1, v0

    goto :goto_3

    :cond_3
    move p1, v1

    :goto_3
    const-string p2, "List of reward image urls must not be empty"

    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 67
    iput-object p3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselImageUrls:Ljava/util/List;

    .line 69
    iput-object p4, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardThumbnailImageUrl:Ljava/lang/String;

    if-eqz p5, :cond_4

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    const-string p1, "Don\'t pass in null callback"

    .line 71
    invoke-static {v0, p1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 72
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 74
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->prefetchImages()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->callFirstImageLoadSucceeded()V

    return-void
.end method

.method private callFirstImageLoadSucceeded()V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;

    if-eqz v0, :cond_0

    .line 158
    invoke-interface {v0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;->onFirstImageLoadSucceded()V

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    :cond_0
    return-void
.end method

.method private prefetchImages()V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    .line 117
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselImageUrls:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 118
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselImageUrls:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    move v3, v0

    :goto_1
    const-string v4, "Reward Carousel Image Url must not be null"

    .line 119
    invoke-static {v3, v4}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 120
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselViewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private tryLoadingFirstCarouselImage(Landroid/widget/ImageView;)V
    .locals 5

    .line 125
    new-instance v0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$1;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;)V

    .line 135
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselImageUrls:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const-string v4, "Reward Carousel Image Url must not be null"

    .line 136
    invoke-static {v3, v4}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 137
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselViewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    .line 138
    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->tryLoadingFirstCarouselThumbnail(Landroid/widget/ImageView;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->thumbnail(Lcom/bumptech/glide/RequestBuilder;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method private tryLoadingFirstCarouselThumbnail(Landroid/widget/ImageView;)Lcom/bumptech/glide/RequestBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lcom/bumptech/glide/RequestBuilder<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 142
    new-instance p1, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$2;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;)V

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselViewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardThumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public destroy()V
    .locals 0

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 97
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselImageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3

    .line 102
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    if-nez p2, :cond_0

    .line 104
    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->tryLoadingFirstCarouselImage(Landroid/widget/ImageView;)V

    goto :goto_1

    .line 106
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->rewardCarouselImageUrls:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Reward Carousel Image Url must not be null"

    .line 107
    invoke-static {v1, v2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 108
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 112
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
