.class public abstract Lo/bbl;
.super Lo/bbp;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/bbp;-><init>(Landroid/content/Context;)V

    .line 24
    invoke-virtual {p0, p2, p3}, Lo/bbl;->a(II)V

    .line 25
    return-void
.end method

.method private static c(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 9

    .line 99
    iget v2, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 100
    iget v3, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 101
    const/4 v4, 0x1

    .line 103
    if-lez p2, :cond_0

    if-gtz p1, :cond_1

    .line 105
    :cond_0
    return v4

    .line 108
    :cond_1
    if-gt v2, p2, :cond_2

    if-le v3, p1, :cond_4

    .line 110
    :cond_2
    int-to-float v0, v2

    int-to-float v1, p2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 111
    int-to-float v0, v3

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 113
    if-ge v5, v6, :cond_3

    move v4, v5

    goto :goto_0

    :cond_3
    move v4, v6

    .line 115
    :goto_0
    mul-int v0, v3, v2

    int-to-float v7, v0

    .line 117
    mul-int v0, p1, p2

    mul-int/lit8 v0, v0, 0x2

    int-to-float v8, v0

    .line 119
    :goto_1
    mul-int v0, v4, v4

    int-to-float v0, v0

    div-float v0, v7, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_4

    .line 121
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 124
    :cond_4
    return v4
.end method

.method public static c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 7

    .line 65
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    const/4 v4, 0x0

    .line 72
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 75
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 77
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 79
    invoke-static {v5, p1, p2}, Lo/bbl;->c(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 81
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 83
    const-string v0, "ImageResizer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Resize image sampleSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 88
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 93
    goto :goto_0

    .line 90
    :catch_0
    move-exception v6

    .line 92
    const-string v0, "ImageResizer"

    const-string v1, "decodeSampledBitmapFromFile OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :goto_0
    return-object v4
.end method

.method private d(I)Landroid/graphics/Bitmap;
    .locals 3

    .line 52
    const-string v0, "ImageResizer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processBitmap - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(II)V
    .locals 0

    .line 30
    return-void
.end method

.method protected c(Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 142
    const/4 v0, 0x0

    return-object v0
.end method

.method protected d(Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/bbl;->d(I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected e(Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    .line 135
    const/4 v0, 0x0

    return-object v0
.end method
