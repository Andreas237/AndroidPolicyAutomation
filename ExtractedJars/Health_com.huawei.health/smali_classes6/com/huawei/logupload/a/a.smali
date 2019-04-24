.class public final Lcom/huawei/logupload/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field public static final A:Ljava/lang/String; = "logDetailInfo"

.field public static final B:Ljava/lang/String; = "productName"

.field public static final C:Ljava/lang/String; = "romVersion"

.field public static final D:Ljava/lang/String; = "isPause"

.field private static final E:Ljava/lang/String; = "LoguploadTable"

.field public static final a:Ljava/lang/String; = "t_logupload"

.field public static final b:Ljava/lang/String; = "sendType"

.field public static final c:Ljava/lang/String; = "filePath"

.field public static final d:Ljava/lang/String; = "transactionId"

.field public static final e:Ljava/lang/String; = "fileSize"

.field public static final f:Ljava/lang/String; = "encrypt"

.field public static final g:Ljava/lang/String; = "privacy"

.field public static final h:Ljava/lang/String; = "uploadFlags"

.field public static final i:Ljava/lang/String; = "policy"

.field public static final j:Ljava/lang/String; = "token"

.field public static final k:Ljava/lang/String; = "secret"

.field public static final l:Ljava/lang/String; = "uploadPath"

.field public static final m:Ljava/lang/String; = "timeStamp"

.field public static final n:Ljava/lang/String; = "callBackAddress"

.field public static final o:Ljava/lang/String; = "uploadAddress"

.field public static final p:Ljava/lang/String; = "uploadType"

.field public static final q:Ljava/lang/String; = "contentRange"

.field public static final r:Ljava/lang/String; = "taskId"

.field public static final s:Ljava/lang/String; = "taskCreateTime"

.field public static final t:Ljava/lang/String; = "refresh"

.field public static final u:Ljava/lang/String; = "encryptFilePath"

.field public static final v:Ljava/lang/String; = "channelId"

.field public static final w:Ljava/lang/String; = "feedBackPackageName"

.field public static final x:Ljava/lang/String; = "feedBackClassName"

.field public static final y:Ljava/lang/String; = "userType"

.field public static final z:Ljava/lang/String; = "zipTime"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/logupload/LogUpload;)J
    .locals 8

    .line 715
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 717
    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0

    .line 720
    :cond_1
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 721
    const-string v0, "transactionId"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 722
    const-string v0, "sendType"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "1"

    goto :goto_0

    :cond_2
    const-string v1, "0"

    :goto_0
    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 723
    const-string v0, "filePath"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    const-string v0, "fileSize"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 725
    const-string v0, "encrypt"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->l()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "1"

    goto :goto_1

    :cond_3
    const-string v1, "0"

    :goto_1
    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    const-string v0, "privacy"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->r()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "1"

    goto :goto_2

    :cond_4
    const-string v1, "0"

    :goto_2
    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    const-string v0, "uploadFlags"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 728
    const-string v0, "channelId"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 729
    const-string v0, "feedBackPackageName"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    const-string v0, "feedBackClassName"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    const-string v0, "userType"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 733
    const-string v0, "zipTime"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 734
    const-string v0, "logDetailInfo"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 735
    const-string v0, "productName"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    const-string v0, "romVersion"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 737
    const-string v0, "isPause"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 740
    const-string v0, "secret"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 748
    const-string v0, "taskCreateTime"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 750
    const-string v0, "t_logupload"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v6

    .line 752
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v6

    if-nez v0, :cond_6

    .line 817
    const-wide/16 v0, -0x1

    return-wide v0

    .line 819
    :cond_6
    return-wide v6
.end method

