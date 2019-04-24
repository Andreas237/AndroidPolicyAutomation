.class public Lcom/ibotta/android/search/recent/RecentSearchTerm;
.super Ljava/lang/Object;
.source "RecentSearchTerm.java"


# annotations
.annotation build Landroid/arch/persistence/room/Entity;
    primaryKeys = {
        "search_term_key",
        "category"
    }
    tableName = "search_terms"
.end annotation


# instance fields
.field private category:Lcom/ibotta/android/search/recent/Category;
    .annotation build Landroid/arch/persistence/room/ColumnInfo;
        name = "category"
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private lastSearched:J
    .annotation build Landroid/arch/persistence/room/ColumnInfo;
        name = "last_searched"
    .end annotation
.end field

.field private searchText:Ljava/lang/String;
    .annotation build Landroid/arch/persistence/room/ColumnInfo;
        name = "search_text"
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private searchTextKey:Ljava/lang/String;
    .annotation build Landroid/arch/persistence/room/ColumnInfo;
        name = "search_term_key"
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCategory()Lcom/ibotta/android/search/recent/Category;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->category:Lcom/ibotta/android/search/recent/Category;

    return-object v0
.end method

.method public getLastSearched()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->lastSearched:J

    return-wide v0
.end method

.method public getSearchText()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->searchText:Ljava/lang/String;

    return-object v0
.end method

.method public getSearchTextKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->searchTextKey:Ljava/lang/String;

    return-object v0
.end method

.method public setCategory(Lcom/ibotta/android/search/recent/Category;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/search/recent/Category;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->category:Lcom/ibotta/android/search/recent/Category;

    return-void
.end method

.method public setLastSearched(J)V
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->lastSearched:J

    return-void
.end method

.method public setSearchText(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->searchText:Ljava/lang/String;

    return-void
.end method

.method public setSearchTextKey(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTerm;->searchTextKey:Ljava/lang/String;

    return-void
.end method
