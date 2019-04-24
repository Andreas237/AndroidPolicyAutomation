.class public Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "MoreStoresRetailersListView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->initLayout()V

    return-void
.end method

.method private initAdapter()V
    .locals 1

    .line 62
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initDivider()V
    .locals 3

    .line 52
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 53
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 54
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 55
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 45
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->initDivider()V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->initAdapter()V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;)V"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method
