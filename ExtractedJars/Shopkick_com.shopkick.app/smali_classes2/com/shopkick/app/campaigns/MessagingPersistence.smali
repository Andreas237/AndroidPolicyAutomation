.class Lcom/shopkick/app/campaigns/MessagingPersistence;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "MessagingPersistence.java"


# static fields
.field private static final DATABASE_CREATE_TABLE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS message_history (id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, message_type INTEGER NOT NULL, campaign_type INTEGER NOT NULL, campaign_id TEXT NOT NULL, chain_id TEXT NOT NULL, location_id TEXT NOT NULL, department_id TEXT);"

.field private static final DATABASE_NAME:Ljava/lang/String; = "BLE_CAMPAIGN_MESSAGE_HISTORY"

.field private static final DATABASE_TABLE_NAME:Ljava/lang/String; = "message_history"

.field private static final DATABASE_VERSION:I = 0x1

.field private static volatile Instance:Lcom/shopkick/app/campaigns/MessagingPersistence; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field static final LRU_CAP:I = 0xc8


# instance fields
.field private final context:Landroid/content/Context;

.field private volatile databaseAccessLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/campaigns/MessagingPersistence;->InstanceLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 33
    sput-object v0, Lcom/shopkick/app/campaigns/MessagingPersistence;->Instance:Lcom/shopkick/app/campaigns/MessagingPersistence;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 28
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 79
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->context:Landroid/content/Context;

    return-void
.end method

