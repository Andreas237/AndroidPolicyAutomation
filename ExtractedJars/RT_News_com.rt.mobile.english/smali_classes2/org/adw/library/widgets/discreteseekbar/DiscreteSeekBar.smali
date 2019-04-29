.class public Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;
.super Landroid/view/View;
.source "DiscreteSeekBar.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;,
        Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;,
        Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;,
        Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_FORMATTER:Ljava/lang/String; = "%d"

.field private static final DEFAULT_THUMB_COLOR:I = -0xff6978

.field private static final FOCUSED_STATE:I = 0x101009c

.field private static final INDICATOR_DELAY_FOR_TAPS:I = 0x96

.field private static final PRESSED_STATE:I = 0x10100a7

.field private static final PROGRESS_ANIMATION_DURATION:I = 0xfa

.field private static final SEPARATION_DP:I = 0x5

.field private static final isLollipopOrGreater:Z


# instance fields
.field private mAddedTouchBounds:I

.field private mAllowTrackClick:Z

.field private mAnimationPosition:F

.field private mAnimationTarget:I

.field private mDownX:F

.field private mDragOffset:I

.field private mFloaterListener:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

.field private mFormatBuilder:Ljava/lang/StringBuilder;

.field mFormatter:Ljava/util/Formatter;

.field private mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

.field private mIndicatorFormatter:Ljava/lang/String;

.field private mIndicatorPopupEnabled:Z

.field private mInvalidateRect:Landroid/graphics/Rect;

.field private mIsDragging:Z

.field private mKeyProgressIncrement:I

.field private mMax:I

.field private mMin:I

.field private mMirrorForRtl:Z

.field private mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

.field private mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

.field private mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

.field private mRipple:Landroid/graphics/drawable/Drawable;

.field private mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

.field private mScrubberHeight:I

.field private mShowIndicatorRunnable:Ljava/lang/Runnable;

.field private mTempRect:Landroid/graphics/Rect;

.field private mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

.field private mTouchSlop:F

.field private mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

.field private mTrackHeight:I

