.class public Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;
.super Landroid/widget/ProgressBar;
.source "RoundedEdgeCircularProgressBar.java"


# static fields
.field private static final CIRCLE_ANGLE:I = 0x10e


# instance fields
.field private final CIRCLE_INNER_RADIUS:I

.field private final PROGRESS_BAR_THICKNESS:I

.field private final paint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    .line 12
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->PROGRESS_BAR_THICKNESS:I

    const/16 p1, 0x34

    .line 13
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->CIRCLE_INNER_RADIUS:I

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    .line 12
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->PROGRESS_BAR_THICKNESS:I

    const/16 p1, 0x34

    .line 13
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->CIRCLE_INNER_RADIUS:I

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x8

    .line 12
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->PROGRESS_BAR_THICKNESS:I

    const/16 p1, 0x34

    .line 13
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->CIRCLE_INNER_RADIUS:I

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/16 p1, 0x8

    .line 12
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->PROGRESS_BAR_THICKNESS:I

    const/16 p1, 0x34

    .line 13
    iput p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->CIRCLE_INNER_RADIUS:I

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    monitor-enter p0

    .line 36
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->onDraw(Landroid/graphics/Canvas;)V

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x40800000    # 4.0f

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v0

    float-to-int v0, v1

    const/high16 v1, 0x42500000    # 52.0f

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v1

    float-to-int v1, v2

    .line 46
    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    .line 47
    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getMeasuredHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    float-to-double v4, v2

    add-int/2addr v1, v0

    int-to-double v1, v1

    const-wide v6, 0x4070e00000000000L    # 270.0

    .line 50
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v8, v1

    add-double/2addr v4, v8

    double-to-float v4, v4

    float-to-double v8, v3

    .line 51
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    mul-double/2addr v1, v5

    add-double/2addr v8, v1

    double-to-float v1, v8

    int-to-float v0, v0

    .line 54
    iget-object v2, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v1, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 55
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 57
    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getProgress()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getMax()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getMeasuredWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->getMeasuredHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    invoke-virtual {p1, v2, v3, v5}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 59
    iget-object v2, p0, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v1, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 61
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
