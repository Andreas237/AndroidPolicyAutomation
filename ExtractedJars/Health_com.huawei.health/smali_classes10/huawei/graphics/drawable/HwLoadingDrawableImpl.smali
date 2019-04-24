.class public Lhuawei/graphics/drawable/HwLoadingDrawableImpl;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field private static final ALPHA_BASIC:I = 0x7f

.field private static final ALPHA_FULL:I = 0xff

.field private static final ALPHA_INIT:I = 0x80

.field private static final ANGLE:I = 0x1e

.field private static final ANGLE_TIMES:I = 0xc

.field private static final CANVAS_WHOLE_CENTRE_RATIO:F = 2.0f

.field private static final CANVAS_WHOLE_RADIUS_RATIO:F = 0.6944444f

.field private static final DEFAULT_COLOR:I = -0x99999a

.field private static final DURATION:I = 0x3e8

.field private static final INIT_NUM:F = 0.0f

.field private static final INTERPOLATOR_PARAM_1:F = 0.33f

.field private static final INTERPOLATOR_PARAM_2:F = 0.0f

.field private static final INTERPOLATOR_PARAM_3:F = 0.67f

.field private static final INTERPOLATOR_PARAM_4:F = 1.0f

.field private static final MAX_BITMAP_SIZE:I = 0xfa

.field private static final MAX_DELTA_RADIUS:I = 0x1

.field private static final MIN_DELTA_RADIUS:I = 0x0

.field private static final RESET_FRAME:F = 0.0f

.field private static final TAG:Ljava/lang/String; = "HwLoadingDrawable"

.field private static final TIME_DIFFERENCE:I = 0x5

.field private static final TIME_STAMP:F = 60.0f

.field private static final TIME_STAMP_1:F = 0.0f

.field private static final TIME_STAMP_2:F = 10.0f

.field private static final TIME_STAMP_3:F = 33.076923f

.field private static final TIME_STAMP_4:F = 60.0f

.field private static final TIME_STAMP_TMP:F = 23.076923f

.field private static final TOTAL_ANGLE:I = 0x168

.field private static final TOTAL_FRAMES_PER_PERIOD:I = 0x3c

.field private static final WHOLE_CENTRE_X_INIT:F = 0.0f

.field private static final WHOLE_CENTRE_Y_INIT:F = 0.0f

.field private static final WHOLE_DETAIL_CENTRE_RATIO:F = 2.0f

.field private static final WHOLE_DETAIL_RADIUS_RATIO:F = 0.1f

.field private static final WHOLE_RADIUS_INIT:F = 0.0f


# instance fields
.field private mAlpha:I

.field private mAnimator:Landroid/animation/ObjectAnimator;

.field private mColor:I

.field private mDeltaRadius:D

.field private mDetailCenterX:F

.field private mDetailCenterY:F

.field private mDetailRadius:F

.field private mFrame:F

.field private mFrameTmp:F

.field private mPaint:Landroid/graphics/Paint;

.field private mPathInterpolator:Landroid/view/animation/Interpolator;

.field private mProgress:F

.field private mWholeCenterX:F

.field private mWholeCenterY:F

