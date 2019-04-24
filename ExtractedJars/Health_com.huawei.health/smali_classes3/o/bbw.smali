.class public Lo/bbw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    .line 102
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 103
    :cond_0
    return-object p1

    .line 106
    :cond_1
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 107
    int-to-float v0, p0

    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 109
    move-object v0, p1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 110
    return-object v8
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 5

    .line 83
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 86
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 88
    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 89
    :goto_0
    const-string v0, "ImageUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mimType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "image/gif"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/bmp"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/webp"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static e(Ljava/lang/String;)I
    .locals 5

    .line 31
    const/4 v2, 0x0

    .line 33
    :try_start_0
    new-instance v3, Landroid/media/ExifInterface;

    invoke-direct {v3, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 34
    const-string v0, "Orientation"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 35
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 37
    :sswitch_0
    const/16 v2, 0x5a

    .line 38
    goto :goto_0

    .line 40
    :sswitch_1
    const/16 v2, 0xb4

    .line 41
    goto :goto_0

    .line 43
    :sswitch_2
    const/16 v2, 0x10e

    .line 44
    .line 50
    :goto_0
    goto :goto_1

    .line 48
    :catch_0
    move-exception v3

    .line 49
    const-string v0, "ImageUtils"

    const-string v1, "readPictureDegree IOException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    :goto_1
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x6 -> :sswitch_0
        0x8 -> :sswitch_2
    .end sparse-switch
.end method

.method public static e(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 4

    .line 58
    const/4 v2, 0x0

    .line 60
    :try_start_0
    invoke-static {p0, p1, p2}, Lo/aqn;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v2, v0

    .line 61
    invoke-static {v2, p1, p2}, Lo/boe;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v2, v0

    .line 63
    invoke-static {p0}, Lo/bbw;->e(Ljava/lang/String;)I

    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    invoke-static {v3, v2}, Lo/bbw;->a(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 73
    :cond_0
    goto :goto_0

    .line 67
    :catch_0
    move-exception v3

    .line 68
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 70
    const/4 v2, 0x0

    .line 72
    :cond_1
    const-string v0, "ImageUtils"

    const-string v1, "MediaUtils createBitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    :goto_0
    return-object v2
.end method
