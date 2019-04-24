.class public Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "TopSpacingItemDecoration.java"


# instance fields
.field private spacing:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 10
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 11
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;->spacing:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 0

    .line 16
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 17
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    move-result p2

    const/4 p4, 0x0

    if-nez p2, :cond_0

    .line 19
    iget p2, p0, Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;->spacing:I

    int-to-float p2, p2

    mul-float/2addr p2, p3

    float-to-int p2, p2

    invoke-virtual {p1, p4, p2, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1, p4, p4, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    return-void
.end method
