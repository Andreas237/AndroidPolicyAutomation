.class public Lnet/toddm/cache/android/DBCacheProvider;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "DBCacheProvider.java"

# interfaces
.implements Lnet/toddm/cache/CacheProvider;


# static fields
.field private static final _DatabaseCreateSQL:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT NOT NULL UNIQUE, valueString TEXT, valueBytes BLOB, timestampCreated INTEGER NOT NULL, timestampModified INTEGER NOT NULL, timestampUsed INTEGER NOT NULL, ttl INTEGER NOT NULL, maxStale INTEGER NOT NULL, sourceUri TEXT, eTag TEXT, priority TEXT NOT NULL, evictionScore REAL NOT NULL DEFAULT 1.0);"

.field private static final _DatabaseTableName:Ljava/lang/String; = "cache"

.field private static final _EvictionScoreColumn:[Ljava/lang/String;

.field private static _NamespaceToCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/toddm/cache/android/DBCacheProvider;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile _NamespaceToCacheLock:Ljava/lang/Object;

.field private static final _PriorityToWeight:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/toddm/cache/CachePriority;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile _databaseAccessLock:Ljava/lang/Object;

.field private final _databaseName:Ljava/lang/String;

.field private final _databaseVersion:I

.field private final _logger:Lnet/toddm/cache/LoggingProvider;

.field private _lruCap:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 86
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCacheLock:Ljava/lang/Object;

    .line 87
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCache:Ljava/util/Map;

    .line 90
    new-instance v0, Lnet/toddm/cache/android/DBCacheProvider$1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lnet/toddm/cache/android/DBCacheProvider$1;-><init>(I)V

    sput-object v0, Lnet/toddm/cache/android/DBCacheProvider;->_PriorityToWeight:Ljava/util/Map;

    const-string v0, "evictionScore"

    .line 103
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/toddm/cache/android/DBCacheProvider;->_EvictionScoreColumn:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;IILnet/toddm/cache/LoggingProvider;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, p2, v0, p3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 101
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    .line 54
    iput-object p2, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseName:Ljava/lang/String;

    .line 55
    iput p3, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseVersion:I

    .line 56
    iput p4, p0, Lnet/toddm/cache/android/DBCacheProvider;->_lruCap:I

    .line 57
    iput-object p5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    .line 58
    iget-object p1, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p1, :cond_0

    const-string p3, "Using caching database \'%1$s\'"

    const/4 p4, 0x1

    new-array p4, p4, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p2, p4, p5

    invoke-interface {p1, p3, p4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private add(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 4

    if-eqz p1, :cond_a

    .line 164
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_a

    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 170
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "key"

    .line 171
    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const-string p2, "valueString"

    .line 173
    invoke-virtual {v2, p2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v3, "valueString"

    .line 175
    invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-nez p3, :cond_1

    const-string p2, "valueBytes"

    .line 178
    invoke-virtual {v2, p2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string p2, "valueBytes"

    .line 180
    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :goto_1
    const-string p2, "ttl"

    .line 182
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p2, "maxStale"

    .line 183
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    if-nez p8, :cond_2

    const-string p2, "eTag"

    .line 185
    invoke-virtual {v2, p2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string p2, "eTag"

    .line 187
    invoke-virtual {v2, p2, p8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    if-nez p9, :cond_3

    const-string p2, "sourceUri"

    .line 190
    invoke-virtual {v2, p2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    const-string p2, "sourceUri"

    .line 192
    invoke-virtual {p9}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    const-string p2, "timestampModified"

    .line 194
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p2, "timestampUsed"

    .line 195
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p2, "priority"

    .line 196
    invoke-virtual {p10}, Lnet/toddm/cache/CachePriority;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 200
    :try_start_0
    iget-object p3, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p4, 0x1

    .line 202
    :try_start_1
    invoke-direct {p0, p1, p4}, Lnet/toddm/cache/android/DBCacheProvider;->containsKeyInternal(Ljava/lang/String;Z)Z

    move-result p5

    if-eqz p5, :cond_6

    .line 205
    iget-object p5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p5, :cond_4

    iget-object p5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string p6, "Updating cache entry \'%1$s\'"

    new-array p7, p4, [Ljava/lang/Object;

    aput-object p1, p7, p2

    invoke-interface {p5, p6, p7}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_4
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p5

    const-string p6, "cache"

    const-string p7, "key = ?"

    new-array p8, p4, [Ljava/lang/String;

    aput-object p1, p8, p2

    invoke-virtual {p5, p6, v2, p7, p8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_5

    goto :goto_4

    :cond_5
    move p4, p2

    goto :goto_4

    .line 210
    :cond_6
    iget-object p5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p5, :cond_7

    iget-object p5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string p6, "Inserting cache entry \'%1$s\'"

    new-array p7, p4, [Ljava/lang/Object;

    aput-object p1, p7, p2

    invoke-interface {p5, p6, p7}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    const-string p1, "timestampCreated"

    .line 211
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p5

    invoke-virtual {v2, p1, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 212
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string p5, "cache"

    const/4 p6, 0x0

    invoke-virtual {p1, p5, p6, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide p5

    const-wide/16 p7, -0x1

    cmp-long p1, p5, p7

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    move p4, p2

    .line 214
    :goto_4
    monitor-exit p3

    return p4

    :catchall_0
    move-exception p1

    .line 215
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 218
    iget-object p3, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p3, :cond_9

    const-string p4, "add() failed"

    new-array p5, p2, [Ljava/lang/Object;

    invoke-interface {p3, p1, p4, p5}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    return p2

    .line 165
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private cacheEntryFromCursor(Landroid/database/Cursor;)Lnet/toddm/cache/CacheEntry;
    .locals 19

    move-object/from16 v0, p1

    if-eqz v0, :cond_6

    .line 325
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->isBeforeFirst()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    .line 330
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    const/4 v1, 0x1

    .line 331
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v1, 0x2

    .line 333
    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    .line 334
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    const/4 v2, 0x3

    .line 337
    invoke-interface {v0, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-nez v5, :cond_1

    .line 338
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    const/4 v2, 0x4

    .line 340
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    const/4 v2, 0x5

    .line 341
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    const/4 v2, 0x6

    .line 343
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v16

    const/4 v2, 0x7

    .line 345
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    const/16 v2, 0x8

    .line 346
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    const/16 v2, 0x9

    .line 349
    invoke-interface {v0, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_3

    .line 350
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 351
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_3

    .line 353
    :cond_2
    :try_start_0
    new-instance v10, Ljava/net/URI;

    invoke-direct {v10, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v10

    goto :goto_2

    :catch_0
    move-exception v0

    .line 355
    new-instance v1, Lnet/toddm/cache/CacheException;

    invoke-direct {v1, v0}, Lnet/toddm/cache/CacheException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    move-object v11, v4

    :goto_2
    const/16 v2, 0xa

    .line 360
    invoke-interface {v0, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_4

    .line 361
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    goto :goto_3

    :cond_4
    move-object v10, v4

    :goto_3
    const/16 v2, 0xb

    .line 364
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/toddm/cache/CachePriority;->valueOf(Ljava/lang/String;)Lnet/toddm/cache/CachePriority;

    move-result-object v18

    .line 367
    new-instance v0, Lnet/toddm/cache/CacheEntry;

    move-object v2, v0

    move-object v4, v1

    invoke-direct/range {v2 .. v18}, Lnet/toddm/cache/CacheEntry;-><init>(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V

    return-object v0

    .line 326
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'cursor\' must already be pointing to a valid record"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 323
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'cursor\' can not be NULL"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private containsKeyInternal(Ljava/lang/String;Z)Z
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 427
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT count(*) FROM %1$s WHERE key = ?"

    new-array v4, v0, [Ljava/lang/Object;

    const-string v5, "cache"

    aput-object v5, v4, v1

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p2

    goto :goto_0

    .line 429
    :cond_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT count(*) FROM %1$s WHERE key = ? GROUP BY id HAVING (timestampModified + ttl) >= %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "cache"

    aput-object v5, v4, v1

    .line 433
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v0

    .line 429
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p2

    .line 436
    :goto_0
    :try_start_0
    invoke-virtual {p2, v0, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 437
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDoneException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    .line 442
    :goto_1
    :try_start_1
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 445
    iget-object p2, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p2, :cond_2

    const-string v2, "SQLiteStatement.close() failed"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p2, p1, v2, v1}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_2
    return v0

    :catchall_0
    move-exception p1

    .line 442
    :try_start_2
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception p2

    .line 445
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SQLiteStatement.close() failed"

    invoke-interface {v0, p2, v2, v1}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    :cond_3
    :goto_3
    throw p1

    .line 442
    :catch_2
    :try_start_3
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_4

    :catch_3
    move-exception p1

    .line 445
    iget-object p2, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p2, :cond_4

    const-string v0, "SQLiteStatement.close() failed"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p2, p1, v0, v2}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_4
    return v1
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;IILnet/toddm/cache/LoggingProvider;)Lnet/toddm/cache/android/DBCacheProvider;
    .locals 9

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    if-ltz p3, :cond_2

    .line 76
    sget-object v0, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCache:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 77
    sget-object v0, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCacheLock:Ljava/lang/Object;

    monitor-enter v0

    .line 78
    :try_start_0
    sget-object v1, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCache:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 79
    sget-object v1, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCache:Ljava/util/Map;

    new-instance v8, Lnet/toddm/cache/android/DBCacheProvider;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lnet/toddm/cache/android/DBCacheProvider;-><init>(Landroid/content/Context;Ljava/lang/String;IILnet/toddm/cache/LoggingProvider;)V

    invoke-interface {v1, p1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 83
    :cond_1
    :goto_0
    sget-object p0, Lnet/toddm/cache/android/DBCacheProvider;->_NamespaceToCache:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnet/toddm/cache/android/DBCacheProvider;

    return-object p0

    .line 75
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'initialLruCap\' can not be negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 74
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'namespace\' can not be NULL or empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 73
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be NULL"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private sizeInternal(Z)I
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 386
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT count(*) FROM %1$s"

    new-array v0, v0, [Ljava/lang/Object;

    const-string v4, "cache"

    aput-object v4, v0, v1

    invoke-static {v2, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    goto :goto_0

    .line 388
    :cond_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT count(*) FROM %1$s GROUP BY id HAVING (timestampModified + ttl) >= %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "cache"

    aput-object v5, v4, v1

    .line 392
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v0

    .line 388
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    .line 395
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDoneException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v0, v2

    .line 400
    :try_start_1
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 403
    iget-object v2, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_1

    const-string v3, "SQLiteStatement.close() failed"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v2, p1, v3, v1}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    return v0

    :catchall_0
    move-exception v0

    .line 400
    :try_start_2
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 403
    iget-object v2, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "SQLiteStatement.close() failed"

    invoke-interface {v2, p1, v3, v1}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    :cond_2
    :goto_2
    throw v0

    .line 400
    :catch_2
    :try_start_3
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    .line 403
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_3

    const-string v2, "SQLiteStatement.close() failed"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-interface {v0, p1, v2, v3}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_3
    return v1
.end method

.method private updateEvictionScores()V
    .locals 14

    const/4 v0, 0x0

    .line 507
    :try_start_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "SELECT min(timestampUsed), max(timestampUsed) FROM %1$s"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const-string v6, "cache"

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 508
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 509
    invoke-interface {v1, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 510
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 513
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_1
    const-string v1, "UPDATE %1$s SET evictionScore = (%2$f * (1.0 + ((timestampUsed - %3$f) / (%4$f - %3$f)))) WHERE priority = \'%5$s\'"

    if-ne v0, v2, :cond_2

    const-string v1, "UPDATE %1$s SET evictionScore = (%2$f * (2.0)) WHERE priority = \'%5$s\'"

    .line 521
    :cond_2
    sget-object v3, Lnet/toddm/cache/android/DBCacheProvider;->_PriorityToWeight:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/toddm/cache/CachePriority;

    .line 522
    sget-object v6, Lnet/toddm/cache/android/DBCacheProvider;->_PriorityToWeight:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    .line 523
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v10, 0x5

    new-array v10, v10, [Ljava/lang/Object;

    const-string v11, "cache"

    aput-object v11, v10, v7

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v10, v4

    const/4 v8, 0x2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    long-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v10, v8

    const/4 v8, 0x3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    long-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v10, v8

    const/4 v8, 0x4

    invoke-virtual {v5}, Lnet/toddm/cache/CachePriority;->name()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v10, v8

    invoke-static {v6, v1, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 524
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    move-object v13, v1

    move-object v1, v0

    move-object v0, v13

    goto :goto_2

    :catchall_1
    move-exception v1

    :goto_2
    if-eqz v0, :cond_4

    .line 513
    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_4
    throw v1
.end method

.method private updateLastUseTime(Ljava/lang/String;)V
    .locals 7

    .line 480
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "timestampUsed"

    .line 481
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 482
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "cache"

    const-string v3, "key = ?"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-virtual {v1, v2, v0, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v6

    :goto_0
    if-nez v0, :cond_1

    .line 483
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_1

    const-string v1, "Failed to update last use time for key \'%1$s\'"

    .line 484
    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v6

    invoke-interface {v0, v1, v2}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 11

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 149
    invoke-direct/range {v0 .. v10}, Lnet/toddm/cache/android/DBCacheProvider;->add(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    move-result v0

    return v0
.end method

.method public add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 11

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 157
    invoke-direct/range {v0 .. v10}, Lnet/toddm/cache/android/DBCacheProvider;->add(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    move-result v0

    return v0
.end method

.method public containsKey(Ljava/lang/String;Z)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 413
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 416
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 417
    :try_start_0
    invoke-direct {p0, p1, p2}, Lnet/toddm/cache/android/DBCacheProvider;->containsKeyInternal(Ljava/lang/String;Z)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 418
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 414
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;
    .locals 12

    if-eqz p1, :cond_4

    .line 228
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 232
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_0

    .line 236
    :try_start_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "cache"

    const/4 v6, 0x0

    const-string v7, "key = ?"

    new-array v8, v3, [Ljava/lang/String;

    aput-object p1, v8, v2

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v4 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    .line 238
    :cond_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string v4, "cache"

    const/4 v5, 0x0

    const-string v6, "key = ?"

    new-array v7, v3, [Ljava/lang/String;

    aput-object p1, v7, v2

    const-string p1, "id"

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "(timestampModified + ttl) >= %1$d"

    new-array v3, v3, [Ljava/lang/Object;

    .line 244
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v3, v2

    invoke-static {v8, v9, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    move-object v2, p2

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, p1

    .line 238
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 247
    :goto_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 248
    invoke-direct {p0, p1}, Lnet/toddm/cache/android/DBCacheProvider;->cacheEntryFromCursor(Landroid/database/Cursor;)Lnet/toddm/cache/CacheEntry;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 252
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lnet/toddm/cache/android/DBCacheProvider;->updateLastUseTime(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    if-eqz p1, :cond_2

    .line 258
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 264
    :catch_0
    :cond_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return-object v1

    :catchall_0
    move-exception p2

    move-object v1, p1

    move-object p1, p2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v1, :cond_3

    .line 258
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    goto :goto_3

    .line 262
    :catch_1
    :cond_3
    :goto_2
    :try_start_5
    throw p1

    .line 265
    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    .line 229
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAll(Z)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lnet/toddm/cache/CacheEntry;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 273
    iget-object v2, v1, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v2

    .line 274
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v3, 0x0

    .line 279
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 280
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v7, "timestampUsed"

    .line 281
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    if-eqz p1, :cond_0

    .line 286
    invoke-virtual/range {p0 .. p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    const-string v8, "cache"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v7 .. v14}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 289
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v7, "cache"

    invoke-virtual {v5, v7, v6, v3, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v3, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v3, v4

    goto :goto_1

    :cond_0
    const/4 v7, 0x1

    .line 293
    :try_start_3
    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, v8

    .line 294
    invoke-virtual/range {p0 .. p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const-string v9, "cache"

    const/4 v10, 0x0

    const-string v11, "(timestampModified + ttl) >= ?"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v7

    invoke-virtual/range {v8 .. v15}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 297
    invoke-virtual/range {p0 .. p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "cache"

    const-string v8, "(timestampModified + ttl) >= ?"

    invoke-virtual {v4, v5, v6, v8, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 299
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 301
    :cond_1
    invoke-direct {v1, v3}, Lnet/toddm/cache/android/DBCacheProvider;->cacheEntryFromCursor(Landroid/database/Cursor;)Lnet/toddm/cache/CacheEntry;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v4, :cond_1

    :cond_2
    if-eqz v3, :cond_3

    .line 307
    :try_start_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 313
    :catch_0
    :cond_3
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    return-object v0

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v3, :cond_4

    .line 307
    :try_start_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 311
    :catch_1
    :cond_4
    :try_start_7
    throw v0

    :catchall_2
    move-exception v0

    .line 314
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0
.end method

.method public getLruCap()I
    .locals 1

    .line 614
    iget v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_lruCap:I

    return v0
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 127
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT NOT NULL UNIQUE, valueString TEXT, valueBytes BLOB, timestampCreated INTEGER NOT NULL, timestampModified INTEGER NOT NULL, timestampUsed INTEGER NOT NULL, ttl INTEGER NOT NULL, maxStale INTEGER NOT NULL, sourceUri TEXT, eTag TEXT, priority TEXT NOT NULL, evictionScore REAL NOT NULL DEFAULT 1.0);"

    .line 128
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 129
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

    .line 137
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 138
    :try_start_0
    iget-object v1, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v2, "Upgrading database from version %1$d to %2$d (dropping all data)"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, v4

    const/4 p2, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v3, p2

    invoke-interface {v1, v2, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p2, "DROP TABLE IF EXISTS cache"

    .line 139
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT NOT NULL UNIQUE, valueString TEXT, valueBytes BLOB, timestampCreated INTEGER NOT NULL, timestampModified INTEGER NOT NULL, timestampUsed INTEGER NOT NULL, ttl INTEGER NOT NULL, maxStale INTEGER NOT NULL, sourceUri TEXT, eTag TEXT, priority TEXT NOT NULL, evictionScore REAL NOT NULL DEFAULT 1.0);"

    .line 140
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 141
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 7

    if-eqz p1, :cond_1

    .line 455
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 458
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 459
    :try_start_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "cache"

    const-string v3, "key = ?"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-virtual {v1, v2, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    move v4, v6

    .line 460
    :goto_0
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    .line 461
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 456
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'key\' can not be NULL or empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeAll()Z
    .locals 4

    .line 469
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 470
    :try_start_0
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "cache"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 471
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setLruCap(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 606
    iput p1, p0, Lnet/toddm/cache/android/DBCacheProvider;->_lruCap:I

    return-void

    .line 604
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'maxCacheSize\' can not be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public size(Z)I
    .locals 1

    .line 375
    iget-object v0, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 376
    :try_start_0
    invoke-direct {p0, p1}, Lnet/toddm/cache/android/DBCacheProvider;->sizeInternal(Z)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 377
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public trimLru()Z
    .locals 12

    .line 558
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getLruCap()I

    move-result v0

    if-ltz v0, :cond_3

    .line 562
    iget-object v1, p0, Lnet/toddm/cache/android/DBCacheProvider;->_databaseAccessLock:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x1

    .line 563
    :try_start_0
    invoke-direct {p0, v2}, Lnet/toddm/cache/android/DBCacheProvider;->sizeInternal(Z)I

    move-result v3

    if-le v3, v0, :cond_2

    .line 566
    invoke-direct {p0}, Lnet/toddm/cache/android/DBCacheProvider;->updateEvictionScores()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    .line 573
    :try_start_1
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "cache"

    sget-object v6, Lnet/toddm/cache/android/DBCacheProvider;->_EvictionScoreColumn:[Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, "evictionScore DESC"

    invoke-virtual/range {v4 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 574
    invoke-interface {v3, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 575
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v4

    .line 580
    new-array v6, v2, [Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, v0

    .line 581
    invoke-virtual {p0}, Lnet/toddm/cache/android/DBCacheProvider;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "cache"

    const-string v7, "evictionScore <= ?"

    invoke-virtual {v4, v5, v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 583
    iget-object v5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v5, :cond_0

    .line 584
    iget-object v5, p0, Lnet/toddm/cache/android/DBCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v6, "%1$d LRU entries deleted form cache"

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v7, v0

    invoke-interface {v5, v6, v7}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    if-eqz v3, :cond_2

    .line 590
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eqz v3, :cond_1

    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 591
    :catch_0
    :cond_1
    :try_start_4
    throw v0

    .line 594
    :catch_1
    :cond_2
    :goto_0
    monitor-exit v1

    return v2

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 560
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LRU cap can not be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
