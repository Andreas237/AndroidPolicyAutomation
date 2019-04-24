.class public final Lio/radar/sdk/di/LocationModule_LocationClientFactory;
.super Ljava/lang/Object;
.source "LocationModule_LocationClientFactory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
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

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lio/radar/sdk/di/LocationModule_LocationClientFactory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method public static create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/di/LocationModule_LocationClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lio/radar/sdk/di/LocationModule_LocationClientFactory;"
        }
    .end annotation

    .line 28
    new-instance v0, Lio/radar/sdk/di/LocationModule_LocationClientFactory;

    invoke-direct {v0, p0}, Lio/radar/sdk/di/LocationModule_LocationClientFactory;-><init>(Lio/radar/shadow/javax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lio/radar/shadow/javax/inject/Provider;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;"
        }
    .end annotation

    .line 24
    invoke-interface {p0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lio/radar/sdk/di/LocationModule_LocationClientFactory;->proxyLocationClient(Landroid/content/Context;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyLocationClient(Landroid/content/Context;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 1

    .line 33
    invoke-static {p0}, Lio/radar/sdk/di/LocationModule;->locationClient(Landroid/content/Context;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 32
    invoke-static {p0, v0}, Lio/radar/shadow/dagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 1

    .line 20
    iget-object v0, p0, Lio/radar/sdk/di/LocationModule_LocationClientFactory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    invoke-static {v0}, Lio/radar/sdk/di/LocationModule_LocationClientFactory;->provideInstance(Lio/radar/shadow/javax/inject/Provider;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lio/radar/sdk/di/LocationModule_LocationClientFactory;->get()Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v0

    return-object v0
.end method
