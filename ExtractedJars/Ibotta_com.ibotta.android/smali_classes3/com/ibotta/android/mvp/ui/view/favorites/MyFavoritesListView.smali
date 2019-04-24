.class public Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "MyFavoritesListView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->initLayout()V

    return-void
.end method

.method private initAdapter()V
    .locals 1

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initDivider()V
    .locals 3

    .line 61
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 62
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 63
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 67
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 54
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->initDivider()V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->initAdapter()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->getAdapter()Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    move-result-object v0

    return-object v0
.end method

.method public getAdapter()Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    return-object v0
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;)V

    .line 46
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->setDragStartListener(Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;",
            ">;)V"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method
