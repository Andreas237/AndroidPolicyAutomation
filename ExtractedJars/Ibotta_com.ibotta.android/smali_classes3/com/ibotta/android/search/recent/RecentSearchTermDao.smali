.class public interface abstract Lcom/ibotta/android/search/recent/RecentSearchTermDao;
.super Ljava/lang/Object;
.source "RecentSearchTermDao.java"


# annotations
.annotation build Landroid/arch/persistence/room/Dao;
.end annotation


# virtual methods
.method public abstract addSearchTerm(Lcom/ibotta/android/search/recent/RecentSearchTerm;)V
    .annotation build Landroid/arch/persistence/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract clearStaleTerms(Lcom/ibotta/android/search/recent/Category;)V
    .annotation build Landroid/arch/persistence/room/Query;
        value = "DELETE FROM search_terms WHERE category = :category AND search_term_key NOT IN(SELECT search_term_key FROM search_terms WHERE category = :category ORDER BY last_searched DESC LIMIT 100)"
    .end annotation
.end method

.method public abstract deleteAllSearchTerms(Lcom/ibotta/android/search/recent/Category;)V
    .annotation build Landroid/arch/persistence/room/Query;
        value = "DELETE FROM search_terms WHERE category = :category"
    .end annotation
.end method

.method public abstract deleteSearchTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
    .annotation build Landroid/arch/persistence/room/Query;
        value = "DELETE FROM search_terms WHERE search_term_key = :searchTerm AND category = :category"
    .end annotation
.end method

.method public abstract getSearchTerms(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)Ljava/util/List;
    .annotation build Landroid/arch/persistence/room/Query;
        value = "SELECT * FROM search_terms WHERE search_term_key LIKE :searchTerm AND category = :category ORDER BY last_searched DESC LIMIT 5"
    .end annotation

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
.end method
