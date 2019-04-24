.class Lcom/shopkick/logging/DbMessagePersistence;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "DbMessagePersistence.java"


# static fields
.field private static final DATABASE_CREATE_TABLE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS messages (id INTEGER PRIMARY KEY AUTOINCREMENT, message TEXT NOT NULL, synced INTEGER NOT NULL DEFAULT 0);"

.field private static final DATABASE_NAME:Ljava/lang/String; = "LOGGING_DEV"

.field private static final DATABASE_TABLE_NAME:Ljava/lang/String; = "messages"

.field private static final DATABASE_VERSION:I = 0x5

.field private static volatile Instance:Lcom/shopkick/logging/DbMessagePersistence; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final LOG_TAG:Ljava/lang/String;

.field static final LRU_CAP:I = 0x2710


# instance fields
.field private final context:Landroid/content/Context;

.field private volatile databaseAccessLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/logging/DbMessagePersistence;->InstanceLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 31
    sput-object v0, Lcom/shopkick/logging/DbMessagePersistence;->Instance:Lcom/shopkick/logging/DbMessagePersistence;

    .line 62
    const-class v0, Lcom/shopkick/logging/DbMessagePersistence;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x5

    .line 26
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 72
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/logging/DbMessagePersistence;->context:Landroid/content/Context;

    return-void
.end method

