.class public final Lcom/sina/weibo/sdk/utils/BitmapHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSampleSizeAutoFitToScreen(IIII)I
    .locals 4

    .line 61
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 62
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 65
    :cond_1
    div-int v0, p2, p0

    div-int v1, p3, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 67
    div-int v0, p3, p0

    div-int v1, p2, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 69
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public static getSampleSizeOfNotTooLarge(Landroid/graphics/Rect;)I
    .locals 7

    .line 51
    const/high16 v4, 0x500000

    .line 52
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4154000000000000L    # 5242880.0

    div-double v5, v0, v2

    .line 53
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v5, v0

    if-ltz v0, :cond_0

    double-to-int v0, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static makesureSizeNotTooLarge(Landroid/graphics/Rect;)Z
    .locals 3

    .line 42
    const/high16 v2, 0x500000

    .line 43
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v1

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x2

    const/high16 v1, 0x500000

    if-le v0, v1, :cond_0

    .line 45
    const/4 v0, 0x0

    return v0

    .line 47
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static verifyBitmap(Ljava/io/InputStream;)Z
    .locals 3

    .line 83
    if-nez p0, :cond_0

    .line 84
    const/4 v0, 0x0

    return v0

    .line 86
    :cond_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 88
    instance-of v0, p0, Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    :goto_0
    move-object p0, v0

    .line 89
    const/4 v0, 0x0

    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 91
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    goto :goto_1

    .line 92
    :catch_0
    move-exception v2

    .line 93
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 96
    :goto_1
    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v0, :cond_2

    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public static verifyBitmap(Ljava/lang/String;)Z
    .locals 2

    .line 104
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/BitmapHelper;->verifyBitmap(Ljava/io/InputStream;)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 105
    :catch_0
    move-exception v1

    .line 106
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 108
    const/4 v0, 0x0

    return v0
.end method

.method public static verifyBitmap([B)Z
    .locals 1

    .line 76
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/BitmapHelper;->verifyBitmap(Ljava/io/InputStream;)Z

    move-result v0

    return v0
.end method
