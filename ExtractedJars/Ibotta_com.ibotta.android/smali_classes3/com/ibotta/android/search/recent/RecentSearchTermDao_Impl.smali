.class public Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;
.super Ljava/lang/Object;
.source "RecentSearchTermDao_Impl.java"

# interfaces
.implements Lcom/ibotta/android/search/recent/RecentSearchTermDao;


# instance fields
.field private final __db:Landroid/arch/persistence/room/RoomDatabase;

.field private final __insertionAdapterOfRecentSearchTerm:Landroid/arch/persistence/room/EntityInsertionAdapter;

.field private final __preparedStmtOfClearStaleTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteAllSearchTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteSearchTerm:Landroid/arch/persistence/room/SharedSQLiteStatement;


# direct methods
.method public constructor <init>(Landroid/arch/persistence/room/RoomDatabase;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    .line 31
    new-instance v0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$1;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__insertionAdapterOfRecentSearchTerm:Landroid/arch/persistence/room/EntityInsertionAdapter;

    .line 55
    new-instance v0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$2;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteAllSearchTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    .line 62
    new-instance v0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$3;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteSearchTerm:Landroid/arch/persistence/room/SharedSQLiteStatement;

    .line 69
    new-instance v0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$4;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfClearStaleTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    return-void
.end method


# virtual methods
.method public addSearchTerm(Lcom/ibotta/android/search/recent/RecentSearchTerm;)V
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    .line 82
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__insertionAdapterOfRecentSearchTerm:Landroid/arch/persistence/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroid/arch/persistence/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    throw p1
.end method

.method public clearStaleTerms(Lcom/ibotta/android/search/recent/Category;)V
    .locals 4

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfClearStaleTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->acquire()Landroid/arch/persistence/db/SupportSQLiteStatement;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    const/4 v1, 0x1

    .line 136
    :try_start_0
    invoke-static {p1}, Lcom/ibotta/android/search/recent/Category;->toTypeCode(Lcom/ibotta/android/search/recent/Category;)I

    move-result v2

    int-to-long v2, v2

    .line 137
    invoke-interface {v0, v1, v2, v3}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindLong(IJ)V

    const/4 v1, 0x2

    .line 140
    invoke-static {p1}, Lcom/ibotta/android/search/recent/Category;->toTypeCode(Lcom/ibotta/android/search/recent/Category;)I

    move-result p1

    int-to-long v2, p1

    .line 141
    invoke-interface {v0, v1, v2, v3}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 142
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 143
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 146
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfClearStaleTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 145
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 146
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfClearStaleTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public deleteAllSearchTerms(Lcom/ibotta/android/search/recent/Category;)V
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteAllSearchTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->acquire()Landroid/arch/persistence/db/SupportSQLiteStatement;

    move-result-object v0

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    const/4 v1, 0x1

    .line 96
    :try_start_0
    invoke-static {p1}, Lcom/ibotta/android/search/recent/Category;->toTypeCode(Lcom/ibotta/android/search/recent/Category;)I

    move-result p1

    int-to-long v2, p1

    .line 97
    invoke-interface {v0, v1, v2, v3}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 98
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 99
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 102
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteAllSearchTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteAllSearchTerms:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public deleteSearchTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteSearchTerm:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->acquire()Landroid/arch/persistence/db/SupportSQLiteStatement;

    move-result-object v0

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {v1}, Landroid/arch/persistence/room/RoomDatabase;->beginTransaction()V

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 113
    :try_start_0
    invoke-interface {v0, v1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 115
    :cond_0
    invoke-interface {v0, v1, p1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x2

    .line 119
    invoke-static {p2}, Lcom/ibotta/android/search/recent/Category;->toTypeCode(Lcom/ibotta/android/search/recent/Category;)I

    move-result p2

    int-to-long v1, p2

    .line 120
    invoke-interface {v0, p1, v1, v2}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 121
    invoke-interface {v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 122
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteSearchTerm:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 124
    iget-object p2, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p2}, Landroid/arch/persistence/room/RoomDatabase;->endTransaction()V

    .line 125
    iget-object p2, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__preparedStmtOfDeleteSearchTerm:Landroid/arch/persistence/room/SharedSQLiteStatement;

    invoke-virtual {p2, v0}, Landroid/arch/persistence/room/SharedSQLiteStatement;->release(Landroid/arch/persistence/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public getSearchTerms(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/search/recent/Category;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/search/recent/RecentSearchTerm;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM search_terms WHERE search_term_key LIKE ? AND category = ? ORDER BY last_searched DESC LIMIT 5"

    const/4 v1, 0x2

    .line 153
    invoke-static {v0, v1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroid/arch/persistence/room/RoomSQLiteQuery;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    .line 156
    invoke-virtual {v0, v2}, Landroid/arch/persistence/room/RoomSQLiteQuery;->bindNull(I)V

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v0, v2, p1}, Landroid/arch/persistence/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 162
    :goto_0
    invoke-static {p2}, Lcom/ibotta/android/search/recent/Category;->toTypeCode(Lcom/ibotta/android/search/recent/Category;)I

    move-result p1

    int-to-long p1, p1

    .line 163
    invoke-virtual {v0, v1, p1, p2}, Landroid/arch/persistence/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 164
    iget-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;->__db:Landroid/arch/persistence/room/RoomDatabase;

    invoke-virtual {p1, v0}, Landroid/arch/persistence/room/RoomDatabase;->query(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string p2, "search_text"

    .line 166
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p2

    const-string v1, "search_term_key"

    .line 167
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    const-string v2, "last_searched"

    .line 168
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    const-string v3, "category"

    .line 169
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    .line 170
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 173
    new-instance v5, Lcom/ibotta/android/search/recent/RecentSearchTerm;

    invoke-direct {v5}, Lcom/ibotta/android/search/recent/RecentSearchTerm;-><init>()V

    .line 175
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 176
    invoke-virtual {v5, v6}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setSearchText(Ljava/lang/String;)V

    .line 178
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 179
    invoke-virtual {v5, v6}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setSearchTextKey(Ljava/lang/String;)V

    .line 181
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 182
    invoke-virtual {v5, v6, v7}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setLastSearched(J)V

    .line 185
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 186
    invoke-static {v6}, Lcom/ibotta/android/search/recent/Category;->toCategory(I)Lcom/ibotta/android/search/recent/Category;

    move-result-object v6

    .line 187
    invoke-virtual {v5, v6}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setCategory(Lcom/ibotta/android/search/recent/Category;)V

    .line 188
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 192
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 193
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    return-object v4

    :catchall_0
    move-exception p2

    .line 192
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 193
    invoke-virtual {v0}, Landroid/arch/persistence/room/RoomSQLiteQuery;->release()V

    throw p2
.end method
