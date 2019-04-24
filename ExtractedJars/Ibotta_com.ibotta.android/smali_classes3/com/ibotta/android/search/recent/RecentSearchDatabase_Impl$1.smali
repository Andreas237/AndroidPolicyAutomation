.class Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;
.super Landroid/arch/persistence/room/RoomOpenHelper$Delegate;
.source "RecentSearchDatabase_Impl.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->createOpenHelper(Landroid/arch/persistence/room/DatabaseConfiguration;)Landroid/arch/persistence/db/SupportSQLiteOpenHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;I)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-direct {p0, p2}, Landroid/arch/persistence/room/RoomOpenHelper$Delegate;-><init>(I)V

    return-void
.end method


# virtual methods
.method public createAllTables(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    .locals 3

    const-string v0, "CREATE TABLE IF NOT EXISTS `search_terms` (`search_text` TEXT NOT NULL, `search_term_key` TEXT NOT NULL, `last_searched` INTEGER NOT NULL, `category` INTEGER NOT NULL, PRIMARY KEY(`search_term_key`, `category`))"

    .line 33
    instance-of v1, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v2, v0}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_0
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    if-nez v1, :cond_1

    .line 34
    invoke-interface {p1, v0}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v2, p1

    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v2, v0}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_1
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"808509ffb4c5b7da78e4c3143ce64ef8\")"

    if-nez v1, :cond_2

    .line 35
    invoke-interface {p1, v0}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public dropAllTables(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    .locals 2

    const-string v0, "DROP TABLE IF EXISTS `search_terms`"

    .line 40
    instance-of v1, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Landroid/arch/persistence/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$000(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v1}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$100(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 47
    iget-object v2, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v2}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$200(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/arch/persistence/room/RoomDatabase$Callback;

    invoke-virtual {v2, p1}, Landroid/arch/persistence/room/RoomDatabase$Callback;->onCreate(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onOpen(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v0, p1}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$302(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;Landroid/arch/persistence/db/SupportSQLiteDatabase;)Landroid/arch/persistence/db/SupportSQLiteDatabase;

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v0, p1}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$400(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;Landroid/arch/persistence/db/SupportSQLiteDatabase;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$500(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v1}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$600(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 58
    iget-object v2, p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;

    invoke-static {v2}, Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;->access$700(Lcom/ibotta/android/search/recent/RecentSearchDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/arch/persistence/room/RoomDatabase$Callback;

    invoke-virtual {v2, p1}, Landroid/arch/persistence/room/RoomDatabase$Callback;->onOpen(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected validateMigration(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    .locals 8

    .line 65
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "search_text"

    .line 66
    new-instance v2, Landroid/arch/persistence/room/util/TableInfo$Column;

    const-string v3, "search_text"

    const-string v4, "TEXT"

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v2, v3, v4, v6, v5}, Landroid/arch/persistence/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "search_term_key"

    .line 67
    new-instance v2, Landroid/arch/persistence/room/util/TableInfo$Column;

    const-string v3, "search_term_key"

    const-string v4, "TEXT"

    invoke-direct {v2, v3, v4, v6, v6}, Landroid/arch/persistence/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_searched"

    .line 68
    new-instance v2, Landroid/arch/persistence/room/util/TableInfo$Column;

    const-string v3, "last_searched"

    const-string v4, "INTEGER"

    invoke-direct {v2, v3, v4, v6, v5}, Landroid/arch/persistence/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "category"

    .line 69
    new-instance v2, Landroid/arch/persistence/room/util/TableInfo$Column;

    const-string v3, "category"

    const-string v4, "INTEGER"

    const/4 v7, 0x2

    invoke-direct {v2, v3, v4, v6, v7}, Landroid/arch/persistence/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 71
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 72
    new-instance v3, Landroid/arch/persistence/room/util/TableInfo;

    const-string v4, "search_terms"

    invoke-direct {v3, v4, v0, v1, v2}, Landroid/arch/persistence/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    const-string v0, "search_terms"

    .line 73
    invoke-static {p1, v0}, Landroid/arch/persistence/room/util/TableInfo;->read(Landroid/arch/persistence/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroid/arch/persistence/room/util/TableInfo;

    move-result-object p1

    .line 74
    invoke-virtual {v3, p1}, Landroid/arch/persistence/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Migration didn\'t properly handle search_terms(com.ibotta.android.search.recent.RecentSearchTerm).\n Expected:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n Found:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
