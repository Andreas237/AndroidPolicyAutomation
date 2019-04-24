.class public interface abstract Lcom/ibotta/android/search/RecentSearchService;
.super Ljava/lang/Object;
.source "RecentSearchService.java"

# interfaces
.implements Lcom/ibotta/android/search/SuggestedSearchService;


# virtual methods
.method public abstract clearAllSuggestedTerms(Lcom/ibotta/android/search/recent/Category;)V
.end method

.method public abstract clearSuggestedTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
.end method

.method public abstract onSearchTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
.end method
