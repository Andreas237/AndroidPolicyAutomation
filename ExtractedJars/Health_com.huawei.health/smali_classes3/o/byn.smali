.class public Lo/byn;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/byn$d;
    }
.end annotation


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private b:Lo/byn$d;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/byn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/byn;->c:I

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byn;->a:Ljava/util/List;

    .line 31
    sget-object v0, Lcom/huawei/health/suggestion/R$styleable;->FlowLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 33
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->FlowLayout_lineSpacing:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/byn;->c:I

    .line 35
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    return-void
.end method

.method static synthetic e(Lo/byn;)Lo/byn$d;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/byn;->b:Lo/byn$d;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 169
    invoke-virtual {p0}, Lo/byn;->removeAllViews()V

    .line 170
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 171
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 172
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_flow_item_search:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/efy;

    .line 173
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 174
    invoke-virtual {v4, v5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 175
    new-instance v0, Lo/byn$3;

    invoke-direct {v0, p0, v5}, Lo/byn$3;-><init>(Lo/byn;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    invoke-virtual {p0, v4}, Lo/byn;->addView(Landroid/view/View;)V

    .line 171
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 186
    :cond_0
    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 210
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-super {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 205
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Lo/byn;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 200
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 25

    .line 92
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingLeft()I

    move-result v4

    .line 93
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingRight()I

    move-result v5

    .line 94
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingTop()I

    move-result v6

    .line 96
    move v7, v4

    .line 97
    move v8, v6

    .line 98
    sub-int v9, p4, p2

    .line 99
    add-int v10, v4, v5

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 103
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byn;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 104
    const/4 v13, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getChildCount()I

    move-result v0

    if-ge v13, v0, :cond_5

    .line 105
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/byn;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    .line 106
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 107
    goto/16 :goto_3

    .line 109
    :cond_0
    const/4 v15, 0x0

    .line 110
    const/16 v16, 0x0

    .line 111
    const/16 v17, 0x0

    .line 112
    const/16 v18, 0x0

    .line 113
    const/16 v19, 0x0

    .line 114
    const/16 v20, 0x0

    .line 115
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v21

    .line 116
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    move-result v22

    .line 118
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    .line 119
    move-object/from16 v0, v23

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 120
    move-object/from16 v24, v23

    check-cast v24, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 121
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v1, v24

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int v15, v0, v1

    .line 122
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move-object/from16 v1, v24

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v16, v0, v1

    .line 123
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int v17, v7, v0

    .line 124
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int v18, v8, v0

    .line 125
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v7

    add-int v19, v0, v21

    .line 126
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v8

    add-int v20, v0, v22

    .line 127
    goto :goto_1

    .line 128
    :cond_1
    move/from16 v17, v7

    .line 129
    move/from16 v18, v8

    .line 130
    add-int v19, v7, v21

    .line 131
    add-int v20, v8, v22

    .line 133
    :goto_1
    add-int v15, v15, v21

    .line 134
    add-int v16, v16, v22

    .line 136
    add-int v0, v10, v15

    if-le v0, v9, :cond_3

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byn;->a:Ljava/util/List;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    move-object/from16 v0, p0

    iget v0, v0, Lo/byn;->c:I

    add-int/2addr v0, v11

    add-int/2addr v8, v0

    .line 139
    add-int v10, v4, v5

    .line 140
    move v7, v4

    .line 141
    const/4 v11, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    move-object/from16 v0, v23

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_2

    .line 144
    move-object/from16 v24, v23

    check-cast v24, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 145
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int v17, v7, v0

    .line 146
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int v18, v8, v0

    .line 147
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v7

    add-int v19, v0, v21

    .line 148
    move-object/from16 v0, v24

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v8

    add-int v20, v0, v22

    .line 149
    goto :goto_2

    .line 150
    :cond_2
    move/from16 v17, v7

    .line 151
    move/from16 v18, v8

    .line 152
    add-int v19, v7, v21

    .line 153
    add-int v20, v8, v22

    .line 156
    :cond_3
    :goto_2
    move/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v19

    move/from16 v3, v20

    invoke-virtual {v14, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 157
    add-int/lit8 v12, v12, 0x1

    .line 158
    move/from16 v0, v16

    if-le v0, v11, :cond_4

    .line 159
    move/from16 v11, v16

    .line 161
    :cond_4
    add-int/2addr v10, v15

    .line 162
    add-int/2addr v7, v15

    .line 104
    :goto_3
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 164
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byn;->a:Ljava/util/List;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    return-void
.end method

.method protected onMeasure(II)V
    .locals 23

    .line 40
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingLeft()I

    move-result v6

    .line 41
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingRight()I

    move-result v7

    .line 42
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingTop()I

    move-result v8

    .line 43
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getPaddingBottom()I

    move-result v9

    .line 45
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    .line 46
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 47
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v12

    .line 48
    add-int v13, v6, v7

    .line 49
    move v14, v8

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lo/byn;->getChildCount()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_4

    .line 52
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/byn;->getChildAt(I)Landroid/view/View;

    move-result-object v17

    .line 53
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 54
    goto/16 :goto_2

    .line 56
    :cond_0
    const/16 v18, 0x0

    .line 57
    const/16 v19, 0x0

    .line 58
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v20

    .line 59
    move-object/from16 v0, v20

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 60
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move/from16 v2, p1

    move/from16 v4, p2

    move v5, v14

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/byn;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 61
    move-object/from16 v21, v20

    check-cast v21, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 62
    move-object/from16 v0, v21

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v1, v21

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int v18, v0, v1

    .line 63
    move-object/from16 v0, v21

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move-object/from16 v1, v21

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v19, v0, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-virtual {v0, v1, v2, v3}, Lo/byn;->measureChild(Landroid/view/View;II)V

    .line 68
    :goto_1
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getMeasuredWidth()I

    move-result v21

    .line 69
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getMeasuredHeight()I

    move-result v22

    .line 70
    add-int v18, v18, v21

    .line 71
    add-int v19, v19, v22

    .line 73
    add-int v0, v13, v18

    if-le v0, v10, :cond_2

    .line 74
    move-object/from16 v0, p0

    iget v0, v0, Lo/byn;->c:I

    add-int/2addr v0, v15

    add-int/2addr v14, v0

    .line 75
    add-int v13, v6, v7

    .line 76
    const/4 v15, 0x0

    .line 78
    :cond_2
    move/from16 v0, v19

    if-le v0, v15, :cond_3

    .line 79
    move/from16 v15, v19

    .line 81
    :cond_3
    add-int v13, v13, v18

    .line 51
    :goto_2
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_0

    .line 83
    :cond_4
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v11, v0, :cond_5

    move/from16 v16, v12

    goto :goto_3

    :cond_5
    add-int v0, v14, v15

    add-int v16, v0, v9

    .line 84
    :goto_3
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v10, v1}, Lo/byn;->setMeasuredDimension(II)V

    .line 88
    return-void
.end method

.method public setTextOnClickListener(Lo/byn$d;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/byn;->b:Lo/byn$d;

    .line 192
    return-void
.end method
