.class public final Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;
.super Ljava/lang/Object;
.source "BitmapPhotoTransformer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0001H\u0002\u001a\u000c\u0010\t\u001a\u00020\u0003*\u00020\u0007H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "computeScaleFactor",
        "",
        "originalResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "desiredResolution",
        "decodeBitmap",
        "Landroid/graphics/Bitmap;",
        "Lio/fotoapparat/result/Photo;",
        "scaleFactor",
        "readResolution",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final synthetic access$computeScaleFactor(Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)F
    .locals 0
    .param p0    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;->computeScaleFactor(Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$decodeBitmap(Lio/fotoapparat/result/Photo;F)Landroid/graphics/Bitmap;
    .locals 0
    .param p0    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;->decodeBitmap(Lio/fotoapparat/result/Photo;F)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$readResolution(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/parameter/Resolution;
    .locals 0
    .param p0    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;->readResolution(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/parameter/Resolution;

    move-result-object p0

    return-object p0
.end method

.method private static final computeScaleFactor(Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)F
    .locals 2

    .line 79
    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v0, v0

    iget v1, p1, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 80
    iget p0, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float p0, p0

    iget p1, p1, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float p1, p1

    div-float/2addr p0, p1

    .line 78
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method private static final decodeBitmap(Lio/fotoapparat/result/Photo;F)Landroid/graphics/Bitmap;
    .locals 1
    .param p0    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 48
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    float-to-int p1, p1

    .line 49
    iput p1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 52
    iget-object p1, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    .line 54
    iget-object p0, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    array-length p0, p0

    const/4 v0, 0x0

    .line 51
    invoke-static {p1, v0, p0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final readResolution(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/parameter/Resolution;
    .locals 3
    .param p0    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 59
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 60
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 63
    iget-object v1, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    .line 65
    iget-object p0, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    array-length p0, p0

    const/4 v2, 0x0

    .line 62
    invoke-static {v1, v2, p0, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 69
    new-instance p0, Lio/fotoapparat/parameter/Resolution;

    .line 70
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 71
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 69
    invoke-direct {p0, v1, v0}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    return-object p0
.end method
