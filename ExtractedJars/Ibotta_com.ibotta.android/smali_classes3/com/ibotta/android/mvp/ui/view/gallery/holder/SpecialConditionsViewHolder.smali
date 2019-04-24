.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "SpecialConditionsViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private final scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 2

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    .line 29
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->setup(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)V

    .line 30
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;)V

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 33
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0701a1

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070165

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 36
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f070190

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07018d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 39
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->scvSpecialConditions:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {v1, p1, p2, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->setPadding(IIII)V

    return-void
.end method

.method public onLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method
