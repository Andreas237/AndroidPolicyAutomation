.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "CategoryGalleryPagerAdapter.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private allTabsVisible:Z

.field private final appBarLayout:Landroid/support/design/widget/AppBarLayout;

.field private dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerPickerListViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ibotta/android/views/list/IbottaListView;",
            ">;"
        }
    .end annotation
.end field

.field private final scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

.field private selectedTab:Landroid/support/design/widget/TabLayout$Tab;

.field private final srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

.field private tabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            ">;"
        }
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;


# direct methods
.method public constructor <init>(Landroid/support/design/widget/AppBarLayout;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 39
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    .line 42
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 53
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 54
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    return-void
.end method

.method private initRetailerPickerList(ILandroid/widget/RelativeLayout;Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;)V
    .locals 2

    .line 95
    invoke-static {p3, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 96
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 97
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    .line 98
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {p3, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->setFastBubbleScrollEnabled(ZLandroid/support/design/widget/AppBarLayout;Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;)V

    return-void
.end method

.method private updateTabVisibility()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 145
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 146
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 147
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/views/list/IbottaListView;

    .line 149
    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->allTabsVisible:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v4

    if-ne v4, v2, :cond_0

    const/4 v2, 0x1

    .line 150
    invoke-virtual {v3, v2}, Lcom/ibotta/android/views/list/IbottaListView;->onVisibilityChanged(Z)V

    goto :goto_1

    .line 152
    :cond_0
    invoke-virtual {v3, v0}, Lcom/ibotta/android/views/list/IbottaListView;->onVisibilityChanged(Z)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 105
    check-cast p1, Landroid/support/v4/view/ViewPager;

    .line 106
    check-cast p3, Landroid/widget/FrameLayout;

    .line 108
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->getName()Ljava/lang/String;

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

    const v1, 0x7f0c01ba

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 81
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 83
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-direct {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 85
    invoke-direct {p0, p2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->initRetailerPickerList(ILandroid/widget/RelativeLayout;Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;)V

    .line 87
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    iget-object v1, v1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

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

    .line 140
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->allTabsVisible:Z

    .line 141
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->updateTabVisibility()V

    return-void
.end method

.method public setDataMap(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 64
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    const/4 v0, 0x0

    .line 66
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 68
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/views/list/IbottaListView;

    if-ltz v1, :cond_1

    .line 70
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 71
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setTabHidden(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->retailerPickerListViews:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/IbottaListView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 134
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/IbottaListView;->onVisibilityChanged(Z)V

    :cond_0
    return-void
.end method

.method public setTabVisible(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->selectedTab:Landroid/support/design/widget/TabLayout$Tab;

    .line 128
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->updateTabVisibility()V

    return-void
.end method
