.class public Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;
.super Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;
.source "ColorDividerItemDecoration.java"


# instance fields
.field private paint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(ILjava/util/HashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;-><init>()V

    .line 18
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->paint:Landroid/graphics/Paint;

    .line 19
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->paint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    iput-object p2, p0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 25
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v2

    .line 26
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 28
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v4

    .line 29
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v5

    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    .line 30
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v6

    .line 31
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v7

    .line 34
    instance-of v8, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    .line 35
    check-cast v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v2

    .line 37
    :goto_0
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getChildCount()I

    move-result v6

    if-ge v9, v6, :cond_6

    .line 38
    invoke-virtual {v1, v9}, Landroid/support/v7/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 39
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {v7}, Landroid/support/v7/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    move-result v7

    .line 40
    iget-object v8, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    if-eqz v8, :cond_0

    iget-object v8, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 47
    invoke-virtual {v7}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->isFullSpan()Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v7}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result v8

    add-int/lit8 v10, v2, -0x1

    if-ge v8, v10, :cond_1

    .line 48
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v8

    iget v10, v7, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->rightMargin:I

    add-int/2addr v8, v10

    add-int v10, v8, v3

    .line 50
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v11

    iget v12, v7, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->topMargin:I

    add-int/2addr v11, v12

    invoke-virtual {v6}, Landroid/view/View;->getTranslationY()F

    move-result v12

    float-to-int v12, v12

    add-int/2addr v11, v12

    .line 51
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v12

    iget v13, v7, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->bottomMargin:I

    add-int/2addr v12, v13

    invoke-virtual {v6}, Landroid/view/View;->getTranslationY()F

    move-result v13

    float-to-int v13, v13

    add-int/2addr v12, v13

    int-to-float v14, v8

    int-to-float v15, v11

    int-to-float v8, v10

    int-to-float v10, v12

    .line 52
    iget-object v11, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->paint:Landroid/graphics/Paint;

    move-object/from16 v13, p1

    move/from16 v16, v8

    move/from16 v17, v10

    move-object/from16 v18, v11

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 56
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v8

    iget v7, v7, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v7

    invoke-virtual {v6}, Landroid/view/View;->getTranslationY()F

    move-result v6

    float-to-int v6, v6

    add-int/2addr v8, v6

    add-int v6, v8, v3

    int-to-float v11, v4

    int-to-float v12, v8

    int-to-float v13, v5

    int-to-float v14, v6

    .line 58
    iget-object v15, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->paint:Landroid/graphics/Paint;

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 61
    :cond_2
    instance-of v8, v2, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v8, :cond_6

    .line 62
    check-cast v2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager;->getOrientation()I

    move-result v2

    if-nez v2, :cond_4

    .line 64
    :goto_2
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getChildCount()I

    move-result v2

    if-ge v9, v2, :cond_6

    .line 65
    invoke-virtual {v1, v9}, Landroid/support/v7/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 66
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    move-result v4

    .line 67
    iget-object v5, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    .line 70
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 72
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    iget v4, v4, Landroid/support/v7/widget/RecyclerView$LayoutParams;->rightMargin:I

    add-int/2addr v2, v4

    add-int v4, v2, v3

    int-to-float v11, v2

    int-to-float v12, v6

    int-to-float v13, v4

    int-to-float v14, v7

    .line 74
    iget-object v15, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->paint:Landroid/graphics/Paint;

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 78
    :cond_4
    :goto_4
    invoke-virtual/range {p2 .. p2}, Landroid/support/v7/widget/RecyclerView;->getChildCount()I

    move-result v2

    if-ge v9, v2, :cond_6

    .line 79
    invoke-virtual {v1, v9}, Landroid/support/v7/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 80
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    move-result v6

    .line 81
    iget-object v7, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_5

    .line 84
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 86
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v6, v6, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    add-int/2addr v2, v6

    add-int v6, v2, v3

    int-to-float v11, v4

    int-to-float v12, v2

    int-to-float v13, v5

    int-to-float v14, v6

    .line 88
    iget-object v15, v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;->paint:Landroid/graphics/Paint;

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_6
    return-void
.end method
