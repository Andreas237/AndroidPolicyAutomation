.class public final Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;
.super Ljava/lang/Object;
.source "SearchModule_ProvideRecentSearchServiceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/RecentSearchService;",
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

.field private final recentSearchTermDaoProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchTermDao;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchTermDao;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->recentSearchTermDaoProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchTermDao;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/RecentSearchService;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchTermDao;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/search/RecentSearchService;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->proxyProvideRecentSearchService(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/RecentSearchService;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRecentSearchService(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/RecentSearchService;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/ibotta/android/di/SearchModule;->provideRecentSearchService(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/RecentSearchService;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 49
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/RecentSearchService;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/RecentSearchService;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->recentSearchTermDaoProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/RecentSearchService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->get()Lcom/ibotta/android/search/RecentSearchService;

    move-result-object v0

    return-object v0
.end method
