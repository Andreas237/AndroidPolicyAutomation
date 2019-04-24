.class public Lo/bno;
.super Landroid/widget/GridView;
.source "SourceFile"


# instance fields
.field private a:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V

    .line 23
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 38
    invoke-direct {p0, p1, p2}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    .line 28
    return-void
.end method

.method private a()I
    .locals 4

    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    iget-object v1, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v3}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    add-int/2addr v2, v0

    .line 73
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 77
    :cond_0
    return v2
.end method

.method private c()V
    .locals 6

    .line 92
    invoke-virtual {p0}, Lo/bno;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 93
    if-eqz v1, :cond_4

    .line 95
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/bno;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 98
    const/4 v3, 0x0

    .line 99
    move v4, v2

    :goto_1
    invoke-virtual {p0}, Lo/bno;->getNumColumns()I

    move-result v0

    add-int/2addr v0, v2

    if-ge v4, v0, :cond_1

    .line 101
    invoke-virtual {p0, v4}, Lo/bno;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 102
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v0

    if-le v0, v3, :cond_0

    .line 104
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 99
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 109
    :cond_1
    if-lez v3, :cond_3

    .line 111
    move v4, v2

    :goto_2
    invoke-virtual {p0}, Lo/bno;->getNumColumns()I

    move-result v0

    add-int/2addr v0, v2

    if-ge v4, v0, :cond_3

    .line 113
    invoke-virtual {p0, v4}, Lo/bno;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 114
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eq v0, v3, :cond_2

    .line 116
    invoke-virtual {v5, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 111
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 122
    :cond_3
    iget-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 95
    invoke-virtual {p0}, Lo/bno;->getNumColumns()I

    move-result v0

    add-int/2addr v2, v0

    goto :goto_0

    .line 125
    :cond_4
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 0

    .line 83
    invoke-super/range {p0 .. p5}, Landroid/widget/GridView;->onLayout(ZIIII)V

    .line 84
    invoke-direct {p0}, Lo/bno;->c()V

    .line 85
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 44
    const v0, 0x1fffffff

    const/high16 v1, -0x80000000

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 45
    invoke-super {p0, p1, v2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-virtual {p0}, Lo/bno;->getChildCount()I

    move-result v0

    invoke-virtual {p0}, Lo/bno;->getNumColumns()I

    move-result v1

    rem-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lo/bno;->getChildCount()I

    move-result v0

    invoke-virtual {p0}, Lo/bno;->getNumColumns()I

    move-result v1

    div-int v3, v0, v1

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Lo/bno;->getChildCount()I

    move-result v0

    invoke-virtual {p0}, Lo/bno;->getNumColumns()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v3, v0, 0x1

    .line 58
    :goto_0
    iget-object v0, p0, Lo/bno;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    if-ne v0, v3, :cond_1

    .line 60
    invoke-virtual {p0}, Lo/bno;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_normal_group_vertical_spacing:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int/lit8 v1, v3, -0x1

    mul-int/2addr v0, v1

    invoke-direct {p0}, Lo/bno;->a()I

    move-result v1

    add-int v4, v0, v1

    .line 61
    invoke-virtual {p0}, Lo/bno;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0, v0, v4}, Lo/bno;->setMeasuredDimension(II)V

    .line 64
    :cond_1
    return-void
.end method
