.class Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;
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
    name = "GetSuggestedTermsTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/ibotta/api/model/search/SuggestedSearches;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private final consumer:Ljava9/util/function/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;"
        }
    .end annotation
.end field

.field private final recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

.field private final retailerId:Ljava9/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/search/RecentSearchService;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/search/RecentSearchService;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 109
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    .line 111
    iput-object p3, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->retailerId:Ljava9/util/Optional;

    .line 112
    iput-object p2, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->consumer:Ljava9/util/function/Consumer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/search/RecentSearchService;Ljava9/util/function/Consumer;Ljava9/util/Optional;Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$1;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;-><init>(Lcom/ibotta/android/search/RecentSearchService;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearches;
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->recentSearchService:Lcom/ibotta/android/search/RecentSearchService;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->retailerId:Ljava9/util/Optional;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/search/RecentSearchService;->getSuggestedTerms(Ljava/lang/String;Ljava9/util/Optional;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "AsyncRecentSearchServiceImpl$GetSuggestedTermsTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "AsyncRecentSearchServiceImpl$GetSuggestedTermsTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_0
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->doInBackground([Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected onPostExecute(Lcom/ibotta/api/model/search/SuggestedSearches;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->consumer:Ljava9/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "AsyncRecentSearchServiceImpl$GetSuggestedTermsTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "AsyncRecentSearchServiceImpl$GetSuggestedTermsTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_0
    check-cast p1, Lcom/ibotta/api/model/search/SuggestedSearches;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl$GetSuggestedTermsTask;->onPostExecute(Lcom/ibotta/api/model/search/SuggestedSearches;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method
