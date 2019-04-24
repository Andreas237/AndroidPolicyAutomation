.class public final Lio/fotoapparat/result/transformer/SaveToFileTransformer;
.super Ljava/lang/Object;
.source "SaveToFileTransformer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/result/Photo;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveToFileTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveToFileTransformer.kt\nio/fotoapparat/result/transformer/SaveToFileTransformer\n*L\n1#1,39:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/fotoapparat/result/transformer/SaveToFileTransformer;",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/result/Photo;",
        "",
        "file",
        "Ljava/io/File;",
        "exifOrientationWriter",
        "Lio/fotoapparat/exif/ExifOrientationWriter;",
        "(Ljava/io/File;Lio/fotoapparat/exif/ExifOrientationWriter;)V",
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
.field private final exifOrientationWriter:Lio/fotoapparat/exif/ExifOrientationWriter;

.field private final file:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Lio/fotoapparat/exif/ExifOrientationWriter;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/exif/ExifOrientationWriter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exifOrientationWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/result/transformer/SaveToFileTransformer;->file:Ljava/io/File;

    iput-object p2, p0, Lio/fotoapparat/result/transformer/SaveToFileTransformer;->exifOrientationWriter:Lio/fotoapparat/exif/ExifOrientationWriter;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    check-cast p1, Lio/fotoapparat/result/Photo;

    invoke-virtual {p0, p1}, Lio/fotoapparat/result/transformer/SaveToFileTransformer;->invoke(Lio/fotoapparat/result/Photo;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public invoke(Lio/fotoapparat/result/Photo;)V
    .locals 3
    .param p1    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lio/fotoapparat/result/transformer/SaveToFileTransformer;->file:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v0, Ljava/io/OutputStream;

    const/16 v1, 0x2000

    instance-of v2, v0, Ljava/io/BufferedOutputStream;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/io/BufferedOutputStream;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-direct {v2, v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v0, v2

    .line 24
    :goto_0
    :try_start_1
    invoke-static {p1, v0}, Lio/fotoapparat/result/transformer/SaveToFileTransformerKt;->access$saveImage(Lio/fotoapparat/result/Photo;Ljava/io/BufferedOutputStream;)V

    .line 26
    iget-object v0, p0, Lio/fotoapparat/result/transformer/SaveToFileTransformer;->exifOrientationWriter:Lio/fotoapparat/exif/ExifOrientationWriter;

    iget-object v1, p0, Lio/fotoapparat/result/transformer/SaveToFileTransformer;->file:Ljava/io/File;

    iget p1, p1, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    invoke-interface {v0, v1, p1}, Lio/fotoapparat/exif/ExifOrientationWriter;->writeExifOrientation(Ljava/io/File;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 28
    new-instance v0, Lio/fotoapparat/exception/FileSaveException;

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lio/fotoapparat/exception/FileSaveException;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :catch_1
    move-exception p1

    .line 20
    new-instance v0, Lio/fotoapparat/exception/FileSaveException;

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lio/fotoapparat/exception/FileSaveException;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method
