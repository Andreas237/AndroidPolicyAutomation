.class public Lhuawei/widget/HwSeekBar;
.super Landroid/widget/SeekBar;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;
    }
.end annotation


# static fields
.field private static final OFFSET_LABELLING:I = 0x10

.field private static final OFFSET_TRACK:I = 0x4

.field private static final SEEKBAR_HEIGHT_LABELLING:I = 0x30


# instance fields
.field private mBubbleTipBgId:I

.field private mCircleDr:Landroid/graphics/drawable/Drawable;

.field private mContext:Landroid/content/Context;

.field private mHasCustomTipText:Z

.field private mIsDragging:Z

.field private mIsShowPopWindow:Z

.field private mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

.field private mPaintCircle:Landroid/graphics/Paint;

.field private mPaintText:Landroid/graphics/Paint;

.field private mProgress:I

.field private mPw:Landroid/widget/PopupWindow;

.field private mScaledTouchSlop:I

.field private mSetLabelling:Z

.field private mSetTip:Z

.field private mSingleTipBgId:I

.field private mStepNum:I

.field private mStepTextColor:I

.field private mStepTextSize:I

.field private mStepValue:F

.field private mTempRect:Landroid/graphics/Rect;

.field private mTipBgId:I

.field private mTipTextColor:I

.field private mTipTextSize:I

.field private mTouchDownX:F

.field private mTouchProgressOffset:F

.field private mTv:Landroid/widget/TextView;

.field private mTvHeight:I

