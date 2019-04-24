.class public Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;
.super Ljava/lang/Object;
.source "AsyncRecentSearchServiceImpl.java"

# interfaces
.implements Lcom/ibotta/android/search/AsyncRecentSearchService;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;,
        Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearSearchTermTask;,
        Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;,
        Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$AddSearchTask;
    }
.end annotation


# instance fields
.field private final recentSearchService:Lcom/ibotta/android/search/RecentSearchService;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/search/RecentSearchService;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    return-void
.end method


# virtual methods
.method public clearAllSuggestedTerms(Lcom/ibotta/android/search/recent/Category;)V
    .locals 3

    .line 28
    new-instance v0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;

    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;-><init>(Lcom/ibotta/android/search/RecentSearchService;Lcom/ibotta/android/search/recent/Category;Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$1;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    instance-of v1, v0, Landroid/os/AsyncTask;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public clearSuggestedTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
    .locals 3

    .line 33
    new-instance v0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearSearchTermTask;

    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearSearchTermTask;-><init>(Lcom/ibotta/android/search/RecentSearchService;Lcom/ibotta/android/search/recent/Category;Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$1;)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    instance-of p1, v0, Landroid/os/AsyncTask;

    if-nez p1, :cond_0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearSearchTermTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p2}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public getSuggestedTerms(Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;

    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, p3, v2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;-><init>(Lcom/ibotta/android/search/RecentSearchService;Ljava9/util/function/Consumer;Ljava9/util/Optional;Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$1;)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    instance-of p1, v0, Landroid/os/AsyncTask;

    if-nez p1, :cond_0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p2}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public onTermSearched(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
    .locals 3

    .line 23
    new-instance v0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$AddSearchTask;

    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$AddSearchTask;-><init>(Lcom/ibotta/android/search/RecentSearchService;Lcom/ibotta/android/search/recent/Category;Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$1;)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    instance-of p1, v0, Landroid/os/AsyncTask;

    if-nez p1, :cond_0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$AddSearchTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p2}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method
