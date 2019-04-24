.class public Lo/aqn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 6

    .line 25
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    const/4 v3, 0x0

    .line 34
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 37
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 38
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 40
    invoke-static {v4, p1, p2}, Lo/aqn;->b(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 43
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 49
    goto :goto_0

    .line 46
    :catch_0
    move-exception v5

    .line 48
    const-string v0, "BitmapDecodeUtil"

    const-string v1, "BitmapDecodeUtil decodeSampledBitmapFromFile OutOfMemoryError "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    :goto_0
    return-object v3
.end method

.method protected static b(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 9

    .line 63
    const/4 v2, 0x1

    .line 64
    iget v3, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 65
    iget v4, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 67
    if-lez p2, :cond_0

    if-gtz p1, :cond_1

    .line 69
    :cond_0
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->i()I

    move-result v5

    .line 70
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->h()I

    move-result v6

    .line 71
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 72
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 73
    if-ge v4, v6, :cond_1

    if-ge v3, v5, :cond_1

    .line 75
    return v2

    .line 79
    :cond_1
    if-gt v3, p2, :cond_2

    if-le v4, p1, :cond_4

    .line 81
    :cond_2
    int-to-float v0, v4

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 82
    int-to-float v0, v3

    int-to-float v1, p2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 83
    if-ge v6, v5, :cond_3

    move v2, v6

    goto :goto_0

    :cond_3
    move v2, v5

    .line 84
    :goto_0
    mul-int v0, p1, p2

    mul-int/lit8 v0, v0, 0x2

    int-to-float v7, v0

    .line 85
    mul-int v0, v4, v3

    int-to-float v8, v0

    .line 86
    :goto_1
    mul-int v0, v2, v2

    int-to-float v0, v0

    div-float v0, v8, v0

    cmpl-float v0, v0, v7

    if-lez v0, :cond_4

    .line 88
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 91
    :cond_4
    return v2
.end method
