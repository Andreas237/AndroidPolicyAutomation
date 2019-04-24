.class public Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "AvailableAtRetailerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEFAULT_ITEMS_PER_ROW:I = 0x4

.field private static final DEFAULT_MAX_ROWS:I = 0x2


# instance fields
.field private final allRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private showingAll:Z

.field private final shownRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/images/ImageCache;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->allRetailers:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->shownRetailers:Ljava/util/List;

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->showingAll:Z

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method private onRetailersSet()V
    .locals 4

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->shownRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 55
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->showingAll:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->allRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->getMaxRetailers()I

    move-result v1

    if-gt v0, v1, :cond_0

    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->shownRetailers:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->allRetailers:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->getMaxRetailers()I

    move-result v3

    invoke-interface {v1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 56
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->shownRetailers:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->allRetailers:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 60
    :goto_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->shownRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getMaxRetailers()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public getSpan()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public isShowingAll()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->showingAll:Z

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroid/support/v7/widget/RecyclerView$ViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;I)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->shownRetailers:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->initImageView(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 32
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c01b8

    const/4 v1, 0x0

    .line 33
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 34
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;-><init>(Lcom/ibotta/android/images/ImageCache;Landroid/view/View;)V

    return-object p2
.end method

.method public setRetailers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->allRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->allRetailers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 50
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->onRetailersSet()V

    return-void
.end method

.method public toggleShowMore()V
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->showingAll:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->showingAll:Z

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->onRetailersSet()V

    return-void
.end method
