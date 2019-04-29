.class public Lcom/mopub/common/util/ImageUtils;
.super Ljava/lang/Object;
.source "ImageUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static applyFastGaussianBlurToBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 19
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 18
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    mul-int v0, v8, v9

    .line 20
    new-array v10, v0, [I

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v1, v10

    move v3, v8

    move v6, v8

    move v7, v9

    .line 21
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move/from16 v0, p1

    :goto_0
    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    move v1, v0

    :goto_1
    sub-int v2, v9, v0

    if-ge v1, v2, :cond_1

    move v2, v0

    :goto_2
    sub-int v3, v8, v0

    if-ge v2, v3, :cond_0

    sub-int v3, v1, v0

    mul-int/2addr v3, v8

    add-int/2addr v3, v2

    sub-int v4, v3, v0

    .line 26
    aget v4, v10, v4

    add-int v5, v3, v0

    .line 27
    aget v5, v10, v5

    .line 28
    aget v3, v10, v3

    add-int v6, v1, v0

    mul-int/2addr v6, v8

    add-int/2addr v6, v2

    sub-int v7, v6, v0

    .line 29
    aget v7, v10, v7

    add-int v11, v6, v0

    .line 30
    aget v11, v10, v11

    .line 31
    aget v6, v10, v6

    mul-int v12, v1, v8

    add-int/2addr v12, v2

    sub-int v13, v12, v0

    .line 32
    aget v13, v10, v13

    add-int v14, v12, v0

    .line 33
    aget v14, v10, v14

    and-int/lit16 v15, v4, 0xff

    move/from16 v17, v9

    and-int/lit16 v9, v5, 0xff

    add-int/2addr v15, v9

    and-int/lit16 v9, v3, 0xff

    add-int/2addr v15, v9

    and-int/lit16 v9, v7, 0xff

    add-int/2addr v15, v9

    and-int/lit16 v9, v11, 0xff

    add-int/2addr v15, v9

    and-int/lit16 v9, v6, 0xff

    add-int/2addr v15, v9

    and-int/lit16 v9, v13, 0xff

    add-int/2addr v15, v9

    and-int/lit16 v9, v14, 0xff

    add-int/2addr v15, v9

    shr-int/lit8 v9, v15, 0x3

    and-int/lit16 v9, v9, 0xff

    const/high16 v15, -0x1000000

    or-int/2addr v9, v15

    const v15, 0xff00

    and-int v16, v4, v15

    and-int v18, v5, v15

    add-int v16, v16, v18

    and-int v18, v3, v15

    add-int v16, v16, v18

    and-int v18, v7, v15

    add-int v16, v16, v18

    and-int v18, v11, v15

    add-int v16, v16, v18

    and-int v18, v6, v15

    add-int v16, v16, v18

    and-int v18, v13, v15

    add-int v16, v16, v18

    and-int v18, v14, v15

    add-int v16, v16, v18

    shr-int/lit8 v16, v16, 0x3

    and-int v15, v16, v15

    or-int/2addr v9, v15

    const/high16 v15, 0xff0000

    and-int/2addr v4, v15

    and-int/2addr v5, v15

    add-int/2addr v4, v5

    and-int/2addr v3, v15

    add-int/2addr v4, v3

    and-int v3, v7, v15

    add-int/2addr v4, v3

    and-int v3, v11, v15

    add-int/2addr v4, v3

    and-int v3, v6, v15

    add-int/2addr v4, v3

    and-int v3, v13, v15

    add-int/2addr v4, v3

    and-int v3, v14, v15

    add-int/2addr v4, v3

    shr-int/lit8 v3, v4, 0x3

    and-int/2addr v3, v15

    or-int/2addr v3, v9

    .line 35
    aput v3, v10, v12

    add-int/lit8 v2, v2, 0x1

    move/from16 v9, v17

    goto/16 :goto_2

    :cond_0
    move/from16 v17, v9

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_1
    move/from16 v17, v9

    .line 23
    div-int/lit8 v0, v0, 0x2

    goto/16 :goto_0

    :cond_2
    move/from16 v17, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v1, v10

    move v3, v8

    move v6, v8

    move/from16 v7, v17

    .line 43
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object p0
.end method

.method public static setImageViewAlpha(Landroid/widget/ImageView;I)V
    .locals 2
    .param p0    # Landroid/widget/ImageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 56
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setAlpha(I)V

    :goto_0
    return-void
.end method
