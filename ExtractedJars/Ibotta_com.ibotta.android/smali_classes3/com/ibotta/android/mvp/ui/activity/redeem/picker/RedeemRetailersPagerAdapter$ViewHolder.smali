.class public Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "RedeemRetailersPagerAdapter.java"

# interfaces
.implements Landroid/support/design/widget/AppBarLayout$OnOffsetChangedListener;
.implements Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ViewHolder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/support/design/widget/AppBarLayout$OnOffsetChangedListener;",
        "Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field private appBarLayout:Landroid/support/design/widget/AppBarLayout;

.field protected fbsRetailers:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901df
    .end annotation
.end field

.field protected ilvRetailers:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024b
    .end annotation
.end field

.field private isAppBarFullyCollapsed:Z

.field private srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 92
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->isAppBarFullyCollapsed:Z

    .line 95
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private getFirstItemPosition()I
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->ilvRetailers:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    return v0
.end method

.method private setListeners()V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {v0, p0}, Landroid/support/design/widget/AppBarLayout;->addOnOffsetChangedListener(Landroid/support/design/widget/AppBarLayout$OnOffsetChangedListener;)V

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->fbsRetailers:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setScrollingListener(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;)V

    return-void
.end method

.method private setupFastScroller()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->fbsRetailers:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->ilvRetailers:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->fbsRetailers:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setVisibility(I)V

    return-void
.end method

.method private toggleAppBarLayout(Z)V
    .locals 3

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->getFirstItemPosition()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 150
    :goto_0
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->isAppBarFullyCollapsed:Z

    invoke-static {p1, v0, v2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->shouldExpandAppBarLayout(ZZZ)Z

    move-result p1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {v0, p1, v1}, Landroid/support/design/widget/AppBarLayout;->setExpanded(ZZ)V

    return-void
.end method

.method private toggleSwipeRefresh(Z)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->setEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 81
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->ilvRetailers:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onOffsetChanged(Landroid/support/design/widget/AppBarLayout;I)V
    .locals 0

    .line 133
    invoke-virtual {p1}, Landroid/support/design/widget/AppBarLayout;->getHeight()I

    move-result p1

    mul-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 134
    :goto_0
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->isAppBarFullyCollapsed:Z

    return-void
.end method

.method public setFastBubbleScrollEnabled(ZLandroid/support/design/widget/AppBarLayout;Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 114
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 115
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->setupFastScroller()V

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->setListeners()V

    :cond_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 81
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->ilvRetailers:Lcom/ibotta/android/views/list/IbottaListView;

    new-instance v1, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;->getRows()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->build()Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method public updatedScrollingState(Z)V
    .locals 0

    .line 139
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->toggleSwipeRefresh(Z)V

    .line 140
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;->toggleAppBarLayout(Z)V

    return-void
.end method
