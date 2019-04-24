.class public Lnet/sqlcipher/database/SQLiteDatabase;
.super Lnet/sqlcipher/database/SQLiteClosable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;,
        Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;,
        Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;
    }
.end annotation


# static fields
.field private static final COMMIT_SQL:Ljava/lang/String; = "COMMIT;"

.field public static final CONFLICT_ABORT:I = 0x2

.field public static final CONFLICT_FAIL:I = 0x3

.field public static final CONFLICT_IGNORE:I = 0x4

.field public static final CONFLICT_NONE:I = 0x0

.field public static final CONFLICT_REPLACE:I = 0x5

.field public static final CONFLICT_ROLLBACK:I = 0x1

.field private static final CONFLICT_VALUES:[Ljava/lang/String;

.field public static final CREATE_IF_NECESSARY:I = 0x10000000

.field private static final EMAIL_IN_DB_PATTERN:Ljava/util/regex/Pattern;

.field private static final EVENT_DB_CORRUPT:I = 0x124fc

.field private static final EVENT_DB_OPERATION:I = 0xcb20

.field static final GET_LOCK_LOG_PREFIX:Ljava/lang/String; = "GETLOCK:"

.field private static final KEY_ENCODING:Ljava/lang/String; = "UTF-8"

.field private static final LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS:I = 0x64

.field private static final LOCK_ACQUIRED_WARNING_TIME_IN_MS:I = 0x12c

.field private static final LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT:I = 0x7d0

.field private static final LOCK_WARNING_WINDOW_IN_MS:I = 0x4e20

.field private static final LOG_SLOW_QUERIES_PROPERTY:Ljava/lang/String; = "db.log.slow_query_threshold"

.field public static final MAX_SQL_CACHE_SIZE:I = 0xfa

.field private static final MAX_WARNINGS_ON_CACHESIZE_CONDITION:I = 0x1

.field public static final MEMORY:Ljava/lang/String; = ":memory:"

.field public static final NO_LOCALIZED_COLLATORS:I = 0x10

.field public static final OPEN_READONLY:I = 0x1

.field public static final OPEN_READWRITE:I = 0x0

.field private static final OPEN_READ_MASK:I = 0x1

.field private static final QUERY_LOG_SQL_LENGTH:I = 0x40

.field private static final SLEEP_AFTER_YIELD_QUANTUM:I = 0x3e8

.field public static final SQLCIPHER_ANDROID_VERSION:Ljava/lang/String; = "3.5.9"

.field public static final SQLITE_MAX_LIKE_PATTERN_LENGTH:I = 0xc350

.field private static final TAG:Ljava/lang/String; = "Database"

.field private static sActiveDatabases:Ljava/util/WeakHashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private static sQueryLogTimeInMillis:I = 0x0


# instance fields
.field private mCacheFullWarnings:I

.field mCompiledQueries:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lnet/sqlcipher/database/SQLiteCompiledSql;>;"
        }
    .end annotation
.end field

.field private final mErrorHandler:Lnet/sqlcipher/DatabaseErrorHandler;

.field private mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

.field private mFlags:I

.field private mInnerTransactionIsSuccessful:Z

.field private mLastLockMessageTime:J

.field private mLastSqlStatement:Ljava/lang/String;

.field private final mLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private mLockAcquiredThreadTime:J

.field private mLockAcquiredWallTime:J

.field private mLockingEnabled:Z

.field private mMaxSqlCacheSize:I

.field mNativeHandle:J

.field private mNumCacheHits:I

.field private mNumCacheMisses:I

.field private mPath:Ljava/lang/String;

.field private mPathForLogs:Ljava/lang/String;

.field private mPrograms:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<Lnet/sqlcipher/database/SQLiteClosable;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private final mSlowQueryThreshold:I

.field private mStackTrace:Ljava/lang/Throwable;

.field private final mSyncUpdateInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;>;"
        }
    .end annotation
.end field

.field mTempTableSequence:I

.field private mTimeClosed:Ljava/lang/String;

.field private mTimeOpened:Ljava/lang/String;

.field private mTransactionIsSuccessful:Z

