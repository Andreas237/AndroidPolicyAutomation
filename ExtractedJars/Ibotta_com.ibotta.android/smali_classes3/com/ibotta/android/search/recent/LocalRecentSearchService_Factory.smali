.class public final Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;
.super Ljava/lang/Object;
.source "LocalRecentSearchService_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/recent/LocalRecentSearchService;",
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

.field private final recentSearchTermDAOProvider:Ljavax/inject/Provider;
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

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;->recentSearchTermDAOProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;
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
            "Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newLocalRecentSearchService(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/recent/LocalRecentSearchService;
    .locals 1

    .line 43
    new-instance v0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/LocalRecentSearchService;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/recent/LocalRecentSearchService;
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
            "Lcom/ibotta/android/search/recent/LocalRecentSearchService;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;

    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/LocalRecentSearchService;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/recent/LocalRecentSearchService;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;->recentSearchTermDAOProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/recent/LocalRecentSearchService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/search/recent/LocalRecentSearchService_Factory;->get()Lcom/ibotta/android/search/recent/LocalRecentSearchService;

    move-result-object v0

    return-object v0
.end method
