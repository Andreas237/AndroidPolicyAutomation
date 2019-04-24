.class public final Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;
    }
.end annotation


# static fields
.field private static final clearPaint:Landroid/graphics/Paint;

.field private static final iconPaint:Landroid/graphics/Paint;

.field private static final leakPaint:Landroid/graphics/Paint;

.field private static final rootPaint:Landroid/graphics/Paint;


# instance fields
.field private cache:Landroid/graphics/Bitmap;

.field private type:Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    .line 31
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->rootPaint:Landroid/graphics/Paint;

    .line 32
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->leakPaint:Landroid/graphics/Paint;

    .line 33
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    .line 36
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    const v1, -0x454546

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->rootPaint:Landroid/graphics/Paint;

    const v1, -0x7b593b

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->leakPaint:Landroid/graphics/Paint;

    const v1, -0x4eaab2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    sget-object v1, Lcom/squareup/leakcanary/internal/LeakCanaryUi;->CLEAR_XFER_MODE:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 51
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;->NODE:Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;

    iput-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->type:Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;

    .line 54
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 57
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->getWidth()I

    move-result v6

    .line 58
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->getHeight()I

    move-result v7

    .line 60
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-ne v0, v6, :cond_0

    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eq v0, v7, :cond_1

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    .line 66
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    .line 68
    new-instance v8, Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    invoke-direct {v8, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 70
    int-to-float v0, v6

    const/high16 v1, 0x40000000    # 2.0f

    div-float v9, v0, v1

    .line 71
    int-to-float v0, v7

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v0, v1

    .line 72
    int-to-float v0, v6

    const/high16 v1, 0x40400000    # 3.0f

    div-float v11, v0, v1

    .line 74
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1, v0}, Lcom/squareup/leakcanary/internal/LeakCanaryUi;->dpToPixel(FLandroid/content/res/Resources;)F

    move-result v12

    .line 76
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v12}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 77
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->rootPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v12}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 79
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$1;->$SwitchMap$com$squareup$leakcanary$internal$DisplayLeakConnectorView$Type:[I

    iget-object v1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->type:Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;

    invoke-virtual {v1}, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 81
    :sswitch_0
    move-object v0, v8

    move v1, v9

    move v3, v9

    int-to-float v4, v7

    sget-object v5, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 82
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v9, v10, v9, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 83
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v9, v10, v11, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 84
    goto/16 :goto_1

    .line 86
    :sswitch_1
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v12, v0

    sub-float v13, v9, v0

    .line 87
    move-object v0, v8

    int-to-float v3, v6

    move v4, v13

    sget-object v5, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->rootPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 88
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v13, v13, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 89
    int-to-float v0, v6

    sget-object v1, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v0, v13, v13, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 90
    move-object v0, v8

    move v1, v9

    move v3, v9

    move v4, v10

    sget-object v5, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->rootPaint:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 91
    move-object v0, v8

    move v1, v9

    move v2, v10

    move v3, v9

    int-to-float v4, v7

    sget-object v5, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 92
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v9, v10, v9, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 93
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->clearPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v9, v10, v11, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 94
    goto :goto_1

    .line 96
    :goto_0
    move-object v0, v8

    move v1, v9

    move v3, v9

    move v4, v10

    sget-object v5, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->iconPaint:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 97
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->leakPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v9, v10, v11, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 101
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 102
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public setType(Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->type:Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;

    if-eq p1, v0, :cond_1

    .line 106
    iput-object p1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->type:Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView$Type;

    .line 107
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->cache:Landroid/graphics/Bitmap;

    .line 111
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/DisplayLeakConnectorView;->invalidate()V

    .line 113
    :cond_1
    return-void
.end method
