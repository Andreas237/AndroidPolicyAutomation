.class public Lo/cdy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 2

    .line 416
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 417
    const-string v0, "motion_path2.txt"

    invoke-static {v1, v0}, Lo/cdy;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 418
    const-string v0, "simplemotion.txt"

    invoke-static {v1, v0}, Lo/cdy;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 419
    const-string v0, "simplemotion_temp.txt"

    invoke-static {v1, v0}, Lo/cdy;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 420
    return-void
.end method

.method private static a(Ljava/io/BufferedWriter;Ljava/io/OutputStreamWriter;Ljava/io/FileOutputStream;)V
    .locals 5

    .line 268
    if-eqz p0, :cond_0

    .line 269
    :try_start_0
    invoke-virtual {p0}, Ljava/io/BufferedWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 275
    :cond_0
    goto :goto_0

    .line 271
    :catch_0
    move-exception v4

    .line 272
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWriter() bufferedWriter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    goto :goto_0

    .line 273
    :catch_1
    move-exception v4

    .line 274
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " bufferedWriter bufferedWriter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    :goto_0
    if-eqz p1, :cond_1

    .line 278
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 284
    :cond_1
    goto :goto_1

    .line 280
    :catch_2
    move-exception v4

    .line 281
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWriter() streamWriter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    goto :goto_1

    .line 282
    :catch_3
    move-exception v4

    .line 283
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWriter() streamWriter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :goto_1
    if-eqz p2, :cond_2

    .line 287
    :try_start_2
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 293
    :cond_2
    goto :goto_2

    .line 289
    :catch_4
    move-exception v4

    .line 290
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWriter() fileOutputStream "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    goto :goto_2

    .line 291
    :catch_5
    move-exception v4

    .line 292
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWriter() fileOutputStream "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    :goto_2
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 18

    .line 297
    const/4 v4, 0x0

    .line 303
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :try_start_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v8

    const/4 v9, 0x0

    .line 304
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v10

    .line 303
    const/4 v11, 0x0

    .line 306
    :try_start_2
    new-instance v12, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-direct {v12, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 307
    new-instance v13, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-direct {v13, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 308
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 310
    :cond_0
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    .line 311
    :cond_1
    const/4 v4, 0x0

    .line 314
    :cond_2
    new-instance v6, Ljava/io/ObjectInputStream;

    invoke-direct {v6, v8}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 315
    new-instance v7, Ljava/io/ObjectOutputStream;

    invoke-direct {v7, v10}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 316
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 317
    invoke-virtual {v7, v5}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 318
    invoke-virtual {v7}, Ljava/io/ObjectOutputStream;->flush()V

    .line 319
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V

    .line 320
    invoke-virtual {v7}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 321
    const/4 v4, 0x1

    .line 323
    if-eqz v10, :cond_5

    nop

    :try_start_3
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 303
    :catch_0
    move-exception v12

    move-object v11, v12

    :try_start_4
    throw v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 323
    :catchall_0
    move-exception v14

    if-eqz v10, :cond_4

    if-eqz v11, :cond_3

    :try_start_5
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catch_1
    move-exception v15

    :try_start_6
    invoke-virtual {v11, v15}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V

    :cond_4
    :goto_0
    throw v14
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_5
    :goto_1
    if-eqz v8, :cond_8

    nop

    :try_start_7
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    goto :goto_3

    .line 303
    :catch_2
    move-exception v10

    move-object v9, v10

    :try_start_8
    throw v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 323
    :catchall_1
    move-exception v16

    if-eqz v8, :cond_7

    if-eqz v9, :cond_6

    :try_start_9
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_2

    :catch_3
    move-exception v17

    move-object/from16 v0, v17

    :try_start_a
    invoke-virtual {v9, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V

    :cond_7
    :goto_2
    throw v16
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    .line 329
    :cond_8
    :goto_3
    goto :goto_4

    .line 323
    :catch_4
    move-exception v8

    .line 324
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySimpleFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    goto :goto_4

    .line 325
    :catch_5
    move-exception v8

    .line 326
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySimpleFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    goto :goto_4

    .line 327
    :catch_6
    move-exception v8

    .line 328
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySimpleFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    :goto_4
    return v4
.end method

.method public static a(Ljava/lang/Long;Landroid/content/Context;)Z
    .locals 26

    .line 200
    const/4 v4, 0x0

    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 202
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryMotionPathFile() fileLine: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    new-instance v6, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 205
    const/4 v7, 0x0

    .line 206
    const/4 v8, 0x0

    .line 207
    const/4 v9, 0x0

    .line 209
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result-object v10

    const/4 v11, 0x0

    .line 210
    :try_start_1
    new-instance v12, Ljava/io/InputStreamReader;

    const-string v0, "UTF-8"

    invoke-direct {v12, v10, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 209
    const/4 v13, 0x0

    .line 211
    :try_start_2
    new-instance v14, Ljava/io/BufferedReader;

    invoke-direct {v14, v12}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 209
    const/4 v15, 0x0

    .line 212
    :try_start_3
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 214
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    const/4 v4, 0x0

    .line 219
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 220
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 221
    const/4 v4, 0x0

    .line 222
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete file failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 224
    :cond_1
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete file success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    :cond_2
    :goto_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 229
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_3

    .line 230
    const/4 v4, 0x0

    .line 231
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create file failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 233
    :cond_3
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create file success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    :cond_4
    :goto_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    move-object v7, v0

    .line 238
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v8, v0

    .line 239
    new-instance v0, Ljava/io/BufferedWriter;

    invoke-direct {v0, v8}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    move-object v9, v0

    .line 242
    const-wide/16 v17, 0x0

    .line 243
    :cond_5
    :goto_2
    invoke-virtual {v14}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_6

    .line 244
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v17

    if-lez v0, :cond_5

    .line 245
    move-object/from16 v0, v16

    invoke-virtual {v9, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 246
    invoke-virtual {v9}, Ljava/io/BufferedWriter;->newLine()V

    .line 247
    invoke-virtual {v9}, Ljava/io/BufferedWriter;->flush()V

    .line 248
    const-wide/16 v0, 0x1

    add-long v17, v17, v0

    goto :goto_2

    .line 251
    :cond_6
    invoke-virtual {v9}, Ljava/io/BufferedWriter;->close()V

    .line 252
    invoke-virtual {v8}, Ljava/io/OutputStreamWriter;->close()V

    .line 253
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 254
    invoke-virtual {v14}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 255
    const/4 v4, 0x1

    .line 256
    if-eqz v14, :cond_9

    nop

    :try_start_4
    invoke-virtual {v14}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    .line 209
    :catch_0
    move-exception v16

    move-object/from16 v15, v16

    :try_start_5
    throw v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 256
    :catchall_0
    move-exception v19

    if-eqz v14, :cond_8

    if-eqz v15, :cond_7

    :try_start_6
    invoke-virtual {v14}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catch_1
    move-exception v20

    move-object/from16 v0, v20

    :try_start_7
    invoke-virtual {v15, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v14}, Ljava/io/BufferedReader;->close()V

    :cond_8
    :goto_3
    throw v19
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_9
    :goto_4
    if-eqz v12, :cond_c

    nop

    :try_start_8
    invoke-virtual {v12}, Ljava/io/InputStreamReader;->close()V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_6

    .line 209
    :catch_2
    move-exception v14

    move-object v13, v14

    :try_start_9
    throw v14
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 256
    :catchall_1
    move-exception v21

    if-eqz v12, :cond_b

    if-eqz v13, :cond_a

    :try_start_a
    invoke-virtual {v12}, Ljava/io/InputStreamReader;->close()V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_5

    :catch_3
    move-exception v22

    move-object/from16 v0, v22

    :try_start_b
    invoke-virtual {v13, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v12}, Ljava/io/InputStreamReader;->close()V

    :cond_b
    :goto_5
    throw v21
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :cond_c
    :goto_6
    if-eqz v10, :cond_f

    nop

    :try_start_c
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_8

    .line 209
    :catch_4
    move-exception v12

    move-object v11, v12

    :try_start_d
    throw v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 256
    :catchall_2
    move-exception v23

    if-eqz v10, :cond_e

    if-eqz v11, :cond_d

    :try_start_e
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    goto :goto_7

    :catch_5
    move-exception v24

    move-object/from16 v0, v24

    :try_start_f
    invoke-virtual {v11, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V

    :cond_e
    :goto_7
    throw v23
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 261
    :cond_f
    :goto_8
    invoke-static {v9, v8, v7}, Lo/cdy;->a(Ljava/io/BufferedWriter;Ljava/io/OutputStreamWriter;Ljava/io/FileOutputStream;)V

    .line 262
    goto :goto_9

    .line 256
    :catch_6
    move-exception v10

    .line 257
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    :try_start_10
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryMotionPathFile() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 261
    invoke-static {v9, v8, v7}, Lo/cdy;->a(Ljava/io/BufferedWriter;Ljava/io/OutputStreamWriter;Ljava/io/FileOutputStream;)V

    .line 262
    goto :goto_9

    .line 258
    :catch_7
    move-exception v10

    .line 259
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    :try_start_11
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryMotionPathFile() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 261
    invoke-static {v9, v8, v7}, Lo/cdy;->a(Ljava/io/BufferedWriter;Ljava/io/OutputStreamWriter;Ljava/io/FileOutputStream;)V

    .line 262
    goto :goto_9

    .line 261
    :catchall_3
    move-exception v25

    invoke-static {v9, v8, v7}, Lo/cdy;->a(Ljava/io/BufferedWriter;Ljava/io/OutputStreamWriter;Ljava/io/FileOutputStream;)V

    .line 262
    throw v25

    .line 263
    :goto_9
    return v4
.end method

.method public static c(Landroid/content/Context;)J
    .locals 20

    .line 171
    const-wide/16 v4, 0x0

    .line 172
    new-instance v6, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 174
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    move-result-object v7

    const/4 v8, 0x0

    .line 175
    :try_start_1
    new-instance v9, Ljava/io/InputStreamReader;

    const-string v0, "UTF-8"

    invoke-direct {v9, v7, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 174
    const/4 v10, 0x0

    .line 176
    :try_start_2
    new-instance v11, Ljava/io/LineNumberReader;

    invoke-direct {v11, v9}, Ljava/io/LineNumberReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 174
    const/4 v12, 0x0

    .line 177
    :try_start_3
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 180
    const-wide/16 v4, 0x0

    .line 184
    :cond_0
    const-string v13, ""

    .line 185
    :goto_0
    invoke-virtual {v11}, Ljava/io/LineNumberReader;->readLine()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1

    goto :goto_0

    .line 187
    :cond_1
    invoke-virtual {v11}, Ljava/io/LineNumberReader;->getLineNumber()I

    move-result v0

    int-to-long v0, v0

    move-wide v4, v0

    .line 189
    invoke-virtual {v11}, Ljava/io/LineNumberReader;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    if-eqz v11, :cond_4

    nop

    :try_start_4
    invoke-virtual {v11}, Ljava/io/LineNumberReader;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    .line 174
    :catch_0
    move-exception v13

    move-object v12, v13

    :try_start_5
    throw v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 190
    :catchall_0
    move-exception v14

    if-eqz v11, :cond_3

    if-eqz v12, :cond_2

    :try_start_6
    invoke-virtual {v11}, Ljava/io/LineNumberReader;->close()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catch_1
    move-exception v15

    :try_start_7
    invoke-virtual {v12, v15}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v11}, Ljava/io/LineNumberReader;->close()V

    :cond_3
    :goto_1
    throw v14
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_4
    :goto_2
    if-eqz v9, :cond_7

    nop

    :try_start_8
    invoke-virtual {v9}, Ljava/io/InputStreamReader;->close()V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_4

    .line 174
    :catch_2
    move-exception v11

    move-object v10, v11

    :try_start_9
    throw v11
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 190
    :catchall_1
    move-exception v16

    if-eqz v9, :cond_6

    if-eqz v10, :cond_5

    :try_start_a
    invoke-virtual {v9}, Ljava/io/InputStreamReader;->close()V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_3

    :catch_3
    move-exception v17

    move-object/from16 v0, v17

    :try_start_b
    invoke-virtual {v10, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v9}, Ljava/io/InputStreamReader;->close()V

    :cond_6
    :goto_3
    throw v16
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :cond_7
    :goto_4
    if-eqz v7, :cond_a

    nop

    :try_start_c
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    goto :goto_6

    .line 174
    :catch_4
    move-exception v9

    move-object v8, v9

    :try_start_d
    throw v9
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 190
    :catchall_2
    move-exception v18

    if-eqz v7, :cond_9

    if-eqz v8, :cond_8

    :try_start_e
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    goto :goto_5

    :catch_5
    move-exception v19

    move-object/from16 v0, v19

    :try_start_f
    invoke-virtual {v8, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V

    :cond_9
    :goto_5
    throw v18
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7

    .line 194
    :cond_a
    :goto_6
    goto :goto_7

    .line 190
    :catch_6
    move-exception v7

    .line 191
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMotionPathFileLine() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    goto :goto_7

    .line 192
    :catch_7
    move-exception v7

    .line 193
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMotionPathFileLine() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_7
    return-wide v4
.end method

.method public static c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)Z
    .locals 14

    .line 42
    const/4 v4, 0x0

    .line 43
    move-object/from16 v0, p2

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    move-result-object v5

    const/4 v6, 0x0

    .line 44
    :try_start_1
    new-instance v7, Ljava/io/ObjectOutputStream;

    invoke-direct {v7, v5}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    const/4 v8, 0x0

    .line 45
    :try_start_2
    invoke-virtual {v7, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 46
    invoke-virtual {v7}, Ljava/io/ObjectOutputStream;->flush()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    const/4 v4, 0x1

    .line 48
    if-eqz v7, :cond_2

    nop

    :try_start_3
    invoke-virtual {v7}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 43
    :catch_0
    move-exception v9

    move-object v8, v9

    :try_start_4
    throw v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 48
    :catchall_0
    move-exception v10

    if-eqz v7, :cond_1

    if-eqz v8, :cond_0

    :try_start_5
    invoke-virtual {v7}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catch_1
    move-exception v11

    :try_start_6
    invoke-virtual {v8, v11}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Ljava/io/ObjectOutputStream;->close()V

    :cond_1
    :goto_0
    throw v10
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_2
    :goto_1
    if-eqz v5, :cond_5

    nop

    :try_start_7
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_3

    .line 43
    :catch_2
    move-exception v7

    move-object v6, v7

    :try_start_8
    throw v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 48
    :catchall_1
    move-exception v12

    if-eqz v5, :cond_4

    if-eqz v6, :cond_3

    :try_start_9
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    goto :goto_2

    :catch_3
    move-exception v13

    :try_start_a
    invoke-virtual {v6, v13}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    :cond_4
    :goto_2
    throw v12
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 52
    :cond_5
    :goto_3
    goto :goto_4

    .line 48
    :catch_4
    move-exception v5

    .line 49
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSimpleFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    goto :goto_4

    .line 50
    :catch_5
    move-exception v5

    .line 51
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSimpleFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :goto_4
    return v4
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6

    .line 335
    const/4 v3, 0x0

    .line 336
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, "delete "

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    :cond_0
    return v3

    .line 341
    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v5, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 342
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 343
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2

    .line 344
    const/4 v3, 0x0

    .line 345
    const-string v0, "failed"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 348
    :cond_2
    const-string v0, "success"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const/4 v3, 0x1

    goto :goto_0

    .line 353
    :cond_3
    const-string v0, "not exist"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :goto_0
    return v3
.end method

.method public static d(Landroid/content/Context;Lo/cex;)Z
    .locals 19

    .line 99
    const/4 v4, 0x0

    .line 100
    new-instance v5, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 101
    :try_start_0
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v6, v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    const/4 v7, 0x0

    .line 102
    :try_start_1
    new-instance v8, Ljava/io/OutputStreamWriter;

    const-string v0, "UTF-8"

    invoke-direct {v8, v6, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 101
    const/4 v9, 0x0

    .line 103
    :try_start_2
    new-instance v10, Ljava/io/BufferedWriter;

    invoke-direct {v10, v8}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    const/4 v11, 0x0

    .line 105
    :try_start_3
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    const/4 v4, 0x0

    .line 111
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lo/cex;->toString()Ljava/lang/String;

    move-result-object v12

    .line 112
    invoke-virtual {v10, v12}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v10}, Ljava/io/BufferedWriter;->flush()V

    .line 114
    invoke-virtual {v10}, Ljava/io/BufferedWriter;->close()V

    .line 115
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveMotionPath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    const/4 v4, 0x1

    .line 117
    if-eqz v10, :cond_3

    nop

    :try_start_4
    invoke-virtual {v10}, Ljava/io/BufferedWriter;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 101
    :catch_0
    move-exception v12

    move-object v11, v12

    :try_start_5
    throw v12
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 117
    :catchall_0
    move-exception v13

    if-eqz v10, :cond_2

    if-eqz v11, :cond_1

    :try_start_6
    invoke-virtual {v10}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    :catch_1
    move-exception v14

    :try_start_7
    invoke-virtual {v11, v14}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v10}, Ljava/io/BufferedWriter;->close()V

    :cond_2
    :goto_0
    throw v13
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_3
    :goto_1
    if-eqz v8, :cond_6

    nop

    :try_start_8
    invoke-virtual {v8}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_3

    .line 101
    :catch_2
    move-exception v10

    move-object v9, v10

    :try_start_9
    throw v10
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 117
    :catchall_1
    move-exception v15

    if-eqz v8, :cond_5

    if-eqz v9, :cond_4

    :try_start_a
    invoke-virtual {v8}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_2

    :catch_3
    move-exception v16

    move-object/from16 v0, v16

    :try_start_b
    invoke-virtual {v9, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Ljava/io/OutputStreamWriter;->close()V

    :cond_5
    :goto_2
    throw v15
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :cond_6
    :goto_3
    if-eqz v6, :cond_9

    nop

    :try_start_c
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    goto :goto_5

    .line 101
    :catch_4
    move-exception v8

    move-object v7, v8

    :try_start_d
    throw v8
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 117
    :catchall_2
    move-exception v17

    if-eqz v6, :cond_8

    if-eqz v7, :cond_7

    :try_start_e
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    goto :goto_4

    :catch_5
    move-exception v18

    move-object/from16 v0, v18

    :try_start_f
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    :cond_8
    :goto_4
    throw v17
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7

    .line 121
    :cond_9
    :goto_5
    goto :goto_6

    .line 117
    :catch_6
    move-exception v6

    .line 118
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "1 saveMotionPath()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    goto :goto_6

    .line 119
    :catch_7
    move-exception v6

    .line 120
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "1 saveMotionPath()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_6
    return v4
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List<Lo/cfg;>;)Z"
        }
    .end annotation

    .line 360
    const/4 v4, 0x0

    .line 362
    if-eqz p2, :cond_0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 363
    :cond_0
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData trackPointDataList is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    return v4

    .line 367
    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v5, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 368
    const/4 v6, 0x0

    .line 369
    const/4 v7, 0x0

    .line 370
    const/4 v8, 0x0

    .line 373
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    move-object v6, v0

    .line 374
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v7, v0

    .line 375
    new-instance v0, Ljava/io/BufferedWriter;

    invoke-direct {v0, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    move-object v8, v0

    .line 376
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 377
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    .line 378
    const/4 v4, 0x0

    .line 381
    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cfg;

    .line 383
    invoke-virtual {v11}, Lo/cfg;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    goto :goto_0

    .line 386
    :cond_3
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 387
    invoke-virtual {v8}, Ljava/io/BufferedWriter;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 388
    const/4 v4, 0x1

    .line 396
    if-eqz v6, :cond_4

    .line 397
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 399
    :cond_4
    if-eqz v7, :cond_5

    .line 400
    invoke-virtual {v7}, Ljava/io/OutputStreamWriter;->close()V

    .line 402
    :cond_5
    if-eqz v8, :cond_6

    .line 403
    invoke-virtual {v8}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 409
    :cond_6
    goto/16 :goto_2

    .line 405
    :catch_0
    move-exception v9

    .line 406
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    goto/16 :goto_2

    .line 407
    :catch_1
    move-exception v9

    .line 408
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    goto/16 :goto_2

    .line 390
    :catch_2
    move-exception v9

    .line 391
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 396
    if-eqz v6, :cond_7

    .line 397
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 399
    :cond_7
    if-eqz v7, :cond_8

    .line 400
    invoke-virtual {v7}, Ljava/io/OutputStreamWriter;->close()V

    .line 402
    :cond_8
    if-eqz v8, :cond_9

    .line 403
    invoke-virtual {v8}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 409
    :cond_9
    goto/16 :goto_2

    .line 405
    :catch_3
    move-exception v9

    .line 406
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    goto/16 :goto_2

    .line 407
    :catch_4
    move-exception v9

    .line 408
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    goto/16 :goto_2

    .line 392
    :catch_5
    move-exception v9

    .line 393
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 396
    if-eqz v6, :cond_a

    .line 397
    :try_start_5
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 399
    :cond_a
    if-eqz v7, :cond_b

    .line 400
    invoke-virtual {v7}, Ljava/io/OutputStreamWriter;->close()V

    .line 402
    :cond_b
    if-eqz v8, :cond_c

    .line 403
    invoke-virtual {v8}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 409
    :cond_c
    goto/16 :goto_2

    .line 405
    :catch_6
    move-exception v9

    .line 406
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    goto :goto_2

    .line 407
    :catch_7
    move-exception v9

    .line 408
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    goto :goto_2

    .line 395
    :catchall_0
    move-exception v12

    .line 396
    if-eqz v6, :cond_d

    .line 397
    :try_start_6
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 399
    :cond_d
    if-eqz v7, :cond_e

    .line 400
    invoke-virtual {v7}, Ljava/io/OutputStreamWriter;->close()V

    .line 402
    :cond_e
    if-eqz v8, :cond_f

    .line 403
    invoke-virtual {v8}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9

    .line 409
    :cond_f
    goto :goto_1

    .line 405
    :catch_8
    move-exception v13

    .line 406
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    goto :goto_1

    .line 407
    :catch_9
    move-exception v13

    .line 408
    const-string v0, "Track_SaveFileData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackPointData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    :goto_1
    throw v12

    .line 411
    :goto_2
    return v4
.end method
