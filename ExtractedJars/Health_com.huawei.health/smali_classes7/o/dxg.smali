.class public Lo/dxg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 8

    .line 49
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 52
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 54
    invoke-static {v4, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 57
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/16 v1, 0xc8

    if-ge v0, v1, :cond_0

    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_1

    .line 58
    :cond_0
    const/4 v0, 0x2

    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x1

    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 63
    :goto_0
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 64
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 65
    const/4 v6, 0x0

    .line 69
    :cond_2
    :try_start_0
    invoke-static {v4, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 72
    goto :goto_1

    .line 70
    :catch_0
    move-exception v7

    .line 71
    const-string v0, "AchieveImageLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getThumbnailImage  OutOfMemoryError e = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :goto_1
    return-object v6

    .line 75
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 33
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 34
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 36
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 38
    const/16 v0, 0x140

    invoke-static {p1, v0}, Lo/dxg;->c(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 39
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 40
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_2
    invoke-static {v2}, Lo/dxg;->e(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 43
    return-object v2

    .line 45
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 23

    .line 80
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    .line 81
    const-string v0, "AchieveImageLoader"

    const-string v1, "bitmap is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    .line 88
    if-gt v14, v15, :cond_1

    .line 89
    int-to-float v0, v14

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    int-to-float v12, v14

    .line 94
    int-to-float v13, v14

    .line 96
    int-to-float v9, v14

    .line 97
    const/4 v6, 0x0

    .line 98
    int-to-float v8, v14

    .line 99
    move v15, v14

    goto :goto_0

    .line 102
    :cond_1
    int-to-float v0, v15

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 103
    sub-int v0, v14, v15

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v16, v0, v1

    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v11, 0x0

    .line 106
    int-to-float v12, v15

    .line 107
    int-to-float v13, v15

    .line 109
    move/from16 v6, v16

    .line 110
    int-to-float v0, v14

    sub-float v8, v0, v16

    .line 111
    const/4 v7, 0x0

    .line 112
    int-to-float v9, v15

    .line 113
    move v14, v15

    .line 115
    :goto_0
    new-instance v16, Landroid/graphics/Paint;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Paint;-><init>()V

    .line 116
    const v17, -0xbdbdbe

    .line 118
    new-instance v0, Landroid/graphics/Rect;

    float-to-int v1, v6

    float-to-int v3, v8

    float-to-int v4, v9

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object/from16 v18, v0

    .line 120
    new-instance v0, Landroid/graphics/Rect;

    float-to-int v3, v12

    float-to-int v4, v13

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object/from16 v19, v0

    .line 122
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    move-object/from16 v20, v0

    .line 125
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v14, v15, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 127
    new-instance v0, Landroid/graphics/Canvas;

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v22, v0

    .line 128
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 131
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 132
    move-object/from16 v0, v16

    const v1, -0xbdbdbe

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    move-object/from16 v0, v22

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 134
    move-object/from16 v0, v22

    move-object/from16 v1, v20

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v5, v5, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 136
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 137
    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v16

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 138
    return-object v21
.end method
