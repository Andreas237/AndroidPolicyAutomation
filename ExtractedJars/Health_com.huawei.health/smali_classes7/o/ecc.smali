.class public Lo/ecc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I
    .locals 6

    .line 147
    invoke-static {p0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v4

    .line 148
    invoke-virtual {v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->getState()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 149
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check exception return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const/4 v0, -0x1

    return v0

    .line 153
    :cond_0
    invoke-virtual {v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 154
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "algorithm error return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const/4 v0, -0x1

    return v0

    .line 157
    :cond_1
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v4, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v5

    .line 158
    const-string v0, "DrawableUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Domain "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return v5
.end method

.method public static b(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 9

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 45
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmapByView 2 view.height == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    :goto_0
    if-nez v6, :cond_1

    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 56
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 61
    goto :goto_0

    .line 58
    :catch_0
    move-exception v8

    .line 59
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 60
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 64
    :cond_1
    if-nez v6, :cond_2

    .line 65
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmapByView view No enough memory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_2
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 70
    invoke-virtual {p0, v8}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 71
    const-string v0, "DrawableUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getViewBitmap_time2 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    return-object v6
.end method

.method public static c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I
    .locals 6

    .line 125
    invoke-static {p0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v4

    .line 126
    invoke-virtual {v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->getState()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 127
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check exception return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, -0x1

    return v0

    .line 130
    :cond_0
    invoke-virtual {v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 131
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "algorithm error return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, -0x1

    return v0

    .line 134
    :cond_1
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v4, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v5

    .line 135
    const-string v0, "DrawableUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "widget "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return v5
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10

    .line 89
    if-nez p1, :cond_0

    .line 90
    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_0
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    .line 98
    :try_start_0
    invoke-virtual {v6, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 99
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 106
    if-eqz v5, :cond_1

    .line 107
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 111
    :cond_1
    goto :goto_1

    .line 109
    :catch_0
    move-exception v7

    .line 110
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    goto :goto_1

    .line 101
    :catch_1
    move-exception v7

    .line 103
    const-string v0, "DrawableUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    if-eqz v5, :cond_2

    .line 107
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 111
    :cond_2
    goto :goto_1

    .line 109
    :catch_2
    move-exception v7

    .line 110
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    goto :goto_1

    .line 105
    :catchall_0
    move-exception v8

    .line 106
    if-eqz v5, :cond_3

    .line 107
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 111
    :cond_3
    goto :goto_0

    .line 109
    :catch_3
    move-exception v9

    .line 110
    const-string v0, "DrawableUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :goto_0
    throw v8

    .line 113
    :goto_1
    return-object v4
.end method

.method public static d(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    .line 24
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 25
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 26
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    add-int v4, p3, v0

    .line 27
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-static {v3, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 28
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 29
    int-to-float v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v6, p0, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 30
    int-to-float v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v6, p2, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 31
    return-object v5

    .line 33
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 76
    if-nez p0, :cond_0

    .line 77
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method
