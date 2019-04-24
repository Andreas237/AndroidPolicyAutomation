.class public Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;
.super Ljava/lang/Object;
.source "TrackingDao_Impl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;


# instance fields
.field private final __db:Landroid/arch/persistence/room/RoomDatabase;

.field private final __insertionAdapterOfTrackingData:Landroid/arch/persistence/room/EntityInsertionAdapter;

.field private final __preparedStmtOfDeleteAllEntries:Landroid/arch/persistence/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteEntryForKey:Landroid/arch/persistence/room/SharedSQLiteStatement;

.field private final __trackingBodyConverter:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;


# direct methods
.method public constructor <init>(Landroid/arch/persistence/room/RoomDatabase;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__trackingBodyConverter:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    .line 37
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$1;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__insertionAdapterOfTrackingData:Landroid/arch/persistence/room/EntityInsertionAdapter;

    .line 59
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$2;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteEntryForKey:Landroid/arch/persistence/room/SharedSQLiteStatement;

    .line 66
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$3;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteAllEntries:Landroid/arch/persistence/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;)Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__trackingBodyConverter:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;)Landroid/arch/persistence/room/RoomDatabase;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    return-object p0
.end method


# virtual methods
.method public addEntry(Lcom/ibotta/android/tracking/proprietary/TrackingData;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    .line 79
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__insertionAdapterOfTrackingData:Landroid/arch/persistence/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroid/arch/persistence/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 80
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    throw p1
.end method

.method public deleteAllEntries()V
    .locals 3

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteAllEntries:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->acquire()Landroid/arch/persistence/db/SupportSQLiteStatement;

    move-result-object v0

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    .line 110
    :try_start_0
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteAllEntries:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 113
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v2}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 114
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteAllEntries:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    throw v1
.end method

.method public deleteEntryForKey(Ljava/lang/String;)V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteEntryForKey:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->acquire()Landroid/arch/persistence/db/SupportSQLiteStatement;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 93
    :try_start_0
    invoke-interface {v0, v1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 95
    :cond_0
    invoke-interface {v0, v1, p1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 97
    :goto_0
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteEntryForKey:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__preparedStmtOfDeleteEntryForKey:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public getAllKeys()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT primaryKey FROM TrackingData"

    const/4 v1, 0x0

    .line 154
    invoke-static {v0, v1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroid/arch/persistence/room/RoomSQLiteQuery;

    move-result-object v0

    .line 155
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v2, v0}, Landroid/arch/persistence/room/RoomDatabase;->query(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object v2

    .line 157
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 160
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 161
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 165
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 166
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    return-object v3

    :catchall_0
    move-exception v1

    .line 165
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 166
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    throw v1
.end method

.method public getEntryForKey(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/TrackingData;
    .locals 4

    const-string v0, "SELECT * FROM TrackingData where primaryKey LIKE ?"

    const/4 v1, 0x1

    .line 121
    invoke-static {v0, v1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroid/arch/persistence/room/RoomSQLiteQuery;

    move-result-object v0

    if-nez p1, :cond_0

    .line 124
    invoke-virtual {v0, v1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->bindNull(I)V

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {v0, v1, p1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 128
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1, v0}, Landroid/arch/persistence/room/RoomDatabase;->query(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "primaryKey"

    .line 130
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    const-string v2, "data"

    .line 131
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 133
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 135
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 138
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 139
    iget-object v3, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__trackingBodyConverter:Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    invoke-virtual {v3, v2}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->fromString(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object v2

    .line 140
    new-instance v3, Lcom/ibotta/android/tracking/proprietary/TrackingData;

    invoke-direct {v3, v1, v2}, Lcom/ibotta/android/tracking/proprietary/TrackingData;-><init>(Ljava/lang/String;Lcom/ibotta/tracking/generated/model/Body;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 146
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 147
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    return-object v3

    :catchall_0
    move-exception v1

    .line 146
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 147
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    throw v1
.end method

.method public getSize()I
    .locals 4

    const-string v0, "SELECT COUNT(*) FROM TrackingData"

    const/4 v1, 0x0

    .line 173
    invoke-static {v0, v1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroid/arch/persistence/room/RoomSQLiteQuery;

    move-result-object v0

    .line 174
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v2, v0}, Landroid/arch/persistence/room/RoomDatabase;->query(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object v2

    .line 177
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 178
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 185
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    return v1

    :catchall_0
    move-exception v1

    .line 184
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 185
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    throw v1
.end method

.method public getSizeAsLiveData()Landroid/arch/lifecycle/LiveData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/arch/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT COUNT(*) FROM TrackingData"

    const/4 v1, 0x0

    .line 192
    invoke-static {v0, v1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroid/arch/persistence/room/RoomSQLiteQuery;

    move-result-object v0

    .line 193
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;

    invoke-direct {v1, p0, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl;Landroid/arch/persistence/room/RoomSQLiteQuery;)V

    .line 231
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao_Impl$4;->getLiveData()Landroid/arch/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method
