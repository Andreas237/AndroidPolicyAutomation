.class public final Lio/radar/sdk/location/LocationManager$getLocation$listener$1;
.super Lcom/google/android/gms/location/LocationCallback;
.source "LocationManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/location/LocationManager;->getLocation$sdk_release(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "io/radar/sdk/location/LocationManager$getLocation$listener$1",
        "Lcom/google/android/gms/location/LocationCallback;",
        "onLocationResult",
        "",
        "result",
        "Lcom/google/android/gms/location/LocationResult;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;

.field final synthetic this$0:Lio/radar/sdk/location/LocationManager;


# direct methods
.method constructor <init>(Lio/radar/sdk/location/LocationManager;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 89
    iput-object p1, p0, Lio/radar/sdk/location/LocationManager$getLocation$listener$1;->this$0:Lio/radar/sdk/location/LocationManager;

    iput-object p2, p0, Lio/radar/sdk/location/LocationManager$getLocation$listener$1;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/google/android/gms/location/LocationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/location/LocationResult;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 91
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager$getLocation$listener$1;->this$0:Lio/radar/sdk/location/LocationManager;

    invoke-static {v0}, Lio/radar/sdk/location/LocationManager;->access$getLocationClient$p(Lio/radar/sdk/location/LocationManager;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Lcom/google/android/gms/location/LocationCallback;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Lcom/google/android/gms/location/LocationCallback;)Lcom/google/android/gms/tasks/Task;

    .line 92
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager$getLocation$listener$1;->$callback:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->getLastLocation()Landroid/location/Location;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
