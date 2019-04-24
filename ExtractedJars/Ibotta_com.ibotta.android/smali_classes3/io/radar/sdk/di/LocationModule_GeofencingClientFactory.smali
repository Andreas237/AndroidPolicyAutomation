.class public final Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;
.super Ljava/lang/Object;
.source "LocationModule_GeofencingClientFactory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lcom/google/android/gms/location/GeofencingClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/radar/shadow/javax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method public static create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;"
        }
    .end annotation

    .line 27
    new-instance v0, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;

    invoke-direct {v0, p0}, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;-><init>(Lio/radar/shadow/javax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lio/radar/shadow/javax/inject/Provider;)Lcom/google/android/gms/location/GeofencingClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/google/android/gms/location/GeofencingClient;"
        }
    .end annotation

    .line 23
    invoke-interface {p0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;->proxyGeofencingClient(Landroid/content/Context;)Lcom/google/android/gms/location/GeofencingClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyGeofencingClient(Landroid/content/Context;)Lcom/google/android/gms/location/GeofencingClient;
    .locals 1

    .line 32
    invoke-static {p0}, Lio/radar/sdk/di/LocationModule;->geofencingClient(Landroid/content/Context;)Lcom/google/android/gms/location/GeofencingClient;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {p0, v0}, Lio/radar/shadow/dagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/location/GeofencingClient;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/google/android/gms/location/GeofencingClient;
    .locals 1

    .line 19
    iget-object v0, p0, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    invoke-static {v0}, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;->provideInstance(Lio/radar/shadow/javax/inject/Provider;)Lcom/google/android/gms/location/GeofencingClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;->get()Lcom/google/android/gms/location/GeofencingClient;

    move-result-object v0

    return-object v0
.end method
