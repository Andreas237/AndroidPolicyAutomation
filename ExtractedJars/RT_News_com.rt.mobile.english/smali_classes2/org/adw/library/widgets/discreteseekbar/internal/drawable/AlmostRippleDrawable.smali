.class public Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;
.super Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;
.source "AlmostRippleDrawable.java"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field private static final ACTIVE_SCALE:F = 1.0f

.field private static final ANIMATION_DURATION:I = 0xfa

.field private static final FRAME_DURATION:J = 0x10L

.field private static final INACTIVE_SCALE:F


# instance fields
.field private mAnimationInitialValue:F

.field private mCurrentScale:F

.field private mDisabledColor:I

.field private mDuration:I

.field private mFocusedColor:I

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mPressedColor:I

.field private mReverse:Z

.field private mRippleBgColor:I

.field private mRippleColor:I

.field private mRunning:Z

.field private mStartTime:J

.field private final mUpdater:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;-><init>(Landroid/content/res/ColorStateList;)V

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mReverse:Z

    .line 40
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRunning:Z

    const/16 v0, 0xfa

    .line 41
    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDuration:I

    .line 187
    new-instance v0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable$1;

    invoke-direct {v0, p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable$1;-><init>(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;)V

    iput-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    .line 52
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 53
    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method static synthetic access$000(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;)J
    .locals 2

    .line 30
    iget-wide v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mStartTime:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;)I
    .locals 0

    .line 30
    iget p0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDuration:I

    return p0
.end method

.method static synthetic access$200(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;)Landroid/view/animation/Interpolator;
    .locals 0

    .line 30
    iget-object p0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mInterpolator:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method static synthetic access$300(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;)Ljava/lang/Runnable;
    .locals 0

    .line 30
    iget-object p0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$400(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;F)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->updateAnimation(F)V

    return-void
.end method

