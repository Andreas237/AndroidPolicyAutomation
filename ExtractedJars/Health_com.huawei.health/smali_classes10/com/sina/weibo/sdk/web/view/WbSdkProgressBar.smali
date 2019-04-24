.class public Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private addStart:Z

.field private growTime:D

.field private growTimeMax:D

.field private handler:Landroid/os/Handler;

.field private lastTime:J

.field private length:F

.field private final maxLength:I

.field private final minLength:I

.field private miniSize:I

.field private padding:I

.field private paint:Landroid/graphics/Paint;

.field private paintWidth:I

.field private progress:F

.field private rect:Landroid/graphics/RectF;

.field private showView:Z

.field private speed:F

.field private stopGrowTime:J

.field private stopGrowTimeMax:J

.field stopNum:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 63
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    const/16 v0, 0x14

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->minLength:I

    .line 26
    const/16 v0, 0x12c

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->maxLength:I

    .line 28
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->lastTime:J

    .line 29
    const/high16 v0, 0x43480000    # 200.0f

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->speed:F

    .line 31
    const-wide/16 v0, 0xb4

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTimeMax:J

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTime:J

    .line 35
    const-wide v0, 0x407ea00000000000L    # 490.0

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTimeMax:D

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->addStart:Z

    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->showView:Z

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopNum:I

    .line 43
    new-instance v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar$1;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar$1;-><init>(Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->handler:Landroid/os/Handler;

    .line 64
    const/16 v0, 0x32

    invoke-direct {p0, p1, v0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->dip2px(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->miniSize:I

    .line 65
    const/4 v0, 0x5

    invoke-direct {p0, p1, v0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->dip2px(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paintWidth:I

    .line 66
    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->dip2px(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->padding:I

    .line 67
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    .line 68
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 69
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    const v1, -0xbedd

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 71
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paintWidth:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 72
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->padding:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->padding:I

    int-to-float v2, v2

    iget v3, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->miniSize:I

    iget v4, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->padding:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->miniSize:I

    iget v5, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->padding:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->rect:Landroid/graphics/RectF;

    .line 73
    return-void
.end method

.method static synthetic access$002(Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;Z)Z
    .locals 0

    .line 17
    iput-boolean p1, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->showView:Z

    return p1
.end method

.method private calculateProgress(J)V
    .locals 7

    .line 119
    iget-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTime:J

    iget-wide v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTimeMax:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    .line 121
    iget-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTime:D

    long-to-double v2, p1

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTime:D

    .line 122
    iget-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTime:D

    iget-wide v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTimeMax:D

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    .line 123
    iget-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTime:D

    iget-wide v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTimeMax:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTime:D

    .line 124
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTime:J

    .line 125
    iget-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->addStart:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->addStart:Z

    .line 128
    :cond_1
    iget-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTime:D

    iget-wide v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->growTimeMax:D

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float v4, v0, v1

    .line 129
    const/16 v5, 0x118

    .line 130
    iget-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->addStart:Z

    if-nez v0, :cond_2

    .line 131
    const/high16 v0, 0x438c0000    # 280.0f

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->length:F

    goto :goto_1

    .line 133
    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, v4

    const/high16 v1, 0x438c0000    # 280.0f

    mul-float v6, v1, v0

    .line 134
    iget v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    iget v1, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->length:F

    sub-float/2addr v1, v6

    add-float/2addr v0, v1

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    .line 135
    iput v6, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->length:F

    .line 137
    :goto_1
    goto :goto_2

    .line 139
    :cond_3
    iget-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTime:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->stopGrowTime:J

    .line 141
    :goto_2
    return-void
.end method

.method private dip2px(Landroid/content/Context;I)I
    .locals 2

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float v1, p2

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method


# virtual methods
.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    monitor-enter p0

    .line 81
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->lastTime:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x168

    rem-long v6, v0, v2

    .line 82
    iget v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->speed:F

    long-to-float v1, v6

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v8, v0, v1

    .line 83
    invoke-direct {p0, v6, v7}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->calculateProgress(J)V

    .line 84
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->lastTime:J

    .line 85
    iget v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    add-float/2addr v0, v8

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    .line 86
    iget v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    const/high16 v1, 0x43b40000    # 360.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 87
    iget v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    const/high16 v1, 0x43b40000    # 360.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    .line 89
    :cond_0
    move-object v0, p1

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->rect:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->progress:F

    const/high16 v3, 0x42b40000    # 90.0f

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->length:F

    const/high16 v4, 0x41a00000    # 20.0f

    add-float/2addr v3, v4

    iget-object v5, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 90
    iget-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->showView:Z

    if-eqz v0, :cond_2

    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 92
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->postInvalidate()V

    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->invalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 144
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 145
    iget v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->miniSize:I

    iget v1, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->miniSize:I

    invoke-virtual {p0, v0, v1}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->setMeasuredDimension(II)V

    .line 146
    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 4

    .line 105
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 106
    const/16 v0, 0x8

    if-ne p2, v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 108
    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 109
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->showView:Z

    .line 111
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->invalidate()V

    .line 113
    :cond_1
    :goto_0
    return-void
.end method

.method public setProgressColor(I)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->paint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 101
    return-void
.end method
