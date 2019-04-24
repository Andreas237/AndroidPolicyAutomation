.class public final Lio/radar/sdk/state/StateManagerRepository;
.super Lio/radar/sdk/internal/repository/BaseRepository;
.source "StateManagerRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/state/StateManagerRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStateManagerRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateManagerRepository.kt\nio/radar/sdk/state/StateManagerRepository\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,90:1\n11#2,4:91\n11#2,4:95\n*E\n*S KotlinDebug\n*F\n+ 1 StateManagerRepository.kt\nio/radar/sdk/state/StateManagerRepository\n*L\n35#1,4:91\n60#1,4:95\n*E\n"
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u000c8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/radar/sdk/state/StateManagerRepository;",
        "Lio/radar/sdk/internal/repository/BaseRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "value",
        "Lio/radar/sdk/internal/RadarState;",
        "currentState",
        "getCurrentState$sdk_release",
        "()Lio/radar/sdk/internal/RadarState;",
        "setCurrentState$sdk_release",
        "(Lio/radar/sdk/internal/RadarState;)V",
        "Landroid/location/Location;",
        "lastMovingLocation",
        "getLastMovingLocation$sdk_release",
        "()Landroid/location/Location;",
        "setLastMovingLocation$sdk_release",
        "(Landroid/location/Location;)V",
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
.field public static final Companion:Lio/radar/sdk/state/StateManagerRepository$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/state/StateManagerRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/state/StateManagerRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/state/StateManagerRepository;->Companion:Lio/radar/sdk/state/StateManagerRepository$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/javax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1}, Lio/radar/sdk/internal/repository/BaseRepository;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final getCurrentState$sdk_release()Lio/radar/sdk/internal/RadarState;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 72
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "state_type"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 73
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "state_just_stopped"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 74
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "state_location_long"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    .line 75
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v5, "state_location_lat"

    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v3

    .line 76
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "state_location_time"

    const-wide/16 v7, 0x0

    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    .line 77
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v8, "state_location_acc"

    invoke-interface {v7, v8, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v4

    .line 78
    new-instance v7, Landroid/location/Location;

    const-string v8, "radar"

    invoke-direct {v7, v8}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    float-to-double v8, v3

    .line 79
    invoke-virtual {v7, v8, v9}, Landroid/location/Location;->setLatitude(D)V

    float-to-double v2, v2

    .line 80
    invoke-virtual {v7, v2, v3}, Landroid/location/Location;->setLongitude(D)V

    .line 81
    invoke-virtual {v7, v5, v6}, Landroid/location/Location;->setTime(J)V

    .line 82
    invoke-virtual {v7, v4}, Landroid/location/Location;->setAccuracy(F)V

    .line 84
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x333bd1

    if-eq v2, v3, :cond_1

    const v3, 0x360802

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "stop"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    new-instance v0, Lio/radar/sdk/internal/Stopped;

    invoke-direct {v0, v7, v1}, Lio/radar/sdk/internal/Stopped;-><init>(Landroid/location/Location;Z)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_1

    :cond_1
    const-string v1, "move"

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    new-instance v0, Lio/radar/sdk/internal/Moving;

    invoke-direct {v0, v7}, Lio/radar/sdk/internal/Moving;-><init>(Landroid/location/Location;)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_1

    .line 87
    :cond_2
    :goto_0
    new-instance v0, Lio/radar/sdk/internal/Moving;

    invoke-direct {v0, v7}, Lio/radar/sdk/internal/Moving;-><init>(Landroid/location/Location;)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    :goto_1
    return-object v0

    :cond_3
    return-object v2
.end method

.method public final getLastMovingLocation$sdk_release()Landroid/location/Location;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 44
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "last_moving_lat"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    .line 45
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v3, "last_moving_long"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v1

    .line 46
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "last_moving_time"

    const-wide/16 v5, 0x0

    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmpg-float v7, v0, v2

    if-eqz v7, :cond_0

    cmpg-float v2, v1, v2

    if-eqz v2, :cond_0

    cmp-long v2, v3, v5

    if-lez v2, :cond_0

    .line 48
    new-instance v2, Landroid/location/Location;

    const-string v5, "radar"

    invoke-direct {v2, v5}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    float-to-double v5, v0

    .line 49
    invoke-virtual {v2, v5, v6}, Landroid/location/Location;->setLatitude(D)V

    float-to-double v0, v1

    .line 50
    invoke-virtual {v2, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    .line 51
    invoke-virtual {v2, v3, v4}, Landroid/location/Location;->setTime(J)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2
.end method

.method public final setCurrentState$sdk_release(Lio/radar/sdk/internal/RadarState;)V
    .locals 4
    .param p1    # Lio/radar/sdk/internal/RadarState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_3

    .line 61
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 95
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "state_location_lat"

    .line 62
    invoke-virtual {p1}, Lio/radar/sdk/internal/RadarState;->getLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "state_location_long"

    .line 63
    invoke-virtual {p1}, Lio/radar/sdk/internal/RadarState;->getLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "state_location_time"

    .line 64
    invoke-virtual {p1}, Lio/radar/sdk/internal/RadarState;->getLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v1, "state_location_acc"

    .line 65
    invoke-virtual {p1}, Lio/radar/sdk/internal/RadarState;->getLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "state_type"

    .line 66
    instance-of v2, p1, Lio/radar/sdk/internal/Moving;

    if-eqz v2, :cond_0

    const-string v2, "move"

    goto :goto_0

    :cond_0
    const-string v2, "stop"

    :goto_0
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "state_just_stopped"

    .line 67
    instance-of v2, p1, Lio/radar/sdk/internal/Stopped;

    if-nez v2, :cond_1

    const/4 p1, 0x0

    :cond_1
    check-cast p1, Lio/radar/sdk/internal/Stopped;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/radar/sdk/internal/Stopped;->getJustStopped()Z

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 97
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_3
    return-void
.end method

.method public final setLastMovingLocation$sdk_release(Landroid/location/Location;)V
    .locals 4
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 36
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 91
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 92
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "last_moving_lat"

    .line 37
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "last_moving_long"

    .line 38
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "last_moving_time"

    .line 39
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 93
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method
