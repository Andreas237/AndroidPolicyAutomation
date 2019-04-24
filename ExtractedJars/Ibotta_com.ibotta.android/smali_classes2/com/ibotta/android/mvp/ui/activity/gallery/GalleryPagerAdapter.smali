.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "GalleryPagerAdapter.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private allTabsVisible:Z

.field private final dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;"
        }
    .end annotation
.end field

.field private final galleryListViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private final recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

.field private final scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

.field private selectedTab:Landroid/support/design/widget/TabLayout$Tab;

.field private final tabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 5

    .line 46
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 37
    new-instance v0, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->dataMap:Ljava/util/Map;

    .line 40
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    .line 48
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->values()[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 49
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->ordinal()I

    move-result v4

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->getMaxRecycledViews()I

    move-result v2

    invoke-virtual {v3, v4, v2}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->setMaxRecycledViews(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private initGalleryList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;)V
    .locals 2

    .line 96
    invoke-static {p3, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 97
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;->glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    .line 98
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;->glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->recycledViewPool:Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setRecycledViewPool(Landroid/support/v7/widget/RecyclerView$RecycledViewPool;)V

    .line 99
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;->glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->dataMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setRows(Ljava/util/List;)V

    .line 100
    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;->glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setHasFixedSize(Z)V

    return-void
.end method

.method private updateTabVisibility()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 147
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 148
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 149
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    .line 151
    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->allTabsVisible:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v4

    if-ne v4, v2, :cond_0

    const/4 v2, 0x1

    .line 152
    invoke-virtual {v3, v2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->onVisibilityChanged(Z)V

    goto :goto_1

    .line 154
    :cond_0
    invoke-virtual {v3, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->onVisibilityChanged(Z)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 107
    check-cast p1, Landroid/support/v4/view/ViewPager;

    .line 108
    check-cast p3, Landroid/widget/FrameLayout;

    .line 110
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getCurrentListView()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;
    .locals 2

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 82
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c015e

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 83
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 85
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-direct {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 86
    invoke-direct {p0, p2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->initGalleryList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;)V

    .line 88
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    iget-object v1, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;->glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

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

    .line 142
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->allTabsVisible:Z

    .line 143
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public setDataMap(Ljava/util/LinkedHashMap;)V
    .locals 4
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

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    .line 65
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 67
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    .line 69
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 70
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setRows(Ljava/util/List;)V

    goto :goto_1

    .line 72
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->remove(I)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    return-void
.end method

.method public setTabHidden(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 136
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->onVisibilityChanged(Z)V

    :cond_0
    return-void
.end method

.method public setTabVisible(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    .line 130
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public trackCardClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    if-nez v0, :cond_0

    return-void

    .line 164
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    if-eqz v0, :cond_1

    .line 166
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->trackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    :cond_1
    return-void
.end method

.method public trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    if-eqz v0, :cond_0

    .line 187
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    :cond_0
    return-void
.end method

.method public trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 2

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    :cond_0
    return-void
.end method

.method public trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->galleryListViews:Landroid/util/SparseArray;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    if-eqz v0, :cond_0

    .line 180
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    :cond_0
    return-void
.end method
