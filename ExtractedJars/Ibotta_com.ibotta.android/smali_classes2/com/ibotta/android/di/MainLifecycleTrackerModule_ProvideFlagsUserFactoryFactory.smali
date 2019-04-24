.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/features/variant/FlagsUserFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final googleAIDRetrieverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/GoogleAIDRetriever;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/GoogleAIDRetriever;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->googleAIDRetrieverProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/GoogleAIDRetriever;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/features/variant/FlagsUserFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/GoogleAIDRetriever;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Lcom/ibotta/android/features/variant/FlagsUserFactory;"
        }
    .end annotation

    .line 50
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 51
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/UserState;

    .line 52
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/async/device/GoogleAIDRetriever;

    .line 53
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/profile/BuildProfile;

    .line 49
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->proxyProvideFlagsUserFactory(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/features/variant/FlagsUserFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFlagsUserFactory(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/features/variant/FlagsUserFactory;
    .locals 0

    .line 71
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideFlagsUserFactory(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/features/variant/FlagsUserFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 70
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/variant/FlagsUserFactory;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->googleAIDRetrieverProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/features/variant/FlagsUserFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->get()Lcom/ibotta/android/features/variant/FlagsUserFactory;

    move-result-object v0

    return-object v0
.end method
