.class public final Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;
.super Ljava/lang/Object;
.source "BlacklistModule_ProvideBlacklistClassifierFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;",
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

.field private final appVersionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->appVersionHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;",
            ">;)",
            "Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;",
            ">;)",
            "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->proxyProvideBlacklistClassifierFactory(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;)Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBlacklistClassifierFactory(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;)Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/BlacklistModule;->provideBlacklistClassifierFactory(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;)Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->appVersionHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->get()Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    move-result-object v0

    return-object v0
.end method