.field private mTvWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 105
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 106
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 109
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 110
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 113
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetTip:Z

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetLabelling:Z

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mHasCustomTipText:Z

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    .line 86
    const/16 v0, 0xd

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTipTextSize:I

    .line 88
    const/16 v0, 0xa

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mStepTextSize:I

    .line 96
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSeekBar;->mTempRect:Landroid/graphics/Rect;

    .line 114
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/HwSeekBar;->initialize(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 115
    return-void
.end method

.method private attemptClaimDrag()V
    .locals 2

    .line 486
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 487
    if-eqz v1, :cond_0

    .line 488
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 490
    :cond_0
    return-void
.end method

.method private static dip2px(I)I
    .locals 3

    .line 589
    int-to-float v0, p0

    .line 590
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 589
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method private drawCircles(Landroid/graphics/Canvas;)V
    .locals 20

    .line 553
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 554
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lhuawei/widget/HwSeekBar;->drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 555
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v6

    .line 556
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v7

    .line 558
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getWidth()I

    move-result v8

    .line 559
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v0

    sub-int v0, v8, v0

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v9, v0

    .line 560
    move-object/from16 v0, p0

    iget v10, v0, Lhuawei/widget/HwSeekBar;->mStepNum:I

    .line 561
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getHeight()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    div-int/lit8 v1, v7, 0x2

    sub-int v11, v0, v1

    .line 562
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v12

    .line 563
    const/4 v0, 0x1

    if-le v10, v0, :cond_3

    .line 564
    int-to-float v0, v10

    div-float v13, v9, v0

    .line 565
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lhuawei/widget/HwSeekBar;->mSetLabelling:Z

    if-eqz v0, :cond_2

    .line 566
    const/4 v14, 0x0

    .line 567
    const/4 v15, 0x0

    :goto_0
    if-gt v15, v10, :cond_1

    .line 568
    invoke-direct/range {p0 .. p0}, Lhuawei/widget/HwSeekBar;->isRtlLayoutForHwFeature()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 569
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwSeekBar;->mStepValue:F

    sub-int v1, v10, v15

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v14

    goto :goto_1

    .line 571
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwSeekBar;->mStepValue:F

    int-to-float v1, v15

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v14

    .line 573
    :goto_1
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lhuawei/widget/HwSeekBar;->getTextHeight(Ljava/lang/String;)I

    move-result v16

    .line 574
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lhuawei/widget/HwSeekBar;->getTextWidth(Ljava/lang/String;)I

    move-result v17

    .line 575
    int-to-float v0, v12

    int-to-float v1, v15

    mul-float/2addr v1, v13

    add-float/2addr v0, v1

    div-int/lit8 v1, v17, 0x2

    int-to-float v1, v1

    sub-float v18, v0, v1

    .line 576
    add-int v0, v11, v7

    const/16 v1, 0x10

    invoke-static {v1}, Lhuawei/widget/HwSeekBar;->dip2px(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int v0, v0, v16

    int-to-float v1, v0

    move/from16 v19, v1

    .line 577
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    move/from16 v3, v18

    move/from16 v4, v19

    invoke-virtual {v2, v0, v3, v4, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 567
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 579
    :cond_1
    goto :goto_3

    .line 580
    :cond_2
    const/4 v14, 0x1

    :goto_2
    if-ge v14, v10, :cond_3

    .line 581
    int-to-float v0, v12

    int-to-float v1, v14

    mul-float/2addr v1, v13

    add-float/2addr v0, v1

    div-int/lit8 v1, v6, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    int-to-float v1, v11

    move-object/from16 v2, p0

    iget-object v2, v2, Lhuawei/widget/HwSeekBar;->mPaintCircle:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    invoke-virtual {v3, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 580
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 586
    :cond_3
    :goto_3
    return-void
.end method

.method private static drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 6

    .line 610
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 611
    move-object v0, p0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 614
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 615
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 616
    invoke-virtual {v5}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 617
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 618
    return-object v4

    .line 619
    :catch_0
    move-exception v4

    .line 620
    const/4 v0, 0x0

    return-object v0
.end method

.method private getScale()F
    .locals 3

    .line 531
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getMax()I

    move-result v2

    .line 532
    if-lez v2, :cond_0

    iget v0, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    int-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getTextHeight(Ljava/lang/String;)I
    .locals 4

    .line 602
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 603
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lhuawei/widget/HwSeekBar;->mTempRect:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 604
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0

    .line 606
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private getTextWidth(Ljava/lang/String;)I
    .locals 4

    .line 594
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 595
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lhuawei/widget/HwSeekBar;->mTempRect:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 596
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0

    .line 598
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private initTip()V
    .locals 6

    .line 282
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lhuawei/widget/HwSeekBar;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    .line 283
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTipTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 284
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTipTextSize:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 285
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 286
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mTipBgId:I

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mSingleTipBgId:I

    if-ne v0, v1, :cond_1

    .line 287
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTipBgId:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 288
    if-eqz v5, :cond_0

    .line 289
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 290
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 289
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 292
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 295
    :goto_0
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 296
    goto :goto_1

    .line 297
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 298
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 301
    :goto_1
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 302
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    const/4 v2, -0x2

    const/4 v3, -0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lhuawei/widget/HwSeekBar;->mPw:Landroid/widget/PopupWindow;

    .line 304
    return-void
.end method

.method private initialize(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 118
    iput-object p1, p0, Lhuawei/widget/HwSeekBar;->mContext:Landroid/content/Context;

    .line 119
    sget-object v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar:[I

    sget v1, Lhuawei/widget/hwseekbar/R$style;->Widget_Emui_SeekBar:I

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 121
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_showText:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    .line 122
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_stepTextSize:I

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mStepTextSize:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mStepTextSize:I

    .line 123
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_tipTextSize:I

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTipTextSize:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTipTextSize:I

    .line 124
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_bubbleTipBg:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mBubbleTipBgId:I

    .line 125
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_singleTipBg:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mSingleTipBgId:I

    .line 126
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_tipTextColor:I

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTipTextColor:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTipTextColor:I

    .line 127
    sget v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar_stepTextColor:I

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mStepTextColor:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mStepTextColor:I

    .line 128
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 130
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    if-eqz v0, :cond_0

    .line 131
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->initTip()V

    .line 132
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mBubbleTipBgId:I

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTipBgId:I

    .line 134
    :cond_0
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mScaledTouchSlop:I

    .line 135
    return-void
.end method

.method private isInScrollingContainer()Z
    .locals 2

    .line 420
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 421
    :goto_0
    if-eqz v1, :cond_1

    instance-of v0, v1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 422
    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    const/4 v0, 0x1

    return v0

    .line 425
    :cond_0
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    .line 427
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isLayoutRtl()Z
    .locals 2

    .line 632
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 633
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 635
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isRtlLayoutForHwFeature()Z
    .locals 2

    .line 643
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ur"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onHwStartTrackingTouch()V
    .locals 2

    .line 494
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    if-eqz v0, :cond_0

    .line 495
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTipBgId:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 496
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPw:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    .line 497
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->updateTip()V

    .line 500
    :cond_0
    return-void
.end method

.method private onHwStopTrackingTouch()V
    .locals 1

    .line 504
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    if-eqz v0, :cond_0

    .line 505
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPw:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 508
    :cond_0
    return-void
.end method

.method private startDrag(Landroid/view/MotionEvent;)V
    .locals 1

    .line 431
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSeekBar;->setPressed(Z)V

    .line 433
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 435
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSeekBar;->invalidate(Landroid/graphics/Rect;)V

    .line 438
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->onStartTrackingTouch()V

    .line 439
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->trackTouchEvent(Landroid/view/MotionEvent;)V

    .line 440
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->attemptClaimDrag()V

    .line 441
    return-void
.end method

.method private trackTouchEvent(Landroid/view/MotionEvent;)V
    .locals 11

    .line 444
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 445
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 446
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getWidth()I

    move-result v4

    .line 447
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v5

    .line 448
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingRight()I

    move-result v6

    .line 449
    sub-int v0, v4, v5

    sub-int v7, v0, v6

    .line 452
    const/4 v9, 0x0

    .line 455
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->isRtlLayoutForHwFeature()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 457
    sub-int v0, v4, v6

    if-le v2, v0, :cond_0

    .line 458
    const/4 v8, 0x0

    goto :goto_0

    .line 459
    :cond_0
    if-ge v2, v5, :cond_1

    .line 460
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_0

    .line 462
    :cond_1
    sub-int v0, v7, v2

    add-int/2addr v0, v5

    int-to-float v0, v0

    int-to-float v1, v7

    div-float v8, v0, v1

    .line 463
    iget v9, p0, Lhuawei/widget/HwSeekBar;->mTouchProgressOffset:F

    goto :goto_0

    .line 466
    :cond_2
    if-ge v2, v5, :cond_3

    .line 467
    const/4 v8, 0x0

    goto :goto_0

    .line 468
    :cond_3
    sub-int v0, v4, v6

    if-le v2, v0, :cond_4

    .line 469
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_0

    .line 471
    :cond_4
    sub-int v0, v2, v5

    int-to-float v0, v0

    int-to-float v1, v7

    div-float v8, v0, v1

    .line 472
    iget v9, p0, Lhuawei/widget/HwSeekBar;->mTouchProgressOffset:F

    .line 476
    :goto_0
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getMax()I

    move-result v10

    .line 477
    int-to-float v0, v10

    mul-float/2addr v0, v8

    add-float/2addr v9, v0

    .line 478
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSeekBar;->setProgress(I)V

    .line 479
    return-void
.end method

.method private updatePopWidth()V
    .locals 4

    .line 545
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 546
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 547
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->measure(II)V

    .line 548
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTvWidth:I

    .line 549
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTvHeight:I

    .line 550
    return-void
.end method

.method private updateTip()V
    .locals 9

    .line 536
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->updatePopWidth()V

    .line 537
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingRight()I

    move-result v1

    sub-int v6, v0, v1

    .line 538
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v0

    int-to-float v1, v6

    .line 539
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->isRtlLayoutForHwFeature()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->getScale()F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v2, v3, v2

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->getScale()F

    move-result v2

    :goto_0
    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    add-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mTvWidth:I

    div-int/lit8 v1, v1, 0x2

    sub-int v7, v0, v1

    .line 540
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getMeasuredHeight()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x0

    iget-object v1, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    sub-int v8, v0, v1

    .line 541
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPw:Landroid/widget/PopupWindow;

    move-object v1, p0

    move v2, v7

    move v3, v8

    iget v4, p0, Lhuawei/widget/HwSeekBar;->mTvWidth:I

    iget v5, p0, Lhuawei/widget/HwSeekBar;->mTvHeight:I

    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 542
    return-void
.end method


# virtual methods
.method drawThumb(Landroid/graphics/Canvas;)V
    .locals 4

    .line 353
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 354
    if-eqz v2, :cond_0

    .line 355
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 358
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getThumbOffset()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 359
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 360
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 362
    :cond_0
    return-void
.end method

.method drawTrack(Landroid/graphics/Canvas;)V
    .locals 4

    .line 331
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 332
    if-eqz v2, :cond_1

    .line 335
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 337
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->isRtlLayoutForHwFeature()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 339
    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    goto :goto_0

    .line 341
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 344
    :goto_0
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 345
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 347
    :cond_1
    return-void
.end method

.method protected drawableStateChanged()V
    .locals 5

    .line 188
    invoke-super {p0}, Landroid/widget/SeekBar;->drawableStateChanged()V

    .line 189
    const v2, 0x3e99999a    # 0.3f

    .line 190
    const/16 v3, 0xff

    .line 191
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 192
    if-eqz v4, :cond_1

    .line 193
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xff

    goto :goto_0

    :cond_0
    const/16 v0, 0x4c

    :goto_0
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 195
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 196
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 198
    :cond_2
    return-void
.end method

.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    monitor-enter p0

    .line 308
    :try_start_0
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetTip:Z

    if-eqz v0, :cond_1

    .line 309
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetLabelling:Z

    if-eqz v0, :cond_0

    .line 310
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 311
    const/4 v0, 0x4

    invoke-static {v0}, Lhuawei/widget/HwSeekBar;->dip2px(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 312
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSeekBar;->drawTrack(Landroid/graphics/Canvas;)V

    .line 313
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->drawCircles(Landroid/graphics/Canvas;)V

    .line 314
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSeekBar;->drawThumb(Landroid/graphics/Canvas;)V

    .line 315
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 316
    goto :goto_0

    .line 317
    :cond_0
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSeekBar;->drawTrack(Landroid/graphics/Canvas;)V

    .line 318
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->drawCircles(Landroid/graphics/Canvas;)V

    .line 319
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSeekBar;->drawThumb(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 322
    :cond_1
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSeekBar;->drawTrack(Landroid/graphics/Canvas;)V

    .line 323
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSeekBar;->drawThumb(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 325
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method onStartTrackingTouch()V
    .locals 1

    .line 262
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsDragging:Z

    .line 263
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, p0}, Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;->onStartTrackingTouch(Lhuawei/widget/HwSeekBar;)V

    .line 266
    :cond_0
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->onHwStartTrackingTouch()V

    .line 267
    return-void
.end method

.method onStopTrackingTouch()V
    .locals 1

    .line 274
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsDragging:Z

    .line 275
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, p0}, Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Lhuawei/widget/HwSeekBar;)V

    .line 278
    :cond_0
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->onHwStopTrackingTouch()V

    .line 279
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 366
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 367
    const/4 v0, 0x0

    return v0

    .line 370
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 372
    :pswitch_0
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->isInScrollingContainer()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTouchDownX:F

    goto :goto_1

    .line 375
    :cond_1
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->startDrag(Landroid/view/MotionEvent;)V

    .line 377
    goto :goto_1

    .line 380
    :pswitch_1
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsDragging:Z

    if-eqz v0, :cond_2

    .line 381
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->trackTouchEvent(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 383
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 384
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mTouchDownX:F

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mScaledTouchSlop:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 385
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->startDrag(Landroid/view/MotionEvent;)V

    .line 388
    :cond_3
    goto :goto_1

    .line 391
    :pswitch_2
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsDragging:Z

    if-eqz v0, :cond_4

    .line 392
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->trackTouchEvent(Landroid/view/MotionEvent;)V

    .line 393
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->onStopTrackingTouch()V

    .line 394
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSeekBar;->setPressed(Z)V

    goto :goto_0

    .line 398
    :cond_4
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->onStartTrackingTouch()V

    .line 399
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;->trackTouchEvent(Landroid/view/MotionEvent;)V

    .line 400
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->onStopTrackingTouch()V

    .line 405
    :goto_0
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->invalidate()V

    .line 406
    goto :goto_1

    .line 409
    :pswitch_3
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsDragging:Z

    if-eqz v0, :cond_5

    .line 410
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->onStopTrackingTouch()V

    .line 411
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSeekBar;->setPressed(Z)V

    .line 413
    :cond_5
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->invalidate()V

    .line 416
    :goto_1
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public setOnSeekBarChangeListener(Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    .line 184
    return-void
.end method

.method public declared-synchronized setProgress(I)V
    .locals 4

    monitor-enter p0

    .line 513
    :try_start_0
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetTip:Z

    if-eqz v0, :cond_0

    .line 514
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mStepValue:F

    int-to-float v1, p1

    iget v2, p0, Lhuawei/widget/HwSeekBar;->mStepValue:F

    div-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 516
    :cond_0
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    if-ne v0, p1, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    .line 517
    :goto_0
    iput p1, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    .line 518
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    invoke-super {p0, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 519
    if-eqz v3, :cond_2

    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_2

    .line 520
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mOnSeekBarChangeListener:Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    const/4 v2, 0x0

    invoke-interface {v0, p0, v1, v2}, Lhuawei/widget/HwSeekBar$OnSeekBarChangeListener;->onProgressChanged(Lhuawei/widget/HwSeekBar;IZ)V

    .line 522
    :cond_2
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    if-eqz v0, :cond_4

    .line 523
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mHasCustomTipText:Z

    if-nez v0, :cond_3

    .line 524
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mProgress:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 526
    :cond_3
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->updateTip()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 528
    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setTip(ZIZ)V
    .locals 3

    .line 209
    if-eqz p2, :cond_2

    .line 210
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetTip:Z

    .line 211
    iput-boolean p1, p0, Lhuawei/widget/HwSeekBar;->mSetLabelling:Z

    .line 212
    iput p2, p0, Lhuawei/widget/HwSeekBar;->mStepNum:I

    .line 214
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getMax()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mStepNum:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lhuawei/widget/HwSeekBar;->mStepValue:F

    .line 216
    if-eqz p3, :cond_0

    iget v0, p0, Lhuawei/widget/HwSeekBar;->mBubbleTipBgId:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mSingleTipBgId:I

    :goto_0
    iput v0, p0, Lhuawei/widget/HwSeekBar;->mTipBgId:I

    .line 217
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwseekbar/R$drawable;->hwseekbar_circle_emui:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSeekBar;->mCircleDr:Landroid/graphics/drawable/Drawable;

    .line 218
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->initTip()V

    .line 220
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintCircle:Landroid/graphics/Paint;

    .line 221
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintCircle:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 222
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    .line 223
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 224
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mStepTextColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 225
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mStepTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 226
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mPaintText:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 228
    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mSetLabelling:Z

    if-eqz v0, :cond_1

    .line 229
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 230
    const/16 v0, 0x30

    invoke-static {v0}, Lhuawei/widget/HwSeekBar;->dip2px(I)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 233
    :cond_1
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->getProgress()I

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSeekBar;->setProgress(I)V

    .line 234
    invoke-virtual {p0}, Lhuawei/widget/HwSeekBar;->invalidate()V

    .line 236
    :cond_2
    return-void
.end method

.method public setTipText(Ljava/lang/String;)V
    .locals 2

    .line 248
    iget v0, p0, Lhuawei/widget/HwSeekBar;->mTipBgId:I

    iget v1, p0, Lhuawei/widget/HwSeekBar;->mBubbleTipBgId:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mIsShowPopWindow:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 249
    iget-object v0, p0, Lhuawei/widget/HwSeekBar;->mTv:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    invoke-direct {p0}, Lhuawei/widget/HwSeekBar;->updateTip()V

    .line 252
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mHasCustomTipText:Z

    goto :goto_0

    .line 254
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSeekBar;->mHasCustomTipText:Z

    .line 256
    :goto_0
    return-void
.end method
