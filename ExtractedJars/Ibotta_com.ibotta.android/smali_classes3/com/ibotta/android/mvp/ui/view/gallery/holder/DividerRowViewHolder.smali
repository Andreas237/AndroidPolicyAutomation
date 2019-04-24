.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "DividerRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/DividerRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final vDivider:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;->vDivider:Landroid/view/View;

    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    .line 22
    iput v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->width:I

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->height:I

    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f070165

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;->vDivider:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;->vDivider:Landroid/view/View;

    const v0, 0x7f0600fa

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/DividerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/DividerRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/DividerRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    return-void
.end method
