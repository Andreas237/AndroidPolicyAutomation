.class public final Lio/radar/sdk/api/ApiClientRepository;
.super Lio/radar/sdk/internal/repository/BaseRepository;
.source "ApiClientRepository.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiClientRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClientRepository.kt\nio/radar/sdk/api/ApiClientRepository\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,86:1\n11#2,4:87\n11#2,4:91\n11#2,4:95\n11#2,4:99\n11#2,4:103\n*E\n*S KotlinDebug\n*F\n+ 1 ApiClientRepository.kt\nio/radar/sdk/api/ApiClientRepository\n*L\n28#1,4:87\n39#1,4:91\n43#1,4:95\n80#1,4:99\n84#1,4:103\n*E\n"
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
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u00104\u001a\u000205H\u0000\u00a2\u0006\u0002\u00086R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008R\u0014\u0010\r\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008R\u0014\u0010\u000f\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0008R\u0014\u0010\u0011\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0008R\u0014\u0010\u0013\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0008R\u0014\u0010\u0015\u001a\u00020\u0006X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0008R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0008R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR$\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\u001d\"\u0004\u0008\"\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010#2\u0008\u0010\u0019\u001a\u0004\u0018\u00010#8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R(\u0010*\u001a\u0004\u0018\u00010)2\u0008\u0010\u0019\u001a\u0004\u0018\u00010)8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R(\u0010/\u001a\u0004\u0018\u00010)2\u0008\u0010\u0019\u001a\u0004\u0018\u00010)8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u00080\u0010,\"\u0004\u00081\u0010.R\u0014\u00102\u001a\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\u0008\u00a8\u00067"
    }
    d2 = {
        "Lio/radar/sdk/api/ApiClientRepository;",
        "Lio/radar/sdk/internal/repository/BaseRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "DEFAULT_RADAR_HOST",
        "",
        "getDEFAULT_RADAR_HOST$sdk_release",
        "()Ljava/lang/String;",
        "KEY_AD_ID",
        "getKEY_AD_ID$sdk_release",
        "KEY_AT_PLACE",
        "getKEY_AT_PLACE$sdk_release",
        "KEY_CAN_EXIT",
        "getKEY_CAN_EXIT$sdk_release",
        "KEY_LAST_FAILED_STOP",
        "getKEY_LAST_FAILED_STOP$sdk_release",
        "KEY_LAST_SENT_AT",
        "getKEY_LAST_SENT_AT$sdk_release",
        "KEY_PLACES_LIMIT_TIME",
        "getKEY_PLACES_LIMIT_TIME$sdk_release",
        "KEY_RADAR_HOST",
        "getKEY_RADAR_HOST$sdk_release",
        "adId",
        "getAdId$sdk_release",
        "value",
        "",
        "atPlace",
        "getAtPlace$sdk_release",
        "()Z",
        "setAtPlace$sdk_release",
        "(Z)V",
        "canExit",
        "getCanExit$sdk_release",
        "setCanExit$sdk_release",
        "Landroid/location/Location;",
        "lastFailedStop",
        "getLastFailedStop$sdk_release",
        "()Landroid/location/Location;",
        "setLastFailedStop$sdk_release",
        "(Landroid/location/Location;)V",
        "Ljava/util/Date;",
        "lastSentAt",
        "getLastSentAt$sdk_release",
        "()Ljava/util/Date;",
        "setLastSentAt$sdk_release",
        "(Ljava/util/Date;)V",
        "placesLimitAt",
        "getPlacesLimitAt$sdk_release",
        "setPlacesLimitAt$sdk_release",
        "radarHost",
        "getRadarHost$sdk_release",
        "loadAdId",
        "",
        "loadAdId$sdk_release",
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
.field private final DEFAULT_RADAR_HOST:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_AD_ID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_AT_PLACE:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_CAN_EXIT:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_LAST_FAILED_STOP:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_LAST_SENT_AT:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_PLACES_LIMIT_TIME:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final KEY_RADAR_HOST:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final context:Landroid/content/Context;


# direct methods
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

    .line 17
    invoke-direct {p0, p1}, Lio/radar/sdk/internal/repository/BaseRepository;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->context:Landroid/content/Context;

    const-string p1, "ad_id"

    .line 18
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_AD_ID:Ljava/lang/String;

    const-string p1, "is_at_place"

    .line 19
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_AT_PLACE:Ljava/lang/String;

    const-string p1, "places_limit_hit"

    .line 20
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_PLACES_LIMIT_TIME:Ljava/lang/String;

    const-string p1, "last_sent_at_time"

    .line 21
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_LAST_SENT_AT:Ljava/lang/String;

    const-string p1, "radar_api_host"

    .line 22
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_RADAR_HOST:Ljava/lang/String;

    const-string p1, "https://api.radar.io"

    .line 23
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->DEFAULT_RADAR_HOST:Ljava/lang/String;

    const-string p1, "last_failed_stop"

    .line 24
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_LAST_FAILED_STOP:Ljava/lang/String;

    const-string p1, "can_exit"

    .line 25
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_CAN_EXIT:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lio/radar/sdk/api/ApiClientRepository;)Landroid/content/Context;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object p0, p0, Lio/radar/sdk/api/ApiClientRepository;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getSharedPreferences$p(Lio/radar/sdk/api/ApiClientRepository;)Landroid/content/SharedPreferences;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getAdId$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 54
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_AD_ID:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getAtPlace$sdk_release()Z
    .locals 3

    .line 40
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_AT_PLACE:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final getCanExit$sdk_release()Z
    .locals 3

    .line 85
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_CAN_EXIT:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final getKEY_AD_ID$sdk_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object v0, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_AD_ID:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastFailedStop$sdk_release()Landroid/location/Location;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 81
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_LAST_FAILED_STOP:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/radar/sdk/internal/extensions/SharedPreferencesKt;->getLocation(Landroid/content/SharedPreferences;Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public final getLastSentAt$sdk_release()Ljava/util/Date;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 45
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_LAST_SENT_AT:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 47
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2
.end method

.method public final getPlacesLimitAt$sdk_release()Ljava/util/Date;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 30
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_PLACES_LIMIT_TIME:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 32
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2
.end method

.method public final getRadarHost$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 76
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_RADAR_HOST:Ljava/lang/String;

    iget-object v2, p0, Lio/radar/sdk/api/ApiClientRepository;->DEFAULT_RADAR_HOST:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sharedPreferences.getStr\u2026HOST, DEFAULT_RADAR_HOST)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final loadAdId$sdk_release()V
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;

    invoke-direct {v1, p0}, Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;-><init>(Lio/radar/sdk/api/ApiClientRepository;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 71
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final setAtPlace$sdk_release(Z)V
    .locals 2

    .line 39
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 91
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 92
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_AT_PLACE:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 93
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setCanExit$sdk_release(Z)V
    .locals 2

    .line 84
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 103
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 104
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_CAN_EXIT:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 105
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setLastFailedStop$sdk_release(Landroid/location/Location;)V
    .locals 2
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 80
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 99
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 100
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_LAST_FAILED_STOP:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lio/radar/sdk/internal/extensions/SharedPreferencesKt;->putLocation(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Landroid/location/Location;)V

    .line 101
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setLastSentAt$sdk_release(Ljava/util/Date;)V
    .locals 4
    .param p1    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 43
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 95
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_LAST_SENT_AT:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 97
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setPlacesLimitAt$sdk_release(Ljava/util/Date;)V
    .locals 4
    .param p1    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 28
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 87
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 88
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository;->KEY_PLACES_LIMIT_TIME:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 89
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
