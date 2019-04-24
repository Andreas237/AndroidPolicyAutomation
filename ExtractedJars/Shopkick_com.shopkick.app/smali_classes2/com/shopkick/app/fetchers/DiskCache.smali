.class public Lcom/shopkick/app/fetchers/DiskCache;
.super Ljava/lang/Object;
.source "DiskCache.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;,
        Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;,
        Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;
    }
.end annotation


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "cache"

.field private static final DATABASE_VERSION:I = 0x3

.field public static final DISK_CACHE_FOLDER_NAME:Ljava/lang/String; = "disk_cache"

.field private static final EVICTION_MULTIPLIER:D = 0.75

.field private static final EXPIRATION_TIME_COLUMN:Ljava/lang/String; = "expiration_time"

.field private static final ID_COLUMN:Ljava/lang/String; = "id"

.field private static final KEY_COLUMN:Ljava/lang/String; = "key"

.field private static final LAST_USE_TIME_COLUMN:Ljava/lang/String; = "last_use_time"

.field private static final LAST_USE_TIME_GRANULARITY:I = 0xbb8

.field private static final MAX_PENDING_CACHE_SIZE_BYTES:J = 0x200000L

.field private static final PINNED_COLUMN:Ljava/lang/String; = "pinned"

.field private static final SIZE_COLUMN:Ljava/lang/String; = "size"

.field private static final evictWhereClause:Ljava/lang/String; = "pinned = 0"

.field private static final expireWhereClause:Ljava/lang/String; = "expiration_time < ? AND expiration_time > 0"

