.class public Lcom/mopub/mobileads/resource/ProgressBarDrawable;
.super Lcom/mopub/mobileads/resource/BaseWidgetDrawable;
.source "ProgressBarDrawable.java"


# instance fields
.field private final mBackgroundPaint:Landroid/graphics/Paint;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mCurrentProgress:I

.field private mDuration:I

.field private mLastProgress:I

.field private final mNuggetWidth:I

.field private final mProgressPaint:Landroid/graphics/Paint;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mSkipOffset:I

.field private mSkipRatio:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0}, Lcom/mopub/mobileads/resource/BaseWidgetDrawable;-><init>()V

    .line 26
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mBackgroundPaint:Landroid/graphics/Paint;

    .line 27
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mBackgroundPaint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mBackgroundPaint:Landroid/graphics/Paint;

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 29
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mBackgroundPaint:Landroid/graphics/Paint;

    sget-object v1, Lcom/mopub/mobileads/resource/DrawableConstants$ProgressBar;->BACKGROUND_STYLE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mBackgroundPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 32
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    .line 33
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    sget v2, Lcom/mopub/mobileads/resource/DrawableConstants$ProgressBar;->PROGRESS_COLOR:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 35
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    sget-object v2, Lcom/mopub/mobileads/resource/DrawableConstants$ProgressBar;->PROGRESS_STYLE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 36
    iget-object v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v0, 0x40800000    # 4.0f

    .line 38
    invoke-static {v0, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mNuggetWidth:I

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 44
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mBackgroundPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 47
    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mCurrentProgress:I

    int-to-float v0, v0

    iget v1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mDuration:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 48
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v3, v1

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v4, v1

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    mul-float v5, v1, v0

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v0

    iget-object v7, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 55
    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipOffset:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipOffset:I

    iget v1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mDuration:I

    if-ge v0, v1, :cond_0

    .line 56
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    iget v1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipRatio:F

    mul-float v3, v0, v1

    .line 58
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v4, v0

    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mNuggetWidth:I

    int-to-float v0, v0

    add-float v5, v3, v0

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v0

    iget-object v7, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mProgressPaint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public forceCompletion()V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 101
    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mDuration:I

    iput v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mCurrentProgress:I

    return-void
.end method

.method public getCurrentProgress()I
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 115
    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mCurrentProgress:I

    return v0
.end method

.method public getSkipRatio()F
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 108
    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipRatio:F

    return v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mLastProgress:I

    return-void
.end method

.method public setDurationAndSkipOffset(II)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mDuration:I

    .line 72
    iput p2, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipOffset:I

    .line 73
    iget p1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipOffset:I

    int-to-float p1, p1

    iget p2, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mDuration:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    iput p1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mSkipRatio:F

    return-void
.end method

.method public setProgress(I)V
    .locals 4

    .line 86
    iget v0, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mLastProgress:I

    if-lt p1, v0, :cond_0

    .line 87
    iput p1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mCurrentProgress:I

    .line 88
    iput p1, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mLastProgress:I

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "Progress not monotonically increasing: last = %d, current = %d"

    const/4 v1, 0x2

    .line 90
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->mLastProgress:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->forceCompletion()V

    .line 96
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/ProgressBarDrawable;->invalidateSelf()V

    return-void
.end method
