.class public Lnet/sqlcipher/database/SQLiteCursor;
.super Lnet/sqlcipher/AbstractWindowedCursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;,
        Lnet/sqlcipher/database/SQLiteCursor$QueryThread;
    }
.end annotation


# static fields
.field static final NO_COUNT:I = -0x1

.field static final TAG:Ljava/lang/String; = "Cursor"


# instance fields
.field private mColumnNameMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private mColumns:[Ljava/lang/String;

.field private mCount:I

.field private mCursorState:I

.field private mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

.field private mDriver:Lnet/sqlcipher/database/SQLiteCursorDriver;

.field private mEditTable:Ljava/lang/String;

.field private mInitialRead:I

.field private mLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private mMaxRead:I

.field protected mNotificationHandler:Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;

.field private mPendingData:Z

.field private mQuery:Lnet/sqlcipher/database/SQLiteQuery;

.field private mStackTrace:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lnet/sqlcipher/database/SQLiteDatabase;Lnet/sqlcipher/database/SQLiteCursorDriver;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteQuery;)V
    .locals 5

    .line 225
    invoke-direct {p0}, Lnet/sqlcipher/AbstractWindowedCursor;-><init>()V

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 77
    const v0, 0x7fffffff

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mMaxRead:I

    .line 78
    const v0, 0x7fffffff

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mPendingData:Z

    .line 226
    new-instance v0, Lnet/sqlcipher/database/DatabaseObjectNotClosedException;

    invoke-direct {v0}, Lnet/sqlcipher/database/DatabaseObjectNotClosedException;-><init>()V

    invoke-virtual {v0}, Lnet/sqlcipher/database/DatabaseObjectNotClosedException;->fillInStackTrace()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mStackTrace:Ljava/lang/Throwable;

    .line 227
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 228
    iput-object p2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDriver:Lnet/sqlcipher/database/SQLiteCursorDriver;

    .line 229
    iput-object p3, p0, Lnet/sqlcipher/database/SQLiteCursor;->mEditTable:Ljava/lang/String;

    .line 230
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumnNameMap:Ljava/util/Map;

    .line 231
    iput-object p4, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    .line 234
    :try_start_0
    invoke-virtual {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 237
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteQuery;->columnCountLocked()I

    move-result v1

    .line 238
    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumns:[Ljava/lang/String;

    .line 241
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 242
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    invoke-virtual {v0, v2}, Lnet/sqlcipher/database/SQLiteQuery;->columnNameLocked(I)Ljava/lang/String;

    move-result-object v3

    .line 243
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumns:[Ljava/lang/String;

    aput-object v3, v0, v2

    .line 250
    const-string v0, "_id"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    iput v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mRowIdColumnIndex:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 255
    :cond_1
    invoke-virtual {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 256
    goto :goto_1

    .line 255
    :catchall_0
    move-exception v4

    invoke-virtual {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v4

    .line 257
    :goto_1
    return-void
.end method

.method static synthetic access$002(Lnet/sqlcipher/database/SQLiteCursor;Z)Z
    .locals 0

    .line 45
    iput-boolean p1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mPendingData:Z

    return p1
.end method

.method static synthetic access$100(Lnet/sqlcipher/database/SQLiteCursor;)Lnet/sqlcipher/CursorWindow;
    .locals 1

    .line 45
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    return-object v0
.end method

.method static synthetic access$200(Lnet/sqlcipher/database/SQLiteCursor;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 45
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method static synthetic access$300(Lnet/sqlcipher/database/SQLiteCursor;)I
    .locals 1

    .line 45
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    return v0
.end method

.method static synthetic access$400(Lnet/sqlcipher/database/SQLiteCursor;)I
    .locals 1

    .line 45
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mMaxRead:I

    return v0
.end method

.method static synthetic access$500(Lnet/sqlcipher/database/SQLiteCursor;)I
    .locals 1

    .line 45
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    return v0
.end method

.method static synthetic access$502(Lnet/sqlcipher/database/SQLiteCursor;I)I
    .locals 0

    .line 45
    iput p1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    return p1
.end method

.method static synthetic access$600(Lnet/sqlcipher/database/SQLiteCursor;)Lnet/sqlcipher/database/SQLiteQuery;
    .locals 1

    .line 45
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    return-object v0
.end method

.method static synthetic access$700(Lnet/sqlcipher/database/SQLiteCursor;)V
    .locals 0

    .line 45
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteCursor;->notifyDataSetChange()V

    return-void
.end method

.method private deactivateCommon()V
    .locals 1

    .line 500
    const/4 v0, 0x0

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    .line 501
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_0

    .line 502
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->close()V

    .line 503
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    .line 506
    :cond_0
    return-void
.end method

.method private fillWindow(I)V
    .locals 5

    .line 286
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-nez v0, :cond_0

    .line 288
    new-instance v0, Lnet/sqlcipher/CursorWindow;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lnet/sqlcipher/CursorWindow;-><init>(Z)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    goto :goto_0

    .line 290
    :cond_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    .line 291
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadLock()V

    .line 293
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    .line 296
    goto :goto_0

    .line 295
    :catchall_0
    move-exception v4

    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    throw v4

    .line 298
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/CursorWindow;->setStartPosition(I)V

    .line 299
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteQuery;->fillWindow(Lnet/sqlcipher/CursorWindow;II)I

    move-result v0

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 301
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 302
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    add-int/2addr v0, p1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 303
    new-instance v4, Ljava/lang/Thread;

    new-instance v0, Lnet/sqlcipher/database/SQLiteCursor$QueryThread;

    iget v1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteCursor$QueryThread;-><init>(Lnet/sqlcipher/database/SQLiteCursor;I)V

    const-string v1, "query thread"

    invoke-direct {v4, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 304
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 306
    :cond_1
    return-void
.end method

.method private queryThreadLock()V
    .locals 1

    .line 100
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 103
    :cond_0
    return-void
.end method

.method private queryThreadUnlock()V
    .locals 1

    .line 106
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 109
    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 517
    invoke-super {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->close()V

    .line 518
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->deactivateCommon()V

    .line 519
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteQuery;->close()V

    .line 520
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDriver:Lnet/sqlcipher/database/SQLiteCursorDriver;

    invoke-interface {v0}, Lnet/sqlcipher/database/SQLiteCursorDriver;->cursorClosed()V

    .line 521
    return-void
.end method

.method public commitUpdates(Ljava/util/Map;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<+Ljava/lang/Long;+Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;)Z"
        }
    .end annotation

    .line 413
    invoke-virtual/range {p0 .. p0}, Lnet/sqlcipher/database/SQLiteCursor;->supportsUpdates()Z

    move-result v0

    if-nez v0, :cond_0

    .line 414
    const-string v0, "Cursor"

    const-string v1, "commitUpdates not supported on this cursor, did you include the _id column?"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    const/4 v0, 0x0

    return v0

    .line 423
    :cond_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lnet/sqlcipher/database/SQLiteCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v3

    .line 424
    if-eqz p1, :cond_1

    .line 425
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mUpdatedRows:Ljava/util/HashMap;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 428
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-nez v0, :cond_2

    .line 429
    monitor-exit v3

    const/4 v0, 0x1

    return v0

    .line 437
    :cond_2
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 439
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 443
    move-object/from16 v0, p0

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 444
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 445
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Long;

    .line 447
    if-eqz v8, :cond_3

    if-nez v7, :cond_4

    .line 448
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "null rowId or values found! rowId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", values = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 452
    :cond_4
    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 453
    goto :goto_0

    .line 456
    :cond_5
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 458
    .line 459
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    .line 461
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 462
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lnet/sqlcipher/database/SQLiteCursor;->mEditTable:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " SET "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v0

    new-array v12, v0, [Ljava/lang/Object;

    .line 466
    const/4 v13, 0x0

    .line 467
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 468
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/util/Map$Entry;

    .line 469
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    const-string v0, "=?"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v12, v13

    .line 472
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 473
    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    :cond_6
    add-int/lit8 v13, v13, 0x1

    .line 476
    goto :goto_1

    .line 478
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " WHERE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lnet/sqlcipher/database/SQLiteCursor;->mColumns:[Ljava/lang/String;

    move-object/from16 v2, p0

    iget v2, v2, Lnet/sqlcipher/database/SQLiteCursor;->mRowIdColumnIndex:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    const/16 v0, 0x3b

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 481
    move-object/from16 v0, p0

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v12}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    move-object/from16 v0, p0

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    move-object/from16 v1, p0

    iget-object v1, v1, Lnet/sqlcipher/database/SQLiteCursor;->mEditTable:Ljava/lang/String;

    invoke-virtual {v0, v1, v9, v10}, Lnet/sqlcipher/database/SQLiteDatabase;->rowUpdated(Ljava/lang/String;J)V

    .line 483
    goto/16 :goto_0

    .line 484
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 486
    move-object/from16 v0, p0

    :try_start_3
    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 487
    goto :goto_2

    .line 486
    :catchall_0
    move-exception v15

    move-object/from16 v0, p0

    :try_start_4
    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    throw v15

    .line 489
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 490
    monitor-exit v3

    goto :goto_3

    :catchall_1
    move-exception v16

    monitor-exit v3

    throw v16

    .line 493
    :goto_3
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/sqlcipher/database/SQLiteCursor;->onChange(Z)V

    .line 495
    const/4 v0, 0x1

    return v0
.end method

.method public deactivate()V
    .locals 1

    .line 510
    invoke-super {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->deactivate()V

    .line 511
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->deactivateCommon()V

    .line 512
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDriver:Lnet/sqlcipher/database/SQLiteCursorDriver;

    invoke-interface {v0}, Lnet/sqlcipher/database/SQLiteCursorDriver;->cursorDeactivated()V

    .line 513
    return-void
.end method

.method public deleteRow()Z
    .locals 9

    .line 343
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteCursor;->checkPosition()V

    .line 346
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mRowIdColumnIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCurrentRowID:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 347
    :cond_0
    const-string v0, "Cursor"

    const-string v1, "Could not delete row because either the row ID column is not available or ithas not been read."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    const/4 v0, 0x0

    return v0

    .line 361
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 364
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mEditTable:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumns:[Ljava/lang/String;

    iget v4, p0, Lnet/sqlcipher/database/SQLiteCursor;->mRowIdColumnIndex:I

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=?"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCurrentRowID:Ljava/lang/Long;

    .line 365
    invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 364
    invoke-virtual {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 366
    const/4 v6, 0x1

    .line 369
    goto :goto_0

    .line 367
    :catch_0
    move-exception v7

    .line 368
    const/4 v6, 0x0

    .line 371
    :goto_0
    :try_start_1
    iget v7, p0, Lnet/sqlcipher/database/SQLiteCursor;->mPos:I

    .line 372
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteCursor;->requery()Z

    .line 378
    invoke-virtual {p0, v7}, Lnet/sqlcipher/database/SQLiteCursor;->moveToPosition(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 380
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 381
    goto :goto_1

    .line 380
    :catchall_0
    move-exception v8

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v8

    .line 383
    :goto_1
    if-eqz v6, :cond_2

    .line 384
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteCursor;->onChange(Z)V

    .line 385
    const/4 v0, 0x1

    return v0

    .line 387
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public fillWindow(ILandroid/database/CursorWindow;)V
    .locals 5

    .line 632
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-nez v0, :cond_0

    .line 634
    new-instance v0, Lnet/sqlcipher/CursorWindow;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lnet/sqlcipher/CursorWindow;-><init>(Z)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    goto :goto_0

    .line 636
    :cond_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    .line 637
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadLock()V

    .line 639
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 641
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    .line 642
    goto :goto_0

    .line 641
    :catchall_0
    move-exception v4

    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    throw v4

    .line 644
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/CursorWindow;->setStartPosition(I)V

    .line 645
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteQuery;->fillWindow(Lnet/sqlcipher/CursorWindow;II)I

    move-result v0

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 647
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 648
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    add-int/2addr v0, p1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 649
    new-instance v4, Ljava/lang/Thread;

    new-instance v0, Lnet/sqlcipher/database/SQLiteCursor$QueryThread;

    iget v1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    invoke-direct {v0, p0, v1}, Lnet/sqlcipher/database/SQLiteCursor$QueryThread;-><init>(Lnet/sqlcipher/database/SQLiteCursor;I)V

    const-string v1, "query thread"

    invoke-direct {v4, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 650
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 654
    :cond_1
    return-void
.end method

.method public finalize()V
    .locals 7

    .line 598
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_1

    .line 599
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteQuery;->mSql:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    .line 600
    const-string v0, "Cursor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finalizing a Cursor that has not been deactivated or closed. database = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 601
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", table = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mEditTable:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", query = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    iget-object v2, v2, Lnet/sqlcipher/database/SQLiteQuery;->mSql:Ljava/lang/String;

    const/16 v3, 0x64

    if-le v5, v3, :cond_0

    const/16 v3, 0x64

    goto :goto_0

    :cond_0
    move v3, v5

    .line 602
    :goto_0
    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mStackTrace:Ljava/lang/Throwable;

    .line 600
    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 604
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteCursor;->close()V

    .line 605
    invoke-static {}, Lnet/sqlcipher/database/SQLiteDebug;->notifyActiveCursorFinalized()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 613
    :cond_1
    invoke-super {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->finalize()V

    .line 614
    goto :goto_1

    .line 613
    :catchall_0
    move-exception v6

    invoke-super {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->finalize()V

    throw v6

    .line 615
    :goto_1
    return-void
.end method

.method public getColumnIndex(Ljava/lang/String;)I
    .locals 7

    .line 311
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumnNameMap:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 312
    iget-object v3, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumns:[Ljava/lang/String;

    .line 313
    array-length v4, v3

    .line 314
    new-instance v5, Ljava/util/HashMap;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {v5, v4, v0}, Ljava/util/HashMap;-><init>(IF)V

    .line 315
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    .line 316
    aget-object v0, v3, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 318
    :cond_0
    iput-object v5, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumnNameMap:Ljava/util/Map;

    .line 322
    :cond_1
    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 323
    const/4 v0, -0x1

    if-eq v3, v0, :cond_2

    .line 324
    new-instance v4, Ljava/lang/Exception;

    invoke-direct {v4}, Ljava/lang/Exception;-><init>()V

    .line 325
    const-string v0, "Cursor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requesting column name with table name -- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 326
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 329
    :cond_2
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumnNameMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 330
    if-eqz v4, :cond_3

    .line 331
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 333
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method public getColumnNames()[Ljava/lang/String;
    .locals 1

    .line 393
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mColumns:[Ljava/lang/String;

    return-object v0
.end method

.method public getCount()I
    .locals 2

    .line 279
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 280
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/sqlcipher/database/SQLiteCursor;->fillWindow(I)V

    .line 282
    :cond_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    return v0
.end method

.method public getDatabase()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    .line 263
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    return-object v0
.end method

.method public onMove(II)Z
    .locals 2

    .line 269
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->getStartPosition()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    .line 270
    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->getStartPosition()I

    move-result v0

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v1}, Lnet/sqlcipher/CursorWindow;->getNumRows()I

    move-result v1

    add-int/2addr v0, v1

    if-lt p2, v0, :cond_1

    .line 271
    :cond_0
    invoke-direct {p0, p2}, Lnet/sqlcipher/database/SQLiteCursor;->fillWindow(I)V

    .line 274
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 3

    .line 191
    invoke-super {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 192
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mMaxRead:I

    const v1, 0x7fffffff

    if-ne v1, v0, :cond_0

    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    const v1, 0x7fffffff

    if-eq v1, v0, :cond_2

    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mNotificationHandler:Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;

    if-nez v0, :cond_2

    .line 194
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadLock()V

    .line 196
    :try_start_0
    new-instance v0, Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;

    invoke-direct {v0, p0}, Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;-><init>(Lnet/sqlcipher/database/SQLiteCursor;)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mNotificationHandler:Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;

    .line 197
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mPendingData:Z

    if-eqz v0, :cond_1

    .line 198
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteCursor;->notifyDataSetChange()V

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mPendingData:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :cond_1
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    .line 203
    goto :goto_0

    .line 202
    :catchall_0
    move-exception v2

    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    throw v2

    .line 206
    :cond_2
    :goto_0
    return-void
.end method

.method public requery()Z
    .locals 6

    .line 525
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteCursor;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    const/4 v0, 0x0

    return v0

    .line 528
    :cond_0
    const-wide/16 v2, 0x0

    .line 536
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 538
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_1

    .line 539
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->clear()V

    .line 541
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mPos:I

    .line 543
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDriver:Lnet/sqlcipher/database/SQLiteCursorDriver;

    invoke-interface {v0, p0}, Lnet/sqlcipher/database/SQLiteCursorDriver;->cursorRequeried(Landroid/database/Cursor;)V

    .line 544
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 545
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    .line 546
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadLock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 548
    :try_start_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteQuery;->requery()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 550
    :try_start_2
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    .line 551
    goto :goto_0

    .line 550
    :catchall_0
    move-exception v4

    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 553
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 554
    goto :goto_1

    .line 553
    :catchall_1
    move-exception v5

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v5

    .line 561
    :goto_1
    invoke-super {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->requery()Z

    move-result v4

    .line 566
    return v4
.end method

.method public setLoadStyle(II)V
    .locals 2

    .line 94
    iput p2, p0, Lnet/sqlcipher/database/SQLiteCursor;->mMaxRead:I

    .line 95
    iput p1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mInitialRead:I

    .line 96
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 97
    return-void
.end method

.method public setSelectionArguments([Ljava/lang/String;)V
    .locals 1

    .line 588
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mDriver:Lnet/sqlcipher/database/SQLiteCursorDriver;

    invoke-interface {v0, p1}, Lnet/sqlcipher/database/SQLiteCursorDriver;->setBindArguments([Ljava/lang/String;)V

    .line 589
    return-void
.end method

.method public setWindow(Lnet/sqlcipher/CursorWindow;)V
    .locals 3

    .line 571
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_0

    .line 572
    iget v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCursorState:I

    .line 573
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadLock()V

    .line 575
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 577
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    .line 578
    goto :goto_0

    .line 577
    :catchall_0
    move-exception v2

    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteCursor;->queryThreadUnlock()V

    throw v2

    .line 579
    :goto_0
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mCount:I

    .line 581
    :cond_0
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    .line 582
    return-void
.end method

.method public supportsUpdates()Z
    .locals 1

    .line 403
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor;->mEditTable:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