.method private checkForMessage(J)Z
    .locals 8

    const/4 v0, 0x0

    .line 280
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT count(*) FROM %1$s WHERE id = ?"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const-string v6, "messages"

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 281
    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 284
    invoke-virtual {v0, v4, p1, p2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 285
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v1, 0x0

    cmp-long p1, p1, v1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    if-eqz v0, :cond_1

    .line 289
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 293
    sget-object p2, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v0, "SQLiteStatement.close() failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return v4

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    .line 289
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    .line 293
    sget-object v0, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v1, "SQLiteStatement.close() failed"

    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 294
    :cond_2
    :goto_2
    throw p1
.end method

.method public static getInstance()Lcom/shopkick/logging/DbMessagePersistence;
    .locals 2

    .line 51
    sget-object v0, Lcom/shopkick/logging/DbMessagePersistence;->Instance:Lcom/shopkick/logging/DbMessagePersistence;

    if-eqz v0, :cond_0

    .line 55
    sget-object v0, Lcom/shopkick/logging/DbMessagePersistence;->Instance:Lcom/shopkick/logging/DbMessagePersistence;

    return-object v0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DbMessagePersistence.initialize() must be called before DbMessagePersistence.getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getMessageCount()J
    .locals 6

    .line 263
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "SELECT count(*) FROM %1$s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "messages"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 264
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 268
    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 271
    sget-object v3, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v4, "SQLiteStatement.close() failed"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-wide v1

    :catchall_0
    move-exception v1

    .line 270
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 271
    sget-object v2, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v3, "SQLiteStatement.close() failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 272
    :goto_1
    throw v1
.end method

.method public static initialize(Landroid/content/Context;)V
    .locals 3

    if-eqz p0, :cond_2

    .line 40
    sget-object v0, Lcom/shopkick/logging/DbMessagePersistence;->Instance:Lcom/shopkick/logging/DbMessagePersistence;

    if-nez v0, :cond_1

    .line 41
    sget-object v0, Lcom/shopkick/logging/DbMessagePersistence;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 42
    :try_start_0
    sget-object v1, Lcom/shopkick/logging/DbMessagePersistence;->Instance:Lcom/shopkick/logging/DbMessagePersistence;

    if-nez v1, :cond_0

    .line 43
    new-instance v1, Lcom/shopkick/logging/DbMessagePersistence;

    const-string v2, "LOGGING_DEV"

    invoke-direct {v1, p0, v2}, Lcom/shopkick/logging/DbMessagePersistence;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/shopkick/logging/DbMessagePersistence;->Instance:Lcom/shopkick/logging/DbMessagePersistence;

    .line 45
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

    .line 37
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public add(Lcom/shopkick/logging/Message;)Z
    .locals 5

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 103
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/logging/DbMessagePersistence;->context:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->formatMessage(Landroid/content/Context;Lcom/shopkick/logging/Message;)Lorg/json/JSONObject;

    move-result-object p1

    .line 106
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "message"

    .line 107
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :try_start_1
    sget-object v2, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Adding message to persistence"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "messages"

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

    .line 114
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

    .line 119
    sget-object v1, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v2, "add() failed"

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    if-eqz v0, :cond_1

    .line 125
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->trimLruEntries()V

    :cond_1
    return v0

    .line 97
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'message\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getUnsyncedMessageCount()J
    .locals 7

    .line 246
    iget-object v0, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 247
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT count(*) FROM %1$s WHERE synced = 0"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "messages"

    aput-object v6, v4, v5

    .line 248
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 252
    :try_start_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 254
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 255
    :try_start_3
    sget-object v4, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v5, "SQLiteStatement.close() failed"

    invoke-static {v4, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 256
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-wide v2

    :catchall_0
    move-exception v2

    .line 254
    :try_start_4
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 255
    :try_start_5
    sget-object v3, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    const-string v4, "SQLiteStatement.close() failed"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 256
    :goto_1
    throw v2

    :catchall_1
    move-exception v1

    .line 258
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public getUnsyncedMessages(Ljava/lang/Integer;)Ljava/util/TreeMap;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/util/TreeMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 142
    :try_start_0
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 148
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_0

    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    move-object v11, p1

    goto :goto_0

    :cond_0
    move-object v11, v2

    .line 152
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "messages"

    const/4 v5, 0x0

    const-string/jumbo v6, "synced = 0"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "id ASC"

    .line 153
    invoke-virtual/range {v3 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 154
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 155
    invoke-interface {v2, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 p1, 0x1

    .line 156
    invoke-interface {v2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 157
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    .line 165
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    :catch_0
    :cond_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-object v1

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_3

    .line 165
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 167
    :catch_1
    :cond_3
    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    .line 171
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "CREATE TABLE IF NOT EXISTS messages (id INTEGER PRIMARY KEY AUTOINCREMENT, message TEXT NOT NULL, synced INTEGER NOT NULL DEFAULT 0);"

    .line 80
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 81
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

    .line 87
    iget-object p2, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter p2

    .line 88
    :try_start_0
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "DROP TABLE IF EXISTS %1$s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "messages"

    aput-object v3, v1, v2

    invoke-static {p3, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p3, "CREATE TABLE IF NOT EXISTS messages (id INTEGER PRIMARY KEY AUTOINCREMENT, message TEXT NOT NULL, synced INTEGER NOT NULL DEFAULT 0);"

    .line 89
    invoke-virtual {p1, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 90
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public purgeSyncedMessages()V
    .locals 7

    .line 176
    iget-object v0, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 177
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "messages"

    const-string/jumbo v3, "synced = 1"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    .line 179
    sget-object v2, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "purgeSyncedMessages() %1$d rows deleted from %2$s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    .line 182
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v6

    const/4 v1, 0x1

    const-string v6, "messages"

    aput-object v6, v5, v1

    .line 180
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 179
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setMessageAsSynced(J)V
    .locals 8

    .line 193
    iget-object v0, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 194
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/logging/DbMessagePersistence;->checkForMessage(J)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 196
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string/jumbo v4, "synced"

    .line 197
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 198
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "messages"

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "id = %1$d"

    new-array v3, v3, [Ljava/lang/Object;

    .line 199
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-static {v6, v7, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v4, v5, v1, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    .line 203
    :cond_0
    sget-object v1, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "setMessageAsSynced() failed to find message %1$d"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-static {v4, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public trimLruEntries()V
    .locals 11

    .line 210
    iget-object v0, p0, Lcom/shopkick/logging/DbMessagePersistence;->databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 212
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getMessageCount()J

    move-result-wide v1

    const-wide/16 v3, 0x2710

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 217
    :try_start_1
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "messages"

    const-string v4, "id"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "id DESC"

    .line 218
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v3, 0x2710

    .line 219
    :try_start_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 220
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

    .line 225
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 232
    :catch_0
    :cond_2
    :try_start_4
    invoke-virtual {p0}, Lcom/shopkick/logging/DbMessagePersistence;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v5, "messages"

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "id <= %1$d"

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v3, v9, v4

    .line 233
    invoke-static {v6, v7, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_3

    .line 235
    sget-object v2, Lcom/shopkick/logging/DbMessagePersistence;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v5, "trimLruEntries() %1$d LRU rows deleted form %2$s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 238
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v4

    const-string v1, "messages"

    aput-object v1, v6, v8

    .line 236
    invoke-static {v3, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 235
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    :cond_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

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

    .line 225
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 228
    :catch_1
    :cond_4
    :try_start_6
    throw v2

    :catchall_2
    move-exception v1

    .line 241
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method
