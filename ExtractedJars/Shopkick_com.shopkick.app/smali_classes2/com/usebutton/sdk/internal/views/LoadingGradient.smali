.class public Lcom/usebutton/sdk/internal/views/LoadingGradient;
.super Landroid/view/View;
.source "LoadingGradient.java"


# static fields
.field public static final HIGHLIGHT_RELATIVE_WIDTH:F = 1.0f

.field public static final TAG:Ljava/lang/String; = "LoadingGradient"

.field static isTesting:Z
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field private mBackgroundColor:I

.field private mDuration:I

.field private mGradientpainter:Landroid/graphics/Paint;

.field private mHighlightColor:I

.field private mSolidPainter:Landroid/graphics/Paint;

.field private mStartColor:I

.field private mStartTimeMillis:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 68
    sget v0, Lcom/usebutton/sdk/R$style;->BtnLoadingGradient:I

    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 72
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/high16 v0, -0x8000000000000000L

    .line 59
    iput-wide v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartTimeMillis:J

    .line 73
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->readAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 78
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const-wide/high16 p3, -0x8000000000000000L

    .line 59
    iput-wide p3, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartTimeMillis:J

    .line 79
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->readAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private currentPosition()F
    .locals 5

    .line 177
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartTimeMillis:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 178
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartTimeMillis:J

    .line 181
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartTimeMillis:J

    sub-long/2addr v0, v2

    iget v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mDuration:I

    int-to-long v3, v2

    rem-long/2addr v0, v3

    long-to-float v0, v0

    int-to-float v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    return v0
.end method

.method private gradientWidth()F
    .locals 2

    .line 122
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method private readAttributes(Landroid/util/AttributeSet;)V
    .locals 5

    .line 83
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_LoadingGradient:[I

    sget v2, Lcom/usebutton/sdk/R$style;->BtnLoadingGradient:I

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    move v1, v3

    :goto_0
    if-ge v1, v0, :cond_4

    .line 88
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 90
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_LoadingGradient_btn_duration:I

    if-ne v2, v4, :cond_0

    .line 91
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mDuration:I

    goto :goto_1

    .line 92
    :cond_0
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_LoadingGradient_btn_startColor:I

    if-ne v2, v4, :cond_1

    .line 93
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartColor:I

    goto :goto_1

    .line 94
    :cond_1
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_LoadingGradient_btn_highlightColor:I

    if-ne v2, v4, :cond_2

    .line 95
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mHighlightColor:I

    goto :goto_1

    .line 96
    :cond_2
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_LoadingGradient_btn_backgroundColor:I

    if-ne v2, v4, :cond_3

    .line 97
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mBackgroundColor:I

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 100
    :cond_4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 101
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->recreatePainters()V

    return-void
.end method

.method private recreatePainters()V
    .locals 11

    .line 111
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mSolidPainter:Landroid/graphics/Paint;

    .line 112
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mSolidPainter:Landroid/graphics/Paint;

    iget v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mBackgroundColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x3

    .line 114
    new-array v8, v0, [F

    fill-array-data v8, :array_0

    .line 116
    new-instance v10, Landroid/graphics/LinearGradient;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->gradientWidth()F

    move-result v5

    new-array v7, v0, [I

    iget v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mStartColor:I

    const/4 v2, 0x0

    aput v0, v7, v2

    iget v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mHighlightColor:I

    aput v2, v7, v1

    const/4 v1, 0x2

    aput v0, v7, v1

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 117
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mGradientpainter:Landroid/graphics/Paint;

    .line 118
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mGradientpainter:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 127
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 128
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->getWidth()I

    move-result v0

    .line 129
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->getHeight()I

    move-result v1

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_1

    .line 135
    :cond_0
    iget v2, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mBackgroundColor:I

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    int-to-float v0, v0

    int-to-float v10, v1

    .line 136
    iget-object v8, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mSolidPainter:Landroid/graphics/Paint;

    move-object v3, p1

    move v6, v0

    move v7, v10

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 158
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->gradientWidth()F

    move-result v9

    add-float/2addr v0, v9

    .line 161
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->currentPosition()F

    move-result v1

    neg-float v2, v9

    mul-float/2addr v0, v1

    add-float/2addr v2, v0

    .line 163
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    const/4 v0, 0x0

    .line 164
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 165
    iget-object v11, p0, Lcom/usebutton/sdk/internal/views/LoadingGradient;->mGradientpainter:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 166
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 169
    sget-boolean p1, Lcom/usebutton/sdk/internal/views/LoadingGradient;->isTesting:Z

    if-eqz p1, :cond_1

    const-wide/16 v0, 0x3e8

    .line 170
    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->postInvalidateDelayed(J)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1

    .line 172
    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->postInvalidateDelayed(J)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 106
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 107
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingGradient;->recreatePainters()V

    return-void
.end method
