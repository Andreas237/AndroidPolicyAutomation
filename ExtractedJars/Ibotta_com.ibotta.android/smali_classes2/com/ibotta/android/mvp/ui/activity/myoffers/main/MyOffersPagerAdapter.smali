.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "MyOffersPagerAdapter.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private allTabsVisible:Z

.field private dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;>;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

.field private myRetailersListViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;",
            ">;"
        }
    .end annotation
.end field

.field private final scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

.field private selectedTab:Landroid/support/design/widget/TabLayout$Tab;

.field private srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private tabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    .line 40
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->dataMap:Ljava/util/Map;

    .line 41
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    return-void
.end method

.method private initMyRetailersList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;)V
    .locals 2

    .line 94
    invoke-static {p3, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 95
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;->mrlvMyRetailers:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V

    .line 96
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;->mrlvMyRetailers:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->dataMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->setRows(Ljava/util/List;)V

    .line 97
    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;->mrlvMyRetailers:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    new-instance p2, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;

    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private updateTabVisibility()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 156
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 157
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 158
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    .line 160
    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->allTabsVisible:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v4

    if-ne v4, v2, :cond_0

    const/4 v2, 0x1

    .line 161
    invoke-virtual {v3, v2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->onVisibilityChanged(Z)V

    goto :goto_1

    .line 163
    :cond_0
    invoke-virtual {v3, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->onVisibilityChanged(Z)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 104
    check-cast p1, Landroid/support/v4/view/ViewPager;

    .line 105
    check-cast p3, Landroid/widget/FrameLayout;

    .line 107
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 80
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c017f

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 81
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 83
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-direct {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 84
    invoke-direct {p0, p2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->initMyRetailersList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;)V

    .line 86
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    iget-object v1, v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter$ViewHolder;->mrlvMyRetailers:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

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

    .line 151
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->allTabsVisible:Z

    .line 152
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public scrollToTopOfCurrentList()V
    .locals 3

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 133
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    :goto_0
    if-eqz v0, :cond_1

    .line 138
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->smoothScrollToPosition(I)V

    :cond_1
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

    if-eqz p1, :cond_0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->dataMap:Ljava/util/Map;

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 64
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    const/4 v0, 0x0

    .line 66
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 68
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    if-ltz v1, :cond_1

    .line 70
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 71
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->setRows(Ljava/util/List;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

    return-void
.end method

.method public setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    .line 175
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 170
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V

    return-void
.end method

.method public setSwipeRefresh(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-void
.end method

.method public setTabHidden(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 145
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->onVisibilityChanged(Z)V

    :cond_0
    return-void
.end method

.method public setTabVisible(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public trackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    if-nez v0, :cond_0

    return-void

    .line 183
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPagerAdapter;->myRetailersListViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    if-eqz v0, :cond_1

    .line 185
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->trackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V

    :cond_1
    return-void
.end method
