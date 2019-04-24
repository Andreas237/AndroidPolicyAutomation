.class public Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "ProductImagePagerAdapter.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# static fields
.field private static final IMAGE_VISIBLE:Ljava/lang/String; = "IMAGE_VISIBLE"


# instance fields
.field private context:Landroid/content/Context;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private firstPageHasLoaded:Z

.field private imageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

.field private userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

.field private viewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/view/ViewPager;Ljava/util/List;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/widget/PageIndicator;Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/support/v4/view/ViewPager;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Lcom/shopkick/app/widget/PageIndicator;",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ")V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->context:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->viewPager:Landroid/support/v4/view/ViewPager;

    .line 43
    iput-object p3, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->imageUrls:Ljava/util/List;

    .line 44
    iput-object p4, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 45
    iput-object p5, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    .line 46
    iput-object p6, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 48
    invoke-virtual {p2, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->prefetchImages()V

    return-void
.end method

.method private prefetchImages()V
    .locals 3

    const/4 v0, 0x0

    .line 57
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 58
    iget-object v1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 59
    iget-object v2, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->removeOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 79
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    .line 84
    new-instance v0, Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;-><init>(Landroid/content/Context;)V

    .line 85
    iget-object v1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 87
    iget-object v2, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 88
    iget-object v3, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->context:Landroid/content/Context;

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 90
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x3

    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 97
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x9b

    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 v1, 0x0

    .line 99
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 100
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 102
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 103
    iget-object v3, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 104
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 105
    iget-object v3, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getRootView()Landroid/view/View;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 106
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListDisplayPos:Ljava/lang/Integer;

    .line 107
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 108
    iget-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v4, "IMAGE_VISIBLE"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    iget-object v3, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/view/ViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v4, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, p1, v4, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 113
    iget-boolean p1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->firstPageHasLoaded:Z

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 114
    invoke-virtual {p0, v1}, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->onPageSelected(I)V

    :cond_0
    const/4 p1, 0x1

    .line 116
    iput-boolean p1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->firstPageHasLoaded:Z

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

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    if-eqz v0, :cond_0

    .line 132
    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/PageIndicator;->selectIndicator(I)V

    :cond_0
    const/4 v0, 0x0

    .line 135
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 136
    iget-object v1, p0, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/UserEventImageView;

    if-eqz v1, :cond_2

    if-ne v0, p1, :cond_1

    const-string v2, "IMAGE_VISIBLE"

    .line 139
    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventImageView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v2, "IMAGE_VISIBLE"

    .line 141
    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventImageView;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
