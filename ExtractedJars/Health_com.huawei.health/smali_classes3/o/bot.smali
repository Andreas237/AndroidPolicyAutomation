.class public Lo/bot;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const-class v0, Lo/bot;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bot;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/File;)Z
    .locals 6

    .line 154
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 156
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 159
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

    .line 163
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 164
    if-eqz v1, :cond_3

    .line 166
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 168
    invoke-static {v5}, Lo/bot;->a(Ljava/io/File;)Z

    .line 166
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 171
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 4

    .line 84
    new-instance v2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".nomedia"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "create nomedia file failed."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :cond_0
    goto :goto_0

    .line 94
    :catch_0
    move-exception v3

    .line 96
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "create nomedia file error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Ljava/io/File;)Z
    .locals 4

    .line 183
    if-nez p0, :cond_0

    .line 185
    const/4 v0, 0x0

    return v0

    .line 187
    :cond_0
    new-instance v3, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-virtual {p0, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

    .line 194
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 11

    .line 234
    const/4 v4, -0x2

    .line 235
    const/4 v5, 0x0

    .line 236
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 237
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v7

    .line 240
    if-nez v7, :cond_0

    .line 242
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "writeToFile file delete failed."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 246
    if-eqz v7, :cond_2

    .line 248
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 250
    const/4 v0, -0x2

    return v0

    .line 252
    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bot;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 254
    const/4 v0, -0x3

    return v0

    .line 259
    :cond_2
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 260
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 261
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    const/4 v4, 0x0

    .line 272
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 274
    :try_start_1
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 280
    :cond_3
    goto :goto_1

    .line 277
    :catch_0
    move-exception v8

    .line 279
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "writeToFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    goto :goto_1

    .line 264
    :catch_1
    move-exception v8

    .line 266
    :try_start_2
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "writeToFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 272
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 274
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 280
    :cond_4
    goto :goto_1

    .line 277
    :catch_2
    move-exception v8

    .line 279
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "writeToFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    goto :goto_1

    .line 270
    :catchall_0
    move-exception v9

    .line 272
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 274
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 280
    :cond_5
    goto :goto_0

    .line 277
    :catch_3
    move-exception v10

    .line 279
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "writeToFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    :goto_0
    throw v9

    .line 282
    :goto_1
    return v4
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 8

    .line 108
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_0
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bpk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 115
    const/4 v0, 0x0

    return v0

    .line 119
    :cond_1
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 123
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 125
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 127
    invoke-static {v7}, Lo/bot;->a(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 132
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 134
    :catch_0
    move-exception v2

    .line 136
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "cleanCachInDisk RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    goto :goto_1

    .line 138
    :catch_1
    move-exception v2

    .line 140
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "cleanCachInDisk Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 13

    .line 294
    const/4 v4, 0x0

    .line 295
    invoke-static {p0}, Lo/bot;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 297
    const/4 v0, -0x1

    return v0

    .line 299
    :cond_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 300
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 301
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 302
    if-eqz v7, :cond_2

    .line 304
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 306
    const/4 v0, -0x2

    return v0

    .line 308
    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bot;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 310
    const/4 v0, -0x3

    return v0

    .line 313
    :cond_2
    const/4 v8, 0x0

    .line 314
    const/4 v9, 0x0

    .line 317
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 318
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v9, v0

    .line 319
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 320
    const/4 v11, 0x0

    .line 321
    :goto_0
    invoke-virtual {v8, v10}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 323
    const/4 v0, 0x0

    invoke-virtual {v9, v10, v0, v11}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    .line 325
    :cond_3
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    invoke-static {v8}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 335
    invoke-static {v9}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 336
    goto :goto_1

    .line 327
    :catch_0
    move-exception v10

    .line 329
    :try_start_1
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "copyToFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 330
    const/4 v4, -0x2

    .line 334
    invoke-static {v8}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 335
    invoke-static {v9}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 336
    goto :goto_1

    .line 334
    :catchall_0
    move-exception v12

    invoke-static {v8}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 335
    invoke-static {v9}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 336
    throw v12

    .line 337
    :goto_1
    return v4
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 5

    .line 69
    if-nez p0, :cond_0

    .line 71
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(Ljava/lang/String;J)Z
    .locals 3

    .line 382
    invoke-static {p0}, Lo/bot;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 384
    const/4 v0, 0x0

    return v0

    .line 386
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 387
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Ljava/lang/String;)J
    .locals 9

    .line 54
    :try_start_0
    new-instance v4, Landroid/os/StatFs;

    invoke-direct {v4, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v5, v0

    .line 56
    invoke-virtual {v4}, Landroid/os/StatFs;->getAvailableBlocks()I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v7, v0

    .line 57
    mul-long v2, v7, v5

    .line 63
    goto :goto_0

    .line 59
    :catch_0
    move-exception v4

    .line 61
    const-wide/16 v2, -0x2

    .line 62
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "getFreeSpaceOfPath IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :goto_0
    return-wide v2
.end method

.method public static e(Ljava/io/File;)Z
    .locals 4

    .line 206
    const/4 v2, 0x0

    .line 207
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    move v2, v0

    .line 212
    if-nez v2, :cond_0

    .line 214
    invoke-static {p0}, Lo/bot;->b(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 220
    :cond_0
    goto :goto_0

    .line 217
    :catch_0
    move-exception v3

    .line 219
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "deleteSingleFileSafe meet exception!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    :cond_1
    :goto_0
    return v2
.end method

.method public static e(Ljava/io/InputStream;Ljava/io/File;J)Z
    .locals 8

    .line 402
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_1

    .line 404
    :cond_0
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "copyTo param is not valid."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    const/4 v0, 0x0

    return v0

    .line 408
    :cond_1
    const-wide/32 v0, 0x2000000

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    .line 410
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "copyTo byte is out of gauge"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    const/4 v0, 0x0

    return v0

    .line 417
    :cond_2
    const/4 v4, 0x0

    .line 420
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    .line 422
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_4

    .line 425
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 429
    :cond_4
    const-string v0, "hwsns-"

    const-string v1, ".tmp"

    :try_start_1
    invoke-static {v0, v1, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 434
    goto :goto_0

    .line 431
    :catch_0
    move-exception v5

    .line 433
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "create file failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    :goto_0
    if-nez v4, :cond_5

    .line 439
    const/4 v0, 0x0

    return v0

    .line 442
    :cond_5
    const/4 v5, 0x0

    .line 445
    :try_start_2
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 446
    invoke-static {p0, v5}, Lo/bpe;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v2

    .line 448
    cmp-long v0, v2, p2

    if-nez v0, :cond_6

    .line 451
    invoke-virtual {v4, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v6

    .line 460
    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    invoke-static {v4}, Lo/bot;->e(Ljava/io/File;)Z

    .line 451
    return v6

    .line 460
    :cond_6
    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    invoke-static {v4}, Lo/bot;->e(Ljava/io/File;)Z

    .line 463
    goto :goto_1

    .line 454
    :catch_1
    move-exception v6

    .line 456
    :try_start_3
    sget-object v0, Lo/bot;->a:Ljava/lang/String;

    const-string v1, "copy to file failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 460
    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    invoke-static {v4}, Lo/bot;->e(Ljava/io/File;)Z

    .line 463
    goto :goto_1

    .line 460
    :catchall_0
    move-exception v7

    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    invoke-static {v4}, Lo/bot;->e(Ljava/io/File;)Z

    .line 463
    throw v7

    .line 465
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 349
    const/4 v1, 0x1

    .line 350
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 351
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 353
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 354
    if-eqz v3, :cond_0

    array-length v0, v3

    if-nez v0, :cond_1

    .line 356
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 358
    :cond_1
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 360
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 362
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v1

    .line 364
    :cond_2
    if-nez v1, :cond_3

    .line 366
    goto :goto_1

    .line 358
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 370
    :cond_4
    :goto_1
    return v1
.end method
