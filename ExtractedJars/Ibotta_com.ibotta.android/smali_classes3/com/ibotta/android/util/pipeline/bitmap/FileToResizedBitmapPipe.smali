.class public Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;
.super Ljava/lang/Object;
.source "FileToResizedBitmapPipe.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "Ljava/io/File;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final targetWidthInPx:I


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/BitmapUtil;I)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 31
    iput p2, p0, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->targetWidthInPx:I

    return-void
.end method


# virtual methods
.method public process(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/util/BitmapUtil;->decodeBounds(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    iget v2, p0, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->targetWidthInPx:I

    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    invoke-static {v3, v0}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->create(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object v0

    .line 37
    invoke-virtual {v1, v2, v0}, Lcom/ibotta/android/util/BitmapUtil;->calculateTargetSampleSize(ILcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;)I

    move-result v0

    .line 40
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 41
    iput v0, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/ibotta/android/util/BitmapUtil;->decodeFileToBitmap(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 45
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0
.end method

.method public bridge synthetic process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 25
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;->process(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
