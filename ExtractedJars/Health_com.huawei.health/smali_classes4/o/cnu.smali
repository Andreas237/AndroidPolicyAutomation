.class public Lo/cnu;
.super Lnet/sqlcipher/database/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static a:Lnet/sqlcipher/database/SQLiteDatabase;

.field private static b:Landroid/content/Context;

.field private static c:Ljava/lang/String;

.field private static d:Lo/cnu;

.field private static e:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 82
    const/4 v0, 0x0

    sput-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 6

    .line 90
    move-object v0, p0

    move-object v1, p1

    const-string v2, "hihealth_003.db"

    move-object v5, p2

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-direct/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 91
    return-void
.end method

.method private declared-synchronized a()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 8

    monitor-enter p0

    .line 334
    :try_start_0
    sget-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 335
    sget-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;

    monitor-exit p0

    return-object v0

    .line 337
    :cond_0
    const-class v4, Lo/cnu;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 338
    :try_start_1
    sget-object v0, Lo/cnu;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWritableDatabase dbKey is null get again"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 341
    const/16 v0, 0xd

    :try_start_2
    invoke-static {v0}, Lo/def;->b(I)[B

    move-result-object v5

    .line 342
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 343
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance kk != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v5, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;

    goto :goto_0

    .line 346
    :cond_1
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance kk = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    const-string v0, ""

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 352
    :goto_0
    goto :goto_1

    .line 349
    :catch_0
    move-exception v5

    .line 350
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance UnsupportedEncodingException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    const-string v0, ""

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;

    .line 354
    :cond_2
    :goto_1
    sget-object v0, Lo/cnu;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 355
    const-string v0, "HiH_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWritableDatabase dbKey is also null return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 356
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 359
    :cond_3
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWritableDatabase xmaha dbKey="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/cnu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    sget-object v0, Lo/cnu;->c:Ljava/lang/String;

    invoke-super {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    sput-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 361
    sget-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_4
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 362
    :catch_1
    move-exception v5

    .line 363
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWritableDatabase sqliteexcepiont e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    sget-object v0, Lo/cnu;->c:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 366
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "try open db by null key again!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    const-string v0, ""

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;

    .line 368
    sget-object v0, Lo/cnu;->c:Ljava/lang/String;

    invoke-super {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    sput-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 369
    sget-object v0, Lo/cnu;->a:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_6
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 370
    :catch_2
    move-exception v6

    .line 371
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWritableDatabase sqliteexcepiont e2="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 372
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 373
    :catch_3
    move-exception v6

    .line 374
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWritableDatabase exception e3= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 375
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 378
    :cond_4
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 379
    :catch_4
    move-exception v5

    .line 380
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWritableDatabase exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 381
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 383
    :catchall_0
    move-exception v7

    monitor-exit v4

    :try_start_a
    throw v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method private static declared-synchronized a(Landroid/content/Context;)Lo/cnu;
    .locals 6

    const-class v5, Lo/cnu;

    monitor-enter v5

    .line 106
    :try_start_0
    sget-object v0, Lo/cnu;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    const/16 v0, 0xd

    :try_start_1
    invoke-static {v0}, Lo/def;->b(I)[B

    move-result-object v4

    .line 109
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 110
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance kk != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;

    goto :goto_0

    .line 113
    :cond_0
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance kk = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const-string v0, ""

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    :goto_0
    goto :goto_1

    .line 116
    :catch_0
    move-exception v4

    .line 117
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance UnsupportedEncodingException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, ""

    sput-object v0, Lo/cnu;->c:Ljava/lang/String;

    .line 122
    :cond_1
    :goto_1
    sget-object v0, Lo/cnu;->d:Lo/cnu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 123
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance xmaha dbKey = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/cnu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    sput-object p0, Lo/cnu;->b:Landroid/content/Context;

    .line 126
    sget-object v0, Lo/cnu;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 127
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lo/cnu;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 129
    new-instance v4, Lo/cnu$1;

    invoke-direct {v4}, Lo/cnu$1;-><init>()V

    .line 147
    new-instance v0, Lo/cnu;

    sget-object v1, Lo/cnu;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v4}, Lo/cnu;-><init>(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V

    sput-object v0, Lo/cnu;->d:Lo/cnu;

    .line 149
    :cond_2
    sget-object v0, Lo/cnu;->d:Lo/cnu;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v5

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method private a(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 13

    .line 416
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionThree copy dataclient to new"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 419
    const/16 v0, 0x8

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "_id"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const-string v0, "client_uuid"

    const/4 v1, 0x1

    aput-object v0, v9, v1

    const-string v0, "user_id"

    const/4 v1, 0x2

    aput-object v0, v9, v1

    const-string v0, "device_id"

    const/4 v1, 0x3

    aput-object v0, v9, v1

    const-string v0, "app_id"

    const/4 v1, 0x4

    aput-object v0, v9, v1

    const-string v0, "cloud_device"

    const/4 v1, 0x5

    aput-object v0, v9, v1

    const-string v0, "sync_status"

    const/4 v1, 0x6

    aput-object v0, v9, v1

    const-string v0, "create_time"

    const/4 v1, 0x7

    aput-object v0, v9, v1

    .line 421
    move-object v0, p1

    const-string v1, "hihealth_dataclient"

    move-object v2, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v10

    .line 423
    :goto_0
    :try_start_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    .line 425
    const-string v0, "user_id"

    const-string v1, "user_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 426
    const-string v0, "app_id"

    const-string v1, "app_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 427
    const-string v0, "_id"

    const-string v1, "_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 428
    const-string v0, "cloud_device"

    const-string v1, "cloud_device"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 429
    const-string v0, "device_id"

    const-string v1, "device_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 430
    const-string v0, "sync_status"

    const-string v1, "sync_status"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 431
    const-string v0, "client_uuid"

    const-string v1, "client_uuid"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    const-string v0, "create_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 433
    const-string v0, "need_uploaddata"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 434
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 435
    goto/16 :goto_0

    .line 437
    :cond_0
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 438
    goto :goto_1

    .line 437
    :catchall_0
    move-exception v12

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 438
    throw v12

    .line 439
    :goto_1
    const-string v0, "DROP TABLE  IF EXISTS hihealth_dataclient"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 440
    invoke-static {}, Lo/coj;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 441
    invoke-static {}, Lo/coj;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 442
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/content/ContentValues;

    .line 443
    const-string v0, "hihealth_dataclient"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v12}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 444
    goto :goto_2

    .line 445
    :cond_1
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionThree end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/cnu;
    .locals 1

    .line 94
    invoke-static {p0}, Lo/cnu;->a(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    return-object v0
.end method

.method private b(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 7

    .line 254
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 255
    const-string v0, "device_unique_code"

    const-string v1, "-1"

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string v0, "deviceName"

    const/4 v1, 0x1

    invoke-static {v1}, Lo/cmf;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    const-string v0, "device_type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 258
    const-string v0, "firmwareVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string v0, "manufacturer"

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string v0, "model"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "createTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 262
    const-string v0, "hihealth_device"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v4}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v5

    .line 263
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_0

    .line 264
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initManualInputDeviceInfo insert fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :cond_0
    return-void
.end method

.method private c(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 4

    .line 403
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionTwo create hihealth_authorization and hihealth_permission and  point_health_stress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    invoke-static {}, Lo/cov;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 405
    invoke-static {}, Lo/cov;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 406
    invoke-static {}, Lo/cog;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 407
    invoke-static {}, Lo/cog;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 408
    invoke-static {}, Lo/cop;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 409
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionTwo end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    return-void
.end method

.method private d(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 9

    .line 273
    const-class v5, Lo/cnu;

    monitor-enter v5

    .line 274
    :try_start_0
    sget-object v0, Lo/cnu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 275
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 276
    :goto_0
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 277
    const-string v0, "device_unique_code"

    invoke-virtual {v5, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string v0, "deviceName"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v0, "device_type"

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 280
    const-string v0, "firmwareVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v0, "hardwareVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v0, "softwareVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "manufacturer"

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    sget-object v0, Lo/cnu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cpo;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 285
    const-string v0, "model"

    invoke-virtual {v5, v0, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "device_sn"

    sget-object v1, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "device_mac"

    sget-object v1, Landroid/os/Build;->USER:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "createTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 290
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPhoneDeviceInfo values = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    const-string v0, "hihealth_device"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v5}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v7

    .line 292
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-gtz v0, :cond_0

    .line 293
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPhoneDeviceInfo insert fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :cond_0
    return-void
.end method

.method private e(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 4

    .line 390
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionOne create table sample_session_core and user_preference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-static {}, Lo/coy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 392
    invoke-static {}, Lo/coy;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 393
    const-string v0, "DROP TABLE  IF EXISTS user_preference"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 394
    invoke-static {}, Lo/cpg;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 395
    invoke-static {}, Lo/cpg;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 396
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionOne end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return-void
.end method

.method private g(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 4

    .line 452
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionFour create config model data tables"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    invoke-static {}, Lo/coe;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 454
    invoke-static {}, Lo/coe;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 455
    invoke-static {}, Lo/coi;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 456
    invoke-static {}, Lo/coi;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 457
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeVersionFour end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 300
    sget-object v0, Lo/cnu;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 301
    invoke-virtual {p0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 302
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 304
    const-string v0, "BEGIN IMMEDIATE;"

    :try_start_0
    invoke-virtual {v4, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 309
    goto :goto_0

    .line 305
    :catch_0
    move-exception v5

    .line 306
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endTransaction SQLiteException is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    goto :goto_0

    .line 307
    :catch_1
    move-exception v5

    .line 308
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beginTransaction exception is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_0
    :goto_0
    return-void
.end method

.method public d()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 330
    invoke-direct {p0}, Lo/cnu;->a()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 6

    .line 316
    invoke-virtual {p0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 317
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 319
    const-string v0, "COMMIT;"

    :try_start_0
    invoke-virtual {v4, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 324
    goto :goto_0

    .line 320
    :catch_0
    move-exception v5

    .line 321
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endTransaction SQLiteException is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    goto :goto_0

    .line 322
    :catch_1
    move-exception v5

    .line 323
    const-string v0, "Debug_HiHealthDBHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endTransaction exception is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    :cond_0
    :goto_0
    sget-object v0, Lo/cnu;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 327
    return-void
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 4

    .line 154
    const-string v0, "HiH_HiHealthDBHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate VERSION = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    invoke-static {}, Lo/cod;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 156
    invoke-static {}, Lo/cpk;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 157
    invoke-static {}, Lo/coc;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 158
    invoke-static {}, Lo/cok;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 159
    invoke-static {}, Lo/coj;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 160
    invoke-static {}, Lo/coj;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 161
    invoke-static {}, Lo/col;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 162
    invoke-static {}, Lo/coh;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 163
    invoke-static {}, Lo/cor;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 164
    invoke-static {}, Lo/cor;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 165
    invoke-static {}, Lo/cou;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 166
    invoke-static {}, Lo/cou;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 167
    invoke-static {}, Lo/cot;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 168
    invoke-static {}, Lo/cot;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 169
    invoke-static {}, Lo/cpa;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 170
    invoke-static {}, Lo/cpa;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 171
    invoke-static {}, Lo/coy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 172
    invoke-static {}, Lo/coy;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 173
    invoke-static {}, Lo/cos;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 174
    invoke-static {}, Lo/cos;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 175
    invoke-static {}, Lo/com;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 176
    invoke-static {}, Lo/cox;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 177
    invoke-static {}, Lo/cox;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 178
    invoke-static {}, Lo/cpg;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 179
    invoke-static {}, Lo/cpg;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 180
    invoke-static {}, Lo/coz;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 181
    invoke-static {}, Lo/cpf;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 182
    invoke-static {}, Lo/cog;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 183
    invoke-static {}, Lo/cog;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 184
    invoke-static {}, Lo/cop;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 185
    invoke-static {}, Lo/cpc;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 186
    invoke-static {}, Lo/coo;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 187
    invoke-static {}, Lo/cpb;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lo/cpb;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 189
    invoke-static {}, Lo/cpe;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 190
    invoke-static {}, Lo/cpd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 192
    invoke-static {}, Lo/cov;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 193
    invoke-static {}, Lo/cov;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 195
    invoke-static {}, Lo/coe;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 196
    invoke-static {}, Lo/coe;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 197
    invoke-static {}, Lo/coi;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 198
    invoke-static {}, Lo/coi;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 200
    invoke-direct {p0, p1}, Lo/cnu;->b(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 201
    invoke-direct {p0, p1}, Lo/cnu;->d(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 202
    const-string v0, "HiH_HiHealthDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    return-void
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 5

    .line 207
    const-string v0, "HiH_HiHealthDBHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade oldVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",newVersion =  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    move v4, p2

    .line 209
    :goto_0
    if-ge v4, p3, :cond_0

    .line 210
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 212
    :pswitch_0
    invoke-direct {p0, p1}, Lo/cnu;->e(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 213
    goto :goto_1

    .line 215
    :pswitch_1
    invoke-direct {p0, p1}, Lo/cnu;->c(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 216
    goto :goto_1

    .line 218
    :pswitch_2
    invoke-direct {p0, p1}, Lo/cnu;->a(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 219
    goto :goto_1

    .line 221
    :pswitch_3
    invoke-direct {p0, p1}, Lo/cnu;->g(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 222
    .line 226
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 228
    :cond_0
    const-string v0, "HiH_HiHealthDBHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade end oldVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",newVersion =  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",upgradeTo = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
