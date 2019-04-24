.class public Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;
.super Landroid/support/v7/widget/LinearLayoutManager;
.source "StoryCardLinearLayoutManager.java"


# instance fields
.field private extraSpacing:I

.field private itemWidth:I

.field private parentWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IZIII)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 18
    iput p4, p0, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->parentWidth:I

    .line 19
    iput p5, p0, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->itemWidth:I

    .line 20
    iput p6, p0, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->extraSpacing:I

    return-void
.end method


# virtual methods
.method public getPaddingLeft()I
    .locals 5

    .line 25
    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->parentWidth:I

    iget v1, p0, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->itemWidth:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 27
    iget v1, p0, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->extraSpacing:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getPaddingRight()I
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;->getPaddingLeft()I

    move-result v0

    return v0
.end method
