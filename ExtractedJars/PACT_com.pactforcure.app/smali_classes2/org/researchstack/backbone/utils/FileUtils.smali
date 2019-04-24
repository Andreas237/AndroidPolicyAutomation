.class public Lorg/researchstack/backbone/utils/FileUtils;
.super Ljava/lang/Object;
.source "FileUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/File;)V
    .locals 5
    .param p0, "inputStream"    # Ljava/io/InputStream;
    .param p1, "output"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 68
    const/4 v1, 0x0

    .line 71
    .local v1, "outputStream":Ljava/io/OutputStream;
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 72
    .end local v1    # "outputStream":Ljava/io/OutputStream;
    .local v2, "outputStream":Ljava/io/OutputStream;
    const/4 v3, 0x0

    .line 73
    .local v3, "read":I
    const/16 v4, 0x400

    :try_start_1
    new-array v0, v4, [B

    .line 74
    .local v0, "bytes":[B
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    .line 76
    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 81
    .end local v0    # "bytes":[B
    :catchall_0
    move-exception v4

    move-object v1, v2

    .line 83
    .end local v2    # "outputStream":Ljava/io/OutputStream;
    .end local v3    # "read":I
    .restart local v1    # "outputStream":Ljava/io/OutputStream;
    :goto_1
    if-eqz p0, :cond_0

    .line 85
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 90
    :cond_0
    if-eqz v1, :cond_1

    .line 92
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    :cond_1
    throw v4

    .line 83
    .end local v1    # "outputStream":Ljava/io/OutputStream;
    .restart local v0    # "bytes":[B
    .restart local v2    # "outputStream":Ljava/io/OutputStream;
    .restart local v3    # "read":I
    :cond_2
    if-eqz p0, :cond_3

    .line 85
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :cond_3
    if-eqz v2, :cond_4

    .line 92
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 96
    :cond_4
    return-void

    .line 90
    :catchall_1
    move-exception v4

    if-eqz v2, :cond_5

    .line 92
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    :cond_5
    throw v4

    .line 90
    .end local v0    # "bytes":[B
    .end local v2    # "outputStream":Ljava/io/OutputStream;
    .end local v3    # "read":I
    .restart local v1    # "outputStream":Ljava/io/OutputStream;
    :catchall_2
    move-exception v4

    if-eqz v1, :cond_6

    .line 92
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    :cond_6
    throw v4

    .line 81
    :catchall_3
    move-exception v4

    goto :goto_1
.end method

.method public static makeParent(Ljava/io/File;)V
    .locals 4
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 44
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 46
    .local v0, "parent":Ljava/io/File;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_0

    .line 48
    new-instance v1, Lorg/researchstack/backbone/storage/file/StorageAccessException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create parent dir of file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/researchstack/backbone/storage/file/StorageAccessException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 50
    :cond_0
    return-void
.end method

.method private static makeTempFile(Ljava/io/File;)Ljava/io/File;
    .locals 3
    .param p0, "localFile"    # Ljava/io/File;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 37
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/temp/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".temp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 38
    .local v0, "temp":Ljava/io/File;
    invoke-static {v0}, Lorg/researchstack/backbone/utils/FileUtils;->makeParent(Ljava/io/File;)V

    .line 39
    return-object v0
.end method

.method public static readAll(Ljava/io/File;)[B
    .locals 5
    .param p0, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 54
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 55
    .local v2, "fileInputStream":Ljava/io/FileInputStream;
    const/16 v4, 0x400

    new-array v0, v4, [B

    .line 57
    .local v0, "buff":[B
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/16 v4, 0x800

    invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 58
    .local v1, "byteArrayOutputStream":Ljava/io/ByteArrayOutputStream;
    :goto_0
    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v3

    .local v3, "read":I
    if-lez v3, :cond_0

    .line 60
    const/4 v4, 0x0

    invoke-virtual {v1, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    return-object v4
.end method

.method public static writeSafe(Ljava/io/File;[B)V
    .locals 4
    .param p0, "file"    # Ljava/io/File;
    .param p1, "data"    # [B

    .prologue
    .line 22
    :try_start_0
    invoke-static {p0}, Lorg/researchstack/backbone/utils/FileUtils;->makeTempFile(Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    .line 23
    .local v2, "tempFile":Ljava/io/File;
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 24
    .local v1, "fileOutputStream":Ljava/io/FileOutputStream;
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 25
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 26
    invoke-virtual {v2, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-void

    .line 28
    .end local v1    # "fileOutputStream":Ljava/io/FileOutputStream;
    .end local v2    # "tempFile":Ljava/io/File;
    :catch_0
    move-exception v0

    .line 30
    .local v0, "e":Ljava/io/IOException;
    new-instance v3, Lorg/researchstack/backbone/storage/file/StorageAccessException;

    invoke-direct {v3, v0}, Lorg/researchstack/backbone/storage/file/StorageAccessException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method
