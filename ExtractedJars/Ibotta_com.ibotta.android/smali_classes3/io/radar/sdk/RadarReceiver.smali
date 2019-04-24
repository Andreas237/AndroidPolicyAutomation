.class public abstract Lio/radar/sdk/RadarReceiver;
.super Landroid/content/BroadcastReceiver;
.source "RadarReceiver.kt"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/RadarReceiver$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarReceiver.kt\nio/radar/sdk/RadarReceiver\n*L\n1#1,139:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H&J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H&\u00a2\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/radar/sdk/RadarReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "()V",
        "handleError",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "handleLocation",
        "handleSuccess",
        "onClientLocationUpdated",
        "location",
        "Landroid/location/Location;",
        "stopped",
        "",
        "onError",
        "status",
        "Lio/radar/sdk/Radar$RadarStatus;",
        "onEventsReceived",
        "events",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "user",
        "Lio/radar/sdk/model/RadarUser;",
        "(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V",
        "onLocationUpdated",
        "onReceive",
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
.field public static final ACTION_RECEIVED:Ljava/lang/String; = "io.radar.sdk.RECEIVED"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lio/radar/sdk/RadarReceiver$Companion;

.field public static final EXTRA_ERROR_STATUS:Ljava/lang/String; = "status"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRA_LOCATION:Ljava/lang/String; = "location"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRA_PAYLOAD:Ljava/lang/String; = "response"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRA_STOPPED:Ljava/lang/String; = "stopped"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/RadarReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/RadarReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/RadarReceiver;->Companion:Lio/radar/sdk/RadarReceiver$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private final handleError(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "status"

    const/4 v1, -0x1

    .line 84
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 85
    invoke-static {}, Lio/radar/sdk/Radar$RadarStatus;->values()[Lio/radar/sdk/Radar$RadarStatus;

    move-result-object v0

    .line 88
    array-length v1, v0

    if-gez p2, :cond_0

    goto :goto_0

    :cond_0
    if-le v1, p2, :cond_1

    aget-object p2, v0, p2

    goto :goto_1

    .line 89
    :cond_1
    :goto_0
    sget-object p2, Lio/radar/sdk/Radar$RadarStatus;->UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    .line 91
    :goto_1
    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->SUCCESS:Lio/radar/sdk/Radar$RadarStatus;

    if-eq p2, v0, :cond_2

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    if-eq p2, v0, :cond_2

    .line 92
    invoke-virtual {p0, p1, p2}, Lio/radar/sdk/RadarReceiver;->onError(Landroid/content/Context;Lio/radar/sdk/Radar$RadarStatus;)V

    :cond_2
    return-void
.end method

.method private final handleLocation(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "location"

    .line 97
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    const-string v1, "stopped"

    const/4 v2, 0x0

    .line 98
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {p0, p1, v0, p2}, Lio/radar/sdk/RadarReceiver;->onClientLocationUpdated(Landroid/content/Context;Landroid/location/Location;Z)V

    :cond_0
    return-void
.end method

.method private final handleSuccess(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "response"

    .line 61
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "location"

    .line 62
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/location/Location;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    .line 66
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "events"

    .line 67
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 68
    sget-object v2, Lio/radar/sdk/model/RadarEvent;->Companion:Lio/radar/sdk/model/RadarEvent$Companion;

    const-string v3, "eventsArr"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lio/radar/sdk/model/RadarEvent$Companion;->eventsFromJSONArray$sdk_release(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarEvent;

    move-result-object v1

    .line 69
    sget-object v2, Lio/radar/sdk/model/RadarUser;->Companion:Lio/radar/sdk/model/RadarUser$Companion;

    const-string v3, "user"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v3, "response.getJSONObject(\"user\")"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lio/radar/sdk/model/RadarUser$Companion;->fromJson$sdk_release(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUser;

    move-result-object v0

    .line 71
    array-length v2, v1

    const/4 v3, 0x1

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    xor-int/2addr v2, v3

    if-eqz v2, :cond_1

    .line 72
    invoke-virtual {p0, p1, v1, v0}, Lio/radar/sdk/RadarReceiver;->onEventsReceived(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    .line 74
    :cond_1
    invoke-virtual {p0, p1, p2, v0}, Lio/radar/sdk/RadarReceiver;->onLocationUpdated(Landroid/content/Context;Landroid/location/Location;Lio/radar/sdk/model/RadarUser;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 78
    :catch_0
    sget-object p2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    invoke-virtual {p0, p1, p2}, Lio/radar/sdk/RadarReceiver;->onError(Landroid/content/Context;Lio/radar/sdk/Radar$RadarStatus;)V

    goto :goto_1

    .line 76
    :catch_1
    sget-object p2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    invoke-virtual {p0, p1, p2}, Lio/radar/sdk/RadarReceiver;->onError(Landroid/content/Context;Lio/radar/sdk/Radar$RadarStatus;)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public onClientLocationUpdated(Landroid/content/Context;Landroid/location/Location;Z)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract onError(Landroid/content/Context;Lio/radar/sdk/Radar$RadarStatus;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onEventsReceived(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Lio/radar/sdk/model/RadarEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public onLocationUpdated(Landroid/content/Context;Landroid/location/Location;Lio/radar/sdk/model/RadarUser;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "user"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "io.radar.sdk.RECEIVED"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "location"

    .line 50
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "response"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    invoke-direct {p0, p1, p2}, Lio/radar/sdk/RadarReceiver;->handleSuccess(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string v0, "location"

    .line 52
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "stopped"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    invoke-direct {p0, p1, p2}, Lio/radar/sdk/RadarReceiver;->handleLocation(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    .line 55
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/radar/sdk/RadarReceiver;->handleError(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_2
    :goto_0
    return-void
.end method
