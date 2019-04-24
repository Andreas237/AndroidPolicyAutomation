.class public Lo/amk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amk;->c:Landroid/content/Context;

    .line 27
    const-string v0, "defaultFileName"

    iput-object v0, p0, Lo/amk;->b:Ljava/lang/String;

    .line 28
    const-string v0, "tmpFileName"

    iput-object v0, p0, Lo/amk;->a:Ljava/lang/String;

    .line 35
    iput-object p1, p0, Lo/amk;->c:Landroid/content/Context;

    .line 36
    iput-object p2, p0, Lo/amk;->b:Ljava/lang/String;

    .line 37
    invoke-direct {p0}, Lo/amk;->a()V

    .line 39
    iget-object v0, p0, Lo/amk;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 41
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    :cond_0
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUsed not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    return-void

    .line 46
    :cond_1
    return-void
.end method

.method private a()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lo/amk;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    return-void

    .line 52
    :cond_0
    invoke-direct {p0}, Lo/amk;->d()Z

    .line 53
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/util/SparseArray;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/util/SparseArray<Lo/amd;>;)V"
        }
    .end annotation

    .line 175
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushDataFromCacheToFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    if-nez p2, :cond_0

    .line 177
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushDataFromCacheToFile,cache == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return-void

    .line 181
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/amk;->c(Landroid/content/Context;Landroid/util/SparseArray;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 182
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateTmpCacheFile failed,exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    return-void

    .line 186
    :cond_1
    invoke-direct {p0, p1}, Lo/amk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 187
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCacheFile failed,exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    return-void

    .line 192
    :cond_2
    iget-object v0, p0, Lo/amk;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 193
    iget-object v0, p0, Lo/amk;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .line 194
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 195
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "failed to rename from tmpFile to cache"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void

    .line 198
    :cond_3
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "success to rename"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-void
.end method

.method private b()Z
    .locals 8

    .line 73
    iget-object v0, p0, Lo/amk;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/amk;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 74
    iget-object v0, p0, Lo/amk;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/amk;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .line 76
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 77
    :goto_0
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 79
    :goto_1
    if-eqz v7, :cond_2

    if-eqz v6, :cond_2

    .line 80
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "crash occur double file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_3

    .line 82
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete fileTmp failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_2
    if-nez v7, :cond_3

    if-eqz v6, :cond_3

    .line 86
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "crash occur only tmp file exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 88
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rename failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const/4 v0, 0x0

    return v0

    .line 92
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private b(Landroid/content/Context;)[Ljava/lang/String;
    .locals 14

    .line 266
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseCacheFile enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v4, 0x0

    .line 268
    const/4 v5, 0x0

    .line 270
    :try_start_0
    iget-object v0, p0, Lo/amk;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v6

    .line 271
    new-instance v7, Ljava/io/InputStreamReader;

    const-string v0, "UTF-8"

    invoke-direct {v7, v6, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 272
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v5, v0

    .line 273
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 274
    const/16 v0, 0x400

    new-array v9, v0, [C

    .line 276
    :goto_0
    invoke-virtual {v5, v9}, Ljava/io/BufferedReader;->read([C)I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 277
    const/4 v0, 0x0

    invoke-virtual {v8, v9, v0, v10}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 279
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 281
    if-eqz v11, :cond_1

    .line 282
    const-string v0, "#"

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 293
    :cond_1
    if-eqz v5, :cond_3

    .line 295
    :try_start_1
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 298
    goto/16 :goto_2

    .line 296
    :catch_0
    move-exception v6

    .line 297
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    goto/16 :goto_2

    .line 284
    :catch_1
    move-exception v6

    .line 285
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseCacheFile FileNotFoundException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 293
    if-eqz v5, :cond_3

    .line 295
    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 298
    goto/16 :goto_2

    .line 296
    :catch_2
    move-exception v6

    .line 297
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    goto/16 :goto_2

    .line 286
    :catch_3
    move-exception v6

    .line 287
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseCacheFile IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 293
    if-eqz v5, :cond_3

    .line 295
    :try_start_5
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 298
    goto/16 :goto_2

    .line 296
    :catch_4
    move-exception v6

    .line 297
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    goto/16 :goto_2

    .line 288
    :catch_5
    move-exception v6

    .line 289
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x2

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseCacheFile UnsupportedOperationException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/UnsupportedOperationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 293
    if-eqz v5, :cond_3

    .line 295
    :try_start_7
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 298
    goto :goto_2

    .line 296
    :catch_6
    move-exception v6

    .line 297
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    goto :goto_2

    .line 290
    :catch_7
    move-exception v6

    .line 291
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x2

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseCacheFile IndexOutOfBoundsException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 293
    if-eqz v5, :cond_3

    .line 295
    :try_start_9
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 298
    goto :goto_2

    .line 296
    :catch_8
    move-exception v6

    .line 297
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    goto :goto_2

    .line 293
    :catchall_0
    move-exception v12

    if-eqz v5, :cond_2

    .line 295
    :try_start_a
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 298
    goto :goto_1

    .line 296
    :catch_9
    move-exception v13

    .line 297
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    :cond_2
    :goto_1
    throw v12

    .line 301
    :cond_3
    :goto_2
    return-object v4
.end method

.method private c(Landroid/content/Context;)Z
    .locals 6

    .line 305
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearFileCache"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lo/amk;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 308
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 309
    :cond_0
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearFileCache file not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    const/4 v0, 0x1

    return v0

    .line 313
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 314
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearFileCache delete!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    return v5
.end method

.method private c(Landroid/content/Context;Landroid/util/SparseArray;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/util/SparseArray<Lo/amd;>;)Z"
        }
    .end annotation

    .line 108
    invoke-direct {p0, p1}, Lo/amk;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearTempCacheFile in generateTmpCacheFile failed,exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_0
    const/4 v4, 0x0

    .line 116
    :try_start_0
    iget-object v0, p0, Lo/amk;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v4, v0

    .line 118
    if-nez v4, :cond_2

    .line 119
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FAILED TO CREATE TMP FILE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    const/4 v5, 0x0

    .line 139
    if-eqz v4, :cond_1

    .line 141
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 144
    goto :goto_0

    .line 142
    :catch_0
    move-exception v6

    .line 143
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :cond_1
    :goto_0
    return v5

    .line 122
    :cond_2
    :try_start_2
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 124
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 125
    invoke-virtual {p2, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 124
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 128
    :cond_3
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 130
    const/4 v6, 0x1

    .line 139
    if-eqz v4, :cond_4

    .line 141
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 144
    goto :goto_2

    .line 142
    :catch_1
    move-exception v7

    .line 143
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :cond_4
    :goto_2
    return v6

    .line 132
    :catch_2
    move-exception v5

    .line 133
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 139
    if-eqz v4, :cond_6

    .line 141
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 144
    goto/16 :goto_4

    .line 142
    :catch_3
    move-exception v5

    .line 143
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    goto/16 :goto_4

    .line 134
    :catch_4
    move-exception v5

    .line 135
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 139
    if-eqz v4, :cond_6

    .line 141
    :try_start_7
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 144
    goto :goto_4

    .line 142
    :catch_5
    move-exception v5

    .line 143
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    goto :goto_4

    .line 136
    :catch_6
    move-exception v5

    .line 137
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 139
    if-eqz v4, :cond_6

    .line 141
    :try_start_9
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 144
    goto :goto_4

    .line 142
    :catch_7
    move-exception v5

    .line 143
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    goto :goto_4

    .line 139
    :catchall_0
    move-exception v8

    if-eqz v4, :cond_5

    .line 141
    :try_start_a
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 144
    goto :goto_3

    .line 142
    :catch_8
    move-exception v9

    .line 143
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :cond_5
    :goto_3
    throw v8

    .line 147
    :cond_6
    :goto_4
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generate Tmp Cache failed,clearing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-direct {p0, p1}, Lo/amk;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 149
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generate Tmp Cache failed,clearing error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method private d()Z
    .locals 7

    .line 56
    iget-object v0, p0, Lo/amk;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/amk;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 57
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 58
    :cond_0
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileSizeCheck no file,do not need check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 61
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 62
    const-wide/32 v0, 0x7d000

    cmp-long v0, v5, v0

    if-lez v0, :cond_2

    .line 63
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileSize invalidate:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2

    .line 65
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileSize invalidate,delete failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return v0

    .line 69
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private e(Landroid/content/Context;)Z
    .locals 6

    .line 156
    iget-object v0, p0, Lo/amk;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 157
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearTempCacheFile no file exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const/4 v0, 0x1

    return v0

    .line 161
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 162
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearTempCacheFile delete excute"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return v5
.end method


# virtual methods
.method public c(Landroid/content/Context;Lo/ami;JJ)V
    .locals 25

    .line 205
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMemoryFromFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/amk;->b:Ljava/lang/String;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v7

    .line 209
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 210
    :cond_0
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "file not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    return-void

    .line 214
    :cond_1
    invoke-static/range {p3 .. p4}, Lo/amz;->b(J)J

    move-result-wide v8

    .line 215
    invoke-static/range {p5 .. p6}, Lo/amz;->b(J)J

    move-result-wide v10

    .line 217
    const/4 v12, 0x0

    .line 218
    const/4 v13, 0x0

    .line 220
    const-wide/16 v14, 0x0

    .line 221
    const/16 v16, 0x0

    .line 222
    const/16 v17, 0x0

    .line 223
    const/16 v18, 0x0

    .line 224
    const/16 v19, 0x0

    .line 225
    const-wide/16 v20, 0x0

    .line 227
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/amk;->b(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v22

    .line 228
    if-eqz v22, :cond_7

    move-object/from16 v0, v22

    array-length v0, v0

    if-lez v0, :cond_7

    .line 229
    const/16 v23, 0x0

    :goto_0
    move-object/from16 v0, v22

    array-length v0, v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_6

    .line 230
    aget-object v12, v22, v23

    .line 231
    if-eqz v12, :cond_5

    .line 232
    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 233
    if-nez v13, :cond_2

    .line 234
    goto/16 :goto_2

    .line 236
    :cond_2
    array-length v0, v13

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    .line 237
    goto :goto_2

    .line 241
    :cond_3
    const/4 v0, 0x0

    aget-object v0, v13, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v24

    .line 242
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 243
    const-wide/16 v20, 0x0

    goto :goto_1

    .line 245
    :cond_4
    invoke-static/range {v24 .. v24}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v20

    .line 249
    :goto_1
    cmp-long v0, v20, v8

    if-ltz v0, :cond_5

    cmp-long v0, v20, v10

    if-gtz v0, :cond_5

    .line 250
    const-wide/32 v0, 0xea60

    mul-long v14, v20, v0

    .line 251
    const/4 v0, 0x1

    aget-object v0, v13, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v16

    .line 252
    const/4 v0, 0x2

    aget-object v0, v13, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    .line 253
    const/4 v0, 0x3

    aget-object v0, v13, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v18

    .line 254
    const/4 v0, 0x4

    aget-object v0, v13, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v19

    .line 255
    move-object/from16 v0, p2

    move/from16 v1, v16

    move-wide v2, v14

    move/from16 v4, v17

    move/from16 v5, v18

    move/from16 v6, v19

    invoke-virtual/range {v0 .. v6}, Lo/ami;->d(IJIII)V

    .line 229
    :cond_5
    :goto_2
    add-int/lit8 v23, v23, 0x1

    goto/16 :goto_0

    .line 259
    :cond_6
    return-void

    .line 261
    :cond_7
    return-void
.end method

.method public d(Landroid/content/Context;Landroid/util/SparseArray;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/util/SparseArray<Lo/amd;>;)I"
        }
    .end annotation

    .line 97
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 98
    :cond_0
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cache == null || cache.size() <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    return v0

    .line 102
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/amk;->b(Landroid/content/Context;Landroid/util/SparseArray;)V

    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/content/Context;)Z
    .locals 4

    .line 320
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-direct {p0, p1}, Lo/amk;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 323
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearTempCacheFile in clear failed,exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const/4 v0, 0x0

    return v0

    .line 327
    :cond_0
    invoke-direct {p0, p1}, Lo/amk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 328
    const-string v0, "Step_DataFileCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearCacheFile in clear failed,exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const/4 v0, 0x0

    return v0

    .line 332
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
