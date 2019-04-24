.class public final Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;
.super Ljava/lang/Object;
.source "AppGeofenceModule_ProvideGeofenceConfigHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
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

.field private final appContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->appContextProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->proxyProvideGeofenceConfigHelper(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideGeofenceConfigHelper(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;
    .locals 0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppGeofenceModule;->provideGeofenceConfigHelper(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 45
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->appContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->appConfigProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->get()Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    move-result-object v0

    return-object v0
.end method
