.class public final Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;
.super Ljava/lang/Object;
.source "WindfallModule_ProvideWindfallGatekeeperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final blacklistEngineProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistEngine;",
            ">;"
        }
    .end annotation
.end field

.field private final windfallReceiptSdkProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/WindfallReceiptSdk;",
            ">;"
        }
    .end annotation
.end field

.field private final windfallRetailerSupportProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/WindfallReceiptSdk;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistEngine;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->windfallReceiptSdkProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->blacklistEngineProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->windfallRetailerSupportProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/WindfallReceiptSdk;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistEngine;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;",
            ">;)",
            "Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/WindfallReceiptSdk;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistEngine;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;",
            ">;)",
            "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;"
        }
    .end annotation

    .line 53
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/windfall/WindfallReceiptSdk;

    .line 54
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/blacklist/BlacklistEngine;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 56
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->proxyProvideWindfallGatekeeper(Lcom/ibotta/android/windfall/WindfallReceiptSdk;Lcom/ibotta/android/blacklist/BlacklistEngine;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;)Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideWindfallGatekeeper(Lcom/ibotta/android/windfall/WindfallReceiptSdk;Lcom/ibotta/android/blacklist/BlacklistEngine;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;)Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;
    .locals 0

    .line 77
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/WindfallModule;->provideWindfallGatekeeper(Lcom/ibotta/android/windfall/WindfallReceiptSdk;Lcom/ibotta/android/blacklist/BlacklistEngine;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;)Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 76
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->windfallReceiptSdkProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->blacklistEngineProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->windfallRetailerSupportProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->get()Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    move-result-object v0

    return-object v0
.end method
