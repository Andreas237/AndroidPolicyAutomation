.class public Lo/bpb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(IILjava/util/List;)Landroid/graphics/Bitmap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Landroid/graphics/Bitmap;>;)Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 136
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 138
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 140
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {}, Lo/box;->d()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 141
    invoke-static {v3}, Lo/box;->e(I)[F

    move-result-object v4

    .line 143
    array-length v0, v4

    if-nez v0, :cond_2

    .line 145
    const-string v0, "JoinBitmaps"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JoinBitmap createBitmap size is null; bitmaps.size is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " count="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 149
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 150
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 151
    invoke-static {v6, v7, p2, v3, v4}, Lo/bpb;->c(Landroid/graphics/Canvas;ILjava/util/List;I[F)V

    .line 152
    return-object v5
.end method

.method public static c(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;I)Landroid/graphics/Bitmap;
    .locals 15

    .line 80
    if-nez p0, :cond_0

    .line 82
    const/4 v0, 0x0

    return-object v0

    .line 85
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 86
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 87
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 89
    move/from16 v0, p2

    int-to-float v0, v0

    int-to-float v1, v7

    div-float/2addr v0, v1

    move/from16 v1, p2

    int-to-float v1, v1

    int-to-float v2, v8

    div-float/2addr v1, v2

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 90
    move-object/from16 v0, p1

    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 92
    const/4 v10, 0x0

    .line 96
    move-object v0, p0

    move v3, v7

    move v4, v8

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    :try_start_0
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 99
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 100
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 102
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v8, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v10, v0

    .line 103
    new-instance v12, Landroid/graphics/Canvas;

    invoke-direct {v12, v10}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 104
    new-instance v13, Landroid/graphics/Paint;

    invoke-direct {v13}, Landroid/graphics/Paint;-><init>()V

    .line 105
    new-instance v14, Landroid/graphics/Rect;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v14, v0, v1, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 107
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 109
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v12, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 111
    invoke-virtual {v12, v11, v14, v14, v13}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 121
    goto :goto_0

    .line 114
    :catch_0
    move-exception v11

    .line 116
    const-string v0, "JoinBitmaps"

    const-string v1, "getJointBitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    goto :goto_0

    .line 118
    :catch_1
    move-exception v11

    .line 120
    const-string v0, "JoinBitmaps"

    const-string v1, "getJointBitmap IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    :goto_0
    return-object v10
.end method

.method private static c(Landroid/graphics/Canvas;ILjava/util/List;I[F)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;ILjava/util/List<Landroid/graphics/Bitmap;>;I[F)V"
        }
    .end annotation

    .line 33
    if-eqz p2, :cond_0

    array-length v0, p4

    if-nez v0, :cond_1

    .line 35
    :cond_0
    return-void

    .line 38
    :cond_1
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 40
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 43
    const/4 v0, 0x0

    aget v0, p4, v0

    const/4 v1, 0x0

    aget v1, p4, v1

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 44
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 47
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    .line 48
    invoke-static {}, Lo/box;->d()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 50
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    .line 52
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/graphics/Bitmap;

    .line 53
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 54
    int-to-float v0, p1

    invoke-static {p3, v6, v0, p4}, Lo/box;->d(IIF[F)[F

    move-result-object v8

    .line 56
    const/4 v0, 0x0

    aget v0, v8, v0

    const/4 v1, 0x1

    aget v1, v8, v1

    invoke-virtual {p0, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 58
    invoke-static {v7, v3, p1}, Lo/bpb;->c(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;I)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 59
    if-eqz v9, :cond_2

    .line 61
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v9, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 64
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 50
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 68
    return-void
.end method
