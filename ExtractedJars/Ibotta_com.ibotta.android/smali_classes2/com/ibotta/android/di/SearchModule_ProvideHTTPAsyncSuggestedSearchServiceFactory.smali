.class public final Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;
.super Ljava/lang/Object;
.source "SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private final mainHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->mainHandlerProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->handlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;"
        }
    .end annotation

    .line 72
    new-instance v6, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;"
        }
    .end annotation

    .line 59
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 60
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 61
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    .line 62
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/util/AppHelper;

    .line 63
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/os/Handler;

    .line 58
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->proxyProvideHTTPAsyncSuggestedSearchService(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideHTTPAsyncSuggestedSearchService(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 0

    .line 87
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/SearchModule;->provideHTTPAsyncSuggestedSearchService(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 86
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 5

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->mainHandlerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->handlerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->get()Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method