.field private static final selectCol:[Ljava/lang/String;

.field private static final whereClause:Ljava/lang/String; = "key = ?"

.field private static final whereParam:[Ljava/lang/String;


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private done:Z

.field private mContext:Landroid/content/Context;

.field private mDatabase:Landroid/database/sqlite/SQLiteDatabase;

.field private mDatabaseHelper:Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

.field private mMaxSizeOnDisk:I

.field private mTableName:Ljava/lang/String;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pendingCacheEntries:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;",
            ">;"
        }
    .end annotation
.end field

.field private pendingCacheSize:J

.field private persistThread:Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

.field private shouldRun:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    .line 44
    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/shopkick/app/fetchers/DiskCache;->whereParam:[Ljava/lang/String;

    const-string v0, "id"

    const-string v1, "last_use_time"

    const-string/jumbo v2, "size"

    const-string v3, "expiration_time"

    .line 46
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/fetchers/DiskCache;->selectCol:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->shouldRun:Z

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->done:Z

    const-wide/16 v0, 0x0

    .line 67
    iput-wide v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheSize:J

    if-eqz p2, :cond_0

    const-string v0, ""

    .line 98
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    iput-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mContext:Landroid/content/Context;

    .line 103
    iput-object p2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    return-void

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The argument \'cacheName\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/fetchers/DiskCache;)Z
    .locals 0

    .line 30
    iget-boolean p0, p0, Lcom/shopkick/app/fetchers/DiskCache;->shouldRun:Z

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheEntries:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/fetchers/DiskCache;)J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheSize:J

    return-wide v0
.end method

.method static synthetic access$202(Lcom/shopkick/app/fetchers/DiskCache;J)J
    .locals 0

    .line 30
    iput-wide p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheSize:J

    return-wide p1
.end method

.method static synthetic access$302(Lcom/shopkick/app/fetchers/DiskCache;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->done:Z

    return p1
.end method

.method static synthetic access$400(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/io/File;
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/DiskCache;->getDiskCacheDirectory()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/fetchers/DiskCache;)I
    .locals 0

    .line 30
    iget p0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mMaxSizeOnDisk:I

    return p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/fetchers/DiskCache;Ljava/lang/Long;)Ljava/io/File;
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/shopkick/app/fetchers/DiskCache;->getFileFromId(Ljava/lang/Long;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method private deleteFile(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 178
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/fetchers/DiskCache;->getFileFromId(Ljava/lang/Long;)Ljava/io/File;

    move-result-object p1

    .line 179
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method private getDiskCacheDirectory()Ljava/io/File;
    .locals 3

    .line 83
    new-instance v0, Landroid/content/ContextWrapper;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 84
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "disk_cache"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-object v1
.end method

.method private getFileFromId(Ljava/lang/Long;)Ljava/io/File;
    .locals 4

    .line 92
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/DiskCache;->getDiskCacheDirectory()Ljava/io/File;

    move-result-object v0

    .line 93
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabaseHelper:Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;->close()V

    return-void
.end method

.method public deleteAll()V
    .locals 5

    .line 107
    new-instance v0, Landroid/content/ContextWrapper;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 108
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "disk_cache"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 109
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .line 111
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 114
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabaseHelper:Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabaseHelper:Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_2

    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DROP TABLE IF EXISTS "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public drop()V
    .locals 3

    .line 248
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/DiskCache;->killPersistThread()V

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DROP TABLE IF EXISTS "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public getNumItems()I
    .locals 11

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheEntries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    const-string v2, "key"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v1 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-nez v1, :cond_0

    return v0

    .line 267
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    .line 268
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    add-int/2addr v2, v0

    return v2
.end method

.method public killPersistThread()V
    .locals 3

    const/4 v0, 0x0

    .line 322
    iput-boolean v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->shouldRun:Z

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheEntries:Ljava/util/ArrayList;

    monitor-enter v0

    .line 324
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->pendingCacheEntries:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 325
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 326
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->done:Z

    if-nez v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->persistThread:Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

    monitor-enter v0

    .line 329
    :try_start_1
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->persistThread:Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 331
    :try_start_2
    const-class v2, Lcom/shopkick/app/fetchers/DiskCache;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_0
    :goto_2
    return-void

    :catchall_1
    move-exception v1

    .line 325
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public maxSize()I
    .locals 1

    .line 213
    iget v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mMaxSizeOnDisk:I

    return v0
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "ClientFlagsUpdated"

    if-ne p1, p2, :cond_0

    .line 579
    iget-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_0

    .line 580
    iget-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheSize:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mMaxSizeOnDisk:I

    .line 581
    iget-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    :cond_0
    return-void
.end method

.method public open()Lcom/shopkick/app/fetchers/DiskCache;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .line 128
    new-instance v0, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabaseHelper:Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabaseHelper:Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/DiskCache$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->persistThread:Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

    invoke-direct {v0, p0}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;-><init>(Lcom/shopkick/app/fetchers/DiskCache;)V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->persistThread:Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache;->persistThread:Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->start()V

    :cond_0
    return-object p0
.end method

.method public pinnedSize()I
    .locals 3

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT SUM(size) FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " WHERE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "pinned"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 235
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 236
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    .line 237
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 238
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    :cond_0
    if-eqz v0, :cond_1

    .line 241
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    return v1
.end method

.method public removeExpiredItems()V
    .locals 14

    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 190
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v4, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    const-string v3, "id"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "expiration_time < ? AND expiration_time > 0"

    const/4 v12, 0x1

    new-array v7, v12, [Ljava/lang/String;

    .line 194
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    aput-object v3, v7, v13

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 190
    invoke-virtual/range {v2 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 199
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v3

    if-lez v3, :cond_1

    .line 200
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 202
    :cond_0
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 203
    invoke-direct {p0, v3, v4}, Lcom/shopkick/app/fetchers/DiskCache;->deleteFile(J)V

    .line 204
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_0

    :cond_1
    if-eqz v2, :cond_2

    .line 207
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 209
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    const-string v4, "expiration_time < ? AND expiration_time > 0"

    new-array v5, v12, [Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v13

    invoke-virtual {v2, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public removeItemForKey(Ljava/lang/String;)V
    .locals 12

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 154
    new-array v0, v0, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object p1, v0, v11

    .line 155
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    const-string p1, "id"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "key = ?"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v0

    invoke-virtual/range {v1 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 164
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_1

    .line 165
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 166
    invoke-interface {p1, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    .line 167
    invoke-direct {p0, v1, v2}, Lcom/shopkick/app/fetchers/DiskCache;->deleteFile(J)V

    :cond_1
    if-eqz p1, :cond_2

    .line 170
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 173
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    const-string v2, "key = ?"

    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public size()I
    .locals 3

    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT SUM(size) FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mTableName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 220
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 221
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    .line 222
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 223
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    :cond_0
    if-eqz v0, :cond_1

    .line 226
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    return v1
.end method
