.class public final Lio/fotoapparat/result/transformer/SaveToFileTransformerKt;
.super Ljava/lang/Object;
.source "SaveToFileTransformer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveToFileTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveToFileTransformer.kt\nio/fotoapparat/result/transformer/SaveToFileTransformerKt\n*L\n1#1,39:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "saveImage",
        "",
        "input",
        "Lio/fotoapparat/result/Photo;",
        "outputStream",
        "Ljava/io/BufferedOutputStream;",
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
.method public static final synthetic access$saveImage(Lio/fotoapparat/result/Photo;Ljava/io/BufferedOutputStream;)V
    .locals 0
    .param p0    # Lio/fotoapparat/result/Photo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/io/BufferedOutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lio/fotoapparat/result/transformer/SaveToFileTransformerKt;->saveImage(Lio/fotoapparat/result/Photo;Ljava/io/BufferedOutputStream;)V

    return-void
.end method

.method private static final saveImage(Lio/fotoapparat/result/Photo;Ljava/io/BufferedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    check-cast p1, Ljava/io/Closeable;

    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Throwable;

    :try_start_0
    move-object v1, p1

    check-cast v1, Ljava/io/BufferedOutputStream;

    .line 36
    iget-object p0, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    invoke-virtual {v1, p0}, Ljava/io/BufferedOutputStream;->write([B)V

    .line 37
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->flush()V

    .line 38
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    move-object v0, p0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p0
.end method
