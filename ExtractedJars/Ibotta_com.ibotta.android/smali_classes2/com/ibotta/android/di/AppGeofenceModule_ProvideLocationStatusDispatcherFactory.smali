.class public final Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;
.super Ljava/lang/Object;
.source "AppGeofenceModule_ProvideLocationStatusDispatcherFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/location/LocationStatusDispatcher;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;->INSTANCE:Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;->INSTANCE:Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/location/LocationStatusDispatcher;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;->proxyProvideLocationStatusDispatcher()Lcom/ibotta/android/location/LocationStatusDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideLocationStatusDispatcher()Lcom/ibotta/android/location/LocationStatusDispatcher;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/AppGeofenceModule;->provideLocationStatusDispatcher()Lcom/ibotta/android/location/LocationStatusDispatcher;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/LocationStatusDispatcher;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/location/LocationStatusDispatcher;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;->provideInstance()Lcom/ibotta/android/location/LocationStatusDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;->get()Lcom/ibotta/android/location/LocationStatusDispatcher;

    move-result-object v0

    return-object v0
.end method
