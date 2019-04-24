.class Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;
.super Landroid/os/AsyncTask;
.source "AsyncRecentSearchServiceImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ClearAllSearchTermsTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private final category:Lcom/ibotta/android/search/recent/Category;

.field private final recentSearchService:Lcom/ibotta/android/search/RecentSearchService;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/search/RecentSearchService;Lcom/ibotta/android/search/recent/Category;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    .line 71
    iput-object p2, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->category:Lcom/ibotta/android/search/recent/Category;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/search/RecentSearchService;Lcom/ibotta/android/search/recent/Category;Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$1;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;-><init>(Lcom/ibotta/android/search/RecentSearchService;Lcom/ibotta/android/search/recent/Category;)V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    .line 76
    iget-object p1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    iget-object v0, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$ClearAllSearchTermsTask;->category:Lcom/ibotta/android/search/recent/Category;

    invoke-interface {p1, v0}, Lcom/ibotta/android/search/RecentSearchService;->clearAllSuggestedTerms(Lcom/ibotta/android/search/recent/Category;)V

    const/4 p1, 0x0

    return-object p1
.end method
