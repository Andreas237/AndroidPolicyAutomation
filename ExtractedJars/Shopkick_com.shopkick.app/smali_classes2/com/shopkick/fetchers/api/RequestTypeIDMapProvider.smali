.class public Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "RequestTypeIDMapProvider.java"


# static fields
.field private static final DATABASE_VERSION:I = 0x1

.field private static final InstanceLock:Ljava/lang/Object;

.field static final LRU_CAP:I = 0x2710

.field private static final REQUEST_TYPE_ID_MAP_NAME_SPACE:Ljava/lang/String; = "REQUEST_TYPE_ID_MAP"

.field private static final _DatabaseCreateSQL:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS cache_map (id INTEGER PRIMARY KEY AUTOINCREMENT, requestType TEXT NOT NULL, requestId INT NOT NULL, timestampUsed INTEGER NOT NULL);"

.field private static final _DatabaseTableName:Ljava/lang/String; = "cache_map"

.field private static final _TimestampUsedColumn:[Ljava/lang/String;

.field private static final _databaseAccessLock:Ljava/lang/Object;

.field private static volatile instance:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;


# instance fields
.field private final _logger:Lnet/toddm/cache/LoggingProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 80
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->InstanceLock:Ljava/lang/Object;

    .line 81
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    const-string/jumbo v0, "timestampUsed"

    .line 89
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_TimestampUsedColumn:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILnet/toddm/cache/LoggingProvider;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 36
    iput-object p5, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    return-void
.end method

.method private containsRequestTypeAndIdInternal(Ljava/lang/String;J)Z
    .locals 7

    .line 271
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "SELECT count(*) FROM %1$s WHERE requestType = ? AND requestId = ?"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "cache_map"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 272
    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 277
    :try_start_0
    invoke-virtual {v0, v3, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    const/4 p1, 0x2

    .line 278
    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 279
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDoneException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v1, 0x0

    cmp-long p1, p1, v1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    move v3, v6

    .line 284
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 287
    iget-object p2, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p2, :cond_1

    const-string p3, "SQLiteStatement.close() failed"

    new-array v0, v6, [Ljava/lang/Object;

    invoke-interface {p2, p1, p3, v0}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    return v3

    :catchall_0
    move-exception p1

    .line 284
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    .line 287
    iget-object p3, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p3, :cond_2

    new-array v0, v6, [Ljava/lang/Object;

    const-string v1, "SQLiteStatement.close() failed"

    invoke-interface {p3, p2, v1, v0}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    :cond_2
    :goto_2
    throw p1

    .line 284
    :catch_2
    :try_start_3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    .line 287
    iget-object p2, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p2, :cond_3

    const-string p3, "SQLiteStatement.close() failed"

    new-array v0, v6, [Ljava/lang/Object;

    invoke-interface {p2, p1, p3, v0}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_3
    return v6
.end method

.method public static getInstance()Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;
    .locals 2

    .line 69
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->instance:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    if-eqz v0, :cond_0

    .line 73
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->instance:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    return-object v0

    .line 70
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RequestTypeIDMapProvider.initialize() must be called before RequestTypeIDMapProvider.getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getRecordsCount()J
    .locals 6

    .line 295
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "SELECT count(*) FROM %1$s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "cache_map"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 296
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 299
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public static initialize(Landroid/content/Context;Lnet/toddm/cache/LoggingProvider;)Z
    .locals 8
    .param p1    # Lnet/toddm/cache/LoggingProvider;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_2

    .line 52
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->instance:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    if-nez v0, :cond_1

    .line 53
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 54
    :try_start_0
    sget-object v1, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->instance:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    if-nez v1, :cond_0

    .line 55
    new-instance v1, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    const-string v4, "REQUEST_TYPE_ID_MAP"

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v2, v1

    move-object v3, p0

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILnet/toddm/cache/LoggingProvider;)V

    sput-object v1, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->instance:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    const/4 p0, 0x1

    .line 60
    monitor-exit v0

    return p0

    .line 62
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
    const/4 p0, 0x0

    return p0

    .line 50
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "context cannot be null!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private trimLruEntries()V
    .locals 10

    .line 233
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 235
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getRecordsCount()J

    move-result-wide v1

    const-wide/16 v3, 0x2710

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 240
    :try_start_1
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "cache_map"

    sget-object v4, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_TimestampUsedColumn:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string/jumbo v9, "timestampUsed DESC"

    .line 241
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    const/16 v2, 0x2710

    .line 248
    invoke-interface {v1, v2}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    .line 249
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 v5, 0x1

    .line 250
    new-array v6, v5, [Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v2

    .line 251
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "cache_map"

    const-string/jumbo v7, "timestampUsed <= ?"

    invoke-virtual {v3, v4, v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    .line 253
    iget-object v4, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v4, :cond_1

    .line 254
    iget-object v4, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v6, "%1$d LRU entries deleted from type to id map"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v2

    invoke-interface {v4, v6, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    if-eqz v1, :cond_2

    .line 260
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 265
    :catch_0
    :cond_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_3

    .line 260
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 263
    :catch_1
    :cond_3
    :try_start_5
    throw v2

    :catchall_1
    move-exception v1

    .line 265
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method


# virtual methods
.method public add(Ljava/lang/Class;J)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;J)Z"
        }
    .end annotation

    .line 127
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 130
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "requestType"

    .line 131
    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "requestId"

    .line 132
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string/jumbo v3, "timestampUsed"

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 135
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->containsRequestTypeAndIdInternal(Ljava/lang/String;J)Z

    move-result v0

    const/4 v1, 0x0

    .line 138
    :try_start_0
    sget-object v3, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v0, :cond_2

    .line 142
    :try_start_1
    iget-object v6, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v6, :cond_0

    .line 143
    iget-object v6, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v7, "Updating cache entry \'%1$s\' -> \'%2$s\'"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v4, v5

    invoke-interface {v6, v7, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string p3, "cache_map"

    const-string v4, "requestType = ? and requestId = ?"

    new-array v6, v5, [Ljava/lang/String;

    aput-object p1, v6, v1

    .line 146
    invoke-virtual {p2, p3, v2, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    move v5, v1

    goto :goto_0

    .line 152
    :cond_2
    iget-object v6, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v6, :cond_4

    .line 153
    iget-object v6, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v7, "Inserting cache entry \'%1$s\' -> \'%2$s\'"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v4, v5

    invoke-interface {v6, v7, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string p2, "cache_map"

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide p1

    const-wide/16 v6, -0x1

    cmp-long p1, p1, v6

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v5, v1

    goto :goto_0

    :cond_4
    move v5, v1

    .line 157
    :goto_0
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_5

    .line 167
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->trimLruEntries()V

    :cond_5
    return v5

    :catchall_0
    move-exception p1

    .line 157
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception p1

    .line 159
    iget-object p2, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p2, :cond_6

    const-string p3, "add() failed"

    .line 160
    new-array v0, v1, [Ljava/lang/Object;

    invoke-interface {p2, p1, p3, v0}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    return v1
.end method

.method public get(Ljava/lang/Class;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 181
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    .line 183
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 186
    sget-object v1, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    .line 188
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "cache_map"

    const-string v5, "requestId"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "requestType = ?"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object p1, v7, v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 189
    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 197
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 198
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 203
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    :catch_0
    :cond_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_2

    .line 203
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    .line 207
    :catch_1
    :cond_2
    :goto_1
    :try_start_4
    throw p1

    .line 210
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public getRecordsCountWithLock()J
    .locals 3

    .line 308
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 309
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getRecordsCount()J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 310
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 99
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "CREATE TABLE IF NOT EXISTS cache_map (id INTEGER PRIMARY KEY AUTOINCREMENT, requestType TEXT NOT NULL, requestId INT NOT NULL, timestampUsed INTEGER NOT NULL);"

    .line 100
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 101
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
    .locals 5

    .line 106
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v1, :cond_0

    .line 108
    iget-object v1, p0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v2, "Upgrading database from version %1$d to %2$d (dropping all data)"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 109
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, v4

    const/4 p2, 0x1

    .line 110
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v3, p2

    .line 108
    invoke-interface {v1, v2, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p2, "DROP TABLE IF EXISTS cache_map"

    .line 112
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "CREATE TABLE IF NOT EXISTS cache_map (id INTEGER PRIMARY KEY AUTOINCREMENT, requestType TEXT NOT NULL, requestId INT NOT NULL, timestampUsed INTEGER NOT NULL);"

    .line 113
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 114
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public remove(Ljava/lang/Class;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)Z"
        }
    .end annotation

    .line 222
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    .line 224
    sget-object v0, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 225
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "cache_map"

    const-string v3, "requestType = ?"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    .line 226
    invoke-virtual {v1, v2, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    move v4, v6

    .line 227
    :goto_0
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    .line 228
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
