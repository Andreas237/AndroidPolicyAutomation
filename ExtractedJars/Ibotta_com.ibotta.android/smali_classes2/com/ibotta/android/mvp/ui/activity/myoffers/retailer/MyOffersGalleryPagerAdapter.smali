.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "MyOffersGalleryPagerAdapter.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private allTabsVisible:Z

.field private dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;"
        }
    .end annotation
.end field

.field private editing:Z

.field private eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

.field private listViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

.field private selectedOfferModelIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private selectedTab:Landroid/support/design/widget/TabLayout$Tab;

.field private tabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 50
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 41
    new-instance v0, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    .line 43
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    .line 44
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedOfferModelIds:Ljava/util/Set;

    .line 51
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->values()[Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 52
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->ordinal()I

    move-result v5

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->getMaxRecycledViews()I

    move-result v3

    invoke-virtual {v4, v5, v3}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->setMaxRecycledViews(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getListViewForIndex(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result p1

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    return-object p1
.end method

.method private getListViewForKey(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    return-object p1
.end method

.method private getRowForIndex(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private initGalleryList(ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;)V
    .locals 3

    .line 132
    iget-object v0, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    .line 133
    iget-object v0, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 134
    iget-object v0, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setRecycledViewPool(Landroid/support/v7/widget/RecyclerView$RecycledViewPool;)V

    .line 135
    iget-object v0, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setRows(Ljava/util/List;)V

    .line 136
    iget-object p1, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedOfferModelIds:Ljava/util/Set;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setSelectedOfferModelIds(Ljava/util/Set;)V

    .line 137
    iget-object p1, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->editing:Z

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setEditing(Z)V

    .line 138
    iget-object p1, p2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setHasFixedSize(Z)V

    return-void
.end method

.method private updateTabVisibility()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 197
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 198
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 199
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->getListViewForIndex(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    move-result-object v3

    .line 200
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedOfferModelIds:Ljava/util/Set;

    invoke-virtual {v3, v4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setSelectedOfferModelIds(Ljava/util/Set;)V

    .line 201
    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->editing:Z

    invoke-virtual {v3, v4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setEditing(Z)V

    .line 202
    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 204
    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->allTabsVisible:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v4

    if-ne v4, v2, :cond_0

    const/4 v2, 0x1

    .line 205
    invoke-virtual {v3, v2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->onVisibilityChanged(Z)V

    goto :goto_1

    .line 207
    :cond_0
    invoke-virtual {v3, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->onVisibilityChanged(Z)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 145
    check-cast p1, Landroid/support/v4/view/ViewPager;

    .line 146
    check-cast p3, Landroid/widget/FrameLayout;

    .line 148
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 2

    .line 168
    check-cast p1, Landroid/widget/FrameLayout;

    .line 169
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    .line 170
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 171
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x2

    return p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 115
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c017d

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 116
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 118
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;)V

    .line 119
    invoke-direct {p0, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->initGalleryList(ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;)V

    .line 121
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 123
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 124
    iget-object p1, v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setTag(Ljava/lang/Object;)V

    .line 126
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    iget-object v1, v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;->moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    invoke-virtual {p1, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

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

.method public onVisibilityChanged(Z)V
    .locals 0

    .line 192
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->allTabsVisible:Z

    .line 193
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public setDataMap(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 67
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->notifyDataSetChanged()V

    const/4 p1, 0x0

    .line 71
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->getRowForIndex(I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setRows(Ljava/util/List;)V

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public setEditing(Z)V
    .locals 2

    .line 95
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->editing:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 99
    :cond_0
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->editing:Z

    const/4 v0, 0x0

    .line 100
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 101
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->getListViewForIndex(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 103
    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setEditing(Z)V

    .line 104
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    return-void
.end method

.method public setSelectedOfferModelIds(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedOfferModelIds:Ljava/util/Set;

    goto :goto_0

    .line 82
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    :goto_0
    const/4 p1, 0x0

    .line 85
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->getListViewForIndex(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedOfferModelIds:Ljava/util/Set;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setSelectedOfferModelIds(Ljava/util/Set;)V

    .line 89
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public setTabHidden(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 184
    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->getListViewForKey(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 186
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->onVisibilityChanged(Z)V

    :cond_0
    return-void
.end method

.method public setTabVisible(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    .line 180
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;->updateTabVisibility()V

    return-void
.end method
