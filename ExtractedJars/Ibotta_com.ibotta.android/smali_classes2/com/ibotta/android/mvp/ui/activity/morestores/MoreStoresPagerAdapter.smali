.class public Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "MoreStoresPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;>;"
        }
    .end annotation
.end field

.field private listViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;

.field private srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private tabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->tabs:Ljava/util/List;

    .line 34
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->dataMap:Ljava/util/Map;

    .line 35
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listViews:Landroid/util/SparseArray;

    return-void
.end method

.method private initMyRetailersList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;)V
    .locals 2

    .line 80
    invoke-static {p3, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 81
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;->msrlvMoreStores:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V

    .line 82
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;->msrlvMoreStores:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->dataMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->setRows(Ljava/util/List;)V

    .line 83
    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;->msrlvMoreStores:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;

    new-instance p2, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;

    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 90
    check-cast p1, Landroid/support/v4/view/ViewPager;

    .line 91
    check-cast p3, Landroid/widget/FrameLayout;

    .line 93
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 66
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0179

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 67
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 69
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;)V

    .line 70
    invoke-direct {p0, p2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->initMyRetailersList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;)V

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listViews:Landroid/util/SparseArray;

    iget-object v1, v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;->msrlvMoreStores:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;

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

.method public setDataMap(Ljava/util/LinkedHashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->dataMap:Ljava/util/Map;

    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 52
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->tabs:Ljava/util/List;

    const/4 v0, 0x0

    .line 54
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 55
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 56
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listViews:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;

    .line 58
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->tabs:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->setRows(Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;

    return-void
.end method

.method public setSwipeRefresh(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-void
.end method
