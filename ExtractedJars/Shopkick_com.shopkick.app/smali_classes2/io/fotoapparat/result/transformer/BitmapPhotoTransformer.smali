.class public final Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;
.super Ljava/lang/Object;
.source "BitmapPhotoTransformer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/result/Photo;",
        "Lio/fotoapparat/result/BitmapPhoto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/result/Photo;",
        "Lio/fotoapparat/result/BitmapPhoto;",
        "sizeTransformer",
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/result/transformer/ResolutionTransformer;",
        "(Lkotlin/jvm/functions/Function1;)V",
        "invoke",
        "input",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final sizeTransformer:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/parameter/Resolution;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/parameter/Resolution;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "sizeTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;->sizeTransformer:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public invoke(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/result/BitmapPhoto;
    .locals 4
    .param p1    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-static {p1}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;->access$readResolution(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/parameter/Resolution;

    move-result-object v0

    .line 19
    iget-object v1, p0, Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;->sizeTransformer:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/fotoapparat/parameter/Resolution;

    .line 21
    invoke-static {v0, v1}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;->access$computeScaleFactor(Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)F

    move-result v0

    .line 26
    invoke-static {p1, v0}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformerKt;->access$decodeBitmap(Lio/fotoapparat/result/Photo;F)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v3, v1, Lio/fotoapparat/parameter/Resolution;->width:I

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, v1, Lio/fotoapparat/parameter/Resolution;->height:I

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    iget v2, v1, Lio/fotoapparat/parameter/Resolution;->width:I

    .line 34
    iget v1, v1, Lio/fotoapparat/parameter/Resolution;->height:I

    const/4 v3, 0x1

    .line 31
    invoke-static {v0, v2, v1, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 39
    :goto_0
    new-instance v1, Lio/fotoapparat/result/BitmapPhoto;

    const-string v2, "bitmap"

    .line 40
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget p1, p1, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    .line 39
    invoke-direct {v1, v0, p1}, Lio/fotoapparat/result/BitmapPhoto;-><init>(Landroid/graphics/Bitmap;I)V

    return-object v1

    .line 26
    :cond_1
    new-instance p1, Lio/fotoapparat/exception/UnableToDecodeBitmapException;

    invoke-direct {p1}, Lio/fotoapparat/exception/UnableToDecodeBitmapException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, Lio/fotoapparat/result/Photo;

    invoke-virtual {p0, p1}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;->invoke(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/result/BitmapPhoto;

    move-result-object p1

    return-object p1
.end method
