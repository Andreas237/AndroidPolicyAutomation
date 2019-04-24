.class public Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;
.super Ljava/lang/Object;
.source "ByteArrayToFilePipe.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "Ljava/io/ByteArrayOutputStream;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field private final fileIO:Lcom/ibotta/android/util/FileIO;

.field private final saveFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/FileIO;Ljava/io/File;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->fileIO:Lcom/ibotta/android/util/FileIO;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->saveFile:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public process(Ljava/io/ByteArrayOutputStream;)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 28
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->fileIO:Lcom/ibotta/android/util/FileIO;

    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->saveFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/util/FileIO;->writeBytesToFile(Ljava/io/File;[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->saveFile:Ljava/io/File;

    return-object p1

    :catch_0
    move-exception p1

    const/4 v0, 0x1

    .line 30
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->saveFile:Ljava/io/File;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "Failed to save byte[] array to file: %1$s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 31
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    new-instance v1, Lcom/ibotta/android/util/pipeline/PipeProcessingException;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/util/pipeline/PipeProcessingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 16
    check-cast p1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;->process(Ljava/io/ByteArrayOutputStream;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method
