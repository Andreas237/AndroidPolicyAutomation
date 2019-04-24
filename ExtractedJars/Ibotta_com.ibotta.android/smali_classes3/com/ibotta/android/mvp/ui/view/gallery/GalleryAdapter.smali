.class public Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "GalleryAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private factory:Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 21
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-virtual {v0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;ILcom/ibotta/android/content/card/ContentCardReducer;)Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->onViewAttachedToWindow(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;)V

    return-void
.end method

.method public onViewAttachedToWindow(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;)V
    .locals 0

    .line 71
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;->onViewAttachedToWindow()V

    return-void
.end method

.method public bridge synthetic onViewDetachedFromWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->onViewDetachedFromWindow(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;)V
    .locals 0

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;->onViewDetachedToWindow()V

    .line 78
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewDetachedFromWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public bridge synthetic onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->onViewRecycled(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;)V
    .locals 0

    .line 65
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;->cancelImageLoad()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 37
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 40
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->notifyDataSetChanged()V

    return-void
.end method
