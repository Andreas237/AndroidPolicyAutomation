.class public Lcom/ibotta/android/view/common/ProgressCircleView;
.super Lcom/ibotta/android/commons/view/TintableImageButton;
.source "ProgressCircleView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/common/ProgressCircleView$Progress;,
        Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;
    }
.end annotation


# static fields
.field private static final START_ANGLE:F = 270.0f

.field private static final STROKE_WIDTH_PERCENTAGE:F = 0.03f


# instance fields
.field private animating:Z

.field private animationRunnable:Ljava/lang/Runnable;

.field private animationSafe:Z

.field private arcBounds:Landroid/graphics/RectF;

.field private arcInitialized:Z

.field private arcPaint:Landroid/graphics/Paint;

.field private arcSweepAngle:F

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/commons/view/TintableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animationSafe:Z

    const/4 p1, 0x0

    .line 48
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animating:Z

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/common/ProgressCircleView;)Lcom/ibotta/android/view/common/ProgressCircleView$Progress;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/view/common/ProgressCircleView;F)F
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcSweepAngle:F

    return p1
.end method

.method static synthetic access$202(Lcom/ibotta/android/view/common/ProgressCircleView;Z)Z
    .locals 0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animating:Z

    return p1
.end method

.method static synthetic access$302(Lcom/ibotta/android/view/common/ProgressCircleView;Z)Z
    .locals 0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcInitialized:Z

    return p1
.end method

.method static synthetic access$400(Lcom/ibotta/android/view/common/ProgressCircleView;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->initArc()V

    return-void
.end method

.method private initArc()V
    .locals 7

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->isCompleted()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcInitialized:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 141
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->getWidth()I

    move-result v0

    .line 142
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->getHeight()I

    move-result v1

    const v2, 0x3cf5c28f    # 0.03f

    int-to-float v3, v0

    mul-float v3, v3, v2

    float-to-int v2, v3

    .line 146
    rem-int/lit8 v3, v2, 0x2

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    .line 151
    :cond_1
    div-int/lit8 v3, v2, 0x2

    .line 152
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    .line 153
    iget-object v5, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    add-int/lit8 v6, v3, 0x0

    int-to-float v6, v6

    sub-int/2addr v0, v3

    int-to-float v0, v0

    sub-int/2addr v1, v3

    int-to-float v1, v1

    invoke-virtual {v5, v6, v6, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->getProgressColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_2

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v3, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    invoke-virtual {v3}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->getProgressColor()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/ibotta/android/util/Formatting;->normalizeAndParseColor(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    .line 161
    :goto_0
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    .line 162
    iget-object v3, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    int-to-float v2, v2

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 163
    iget-object v2, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 164
    iget-object v2, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    if-eq v0, v1, :cond_3

    .line 167
    iget-object v1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 169
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0600e9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 170
    new-instance v1, Landroid/graphics/SweepGradient;

    iget-object v2, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v5, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    div-float/2addr v5, v3

    invoke-direct {v1, v2, v5, v0, v0}, Landroid/graphics/SweepGradient;-><init>(FFII)V

    .line 171
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v2, 0x43870000    # 270.0f

    .line 172
    iget-object v5, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    div-float/2addr v5, v3

    iget-object v6, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    div-float/2addr v6, v3

    invoke-virtual {v0, v2, v5, v6}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 173
    invoke-virtual {v1, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :goto_1
    const-string v0, "Progress percent: %1$f"

    .line 177
    new-array v1, v4, [Ljava/lang/Object;

    iget v2, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcSweepAngle:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iput-boolean v4, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcInitialized:Z

    .line 180
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->invalidate()V

    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method public static synthetic lambda$tryAnimation$0(Lcom/ibotta/android/view/common/ProgressCircleView;)V
    .locals 1

    .line 97
    new-instance v0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;-><init>(Lcom/ibotta/android/view/common/ProgressCircleView;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private tryAnimation()V
    .locals 2

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->initArc()V

    .line 91
    iget-boolean v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animationSafe:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animating:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 95
    iput-boolean v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animating:Z

    .line 97
    new-instance v0, Lcom/ibotta/android/view/common/-$$Lambda$ProgressCircleView$0GnNfwtDrE-kqbT5Erwy0xtobz0;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/common/-$$Lambda$ProgressCircleView$0GnNfwtDrE-kqbT5Erwy0xtobz0;-><init>(Lcom/ibotta/android/view/common/ProgressCircleView;)V

    iput-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animationRunnable:Ljava/lang/Runnable;

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animationRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getProgress()Lcom/ibotta/android/view/common/ProgressCircleView$Progress;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    return-object v0
.end method

.method protected init()V
    .locals 1

    .line 102
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/common/ProgressCircleView;)V

    const/4 v0, 0x0

    .line 103
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;->setWillNotDraw(Z)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 108
    invoke-super {p0, p1}, Lcom/ibotta/android/commons/view/TintableImageButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->isCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcInitialized:Z

    if-eqz v0, :cond_0

    .line 111
    iget-object v2, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcBounds:Landroid/graphics/RectF;

    const/high16 v3, 0x43870000    # 270.0f

    iget v4, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcSweepAngle:F

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcPaint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method protected onProgressSet()V
    .locals 3

    const-string v0, "onProgressSet"

    const/4 v1, 0x0

    .line 116
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iput-boolean v1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcInitialized:Z

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    if-nez v0, :cond_0

    return-void

    .line 123
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->tryAnimation()V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 4

    const-string v0, "onWindowFocusChanged: %1$b"

    const/4 v1, 0x1

    .line 76
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-super {p0, p1}, Lcom/ibotta/android/commons/view/TintableImageButton;->onWindowFocusChanged(Z)V

    .line 78
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animationSafe:Z

    if-nez p1, :cond_0

    .line 81
    iput-boolean v3, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcInitialized:Z

    const/4 p1, 0x0

    .line 82
    iput p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->arcSweepAngle:F

    .line 85
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->tryAnimation()V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 128
    invoke-super {p0, p1}, Lcom/ibotta/android/commons/view/TintableImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 132
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->animating:Z

    .line 133
    invoke-direct {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->tryAnimation()V

    return-void
.end method

.method public setProgress(Lcom/ibotta/android/view/common/ProgressCircleView$Progress;)V
    .locals 2

    const-string v0, "setProgress"

    const/4 v1, 0x0

    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->progress:Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->onProgressSet()V

    return-void
.end method
