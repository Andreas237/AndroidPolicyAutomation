.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "SpotlightRelatedOffersItemDecoration.java"


# instance fields
.field private final spacing:I

.field private final spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spanCount:I

    .line 17
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spacing:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 0

    .line 22
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    .line 23
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spanCount:I

    rem-int/2addr p2, p3

    if-nez p2, :cond_0

    .line 26
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spacing:I

    iput p3, p1, Landroid/graphics/Rect;->left:I

    goto :goto_0

    .line 28
    :cond_0
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spacing:I

    div-int/lit8 p3, p3, 0x2

    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 31
    :goto_0
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spanCount:I

    add-int/lit8 p3, p3, -0x1

    if-ne p2, p3, :cond_1

    .line 32
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spacing:I

    div-int/lit8 p3, p2, 0x2

    add-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Rect;->right:I

    goto :goto_1

    .line 34
    :cond_1
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spacing:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 37
    :goto_1
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightRelatedOffersItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 38
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method
