.class public Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;
.super Lcom/ibotta/android/search/recent/RecentSearchDatabase;
.source "RecentSearchDatabase_Impl.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private volatile _recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$302(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;Landroid/arch/persistence/db/SupportSQLiteDatabase;)Landroid/arch/persistence/db/SupportSQLiteDatabase;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mDatabase:Landroid/arch/persistence/db/SupportSQLiteDatabase;

    return-object p1
.end method

.method static synthetic access$400(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->internalInitInvalidationTracker(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V

    return-void
.end method

.method static synthetic access$500(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$600(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$700(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public clearAllTables()V
    .locals 4

    .line 96
    invoke-super {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->assertNotMainThread()V

    .line 97
    invoke-super {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->getOpenHelper()Landroid/arch/persistence/db/SupportSQLiteOpenHelper;

    move-result-object v0

    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteOpenHelper;->getWritableDatabase()Landroid/arch/persistence/db/SupportSQLiteDatabase;

    move-result-object v0

    .line 99
    :try_start_0
    invoke-super {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->beginTransaction()V

    const-string v1, "DELETE FROM `search_terms`"

    .line 100
    instance-of v2, v0, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 101
    :goto_0
    invoke-super {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    invoke-super {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->endTransaction()V

    const-string v1, "PRAGMA wal_checkpoint(FULL)"

    .line 104
    invoke-interface {v0, v1}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 105
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->inTransaction()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "VACUUM"

    .line 106
    instance-of v2, v0, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception v1

    .line 103
    invoke-super {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->endTransaction()V

    const-string v2, "PRAGMA wal_checkpoint(FULL)"

    .line 104
    invoke-interface {v0, v2}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 105
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->inTransaction()Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "VACUUM"

    .line 106
    instance-of v3, v0, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v3, :cond_3

    invoke-interface {v0, v2}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v2}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :cond_4
    :goto_2
    throw v1
.end method

.method protected createInvalidationTracker()Landroid/arch/persistence/room/InvalidationTracker;
    .locals 2

    .line 91
    new-instance v0, Landroid/arch/persistence/room/InvalidationTracker;

    const-string v1, "search_terms"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/arch/persistence/room/InvalidationTracker;-><init>(Landroid/arch/persistence/room/RoomDatabase;[Ljava/lang/String;)V

    return-object v0
.end method

.method protected createOpenHelper(Landroid/arch/persistence/room/DatabaseConfiguration;)Landroid/arch/persistence/db/SupportSQLiteOpenHelper;
    .locals 4

    .line 30
    new-instance v0, Landroid/arch/persistence/room/RoomOpenHelper;

    new-instance v1, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;-><init>(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;I)V

    const-string v2, "808509ffb4c5b7da78e4c3143ce64ef8"

    const-string v3, "6808ba08bfaf12a5983c76e805df34b6"

    invoke-direct {v0, p1, v1, v2, v3}, Landroid/arch/persistence/room/RoomOpenHelper;-><init>(Landroid/arch/persistence/room/DatabaseConfiguration;Landroid/arch/persistence/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-object v1, p1, Landroid/arch/persistence/room/DatabaseConfiguration;->context:Landroid/content/Context;

    invoke-static {v1}, Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration;->builder(Landroid/content/Context;)Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration$Builder;

    move-result-object v1

    iget-object v2, p1, Landroid/arch/persistence/room/DatabaseConfiguration;->name:Ljava/lang/String;

    .line 82
    invoke-virtual {v1, v2}, Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration$Builder;->name(Ljava/lang/String;)Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration$Builder;

    move-result-object v1

    .line 83
    invoke-virtual {v1, v0}, Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration$Builder;->callback(Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Callback;)Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration$Builder;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration$Builder;->build()Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration;

    move-result-object v0

    .line 85
    iget-object p1, p1, Landroid/arch/persistence/room/DatabaseConfiguration;->sqliteOpenHelperFactory:Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Factory;

    invoke-interface {p1, v0}, Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Factory;->create(Landroid/arch/persistence/db/SupportSQLiteOpenHelper$Configuration;)Landroid/arch/persistence/db/SupportSQLiteOpenHelper;

    move-result-object p1

    return-object p1
.end method

.method public getRecentSearchTermDao()Lcom/ibotta/android/search/recent/RecentSearchTermDao;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->_recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->_recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    return-object v0

    .line 116
    :cond_0
    monitor-enter p0

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->_recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    if-nez v0, :cond_1

    .line 118
    new-instance v0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->_recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->_recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 121
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
