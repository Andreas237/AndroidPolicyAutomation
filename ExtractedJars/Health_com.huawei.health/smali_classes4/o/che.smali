.class public Lo/che;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field private b:Z

.field private c:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 21
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lo/che;->c:I

    .line 18
    const/4 v0, 0x2

    iput v0, p0, Lo/che;->e:I

    .line 22
    invoke-static {p1}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/che;->b:Z

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/che;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lo/che;->c:I

    .line 18
    const/4 v0, 0x2

    iput v0, p0, Lo/che;->e:I

    .line 31
    invoke-static {p1}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/che;->b:Z

    .line 32
    return-void
.end method


# virtual methods
.method public e(I)V
    .locals 0

    .line 35
    iput p1, p0, Lo/che;->e:I

    .line 36
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 14

    .line 82
    invoke-virtual {p0}, Lo/che;->getChildCount()I

    move-result v4

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-virtual {p0}, Lo/che;->getMeasuredWidth()I

    move-result v10

    .line 89
    iget-boolean v0, p0, Lo/che;->b:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/che;->e:I

    add-int/lit8 v0, v0, 0x1

    rem-int v0, v4, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    .line 90
    :goto_0
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v4, :cond_6

    .line 91
    invoke-virtual {p0, v12}, Lo/che;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 93
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 94
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    .line 96
    if-ge v7, v10, :cond_1

    iget v0, p0, Lo/che;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 98
    :cond_1
    const/4 v7, 0x0

    .line 99
    add-int/2addr v8, v9

    .line 100
    const/4 v9, 0x0

    .line 102
    const/16 p2, 0x0

    .line 103
    add-int/lit8 p4, v5, 0x0

    .line 104
    move/from16 p3, v8

    .line 105
    add-int p5, p3, v6

    goto :goto_2

    .line 108
    :cond_2
    move/from16 p2, v7

    .line 109
    add-int p4, p2, v5

    .line 110
    move/from16 p3, v8

    .line 111
    add-int p5, p3, v6

    .line 114
    :goto_2
    add-int/2addr v7, v5

    .line 115
    if-le v6, v9, :cond_3

    .line 116
    move v9, v6

    .line 119
    :cond_3
    add-int/lit8 v0, v4, -0x1

    if-ne v12, v0, :cond_4

    if-nez v11, :cond_5

    .line 121
    :cond_4
    move/from16 v0, p2

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p5

    invoke-virtual {v13, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 90
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 125
    :cond_6
    if-eqz v11, :cond_7

    .line 126
    add-int/lit8 v0, v4, -0x1

    invoke-virtual {p0, v0}, Lo/che;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 127
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 128
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    .line 129
    sub-int v0, v10, v5

    add-int v1, v8, v6

    invoke-virtual {v12, v0, v8, v10, v1}, Landroid/view/View;->layout(IIII)V

    .line 132
    :cond_7
    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .line 46
    invoke-virtual {p0, p1, p2}, Lo/che;->measureChildren(II)V

    .line 48
    invoke-virtual {p0}, Lo/che;->getChildCount()I

    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    if-lez v2, :cond_2

    .line 52
    iget v0, p0, Lo/che;->c:I

    if-nez v0, :cond_0

    .line 53
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/che;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p0, Lo/che;->e:I

    mul-int v3, v0, v1

    goto :goto_0

    .line 55
    :cond_0
    iget v3, p0, Lo/che;->c:I

    .line 59
    :goto_0
    iget v0, p0, Lo/che;->e:I

    add-int/lit8 v0, v0, 0x1

    div-int v5, v2, v0

    .line 60
    iget v0, p0, Lo/che;->e:I

    add-int/lit8 v0, v0, 0x1

    rem-int v0, v2, v0

    if-eqz v0, :cond_1

    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 63
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/che;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    mul-int/2addr v0, v5

    add-int/lit8 v4, v0, 0x0

    .line 65
    iget v0, p0, Lo/che;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_2

    .line 68
    invoke-virtual {p0, v6}, Lo/che;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v4, v0

    .line 67
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p0, v3, v4}, Lo/che;->setMeasuredDimension(II)V

    .line 75
    return-void
.end method

.method public setContainerWidth(I)V
    .locals 0

    .line 147
    iput p1, p0, Lo/che;->c:I

    .line 148
    return-void
.end method

.method public setTextColor(I)V
    .locals 4

    .line 135
    invoke-virtual {p0}, Lo/che;->getChildCount()I

    move-result v1

    .line 136
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 137
    invoke-virtual {p0, v2}, Lo/che;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 138
    instance-of v0, v3, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 139
    move-object v0, v3

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    goto :goto_1

    .line 140
    :cond_0
    instance-of v0, v3, Lo/chj;

    if-eqz v0, :cond_1

    .line 141
    move-object v0, v3

    check-cast v0, Lo/chj;

    invoke-virtual {v0, p1}, Lo/chj;->setTextColor(I)V

    .line 136
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 144
    :cond_2
    return-void
.end method
