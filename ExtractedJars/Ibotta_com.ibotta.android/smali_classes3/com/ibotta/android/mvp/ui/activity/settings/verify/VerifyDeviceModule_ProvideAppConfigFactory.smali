.class public final Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;
.super Ljava/lang/Object;
.source "VerifyDeviceModule_ProvideAppConfigFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;",
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

.field private final module:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->module:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->proxyProvideAppConfig(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppConfig(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;->provideAppConfig(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->module:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->appConfigProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule_ProvideAppConfigFactory;->get()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object v0

    return-object v0
.end method
