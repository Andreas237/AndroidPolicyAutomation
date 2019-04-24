.class public final Lcom/huawei/feedback/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field public static final a:Ljava/lang/String; = "t_autologupload"

.field public static final b:Ljava/lang/String; = "filePath"

.field public static final c:Ljava/lang/String; = "fileSize"

.field public static final d:Ljava/lang/String; = "uploadFlags"

.field public static final e:Ljava/lang/String; = "eventId"

.field public static final f:Ljava/lang/String; = "happenTime"

.field public static final g:Ljava/lang/String; = "metadata"

.field private static final h:Ljava/lang/String; = "AutouploadTable"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/a;)J
    .locals 7

    .line 345
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 347
    :cond_0
    const-string v0, "AutouploadTable"

    const-string v1, "insert table t_autologupload 11111111!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-wide/16 v0, -0x1

    return-wide v0

    .line 351
    :cond_1
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 353
    const-string v0, "AutouploadTable"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert table t_autologupload COL_FILE_PATH!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    const-string v0, "filePath"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    const-string v0, "fileSize"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 356
    const-string v0, "eventId"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 357
    const-string v0, "happenTime"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    const-string v0, "uploadFlags"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 359
    const-string v0, "metadata"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const-string v0, "t_autologupload"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    .line 365
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v4

    if-nez v0, :cond_4

    .line 368
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 369
    const-string v0, "INSERT INTO "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    const-string v0, "t_autologupload"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    const-string v0, " failed "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    const-string v0, "filePath = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    const-string v0, ", "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    const-string v0, "eventId = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->b()I

    move-result v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 377
    const-string v0, ", "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    const-string v0, "uploadflag = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "1"

    goto :goto_1

    :cond_3
    const-string v0, "0"

    :goto_1
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    const-string v0, ", "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    const-string v0, "happentime = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    const-string v0, "AutouploadTable"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    const-wide/16 v0, -0x1

    return-wide v0

    .line 386
    :cond_4
    const-string v0, "AutouploadTable"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert table t_autologupload pppp!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    return-wide v4
.end method

