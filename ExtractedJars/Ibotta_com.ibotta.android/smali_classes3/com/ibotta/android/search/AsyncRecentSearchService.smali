.class public interface abstract Lcom/ibotta/android/search/AsyncRecentSearchService;
.super Ljava/lang/Object;
.source "AsyncRecentSearchService.java"

# interfaces
.implements Lcom/ibotta/android/search/AsyncSuggestedSearchService;


# virtual methods
.method public abstract clearAllSuggestedTerms(Lcom/ibotta/android/search/recent/Category;)V
.end method

.method public abstract clearSuggestedTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
.end method

.method public abstract onTermSearched(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
.end method
