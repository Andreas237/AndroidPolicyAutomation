.class public final Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;
.super Ljava/lang/Object;
.source "WindfallModule_ProvideWindfallHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/windfall/helper/WindfallHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;"
        }
    .end annotation
.end field

.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
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

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final receiptSubmissionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->apiContextProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p5, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p6, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->receiptSubmissionHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;)",
            "Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;"
        }
    .end annotation

    .line 81
    new-instance v7, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/windfall/helper/WindfallHelper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;)",
            "Lcom/ibotta/android/windfall/helper/WindfallHelper;"
        }
    .end annotation

    .line 66
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 67
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/util/Formatting;

    .line 68
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/appcache/AppCache;

    .line 69
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/api/ApiContext;

    .line 70
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/state/user/UserState;

    .line 71
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    .line 65
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->proxyProvideWindfallHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/ApiContext;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;)Lcom/ibotta/android/windfall/helper/WindfallHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideWindfallHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/ApiContext;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;)Lcom/ibotta/android/windfall/helper/WindfallHelper;
    .locals 0

    .line 98
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/WindfallModule;->provideWindfallHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/ApiContext;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;)Lcom/ibotta/android/windfall/helper/WindfallHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 97
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/windfall/helper/WindfallHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/windfall/helper/WindfallHelper;
    .locals 6

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->apiContextProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->receiptSubmissionHelperProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/windfall/helper/WindfallHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->get()Lcom/ibotta/android/windfall/helper/WindfallHelper;

    move-result-object v0

    return-object v0
.end method
