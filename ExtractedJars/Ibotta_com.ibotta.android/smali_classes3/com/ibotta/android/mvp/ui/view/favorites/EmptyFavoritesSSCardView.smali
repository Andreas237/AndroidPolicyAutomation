.class public Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;
.super Landroid/widget/RelativeLayout;
.source "EmptyFavoritesSSCardView.java"

# interfaces
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;
    }
.end annotation


# instance fields
.field protected evEmpty:Lcom/ibotta/android/views/empty/EmptyView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d8
    .end annotation
.end field

.field protected hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090228
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;

.field private retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->initLayout()V

    return-void
.end method

.method private initEmptyState()V
    .locals 5

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v1, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1102b4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    const v4, 0x7f0801a3

    invoke-direct {v1, v4, v2, v3}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 85
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 56
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;)V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0154

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 58
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->setHorizModuleViewAttrs()V

    .line 61
    new-instance v0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    return-void
.end method

.method private initListView(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->updateViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 95
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private setHorizModuleViewAttrs()V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setItemSpacing(I)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0701bb

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 70
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v2, v0, v1, v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListViewPadding(IIII)V

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->hzmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060171

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    return-void
.end method


# virtual methods
.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;

    if-eqz v0, :cond_0

    .line 101
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;->onAddFavoriteClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;

    return-void
.end method

.method public setViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->initEmptyState()V

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->initListView(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
