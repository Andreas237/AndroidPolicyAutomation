.class public Lcom/huawei/feedback/ui/MyRadioGroup;
.super Landroid/widget/RadioGroup;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "RadioGroupEx"


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    .line 18
    iput-object p1, p0, Lcom/huawei/feedback/ui/MyRadioGroup;->b:Landroid/content/Context;

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    iput-object p1, p0, Lcom/huawei/feedback/ui/MyRadioGroup;->b:Landroid/content/Context;

    .line 24
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 14

    .line 96
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getChildCount()I

    move-result v3

    .line 98
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingLeft()I

    move-result v4

    .line 99
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingTop()I

    move-result v5

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_1

    .line 103
    invoke-virtual {p0, v7}, Lcom/huawei/feedback/ui/MyRadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 104
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 106
    iget v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v4

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    sub-int v1, p4, p2

    if-le v0, v1, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingLeft()I

    move-result v4

    .line 110
    add-int v0, v5, v6

    iget-object v1, p0, Lcom/huawei/feedback/ui/MyRadioGroup;->b:Landroid/content/Context;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;F)I

    move-result v1

    add-int v5, v0, v1

    .line 111
    invoke-virtual {p0, v7}, Lcom/huawei/feedback/ui/MyRadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v1

    iget v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v6, v0, v1

    goto :goto_1

    .line 113
    :cond_0
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v1

    iget v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 116
    :goto_1
    iget v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int v10, v4, v0

    .line 118
    iget v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int v11, v5, v0

    .line 119
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int v12, v10, v0

    .line 120
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int v13, v11, v0

    .line 122
    invoke-virtual {v8, v10, v11, v12, v13}, Landroid/view/View;->layout(IIII)V

    .line 124
    iget v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    add-int/2addr v4, v0

    .line 102
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 126
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 19

    .line 28
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 29
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 30
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 31
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    .line 34
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/feedback/ui/MyRadioGroup;->measureChildren(II)V

    .line 37
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 49
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getChildCount()I

    move-result v13

    .line 51
    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_2

    .line 52
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/huawei/feedback/ui/MyRadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    .line 53
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 55
    move v11, v10

    .line 57
    move v12, v7

    .line 59
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    move-object/from16 v1, v16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v1

    move-object/from16 v1, v16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int v17, v0, v1

    .line 60
    add-int v0, v9, v17

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingLeft()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    if-le v0, v3, :cond_0

    .line 62
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 64
    move/from16 v9, v17

    .line 66
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/MyRadioGroup;->b:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;F)I

    move-result v0

    add-int/2addr v0, v11

    add-int/2addr v8, v0

    .line 68
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    move-object/from16 v1, v16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v1

    move-object/from16 v1, v16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v10, v0, v1

    .line 69
    const-string v0, "RadioGroupEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maxHeight:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "---"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "maxWidth:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 73
    :cond_0
    add-int v9, v9, v17

    .line 75
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    move-object/from16 v1, v16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v1

    move-object/from16 v1, v16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v18, v0, v1

    .line 76
    move/from16 v0, v18

    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 78
    :goto_1
    add-int/lit8 v0, v13, -0x1

    if-ne v14, v0, :cond_1

    .line 80
    add-int/2addr v8, v10

    .line 82
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 51
    :cond_1
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 87
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingLeft()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v7, v0

    .line 88
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingTop()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/MyRadioGroup;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v8, v0

    .line 89
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v4, v0, :cond_3

    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v7

    :goto_2
    const/high16 v1, 0x40000000    # 2.0f

    if-ne v6, v1, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v8

    :goto_3
    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/feedback/ui/MyRadioGroup;->setMeasuredDimension(II)V

    .line 92
    return-void
.end method