.field private mWholeRadius:F


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;I)V
    .locals 1

    .line 141
    const v0, -0x99999a

    invoke-direct {p0, p1, p2, v0}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;-><init>(Landroid/content/res/Resources;II)V

    .line 142
    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;II)V
    .locals 5

    .line 145
    .line 146
    const/16 v0, 0xfa

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 147
    const/16 v1, 0xfa

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 146
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 145
    invoke-direct {p0, p1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mProgress:F

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeRadius:F

    .line 130
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mFrame:F

    .line 131
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mFrame:F

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mFrameTmp:F

    .line 136
    new-instance v0, Lo/flf;

    const v1, 0x3ea8f5c3    # 0.33f

    const/4 v2, 0x0

    const v3, 0x3f2b851f    # 0.67f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Lo/flf;-><init>(FFFF)V

    iput-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPathInterpolator:Landroid/view/animation/Interpolator;

    .line 149
    invoke-direct {p0, p3}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->init(I)V

    .line 151
    return-void
.end method

.method private calculateDeltaRadiusOrAlpha(FZ)D
    .locals 4

    .line 251
    const/high16 v0, 0x42700000    # 60.0f

    rem-float/2addr p1, v0

    .line 252
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDeltaRadius:D

    .line 253
    const/16 v0, 0x80

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAlpha:I

    .line 254
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 256
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPathInterpolator:Landroid/view/animation/Interpolator;

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v1, p1

    invoke-interface {v0, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDeltaRadius:D

    goto :goto_0

    .line 258
    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    const v0, 0x42044ec5

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 260
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPathInterpolator:Landroid/view/animation/Interpolator;

    const v1, -0x42ce81b5

    mul-float/2addr v1, p1

    const v2, 0x3fb77778

    add-float/2addr v1, v2

    invoke-interface {v0, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDeltaRadius:D

    goto :goto_0

    .line 262
    :cond_1
    const v0, 0x42044ec5

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_2

    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    .line 263
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDeltaRadius:D

    .line 265
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 266
    iget-wide v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDeltaRadius:D

    return-wide v0

    .line 268
    :cond_3
    iget-wide v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDeltaRadius:D

    iget v2, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAlpha:I

    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAlpha:I

    .line 269
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAlpha:I

    int-to-double v0, v0

    return-wide v0
.end method

.method private getHalfCanvasWidthHeightMin(Landroid/graphics/Canvas;)F
    .locals 2

    .line 200
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterX:F

    .line 201
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterY:F

    .line 202
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterX:F

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterY:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterX:F

    goto :goto_0

    :cond_0
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterY:F

    :goto_0
    return v0
.end method

.method private init(I)V
    .locals 3

    .line 154
    const-string v0, "progress"

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    .line 155
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 156
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 157
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 160
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPaint:Landroid/graphics/Paint;

    .line 162
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterX:F

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterY:F

    .line 164
    iput p1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mColor:I

    .line 165
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 170
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->setProgress(F)V

    .line 171
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private setProgress(F)V
    .locals 0

    .line 275
    iput p1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mProgress:F

    .line 276
    invoke-virtual {p0}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->invalidateSelf()V

    .line 277
    return-void
.end method

.method private setVariousRadius(Landroid/graphics/Canvas;)V
    .locals 2

    .line 183
    invoke-direct {p0, p1}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->getHalfCanvasWidthHeightMin(Landroid/graphics/Canvas;)F

    move-result v0

    const v1, 0x3f31c71c

    mul-float/2addr v0, v1

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeRadius:F

    .line 185
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeRadius:F

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v0, v1

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailRadius:F

    .line 187
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterX:F

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailCenterX:F

    .line 188
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterY:F

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeRadius:F

    sub-float/2addr v0, v1

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailCenterY:F

    .line 189
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 209
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 212
    invoke-direct {p0, p1}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->setVariousRadius(Landroid/graphics/Canvas;)V

    .line 214
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mProgress:F

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 215
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mProgress:F

    .line 218
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 220
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v5, v0, :cond_1

    .line 222
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mProgress:F

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    mul-int/lit8 v1, v5, 0x5

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mFrameTmp:F

    .line 223
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mFrameTmp:F

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->calculateDeltaRadiusOrAlpha(FZ)D

    move-result-wide v1

    double-to-int v1, v1

    add-int/lit8 v1, v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 224
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailCenterX:F

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailCenterY:F

    iget v2, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailRadius:F

    iget v3, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mFrameTmp:F

    .line 225
    const/4 v4, 0x1

    invoke-direct {p0, v3, v4}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->calculateDeltaRadiusOrAlpha(FZ)D

    move-result-wide v3

    double-to-float v3, v3

    iget v4, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mDetailRadius:F

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mPaint:Landroid/graphics/Paint;

    .line 224
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 226
    iget v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterX:F

    iget v1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mWholeCenterY:F

    const/high16 v2, -0x3e100000    # -30.0f

    invoke-virtual {p1, v2, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 220
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 229
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 232
    return-void
.end method

.method public isRunning()Z
    .locals 1

    .line 300
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setColor(I)V
    .locals 0

    .line 310
    iput p1, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mColor:I

    .line 311
    return-void
.end method

.method public start()V
    .locals 1

    .line 284
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 285
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 287
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1

    .line 291
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->end()V

    .line 296
    :cond_0
    return-void
.end method