.method public static declared-synchronized a(Lcom/huawei/feedback/a/a/a;Lcom/huawei/feedback/bean/a;)J
    .locals 8

    const-class v7, Lcom/huawei/feedback/a/a/b;

    monitor-enter v7

    .line 125
    const/4 v2, 0x0

    .line 127
    const-wide/16 v3, -0x1

    .line 130
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 132
    const-string v0, "AutouploadTable"

    const-string v1, "insert table t_autologupload 0000000!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-static {v2, p1}, Lcom/huawei/feedback/a/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/a;)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    move-wide v3, v0

    .line 139
    if-eqz v2, :cond_1

    .line 142
    :try_start_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 134
    :catch_0
    move-exception v5

    .line 136
    const-string v0, "AutouploadTable"

    const-string v1, "insert table t_autologupload Error!"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    if-eqz v2, :cond_1

    .line 142
    :try_start_3
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 139
    :catchall_0
    move-exception v6

    if-eqz v2, :cond_0

    .line 142
    :try_start_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 145
    :cond_1
    :goto_0
    monitor-exit v7

    return-wide v3

    :catchall_1
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/feedback/a/a/a;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/a;)Ljava/util/List<Lcom/huawei/feedback/bean/a;>;"
        }
    .end annotation

    const-class v21, Lcom/huawei/feedback/a/a/b;

    monitor-enter v21

    .line 216
    const/4 v8, 0x0

    .line 217
    :try_start_0
    new-instance v9, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 220
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/a/a/a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 221
    if-nez v8, :cond_1

    .line 223
    move-object v10, v9

    .line 277
    if-eqz v8, :cond_0

    .line 280
    :try_start_2
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    monitor-exit v21

    return-object v10

    .line 226
    :cond_1
    move-object v0, v8

    const-string v1, "t_autologupload"

    const/4 v2, 0x7

    :try_start_3
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "fileSize"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "eventId"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "happenTime"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "uploadFlags"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "metadata"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v7, "happenTime ASC"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 235
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 238
    const-string v0, "_id"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 239
    const-string v0, "filePath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 240
    const-string v0, "fileSize"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 241
    const-string v0, "eventId"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 242
    const-string v0, "happenTime"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 243
    const-string v0, "uploadFlags"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 244
    const-string v0, "metadata"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 248
    const/16 v18, 0x0

    .line 249
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v19

    :goto_0
    if-eqz v19, :cond_3

    .line 251
    new-instance v18, Lcom/huawei/feedback/bean/a;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/feedback/bean/a;-><init>()V

    .line 252
    invoke-interface {v10, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lcom/huawei/feedback/bean/a;->a(J)V

    .line 253
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/a;->a(Ljava/lang/String;)V

    .line 254
    invoke-interface {v10, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lcom/huawei/feedback/bean/a;->b(J)V

    .line 255
    invoke-interface {v10, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/a;->a(I)V

    .line 256
    invoke-interface {v10, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/a;->b(Ljava/lang/String;)V

    .line 257
    move/from16 v0, v16

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/a;->a(Z)V

    .line 258
    move/from16 v0, v17

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/a;->c(Ljava/lang/String;)V

    .line 260
    move-object/from16 v0, v18

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v19

    goto/16 :goto_0

    .line 263
    :cond_3
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 277
    :cond_4
    if-eqz v8, :cond_6

    .line 280
    :try_start_4
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    .line 266
    :catch_0
    move-exception v10

    .line 269
    const-string v0, "AutouploadTable"

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "step one query table t_logupload all cols Error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 277
    if-eqz v8, :cond_6

    .line 280
    :try_start_6
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    .line 272
    :catch_1
    move-exception v10

    .line 273
    const-string v0, "AutouploadTable"

    :try_start_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "step two query table t_logupload all cols Error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 277
    if-eqz v8, :cond_6

    .line 280
    :try_start_8
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_2

    .line 277
    :catchall_0
    move-exception v20

    if-eqz v8, :cond_5

    .line 280
    :try_start_9
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_5
    throw v20
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 283
    :cond_6
    :goto_2
    monitor-exit v21

    return-object v9

    :catchall_1
    move-exception p0

    monitor-exit v21

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/feedback/a/a/a;Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/a;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/feedback/bean/a;>;"
        }
    .end annotation

    const-class v12, Lcom/huawei/feedback/a/a/b;

    monitor-enter v12

    .line 426
    const/4 v8, 0x0

    .line 427
    :try_start_0
    new-instance v9, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 430
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v8, v0

    .line 431
    if-eqz v8, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    .line 433
    :cond_0
    move-object v10, v9

    .line 457
    if-eqz v8, :cond_1

    .line 460
    :try_start_2
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    monitor-exit v12

    return-object v10

    .line 436
    :cond_2
    move-object v0, v8

    const-string v1, "t_autologupload"

    const/4 v2, 0x7

    :try_start_3
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "fileSize"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "eventId"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "happenTime"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "uploadFlags"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "metadata"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "filePath=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const-string v7, "happenTime ASC"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 445
    invoke-static {v10, v9}, Lcom/huawei/feedback/a/a/b;->a(Landroid/database/Cursor;Ljava/util/List;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 457
    if-eqz v8, :cond_4

    .line 460
    :try_start_4
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    .line 447
    :catch_0
    move-exception v10

    .line 449
    const-string v0, "AutouploadTable"

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query t_logupload all cols Error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 457
    if-eqz v8, :cond_4

    .line 460
    :try_start_6
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    .line 452
    :catch_1
    move-exception v10

    .line 453
    const-string v0, "AutouploadTable"

    :try_start_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query t_logupload all cols Error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 457
    if-eqz v8, :cond_4

    .line 460
    :try_start_8
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_0

    .line 457
    :catchall_0
    move-exception v11

    if-eqz v8, :cond_3

    .line 460
    :try_start_9
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_3
    throw v11
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 463
    :cond_4
    :goto_0
    monitor-exit v12

    return-object v9

    :catchall_1
    move-exception p0

    monitor-exit v12

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/feedback/a/a/a;Z)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/a;Z)Ljava/util/List<Lcom/huawei/feedback/bean/a;>;"
        }
    .end annotation

    const-class v13, Lcom/huawei/feedback/a/a/b;

    monitor-enter v13

    .line 292
    const/4 v8, 0x0

    .line 293
    :try_start_0
    new-instance v9, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 296
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 297
    if-nez v8, :cond_1

    .line 299
    move-object v10, v9

    .line 329
    if-eqz v8, :cond_0

    .line 332
    :try_start_2
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    monitor-exit v13

    return-object v10

    .line 303
    :cond_1
    if-eqz p1, :cond_2

    .line 304
    const-string v10, "1"

    goto :goto_0

    .line 306
    :cond_2
    const-string v10, "0"

    .line 308
    :goto_0
    move-object v0, v8

    const-string v1, "t_autologupload"

    const/4 v2, 0x7

    :try_start_3
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "fileSize"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "eventId"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "happenTime"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "uploadFlags"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "metadata"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "uploadFlags=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v10, v4, v5

    const-string v7, "happenTime ASC"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 317
    invoke-static {v11, v9}, Lcom/huawei/feedback/a/a/b;->a(Landroid/database/Cursor;Ljava/util/List;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 329
    if-eqz v8, :cond_4

    .line 332
    :try_start_4
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 319
    :catch_0
    move-exception v10

    .line 321
    const-string v0, "AutouploadTable"

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query table t_logupload all cols Error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 329
    if-eqz v8, :cond_4

    .line 332
    :try_start_6
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    .line 324
    :catch_1
    move-exception v10

    .line 325
    const-string v0, "AutouploadTable"

    :try_start_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query table t_logupload all cols Error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 329
    if-eqz v8, :cond_4

    .line 332
    :try_start_8
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_1

    .line 329
    :catchall_0
    move-exception v12

    if-eqz v8, :cond_3

    .line 332
    :try_start_9
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_3
    throw v12
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 335
    :cond_4
    :goto_1
    monitor-exit v13

    return-object v9

    :catchall_1
    move-exception p0

    monitor-exit v13

    throw p0
.end method

.method private static a(Landroid/database/Cursor;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/util/List<Lcom/huawei/feedback/bean/a;>;)V"
        }
    .end annotation

    .line 467
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 470
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 471
    const-string v0, "filePath"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 472
    const-string v0, "fileSize"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 473
    const-string v0, "eventId"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 474
    const-string v0, "happenTime"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 475
    const-string v0, "uploadFlags"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 476
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 479
    const/4 v9, 0x0

    .line 480
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v10

    :goto_0
    if-eqz v10, :cond_1

    .line 482
    new-instance v9, Lcom/huawei/feedback/bean/a;

    invoke-direct {v9}, Lcom/huawei/feedback/bean/a;-><init>()V

    .line 483
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/feedback/bean/a;->a(J)V

    .line 484
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/feedback/bean/a;->a(Ljava/lang/String;)V

    .line 485
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/feedback/bean/a;->b(J)V

    .line 486
    invoke-interface {p0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/feedback/bean/a;->a(I)V

    .line 487
    invoke-interface {p0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/feedback/bean/a;->b(Ljava/lang/String;)V

    .line 488
    invoke-interface {p0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v9, v0}, Lcom/huawei/feedback/bean/a;->a(Z)V

    .line 489
    invoke-interface {p0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/feedback/bean/a;->c(Ljava/lang/String;)V

    .line 491
    invoke-interface {p1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v10

    goto/16 :goto_0

    .line 494
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 496
    :cond_2
    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 92
    const-string v2, "CREATE TABLE IF NOT EXISTS t_autologupload(_id INTEGER PRIMARY KEY AUTOINCREMENT, filePath varchar(256), fileSize LONG, eventId INTEGER, happenTime varchar(256), uploadFlags INTEGER, metadata varchar(256) )"

    .line 107
    if-eqz p0, :cond_0

    .line 109
    const-string v0, "CREATE TABLE IF NOT EXISTS t_autologupload(_id INTEGER PRIMARY KEY AUTOINCREMENT, filePath varchar(256), fileSize LONG, eventId INTEGER, happenTime varchar(256), uploadFlags INTEGER, metadata varchar(256) )"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :cond_0
    goto :goto_0

    .line 111
    :catch_0
    move-exception v3

    .line 113
    const-string v0, "AutouploadTable"

    const-string v1, "create table t_autologupload Error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :goto_0
    return-void
.end method

.method public static declared-synchronized a(Lcom/huawei/feedback/a/a/a;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/a;Ljava/util/List<Lcom/huawei/feedback/bean/a;>;)V"
        }
    .end annotation

    const-class v6, Lcom/huawei/feedback/a/a/b;

    monitor-enter v6

    .line 156
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 157
    :cond_0
    const-string v0, "AutouploadTable"

    const-string v1, "step one delete table t_logupload Error!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 158
    monitor-exit v6

    return-void

    .line 161
    :cond_1
    const/4 v2, 0x0

    .line 165
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 168
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/bean/a;

    .line 169
    const-string v0, "AutouploadTable"

    const-string v1, "step two delete table t_logupload Error!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-static {v2, v4}, Lcom/huawei/feedback/a/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/a;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    goto :goto_0

    .line 178
    :cond_2
    if-eqz v2, :cond_4

    .line 181
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 173
    :catch_0
    move-exception v3

    .line 175
    const-string v0, "AutouploadTable"

    const-string v1, "step three delete table t_logupload Error!"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 178
    if-eqz v2, :cond_4

    .line 181
    :try_start_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 178
    :catchall_0
    move-exception v5

    if-eqz v2, :cond_3

    .line 181
    :try_start_5
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_3
    throw v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 184
    :cond_4
    :goto_1
    monitor-exit v6

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v6

    throw p0
.end method

.method private static b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/a;)V
    .locals 7

    .line 401
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 403
    :cond_0
    const-string v0, "AutouploadTable"

    const-string v1, "step four delete table t_logupload Error!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    return-void

    .line 406
    :cond_1
    const-string v0, "AutouploadTable"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadInfo.getDBid()!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    const-string v0, "t_autologupload"

    const-string v1, "_ID = ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->a()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 410
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 411
    const-string v0, "DELETE "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    const-string v0, "t_autologupload"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    const-string v0, " where "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    const-string v0, "_ID = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    const-string v0, "AutouploadTable"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    :cond_2
    return-void
.end method

.method public static declared-synchronized b(Lcom/huawei/feedback/a/a/a;Lcom/huawei/feedback/bean/a;)V
    .locals 6

    const-class v5, Lcom/huawei/feedback/a/a/b;

    monitor-enter v5

    .line 190
    const/4 v2, 0x0

    .line 194
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 196
    invoke-static {v2, p1}, Lcom/huawei/feedback/a/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/a;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    if-eqz v2, :cond_1

    .line 205
    :try_start_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 197
    :catch_0
    move-exception v3

    .line 199
    const-string v0, "AutouploadTable"

    const-string v1, "delete table t_logupload Error!"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 202
    if-eqz v2, :cond_1

    .line 205
    :try_start_3
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 202
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    .line 205
    :try_start_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 208
    :cond_1
    :goto_0
    monitor-exit v5

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v5

    throw p0
.end method
