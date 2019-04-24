.class public Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;
.super Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
.source "SQLiteFavoriteRetailerSettingsDatabase.java"

# interfaces
.implements Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "favorite_retailer_settings.db"

.field private static final DATABASE_VERSION:I = 0x3

.field private static final counter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static database:Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

.field private static final lock:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field private favoriteRetailerSettingsDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 41
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 43
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    const-string v2, "favorite_retailer_settings.db"

    const/4 v3, 0x0

    const/4 v4, 0x3

    const v5, 0x7f10000f

    move-object v0, p0

    move-object v1, p1

    .line 99
    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p0

    return-object p0
.end method

.method private cleanUp(Lcom/j256/ormlite/dao/RuntimeExceptionDao;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 249
    invoke-virtual {p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object p1

    .line 252
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v0

    const-string v1, "attempts"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lcom/j256/ormlite/stmt/Where;->ge(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 253
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result p1

    const-string p2, "Deleted %1$d from favorite retailer settings due to too many attempts."

    const/4 v0, 0x1

    .line 255
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private cleanUpFlushedSettings(Lcom/j256/ormlite/dao/RuntimeExceptionDao;Ljava/util/List;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;J)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    if-eqz p2, :cond_2

    .line 272
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 276
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 277
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 278
    invoke-virtual {v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 282
    :cond_1
    invoke-virtual {p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object p2

    .line 283
    invoke-virtual {p2}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v1, v2, v0}, Lcom/j256/ormlite/stmt/Where;->in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "favorited"

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "updatedAt"

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, p3, p4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2, v4}, Lcom/j256/ormlite/stmt/Where;->le(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 284
    invoke-virtual {p2}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result p2

    const-string v1, "Successfully deleted flushed favorite retailer settings: count=%1$d"

    const/4 v2, 0x1

    .line 286
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, v3

    invoke-static {v1, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-virtual {p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->updateBuilder()Lcom/j256/ormlite/stmt/UpdateBuilder;

    move-result-object p1

    .line 290
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    const-string v1, "id"

    invoke-virtual {p2, v1, v0}, Lcom/j256/ormlite/stmt/Where;->in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    invoke-virtual {p2}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    const-string v0, "favorited"

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    invoke-virtual {p2}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    const-string v0, "updatedAt"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p3, p4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p2, v0, v1}, Lcom/j256/ormlite/stmt/Where;->le(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    const-string p2, "updatedAt"

    .line 291
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p3, p4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p1, p2, v0}, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateColumnValue(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/StatementBuilder;

    const-string p2, "attempts"

    .line 292
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateColumnValue(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/StatementBuilder;

    .line 294
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->update()I

    move-result p1

    const-string p2, "Successfully updated flushed favorite retailer settings: count=%1$d"

    .line 296
    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p3, v3

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public static clearAll(Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 84
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->open(Landroid/content/Context;)Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 85
    :try_start_1
    invoke-interface {p0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->deleteEverything()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_0

    .line 88
    invoke-interface {p0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->release()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->release()V

    :cond_1
    throw v0
.end method

.method private end(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 401
    :try_start_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to end database transaction."

    const/4 v1, 0x0

    .line 405
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 417
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->favoriteRetailerSettingsDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    if-nez v0, :cond_0

    .line 418
    const-class v0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->favoriteRetailerSettingsDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->favoriteRetailerSettingsDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    return-object v0
.end method

.method public static open(Landroid/content/Context;)Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 59
    sget-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 61
    :try_start_0
    sget-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->database:Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;

    invoke-direct {v0, p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->database:Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    .line 65
    :cond_0
    sget-object p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    sget-object p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 73
    sget-object p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->database:Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_1
    const-string v0, "Failed to open database."

    const/4 v1, 0x0

    .line 67
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    new-instance v0, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;

    const-string v1, "Failed to open database."

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :goto_0
    sget-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p0
.end method

.method private updateFlushErroredSettings(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 310
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 311
    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->addAttempts(I)V

    .line 312
    invoke-virtual {p0, v1}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    goto :goto_0

    .line 315
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v0, "Successfully updated errored favorite retailer settings: count=%1$d"

    .line 316
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 389
    iput-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->favoriteRetailerSettingsDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 390
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    return-void
.end method

.method public deleteEverything()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 167
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

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

    .line 171
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to delete all favorite retailer settings."

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    new-instance v1, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;

    const-string v2, "Failed to delete all favorite retailer settings."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public findFavoriteRetailerSettings()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 108
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    const-string v1, "favoritedDate"

    const/4 v2, 0x1

    .line 109
    invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->orderBy(Ljava/lang/String;Z)Lcom/j256/ormlite/stmt/QueryBuilder;

    .line 111
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 113
    new-instance v1, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;

    const-string v2, "Failed to retrieve favorite retailer settings."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
    .locals 2

    const-string p1, "onCreate"

    const/4 v0, 0x0

    .line 327
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :try_start_0
    const-class p1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-static {p2, p1}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Can\'t create database"

    .line 331
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
    .locals 4

    const-string p1, "onUpgrade"

    const/4 p2, 0x0

    .line 346
    new-array v0, p2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string p1, "Starting favorite_retailer_settings database upgrade: oldVersion=%1$d, newVersion=%2$d"

    const/4 v0, 0x2

    .line 348
    new-array v1, v0, [Ljava/lang/Object;

    .line 350
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, p2

    .line 351
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 348
    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-ne p3, v3, :cond_0

    const-string p1, "Upgrading favorite_retailer_settings database: oldVersion=%1$d"

    .line 355
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v1, p2

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p1

    const-string p3, "ALTER TABLE favorite_retailer_settings ADD COLUMN favoritedDate VARCHAR"

    new-array v1, p2, [Ljava/lang/String;

    invoke-virtual {p1, p3, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->executeRaw(Ljava/lang/String;[Ljava/lang/String;)I

    const/4 p3, 0x2

    :cond_0
    if-ne p3, v0, :cond_1

    const-string p1, "Upgrading favorite_retailer_settings database: oldVersion=%1$d"

    .line 367
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v0, p2

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p1

    invoke-virtual {p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->updateBuilder()Lcom/j256/ormlite/stmt/UpdateBuilder;

    move-result-object p1

    const-string p3, "favoritedDate"

    .line 370
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, p3, v0}, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateColumnValue(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/StatementBuilder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/j256/ormlite/stmt/StatementBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object p3

    const-string v0, "favoritedDate"

    invoke-virtual {p3, v0}, Lcom/j256/ormlite/stmt/Where;->isNull(Ljava/lang/String;)Lcom/j256/ormlite/stmt/Where;

    .line 371
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->update()I

    :cond_1
    const-string p1, "Finished favorite_retailer_settings database upgrade: newVersion=%1$d"

    .line 377
    new-array p3, v3, [Ljava/lang/Object;

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

    .line 379
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p3, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public release()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 185
    sget-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 187
    :try_start_0
    sget-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 188
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    const/4 v0, 0x0

    .line 189
    iput-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->favoriteRetailerSettingsDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 190
    sput-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->database:Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    :cond_0
    sget-object v0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

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

    .line 195
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    new-instance v1, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;

    const-string v2, "Failed to release database."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    :goto_0
    sget-object v1, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    .line 126
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

    new-instance v1, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;-><init>(Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)V

    invoke-static {v0, v1}, Lcom/j256/ormlite/misc/TransactionManager;->callInTransaction(Lcom/j256/ormlite/support/ConnectionSource;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 153
    new-instance v0, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;

    const-string v1, "Failed to save favorite retailer setting."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public updateAfterFlush(Ljava/util/List;JZI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;JZI)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 216
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 222
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 223
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    if-eqz p4, :cond_1

    .line 226
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p4

    invoke-direct {p0, p4, p1, p2, p3}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->cleanUpFlushedSettings(Lcom/j256/ormlite/dao/RuntimeExceptionDao;Ljava/util/List;J)V

    goto :goto_0

    .line 228
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->updateFlushErroredSettings(Ljava/util/List;)V

    .line 231
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->getFavoriteRetailerSettingsDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p1

    invoke-direct {p0, p1, p5}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->cleanUp(Lcom/j256/ormlite/dao/RuntimeExceptionDao;I)V

    .line 232
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Failed to update favorite retailer settings after flush."

    const/4 p3, 0x0

    .line 234
    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    :goto_1
    invoke-direct {p0, v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :goto_2
    invoke-direct {p0, v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    throw p1

    :cond_2
    :goto_3
    return-void
.end method
