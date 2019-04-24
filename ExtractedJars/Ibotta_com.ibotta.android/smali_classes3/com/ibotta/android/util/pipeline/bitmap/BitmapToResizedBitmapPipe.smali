.class public Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;
.super Ljava/lang/Object;
.source "BitmapToResizedBitmapPipe.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final targetWidthInPx:F


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/BitmapUtil;F)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 24
    iput p2, p0, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->targetWidthInPx:F

    return-void
.end method


# virtual methods
.method public process(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 29
    iget v0, p0, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->targetWidthInPx:F

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 30
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v1}, Lcom/ibotta/android/util/BitmapUtil;->createMatrix()Landroid/graphics/Matrix;

    move-result-object v8

    .line 32
    invoke-virtual {v8, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 34
    iget-object v2, p0, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v3, p1

    .line 34
    invoke-virtual/range {v2 .. v9}, Lcom/ibotta/android/util/BitmapUtil;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/util/BitmapUtil;->recycle(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public bridge synthetic process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 18
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;->process(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