.method public static declared-synchronized a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;)J
    .locals 8

    const-class v7, Lcom/huawei/logupload/a/a;

    monitor-enter v7

    .line 312
    const/4 v2, 0x0

    .line 313
    const-wide/16 v3, -0x1

    .line 317
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/logupload/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 319
    invoke-static {v2, p1}, Lcom/huawei/logupload/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/logupload/LogUpload;)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    move-wide v3, v0

    .line 320
    goto :goto_0

    :catch_0
    move-exception v5

    .line 322
    const-string v0, "LoguploadTable"

    const-string v1, "insert table t_logupload Error!"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    if-eqz v2, :cond_1

    .line 328
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 324
    :catchall_0
    move-exception v6

    .line 325
    if-eqz v2, :cond_0

    .line 328
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 330
    :cond_0
    throw v6

    .line 325
    :goto_0
    if-eqz v2, :cond_1

    .line 328
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 331
    :cond_1
    :goto_1
    monitor-exit v7

    return-wide v3

    :catchall_1
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    const-class v13, Lcom/huawei/logupload/a/a;

    monitor-enter v13

    .line 393
    const/4 v8, 0x0

    .line 394
    const-string v9, ""

    .line 397
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/logupload/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 398
    if-nez v8, :cond_1

    .line 433
    if-eqz v8, :cond_0

    .line 436
    :try_start_1
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 401
    :cond_0
    const-string v0, ""

    monitor-exit v13

    return-object v0

    .line 404
    :cond_1
    move-object v0, v8

    const-string v1, "t_logupload"

    .line 405
    const/4 v2, 0x1

    :try_start_2
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "isPause"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 406
    const-string v3, "transactionId=?"

    .line 407
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    .line 404
    .line 408
    .line 409
    .line 410
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 412
    if-eqz v10, :cond_4

    .line 416
    const-string v0, "isPause"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 417
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 418
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    goto :goto_0

    .line 420
    :cond_2
    invoke-interface {v10, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    .line 418
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 424
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 427
    goto :goto_1

    .line 428
    :catch_0
    move-exception v10

    .line 430
    const-string v0, "LoguploadTable"

    const-string v1, "getPauseStauts Error"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 433
    if-eqz v8, :cond_5

    .line 436
    :try_start_4
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_2

    .line 432
    :catchall_0
    move-exception v12

    .line 433
    if-eqz v8, :cond_3

    .line 436
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 438
    :cond_3
    throw v12

    .line 433
    :cond_4
    :goto_1
    if-eqz v8, :cond_5

    .line 436
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 439
    :cond_5
    :goto_2
    monitor-exit v13

    return-object v9

    :catchall_1
    move-exception p0

    monitor-exit v13

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/logupload/a/c;)Ljava/util/List;
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/logupload/a/c;)Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation

    const-class v44, Lcom/huawei/logupload/a/a;

    monitor-enter v44

    .line 449
    const/4 v8, 0x0

    .line 450
    :try_start_0
    new-instance v9, Ljava/util/ArrayList;

    const/16 v0, 0x64

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 454
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/logupload/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 456
    if-nez v8, :cond_1

    .line 458
    move-object/from16 v43, v9

    .line 569
    if-eqz v8, :cond_0

    .line 572
    :try_start_2
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 458
    :cond_0
    monitor-exit v44

    return-object v43

    .line 461
    :cond_1
    move-object v0, v8

    const-string v1, "t_logupload"

    .line 462
    const/16 v2, 0x1d

    :try_start_3
    new-array v2, v2, [Ljava/lang/String;

    .line 462
    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "transactionId"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "sendType"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "fileSize"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "encrypt"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    .line 463
    const-string v3, "privacy"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "uploadFlags"

    const/4 v4, 0x7

    aput-object v3, v2, v4

    const-string v3, "policy"

    const/16 v4, 0x8

    aput-object v3, v2, v4

    const-string v3, "token"

    const/16 v4, 0x9

    aput-object v3, v2, v4

    const-string v3, "secret"

    const/16 v4, 0xa

    aput-object v3, v2, v4

    const-string v3, "uploadPath"

    const/16 v4, 0xb

    aput-object v3, v2, v4

    const-string v3, "timeStamp"

    const/16 v4, 0xc

    aput-object v3, v2, v4

    .line 464
    const-string v3, "callBackAddress"

    const/16 v4, 0xd

    aput-object v3, v2, v4

    const-string v3, "uploadAddress"

    const/16 v4, 0xe

    aput-object v3, v2, v4

    const-string v3, "uploadType"

    const/16 v4, 0xf

    aput-object v3, v2, v4

    const-string v3, "contentRange"

    const/16 v4, 0x10

    aput-object v3, v2, v4

    const-string v3, "refresh"

    const/16 v4, 0x11

    aput-object v3, v2, v4

    .line 465
    const-string v3, "encryptFilePath"

    const/16 v4, 0x12

    aput-object v3, v2, v4

    const-string v3, "channelId"

    const/16 v4, 0x13

    aput-object v3, v2, v4

    const-string v3, "feedBackPackageName"

    const/16 v4, 0x14

    aput-object v3, v2, v4

    const-string v3, "feedBackClassName"

    const/16 v4, 0x15

    aput-object v3, v2, v4

    const-string v3, "userType"

    const/16 v4, 0x16

    aput-object v3, v2, v4

    const-string v3, "taskCreateTime"

    const/16 v4, 0x17

    aput-object v3, v2, v4

    .line 466
    const-string v3, "zipTime"

    const/16 v4, 0x18

    aput-object v3, v2, v4

    const-string v3, "logDetailInfo"

    const/16 v4, 0x19

    aput-object v3, v2, v4

    const-string v3, "productName"

    const/16 v4, 0x1a

    aput-object v3, v2, v4

    const-string v3, "romVersion"

    const/16 v4, 0x1b

    aput-object v3, v2, v4

    const-string v3, "isPause"

    const/16 v4, 0x1c

    aput-object v3, v2, v4

    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    const-string v7, "fileSize ASC"

    .line 461
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 473
    if-eqz v10, :cond_c

    .line 476
    const-string v0, "_id"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 477
    const-string v0, "transactionId"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 478
    const-string v0, "sendType"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 479
    const-string v0, "filePath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 480
    const-string v0, "fileSize"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 481
    const-string v0, "encrypt"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 482
    const-string v0, "privacy"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 483
    const-string v0, "uploadFlags"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 484
    const-string v0, "policy"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 485
    const-string v0, "token"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 486
    const-string v0, "secret"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 487
    const-string v0, "uploadPath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 488
    const-string v0, "timeStamp"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    .line 489
    const-string v0, "callBackAddress"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    .line 490
    const-string v0, "uploadAddress"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v25

    .line 491
    const-string v0, "uploadType"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v26

    .line 492
    const-string v0, "contentRange"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v27

    .line 494
    const-string v0, "encryptFilePath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v28

    .line 495
    const-string v0, "refresh"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v29

    .line 496
    const-string v0, "channelId"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v30

    .line 497
    const-string v0, "feedBackPackageName"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v31

    .line 498
    const-string v0, "feedBackClassName"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v32

    .line 499
    const-string v0, "userType"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v33

    .line 500
    const-string v0, "taskCreateTime"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v34

    .line 502
    const-string v0, "zipTime"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v35

    .line 503
    const-string v0, "logDetailInfo"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v36

    .line 504
    const-string v0, "productName"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v37

    .line 505
    const-string v0, "romVersion"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v38

    .line 506
    const-string v0, "isPause"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v39

    .line 509
    const/16 v40, 0x0

    .line 510
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v41

    goto/16 :goto_4

    .line 512
    :cond_2
    new-instance v40, Lcom/huawei/logupload/LogUpload;

    invoke-direct/range {v40 .. v40}, Lcom/huawei/logupload/LogUpload;-><init>()V

    .line 513
    invoke-interface {v10, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    move-object/from16 v2, v40

    invoke-virtual {v2, v0, v1}, Lcom/huawei/logupload/LogUpload;->a(J)V

    .line 514
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-object/from16 v2, v40

    invoke-virtual {v2, v0, v1}, Lcom/huawei/logupload/LogUpload;->b(J)V

    .line 515
    invoke-interface {v10, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 516
    invoke-interface {v10, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->a(Z)V

    .line 518
    :cond_4
    invoke-interface {v10, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->g(Ljava/lang/String;)V

    .line 519
    invoke-interface {v10, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-object/from16 v2, v40

    invoke-virtual {v2, v0, v1}, Lcom/huawei/logupload/LogUpload;->c(J)V

    .line 520
    move/from16 v0, v16

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 521
    move/from16 v0, v16

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->b(Z)V

    .line 523
    :cond_6
    move/from16 v0, v17

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 524
    move/from16 v0, v17

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->c(Z)V

    .line 527
    :cond_8
    move/from16 v0, v18

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->a(I)V

    .line 528
    move/from16 v0, v19

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->h(Ljava/lang/String;)V

    .line 529
    move/from16 v0, v20

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->i(Ljava/lang/String;)V

    .line 530
    move/from16 v0, v21

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->j(Ljava/lang/String;)V

    .line 531
    move/from16 v0, v22

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->k(Ljava/lang/String;)V

    .line 532
    move/from16 v0, v23

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->l(Ljava/lang/String;)V

    .line 533
    move/from16 v0, v24

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->m(Ljava/lang/String;)V

    .line 534
    move/from16 v0, v25

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->n(Ljava/lang/String;)V

    .line 535
    move/from16 v0, v26

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 536
    move/from16 v0, v27

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->o(Ljava/lang/String;)V

    .line 538
    move/from16 v0, v28

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->p(Ljava/lang/String;)V

    .line 539
    move/from16 v0, v30

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->e(I)V

    .line 540
    move/from16 v0, v31

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->q(Ljava/lang/String;)V

    .line 541
    move/from16 v0, v32

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->r(Ljava/lang/String;)V

    .line 542
    move/from16 v0, v33

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 543
    move/from16 v0, v35

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->e(Ljava/lang/String;)V

    .line 544
    move/from16 v0, v36

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->f(Ljava/lang/String;)V

    .line 545
    move/from16 v0, v37

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->a(Ljava/lang/String;)V

    .line 546
    move/from16 v0, v38

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->b(Ljava/lang/String;)V

    .line 547
    move/from16 v0, v39

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 548
    move/from16 v0, v29

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 549
    move/from16 v0, v29

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_3

    :cond_9
    const/4 v0, 0x0

    :goto_3
    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/logupload/LogUpload;->d(Z)V

    .line 551
    :cond_a
    move/from16 v0, v34

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-object/from16 v2, v40

    invoke-virtual {v2, v0, v1}, Lcom/huawei/logupload/LogUpload;->d(J)V

    .line 553
    move-object/from16 v0, v40

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 510
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v41

    :goto_4
    if-nez v41, :cond_2

    .line 556
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 558
    goto :goto_5

    .line 559
    :catch_0
    move-exception v10

    .line 561
    const-string v0, "LoguploadTable"

    const-string v1, "query table t_logupload all cols Error"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 569
    if-eqz v8, :cond_d

    .line 572
    :try_start_5
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_6

    .line 564
    :catch_1
    move-exception v10

    .line 565
    const-string v0, "LoguploadTable"

    const-string v1, "query table t_logupload all cols Error"

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 569
    if-eqz v8, :cond_d

    .line 572
    :try_start_7
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_6

    .line 568
    :catchall_0
    move-exception v42

    .line 569
    if-eqz v8, :cond_b

    .line 572
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 574
    :cond_b
    throw v42

    .line 569
    :cond_c
    :goto_5
    if-eqz v8, :cond_d

    .line 572
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 575
    :cond_d
    :goto_6
    monitor-exit v44

    return-object v9

    :catchall_1
    move-exception p0

    monitor-exit v44

    throw p0
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 191
    const-string v2, "CREATE TABLE IF NOT EXISTS t_logupload(_id INTEGER PRIMARY KEY AUTOINCREMENT, transactionId LONG, sendType varchar(4), filePath varchar(256), fileSize LONG, encrypt varchar(4), privacy varchar(4), uploadFlags INTEGER, policy varchar(256), token varchar(256), secret varchar(256), uploadPath varchar(256), timeStamp varchar(256), callBackAddress varchar(256), uploadAddress varchar(256), uploadType INTEGER, contentRange varchar(256), refresh varchar(4), encryptFilePath varchar(256), channelId INTEGER, feedBackPackageName varchar(256), feedBackClassName varchar(256), userType INTEGER, zipTime varchar(256), logDetailInfo varchar(1024), productName varchar(256), romVersion varchar(256), isPause varchar(4), taskCreateTime LONG)"

    .line 229
    if-eqz p0, :cond_0

    .line 231
    const-string v0, "CREATE TABLE IF NOT EXISTS t_logupload(_id INTEGER PRIMARY KEY AUTOINCREMENT, transactionId LONG, sendType varchar(4), filePath varchar(256), fileSize LONG, encrypt varchar(4), privacy varchar(4), uploadFlags INTEGER, policy varchar(256), token varchar(256), secret varchar(256), uploadPath varchar(256), timeStamp varchar(256), callBackAddress varchar(256), uploadAddress varchar(256), uploadType INTEGER, contentRange varchar(256), refresh varchar(4), encryptFilePath varchar(256), channelId INTEGER, feedBackPackageName varchar(256), feedBackClassName varchar(256), userType INTEGER, zipTime varchar(256), logDetailInfo varchar(1024), productName varchar(256), romVersion varchar(256), isPause varchar(4), taskCreateTime LONG)"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    goto :goto_0

    :catch_0
    move-exception v3

    .line 235
    const-string v0, "LoguploadTable"

    const-string v1, "create table t_logupload Error"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    :cond_0
    :goto_0
    return-void
.end method

.method private static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/logupload/LogUpload;Z)V
    .locals 7

    .line 830
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 832
    :cond_0
    return-void

    .line 836
    :cond_1
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 837
    const-string v0, "policy"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 838
    const-string v0, "token"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    const-string v0, "secret"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    const-string v0, "uploadPath"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    const-string v0, "timeStamp"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    const-string v0, "callBackAddress"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    const-string v0, "uploadAddress"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 844
    const-string v0, "uploadType"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 845
    const-string v0, "contentRange"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 847
    const-string v0, "refresh"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->x()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "1"

    goto :goto_0

    :cond_2
    const-string v1, "0"

    :goto_0
    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 848
    const-string v0, "encryptFilePath"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 850
    const-string v0, "zipTime"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 851
    const-string v0, "logDetailInfo"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 852
    const-string v0, "productName"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 853
    const-string v0, "romVersion"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    if-eqz p2, :cond_3

    .line 857
    const-string v0, "isPause"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 861
    :cond_3
    const-string v0, "t_logupload"

    const-string v1, "_ID = ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v6, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 927
    return-void
.end method

.method public static declared-synchronized a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    .locals 6

    const-class v5, Lcom/huawei/logupload/a/a;

    monitor-enter v5

    .line 342
    const/4 v2, 0x0

    .line 346
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/logupload/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 348
    invoke-static {v2, p1, p2}, Lcom/huawei/logupload/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    goto :goto_0

    :catch_0
    move-exception v3

    .line 351
    const-string v0, "LoguploadTable"

    const-string v1, "update table t_logupload Error!"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    if-eqz v2, :cond_1

    .line 357
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 353
    :catchall_0
    move-exception v4

    .line 354
    if-eqz v2, :cond_0

    .line 357
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 359
    :cond_0
    throw v4

    .line 354
    :goto_0
    if-eqz v2, :cond_1

    .line 357
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 360
    :cond_1
    :goto_1
    monitor-exit v5

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method public static declared-synchronized b(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;
    .locals 43

    const-class v42, Lcom/huawei/logupload/a/a;

    monitor-enter v42

    .line 585
    const/4 v8, 0x0

    .line 586
    const/4 v9, 0x0

    .line 590
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/logupload/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 591
    if-nez v8, :cond_1

    .line 699
    if-eqz v8, :cond_0

    .line 702
    :try_start_1
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 594
    :cond_0
    monitor-exit v42

    const/4 v0, 0x0

    return-object v0

    .line 597
    :cond_1
    move-object v0, v8

    const-string v1, "t_logupload"

    .line 598
    const/16 v2, 0x1d

    :try_start_2
    new-array v2, v2, [Ljava/lang/String;

    .line 598
    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "transactionId"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "sendType"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "fileSize"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "encrypt"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    .line 599
    const-string v3, "privacy"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "uploadFlags"

    const/4 v4, 0x7

    aput-object v3, v2, v4

    const-string v3, "policy"

    const/16 v4, 0x8

    aput-object v3, v2, v4

    const-string v3, "token"

    const/16 v4, 0x9

    aput-object v3, v2, v4

    const-string v3, "secret"

    const/16 v4, 0xa

    aput-object v3, v2, v4

    const-string v3, "uploadPath"

    const/16 v4, 0xb

    aput-object v3, v2, v4

    const-string v3, "timeStamp"

    const/16 v4, 0xc

    aput-object v3, v2, v4

    .line 600
    const-string v3, "callBackAddress"

    const/16 v4, 0xd

    aput-object v3, v2, v4

    const-string v3, "uploadAddress"

    const/16 v4, 0xe

    aput-object v3, v2, v4

    const-string v3, "uploadType"

    const/16 v4, 0xf

    aput-object v3, v2, v4

    const-string v3, "contentRange"

    const/16 v4, 0x10

    aput-object v3, v2, v4

    const-string v3, "refresh"

    const/16 v4, 0x11

    aput-object v3, v2, v4

    .line 601
    const-string v3, "encryptFilePath"

    const/16 v4, 0x12

    aput-object v3, v2, v4

    const-string v3, "channelId"

    const/16 v4, 0x13

    aput-object v3, v2, v4

    const-string v3, "feedBackPackageName"

    const/16 v4, 0x14

    aput-object v3, v2, v4

    const-string v3, "feedBackClassName"

    const/16 v4, 0x15

    aput-object v3, v2, v4

    const-string v3, "userType"

    const/16 v4, 0x16

    aput-object v3, v2, v4

    const-string v3, "taskCreateTime"

    const/16 v4, 0x17

    aput-object v3, v2, v4

    .line 602
    const-string v3, "zipTime"

    const/16 v4, 0x18

    aput-object v3, v2, v4

    const-string v3, "logDetailInfo"

    const/16 v4, 0x19

    aput-object v3, v2, v4

    const-string v3, "productName"

    const/16 v4, 0x1a

    aput-object v3, v2, v4

    const-string v3, "romVersion"

    const/16 v4, 0x1b

    aput-object v3, v2, v4

    const-string v3, "isPause"

    const/16 v4, 0x1c

    aput-object v3, v2, v4

    .line 603
    const-string v3, "transactionId=?"

    .line 604
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    .line 597
    .line 605
    .line 606
    .line 607
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 609
    if-eqz v10, :cond_c

    .line 613
    const-string v0, "_id"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 614
    const-string v0, "transactionId"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 615
    const-string v0, "sendType"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 616
    const-string v0, "filePath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 617
    const-string v0, "fileSize"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 618
    const-string v0, "encrypt"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 619
    const-string v0, "privacy"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 620
    const-string v0, "uploadFlags"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 621
    const-string v0, "policy"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 622
    const-string v0, "token"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 623
    const-string v0, "secret"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 624
    const-string v0, "uploadPath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 625
    const-string v0, "timeStamp"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    .line 626
    const-string v0, "callBackAddress"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    .line 627
    const-string v0, "uploadAddress"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v25

    .line 628
    const-string v0, "uploadType"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v26

    .line 629
    const-string v0, "contentRange"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v27

    .line 631
    const-string v0, "encryptFilePath"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v28

    .line 632
    const-string v0, "refresh"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v29

    .line 633
    const-string v0, "channelId"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v30

    .line 634
    const-string v0, "feedBackPackageName"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v31

    .line 635
    const-string v0, "feedBackClassName"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v32

    .line 636
    const-string v0, "userType"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v33

    .line 637
    const-string v0, "taskCreateTime"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v34

    .line 639
    const-string v0, "zipTime"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v35

    .line 640
    const-string v0, "logDetailInfo"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v36

    .line 641
    const-string v0, "productName"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v37

    .line 642
    const-string v0, "romVersion"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v38

    .line 643
    const-string v0, "isPause"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v39

    .line 646
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v40

    goto/16 :goto_4

    .line 649
    :cond_2
    new-instance v0, Lcom/huawei/logupload/LogUpload;

    invoke-direct {v0}, Lcom/huawei/logupload/LogUpload;-><init>()V

    move-object v9, v0

    .line 650
    invoke-interface {v10, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/logupload/LogUpload;->a(J)V

    .line 651
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/logupload/LogUpload;->b(J)V

    .line 652
    invoke-interface {v10, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 653
    invoke-interface {v10, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->a(Z)V

    .line 655
    :cond_4
    invoke-interface {v10, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->g(Ljava/lang/String;)V

    .line 656
    invoke-interface {v10, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/logupload/LogUpload;->c(J)V

    .line 657
    move/from16 v0, v16

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 658
    move/from16 v0, v16

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->b(Z)V

    .line 660
    :cond_6
    move/from16 v0, v17

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 661
    move/from16 v0, v17

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->c(Z)V

    .line 664
    :cond_8
    move/from16 v0, v18

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->a(I)V

    .line 665
    move/from16 v0, v19

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->h(Ljava/lang/String;)V

    .line 666
    move/from16 v0, v20

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->i(Ljava/lang/String;)V

    .line 667
    move/from16 v0, v21

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->j(Ljava/lang/String;)V

    .line 668
    move/from16 v0, v22

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->k(Ljava/lang/String;)V

    .line 669
    move/from16 v0, v23

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->l(Ljava/lang/String;)V

    .line 670
    move/from16 v0, v24

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->m(Ljava/lang/String;)V

    .line 671
    move/from16 v0, v25

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->n(Ljava/lang/String;)V

    .line 672
    move/from16 v0, v26

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 673
    move/from16 v0, v27

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->o(Ljava/lang/String;)V

    .line 675
    move/from16 v0, v28

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->p(Ljava/lang/String;)V

    .line 676
    move/from16 v0, v30

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->e(I)V

    .line 677
    move/from16 v0, v31

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->q(Ljava/lang/String;)V

    .line 678
    move/from16 v0, v32

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->r(Ljava/lang/String;)V

    .line 679
    move/from16 v0, v33

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 680
    move/from16 v0, v35

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->e(Ljava/lang/String;)V

    .line 681
    move/from16 v0, v36

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->f(Ljava/lang/String;)V

    .line 682
    move/from16 v0, v37

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->a(Ljava/lang/String;)V

    .line 683
    move/from16 v0, v38

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->b(Ljava/lang/String;)V

    .line 684
    move/from16 v0, v39

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 685
    move/from16 v0, v29

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 686
    move/from16 v0, v29

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_3

    :cond_9
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v9, v0}, Lcom/huawei/logupload/LogUpload;->d(Z)V

    .line 688
    :cond_a
    move/from16 v0, v34

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/logupload/LogUpload;->d(J)V

    .line 646
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v40

    :goto_4
    if-nez v40, :cond_2

    .line 691
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 693
    goto :goto_5

    .line 694
    :catch_0
    move-exception v10

    .line 696
    const-string v0, "LoguploadTable"

    const-string v1, "query table t_logupload all cols Error"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 699
    if-eqz v8, :cond_d

    .line 702
    :try_start_4
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_6

    .line 698
    :catchall_0
    move-exception v41

    .line 699
    if-eqz v8, :cond_b

    .line 702
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 704
    :cond_b
    throw v41

    .line 699
    :cond_c
    :goto_5
    if-eqz v8, :cond_d

    .line 702
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 705
    :cond_d
    :goto_6
    monitor-exit v42

    return-object v9

    :catchall_1
    move-exception p0

    monitor-exit v42

    throw p0
.end method

.method private static b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/logupload/LogUpload;)V
    .locals 7

    .line 936
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 938
    :cond_0
    return-void

    .line 954
    :cond_1
    const-string v0, "t_logupload"

    const-string v1, "_ID = ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->g()J

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

    .line 957
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 959
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 960
    const-string v0, "DELETE "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    const-string v0, "t_logupload"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 962
    const-string v0, " where "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 963
    const-string v0, "_ID = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 966
    const-string v0, "LoguploadTable"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 969
    :cond_2
    return-void
.end method

.method public static declared-synchronized b(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;)V
    .locals 6

    const-class v5, Lcom/huawei/logupload/a/a;

    monitor-enter v5

    .line 370
    const/4 v2, 0x0

    .line 374
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/logupload/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 376
    invoke-static {v2, p1}, Lcom/huawei/logupload/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/logupload/LogUpload;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 377
    goto :goto_0

    :catch_0
    move-exception v3

    .line 379
    const-string v0, "LoguploadTable"

    const-string v1, "delete table t_logupload Error!"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 382
    if-eqz v2, :cond_1

    .line 385
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 381
    :catchall_0
    move-exception v4

    .line 382
    if-eqz v2, :cond_0

    .line 385
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 387
    :cond_0
    throw v4

    .line 382
    :goto_0
    if-eqz v2, :cond_1

    .line 385
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 388
    :cond_1
    :goto_1
    monitor-exit v5

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v5

    throw p0
.end method
