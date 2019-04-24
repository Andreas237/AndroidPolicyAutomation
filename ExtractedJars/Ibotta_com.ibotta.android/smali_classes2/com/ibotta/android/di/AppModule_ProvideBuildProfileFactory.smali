.class public final Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideBuildProfileFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/profile/BuildProfile;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final profileDebugStateCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
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
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->appProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->profileDebugStateCallbackProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/profile/BuildProfile;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
            ">;)",
            "Lcom/ibotta/android/profile/BuildProfile;"
        }
    .end annotation

    .line 35
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/profile/ProfileDebugStateCallback;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->proxyProvideBuildProfile(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)Lcom/ibotta/android/profile/BuildProfile;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBuildProfile(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)Lcom/ibotta/android/profile/BuildProfile;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppModule;->provideBuildProfile(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)Lcom/ibotta/android/profile/BuildProfile;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 46
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/BuildProfile;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/profile/BuildProfile;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->appProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->profileDebugStateCallbackProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->get()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    return-object v0
.end method
