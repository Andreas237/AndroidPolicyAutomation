.class public final Lcom/huawei/wallet/utils/bitmap/BpDecodeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 10

    .line 115
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v4, v0

    .line 116
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-double v6, v0

    .line 118
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    mul-double v0, v4, v6

    int-to-double v2, p2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v8, v0

    .line 120
    :goto_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/16 v9, 0x80

    goto :goto_1

    :cond_1
    int-to-double v0, p1

    div-double v0, v4, v0

    .line 121
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    int-to-double v2, p1

    div-double v2, v6, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-int v9, v0

    .line 123
    :goto_1
    if-ge v9, v8, :cond_2

    .line 125
    return v8

    .line 127
    :cond_2
    const/4 v0, -0x1

    if-ne p2, v0, :cond_3

    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    .line 129
    const/4 v0, 0x1

    return v0

    .line 131
    :cond_3
    const/4 v0, -0x1

    if-ne p1, v0, :cond_4

    .line 133
    return v8

    .line 137
    :cond_4
    return v9
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 9

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_1
    :try_start_0
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 52
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 53
    mul-int v0, p1, p2

    const/4 v1, -0x1

    invoke-static {v4, v1, v0}, Lcom/huawei/wallet/utils/bitmap/BpDecodeUtil;->e(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 56
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 57
    const/4 v0, 0x0

    invoke-static {v2, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 66
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 68
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    const/4 v2, 0x0

    .line 72
    goto :goto_0

    .line 70
    :catch_0
    move-exception v6

    .line 71
    const-string v0, "decodeFile stream close error "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 57
    :cond_2
    :goto_0
    return-object v5

    .line 59
    :catch_1
    move-exception v4

    .line 61
    const-string v0, "decodeFile error file not fount"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 68
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 69
    const/4 v2, 0x0

    .line 72
    goto :goto_2

    .line 70
    :catch_2
    move-exception v4

    .line 71
    const-string v0, "decodeFile stream close error "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 72
    goto :goto_2

    .line 63
    :catch_3
    move-exception v4

    .line 64
    const-string v0, "decodeFile error "

    const/4 v1, 0x0

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 66
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 68
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 69
    const/4 v2, 0x0

    .line 72
    goto :goto_2

    .line 70
    :catch_4
    move-exception v4

    .line 71
    const-string v0, "decodeFile stream close error "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 72
    goto :goto_2

    .line 66
    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 68
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 69
    const/4 v2, 0x0

    .line 72
    goto :goto_1

    .line 70
    :catch_5
    move-exception v8

    .line 71
    const-string v0, "decodeFile stream close error "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 74
    :cond_3
    :goto_1
    throw v7

    .line 75
    :cond_4
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 4

    .line 88
    invoke-static {p0, p1, p2}, Lcom/huawei/wallet/utils/bitmap/BpDecodeUtil;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    .line 90
    const/16 v0, 0x8

    if-gt v2, v0, :cond_0

    .line 92
    const/4 v3, 0x1

    .line 93
    :goto_0
    if-ge v3, v2, :cond_1

    .line 95
    shl-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 100
    :cond_0
    add-int/lit8 v0, v2, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v3, v0, 0x8

    .line 102
    :cond_1
    return v3
.end method
