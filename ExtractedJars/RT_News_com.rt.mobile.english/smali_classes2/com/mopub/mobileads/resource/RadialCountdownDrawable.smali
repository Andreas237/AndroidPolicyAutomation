.class public Lcom/mopub/mobileads/resource/RadialCountdownDrawable;
.super Lcom/mopub/mobileads/resource/BaseWidgetDrawable;
.source "RadialCountdownDrawable.java"


# instance fields
.field private final mArcPaint:Landroid/graphics/Paint;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mCirclePaint:Landroid/graphics/Paint;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mInitialCountdownMilliseconds:I

.field private mSecondsRemaining:I

.field private mSweepAngle:F

.field private final mTextPaint:Landroid/graphics/Paint;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mTextRect:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0}, Lcom/mopub/mobileads/resource/BaseWidgetDrawable;-><init>()V

    const/high16 v0, 0x40400000    # 3.0f

    .line 25
    invoke-static {v0, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    const/high16 v1, 0x41900000    # 18.0f

    .line 27
    invoke-static {v1, p1}, Lcom/mopub/common/util/Dips;->dipsToFloatPixels(FLandroid/content/Context;)F

    move-result p1

    .line 31
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    .line 32
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    const/16 v3, 0x80

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 34
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    sget-object v3, Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;->BACKGROUND_STYLE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 36
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 39
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    .line 40
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    const/16 v4, 0xff

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 42
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    sget-object v4, Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;->PROGRESS_STYLE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 43
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 44
    iget-object v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 47
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextPaint:Landroid/graphics/Paint;

    .line 48
    iget-object v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 49
    iget-object v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextPaint:Landroid/graphics/Paint;

    sget-object v1, Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;->TEXT_ALIGN:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 50
    iget-object v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 51
    iget-object p1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 53
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextRect:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 58
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    .line 59
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    .line 60
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v0, v0

    int-to-float v1, v1

    int-to-float v2, v2

    .line 62
    iget-object v3, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mCirclePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 64
    iget v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mSecondsRemaining:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextPaint:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mTextRect:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->drawTextWithinBounds(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Rect;Ljava/lang/String;)V

    .line 67
    new-instance v4, Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 68
    iget v6, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mSweepAngle:F

    iget-object v8, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mArcPaint:Landroid/graphics/Paint;

    const/high16 v5, -0x3d4c0000    # -90.0f

    const/4 v7, 0x0

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public getInitialCountdownMilliseconds()I
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 86
    iget v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mInitialCountdownMilliseconds:I

    return v0
.end method

.method public setInitialCountdown(I)V
    .locals 0

    .line 72
    iput p1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mInitialCountdownMilliseconds:I

    return-void
.end method

.method public updateCountdownProgress(I)V
    .locals 2

    .line 76
    iget v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mInitialCountdownMilliseconds:I

    sub-int/2addr v0, p1

    int-to-long v0, v0

    .line 77
    invoke-static {v0, v1}, Lcom/mopub/common/util/Numbers;->convertMillisecondsToSecondsRoundedUp(J)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mSecondsRemaining:I

    int-to-float p1, p1

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float/2addr v0, p1

    .line 78
    iget p1, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mInitialCountdownMilliseconds:I

    int-to-float p1, p1

    div-float/2addr v0, p1

    iput v0, p0, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->mSweepAngle:F

    .line 79
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->invalidateSelf()V

    return-void
.end method
