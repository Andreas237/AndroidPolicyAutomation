.class public final Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;
.super Ljava/lang/Object;
.source "SearchModule_ProvideRecentSearchDaoFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/recent/RecentSearchTermDao;",
        ">;"
    }
.end annotation


# instance fields
.field private final recentSearchDatabaseProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchDatabase;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;->recentSearchDatabaseProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchDatabase;",
            ">;)",
            "Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchDatabase;",
            ">;)",
            "Lcom/ibotta/android/search/recent/RecentSearchTermDao;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase;

    invoke-static {p0}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;->proxyProvideRecentSearchDao(Lcom/ibotta/android/search/recent/RecentSearchDatabase;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRecentSearchDao(Lcom/ibotta/android/search/recent/RecentSearchDatabase;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;
    .locals 1

    .line 41
    invoke-static {p0}, Lcom/ibotta/android/di/SearchModule;->provideRecentSearchDao(Lcom/ibotta/android/search/recent/RecentSearchDatabase;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 40
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/recent/RecentSearchTermDao;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;->recentSearchDatabaseProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;->get()Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object v0

    return-object v0
.end method
