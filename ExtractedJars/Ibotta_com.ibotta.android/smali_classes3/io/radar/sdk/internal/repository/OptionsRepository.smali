.class public final Lio/radar/sdk/internal/repository/OptionsRepository;
.super Lio/radar/sdk/internal/repository/BaseRepository;
.source "OptionsRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/internal/repository/OptionsRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOptionsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsRepository.kt\nio/radar/sdk/internal/repository/OptionsRepository\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,83:1\n11#2,4:84\n11#2,4:88\n11#2,4:92\n11#2,4:96\n11#2,4:100\n11#2,4:104\n11#2,4:108\n11#2,4:112\n*E\n*S KotlinDebug\n*F\n+ 1 OptionsRepository.kt\nio/radar/sdk/internal/repository/OptionsRepository\n*L\n34#1,4:84\n40#1,4:88\n46#1,4:92\n60#1,4:96\n64#1,4:100\n68#1,4:104\n72#1,4:108\n78#1,4:112\n*E\n"
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
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR$\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\t\"\u0004\u0008\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\t\"\u0004\u0008\u0017\u0010\u000bR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lio/radar/sdk/internal/repository/OptionsRepository;",
        "Lio/radar/sdk/internal/repository/BaseRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "value",
        "",
        "backgroundTracking",
        "getBackgroundTracking$sdk_release",
        "()Z",
        "setBackgroundTracking$sdk_release",
        "(Z)V",
        "debug",
        "getDebug$sdk_release",
        "setDebug$sdk_release",
        "",
        "dwellDelay",
        "getDwellDelay$sdk_release",
        "()I",
        "setDwellDelay$sdk_release",
        "(I)V",
        "foregroundTracking",
        "getForegroundTracking$sdk_release",
        "setForegroundTracking$sdk_release",
        "Lio/radar/sdk/Radar$RadarTrackingOffline;",
        "offlineMode",
        "getOfflineMode$sdk_release",
        "()Lio/radar/sdk/Radar$RadarTrackingOffline;",
        "setOfflineMode$sdk_release",
        "(Lio/radar/sdk/Radar$RadarTrackingOffline;)V",
        "Lio/radar/sdk/Radar$RadarPlacesProvider;",
        "placesProvider",
        "getPlacesProvider$sdk_release",
        "()Lio/radar/sdk/Radar$RadarPlacesProvider;",
        "setPlacesProvider$sdk_release",
        "(Lio/radar/sdk/Radar$RadarPlacesProvider;)V",
        "Lio/radar/sdk/Radar$RadarTrackingSync;",
        "syncMode",
        "getSyncMode$sdk_release",
        "()Lio/radar/sdk/Radar$RadarTrackingSync;",
        "setSyncMode$sdk_release",
        "(Lio/radar/sdk/Radar$RadarTrackingSync;)V",
        "",
        "updateInterval",
        "getUpdateInterval$sdk_release",
        "()J",
        "setUpdateInterval$sdk_release",
        "(J)V",
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
.field public static final Companion:Lio/radar/sdk/internal/repository/OptionsRepository$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/internal/repository/OptionsRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/internal/repository/OptionsRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/internal/repository/OptionsRepository;->Companion:Lio/radar/sdk/internal/repository/OptionsRepository$Companion;

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
.method public final getBackgroundTracking$sdk_release()Z
    .locals 3

    .line 69
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "background_tracking"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final getDebug$sdk_release()Z
    .locals 3

    .line 61
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "debug_mode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final getDwellDelay$sdk_release()I
    .locals 4

    .line 37
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "dwell_delay"

    const-wide v2, 0x41024f8000000000L    # 150000.0

    double-to-int v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getOfflineMode$sdk_release()Lio/radar/sdk/Radar$RadarTrackingOffline;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 75
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingOffline;->Companion:Lio/radar/sdk/Radar$RadarTrackingOffline$Companion;

    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "offline_mode"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lio/radar/sdk/Radar$RadarTrackingOffline$Companion;->fromInt(I)Lio/radar/sdk/Radar$RadarTrackingOffline;

    move-result-object v0

    return-object v0
.end method

.method public final getPlacesProvider$sdk_release()Lio/radar/sdk/Radar$RadarPlacesProvider;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 53
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "places_provider"

    const-string v2, "none"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x1da19ac6

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "facebook"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    sget-object v0, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    sget-object v0, Lio/radar/sdk/Radar$RadarPlacesProvider;->NONE:Lio/radar/sdk/Radar$RadarPlacesProvider;

    :goto_1
    return-object v0
.end method

.method public final getSyncMode$sdk_release()Lio/radar/sdk/Radar$RadarTrackingSync;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 81
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingSync;->Companion:Lio/radar/sdk/Radar$RadarTrackingSync$Companion;

    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "sync_mode"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lio/radar/sdk/Radar$RadarTrackingSync$Companion;->fromInt(I)Lio/radar/sdk/Radar$RadarTrackingSync;

    move-result-object v0

    return-object v0
.end method

.method public final getUpdateInterval$sdk_release()J
    .locals 4

    .line 43
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "update_interval"

    const-wide/32 v2, 0x57e40

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final setBackgroundTracking$sdk_release(Z)V
    .locals 2

    .line 68
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 104
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "background_tracking"

    .line 68
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 106
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setDwellDelay$sdk_release(I)V
    .locals 2

    .line 34
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 84
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dwell_delay"

    .line 35
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 86
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setOfflineMode$sdk_release(Lio/radar/sdk/Radar$RadarTrackingOffline;)V
    .locals 2
    .param p1    # Lio/radar/sdk/Radar$RadarTrackingOffline;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 108
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "offline_mode"

    .line 73
    invoke-virtual {p1}, Lio/radar/sdk/Radar$RadarTrackingOffline;->getMode$sdk_release()I

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 110
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setPlacesProvider$sdk_release(Lio/radar/sdk/Radar$RadarPlacesProvider;)V
    .locals 3
    .param p1    # Lio/radar/sdk/Radar$RadarPlacesProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 92
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "places_provider"

    .line 49
    sget-object v2, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    if-ne p1, v2, :cond_0

    const-string p1, "facebook"

    goto :goto_0

    :cond_0
    const-string p1, "none"

    .line 47
    :goto_0
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 94
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setSyncMode$sdk_release(Lio/radar/sdk/Radar$RadarTrackingSync;)V
    .locals 2
    .param p1    # Lio/radar/sdk/Radar$RadarTrackingSync;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 112
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 113
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sync_mode"

    .line 79
    invoke-virtual {p1}, Lio/radar/sdk/Radar$RadarTrackingSync;->getMode$sdk_release()I

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 114
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setUpdateInterval$sdk_release(J)V
    .locals 2

    .line 40
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 88
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "update_interval"

    .line 41
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 90
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
