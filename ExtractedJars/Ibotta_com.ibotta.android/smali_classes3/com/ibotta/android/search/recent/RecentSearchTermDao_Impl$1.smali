.class Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$1;
.super Landroid/arch/persistence/room/EntityInsertionAdapter;
.source "RecentSearchTermDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/arch/persistence/room/EntityInsertionAdapter<",
        "Lcom/ibotta/android/search/recent/RecentSearchTerm;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$1;->this$0:Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;

    invoke-direct {p0, p2}, Landroid/arch/persistence/room/EntityInsertionAdapter;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public bind(Landroid/arch/persistence/db/SupportSQLiteStatement;Lcom/ibotta/android/search/recent/RecentSearchTerm;)V
    .locals 3

    .line 39
    invoke-virtual {p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->getSearchText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 40
    invoke-interface {p1, v1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->getSearchText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 44
    :goto_0
    invoke-virtual {p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->getSearchTextKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    .line 45
    invoke-interface {p1, v1}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->getSearchTextKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x3

    .line 49
    invoke-virtual {p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->getLastSearched()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 51
    invoke-virtual {p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->getCategory()Lcom/ibotta/android/search/recent/Category;

    move-result-object p2

    invoke-static {p2}, Lcom/ibotta/android/search/recent/Category;->toTypeCode(Lcom/ibotta/android/search/recent/Category;)I

    move-result p2

    const/4 v0, 0x4

    int-to-long v1, p2

    .line 52
    invoke-interface {p1, v0, v1, v2}, Landroid/arch/persistence/db/SupportSQLiteStatement;->bindLong(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Landroid/arch/persistence/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p2, Lcom/ibotta/android/search/recent/RecentSearchTerm;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$1;->bind(Landroid/arch/persistence/db/SupportSQLiteStatement;Lcom/ibotta/android/search/recent/RecentSearchTerm;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `search_terms`(`search_text`,`search_term_key`,`last_searched`,`category`) VALUES (?,?,?,?)"

    return-object v0
.end method