.field private mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 86
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    .line 301
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, " OR ROLLBACK "

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, " OR ABORT "

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, " OR FAIL "

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, " OR IGNORE "

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, " OR REPLACE "

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->CONFLICT_VALUES:[Ljava/lang/String;

    .line 389
    const-string v0, "[\\w\\.\\-]+@[\\w\\.\\-]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->EMAIL_IN_DB_PATTERN:Ljava/util/regex/Pattern;

    .line 402
    const/4 v0, 0x0

    sput v0, Lnet/sqlcipher/database/SQLiteDatabase;->sQueryLogTimeInMillis:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/DatabaseErrorHandler;)V
    .locals 2

    .line 2393
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteClosable;-><init>()V

    .line 372
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 374
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredWallTime:J

    .line 375
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredThreadTime:J

    .line 391
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLastLockMessageTime:J

    .line 405
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLastSqlStatement:Ljava/lang/String;

    .line 412
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNativeHandle:J

    .line 415
    const/4 v0, 0x0

    iput v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTempTableSequence:I

    .line 421
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPathForLogs:Ljava/lang/String;

    .line 447
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    .line 452
    const/16 v0, 0xfa

    iput v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I

    .line 466
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeOpened:Ljava/lang/String;

    .line 467
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeClosed:Ljava/lang/String;

    .line 470
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mStackTrace:Ljava/lang/Throwable;

    .line 534
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockingEnabled:Z

    .line 938
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    .line 2394
    if-nez p1, :cond_0

    .line 2395
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "path should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2398
    :cond_0
    iput p3, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFlags:I

    .line 2399
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    .line 2401
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    .line 2402
    new-instance v0, Lnet/sqlcipher/database/DatabaseObjectNotClosedException;

    invoke-direct {v0}, Lnet/sqlcipher/database/DatabaseObjectNotClosedException;-><init>()V

    invoke-virtual {v0}, Lnet/sqlcipher/database/DatabaseObjectNotClosedException;->fillInStackTrace()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mStackTrace:Ljava/lang/Throwable;

    .line 2403
    iput-object p2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    .line 2404
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPrograms:Ljava/util/WeakHashMap;

    .line 2406
    iput-object p4, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mErrorHandler:Lnet/sqlcipher/DatabaseErrorHandler;

    .line 2407
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)V
    .locals 1

    .line 2357
    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, p4, v0}, Lnet/sqlcipher/database/SQLiteDatabase;-><init>(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/DatabaseErrorHandler;)V

    .line 2358
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabaseInternal([CLnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 2359
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 1

    .line 2378
    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, p4, v0}, Lnet/sqlcipher/database/SQLiteDatabase;-><init>(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/DatabaseErrorHandler;)V

    .line 2379
    invoke-direct {p0, p2, p5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabaseInternal([CLnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 2380
    return-void
.end method

.method static synthetic access$000(Lnet/sqlcipher/database/SQLiteDatabase;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 72
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->key([B)V

    return-void
.end method

.method static synthetic access$100(Lnet/sqlcipher/database/SQLiteDatabase;[C)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 72
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->key_mutf8([C)V

    return-void
.end method

.method private checkLockHoldTime()V
    .locals 10

    .line 613
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 614
    iget-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredWallTime:J

    sub-long v6, v4, v0

    .line 615
    const-wide/16 v0, 0x7d0

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    const-string v0, "Database"

    .line 616
    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLastLockMessageTime:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x4e20

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 618
    return-void

    .line 620
    :cond_0
    const-wide/16 v0, 0x12c

    cmp-long v0, v6, v0

    if-lez v0, :cond_3

    .line 622
    invoke-static {}, Landroid/os/Debug;->threadCpuTimeNanos()J

    move-result-wide v0

    iget-wide v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredThreadTime:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 623
    const/16 v0, 0x64

    if-gt v8, v0, :cond_1

    const-wide/16 v0, 0x7d0

    cmp-long v0, v6, v0

    if-lez v0, :cond_3

    .line 625
    :cond_1
    iput-wide v4, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLastLockMessageTime:J

    .line 626
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lock held on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms. Thread time was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 628
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_LOCK_TIME_TRACKING_STACK_TRACE:Z

    if-eqz v0, :cond_2

    .line 629
    const-string v0, "Database"

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v9, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 631
    :cond_2
    const-string v0, "Database"

    invoke-static {v0, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 635
    :cond_3
    :goto_0
    return-void
.end method

.method private closeClosable()V
    .locals 4

    .line 1302
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->deallocCachedSqlStatements()V

    .line 1304
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPrograms:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1305
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1306
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    .line 1307
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lnet/sqlcipher/database/SQLiteClosable;

    .line 1308
    if-eqz v3, :cond_0

    .line 1309
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteClosable;->onAllReferencesReleasedFromContainer()V

    .line 1311
    :cond_0
    goto :goto_0

    .line 1312
    :cond_1
    return-void
.end method

.method private containsNull([C)Z
    .locals 7

    .line 2459
    const/4 v1, 0x0

    .line 2460
    const/4 v2, 0x0

    .line 2461
    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    .line 2462
    move-object v3, p1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-char v6, v3, v5

    .line 2463
    if-ne v6, v1, :cond_0

    .line 2464
    const/4 v2, 0x1

    .line 2465
    goto :goto_1

    .line 2462
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2469
    :cond_1
    :goto_1
    return v2
.end method

.method public static create(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 3

    .line 1253
    const-string v0, ":memory:"

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    :goto_0
    const/high16 v2, 0x10000000

    invoke-static {v0, v1, p0, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static create(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;[C)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 2

    .line 1272
    const-string v0, ":memory:"

    const/high16 v1, 0x10000000

    invoke-static {v0, p1, p0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method private native dbclose()V
.end method

.method private native dbopen(Ljava/lang/String;I)V
.end method

.method private deallocCachedSqlStatements()V
    .locals 5

    .line 2628
    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    monitor-enter v1

    .line 2629
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lnet/sqlcipher/database/SQLiteCompiledSql;

    .line 2630
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteCompiledSql;->releaseSqlStatement()V

    .line 2631
    goto :goto_0

    .line 2632
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2633
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 2634
    :goto_1
    return-void
.end method

.method private native enableSqlProfiling(Ljava/lang/String;)V
.end method

.method private native enableSqlTracing(Ljava/lang/String;)V
.end method

.method public static findEditTable(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1551
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1553
    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 1554
    const/16 v0, 0x2c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    .line 1556
    if-lez v2, :cond_1

    if-lt v2, v3, :cond_0

    if-gez v3, :cond_1

    .line 1557
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1558
    :cond_1
    if-lez v3, :cond_3

    if-lt v3, v2, :cond_2

    if-gez v2, :cond_3

    .line 1559
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1561
    :cond_3
    return-object p0

    .line 1563
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid tables"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getActiveDatabases()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lnet/sqlcipher/database/SQLiteDatabase;>;"
        }
    .end annotation

    .line 2785
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2786
    sget-object v2, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    monitor-enter v2

    .line 2787
    :try_start_0
    sget-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2788
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 2789
    :goto_0
    return-object v1
.end method

.method private static getAttachedDbs(Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/ArrayList<Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 2818
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2819
    const/4 v0, 0x0

    return-object v0

    .line 2821
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2822
    const-string v0, "pragma database_list;"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v4

    .line 2823
    :goto_0
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2824
    new-instance v0, Landroid/util/Pair;

    const/4 v1, 0x1

    invoke-interface {v4, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v4, v2}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2826
    :cond_1
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->close()V

    .line 2827
    return-object v3
.end method

.method private getBytes([C)[B
    .locals 4

    .line 2831
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 2832
    :cond_1
    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap([C)Ljava/nio/CharBuffer;

    move-result-object v1

    .line 2833
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/charset/Charset;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 2834
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    new-array v3, v0, [B

    .line 2835
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 2836
    return-object v3
.end method

.method static getDbStats()Ljava/util/ArrayList;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lnet/sqlcipher/database/SQLiteDebug$DbStats;>;"
        }
    .end annotation

    .line 2736
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2738
    invoke-static {}, Lnet/sqlcipher/database/SQLiteDatabase;->getActiveDatabases()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lnet/sqlcipher/database/SQLiteDatabase;

    .line 2739
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2740
    goto :goto_0

    .line 2744
    :cond_1
    invoke-direct {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->native_getDbLookaside()I

    move-result v10

    .line 2747
    invoke-virtual {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v11

    .line 2748
    const-string v0, "/"

    invoke-virtual {v11, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v12

    .line 2749
    const/4 v0, -0x1

    if-eq v12, v0, :cond_2

    add-int/lit8 v12, v12, 0x1

    move v0, v12

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    .line 2752
    invoke-static {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->getAttachedDbs(Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/ArrayList;

    move-result-object v14

    .line 2753
    if-nez v14, :cond_3

    .line 2754
    goto :goto_0

    .line 2756
    :cond_3
    const/4 v15, 0x0

    :goto_2
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v15, v0, :cond_8

    .line 2757
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/util/Pair;

    .line 2758
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".page_count;"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPragmaVal(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v17

    .line 2763
    if-nez v15, :cond_4

    .line 2764
    move-object/from16 v19, v13

    goto :goto_4

    .line 2767
    :cond_4
    const/4 v10, 0x0

    .line 2768
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  (attached) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 2770
    move-object/from16 v0, v16

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 2771
    move-object/from16 v0, v16

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v20

    .line 2772
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    move/from16 v2, v20

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    add-int/lit8 v20, v20, 0x1

    move/from16 v2, v20

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 2775
    :cond_6
    :goto_4
    const-wide/16 v0, 0x0

    cmp-long v0, v17, v0

    if-lez v0, :cond_7

    .line 2776
    new-instance v0, Lnet/sqlcipher/database/SQLiteDebug$DbStats;

    invoke-virtual {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->getPageSize()J

    move-result-wide v4

    move-object/from16 v1, v19

    move-wide/from16 v2, v17

    move v6, v10

    invoke-direct/range {v0 .. v6}, Lnet/sqlcipher/database/SQLiteDebug$DbStats;-><init>(Ljava/lang/String;JJI)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2756
    :cond_7
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_2

    .line 2780
    :cond_8
    goto/16 :goto_0

    .line 2781
    :cond_9
    return-object v7
.end method

.method private getPathForLogs()Ljava/lang/String;
    .locals 2

    .line 2537
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPathForLogs:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2538
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPathForLogs:Ljava/lang/String;

    return-object v0

    .line 2540
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 2541
    const/4 v0, 0x0

    return-object v0

    .line 2543
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 2544
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPathForLogs:Ljava/lang/String;

    goto :goto_0

    .line 2546
    :cond_2
    sget-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->EMAIL_IN_DB_PATTERN:Ljava/util/regex/Pattern;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "XX@YY"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPathForLogs:Ljava/lang/String;

    .line 2548
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPathForLogs:Ljava/lang/String;

    return-object v0
.end method

.method private static getPragmaVal(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)J
    .locals 9

    .line 2799
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2800
    const-wide/16 v0, 0x0

    return-wide v0

    .line 2802
    :cond_0
    const/4 v3, 0x0

    .line 2804
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteStatement;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PRAGMA "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteStatement;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    move-object v3, v0

    .line 2805
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v4

    .line 2806
    move-wide v6, v4

    .line 2808
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    :cond_1
    return-wide v6

    :catchall_0
    move-exception v8

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    :cond_2
    throw v8
.end method

.method private getTime()Ljava/lang/String;
    .locals 3

    .line 2499
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss.SSS "

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private native key([B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation
.end method

.method private keyDatabase(Lnet/sqlcipher/database/SQLiteDatabaseHook;Ljava/lang/Runnable;)V
    .locals 4

    .line 2473
    if-eqz p1, :cond_0

    .line 2474
    invoke-interface {p1, p0}, Lnet/sqlcipher/database/SQLiteDatabaseHook;->preKey(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 2476
    :cond_0
    if-eqz p2, :cond_1

    .line 2477
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 2479
    :cond_1
    if-eqz p1, :cond_2

    .line 2480
    invoke-interface {p1, p0}, Lnet/sqlcipher/database/SQLiteDatabaseHook;->postKey(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 2482
    :cond_2
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_3

    .line 2483
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeOpened:Ljava/lang/String;

    .line 2486
    :cond_3
    const-string v0, "select count(*) from sqlite_master;"

    const/4 v1, 0x0

    :try_start_0
    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v2

    .line 2487
    if-eqz v2, :cond_4

    .line 2488
    invoke-interface {v2}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    .line 2489
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v3

    .line 2490
    invoke-interface {v2}, Lnet/sqlcipher/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2495
    :cond_4
    goto :goto_0

    .line 2492
    :catch_0
    move-exception v2

    .line 2493
    const-string v0, "Database"

    invoke-virtual {v2}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2494
    throw v2

    .line 2496
    :goto_0
    return-void
.end method

.method private native key_mutf8([C)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation
.end method

.method private static loadICUData(Landroid/content/Context;Ljava/io/File;)V
    .locals 11

    .line 144
    const/4 v3, 0x0

    .line 145
    const/4 v4, 0x0

    .line 146
    new-instance v5, Ljava/io/File;

    const-string v0, "icu"

    invoke-direct {v5, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 147
    new-instance v6, Ljava/io/File;

    const-string v0, "icudt46l.dat"

    invoke-direct {v6, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 149
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 150
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    new-instance v0, Ljava/util/zip/ZipInputStream;

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "icudt46l.zip"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v4, v0

    .line 152
    invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 153
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 154
    const/16 v0, 0x400

    new-array v7, v0, [B

    .line 156
    :goto_0
    invoke-virtual {v4, v7}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v0

    move v8, v0

    if-lez v0, :cond_1

    .line 157
    const/4 v0, 0x0

    invoke-virtual {v3, v7, v0, v8}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 170
    :cond_1
    if-eqz v4, :cond_2

    .line 171
    :try_start_1
    invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->close()V

    .line 173
    :cond_2
    if-eqz v3, :cond_3

    .line 174
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 175
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 180
    :cond_3
    goto :goto_2

    .line 177
    :catch_0
    move-exception v7

    .line 178
    const-string v0, "Database"

    const-string v1, "Error in closing streams IO streams after expanding ICU dat file"

    invoke-static {v0, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 179
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 161
    :catch_1
    move-exception v7

    .line 162
    const-string v0, "Database"

    const-string v1, "Error copying icu dat file"

    :try_start_2
    invoke-static {v0, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 163
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 164
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 166
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    :catchall_0
    move-exception v9

    .line 170
    if-eqz v4, :cond_5

    .line 171
    :try_start_3
    invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->close()V

    .line 173
    :cond_5
    if-eqz v3, :cond_6

    .line 174
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 175
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 180
    :cond_6
    goto :goto_1

    .line 177
    :catch_2
    move-exception v10

    .line 178
    const-string v0, "Database"

    const-string v1, "Error in closing streams IO streams after expanding ICU dat file"

    invoke-static {v0, v1, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 179
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v10}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    throw v9

    .line 182
    :goto_2
    return-void
.end method

.method public static declared-synchronized loadLibs(Landroid/content/Context;)V
    .locals 2

    const-class v1, Lnet/sqlcipher/database/SQLiteDatabase;

    monitor-enter v1

    .line 202
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static declared-synchronized loadLibs(Landroid/content/Context;Ljava/io/File;)V
    .locals 2

    const-class v1, Lnet/sqlcipher/database/SQLiteDatabase;

    monitor-enter v1

    .line 209
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteDatabase$1;

    invoke-direct {v0}, Lnet/sqlcipher/database/SQLiteDatabase$1;-><init>()V

    invoke-static {p0, p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;Ljava/io/File;Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static declared-synchronized loadLibs(Landroid/content/Context;Ljava/io/File;Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;)V
    .locals 4

    const-class v3, Lnet/sqlcipher/database/SQLiteDatabase;

    monitor-enter v3

    .line 230
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sqlcipher"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;->loadLibraries([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    monitor-exit v3

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method public static declared-synchronized loadLibs(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;)V
    .locals 2

    const-class v1, Lnet/sqlcipher/database/SQLiteDatabase;

    monitor-enter v1

    .line 223
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;Ljava/io/File;Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method private lockForced()V
    .locals 2

    .line 572
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 573
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_LOCK_TIME_TRACKING:Z

    if-eqz v0, :cond_0

    .line 574
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 576
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredWallTime:J

    .line 577
    invoke-static {}, Landroid/os/Debug;->threadCpuTimeNanos()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredThreadTime:J

    .line 580
    :cond_0
    return-void
.end method

.method private markTableSyncable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1509
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1511
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT _sync_dirty FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " LIMIT 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->native_execSQL(Ljava/lang/String;)V

    .line 1513
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " LIMIT 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->native_execSQL(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1516
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 1517
    goto :goto_0

    .line 1516
    :catchall_0
    move-exception v2

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v2

    .line 1519
    :goto_0
    new-instance v2, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;

    invoke-direct {v2, p3, p4, p2}, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1521
    iget-object v3, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    monitor-enter v3

    .line 1522
    :try_start_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1523
    monitor-exit v3

    goto :goto_1

    :catchall_1
    move-exception v4

    monitor-exit v3

    throw v4

    .line 1524
    :goto_1
    return-void
.end method

.method private native native_getDbLookaside()I
.end method

.method private native native_key([C)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation
.end method

.method private native native_rawExecSQL(Ljava/lang/String;)V
.end method

.method private native native_rekey(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation
.end method

.method private native native_status(IZ)I
.end method

.method public static openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 1019
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 1065
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 1116
    move-object v0, p0

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    :goto_0
    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 1041
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 1089
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 7

    .line 1143
    const/4 v3, 0x0

    .line 1144
    if-eqz p5, :cond_0

    move-object v4, p5

    goto :goto_0

    :cond_0
    new-instance v4, Lnet/sqlcipher/DefaultDatabaseErrorHandler;

    invoke-direct {v4}, Lnet/sqlcipher/DefaultDatabaseErrorHandler;-><init>()V

    .line 1148
    :goto_0
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-direct {v0, p0, p2, p3, v4}, Lnet/sqlcipher/database/SQLiteDatabase;-><init>(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/DatabaseErrorHandler;)V

    move-object v3, v0

    .line 1149
    invoke-direct {v3, p1, p4}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabaseInternal([CLnet/sqlcipher/database/SQLiteDatabaseHook;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1163
    goto :goto_1

    .line 1150
    :catch_0
    move-exception v5

    .line 1153
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calling error handler for corrupt database "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1158
    invoke-interface {v4, v3}, Lnet/sqlcipher/DatabaseErrorHandler;->onCorruption(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1161
    new-instance v3, Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-direct {v3, p0, p2, p3, v4}, Lnet/sqlcipher/database/SQLiteDatabase;-><init>(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/DatabaseErrorHandler;)V

    .line 1162
    invoke-direct {v3, p1, p4}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabaseInternal([CLnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 1165
    :goto_1
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_STATEMENTS:Z

    if-eqz v0, :cond_1

    .line 1166
    invoke-direct {v3, p0}, Lnet/sqlcipher/database/SQLiteDatabase;->enableSqlTracing(Ljava/lang/String;)V

    .line 1168
    :cond_1
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_TIME:Z

    if-eqz v0, :cond_2

    .line 1169
    invoke-direct {v3, p0}, Lnet/sqlcipher/database/SQLiteDatabase;->enableSqlProfiling(Ljava/lang/String;)V

    .line 1172
    :cond_2
    sget-object v5, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    monitor-enter v5

    .line 1173
    :try_start_1
    sget-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1174
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1176
    :goto_2
    return-object v3
.end method

.method private openDatabaseInternal([CLnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 13

    .line 2410
    const/4 v2, 0x1

    .line 2411
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->getBytes([C)[B

    move-result-object v3

    .line 2412
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    iget v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFlags:I

    invoke-direct {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->dbopen(Ljava/lang/String;I)V

    .line 2415
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteDatabase$2;

    invoke-direct {v0, p0, v3}, Lnet/sqlcipher/database/SQLiteDatabase$2;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;[B)V

    invoke-direct {p0, p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->keyDatabase(Lnet/sqlcipher/database/SQLiteDatabaseHook;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2422
    const/4 v2, 0x0

    .line 2443
    nop

    .line 2444
    .line 2445
    .line 2446
    .line 2449
    if-eqz v3, :cond_6

    array-length v0, v3

    if-lez v0, :cond_6

    .line 2450
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-byte v7, v4, v6

    .line 2451
    const/4 v7, 0x0

    .line 2450
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    goto/16 :goto_4

    .line 2424
    :catch_0
    move-exception v4

    .line 2426
    :try_start_1
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->containsNull([C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2427
    new-instance v0, Lnet/sqlcipher/database/SQLiteDatabase$3;

    invoke-direct {v0, p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase$3;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;[C)V

    invoke-direct {p0, p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->keyDatabase(Lnet/sqlcipher/database/SQLiteDatabaseHook;Ljava/lang/Runnable;)V

    .line 2434
    if-eqz v3, :cond_1

    array-length v0, v3

    if-lez v0, :cond_1

    .line 2435
    invoke-direct {p0, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->rekey([B)V

    .line 2437
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 2439
    :cond_2
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2443
    :goto_1
    nop

    .line 2444
    .line 2445
    .line 2446
    .line 2449
    if-eqz v3, :cond_6

    array-length v0, v3

    if-lez v0, :cond_6

    .line 2450
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_3

    aget-byte v7, v4, v6

    .line 2451
    const/4 v7, 0x0

    .line 2450
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    goto :goto_4

    .line 2443
    :catchall_0
    move-exception v8

    if-eqz v2, :cond_4

    .line 2444
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->dbclose()V

    .line 2445
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_4

    .line 2446
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeClosed:Ljava/lang/String;

    .line 2449
    :cond_4
    if-eqz v3, :cond_5

    array-length v0, v3

    if-lez v0, :cond_5

    .line 2450
    move-object v9, v3

    array-length v10, v9

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_5

    aget-byte v12, v9, v11

    .line 2451
    const/4 v12, 0x0

    .line 2450
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_5
    throw v8

    .line 2456
    :cond_6
    :goto_4
    return-void
.end method

.method public static openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 1219
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 1183
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 1198
    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0, p1, p2, p3, p4}, Lnet/sqlcipher/database/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 2

    .line 1226
    const/high16 v0, 0x10000000

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 1190
    const/high16 v0, 0x10000000

    invoke-static {p0, p1, p2, v0, p3}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 1203
    move-object v0, p0

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    :goto_0
    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    const/high16 v3, 0x10000000

    invoke-static/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 2

    .line 1233
    const/high16 v0, 0x10000000

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 1207
    const/high16 v0, 0x10000000

    invoke-static {p0, p1, p2, v0, p3}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public static openOrCreateDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 1212
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    const/high16 v3, 0x10000000

    invoke-static/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method private native rekey([B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation
.end method

.method public static native releaseMemory()I
.end method

.method public static native setICURoot(Ljava/lang/String;)V
.end method

.method private unlockForced()V
    .locals 2

    .line 603
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_LOCK_TIME_TRACKING:Z

    if-eqz v0, :cond_0

    .line 604
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 605
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->checkLockHoldTime()V

    .line 608
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 609
    return-void
.end method

.method private yieldIfContendedHelper(ZJ)Z
    .locals 6

    .line 898
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getQueueLength()I

    move-result v0

    if-nez v0, :cond_0

    .line 901
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredWallTime:J

    .line 902
    invoke-static {}, Landroid/os/Debug;->threadCpuTimeNanos()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredThreadTime:J

    .line 903
    const/4 v0, 0x0

    return v0

    .line 905
    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V

    .line 906
    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    .line 907
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 908
    if-eqz p1, :cond_1

    .line 909
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isDbLockedByCurrentThread()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 910
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Db locked more than once. yielfIfContended cannot yield"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 914
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_4

    .line 918
    move-wide v3, p2

    .line 919
    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_4

    .line 921
    const-wide/16 v0, 0x3e8

    cmp-long v0, v3, v0

    if-gez v0, :cond_3

    move-wide v0, v3

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x3e8

    :goto_0
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 925
    goto :goto_1

    .line 923
    :catch_0
    move-exception v5

    .line 924
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 926
    :goto_1
    const-wide/16 v0, 0x3e8

    sub-long/2addr v3, v0

    .line 927
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getQueueLength()I

    move-result v0

    if-nez v0, :cond_2

    .line 928
    .line 932
    :cond_4
    invoke-virtual {p0, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransactionWithListener(Lnet/sqlcipher/database/SQLiteTransactionListener;)V

    .line 933
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method addSQLiteClosable(Lnet/sqlcipher/database/SQLiteClosable;)V
    .locals 3

    .line 480
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 482
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPrograms:Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 484
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 485
    goto :goto_0

    .line 484
    :catchall_0
    move-exception v2

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v2

    .line 486
    :goto_0
    return-void
.end method

.method addToCompiledQueries(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteCompiledSql;)V
    .locals 6

    .line 2583
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I

    if-nez v0, :cond_1

    .line 2585
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_0

    .line 2586
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "|NOT adding_sql_to_cache|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2588
    :cond_0
    return-void

    .line 2591
    :cond_1
    const/4 v3, 0x0

    .line 2592
    iget-object v4, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    monitor-enter v4

    .line 2594
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lnet/sqlcipher/database/SQLiteCompiledSql;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2595
    if-eqz v3, :cond_2

    .line 2596
    monitor-exit v4

    return-void

    .line 2599
    :cond_2
    :try_start_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I

    if-ne v0, v1, :cond_3

    .line 2607
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCacheFullWarnings:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCacheFullWarnings:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 2608
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Reached MAX size for compiled-sql statement cache for database "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 2609
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; i.e., NO space for this sql statement in cache: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Please change your sql statements to use \'?\' for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "bindargs, instead of using actual values"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2608
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2616
    :cond_3
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2617
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_4

    .line 2618
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "|adding_sql_to_cache|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    .line 2619
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2618
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2622
    :cond_4
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 2623
    :goto_1
    return-void
.end method

.method public beginTransaction()V
    .locals 1

    .line 658
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransactionWithListener(Lnet/sqlcipher/database/SQLiteTransactionListener;)V

    .line 659
    return-void
.end method

.method public beginTransactionWithListener(Lnet/sqlcipher/database/SQLiteTransactionListener;)V
    .locals 6

    .line 685
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lockForced()V

    .line 686
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 687
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 689
    :cond_0
    const/4 v2, 0x0

    .line 692
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 693
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mInnerTransactionIsSuccessful:Z

    if-eqz v0, :cond_1

    .line 694
    const-string v3, "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction"

    .line 696
    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 697
    const-string v0, "Database"

    const-string v1, "beginTransaction() failed"

    invoke-static {v0, v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 698
    throw v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 700
    :cond_1
    const/4 v2, 0x1

    .line 720
    nop

    .line 701
    .line 723
    return-void

    .line 706
    :cond_2
    const-string v0, "BEGIN EXCLUSIVE;"

    :try_start_1
    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 707
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    .line 708
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionIsSuccessful:Z

    .line 709
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mInnerTransactionIsSuccessful:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 710
    if-eqz p1, :cond_3

    .line 712
    :try_start_2
    invoke-interface {p1}, Lnet/sqlcipher/database/SQLiteTransactionListener;->onBegin()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 716
    goto :goto_0

    .line 713
    :catch_0
    move-exception v3

    .line 714
    const-string v0, "ROLLBACK;"

    :try_start_3
    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 715
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 718
    :cond_3
    :goto_0
    const/4 v2, 0x1

    .line 720
    goto :goto_1

    .line 720
    .line 723
    :catchall_0
    move-exception v5

    if-nez v2, :cond_4

    .line 723
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlockForced()V

    :cond_4
    throw v5

    .line 726
    :goto_1
    return-void
.end method

.method public changePassword(Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/database/SQLiteException;
        }
    .end annotation

    .line 106
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Lnet/sqlcipher/database/SQLiteException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_0
    if-eqz p1, :cond_1

    .line 110
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->getBytes([C)[B

    move-result-object v2

    .line 111
    invoke-direct {p0, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->rekey([B)V

    .line 112
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-byte v6, v3, v5

    .line 113
    const/4 v6, 0x0

    .line 112
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 116
    :cond_1
    return-void
.end method

.method public changePassword([C)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/database/SQLiteException;
        }
    .end annotation

    .line 131
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    new-instance v0, Lnet/sqlcipher/database/SQLiteException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_0
    if-eqz p1, :cond_1

    .line 135
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->getBytes([C)[B

    move-result-object v2

    .line 136
    invoke-direct {p0, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->rekey([B)V

    .line 137
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-byte v6, v3, v5

    .line 138
    const/4 v6, 0x0

    .line 137
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 141
    :cond_1
    return-void
.end method

.method public close()V
    .locals 2

    .line 1281
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1282
    return-void

    .line 1284
    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1286
    :try_start_0
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->closeClosable()V

    .line 1288
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onAllReferencesReleased()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1290
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 1291
    goto :goto_0

    .line 1290
    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v1

    .line 1292
    :goto_0
    return-void
.end method

.method public compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 1584
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1585
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1586
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1589
    :cond_0
    :try_start_0
    new-instance v2, Lnet/sqlcipher/database/SQLiteStatement;

    invoke-direct {v2, p0, p1}, Lnet/sqlcipher/database/SQLiteStatement;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1591
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return-object v2

    :catchall_0
    move-exception v3

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v3
.end method

.method public delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 7

    .line 2112
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2113
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2114
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2116
    :cond_0
    const/4 v3, 0x0

    .line 2118
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETE FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 2119
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " WHERE "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2118
    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    move-object v3, v0

    .line 2121
    if-eqz p3, :cond_2

    .line 2122
    array-length v4, p3

    .line 2123
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 2124
    add-int/lit8 v0, v5, 0x1

    aget-object v1, p3, v5

    invoke-static {v3, v0, v1}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 2123
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 2127
    :cond_2
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->execute()V

    .line 2128
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lastChangeCount()I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    .line 2133
    if-eqz v3, :cond_3

    .line 2134
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2136
    :cond_3
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return v4

    .line 2129
    :catch_0
    move-exception v4

    .line 2130
    :try_start_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 2131
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2133
    :catchall_0
    move-exception v6

    if-eqz v3, :cond_4

    .line 2134
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2136
    :cond_4
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v6
.end method

.method public endTransaction()V
    .locals 5

    .line 735
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 736
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 738
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_1

    .line 739
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no transaction pending"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 742
    :cond_1
    :try_start_0
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mInnerTransactionIsSuccessful:Z

    if-eqz v0, :cond_2

    .line 743
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mInnerTransactionIsSuccessful:Z

    goto :goto_0

    .line 745
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionIsSuccessful:Z

    .line 747
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 779
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    .line 780
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlockForced()V

    .line 748
    return-void

    .line 750
    :cond_3
    const/4 v2, 0x0

    .line 751
    :try_start_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_5

    .line 753
    :try_start_2
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionIsSuccessful:Z

    if-eqz v0, :cond_4

    .line 754
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    invoke-interface {v0}, Lnet/sqlcipher/database/SQLiteTransactionListener;->onCommit()V

    goto :goto_1

    .line 756
    :cond_4
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    invoke-interface {v0}, Lnet/sqlcipher/database/SQLiteTransactionListener;->onRollback()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 761
    :goto_1
    goto :goto_2

    .line 758
    :catch_0
    move-exception v3

    .line 759
    move-object v2, v3

    .line 760
    const/4 v0, 0x0

    :try_start_3
    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionIsSuccessful:Z

    .line 763
    :cond_5
    :goto_2
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionIsSuccessful:Z

    if-eqz v0, :cond_6

    .line 764
    const-string v0, "COMMIT;"

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    .line 767
    :cond_6
    const-string v0, "ROLLBACK;"

    :try_start_4
    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 768
    if-eqz v2, :cond_7

    .line 769
    throw v2
    :try_end_4
    .catch Lnet/sqlcipher/SQLException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 776
    :cond_7
    goto :goto_3

    .line 771
    :catch_1
    move-exception v3

    .line 773
    const-string v0, "Database"

    const-string v1, "exception during rollback, maybe the DB previously performed an auto-rollback"

    :try_start_5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 779
    :goto_3
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    .line 780
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlockForced()V

    .line 785
    goto :goto_4

    .line 779
    :catchall_0
    move-exception v4

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTransactionListener:Lnet/sqlcipher/database/SQLiteTransactionListener;

    .line 780
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlockForced()V

    throw v4

    .line 786
    :goto_4
    return-void
.end method

.method public execSQL(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 2259
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 2260
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2261
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2262
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2265
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->native_execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2270
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 2271
    goto :goto_0

    .line 2266
    :catch_0
    move-exception v4

    .line 2267
    :try_start_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 2268
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2270
    :catchall_0
    move-exception v5

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v5

    .line 2272
    :goto_0
    return-void
.end method

.method public execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 2302
    if-nez p2, :cond_0

    .line 2303
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Empty bindArgs"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2305
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 2306
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2307
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2308
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2310
    :cond_1
    const/4 v4, 0x0

    .line 2312
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    move-object v4, v0

    .line 2313
    if-eqz p2, :cond_2

    .line 2314
    array-length v5, p2

    .line 2315
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 2316
    add-int/lit8 v0, v6, 0x1

    aget-object v1, p2, v6

    invoke-static {v4, v0, v1}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 2315
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 2319
    :cond_2
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteStatement;->execute()V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2324
    if-eqz v4, :cond_3

    .line 2325
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2327
    :cond_3
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 2328
    goto :goto_1

    .line 2320
    :catch_0
    move-exception v5

    .line 2321
    :try_start_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 2322
    throw v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2324
    :catchall_0
    move-exception v7

    if-eqz v4, :cond_4

    .line 2325
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2327
    :cond_4
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v7

    .line 2329
    :goto_1
    return-void
.end method

.method protected finalize()V
    .locals 3

    .line 2333
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2334
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "close() was never explicitly called on database \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mStackTrace:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2336
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->closeClosable()V

    .line 2337
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onAllReferencesReleased()V

    .line 2339
    :cond_0
    return-void
.end method

.method getCompiledStatementForSql(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteCompiledSql;
    .locals 7

    .line 2641
    const/4 v3, 0x0

    .line 2643
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    monitor-enter v5

    .line 2644
    :try_start_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I

    if-nez v0, :cond_1

    .line 2646
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_0

    .line 2647
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "|cache NOT found|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2649
    :cond_0
    monitor-exit v5

    const/4 v0, 0x0

    return-object v0

    .line 2651
    :cond_1
    :try_start_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lnet/sqlcipher/database/SQLiteCompiledSql;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 2652
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 2653
    :goto_1
    if-eqz v4, :cond_3

    .line 2654
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNumCacheHits:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNumCacheHits:I

    goto :goto_2

    .line 2656
    :cond_3
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNumCacheMisses:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNumCacheMisses:I

    .line 2659
    :goto_2
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_4

    .line 2660
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "|cache_stats|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 2661
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNumCacheHits:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNumCacheMisses:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeOpened:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeClosed:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2660
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2665
    :cond_4
    return-object v3
.end method

.method public declared-synchronized getMaxSqlCacheSize()I
    .locals 2

    monitor-enter p0

    .line 2703
    :try_start_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public getMaximumSize()J
    .locals 8

    .line 1360
    const/4 v2, 0x0

    .line 1361
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1362
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1363
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1366
    :cond_0
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteStatement;

    const-string v1, "PRAGMA max_page_count;"

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteStatement;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    move-object v2, v0

    .line 1368
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v3

    .line 1369
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPageSize()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    mul-long v5, v3, v0

    .line 1371
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1372
    :cond_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return-wide v5

    .line 1371
    :catchall_0
    move-exception v7

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1372
    :cond_2
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v7
.end method

.method public getPageSize()J
    .locals 8

    .line 1412
    const/4 v2, 0x0

    .line 1413
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1414
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1415
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1418
    :cond_0
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteStatement;

    const-string v1, "PRAGMA page_size;"

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteStatement;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    move-object v2, v0

    .line 1420
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v3

    .line 1421
    move-wide v5, v3

    .line 1423
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1424
    :cond_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return-wide v5

    .line 1423
    :catchall_0
    move-exception v7

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1424
    :cond_2
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v7
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 2528
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    return-object v0
.end method

.method public getSyncedTables()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 942
    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    monitor-enter v1

    .line 943
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 944
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 945
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;

    .line 946
    iget-object v0, v5, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;->deletedTable:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 947
    iget-object v0, v5, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;->deletedTable:Ljava/lang/String;

    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 949
    :cond_0
    goto :goto_0

    .line 950
    :cond_1
    monitor-exit v1

    return-object v2

    .line 951
    :catchall_0
    move-exception v6

    monitor-exit v1

    throw v6
.end method

.method public getVersion()I
    .locals 7

    .line 1327
    const/4 v2, 0x0

    .line 1328
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1329
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1330
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1333
    :cond_0
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteStatement;

    const-string v1, "PRAGMA user_version;"

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteStatement;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    move-object v2, v0

    .line 1334
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v3

    .line 1335
    long-to-int v5, v3

    .line 1337
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1338
    :cond_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return v5

    .line 1337
    :catchall_0
    move-exception v6

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1338
    :cond_2
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v6
.end method

.method public inTransaction()Z
    .locals 1

    .line 815
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 4

    .line 1930
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 1931
    :catch_0
    move-exception v3

    .line 1932
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error inserting <redacted values> into "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1933
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 1952
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    .locals 12

    .line 2016
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2017
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2021
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x98

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2022
    const-string v0, "INSERT"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2023
    sget-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->CONFLICT_VALUES:[Ljava/lang/String;

    aget-object v0, v0, p4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2024
    const-string v0, " INTO "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2025
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2027
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x28

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2029
    const/4 v5, 0x0

    .line 2030
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/content/ContentValues;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 2031
    invoke-virtual {p3}, Landroid/content/ContentValues;->valueSet()Ljava/util/Set;

    move-result-object v5

    .line 2032
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 2033
    const/16 v0, 0x28

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2035
    const/4 v7, 0x0

    .line 2036
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2037
    if-eqz v7, :cond_1

    .line 2038
    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2039
    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2041
    :cond_1
    const/4 v7, 0x1

    .line 2042
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 2043
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2044
    const/16 v0, 0x3f

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2045
    goto :goto_0

    .line 2047
    :cond_2
    const/16 v0, 0x29

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2048
    goto :goto_1

    .line 2049
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2050
    const-string v0, "NULL"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2053
    :goto_1
    const-string v0, " VALUES("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2054
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2055
    const-string v0, ");"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2057
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2058
    const/4 v6, 0x0

    .line 2060
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    move-object v6, v0

    .line 2063
    if-eqz v5, :cond_4

    .line 2064
    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v7

    .line 2065
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 2066
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v7, :cond_4

    .line 2067
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 2068
    add-int/lit8 v0, v9, 0x1

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6, v0, v1}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 2066
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 2074
    :cond_4
    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteStatement;->execute()V

    .line 2076
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lastChangeCount()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lastInsertRow()J

    move-result-wide v7

    goto :goto_3

    :cond_5
    const-wide/16 v7, -0x1

    .line 2077
    :goto_3
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-nez v0, :cond_6

    .line 2078
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error inserting <redacted values> using <redacted sql> into "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    .line 2080
    :cond_6
    const-string v0, "Database"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2081
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inserting row "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from <redacted values> using <redacted sql> into "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2085
    :cond_7
    :goto_4
    move-wide v9, v7

    .line 2090
    if-eqz v6, :cond_8

    .line 2091
    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2093
    :cond_8
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return-wide v9

    .line 2086
    :catch_0
    move-exception v7

    .line 2087
    :try_start_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 2088
    throw v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2090
    :catchall_0
    move-exception v11

    if-eqz v6, :cond_9

    .line 2091
    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2093
    :cond_9
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v11
.end method

.method public isDbLockedByCurrentThread()Z
    .locals 1

    .line 824
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    return v0
.end method

.method public isDbLockedByOtherThreads()Z
    .locals 1

    .line 836
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isInCompiledSqlCache(Ljava/lang/String;)Z
    .locals 3

    .line 2673
    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    monitor-enter v1

    .line 2674
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 2675
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public isOpen()Z
    .locals 4

    .line 2514
    iget-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mNativeHandle:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isReadOnly()Z
    .locals 2

    .line 2507
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFlags:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method native lastChangeCount()I
.end method

.method native lastInsertRow()J
.end method

.method lock()V
    .locals 2

    .line 552
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockingEnabled:Z

    if-nez v0, :cond_0

    return-void

    .line 553
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 554
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_LOCK_TIME_TRACKING:Z

    if-eqz v0, :cond_1

    .line 555
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 557
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredWallTime:J

    .line 558
    invoke-static {}, Landroid/os/Debug;->threadCpuTimeNanos()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockAcquiredThreadTime:J

    .line 561
    :cond_1
    return-void
.end method

.method public markTableSyncable(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1457
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1458
    new-instance v0, Lnet/sqlcipher/database/SQLiteException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1461
    :cond_0
    const-string v0, "_id"

    invoke-direct {p0, p1, v0, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->markTableSyncable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1462
    return-void
.end method

.method public markTableSyncable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1485
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1486
    new-instance v0, Lnet/sqlcipher/database/SQLiteException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1489
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->markTableSyncable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1490
    return-void
.end method

.method native native_execSQL(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation
.end method

.method native native_setLocale(Ljava/lang/String;I)V
.end method

.method public needUpgrade(I)Z
    .locals 1

    .line 2519
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getVersion()I

    move-result v0

    if-le p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onAllReferencesReleased()V
    .locals 3

    .line 499
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 500
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_CACHE:Z

    if-eqz v0, :cond_0

    .line 501
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mTimeClosed:Ljava/lang/String;

    .line 503
    :cond_0
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->dbclose()V

    .line 505
    sget-object v1, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    monitor-enter v1

    .line 506
    :try_start_0
    sget-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->sActiveDatabases:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 507
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 509
    :cond_1
    :goto_0
    return-void
.end method

.method onCorruption()V
    .locals 3

    .line 537
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calling error handler for corrupt database (detected) "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 540
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mErrorHandler:Lnet/sqlcipher/DatabaseErrorHandler;

    invoke-interface {v0, p0}, Lnet/sqlcipher/DatabaseErrorHandler;->onCorruption(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 541
    return-void
.end method

.method public purgeFromCompiledSqlCache(Ljava/lang/String;)V
    .locals 3

    .line 2683
    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    monitor-enter v1

    .line 2684
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2685
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 2686
    :goto_0
    return-void
.end method

.method public query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 10

    .line 1723
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    const/4 v1, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v0 .. v9}, Lnet/sqlcipher/database/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 10

    .line 1766
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v9}, Lnet/sqlcipher/database/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 11

    .line 1634
    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v10}, Lnet/sqlcipher/database/SQLiteDatabase;->queryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public queryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 9

    .line 1676
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1677
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1679
    :cond_0
    move v0, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    invoke-static/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->buildQueryString(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1682
    .line 1683
    invoke-static {p3}, Lnet/sqlcipher/database/SQLiteDatabase;->findEditTable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1682
    invoke-virtual {p0, p1, v8, p6, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQueryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public rawExecSQL(Ljava/lang/String;)V
    .locals 6

    .line 2275
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 2276
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2277
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2278
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2281
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->native_rawExecSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2286
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 2287
    goto :goto_0

    .line 2282
    :catch_0
    move-exception v4

    .line 2283
    :try_start_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 2284
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2286
    :catchall_0
    move-exception v5

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v5

    .line 2288
    :goto_0
    return-void
.end method

.method public rawQuery(Ljava/lang/String;[Ljava/lang/Object;)Lnet/sqlcipher/Cursor;
    .locals 14

    .line 1804
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1805
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1807
    :cond_0
    const-wide/16 v3, 0x0

    .line 1808
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 1809
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1811
    :cond_1
    new-instance v5, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 1812
    const/4 v6, 0x0

    .line 1814
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    move-object/from16 v1, p2

    invoke-virtual {v5, v0, v1}, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->query(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;[Ljava/lang/Object;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 1816
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 1818
    const/4 v7, -0x1

    .line 1819
    if-eqz v6, :cond_2

    .line 1820
    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v7

    .line 1823
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v8, v0, v3

    .line 1825
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    int-to-long v0, v0

    cmp-long v0, v8, v0

    if-ltz v0, :cond_3

    .line 1826
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1827
    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", args are <redacted>, count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1826
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1830
    :cond_3
    goto :goto_0

    .line 1816
    :catchall_0
    move-exception v10

    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 1818
    const/4 v11, -0x1

    .line 1819
    nop

    .line 1820
    .line 1823
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v12, v0, v3

    .line 1825
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    int-to-long v0, v0

    cmp-long v0, v12, v0

    if-ltz v0, :cond_4

    .line 1826
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1827
    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", args are <redacted>, count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1826
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1830
    :cond_4
    throw v10

    .line 1832
    :cond_5
    :goto_0
    new-instance v0, Lnet/sqlcipher/CrossProcessCursorWrapper;

    invoke-direct {v0, v6}, Lnet/sqlcipher/CrossProcessCursorWrapper;-><init>(Lnet/sqlcipher/Cursor;)V

    return-object v0
.end method

.method public rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 2

    .line 1785
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQueryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public rawQuery(Ljava/lang/String;[Ljava/lang/String;II)Lnet/sqlcipher/Cursor;
    .locals 3

    .line 1911
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQueryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lnet/sqlcipher/CursorWrapper;

    .line 1912
    invoke-virtual {v2}, Lnet/sqlcipher/CursorWrapper;->getWrappedCursor()Lnet/sqlcipher/Cursor;

    move-result-object v0

    check-cast v0, Lnet/sqlcipher/database/SQLiteCursor;

    invoke-virtual {v0, p3, p4}, Lnet/sqlcipher/database/SQLiteCursor;->setLoadStyle(II)V

    .line 1913
    return-object v2
.end method

.method public rawQueryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 14

    .line 1854
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1855
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1857
    :cond_0
    const-wide/16 v3, 0x0

    .line 1859
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 1860
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1863
    :cond_1
    new-instance v5, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    invoke-direct {v5, p0, v0, v1}, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 1865
    const/4 v6, 0x0

    .line 1867
    if-eqz p1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    :goto_0
    move-object/from16 v1, p3

    invoke-interface {v5, v0, v1}, Lnet/sqlcipher/database/SQLiteCursorDriver;->query(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 1871
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 1874
    const/4 v7, -0x1

    .line 1875
    if-eqz v6, :cond_3

    .line 1876
    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v7

    .line 1879
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v8, v0, v3

    .line 1881
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    int-to-long v0, v0

    cmp-long v0, v8, v0

    if-ltz v0, :cond_4

    .line 1882
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1883
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", args are <redacted>, count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1882
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1886
    :cond_4
    goto :goto_1

    .line 1871
    :catchall_0
    move-exception v10

    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 1874
    const/4 v11, -0x1

    .line 1875
    nop

    .line 1876
    .line 1879
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v12, v0, v3

    .line 1881
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSlowQueryThreshold:I

    int-to-long v0, v0

    cmp-long v0, v12, v0

    if-ltz v0, :cond_5

    .line 1882
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1883
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", args are <redacted>, count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1882
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1886
    :cond_5
    throw v10

    .line 1888
    :cond_6
    :goto_1
    new-instance v0, Lnet/sqlcipher/CrossProcessCursorWrapper;

    invoke-direct {v0, v6}, Lnet/sqlcipher/CrossProcessCursorWrapper;-><init>(Lnet/sqlcipher/Cursor;)V

    return-object v0
.end method

.method removeSQLiteClosable(Lnet/sqlcipher/database/SQLiteClosable;)V
    .locals 2

    .line 489
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 491
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mPrograms:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 493
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 494
    goto :goto_0

    .line 493
    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v1

    .line 495
    :goto_0
    return-void
.end method

.method public replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 4

    .line 1968
    const/4 v0, 0x5

    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 1970
    :catch_0
    move-exception v3

    .line 1971
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error inserting <redacted values> into "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1972
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 1990
    const/4 v0, 0x5

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public resetCompiledSqlCache()V
    .locals 3

    .line 2693
    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    monitor-enter v1

    .line 2694
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mCompiledQueries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2695
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 2696
    :goto_0
    return-void
.end method

.method rowUpdated(Ljava/lang/String;J)V
    .locals 5

    .line 1534
    iget-object v3, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    monitor-enter v3

    .line 1535
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mSyncUpdateInfo:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1536
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 1537
    :goto_0
    if-eqz v2, :cond_0

    .line 1538
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v2, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;->masterTable:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " SET _sync_dirty=1 WHERE _id=(SELECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v2, Lnet/sqlcipher/database/SQLiteDatabase$SyncUpdateInfo;->foreignKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1542
    :cond_0
    return-void
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 3

    .line 2560
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2562
    :try_start_0
    invoke-virtual {p1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mFlags:I

    invoke-virtual {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->native_setLocale(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2564
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 2565
    goto :goto_0

    .line 2564
    :catchall_0
    move-exception v2

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v2

    .line 2566
    :goto_0
    return-void
.end method

.method public setLockingEnabled(Z)V
    .locals 0

    .line 527
    iput-boolean p1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockingEnabled:Z

    .line 528
    return-void
.end method

.method public declared-synchronized setMaxSqlCacheSize(I)V
    .locals 2

    monitor-enter p0

    .line 2722
    const/16 v0, 0xfa

    if-gt p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 2723
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "expected value between 0 and 250"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2724
    :cond_1
    iget v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I

    if-ge p1, v0, :cond_2

    .line 2725
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2728
    :cond_2
    iput p1, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mMaxSqlCacheSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2729
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setMaximumSize(J)J
    .locals 14

    .line 1384
    const/4 v4, 0x0

    .line 1385
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 1386
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1387
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1390
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPageSize()J

    move-result-wide v5

    .line 1391
    div-long v7, p1, v5

    .line 1393
    rem-long v0, p1, v5

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 1394
    const-wide/16 v0, 0x1

    add-long/2addr v7, v0

    .line 1396
    :cond_1
    new-instance v0, Lnet/sqlcipher/database/SQLiteStatement;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PRAGMA max_page_count = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteStatement;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    move-object v4, v0

    .line 1398
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v9

    .line 1399
    mul-long v11, v9, v5

    .line 1401
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1402
    :cond_2
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return-wide v11

    .line 1401
    :catchall_0
    move-exception v13

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1402
    :cond_3
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v13
.end method

.method public setPageSize(J)V
    .locals 2

    .line 1436
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PRAGMA page_size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1437
    return-void
.end method

.method public setTransactionSuccessful()V
    .locals 2

    .line 798
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 799
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 801
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_1

    .line 802
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no transaction pending"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 804
    :cond_1
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mInnerTransactionIsSuccessful:Z

    if-eqz v0, :cond_2

    .line 805
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setTransactionSuccessful may only be called once per call to beginTransaction"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 808
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mInnerTransactionIsSuccessful:Z

    .line 809
    return-void
.end method

.method public setVersion(I)V
    .locals 2

    .line 1351
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PRAGMA user_version = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1352
    return-void
.end method

.method public status(IZ)I
    .locals 1

    .line 90
    invoke-direct {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->native_status(IZ)I

    move-result v0

    return v0
.end method

.method unlock()V
    .locals 2

    .line 588
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLockingEnabled:Z

    if-nez v0, :cond_0

    return-void

    .line 589
    :cond_0
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_LOCK_TIME_TRACKING:Z

    if-eqz v0, :cond_1

    .line 590
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 591
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->checkLockHoldTime()V

    .line 594
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 595
    return-void
.end method

.method public update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 2155
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteDatabase;->updateWithOnConflict(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public updateWithOnConflict(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)I
    .locals 12

    .line 2175
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/ContentValues;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2176
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Empty values"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2179
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x78

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2180
    const-string v0, "UPDATE "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2181
    sget-object v0, Lnet/sqlcipher/database/SQLiteDatabase;->CONFLICT_VALUES:[Ljava/lang/String;

    aget-object v0, v0, p5

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2182
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2183
    const-string v0, " SET "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2185
    invoke-virtual {p2}, Landroid/content/ContentValues;->valueSet()Ljava/util/Set;

    move-result-object v4

    .line 2186
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 2188
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2189
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 2190
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2191
    const-string v0, "=?"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2192
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2193
    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2195
    :cond_2
    goto :goto_0

    .line 2197
    :cond_3
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2198
    const-string v0, " WHERE "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2199
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2202
    :cond_4
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 2203
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_5

    .line 2204
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "database not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2206
    :cond_5
    const/4 v6, 0x0

    .line 2208
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    move-object v6, v0

    .line 2211
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v7

    .line 2212
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 2213
    const/4 v8, 0x1

    .line 2214
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v7, :cond_6

    .line 2215
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 2216
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6, v8, v0}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 2217
    add-int/lit8 v8, v8, 0x1

    .line 2214
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 2220
    :cond_6
    if-eqz p4, :cond_7

    .line 2221
    move-object/from16 v0, p4

    array-length v7, v0

    .line 2222
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v7, :cond_7

    .line 2223
    aget-object v0, p4, v9

    invoke-virtual {v6, v8, v0}, Lnet/sqlcipher/database/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 2224
    add-int/lit8 v8, v8, 0x1

    .line 2222
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 2229
    :cond_7
    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteStatement;->execute()V

    .line 2230
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->lastChangeCount()I

    move-result v9

    .line 2231
    const-string v0, "Database"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2232
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Updated "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " rows using <redacted values> and <redacted sql> for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2235
    :cond_8
    move v10, v9

    .line 2243
    if-eqz v6, :cond_9

    .line 2244
    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2246
    :cond_9
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return v10

    .line 2236
    :catch_0
    move-exception v7

    .line 2237
    :try_start_1
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 2238
    throw v7

    .line 2239
    :catch_1
    move-exception v7

    .line 2240
    const-string v0, "Database"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error updating <redacted values> using <redacted sql> for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2241
    throw v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2243
    :catchall_0
    move-exception v11

    if-eqz v6, :cond_a

    .line 2244
    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 2246
    :cond_a
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v11
.end method

.method public yieldIfContended()Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 852
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 854
    :cond_0
    const/4 v0, 0x0

    const-wide/16 v1, -0x1

    invoke-direct {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->yieldIfContendedHelper(ZJ)Z

    move-result v0

    return v0
.end method

.method public yieldIfContendedSafely()Z
    .locals 3

    .line 869
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 871
    :cond_0
    const/4 v0, 0x1

    const-wide/16 v1, -0x1

    invoke-direct {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->yieldIfContendedHelper(ZJ)Z

    move-result v0

    return v0
.end method

.method public yieldIfContendedSafely(J)Z
    .locals 1

    .line 892
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 894
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->yieldIfContendedHelper(ZJ)Z

    move-result v0

    return v0
.end method
