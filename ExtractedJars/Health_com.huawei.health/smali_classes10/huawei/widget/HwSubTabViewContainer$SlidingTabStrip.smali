.class public Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSubTabViewContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SlidingTabStrip"
.end annotation


# instance fields
.field private mIndicatorAnimator:Landroid/animation/ValueAnimator;

.field private mIndicatorLeft:I

.field private mIndicatorRight:I

.field private mLayoutDirection:I

.field private mSelectedIndicatorHeight:I

.field private mSelectedIndicatorMargin:I

.field private mSelectedIndicatorPadding:I

.field private final mSelectedIndicatorPaint:Landroid/graphics/Paint;

.field mSelectedPosition:I

.field mSelectionOffset:F


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 206
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 195
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    .line 198
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mLayoutDirection:I

    .line 200
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    .line 201
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorRight:I

    .line 207
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setWillNotDraw(Z)V

    .line 208
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    .line 209
    return-void
.end method

.method private updateIndicatorPosition()V
    .locals 9

    .line 294
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 297
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    .line 298
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    add-int v4, v0, v1

    .line 299
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    sub-int v5, v0, v1

    .line 301
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    .line 303
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 304
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    add-int v7, v0, v1

    .line 305
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    sub-int v8, v0, v1

    .line 306
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    int-to-float v1, v7

    mul-float/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    int-to-float v2, v4

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v4, v0

    .line 308
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    int-to-float v1, v8

    mul-float/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    int-to-float v2, v5

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v5, v0

    .line 310
    goto :goto_0

    .line 312
    :cond_0
    const/4 v5, -0x1

    const/4 v4, -0x1

    .line 315
    :cond_1
    :goto_0
    invoke-virtual {p0, v4, v5}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setIndicatorPosition(II)V

    .line 316
    return-void
.end method


# virtual methods
.method animateIndicatorToPosition(II)V
    .locals 13

    .line 328
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 332
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 335
    :goto_0
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 336
    if-nez v7, :cond_2

    .line 338
    invoke-direct {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->updateIndicatorPosition()V

    .line 339
    return-void

    .line 342
    :cond_2
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    add-int v8, v0, v1

    .line 343
    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    sub-int v9, v0, v1

    .line 345
    iget v10, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    .line 346
    iget v11, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorRight:I

    .line 348
    if-ne v10, v8, :cond_3

    if-eq v11, v9, :cond_4

    .line 349
    :cond_3
    new-instance v12, Landroid/animation/ValueAnimator;

    invoke-direct {v12}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v12, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    .line 350
    sget-object v0, Lhuawei/widget/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/view/animation/Interpolator;

    invoke-virtual {v12, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 351
    int-to-long v0, p2

    invoke-virtual {v12, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 352
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-virtual {v12, v0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 353
    new-instance v0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;

    move-object v1, p0

    move v2, v10

    move v3, v8

    move v4, v11

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$1;-><init>(Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;IIII)V

    invoke-virtual {v12, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 362
    new-instance v0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;

    invoke-direct {v0, p0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip$2;-><init>(Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;I)V

    invoke-virtual {v12, v0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 369
    invoke-virtual {v12}, Landroid/animation/ValueAnimator;->start()V

    .line 371
    :cond_4
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method childrenNeedLayout()Z
    .locals 4

    .line 237
    const/4 v1, 0x0

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 238
    invoke-virtual {p0, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 239
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v0

    if-gtz v0, :cond_0

    .line 240
    const/4 v0, 0x1

    return v0

    .line 237
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 243
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 375
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 378
    const/4 v6, 0x0

    .line 379
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 380
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 381
    invoke-virtual {v7}, Landroid/widget/TextView;->getTotalPaddingBottom()I

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorMargin:I

    sub-int v6, v0, v1

    .line 383
    :cond_0
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    if-ltz v0, :cond_1

    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorRight:I

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    if-le v0, v1, :cond_1

    .line 384
    move-object v0, p1

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    int-to-float v1, v1

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getHeight()I

    move-result v2

    iget v3, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorHeight:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v6

    int-to-float v2, v2

    iget v3, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorRight:I

    int-to-float v3, v3

    .line 385
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getHeight()I

    move-result v4

    sub-int/2addr v4, v6

    int-to-float v4, v4

    iget-object v5, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    .line 384
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 387
    :cond_1
    return-void
.end method

.method getIndicatorPosition()F
    .locals 2

    .line 257
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    int-to-float v0, v0

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    add-float/2addr v0, v1

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .line 278
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 280
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 284
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getDuration()J

    move-result-wide v3

    .line 285
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    iget-object v1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    .line 286
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    long-to-float v2, v3

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 285
    invoke-virtual {p0, v0, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->animateIndicatorToPosition(II)V

    .line 287
    goto :goto_0

    .line 289
    :cond_0
    invoke-direct {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->updateIndicatorPosition()V

    .line 291
    :goto_0
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 2

    .line 262
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRtlPropertiesChanged(I)V

    .line 266
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 268
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mLayoutDirection:I

    if-eq v0, p1, :cond_0

    .line 269
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->requestLayout()V

    .line 270
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mLayoutDirection:I

    .line 273
    :cond_0
    return-void
.end method

.method setIndicatorPosition(II)V
    .locals 1

    .line 319
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorRight:I

    if-eq p2, v0, :cond_1

    .line 321
    :cond_0
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorLeft:I

    .line 322
    iput p2, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorRight:I

    .line 323
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->postInvalidateOnAnimation()V

    .line 325
    :cond_1
    return-void
.end method

.method setIndicatorPositionFromTabPosition(IF)V
    .locals 1

    .line 247
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mIndicatorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 251
    :cond_0
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedPosition:I

    .line 252
    iput p2, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectionOffset:F

    .line 253
    invoke-direct {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->updateIndicatorPosition()V

    .line 254
    return-void
.end method

.method public setSelectedIndicatorColor(I)V
    .locals 1

    .line 212
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 213
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->postInvalidateOnAnimation()V

    .line 216
    :cond_0
    return-void
.end method

.method setSelectedIndicatorHeight(I)V
    .locals 1

    .line 219
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorHeight:I

    if-eq v0, p1, :cond_0

    .line 220
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorHeight:I

    .line 221
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->postInvalidateOnAnimation()V

    .line 223
    :cond_0
    return-void
.end method

.method setSelectedIndicatorMargin(I)V
    .locals 1

    .line 226
    iget v0, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorMargin:I

    if-eq v0, p1, :cond_0

    .line 227
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorMargin:I

    .line 228
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->postInvalidateOnAnimation()V

    .line 230
    :cond_0
    return-void
.end method

.method setSelectedIndicatorPadding(I)V
    .locals 0

    .line 233
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->mSelectedIndicatorPadding:I

    .line 234
    return-void
.end method