.method static getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;
    .locals 2

    .line 53
    sget-object v0, Lcom/shopkick/app/campaigns/MessagingPersistence;->Instance:Lcom/shopkick/app/campaigns/MessagingPersistence;

    if-eqz v0, :cond_0

    .line 57
    sget-object v0, Lcom/shopkick/app/campaigns/MessagingPersistence;->Instance:Lcom/shopkick/app/campaigns/MessagingPersistence;

    return-object v0

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MessagingPersistence.initialize() must be called before DbMessagePersistence.getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getRecordCountInternal()J
    .locals 12

    .line 313
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "SELECT count(*) FROM %1$s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "message_history"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 314
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 318
    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v9

    .line 321
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v6

    sget-object v0, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    const-string v10, "SQLiteStatement.close() failed"

    new-array v11, v5, [Ljava/lang/Object;

    invoke-virtual/range {v6 .. v11}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-wide v1

    :catchall_0
    move-exception v1

    .line 320
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v9

    .line 321
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v6

    sget-object v0, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    new-array v11, v5, [Ljava/lang/Object;

    const-string v10, "SQLiteStatement.close() failed"

    invoke-virtual/range {v6 .. v11}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :goto_1
    throw v1
.end method

.method private hasAtLeastOneRecord(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 10

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 252
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "message_history"

    const-string v4, "id"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    move-object v6, p2

    .line 253
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 254
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 259
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 262
    :catch_0
    :cond_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_1

    .line 259
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 262
    :catch_1
    :cond_1
    :goto_0
    :try_start_4
    throw p1

    .line 264
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method static initialize(Landroid/content/Context;)V
    .locals 3

    if-eqz p0, :cond_2

    .line 42
    sget-object v0, Lcom/shopkick/app/campaigns/MessagingPersistence;->Instance:Lcom/shopkick/app/campaigns/MessagingPersistence;

    if-nez v0, :cond_1

    .line 43
    sget-object v0, Lcom/shopkick/app/campaigns/MessagingPersistence;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 44
    :try_start_0
    sget-object v1, Lcom/shopkick/app/campaigns/MessagingPersistence;->Instance:Lcom/shopkick/app/campaigns/MessagingPersistence;

    if-nez v1, :cond_0

    .line 45
    new-instance v1, Lcom/shopkick/app/campaigns/MessagingPersistence;

    const-string v2, "BLE_CAMPAIGN_MESSAGE_HISTORY"

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/campaigns/MessagingPersistence;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/shopkick/app/campaigns/MessagingPersistence;->Instance:Lcom/shopkick/app/campaigns/MessagingPersistence;

    .line 47
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 39
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private trimLruEntries()V
    .locals 11

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 272
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getRecordCountInternal()J

    move-result-wide v1

    const-wide/16 v3, 0xc8

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 278
    :try_start_1
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "message_history"

    const-string v4, "id"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "id DESC"

    .line 279
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v3, 0xc8

    .line 280
    :try_start_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 281
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    if-eqz v2, :cond_2

    .line 286
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 293
    :catch_0
    :cond_2
    :try_start_4
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v5, "message_history"

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "id <= %1$d"

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v3, v9, v4

    .line 294
    invoke-static {v6, v7, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    .line 295
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-lez v1, :cond_3

    .line 299
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    .line 300
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v6, "trimLruEntries() %1$d LRU rows deleted form %2$s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    .line 303
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v4

    const-string v1, "message_history"

    aput-object v1, v7, v8

    .line 301
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    .line 300
    invoke-virtual {v0, v2, v3, v1, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    move-object v10, v2

    move-object v2, v1

    move-object v1, v10

    goto :goto_1

    :catchall_1
    move-exception v2

    :goto_1
    if-eqz v1, :cond_4

    .line 286
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 289
    :catch_1
    :cond_4
    :try_start_6
    throw v2

    :catchall_2
    move-exception v1

    .line 295
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method


# virtual methods
.method getRecordCount()J
    .locals 3

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 240
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getRecordCountInternal()J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 241
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method hasObservedMessage(Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 9

    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p5

    .line 204
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    const/4 p6, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eqz p5, :cond_0

    const-string p4, "campaign_type = ? AND message_type = ? AND campaign_id = ? AND chain_id = ? AND timestamp > ?"

    .line 206
    new-array p5, p6, [Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p6

    aput-object p6, p5, v5

    .line 207
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p5, v4

    aput-object p2, p5, v6

    aput-object p3, p5, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p5, v2

    goto :goto_0

    :cond_0
    const-string p5, "campaign_type = ? AND message_type = ? AND campaign_id = ? AND chain_id = ? AND department_id = ? AND timestamp > ?"

    const/4 v7, 0x6

    .line 211
    new-array v7, v7, [Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v5

    .line 212
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v7, v4

    aput-object p2, v7, v6

    aput-object p3, v7, v3

    aput-object p4, v7, v2

    .line 213
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v7, p6

    move-object p4, p5

    move-object p5, v7

    .line 217
    :goto_0
    invoke-direct {p0, p4, p5}, Lcom/shopkick/app/campaigns/MessagingPersistence;->hasAtLeastOneRecord(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method hasObservedWalkinMessage(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 7

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p3

    .line 160
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 p4, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p3, :cond_0

    const-string p2, "campaign_type = ? AND chain_id = ? AND timestamp > ?"

    .line 162
    new-array p3, p4, [Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p4

    aput-object p4, p3, v3

    aput-object p1, p3, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, v2

    goto :goto_0

    :cond_0
    const-string p3, "campaign_type = ? AND chain_id = ? AND department_id = ? AND timestamp > ?"

    const/4 v5, 0x4

    .line 165
    new-array v5, v5, [Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    aput-object p1, v5, v4

    aput-object p2, v5, v2

    .line 166
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v5, p4

    move-object p2, p3

    move-object p3, v5

    .line 170
    :goto_0
    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/campaigns/MessagingPersistence;->hasAtLeastOneRecord(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method observe(Lcom/shopkick/app/campaigns/MessageHistoryRecord;)Z
    .locals 7

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 110
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string/jumbo v2, "timestamp"

    .line 111
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getTimestampMilliseconds()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "message_type"

    .line 112
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getMessageType()Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->getValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "campaign_type"

    .line 113
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getCampaignType()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "campaign_id"

    .line 114
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getCampaignId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "chain_id"

    .line 115
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getChainId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "location_id"

    .line 116
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getLocationId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "department_id"

    .line 117
    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->getDepartmentId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :try_start_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "Adding MessageHistoryRecord to persistence"

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "message_history"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 124
    :goto_0
    monitor-exit p1

    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    move-object v4, p1

    .line 129
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object p1, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "observe() failed"

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    if-eqz v0, :cond_1

    .line 135
    invoke-direct {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->trimLruEntries()V

    :cond_1
    return v0

    .line 104
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'messageRecord\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "CREATE TABLE IF NOT EXISTS message_history (id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, message_type INTEGER NOT NULL, campaign_type INTEGER NOT NULL, campaign_id TEXT NOT NULL, chain_id TEXT NOT NULL, location_id TEXT NOT NULL, department_id TEXT);"

    .line 87
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 88
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 4

    .line 94
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter p2

    .line 95
    :try_start_0
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "DROP TABLE IF EXISTS %1$s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "message_history"

    aput-object v3, v1, v2

    invoke-static {p3, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p3, "CREATE TABLE IF NOT EXISTS message_history (id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, message_type INTEGER NOT NULL, campaign_type INTEGER NOT NULL, campaign_id TEXT NOT NULL, chain_id TEXT NOT NULL, location_id TEXT NOT NULL, department_id TEXT);"

    .line 96
    invoke-virtual {p1, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 97
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method purgeOldRecords(J)V
    .locals 7

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingPersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 224
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "message_history"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "timestamp < "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v1, v2, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    .line 226
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p1, :cond_0

    .line 228
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    .line 229
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "purgeOldRecords() %1$d rows deleted from %2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    .line 232
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 p1, 0x1

    const-string v6, "message_history"

    aput-object v6, v4, p1

    .line 230
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v5, [Ljava/lang/Object;

    .line 229
    invoke-virtual {p2, v0, v1, p1, v2}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 226
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
