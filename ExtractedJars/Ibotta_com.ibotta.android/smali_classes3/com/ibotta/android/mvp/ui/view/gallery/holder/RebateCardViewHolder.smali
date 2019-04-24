.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "RebateCardViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;"
    }
.end annotation


# instance fields
.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private final itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private row:Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method

.method private getDisplayContent(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/DisplayContent;
    .locals 2
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 68
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported here"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 64
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/content/OfferDisplayContent;

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    goto :goto_0

    :pswitch_1
    if-eqz p2, :cond_0

    .line 61
    new-instance v0, Lcom/ibotta/android/content/DealDisplayContent;

    check-cast p1, Lcom/ibotta/api/model/DealModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/content/DealDisplayContent;-><init>(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    :goto_0
    return-object v0

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "RetailerModel cannot be null for Deal Content"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 3

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    .line 43
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {p2, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 44
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p1

    .line 44
    invoke-direct {p0, v1, v2, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->getDisplayContent(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/DisplayContent;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    return-void
.end method

.method public cancelImageLoad()V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->cancelImageLoad()V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 0

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
