.class public final Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;
.super Ljava/lang/Object;
.source "PwiModule_ProvidePwiApiManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiRetailersHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->stripeManagerProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->pwiRetailersHolderProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->pwiVariantProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p7, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->appCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;)",
            "Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;"
        }
    .end annotation

    .line 90
    new-instance v8, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;"
        }
    .end annotation

    .line 73
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 74
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    .line 75
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 76
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 77
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/util/Formatting;

    .line 78
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/state/user/UserState;

    .line 79
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/appcache/AppCache;

    .line 72
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->proxyProvidePwiApiManager(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiApiManager(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;
    .locals 0

    .line 109
    invoke-static/range {p0 .. p6}, Lcom/ibotta/android/di/PwiModule;->providePwiApiManager(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 108
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;
    .locals 7

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->stripeManagerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->pwiRetailersHolderProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->pwiVariantProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->appCacheProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->get()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    move-result-object v0

    return-object v0
.end method
