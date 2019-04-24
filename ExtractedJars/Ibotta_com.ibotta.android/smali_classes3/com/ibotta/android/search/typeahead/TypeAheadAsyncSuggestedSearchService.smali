.class public Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;
.super Ljava/lang/Object;
.source "TypeAheadAsyncSuggestedSearchService.java"

# interfaces
.implements Lcom/ibotta/android/search/AsyncSuggestedSearchService;


# static fields
.field private static final TIMEOUT_SECONDS:I = 0x2


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final asyncHandler:Landroid/os/Handler;

.field private cancelRunnable:Ljava/lang/Runnable;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private job:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private final mainHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 61
    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 62
    iput-object p3, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->mainHandler:Landroid/os/Handler;

    .line 63
    iput-object p4, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 64
    iput-object p5, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->asyncHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->cancel()V

    return-void
.end method

.method private cancel()V
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$AanqWRGdM6GPMRjMx95Qog4pDWA;

    invoke-direct {v1, p0}, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$AanqWRGdM6GPMRjMx95Qog4pDWA;-><init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;)V

    iget-object v2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method

.method public static synthetic lambda$cancel$4(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;)V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_0

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/ApiCall;->cancel()V

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->asyncHandler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->cancelRunnable:Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    .line 131
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method static synthetic lambda$getSuggestedTerms$0(Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 1

    .line 111
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p1

    .line 110
    invoke-interface {p0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$getSuggestedTerms$1(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 2

    .line 108
    invoke-direct {p0}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->cancel()V

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_0

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;

    invoke-direct {v1, p1, p2}, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;-><init>(Ljava9/util/function/Consumer;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public static synthetic lambda$getSuggestedTerms$2(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 2

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;

    invoke-direct {v1, p0, p1, p2}, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;-><init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method

.method public static synthetic lambda$getSuggestedTerms$3(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/Optional;Ljava9/util/function/Consumer;)V
    .locals 2

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->cancel()V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 76
    invoke-static {p2}, Ljava9/util/Lists;->of(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createTypeAheadSuggestionGraphQLCall(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;

    move-result-object p2

    .line 78
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 80
    new-instance p2, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;

    invoke-direct {p2, p0, p3, p1}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;-><init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    .line 107
    new-instance p2, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$nV11hoxsuCq6_KMq3cOxAhVa6Gs;

    invoke-direct {p2, p0, p3, p1}, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$nV11hoxsuCq6_KMq3cOxAhVa6Gs;-><init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->cancelRunnable:Ljava/lang/Runnable;

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {p1, p2}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 120
    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->asyncHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->cancelRunnable:Ljava/lang/Runnable;

    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x2

    invoke-virtual {p3, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public getSuggestedTerms(Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V
    .locals 2
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

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;-><init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/Optional;Ljava9/util/function/Consumer;)V

    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method
