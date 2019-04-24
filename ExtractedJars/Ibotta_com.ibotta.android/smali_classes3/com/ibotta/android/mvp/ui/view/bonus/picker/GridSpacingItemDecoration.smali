.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "GridSpacingItemDecoration.java"


# instance fields
.field private spacing:I

.field private spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 22
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;->spanCount:I

    .line 23
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;->spacing:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 5

    .line 28
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    .line 30
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    .line 32
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v2

    .line 35
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v3

    sget-object v4, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    if-ne v3, v4, :cond_0

    .line 36
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;

    .line 37
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->getIndex()I

    move-result v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;->spanCount:I

    rem-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    if-eq v2, v1, :cond_1

    .line 42
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    .line 45
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 48
    :cond_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 49
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 50
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :goto_1
    return-void
.end method
