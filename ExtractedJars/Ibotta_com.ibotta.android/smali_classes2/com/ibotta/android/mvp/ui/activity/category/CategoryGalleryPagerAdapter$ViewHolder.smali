.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "CategoryGalleryPagerAdapter.java"

# interfaces
.implements Landroid/support/design/widget/AppBarLayout$OnOffsetChangedListener;
.implements Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ViewHolder"
.end annotation


# instance fields
.field private appBarLayout:Landroid/support/design/widget/AppBarLayout;

.field private isAppBarFullyCollapsed:Z

.field protected rplvFastBubbleScroller:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d1
    .end annotation
.end field

.field protected rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d2
    .end annotation
.end field

.field private srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 166
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->isAppBarFullyCollapsed:Z

    .line 171
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 172
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->setBottomPadding(Landroid/view/View;)V

    return-void
.end method

.method private getFirstItemPosition()I
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    return v0
.end method

.method private setupFastScroller()V
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvFastBubbleScroller:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvFastBubbleScroller:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setVisibility(I)V

    return-void
.end method

.method private setupListeners()V
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {v0, p0}, Landroid/support/design/widget/AppBarLayout;->addOnOffsetChangedListener(Landroid/support/design/widget/AppBarLayout$OnOffsetChangedListener;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvFastBubbleScroller:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setScrollingListener(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;)V

    return-void
.end method

.method private toggleAppBarLayout(Z)V
    .locals 3

    .line 216
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->getFirstItemPosition()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 217
    :goto_0
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->isAppBarFullyCollapsed:Z

    invoke-static {p1, v0, v2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->shouldExpandAppBarLayout(ZZZ)Z

    move-result p1

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {v0, p1, v1}, Landroid/support/design/widget/AppBarLayout;->setExpanded(ZZ)V

    return-void
.end method

.method private toggleSwipeRefreshLayout(Z)V
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->setEnabled(Z)V

    return-void
.end method


# virtual methods
.method public onOffsetChanged(Landroid/support/design/widget/AppBarLayout;I)V
    .locals 0

    .line 200
    invoke-virtual {p1}, Landroid/support/design/widget/AppBarLayout;->getHeight()I

    move-result p1

    mul-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 201
    :goto_0
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->isAppBarFullyCollapsed:Z

    return-void
.end method

.method public setFastBubbleScrollEnabled(ZLandroid/support/design/widget/AppBarLayout;Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 181
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 182
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 183
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->setupFastScroller()V

    .line 184
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->setupListeners()V

    :cond_0
    return-void
.end method

.method public updatedScrollingState(Z)V
    .locals 1

    xor-int/lit8 v0, p1, 0x1

    .line 206
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->toggleSwipeRefreshLayout(Z)V

    .line 207
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->toggleAppBarLayout(Z)V

    return-void
.end method
