.class public Lcom/shopkick/app/view/TagContainerLayout;
.super Landroid/widget/FrameLayout;
.source "TagContainerLayout.java"


# instance fields
.field private layoutCoordinate:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private rowMargins:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 16
    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/view/TagContainerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/view/TagContainerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/TagContainerLayout;->rowMargins:Ljava/util/ArrayList;

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 17

    move-object/from16 v0, p0

    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingLeft()I

    move-result v1

    .line 98
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingTop()I

    move-result v2

    .line 99
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getMeasuredWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getMeasuredHeight()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    sub-int v5, v3, v1

    sub-int/2addr v4, v2

    .line 104
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getChildCount()I

    move-result v6

    move v8, v1

    move v9, v2

    const/4 v2, 0x0

    const/4 v10, 0x0

    :goto_0
    const/16 v11, 0x8

    const/high16 v12, -0x80000000

    if-ge v2, v6, :cond_3

    .line 115
    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/TagContainerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 117
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-ne v14, v11, :cond_0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    goto/16 :goto_2

    .line 120
    :cond_0
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 121
    invoke-static {v4, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v12

    .line 120
    invoke-virtual {v13, v11, v12}, Landroid/view/View;->measure(II)V

    .line 123
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 124
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v12

    .line 125
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    .line 126
    iget v14, v11, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v14, v12

    iget v15, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v14, v15

    .line 127
    iget v15, v11, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v15, v13

    iget v7, v11, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v15, v7

    add-int v7, v8, v14

    if-lt v7, v3, :cond_1

    .line 131
    iget-object v7, v0, Lcom/shopkick/app/view/TagContainerLayout;->rowMargins:Ljava/util/ArrayList;

    sub-int v8, v3, v8

    div-int/lit8 v8, v8, 0x2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v9, v10

    move v8, v1

    const/4 v10, 0x0

    :cond_1
    add-int/lit8 v7, v6, -0x1

    if-ne v2, v7, :cond_2

    .line 139
    iget-object v7, v0, Lcom/shopkick/app/view/TagContainerLayout;->rowMargins:Ljava/util/ArrayList;

    sub-int v16, v3, v8

    sub-int v16, v16, v14

    div-int/lit8 v16, v16, 0x2

    move/from16 p2, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move/from16 p2, v1

    .line 143
    :goto_1
    iget-object v1, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    mul-int/lit8 v7, v2, 0x4

    move/from16 p3, v3

    iget v3, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 144
    iget-object v1, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    add-int/lit8 v3, v7, 0x1

    move/from16 p4, v4

    iget v4, v11, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v4, v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 145
    iget-object v1, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    add-int/lit8 v3, v7, 0x2

    iget v4, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v4, v8

    add-int/2addr v4, v12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 146
    iget-object v1, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    add-int/lit8 v7, v7, 0x3

    iget v3, v11, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v3, v9

    add-int/2addr v3, v13

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 149
    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v8, v14

    move v10, v1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    move/from16 v1, p2

    move/from16 v3, p3

    move/from16 v4, p4

    goto/16 :goto_0

    :cond_3
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    if-ge v1, v6, :cond_6

    .line 158
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/TagContainerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 160
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-ne v4, v11, :cond_4

    goto :goto_4

    .line 162
    :cond_4
    iget-object v4, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    mul-int/lit8 v5, v1, 0x4

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ge v4, v12, :cond_5

    add-int/lit8 v2, v2, 0x1

    .line 166
    :cond_5
    iget-object v7, v0, Lcom/shopkick/app/view/TagContainerLayout;->rowMargins:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 168
    iget-object v8, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v7

    iget-object v9, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    add-int/lit8 v10, v5, 0x1

    .line 169
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v10, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    add-int/lit8 v12, v5, 0x2

    .line 170
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int/2addr v10, v7

    iget-object v7, v0, Lcom/shopkick/app/view/TagContainerLayout;->layoutCoordinate:Ljava/util/ArrayList;

    add-int/lit8 v5, v5, 0x3

    .line 171
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 168
    invoke-virtual {v3, v8, v9, v10, v5}, Landroid/view/View;->layout(IIII)V

    move v12, v4

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    return-void
.end method

.method protected onMeasure(II)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 30
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 33
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    .line 34
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingTop()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    .line 48
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getChildCount()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    move v9, v8

    move v10, v9

    move v11, v10

    move v12, v11

    :goto_0
    if-ge v7, v6, :cond_3

    .line 50
    invoke-virtual {v0, v7}, Lcom/shopkick/app/view/TagContainerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 52
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-ne v14, v15, :cond_0

    goto :goto_2

    :cond_0
    sub-int v14, v1, v4

    sub-int v15, v2, v5

    .line 55
    invoke-virtual {v0, v13, v14, v15}, Lcom/shopkick/app/view/TagContainerLayout;->measureChild(Landroid/view/View;II)V

    .line 58
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 59
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    iget v0, v14, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v15, v0

    iget v0, v14, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v15, v0

    .line 60
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v2, v14, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v2

    iget v2, v14, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v2

    add-int v2, v11, v15

    add-int v14, v2, v4

    if-le v14, v3, :cond_1

    add-int/2addr v8, v12

    .line 69
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    .line 73
    :cond_1
    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v15, v2

    :goto_1
    add-int/lit8 v2, v6, -0x1

    if-ne v7, v2, :cond_2

    add-int/2addr v8, v0

    .line 82
    :cond_2
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    invoke-static {v10, v2}, Lcom/shopkick/app/view/TagContainerLayout;->combineMeasuredStates(II)I

    move-result v2

    move v12, v0

    move v10, v2

    move v11, v15

    :goto_2
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move/from16 v2, p2

    goto :goto_0

    :cond_3
    add-int/2addr v8, v5

    .line 86
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v9, v4

    .line 87
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/view/TagContainerLayout;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 90
    invoke-static {v2, v1, v10}, Lcom/shopkick/app/view/TagContainerLayout;->resolveSizeAndState(III)I

    move-result v1

    shl-int/lit8 v2, v10, 0x10

    move/from16 v3, p2

    .line 91
    invoke-static {v0, v3, v2}, Lcom/shopkick/app/view/TagContainerLayout;->resolveSizeAndState(III)I

    move-result v0

    move-object/from16 v2, p0

    .line 90
    invoke-virtual {v2, v1, v0}, Lcom/shopkick/app/view/TagContainerLayout;->setMeasuredDimension(II)V

    return-void
.end method
