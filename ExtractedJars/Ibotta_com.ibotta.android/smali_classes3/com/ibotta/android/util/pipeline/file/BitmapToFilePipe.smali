.class public Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;
.super Ljava/lang/Object;
.source "BitmapToFilePipe.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "Landroid/graphics/Bitmap;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private final quality:I

.field private final saveFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/BitmapUtil;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;I)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->saveFile:Ljava/io/File;

    .line 24
    iput-object p3, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    .line 25
    iput p4, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->quality:I

    return-void
.end method


# virtual methods
.method public process(Landroid/graphics/Bitmap;)Ljava/io/File;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 31
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->saveFile:Ljava/io/File;

    iget-object v2, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    iget v3, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->quality:I

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/ibotta/android/util/BitmapUtil;->compress(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;I)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/util/BitmapUtil;->recycle(Landroid/graphics/Bitmap;)V

    .line 43
    iget-object p1, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->saveFile:Ljava/io/File;

    return-object p1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Failed to save Bitmap to file: %1$s"

    const/4 v2, 0x1

    .line 33
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->saveFile:Ljava/io/File;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 34
    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    iget-object v2, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->saveFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 38
    new-instance v2, Lcom/ibotta/android/util/pipeline/PipeProcessingException;

    invoke-direct {v2, v1, v0}, Lcom/ibotta/android/util/pipeline/PipeProcessingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/util/BitmapUtil;->recycle(Landroid/graphics/Bitmap;)V

    throw v0
.end method

.method public bridge synthetic process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 15
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;->process(Landroid/graphics/Bitmap;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method
