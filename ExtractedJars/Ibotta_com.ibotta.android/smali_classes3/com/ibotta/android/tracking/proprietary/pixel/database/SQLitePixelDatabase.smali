.class public Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;
.super Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
.source "SQLitePixelDatabase.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "pixel.db"

.field private static final DATABASE_VERSION:I = 0x1

.field private static final counter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static database:Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

.field private static final lock:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field private pixelDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const-string v2, "pixel.db"

    .line 63
    sget v5, Lcom/ibotta/android/tracking/R$raw;->ormlite_config_pixel:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V

    return-void
.end method

.method private getPixelDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->pixelDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    if-nez v0, :cond_0

    .line 250
    const-class v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->pixelDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->pixelDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    return-object v0
.end method

.method public static open(Landroid/content/Context;)Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 45
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 47
    :try_start_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->database:Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->database:Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    .line 51
    :cond_0
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 59
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->database:Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_1
    const-string v0, "Failed to open database."

    const/4 v1, 0x0

    .line 53
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v1, "Failed to open database."

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    :goto_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p0
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 239
    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->pixelDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 240
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    return-void
.end method

.method public deleteEverything()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 148
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->getPixelDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 152
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to delete all pixels."

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v2, "Failed to delete all pixels."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public deletePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 93
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->getPixelDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->delete(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 97
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to delete pixel."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v1, "Failed to delete pixel."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public findPixelsToTrack()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 129
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->getPixelDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 133
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to query for pixels."

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v2, "Failed to query for pixels."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getPixelRowCount()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 107
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->getPixelDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->countOf()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 111
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to get pixel row count."

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v2, "Failed to get pixel row count."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
    .locals 2

    const-string p1, "onCreate"

    const/4 v0, 0x0

    .line 190
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :try_start_0
    const-class p1, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;

    invoke-static {p2, p1}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Can\'t create database"

    .line 194
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
    .locals 2

    const-string p1, "onUpgrade"

    const/4 p2, 0x0

    .line 209
    new-array v0, p2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string p1, "Starting pixel database upgrade: oldVersion=%1$d, newVersion=%2$d"

    const/4 v0, 0x2

    .line 211
    new-array v0, v0, [Ljava/lang/Object;

    .line 213
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v0, p2

    .line 214
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x1

    aput-object p3, v0, v1

    .line 211
    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Finished pixel database upgrade: newVersion=%1$d"

    .line 227
    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, p2

    invoke-static {p1, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p3, "Can\'t drop databases"

    .line 229
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p3, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public release()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 165
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 167
    :try_start_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 168
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    const/4 v0, 0x0

    .line 169
    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->pixelDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 170
    sput-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->database:Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    :cond_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Failed to release database."

    const/4 v2, 0x0

    .line 175
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v2, "Failed to release database."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    :goto_0
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public savePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation

    .line 75
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->getPixelDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 79
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to save pixel."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;

    const-string v1, "Failed to save pixel."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
