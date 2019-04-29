.class public final Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;
.super Ljava/lang/Object;
.source "ManagerModule_ProvidePermissionsHelperFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final permissionsStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;"
        }
    .end annotation
.end field

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
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
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->trackerProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->permissionsStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;)",
            "Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;)",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;"
        }
    .end annotation

    .line 35
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/Tracker;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/permissions/PermissionsState;

    .line 34
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->proxyProvidePermissionsHelperFactory(Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;)Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePermissionsHelperFactory(Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;)Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ManagerModule;->providePermissionsHelperFactory(Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;)Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 46
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->trackerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->permissionsStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->get()Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    move-result-object v0

    return-object v0
.end method