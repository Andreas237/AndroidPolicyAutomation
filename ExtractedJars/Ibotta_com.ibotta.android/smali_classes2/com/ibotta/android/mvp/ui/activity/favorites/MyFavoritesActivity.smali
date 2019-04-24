.class public Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "MyFavoritesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;
.implements Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;
.implements Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;
.implements Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;",
        "Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;",
        "Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;",
        "Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;"
    }
.end annotation


# instance fields
.field protected efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ab
    .end annotation
.end field

.field private itemTouchHelper:Landroid/support/v7/widget/helper/ItemTouchHelper;

.field protected mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09035d
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initEmptyView()V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->setListener(Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView$EmptyFavoritesViewListener;)V

    return-void
.end method

.method private initListView()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    invoke-virtual {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->setListener(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;)V

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->getAdapter()Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;-><init>(Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;)V

    .line 70
    new-instance v1, Landroid/support/v7/widget/helper/ItemTouchHelper;

    invoke-direct {v1, v0}, Landroid/support/v7/widget/helper/ItemTouchHelper;-><init>(Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->itemTouchHelper:Landroid/support/v7/widget/helper/ItemTouchHelper;

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->itemTouchHelper:Landroid/support/v7/widget/helper/ItemTouchHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/helper/ItemTouchHelper;->attachToRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 32
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;
    .locals 1

    .line 42
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent$Builder;

    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;)V

    .line 44
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent$Builder;->myFavoritesModule(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesModule;)Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent$Builder;

    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/DaggerMyFavoritesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;)V
    .locals 0

    .line 50
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;)V

    return-void
.end method

.method public onAddFavoriteClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;->onRetailerAdded(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0050

    .line 57
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->setContentView(I)V

    .line 58
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const p1, 0x7f110422

    .line 60
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->initListView()V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->initEmptyView()V

    return-void
.end method

.method public onEndDrag()V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;->onMyFavoritesSwapped()V

    return-void
.end method

.method public onRemoveClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;->onRetailerRemoved(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onStartDrag(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->itemTouchHelper:Landroid/support/v7/widget/helper/ItemTouchHelper;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/helper/ItemTouchHelper;->startDrag(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public setEmptyState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->setVisibility(I)V

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->setVisibility(I)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->setViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;",
            ">;)V"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->setRows(Ljava/util/List;)V

    return-void
.end method
