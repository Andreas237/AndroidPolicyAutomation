.class public final Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;
.super Ljava/lang/Object;
.source "SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory.java"

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
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncDBSuggestedSearchServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncHTTPSuggestedSearchServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->asyncDBSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->asyncHTTPSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;"
        }
    .end annotation

    .line 44
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    .line 45
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    .line 46
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/util/AppHelper;

    .line 43
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->proxyProvideUnifiedAsyncSuggestedSearchService(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideUnifiedAsyncSuggestedSearchService(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 0

    .line 64
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/SearchModule;->provideUnifiedAsyncSuggestedSearchService(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 63
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->asyncDBSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->asyncHTTPSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->get()Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method
