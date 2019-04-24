.class public Lo/chu;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private d:Landroid/content/Context;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chu;->d:Landroid/content/Context;

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/chu;->a:I

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lo/chu;->e:I

    .line 26
    invoke-direct {p0, p1}, Lo/chu;->c(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chu;->d:Landroid/content/Context;

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/chu;->a:I

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lo/chu;->e:I

    .line 31
    invoke-direct {p0, p1}, Lo/chu;->c(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 35
    iput-object p1, p0, Lo/chu;->d:Landroid/content/Context;

    .line 36
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/chu;->setOrientation(I)V

    .line 37
    iget-object v0, p0, Lo/chu;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/chu;->a:I

    .line 38
    iget-object v0, p0, Lo/chu;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/chu;->e:I

    .line 39
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 10

    .line 44
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 46
    invoke-virtual {p0}, Lo/chu;->getChildCount()I

    move-result v4

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v4, :cond_1

    .line 51
    invoke-virtual {p0, v8}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 53
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 54
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    .line 56
    if-lez v8, :cond_0

    add-int/lit8 v0, v4, -0x1

    if-ge v8, v0, :cond_0

    .line 57
    iget v0, p0, Lo/chu;->e:I

    add-int/2addr v7, v0

    .line 58
    iget v0, p0, Lo/chu;->e:I

    iget v1, p0, Lo/chu;->e:I

    add-int/2addr v1, v5

    add-int v2, v6, v7

    invoke-virtual {v9, v0, v7, v1, v2}, Landroid/view/View;->layout(IIII)V

    goto :goto_1

    .line 60
    :cond_0
    add-int v0, v6, v7

    const/4 v1, 0x0

    invoke-virtual {v9, v1, v7, v5, v0}, Landroid/view/View;->layout(IIII)V

    .line 62
    :goto_1
    add-int/2addr v7, v6

    .line 50
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 65
    :cond_1
    const-string v0, "Track_TrackShareViewGroup"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    return-void
.end method

.method protected onMeasure(II)V
    .locals 9

    .line 76
    invoke-virtual {p0}, Lo/chu;->getChildCount()I

    move-result v2

    .line 77
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 78
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 79
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 80
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_2

    .line 81
    if-eqz v6, :cond_0

    add-int/lit8 v0, v2, -0x1

    if-ne v6, v0, :cond_1

    .line 82
    :cond_0
    invoke-virtual {p0, v6}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, p1, v5}, Lo/chu;->measureChild(Landroid/view/View;II)V

    goto :goto_1

    .line 84
    :cond_1
    iget v0, p0, Lo/chu;->e:I

    sub-int v0, v4, v0

    iget v1, p0, Lo/chu;->e:I

    sub-int/2addr v0, v1

    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 85
    invoke-virtual {p0, v6}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, v7, v5}, Lo/chu;->measureChild(Landroid/view/View;II)V

    .line 80
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 90
    :cond_2
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v2, :cond_4

    .line 94
    invoke-virtual {p0, v8}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v6, v0

    .line 95
    invoke-virtual {p0, v8}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-le v0, v7, :cond_3

    .line 96
    invoke-virtual {p0, v8}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 93
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 101
    :cond_4
    add-int/lit8 v0, v2, -0x2

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    .line 102
    add-int/lit8 v0, v2, -0x2

    iget v1, p0, Lo/chu;->a:I

    mul-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v6, v0

    .line 105
    :cond_5
    invoke-virtual {p0, v4, v6}, Lo/chu;->setMeasuredDimension(II)V

    .line 108
    return-void
.end method

.method public setAllChildViewBackgroudSource(II)V
    .locals 4

    .line 111
    invoke-virtual {p0}, Lo/chu;->getChildCount()I

    move-result v1

    .line 112
    if-gez p2, :cond_0

    .line 113
    const/4 p2, 0x0

    .line 115
    :cond_0
    move v2, p2

    :goto_0
    add-int/lit8 v0, v1, -0x1

    if-ge v2, v0, :cond_2

    .line 116
    invoke-virtual {p0, v2}, Lo/chu;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 117
    if-eqz v3, :cond_1

    .line 118
    invoke-virtual {v3, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 115
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 121
    :cond_2
    return-void
.end method
