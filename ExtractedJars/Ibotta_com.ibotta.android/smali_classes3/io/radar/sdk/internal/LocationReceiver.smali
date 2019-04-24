.class public final Lio/radar/sdk/internal/LocationReceiver;
.super Landroid/content/BroadcastReceiver;
.source "LocationReceiver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/internal/LocationReceiver$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocationReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationReceiver.kt\nio/radar/sdk/internal/LocationReceiver\n*L\n1#1,93:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0017J\u000c\u0010\n\u001a\u00020\u000b*\u00020\u000cH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/radar/sdk/internal/LocationReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "()V",
        "goAsyncAndFinish",
        "",
        "onReceive",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "toGeofenceTransitionString",
        "",
        "",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/internal/LocationReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/internal/LocationReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/internal/LocationReceiver;->Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private final goAsyncAndFinish()V
    .locals 5

    .line 78
    invoke-virtual {p0}, Lio/radar/sdk/internal/LocationReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v0

    .line 79
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 80
    new-instance v2, Lio/radar/sdk/internal/LocationReceiver$goAsyncAndFinish$1;

    invoke-direct {v2, v0}, Lio/radar/sdk/internal/LocationReceiver$goAsyncAndFinish$1;-><init>(Landroid/content/BroadcastReceiver$PendingResult;)V

    check-cast v2, Ljava/lang/Runnable;

    const-wide/16 v3, 0x1f40

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private final toGeofenceTransitionString(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const-string p1, "other"

    goto :goto_0

    :pswitch_0
    const-string p1, "exit"

    goto :goto_0

    :pswitch_1
    const-string p1, "enter"

    goto :goto_0

    :cond_0
    const-string p1, "dwell"

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x70b1ac1

    const/4 v3, 0x1

    if-eq v1, v2, :cond_5

    const v2, 0x238b3676

    if-eq v1, v2, :cond_2

    const p1, 0x2f94f923

    if-eq v1, p1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p1, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 72
    invoke-static {}, Lio/radar/sdk/Radar;->isTracking()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {p1, v3}, Lio/radar/sdk/Radar;->requestLocation$sdk_release(Z)V

    goto/16 :goto_2

    :cond_2
    const-string v1, "io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED"

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 44
    invoke-static {p2}, Lcom/google/android/gms/location/GeofencingEvent;->fromIntent(Landroid/content/Intent;)Lcom/google/android/gms/location/GeofencingEvent;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    .line 45
    sget-object v1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v2, "Geofence Received"

    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Geofence Received: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/android/gms/location/GeofencingEvent;->getGeofenceTransition()I

    move-result v4

    invoke-direct {p0, v4}, Lio/radar/sdk/internal/LocationReceiver;->toGeofenceTransitionString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 45
    invoke-virtual {v1, p1, v2, v3}, Lio/radar/sdk/internal/RadarLogger;->notify(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_4

    .line 48
    invoke-virtual {p2}, Lcom/google/android/gms/location/GeofencingEvent;->getTriggeringLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Geofence "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/android/gms/location/GeofencingEvent;->getGeofenceTransition()I

    move-result p2

    invoke-direct {p0, p2}, Lio/radar/sdk/internal/LocationReceiver;->toGeofenceTransitionString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/location/Location;->setProvider(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_8

    .line 52
    sget-object p2, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {p2, p1}, Lio/radar/sdk/Radar;->handleLocation$sdk_release(Landroid/location/Location;)V

    .line 53
    invoke-direct {p0}, Lio/radar/sdk/internal/LocationReceiver;->goAsyncAndFinish()V

    goto :goto_2

    :cond_5
    const-string v1, "io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED"

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 57
    invoke-static {p2}, Lcom/google/android/gms/location/LocationResult;->extractResult(Landroid/content/Intent;)Lcom/google/android/gms/location/LocationResult;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 58
    invoke-virtual {p2}, Lcom/google/android/gms/location/LocationResult;->getLocations()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_6

    .line 60
    sget-object p2, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v0, "Empty Locations"

    const-string v1, ""

    invoke-virtual {p2, p1, v0, v1}, Lio/radar/sdk/internal/RadarLogger;->notify(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 63
    :cond_6
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v3, :cond_7

    .line 64
    sget-object v0, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v1, "Handling multiple locations"

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lio/radar/sdk/internal/RadarLogger;->notify(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    :cond_7
    sget-object p1, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lio/radar/sdk/Radar;->handleLocations$sdk_release(Ljava/util/List;)V

    .line 67
    invoke-direct {p0}, Lio/radar/sdk/internal/LocationReceiver;->goAsyncAndFinish()V

    :cond_8
    :goto_2
    return-void
.end method
