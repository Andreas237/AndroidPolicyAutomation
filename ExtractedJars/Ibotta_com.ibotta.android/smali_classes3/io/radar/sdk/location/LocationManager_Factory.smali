.class public final Lio/radar/sdk/location/LocationManager_Factory;
.super Ljava/lang/Object;
.source "LocationManager_Factory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lio/radar/sdk/location/LocationManager;",
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

.field private final geofencingClientProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/GeofencingClient;",
            ">;"
        }
    .end annotation
.end field

.field private final locationClientProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            ">;"
        }
    .end annotation
.end field

.field private final optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final repositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManagerRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManagerRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/GeofencingClient;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lio/radar/sdk/location/LocationManager_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 29
    iput-object p2, p0, Lio/radar/sdk/location/LocationManager_Factory;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 30
    iput-object p3, p0, Lio/radar/sdk/location/LocationManager_Factory;->repositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 31
    iput-object p4, p0, Lio/radar/sdk/location/LocationManager_Factory;->geofencingClientProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 32
    iput-object p5, p0, Lio/radar/sdk/location/LocationManager_Factory;->locationClientProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method public static create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/location/LocationManager_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManagerRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/GeofencingClient;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            ">;)",
            "Lio/radar/sdk/location/LocationManager_Factory;"
        }
    .end annotation

    .line 65
    new-instance v6, Lio/radar/sdk/location/LocationManager_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lio/radar/sdk/location/LocationManager_Factory;-><init>(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/location/LocationManager;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManagerRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/GeofencingClient;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            ">;)",
            "Lio/radar/sdk/location/LocationManager;"
        }
    .end annotation

    .line 51
    new-instance v6, Lio/radar/sdk/location/LocationManager;

    .line 52
    invoke-interface {p0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 53
    invoke-interface {p1}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lio/radar/sdk/internal/repository/OptionsRepository;

    .line 54
    invoke-interface {p2}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lio/radar/sdk/location/LocationManagerRepository;

    .line 55
    invoke-interface {p3}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/google/android/gms/location/GeofencingClient;

    .line 56
    invoke-interface {p4}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/radar/sdk/location/LocationManager;-><init>(Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/location/LocationManagerRepository;Lcom/google/android/gms/location/GeofencingClient;Lcom/google/android/gms/location/FusedLocationProviderClient;)V

    return-object v6
.end method


# virtual methods
.method public get()Lio/radar/sdk/location/LocationManager;
    .locals 5

    .line 37
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/location/LocationManager_Factory;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v2, p0, Lio/radar/sdk/location/LocationManager_Factory;->repositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v3, p0, Lio/radar/sdk/location/LocationManager_Factory;->geofencingClientProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v4, p0, Lio/radar/sdk/location/LocationManager_Factory;->locationClientProvider:Lio/radar/shadow/javax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lio/radar/sdk/location/LocationManager_Factory;->provideInstance(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/location/LocationManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lio/radar/sdk/location/LocationManager_Factory;->get()Lio/radar/sdk/location/LocationManager;

    move-result-object v0

    return-object v0
.end method
