.class public final Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideMvpPresenterActionsFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
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

.field private final criticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->criticalDependencyProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p5, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;"
        }
    .end annotation

    .line 73
    new-instance v6, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;)",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;"
        }
    .end annotation

    .line 60
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    .line 61
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/hardware/Hardware;

    .line 62
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 63
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 64
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 59
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->proxyProvideMvpPresenterActions(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenterActions(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;
    .locals 0

    .line 88
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/MiscModule;->provideMvpPresenterActions(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 87
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/base/MvpPresenterActions;
    .locals 5

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->criticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->get()Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object v0

    return-object v0
.end method
