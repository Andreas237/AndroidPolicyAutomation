.class public final Lcom/squareup/leakcanary/internal/MoreDetailsView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final iconPaint:Landroid/graphics/Paint;


# instance fields
.field private opened:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lcom/squareup/leakcanary/internal/MoreDetailsView;->iconPaint:Landroid/graphics/Paint;

    .line 29
    sget-object v0, Lcom/squareup/leakcanary/internal/MoreDetailsView;->iconPaint:Landroid/graphics/Paint;

    const v1, -0x7b593b

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/MoreDetailsView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v1, v0}, Lcom/squareup/leakcanary/internal/LeakCanaryUi;->dpToPixel(FLandroid/content/res/Resources;)F

    move-result v2

    .line 36
    sget-object v0, Lcom/squareup/leakcanary/internal/MoreDetailsView;->iconPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 37
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 42
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/MoreDetailsView;->getWidth()I

    move-result v6

    .line 43
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/MoreDetailsView;->getHeight()I

    move-result v7

    .line 44
    div-int/lit8 v8, v7, 0x2

    .line 45
    div-int/lit8 v9, v6, 0x2

    .line 47
    iget-boolean v0, p0, Lcom/squareup/leakcanary/internal/MoreDetailsView;->opened:Z

    if-eqz v0, :cond_0

    .line 48
    move-object v0, p1

    int-to-float v2, v8

    int-to-float v3, v6

    int-to-float v4, v8

    sget-object v5, Lcom/squareup/leakcanary/internal/MoreDetailsView;->iconPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 50
    :cond_0
    move-object v0, p1

    int-to-float v2, v8

    int-to-float v3, v6

    int-to-float v4, v8

    sget-object v5, Lcom/squareup/leakcanary/internal/MoreDetailsView;->iconPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 51
    move-object v0, p1

    int-to-float v1, v9

    int-to-float v3, v9

    int-to-float v4, v7

    sget-object v5, Lcom/squareup/leakcanary/internal/MoreDetailsView;->iconPaint:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 53
    :goto_0
    return-void
.end method

.method public setOpened(Z)V
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/squareup/leakcanary/internal/MoreDetailsView;->opened:Z

    if-eq p1, v0, :cond_0

    .line 57
    iput-boolean p1, p0, Lcom/squareup/leakcanary/internal/MoreDetailsView;->opened:Z

    .line 58
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/MoreDetailsView;->invalidate()V

    .line 60
    :cond_0
    return-void
.end method
