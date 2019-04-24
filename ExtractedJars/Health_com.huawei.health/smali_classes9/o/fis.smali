.class public Lo/fis;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILandroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 6

    .line 166
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 167
    invoke-static {v4, p0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 168
    return-object v5

    .line 169
    :catch_0
    move-exception v4

    .line 170
    const-string v0, "BitmapUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBitmapByResID Exception e ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/4 v0, 0x0

    return-object v0
.end method

.method private static b(Landroid/graphics/Bitmap;Landroid/content/Context;I)I
    .locals 7

    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v5, v0, Landroid/util/DisplayMetrics;->density:F

    .line 107
    new-instance v6, Landroid/graphics/Rect;

    int-to-float v0, p2

    invoke-static {p1, v0}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v2, p2

    mul-float/2addr v2, v5

    const/high16 v3, 0x42200000    # 40.0f

    add-float/2addr v2, v3

    float-to-int v2, v2

    sub-int/2addr v1, v2

    const/high16 v2, 0x42240000    # 41.0f

    mul-float/2addr v2, v5

    float-to-int v2, v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    const/high16 v4, 0x41400000    # 12.0f

    mul-float/2addr v4, v5

    float-to-int v4, v4

    sub-int/2addr v3, v4

    invoke-direct {v6, v0, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 108
    invoke-static {p0, p1, v6}, Lo/fis;->b(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Rect;)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Rect;)I
    .locals 4

    .line 207
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 208
    :cond_0
    const/16 v0, 0x7d

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 210
    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, p2, v0}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;
    .locals 12

    .line 119
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 120
    const/4 v0, 0x0

    return-object v0

    .line 122
    :cond_0
    const/16 v4, 0xa

    .line 123
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_1

    .line 124
    const/16 v4, 0xf

    .line 127
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v5, v0, Landroid/util/DisplayMetrics;->density:F

    .line 128
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v6

    .line 129
    if-nez v6, :cond_2

    .line 130
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 132
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v6, v0}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 134
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 136
    new-instance v8, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v8, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 138
    const/16 v0, 0x96

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 139
    invoke-virtual {v8, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    int-to-float v0, v4

    invoke-static {p2, v0}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 145
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 146
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v8, p1, v1, v0, v9}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 147
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    float-to-int v1, v1

    div-int v10, v0, v1

    .line 148
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    float-to-int v1, v1

    div-int v11, v0, v1

    .line 150
    int-to-float v0, v10

    mul-float/2addr v0, v5

    int-to-float v1, v11

    mul-float/2addr v1, v5

    invoke-virtual {v7, p1, v0, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    return-object p0

    .line 152
    :catch_0
    move-exception v5

    .line 153
    const-string v0, "BitmapUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "drawTextToBitmap Exception e ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/content/Context;I)Landroid/graphics/Bitmap;
    .locals 7

    .line 82
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 83
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_1
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 88
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 89
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 90
    int-to-float v0, p3

    invoke-static {p2, v0}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, p3

    mul-float/2addr v2, v4

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v6, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    return-object v5

    .line 92
    :catch_0
    move-exception v5

    .line 93
    const-string v0, "BitmapUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mergeBitmap Exception e ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 3

    .line 42
    const/16 v0, 0x10

    invoke-static {p0, p3, v0}, Lo/fis;->b(Landroid/graphics/Bitmap;Landroid/content/Context;I)I

    move-result v0

    invoke-static {p1, p2, p3, v0}, Lo/fis;->b(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 43
    const/16 v0, 0x10

    invoke-static {p0, v1, p3, v0}, Lo/fis;->c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 44
    return-object v2
.end method

.method public static d(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 11

    .line 183
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 184
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 187
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 188
    invoke-virtual {v9, p1, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 191
    move-object v0, p0

    move v3, v7

    move v4, v8

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    :try_start_0
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 192
    return-object v10

    .line 193
    :catch_0
    move-exception v10

    .line 194
    const-string v0, "BitmapUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IllegalArgumentException e ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 8

    .line 57
    const/4 v0, -0x1

    invoke-static {p1, p2, p3, v0}, Lo/fis;->b(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 58
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 59
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v5, v0, v1

    .line 62
    const-string v0, "BitmapUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scale ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/high16 v0, 0x40400000    # 3.0f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_2

    .line 64
    const v5, 0x3f4ccccd    # 0.8f

    goto :goto_0

    .line 66
    :cond_2
    const v5, 0x3f19999a    # 0.6f

    .line 68
    :goto_0
    invoke-static {v4, v5}, Lo/fis;->d(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 69
    const/4 v0, 0x4

    invoke-static {p0, v6, p3, v0}, Lo/fis;->c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 70
    return-object v7
.end method
