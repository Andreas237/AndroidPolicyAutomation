.class public final Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;
.super Ljava/lang/Object;
.source "AppModule_RecentlyViewedOfferHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
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
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;->offerHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p0}, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;->proxyRecentlyViewedOfferHelper(Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyRecentlyViewedOfferHelper(Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/AppModule;->RecentlyViewedOfferHelper(Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;->get()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-result-object v0

    return-object v0
.end method