.field private mValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 124
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isLollipopOrGreater:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 169
    invoke-direct {p0, p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 173
    sget v0, Lorg/adw/library/widgets/discreteseekbar/R$attr;->discreteSeekBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v0, p0

    .line 177
    invoke-direct/range {p0 .. p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x1

    .line 146
    iput v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mKeyProgressIncrement:I

    const/4 v2, 0x0

    .line 147
    iput-boolean v2, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMirrorForRtl:Z

    .line 148
    iput-boolean v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAllowTrackClick:Z

    .line 149
    iput-boolean v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorPopupEnabled:Z

    .line 159
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    .line 160
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTempRect:Landroid/graphics/Rect;

    .line 961
    new-instance v3, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$2;

    invoke-direct {v3, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$2;-><init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V

    iput-object v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mShowIndicatorRunnable:Ljava/lang/Runnable;

    .line 984
    new-instance v3, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$3;

    invoke-direct {v3, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$3;-><init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V

    iput-object v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFloaterListener:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    .line 178
    invoke-virtual {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setFocusable(Z)V

    .line 179
    invoke-virtual {v0, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setWillNotDraw(Z)V

    .line 181
    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    int-to-float v3, v3

    iput v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTouchSlop:F

    .line 182
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 184
    sget-object v4, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar:[I

    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$style;->Widget_DiscreteSeekBar:I

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    invoke-virtual {v7, v8, v4, v9, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 190
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_mirrorForRtl:I

    iget-boolean v6, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMirrorForRtl:Z

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMirrorForRtl:Z

    .line 191
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_allowTrackClickToDrag:I

    iget-boolean v6, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAllowTrackClick:Z

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAllowTrackClick:Z

    .line 192
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_indicatorPopupEnabled:I

    iget-boolean v6, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorPopupEnabled:Z

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorPopupEnabled:Z

    .line 193
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_trackHeight:I

    const/high16 v6, 0x3f800000    # 1.0f

    mul-float/2addr v6, v3

    float-to-int v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrackHeight:I

    .line 194
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_scrubberHeight:I

    const/high16 v6, 0x40800000    # 4.0f

    mul-float/2addr v6, v3

    float-to-int v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubberHeight:I

    .line 195
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_thumbSize:I

    const/high16 v6, 0x41400000    # 12.0f

    mul-float/2addr v6, v3

    float-to-int v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    .line 196
    sget v5, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_indicatorSeparation:I

    const/high16 v6, 0x40a00000    # 5.0f

    mul-float/2addr v6, v3

    float-to-int v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    const/high16 v6, 0x42000000    # 32.0f

    mul-float/2addr v3, v6

    float-to-int v3, v3

    sub-int/2addr v3, v11

    .line 201
    div-int/lit8 v3, v3, 0x2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    .line 203
    sget v3, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_max:I

    .line 204
    sget v6, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_min:I

    .line 205
    sget v10, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_value:I

    .line 206
    new-instance v12, Landroid/util/TypedValue;

    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 208
    invoke-virtual {v4, v3, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v13

    const/4 v14, 0x5

    const/16 v15, 0x64

    if-eqz v13, :cond_1

    .line 209
    iget v13, v12, Landroid/util/TypedValue;->type:I

    if-ne v13, v14, :cond_0

    .line 210
    invoke-virtual {v4, v3, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v15

    goto :goto_0

    .line 212
    :cond_0
    invoke-virtual {v4, v3, v15}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v15

    .line 215
    :cond_1
    :goto_0
    invoke-virtual {v4, v6, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 216
    iget v3, v12, Landroid/util/TypedValue;->type:I

    if-ne v3, v14, :cond_2

    .line 217
    invoke-virtual {v4, v6, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    goto :goto_1

    .line 219
    :cond_2
    invoke-virtual {v4, v6, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    goto :goto_1

    :cond_3
    move v3, v2

    .line 222
    :goto_1
    invoke-virtual {v4, v10, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 223
    iget v6, v12, Landroid/util/TypedValue;->type:I

    if-ne v6, v14, :cond_4

    .line 224
    invoke-virtual {v4, v10, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    goto :goto_2

    .line 226
    :cond_4
    invoke-virtual {v4, v10, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    goto :goto_2

    :cond_5
    move v6, v2

    .line 230
    :goto_2
    iput v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    add-int/lit8 v10, v3, 0x1

    .line 231
    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    move-result v10

    iput v10, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    .line 232
    invoke-static {v15, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    .line 233
    invoke-direct/range {p0 .. p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateKeyboardRange()V

    .line 235
    sget v3, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_indicatorFormatter:I

    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorFormatter:Ljava/lang/String;

    .line 237
    sget v3, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_trackColor:I

    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    .line 238
    sget v6, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_progressColor:I

    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    .line 239
    sget v10, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_rippleColor:I

    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v10

    .line 240
    invoke-virtual/range {p0 .. p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v12

    if-nez v12, :cond_6

    if-nez v10, :cond_7

    .line 242
    :cond_6
    new-instance v10, Landroid/content/res/ColorStateList;

    new-array v13, v1, [[I

    new-array v14, v2, [I

    aput-object v14, v13, v2

    new-array v14, v1, [I

    const v15, -0xbbbbbc

    aput v15, v14, v2

    invoke-direct {v10, v13, v14}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    :cond_7
    if-nez v12, :cond_8

    if-nez v3, :cond_9

    .line 245
    :cond_8
    new-instance v3, Landroid/content/res/ColorStateList;

    new-array v13, v1, [[I

    new-array v14, v2, [I

    aput-object v14, v13, v2

    new-array v14, v1, [I

    const v15, -0x777778

    aput v15, v14, v2

    invoke-direct {v3, v13, v14}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    :cond_9
    if-nez v12, :cond_a

    if-nez v6, :cond_b

    .line 248
    :cond_a
    new-instance v6, Landroid/content/res/ColorStateList;

    new-array v13, v1, [[I

    new-array v14, v2, [I

    aput-object v14, v13, v2

    new-array v1, v1, [I

    const v14, -0xff6978

    aput v14, v1, v2

    invoke-direct {v6, v13, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 251
    :cond_b
    invoke-static {v10}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->getRipple(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    .line 252
    sget-boolean v1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isLollipopOrGreater:Z

    if-eqz v1, :cond_c

    .line 253
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 255
    :cond_c
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 258
    :goto_3
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-direct {v1, v3}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;-><init>(Landroid/content/res/ColorStateList;)V

    .line 259
    iput-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    .line 260
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 262
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-direct {v1, v6}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;-><init>(Landroid/content/res/ColorStateList;)V

    .line 263
    iput-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    .line 264
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 266
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-direct {v1, v6, v11}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;-><init>(Landroid/content/res/ColorStateList;I)V

    iput-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    .line 267
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 268
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    iget-object v3, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v3}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicWidth()I

    move-result v3

    iget-object v6, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v6}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicHeight()I

    move-result v6

    invoke-virtual {v1, v2, v2, v3, v6}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setBounds(IIII)V

    if-nez v12, :cond_d

    .line 272
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget v2, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    invoke-direct {v0, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->convertValueToMessage(I)Ljava/lang/String;

    move-result-object v10

    iget v2, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    add-int/2addr v2, v11

    add-int v12, v2, v5

    move-object v6, v1

    invoke-direct/range {v6 .. v12}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;II)V

    iput-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    .line 274
    iget-object v1, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget-object v2, v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFloaterListener:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    invoke-virtual {v1, v2}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->setListener(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;)V

    .line 276
    :cond_d
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 278
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;-><init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;)V

    invoke-virtual {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setNumericTransformer(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;)V

    return-void
.end method

.method static synthetic access$100(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->showFloater()V

    return-void
.end method

.method static synthetic access$200(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;
    .locals 0

    .line 52
    iget-object p0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    return-object p0
.end method

.method private attemptClaimDrag()V
    .locals 2

    .line 955
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 957
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method private convertValueToMessage(I)Ljava/lang/String;
    .locals 5

    .line 678
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorFormatter:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorFormatter:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, "%d"

    .line 687
    :goto_0
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatter:Ljava/util/Formatter;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatter:Ljava/util/Formatter;

    invoke-virtual {v1}, Ljava/util/Formatter;->locale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 696
    :cond_1
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_3

    .line 688
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v1, v3

    .line 689
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatBuilder:Ljava/lang/StringBuilder;

    if-nez v3, :cond_3

    .line 690
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatBuilder:Ljava/lang/StringBuilder;

    goto :goto_2

    .line 692
    :cond_3
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 694
    :goto_2
    new-instance v1, Ljava/util/Formatter;

    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatBuilder:Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatter:Ljava/util/Formatter;

    .line 698
    :goto_3
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mFormatter:Ljava/util/Formatter;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-virtual {v1, v0, v3}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getAnimatedProgress()I
    .locals 1

    .line 804
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isAnimationRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getAnimationTarget()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    :goto_0
    return v0
.end method

.method private getAnimationTarget()I
    .locals 1

    .line 839
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAnimationTarget:I

    return v0
.end method

.method private hideFloater()V
    .locals 1

    .line 977
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mShowIndicatorRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 978
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 979
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->dismiss()V

    const/4 v0, 0x0

    .line 980
    invoke-direct {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->notifyBubble(Z)V

    :cond_0
    return-void
.end method

.method private isDragging()Z
    .locals 1

    .line 769
    iget-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    return v0
.end method

.method private isInScrollingContainer()Z
    .locals 1

    .line 737
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-static {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->isInScrollingContainer(Landroid/view/ViewParent;)Z

    move-result v0

    return v0
.end method

.method private notifyBubble(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 532
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->onShowBubble()V

    goto :goto_0

    .line 534
    :cond_0
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->onHideBubble()V

    :goto_0
    return-void
.end method

.method private notifyProgress(IZ)V
    .locals 1

    .line 524
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    if-eqz v0, :cond_0

    .line 525
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    invoke-interface {v0, p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;->onProgressChanged(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;IZ)V

    .line 527
    :cond_0
    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->onValueChanged(I)V

    return-void
.end method

.method private setHotspot(FF)V
    .locals 1

    .line 946
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1, p2}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setHotspot(Landroid/graphics/drawable/Drawable;FF)V

    return-void
.end method

.method private setProgress(IZ)V
    .locals 2

    .line 389
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 390
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isAnimationRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;->cancel()V

    .line 394
    :cond_0
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    if-eq v0, p1, :cond_1

    .line 395
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    .line 396
    invoke-direct {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->notifyProgress(IZ)V

    .line 397
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateProgressMessage(I)V

    .line 398
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateThumbPosFromCurrentProgress()V

    :cond_1
    return-void
.end method

.method private showFloater()V
    .locals 2

    .line 969
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 970
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->animateToPressed()V

    .line 971
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->showIndicator(Landroid/view/View;Landroid/graphics/Rect;)V

    const/4 v0, 0x1

    .line 972
    invoke-direct {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->notifyBubble(Z)V

    :cond_0
    return-void
.end method

.method private startDragging(Landroid/view/MotionEvent;Z)Z
    .locals 3

    .line 741
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTempRect:Landroid/graphics/Rect;

    .line 742
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 744
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v1, v1

    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->inset(II)V

    .line 745
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    iput-boolean v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    .line 746
    iget-boolean v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAllowTrackClick:Z

    if-eqz v1, :cond_0

    if-nez p2, :cond_0

    .line 749
    iput-boolean v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    .line 750
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    sub-int/2addr p2, v1

    iput p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mDragOffset:I

    .line 751
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateDragging(Landroid/view/MotionEvent;)V

    .line 753
    iget-object p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {p2, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 754
    iget p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int p2, p2

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v1, v1

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Rect;->inset(II)V

    .line 756
    :cond_0
    iget-boolean p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    if-eqz p2, :cond_1

    .line 757
    invoke-virtual {p0, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setPressed(Z)V

    .line 758
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->attemptClaimDrag()V

    .line 759
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, p2, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setHotspot(FF)V

    .line 760
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget p2, v0, Landroid/graphics/Rect;->left:I

    int-to-float p2, p2

    sub-float/2addr p1, p2

    iget p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    int-to-float p2, p2

    sub-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mDragOffset:I

    .line 761
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    if-eqz p1, :cond_1

    .line 762
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    invoke-interface {p1, p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;->onStartTrackingTouch(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V

    .line 765
    :cond_1
    iget-boolean p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    return p1
.end method

.method private stopDragging()V
    .locals 1

    .line 773
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    if-eqz v0, :cond_0

    .line 774
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    invoke-interface {v0, p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;->onStopTrackingTouch(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V

    :cond_0
    const/4 v0, 0x0

    .line 776
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIsDragging:Z

    .line 777
    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setPressed(Z)V

    return-void
.end method

.method private updateDragging(Landroid/view/MotionEvent;)V
    .locals 5

    .line 854
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setHotspot(FF)V

    .line 855
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    .line 856
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 857
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 858
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    .line 859
    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mDragOffset:I

    sub-int/2addr p1, v2

    add-int/2addr p1, v0

    .line 860
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingLeft()I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    .line 861
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v0

    add-int/2addr v4, v1

    sub-int v0, v3, v4

    if-ge p1, v2, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    if-le p1, v0, :cond_1

    move p1, v0

    :cond_1
    :goto_0
    sub-int/2addr v0, v2

    sub-int/2addr p1, v2

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 870
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isRtl()Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p1, v0, p1

    .line 873
    :cond_2
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr p1, v0

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 v0, 0x1

    .line 874
    invoke-direct {p0, p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(IZ)V

    return-void
.end method

.method private updateFromDrawableState()V
    .locals 8

    .line 643
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getDrawableState()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 646
    array-length v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v1, v2, :cond_2

    aget v5, v0, v1

    const v6, 0x101009c

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    move v3, v7

    goto :goto_1

    :cond_0
    const v6, 0x10100a7

    if-ne v5, v6, :cond_1

    move v4, v7

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 653
    :cond_2
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_4

    if-nez v3, :cond_3

    if-eqz v4, :cond_4

    :cond_3
    iget-boolean v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorPopupEnabled:Z

    if-eqz v1, :cond_4

    .line 656
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mShowIndicatorRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 657
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mShowIndicatorRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x96

    invoke-virtual {p0, v1, v2, v3}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    .line 659
    :cond_4
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->hideFloater()V

    .line 661
    :goto_2
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setState([I)Z

    .line 662
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setState([I)Z

    .line 663
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setState([I)Z

    .line 664
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    return-void
.end method

.method private updateIndicatorSizes()V
    .locals 3

    .line 513
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    .line 514
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;->useStringTransform()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 515
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    invoke-virtual {v1, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;->transformToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->updateSizes(Ljava/lang/String;)V

    goto :goto_0

    .line 517
    :cond_0
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    invoke-virtual {v1, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;->transform(I)I

    move-result v1

    invoke-direct {p0, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->convertValueToMessage(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->updateSizes(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private updateKeyboardRange()V
    .locals 3

    .line 569
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    sub-int/2addr v0, v1

    .line 570
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mKeyProgressIncrement:I

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mKeyProgressIncrement:I

    div-int v1, v0, v1

    const/16 v2, 0x14

    if-le v1, v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    int-to-float v0, v0

    const/high16 v2, 0x41a00000    # 20.0f

    div-float/2addr v0, v2

    .line 573
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mKeyProgressIncrement:I

    :cond_1
    return-void
.end method

.method private updateProgressFromAnimation(F)V
    .locals 5

    .line 878
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 879
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 880
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    .line 881
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingLeft()I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    .line 882
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v0

    add-int/2addr v4, v1

    sub-int/2addr v3, v4

    sub-int/2addr v3, v2

    .line 884
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 887
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getProgress()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 888
    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    .line 889
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->notifyProgress(IZ)V

    .line 890
    invoke-direct {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateProgressMessage(I)V

    :cond_0
    int-to-float v0, v3

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 893
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateThumbPos(I)V

    return-void
.end method

.method private updateProgressMessage(I)V
    .locals 2

    .line 668
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    .line 669
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;->useStringTransform()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 670
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    invoke-virtual {v1, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;->transformToString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->setValue(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 672
    :cond_0
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    invoke-virtual {v1, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;->transform(I)I

    move-result p1

    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->convertValueToMessage(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->setValue(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private updateThumbPos(I)V
    .locals 6

    .line 912
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicWidth()I

    move-result v0

    .line 913
    div-int/lit8 v1, v0, 0x2

    .line 915
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isRtl()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 916
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    sub-int/2addr v2, v3

    sub-int p1, v2, p1

    sub-int/2addr p1, v0

    goto :goto_0

    .line 919
    :cond_0
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    add-int/2addr v2, v3

    add-int/2addr p1, v2

    .line 922
    :goto_0
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    iget-object v4, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    invoke-virtual {v3, v4}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 923
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    iget-object v4, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, p1

    iget-object v5, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v3, p1, v4, v0, v5}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setBounds(IIII)V

    .line 924
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isRtl()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 925
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 926
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    add-int/2addr p1, v1

    iput p1, v0, Landroid/graphics/Rect;->left:I

    goto :goto_1

    .line 928
    :cond_1
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    add-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 929
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    add-int/2addr p1, v1

    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 931
    :goto_1
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTempRect:Landroid/graphics/Rect;

    .line 932
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 933
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    .line 934
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->move(I)V

    .line 937
    :cond_2
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v1, v1

    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->inset(II)V

    .line 938
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v0, v0

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    neg-int v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Rect;->inset(II)V

    .line 939
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 940
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->top:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v1, v2, v3, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->setHotspotBounds(Landroid/graphics/drawable/Drawable;IIII)V

    .line 941
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mInvalidateRect:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method private updateThumbPosFromCurrentProgress()V
    .locals 6

    .line 897
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicWidth()I

    move-result v0

    .line 898
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    .line 899
    div-int/lit8 v0, v0, 0x2

    .line 900
    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    iget v4, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 903
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingLeft()I

    move-result v3

    add-int/2addr v3, v0

    add-int/2addr v3, v1

    .line 904
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v0

    add-int/2addr v5, v1

    sub-int/2addr v4, v5

    sub-int/2addr v4, v3

    int-to-float v0, v4

    mul-float/2addr v2, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v2, v0

    float-to-int v0, v2

    .line 908
    invoke-direct {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateThumbPos(I)V

    return-void
.end method


# virtual methods
.method animateSetProgress(I)V
    .locals 2

    .line 813
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isAnimationRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getAnimationPosition()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getProgress()I

    move-result v0

    int-to-float v0, v0

    .line 815
    :goto_0
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    if-ge p1, v1, :cond_1

    .line 816
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    goto :goto_1

    .line 817
    :cond_1
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    if-le p1, v1, :cond_2

    .line 818
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    .line 822
    :cond_2
    :goto_1
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    if-eqz v1, :cond_3

    .line 823
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    invoke-virtual {v1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;->cancel()V

    .line 826
    :cond_3
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAnimationTarget:I

    int-to-float p1, p1

    .line 827
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;

    invoke-direct {v1, p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;-><init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V

    invoke-static {v0, p1, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;->create(FFLorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    move-result-object p1

    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    .line 834
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    const/16 v0, 0xfa

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;->setDuration(I)V

    .line 835
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    invoke-virtual {p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;->start()V

    return-void
.end method

.method protected drawableStateChanged()V
    .locals 0

    .line 638
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 639
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateFromDrawableState()V

    return-void
.end method

.method getAnimationPosition()F
    .locals 1

    .line 849
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAnimationPosition:F

    return v0
.end method

.method public getMax()I
    .locals 1

    .line 345
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    return v0
.end method

.method public getMin()I
    .locals 1

    .line 373
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    return v0
.end method

.method public getNumericTransformer()Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;
    .locals 1

    .line 314
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    return-object v0
.end method

.method public getProgress()I
    .locals 1

    .line 408
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    return v0
.end method

.method isAnimationRunning()Z
    .locals 1

    .line 809
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPositionAnimator:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRtl()Z
    .locals 2

    .line 1007
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMirrorForRtl:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 999
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 1000
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mShowIndicatorRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1001
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1002
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->dismissComplete()V

    :cond_0
    return-void
.end method

.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    monitor-enter p0

    .line 627
    :try_start_0
    sget-boolean v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isLollipopOrGreater:Z

    if-nez v0, :cond_0

    .line 628
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 630
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 631
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 632
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 633
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 634
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 626
    monitor-exit p0

    throw p1
.end method

.method protected onHideBubble()V
    .locals 0

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 784
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 785
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getAnimatedProgress()I

    move-result v0

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 794
    :pswitch_0
    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    if-lt v0, v3, :cond_0

    goto :goto_0

    .line 795
    :cond_0
    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mKeyProgressIncrement:I

    add-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->animateSetProgress(I)V

    goto :goto_0

    .line 789
    :pswitch_1
    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    if-gt v0, v3, :cond_1

    goto :goto_0

    .line 790
    :cond_1
    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mKeyProgressIncrement:I

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->animateSetProgress(I)V

    :goto_0
    move v0, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v1

    :goto_2
    if-nez v0, :cond_3

    .line 800
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    move v1, v2

    :cond_4
    return v1

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 588
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    if-eqz p1, :cond_1

    .line 590
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mShowIndicatorRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 591
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInEditMode()Z

    move-result p1

    if-nez p1, :cond_0

    .line 592
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {p1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->dismissComplete()V

    .line 594
    :cond_0
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateFromDrawableState()V

    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 580
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 581
    iget-object p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {p2}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicHeight()I

    move-result p2

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    .line 582
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    .line 583
    invoke-virtual {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 1022
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1027
    :cond_0
    check-cast p1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    .line 1028
    invoke-static {p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->access$500(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;)I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setMin(I)V

    .line 1029
    invoke-static {p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->access$400(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;)I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setMax(I)V

    .line 1030
    invoke-static {p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->access$300(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;)I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(IZ)V

    .line 1031
    invoke-virtual {p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->getSuperState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1023
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1012
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1013
    new-instance v1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    invoke-direct {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;-><init>(Landroid/os/Parcelable;)V

    .line 1014
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getProgress()I

    move-result v0

    invoke-static {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->access$302(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;I)I

    .line 1015
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    invoke-static {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->access$402(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;I)I

    .line 1016
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    invoke-static {v1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;->access$502(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;I)I

    return-object v1
.end method

.method protected onShowBubble()V
    .locals 0

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    .line 605
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 606
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicWidth()I

    move-result p1

    .line 607
    iget-object p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {p2}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getIntrinsicHeight()I

    move-result p2

    .line 608
    iget p3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAddedTouchBounds:I

    .line 609
    div-int/lit8 p4, p1, 0x2

    .line 610
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingLeft()I

    move-result v0

    add-int/2addr v0, p3

    .line 611
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingRight()I

    move-result v1

    .line 612
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, p3

    .line 613
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    sub-int p2, v2, p2

    add-int/2addr p1, v0

    invoke-virtual {v3, v0, p2, p1, v2}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setBounds(IIII)V

    .line 614
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrackHeight:I

    const/4 p2, 0x2

    div-int/2addr p1, p2

    const/4 v3, 0x1

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 615
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    add-int/2addr v0, p4

    sub-int/2addr v2, p4

    sub-int v4, v2, p1

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getWidth()I

    move-result v5

    sub-int/2addr v5, p4

    sub-int/2addr v5, v1

    sub-int/2addr v5, p3

    add-int/2addr p1, v2

    invoke-virtual {v3, v0, v4, v5, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setBounds(IIII)V

    .line 617
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubberHeight:I

    div-int/2addr p1, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 618
    iget-object p2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    sub-int p3, v2, p1

    add-int/2addr v2, p1

    invoke-virtual {p2, v0, p3, v0, v2}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setBounds(IIII)V

    .line 622
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateThumbPosFromCurrentProgress()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 703
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 706
    :cond_0
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 730
    :pswitch_0
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->stopDragging()V

    goto :goto_0

    .line 713
    :pswitch_1
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isDragging()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 714
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateDragging(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 716
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 717
    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mDownX:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTouchSlop:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 718
    invoke-direct {p0, p1, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->startDragging(Landroid/view/MotionEvent;Z)Z

    goto :goto_0

    .line 723
    :pswitch_2
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isDragging()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAllowTrackClick:Z

    if-eqz v0, :cond_2

    .line 724
    invoke-direct {p0, p1, v1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->startDragging(Landroid/view/MotionEvent;Z)Z

    .line 725
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateDragging(Landroid/view/MotionEvent;)V

    .line 727
    :cond_2
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->stopDragging()V

    goto :goto_0

    .line 709
    :pswitch_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mDownX:F

    .line 710
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->isInScrollingContainer()Z

    move-result v0

    invoke-direct {p0, p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->startDragging(Landroid/view/MotionEvent;Z)Z

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onValueChanged(I)V
    .locals 0

    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 600
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    return-void
.end method

.method setAnimationPosition(F)V
    .locals 2

    .line 843
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mAnimationPosition:F

    .line 844
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 845
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateProgressFromAnimation(F)V

    return-void
.end method

.method public setIndicatorFormatter(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 290
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorFormatter:Ljava/lang/String;

    .line 291
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateProgressMessage(I)V

    return-void
.end method

.method public setIndicatorPopupEnabled(Z)V
    .locals 0

    .line 509
    iput-boolean p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicatorPopupEnabled:Z

    return-void
.end method

.method public setMax(I)V
    .locals 1

    .line 331
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    .line 332
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    if-ge p1, v0, :cond_0

    .line 333
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setMin(I)V

    .line 335
    :cond_0
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateKeyboardRange()V

    .line 337
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    if-lt p1, v0, :cond_1

    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    if-le p1, v0, :cond_2

    .line 338
    :cond_1
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    .line 341
    :cond_2
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateIndicatorSizes()V

    return-void
.end method

.method public setMin(I)V
    .locals 1

    .line 361
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    .line 362
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    if-le p1, v0, :cond_0

    .line 363
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setMax(I)V

    .line 365
    :cond_0
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateKeyboardRange()V

    .line 367
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    if-lt p1, v0, :cond_1

    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMax:I

    if-le p1, v0, :cond_2

    .line 368
    :cond_1
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mMin:I

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    :cond_2
    return-void
.end method

.method public setNumericTransformer(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;)V
    .locals 1
    .param p1    # Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    goto :goto_0

    .line 301
    :cond_0
    new-instance p1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;-><init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;)V

    :goto_0
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mNumericTransformer:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;

    .line 303
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateIndicatorSizes()V

    .line 304
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mValue:I

    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->updateProgressMessage(I)V

    return-void
.end method

.method public setOnProgressChangeListener(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;)V
    .locals 0
    .param p1    # Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 419
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mPublicChangeListener:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$OnProgressChangeListener;

    return-void
.end method

.method public setProgress(I)V
    .locals 1

    const/4 v0, 0x0

    .line 385
    invoke-direct {p0, p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(IZ)V

    return-void
.end method

.method public setRippleColor(I)V
    .locals 5

    .line 474
    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    new-array v2, v1, [[I

    const/4 v3, 0x0

    new-array v4, v3, [I

    aput-object v4, v2, v3

    new-array v1, v1, [I

    aput p1, v1, v3

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setRippleColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 483
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->setRippleColor(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setScrubberColor(I)V
    .locals 1

    .line 456
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setColorStateList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setScrubberColor(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 465
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setColorStateList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setThumbColor(II)V
    .locals 2

    .line 431
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setColorStateList(Landroid/content/res/ColorStateList;)V

    .line 432
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {v0, p2, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->setColors(II)V

    return-void
.end method

.method public setThumbColor(Landroid/content/res/ColorStateList;I)V
    .locals 3
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 444
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->setColorStateList(Landroid/content/res/ColorStateList;)V

    const/4 v0, 0x1

    .line 446
    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100a7

    aput v2, v0, v1

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 447
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mIndicator:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {v0, p2, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->setColors(II)V

    return-void
.end method

.method public setTrackColor(I)V
    .locals 1

    .line 492
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setColorStateList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTrackColor(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 501
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->setColorStateList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 951
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mThumb:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mTrack:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mScrubber:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->mRipple:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