.method static synthetic access$502(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRunning:Z

    return p1
.end method

.method private decreasedAlpha(I)I
    .locals 0

    mul-int/lit8 p1, p1, 0x64

    shr-int/lit8 p1, p1, 0x8

    return p1
.end method

.method private static getModulatedAlphaColor(II)I
    .locals 2

    .line 69
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    shr-int/lit8 v1, p0, 0x7

    add-int/2addr p0, v1

    mul-int/2addr v0, p0

    shr-int/lit8 p0, v0, 0x8

    .line 72
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-static {p0, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method private updateAnimation(F)V
    .locals 2

    .line 181
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mAnimationInitialValue:F

    .line 182
    iget-boolean v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mReverse:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    sub-float/2addr v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    .line 183
    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    .line 184
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method public animateToNormal()V
    .locals 7

    .line 168
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 169
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    .line 170
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mReverse:Z

    .line 171
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRunning:Z

    .line 172
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mAnimationInitialValue:F

    .line 173
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mAnimationInitialValue:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    const/high16 v2, -0x40800000    # -1.0f

    div-float/2addr v0, v2

    sub-float/2addr v1, v0

    const/high16 v0, 0x437a0000    # 250.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 174
    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDuration:I

    .line 175
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mStartTime:J

    .line 176
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    iget-wide v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mStartTime:J

    const-wide/16 v3, 0x10

    add-long v5, v1, v3

    invoke-virtual {p0, v0, v5, v6}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public animateToPressed()V
    .locals 7

    .line 155
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 156
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 157
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mReverse:Z

    const/4 v0, 0x1

    .line 158
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRunning:Z

    .line 159
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mAnimationInitialValue:F

    .line 160
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mAnimationInitialValue:F

    const/4 v2, 0x0

    sub-float/2addr v0, v2

    div-float/2addr v0, v1

    sub-float/2addr v1, v0

    const/high16 v0, 0x437a0000    # 250.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 161
    iput v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDuration:I

    .line 162
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mStartTime:J

    .line 163
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    iget-wide v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mStartTime:J

    const-wide/16 v3, 0x10

    add-long v5, v1, v3

    invoke-virtual {p0, v0, v5, v6}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public doDraw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 7

    .line 77
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 79
    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    .line 80
    iget v3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleColor:I

    .line 81
    iget v4, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleBgColor:I

    .line 82
    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    mul-float v5, v1, v2

    const/4 v6, 0x0

    cmpl-float v2, v2, v6

    if-lez v2, :cond_1

    if-eqz v4, :cond_0

    .line 86
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 87
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    invoke-direct {p0, v2}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->decreasedAlpha(I)I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 88
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1, v2, v4, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    if-eqz v3, :cond_1

    .line 91
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->modulateAlpha(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 93
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0, v5, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public isRunning()Z
    .locals 1

    .line 218
    iget-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRunning:Z

    return v0
.end method

.method public setColor(Landroid/content/res/ColorStateList;)V
    .locals 4
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 57
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    const/4 v1, 0x2

    .line 58
    new-array v2, v1, [I

    fill-array-data v2, :array_0

    invoke-virtual {p1, v2, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    iput v2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mFocusedColor:I

    .line 59
    new-array v1, v1, [I

    fill-array-data v1, :array_1

    invoke-virtual {p1, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iput v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mPressedColor:I

    const/4 v1, 0x1

    .line 60
    new-array v1, v1, [I

    const/4 v2, 0x0

    const v3, -0x101009e

    aput v3, v1, v2

    invoke-virtual {p1, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDisabledColor:I

    .line 63
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mFocusedColor:I

    const/16 v0, 0x82

    invoke-static {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->getModulatedAlphaColor(II)I

    move-result p1

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mFocusedColor:I

    .line 64
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mPressedColor:I

    invoke-static {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->getModulatedAlphaColor(II)I

    move-result p1

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mPressedColor:I

    .line 65
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDisabledColor:I

    invoke-static {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->getModulatedAlphaColor(II)I

    move-result p1

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDisabledColor:I

    return-void

    nop

    :array_0
    .array-data 4
        0x101009e
        0x101009c
    .end array-data

    :array_1
    .array-data 4
        0x101009e
        0x10100a7
    .end array-data
.end method

.method public setState([I)Z
    .locals 11

    .line 105
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 107
    array-length v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    const v5, 0x10100a7

    const/4 v6, 0x1

    if-ge v3, v2, :cond_1

    aget v7, v0, v3

    if-ne v7, v5, :cond_0

    move v4, v6

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 112
    :cond_1
    invoke-super {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;->setState([I)Z

    .line 116
    array-length v0, p1

    move v2, v1

    move v7, v2

    move v8, v7

    move v3, v6

    :goto_1
    if-ge v2, v0, :cond_5

    aget v9, p1, v2

    const v10, 0x101009c

    if-ne v9, v10, :cond_2

    move v8, v6

    goto :goto_2

    :cond_2
    if-ne v9, v5, :cond_3

    move v7, v6

    goto :goto_2

    :cond_3
    const v10, 0x101009e

    if-ne v9, v10, :cond_4

    move v3, v1

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_6

    .line 127
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mUpdater:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 128
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mDisabledColor:I

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleColor:I

    .line 129
    iput v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleBgColor:I

    const/high16 p1, 0x3f000000    # 0.5f

    .line 130
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    .line 131
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->invalidateSelf()V

    goto :goto_3

    :cond_6
    if-eqz v7, :cond_7

    .line 134
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->animateToPressed()V

    .line 135
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mPressedColor:I

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleBgColor:I

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleColor:I

    goto :goto_3

    :cond_7
    if-eqz v4, :cond_8

    .line 137
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mPressedColor:I

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleBgColor:I

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleColor:I

    .line 138
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->animateToNormal()V

    goto :goto_3

    :cond_8
    if-eqz v8, :cond_9

    .line 140
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mFocusedColor:I

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleColor:I

    .line 141
    iput v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleBgColor:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 142
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    .line 143
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->invalidateSelf()V

    goto :goto_3

    .line 145
    :cond_9
    iput v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleColor:I

    .line 146
    iput v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mRippleBgColor:I

    const/4 p1, 0x0

    .line 147
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->mCurrentScale:F

    .line 148
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->invalidateSelf()V

    :goto_3
    return v6
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
