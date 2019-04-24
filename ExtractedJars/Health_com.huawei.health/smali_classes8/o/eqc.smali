.class public Lo/eqc;
.super Landroid/support/v7/widget/LinearSnapHelper;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/support/v7/widget/OrientationHelper;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private c:I

.field private d:Landroid/support/v7/widget/OrientationHelper;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:I


# direct methods
.method constructor <init>(I)V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroid/support/v7/widget/LinearSnapHelper;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/eqc;->c:I

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/eqc;->a:I

    .line 29
    iput p1, p0, Lo/eqc;->e:I

    .line 30
    return-void
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;II)I
    .locals 5

    .line 216
    invoke-virtual {p0, p3, p4}, Lo/eqc;->calculateScrollDistance(II)[I

    move-result-object v2

    .line 217
    invoke-direct {p0, p1, p2}, Lo/eqc;->d(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;)F

    move-result v3

    .line 218
    const/4 v0, 0x0

    cmpg-float v0, v3, v0

    if-gtz v0, :cond_0

    .line 219
    const/4 v0, 0x0

    return v0

    .line 221
    :cond_0
    const/4 v0, 0x0

    aget v0, v2, v0

    .line 222
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    aget v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    aget v4, v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    aget v4, v2, v0

    .line 223
    :goto_0
    if-lez v4, :cond_2

    .line 224
    int-to-float v0, v4

    div-float/2addr v0, v3

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    return v0

    .line 226
    :cond_2
    int-to-float v0, v4

    div-float/2addr v0, v3

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/view/View;Landroid/support/v7/widget/OrientationHelper;)I
    .locals 5
    .param p1    # Landroid/support/v7/widget/RecyclerView$LayoutManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 192
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    move-result v0

    .line 193
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v3, v0, v1

    .line 195
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getClipToPadding()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    invoke-virtual {p3}, Landroid/support/v7/widget/OrientationHelper;->getStartAfterPadding()I

    move-result v0

    invoke-virtual {p3}, Landroid/support/v7/widget/OrientationHelper;->getTotalSpace()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v4, v0, v1

    goto :goto_0

    .line 198
    :cond_0
    invoke-virtual {p3}, Landroid/support/v7/widget/OrientationHelper;->getEnd()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 200
    :goto_0
    sub-int v0, v3, v4

    return v0
.end method

