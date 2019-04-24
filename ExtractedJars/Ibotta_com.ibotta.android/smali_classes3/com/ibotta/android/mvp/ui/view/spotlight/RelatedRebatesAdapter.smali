.class public Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "RelatedRebatesAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private final offerCards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;",
            ">;",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ")V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->offerCards:Ljava/util/List;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->offerCards:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;I)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->offerCards:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 22
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;
    .locals 1

    .line 39
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-direct {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    return-object p2
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    return-void
.end method
