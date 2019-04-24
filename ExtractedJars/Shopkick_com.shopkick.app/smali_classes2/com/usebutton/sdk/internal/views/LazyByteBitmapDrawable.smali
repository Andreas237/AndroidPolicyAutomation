.class public Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "LazyByteBitmapDrawable.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "LazyByteBitmapDrawable"


# instance fields
.field private mBitmapSourceRect:Landroid/graphics/Rect;

.field private mCanvasDestinationRect:Landroid/graphics/Rect;

.field private mDecodedBitmap:Landroid/graphics/Bitmap;

.field private mHeight:I

.field private mPainter:Landroid/graphics/Paint;

.field private final mRawImageData:[B

.field private mWidth:I


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Asset;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 49
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Asset;->getData()[B

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, -0x1

    .line 27
    iput v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mWidth:I

    .line 28
    iput v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mHeight:I

    .line 40
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mRawImageData:[B

    .line 41
    new-instance p1, Landroid/graphics/Paint;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mPainter:Landroid/graphics/Paint;

    return-void
.end method

.method private decodeImageForCanvas(Landroid/graphics/Canvas;)V
    .locals 10

    .line 93
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mWidth:I

    .line 94
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mHeight:I

    .line 96
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    .line 97
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    const/4 p1, 0x0

    .line 98
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    .line 100
    :cond_0
    new-instance p1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x1

    .line 101
    iput-boolean v0, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 102
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mRawImageData:[B

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, p1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    const-string v1, "LazyByteBitmapDrawable"

    const-string v2, "Will reload image from %dx%d to fit frame: %dx%d"

    const/4 v4, 0x4

    .line 103
    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    iget v5, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x2

    iget v6, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mWidth:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x3

    iget v6, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mHeight:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    .line 103
    invoke-static {v1, v2, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mRawImageData:[B

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mRawImageData:[B

    array-length v2, v2

    invoke-static {v1, v3, v2, v3}, Landroid/graphics/BitmapRegionDecoder;->newInstance([BIIZ)Landroid/graphics/BitmapRegionDecoder;

    move-result-object v1

    .line 107
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v4, v2

    iget v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mWidth:I

    int-to-double v6, v2

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    .line 108
    iget v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mHeight:I

    int-to-double v6, v2

    mul-double/2addr v4, v6

    double-to-int v2, v4

    .line 109
    new-instance v4, Landroid/graphics/Rect;

    iget v5, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v6, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v4, v3, v3, v5, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 112
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 113
    iget p1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mWidth:I

    div-int/2addr p1, v3

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 114
    invoke-virtual {v1, v4, v2}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    .line 115
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "LazyByteBitmapDrawable"

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ran out of memory while decoding image of size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mRawImageData:[B

    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->imageSizeString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    const-string v0, "LazyByteBitmapDrawable"

    const-string v1, "Could not decode image."

    .line 117
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private hasSizeChanged(Landroid/graphics/Canvas;)Z
    .locals 2

    .line 86
    iget v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mWidth:I

    .line 87
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mHeight:I

    .line 88
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result p1

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 67
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mRawImageData:[B

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->hasSizeChanged(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->decodeImageForCanvas(Landroid/graphics/Canvas;)V

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    return-void

    .line 74
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 75
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 77
    new-instance v2, Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mBitmapSourceRect:Landroid/graphics/Rect;

    .line 79
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v3, v3, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mCanvasDestinationRect:Landroid/graphics/Rect;

    const-string v0, "LazyByteBitmapDrawable"

    const-string v1, "Requested to draw in: %s"

    const/4 v2, 0x1

    .line 81
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mCanvasDestinationRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mDecodedBitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mBitmapSourceRect:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mCanvasDestinationRect:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mPainter:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    const/16 v0, 0x2710

    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mPainter:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LazyByteBitmapDrawable;->mPainter:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
