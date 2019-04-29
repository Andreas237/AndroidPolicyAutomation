.class public Lcom/rt/mobile/english/ui/widget/VisualizerView;
.super Landroid/view/View;
.source "VisualizerView.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "VisualizerView"


# instance fields
.field private mBytes:[B

.field mCanvas:Landroid/graphics/Canvas;

.field mCanvasBitmap:Landroid/graphics/Bitmap;

.field private mDivisions:I

.field private mFFTBytes:[B

.field private mFFTPoints:[F

.field private mFadePaint:Landroid/graphics/Paint;

.field mFlash:Z

.field private mFlashPaint:Landroid/graphics/Paint;

.field private mRect:Landroid/graphics/Rect;

.field private mTop:Z

.field private mVisualizer:Landroid/media/audiofx/Visualizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 48
    invoke-direct {p0, p1, v0, v1}, Lcom/rt/mobile/english/ui/widget/VisualizerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, v0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance p1, Landroid/graphics/Rect;

    const/4 p2, 0x0

    const/16 p3, 0xf0

    const/16 v0, 0xc8

    invoke-direct {p1, p2, p2, p3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mRect:Landroid/graphics/Rect;

    .line 32
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFlashPaint:Landroid/graphics/Paint;

    .line 33
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFadePaint:Landroid/graphics/Paint;

    .line 141
    iput-boolean p2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFlash:Z

    const/16 p1, 0x10

    .line 155
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    const/4 p1, 0x1

    .line 159
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mTop:Z

    .line 38
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/widget/VisualizerView;)Landroid/media/audiofx/Visualizer;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    return-object p0
.end method

.method private init()V
    .locals 3

    const/4 v0, 0x0

    .line 52
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mBytes:[B

    .line 53
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    .line 55
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFlashPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/16 v2, 0x7a

    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFadePaint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    const/16 v2, 0xee

    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 57
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFadePaint:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method


# virtual methods
.method public flash()V
    .locals 1

    const/4 v0, 0x1

    .line 148
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFlash:Z

    .line 149
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->invalidate()V

    return-void
.end method

.method public link(Landroid/media/MediaPlayer;)V
    .locals 4

    if-nez p1, :cond_0

    .line 70
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Cannot link to null MediaPlayer"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 74
    :cond_0
    new-instance v0, Landroid/media/audiofx/Visualizer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/media/audiofx/Visualizer;-><init>(I)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 75
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-static {}, Landroid/media/audiofx/Visualizer;->getCaptureSizeRange()[I

    move-result-object v1

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setCaptureSize(I)I

    .line 78
    new-instance v0, Lcom/rt/mobile/english/ui/widget/VisualizerView$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView$1;-><init>(Lcom/rt/mobile/english/ui/widget/VisualizerView;)V

    .line 95
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 96
    invoke-static {}, Landroid/media/audiofx/Visualizer;->getMaxCaptureRate()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    .line 95
    invoke-virtual {v1, v0, v3, v2, v2}, Landroid/media/audiofx/Visualizer;->setDataCaptureListener(Landroid/media/audiofx/Visualizer$OnDataCaptureListener;IZZ)I

    .line 99
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0, v2}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    .line 100
    new-instance v0, Lcom/rt/mobile/english/ui/widget/VisualizerView$2;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView$2;-><init>(Lcom/rt/mobile/english/ui/widget/VisualizerView;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 164
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 167
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mRect:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 169
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mCanvasBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 171
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mCanvasBitmap:Landroid/graphics/Bitmap;

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_1

    .line 175
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mCanvasBitmap:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mCanvas:Landroid/graphics/Canvas;

    .line 183
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    if-eqz v0, :cond_8

    .line 185
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    array-length v0, v0

    iget v1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    div-int/2addr v0, v1

    new-array v0, v0, [F

    .line 189
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    array-length v1, v1

    iget v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    div-int/2addr v1, v2

    new-array v1, v1, [F

    .line 192
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    array-length v2, v2

    iget-object v4, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    array-length v4, v4

    mul-int/lit8 v4, v4, 0x4

    if-ge v2, v4, :cond_3

    .line 193
    :cond_2
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x4

    new-array v2, v2, [F

    iput-object v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    :cond_3
    move v2, v3

    :goto_0
    const/4 v4, 0x0

    .line 197
    :try_start_0
    iget-object v5, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    array-length v5, v5

    iget v6, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    div-int/2addr v5, v6

    const/4 v6, 0x1

    if-ge v2, v5, :cond_5

    .line 198
    iget-object v5, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    mul-int/lit8 v7, v2, 0x4

    iget v8, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    mul-int/2addr v8, v7

    int-to-float v8, v8

    aput v8, v5, v7

    .line 199
    iget-object v5, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    add-int/lit8 v8, v7, 0x2

    iget v9, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    mul-int/2addr v9, v7

    int-to-float v9, v9

    aput v9, v5, v8

    .line 200
    iget-object v5, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    iget v8, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    mul-int/2addr v8, v2

    aget-byte v5, v5, v8

    .line 201
    iget-object v8, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    iget v9, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mDivisions:I

    mul-int/2addr v9, v2

    add-int/2addr v9, v6

    aget-byte v6, v8, v9

    mul-int/2addr v5, v5

    mul-int/2addr v6, v6

    add-int/2addr v5, v6

    int-to-float v5, v5

    .line 203
    aget v6, v0, v2

    aput v6, v1, v2

    .line 204
    aput v5, v0, v2

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    float-to-double v5, v5

    .line 205
    invoke-static {v5, v6}, Ljava/lang/Math;->log10(D)D

    move-result-wide v5

    mul-double/2addr v8, v5

    double-to-int v5, v8

    .line 208
    iget-boolean v6, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mTop:Z

    if-eqz v6, :cond_4

    .line 210
    iget-object v6, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    add-int/lit8 v8, v7, 0x1

    aput v4, v6, v8

    .line 211
    iget-object v6, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    add-int/lit8 v7, v7, 0x3

    mul-int/lit8 v5, v5, 0x2

    add-int/lit8 v5, v5, -0xa

    int-to-float v5, v5

    aput v5, v6, v7

    goto :goto_1

    .line 215
    :cond_4
    iget-object v6, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    add-int/lit8 v8, v7, 0x1

    iget-object v9, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mRect:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    move-result v9

    int-to-float v9, v9

    aput v9, v6, v8

    .line 216
    iget-object v6, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    add-int/lit8 v7, v7, 0x3

    iget-object v8, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    mul-int/lit8 v5, v5, 0x2

    add-int/lit8 v5, v5, -0xa

    sub-int/2addr v8, v5

    int-to-float v5, v8

    aput v5, v6, v7

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 221
    :cond_5
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTPoints:[F

    iget-object v5, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFlashPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v5}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 226
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f080217

    invoke-static {v2, v5}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    move v5, v3

    .line 227
    :goto_2
    array-length v7, v0

    if-ge v6, v7, :cond_8

    .line 229
    rem-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_6

    .line 231
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    add-int/2addr v5, v7

    .line 233
    :cond_6
    aget v7, v0, v6

    aget v8, v1, v6

    const/4 v9, 0x3

    int-to-float v9, v9

    add-float/2addr v8, v9

    cmpl-float v7, v7, v8

    if-lez v7, :cond_7

    .line 235
    rem-int/lit8 v7, v6, 0x6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    mul-int/2addr v7, v8

    add-int/lit8 v7, v7, 0x5

    int-to-float v7, v7

    add-int v8, v3, v5

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {p1, v2, v7, v8, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    .line 242
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFlashPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_8
    return-void
.end method

.method public release()V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Visualizer;->release()V

    return-void
.end method

.method public updateVisualizer([B)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mBytes:[B

    .line 127
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->invalidate()V

    return-void
.end method

.method public updateVisualizerFFT([B)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView;->mFFTBytes:[B

    .line 138
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->invalidate()V

    return-void
.end method