.method private c(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;
    .locals 1
    .param p1    # Landroid/support/v7/widget/RecyclerView$LayoutManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 335
    iget-object v0, p0, Lo/eqc;->b:Landroid/support/v7/widget/OrientationHelper;

    if-nez v0, :cond_0

    .line 336
    invoke-static {p1}, Landroid/support/v7/widget/OrientationHelper;->createHorizontalHelper(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    iput-object v0, p0, Lo/eqc;->b:Landroid/support/v7/widget/OrientationHelper;

    .line 338
    :cond_0
    iget-object v0, p0, Lo/eqc;->b:Landroid/support/v7/widget/OrientationHelper;

    return-object v0
.end method

.method private d(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;)F
    .locals 11

    .line 286
    const/4 v3, 0x0

    .line 287
    const/4 v4, 0x0

    .line 288
    const v5, 0x7fffffff

    .line 289
    const/high16 v6, -0x80000000

    .line 290
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getChildCount()I

    move-result v7

    .line 291
    if-nez v7, :cond_0

    .line 292
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 295
    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_4

    .line 296
    invoke-virtual {p1, v8}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 297
    invoke-virtual {p1, v9}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    move-result v10

    .line 298
    const/4 v0, -0x1

    if-ne v10, v0, :cond_1

    .line 299
    goto :goto_1

    .line 301
    :cond_1
    if-ge v10, v5, :cond_2

    .line 302
    move v5, v10

    .line 303
    move-object v3, v9

    .line 305
    :cond_2
    if-le v10, v6, :cond_3

    .line 306
    move v6, v10

    .line 307
    move-object v4, v9

    .line 295
    :cond_3
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 310
    :cond_4
    if-eqz v3, :cond_5

    if-nez v4, :cond_6

    .line 311
    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 313
    :cond_6
    invoke-virtual {p2, v3}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    move-result v0

    .line 314
    invoke-virtual {p2, v4}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    move-result v1

    .line 313
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 315
    invoke-virtual {p2, v3}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    move-result v0

    .line 316
    invoke-virtual {p2, v4}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    move-result v1

    .line 315
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 317
    sub-int v10, v9, v8

    .line 318
    if-nez v10, :cond_7

    .line 319
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 321
    :cond_7
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    sub-int v1, v6, v5

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method private e(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;
    .locals 1
    .param p1    # Landroid/support/v7/widget/RecyclerView$LayoutManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 326
    iget-object v0, p0, Lo/eqc;->d:Landroid/support/v7/widget/OrientationHelper;

    if-nez v0, :cond_0

    .line 327
    invoke-static {p1}, Landroid/support/v7/widget/OrientationHelper;->createVerticalHelper(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    iput-object v0, p0, Lo/eqc;->d:Landroid/support/v7/widget/OrientationHelper;

    .line 329
    :cond_0
    iget-object v0, p0, Lo/eqc;->d:Landroid/support/v7/widget/OrientationHelper;

    return-object v0
.end method

.method private e(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;)Landroid/view/View;
    .locals 11
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 242
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getChildCount()I

    move-result v3

    .line 243
    if-nez v3, :cond_0

    .line 244
    const/4 v0, 0x0

    return-object v0

    .line 247
    :cond_0
    const/4 v4, 0x0

    .line 249
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getClipToPadding()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    invoke-virtual {p2}, Landroid/support/v7/widget/OrientationHelper;->getStartAfterPadding()I

    move-result v0

    invoke-virtual {p2}, Landroid/support/v7/widget/OrientationHelper;->getTotalSpace()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v5, v0, v1

    goto :goto_0

    .line 252
    :cond_1
    invoke-virtual {p2}, Landroid/support/v7/widget/OrientationHelper;->getEnd()I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    .line 254
    :goto_0
    const v6, 0x7fffffff

    .line 256
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v3, :cond_3

    .line 257
    invoke-virtual {p1, v7}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 258
    invoke-virtual {p2, v8}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    move-result v0

    .line 259
    invoke-virtual {p2, v8}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v9, v0, v1

    .line 260
    sub-int v0, v9, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    .line 263
    if-ge v10, v6, :cond_2

    .line 264
    move v6, v10

    .line 265
    move-object v4, v8

    .line 256
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 268
    :cond_3
    return-object v4
.end method


# virtual methods
.method public c(I)V
    .locals 0

    .line 33
    iput p1, p0, Lo/eqc;->c:I

    .line 34
    return-void
.end method

.method public calculateDistanceToFinalSnap(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/view/View;)[I
    .locals 3
    .param p1    # Landroid/support/v7/widget/RecyclerView$LayoutManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 44
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-direct {p0, p1}, Lo/eqc;->c(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    .line 45
    invoke-direct {p0, p1, p2, v0}, Lo/eqc;->a(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/view/View;Landroid/support/v7/widget/OrientationHelper;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v2, v1

    goto :goto_0

    .line 48
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 51
    :goto_0
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lo/eqc;->e(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Lo/eqc;->a(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/view/View;Landroid/support/v7/widget/OrientationHelper;)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v2, v1

    goto :goto_1

    .line 55
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 57
    :goto_1
    return-object v2
.end method

.method public e(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/eqc;->a:I

    .line 38
    return-void
.end method

.method public findSnapView(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/view/View;
    .locals 1

    .line 182
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-direct {p0, p1}, Lo/eqc;->e(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/eqc;->e(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 184
    :cond_0
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    invoke-direct {p0, p1}, Lo/eqc;->c(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/eqc;->e(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 187
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public findTargetSnapPosition(Landroid/support/v7/widget/RecyclerView$LayoutManager;II)I
    .locals 16

    .line 63
    move-object/from16 v0, p1

    instance-of v0, v0, Landroid/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;

    if-nez v0, :cond_0

    .line 64
    const/4 v0, -0x1

    return v0

    .line 66
    :cond_0
    const-string v0, "FunctionSetPagerSnapHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findTargetSnapPosition() : velocityX: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-virtual/range {p1 .. p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v5

    .line 69
    if-nez v5, :cond_1

    .line 70
    const/4 v0, -0x1

    return v0

    .line 73
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/eqc;->findSnapView(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/view/View;

    move-result-object v6

    .line 74
    if-nez v6, :cond_2

    .line 75
    const/4 v0, -0x1

    return v0

    .line 78
    :cond_2
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    move-result v7

    .line 79
    const/4 v0, -0x1

    if-ne v7, v0, :cond_3

    .line 80
    const/4 v0, -0x1

    return v0

    .line 84
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getWidth()I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Lo/eqc;->c(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    move-result v1

    div-int v8, v0, v1

    .line 86
    move-object/from16 v9, p1

    check-cast v9, Landroid/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;

    .line 91
    add-int/lit8 v0, v5, -0x1

    invoke-interface {v9, v0}, Landroid/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object v10

    .line 92
    if-nez v10, :cond_4

    .line 94
    const/4 v0, -0x1

    return v0

    .line 97
    :cond_4
    if-gez p2, :cond_6

    .line 99
    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->a:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iget v1, v1, Lo/eqc;->e:I

    if-ne v0, v1, :cond_5

    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->c:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/eqc;->a:I

    add-int/lit8 v1, v1, -0x3

    if-ne v0, v1, :cond_5

    .line 101
    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->a:I

    add-int/lit8 v7, v0, -0x1

    goto :goto_0

    .line 104
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->a:I

    add-int/lit8 v7, v0, -0x2

    .line 106
    :goto_0
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/eqc;->c:I

    .line 107
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/eqc;->a:I

    .line 109
    :cond_6
    if-lez p2, :cond_8

    .line 111
    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->c:I

    if-nez v0, :cond_7

    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->a:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/eqc;->c:I

    add-int/lit8 v1, v1, 0x3

    if-ne v0, v1, :cond_7

    .line 113
    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->c:I

    add-int/lit8 v7, v0, 0x1

    goto :goto_1

    .line 116
    :cond_7
    move-object/from16 v0, p0

    iget v0, v0, Lo/eqc;->c:I

    add-int/lit8 v7, v0, 0x2

    .line 118
    :goto_1
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/eqc;->c:I

    .line 119
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/eqc;->a:I

    .line 123
    :cond_8
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v13

    .line 125
    invoke-virtual/range {p1 .. p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 126
    .line 127
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/eqc;->c(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    .line 126
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v0, v3, v4}, Lo/eqc;->a(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;II)I

    move-result v12

    .line 128
    iget v0, v10, Landroid/graphics/PointF;->x:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 129
    neg-int v12, v12

    .line 133
    :cond_9
    if-gez p2, :cond_b

    .line 134
    if-eqz v13, :cond_a

    .line 135
    move v12, v8

    goto :goto_2

    .line 138
    :cond_a
    neg-int v12, v8

    .line 142
    :cond_b
    :goto_2
    if-lez p2, :cond_e

    .line 143
    if-eqz v13, :cond_c

    .line 144
    neg-int v12, v8

    goto :goto_3

    .line 147
    :cond_c
    move v12, v8

    goto :goto_3

    .line 151
    :cond_d
    const/4 v12, 0x0

    .line 153
    :cond_e
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 154
    .line 155
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/eqc;->e(Landroid/support/v7/widget/RecyclerView$LayoutManager;)Landroid/support/v7/widget/OrientationHelper;

    move-result-object v0

    .line 154
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v3, 0x0

    move/from16 v4, p3

    invoke-direct {v1, v2, v0, v3, v4}, Lo/eqc;->a(Landroid/support/v7/widget/RecyclerView$LayoutManager;Landroid/support/v7/widget/OrientationHelper;II)I

    move-result v11

    .line 156
    iget v0, v10, Landroid/graphics/PointF;->y:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_10

    .line 157
    neg-int v11, v11

    goto :goto_4

    .line 160
    :cond_f
    const/4 v11, 0x0

    .line 163
    :cond_10
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_11

    move v14, v11

    goto :goto_5

    :cond_11
    move v14, v12

    .line 164
    :goto_5
    if-nez v14, :cond_12

    .line 165
    const/4 v0, -0x1

    return v0

    .line 168
    :cond_12
    add-int v15, v7, v14

    .line 170
    if-gez v15, :cond_13

    .line 171
    const/4 v15, 0x0

    .line 173
    :cond_13
    if-lt v15, v5, :cond_14

    .line 174
    add-int/lit8 v15, v5, -0x1

    .line 176
    :cond_14
    return v15
.end method
