.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "MyOffersGalleryAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private editing:Z

.field private final factory:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;"
        }
    .end annotation
.end field

.field private selectedOfferModelIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    .line 33
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->selectedOfferModelIds:Ljava/util/Set;

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroid/support/v7/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;I)V
    .locals 3
    .param p1    # Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    .line 78
    instance-of v1, v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    if-eqz v1, :cond_0

    .line 79
    check-cast v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    .line 80
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->selectedOfferModelIds:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 85
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->editing:Z

    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-virtual {v0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;ILcom/ibotta/android/content/card/ContentCardReducer;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setEditing(Z)V
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->editing:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 65
    :cond_0
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->editing:Z

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :goto_0
    return-void
.end method

.method public setSelectedOfferModelIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->selectedOfferModelIds:Ljava/util/Set;

    goto :goto_0

    .line 56
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    :goto_0
    return-void
.end method
