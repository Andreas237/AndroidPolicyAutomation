.class public final Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;
.super Ljava/lang/Object;
.source "GeofenceConfigHelper.kt"

# interfaces
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGeofenceConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeofenceConfigHelper.kt\ncom/ibotta/android/location/geofence/GeofenceConfigHelper\n*L\n1#1,78:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\u000e0\u000eH\u0002J\u0008\u0010\u0016\u001a\u00020\u0010H\u0002J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
        "Lcom/ibotta/android/state/app/config/AppConfigListener;",
        "appContext",
        "Landroid/content/Context;",
        "appConfig",
        "Lcom/ibotta/android/state/app/config/AppConfig;",
        "(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)V",
        "config",
        "Lcom/ibotta/android/location/geofence/Config;",
        "getConfig",
        "()Lcom/ibotta/android/location/geofence/Config;",
        "configRef",
        "Ljava/lang/ref/WeakReference;",
        "json",
        "Lcom/ibotta/android/json/IbottaJson;",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "getPrefs",
        "()Landroid/content/SharedPreferences;",
        "prefsRef",
        "getJson",
        "kotlin.jvm.PlatformType",
        "getPrefsHelper",
        "onAppConfigChanged",
        "",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appContext:Landroid/content/Context;

.field private configRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/ibotta/android/location/geofence/Config;",
            ">;"
        }
    .end annotation
.end field

.field private json:Lcom/ibotta/android/json/IbottaJson;

.field private prefsRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/state/app/config/AppConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->appContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private final getJson()Lcom/ibotta/android/json/IbottaJson;
    .locals 3

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->json:Lcom/ibotta/android/json/IbottaJson;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final getPrefsHelper()Landroid/content/SharedPreferences;
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->appContext:Landroid/content/Context;

    const-string v1, "geofence_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "appContext.getSharedPref\u2026ME, Context.MODE_PRIVATE)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->prefsRef:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public final getConfig()Lcom/ibotta/android/location/geofence/Config;
    .locals 17
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    .line 30
    iget-object v1, v0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->configRef:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/location/geofence/Config;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    .line 34
    invoke-virtual/range {p0 .. p0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v3, "config"

    .line 36
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 38
    sget-object v2, Lcom/ibotta/android/util/JsonHelper;->INSTANCE:Lcom/ibotta/android/util/JsonHelper;

    invoke-direct/range {p0 .. p0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v3

    const-class v4, Lcom/ibotta/android/location/geofence/Config;

    invoke-virtual {v2, v3, v1, v4}, Lcom/ibotta/android/util/JsonHelper;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ibotta/android/location/geofence/Config;

    :cond_1
    move-object v1, v2

    if-eqz v1, :cond_2

    .line 40
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->configRef:Ljava/lang/ref/WeakReference;

    :cond_2
    if-nez v1, :cond_3

    .line 45
    new-instance v1, Lcom/ibotta/android/location/geofence/Config;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-string v13, "12:00 AM"

    const-string v14, "11:59 PM"

    const/16 v15, 0x1ff

    const/16 v16, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v16}, Lcom/ibotta/android/location/geofence/Config;-><init>(ZZIIIIIIJLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->configRef:Ljava/lang/ref/WeakReference;

    :cond_3
    return-object v1
.end method

.method public final getPrefs()Landroid/content/SharedPreferences;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->prefsRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->getPrefsHelper()Landroid/content/SharedPreferences;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public onAppConfigChanged()V
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getGeofenceConfig()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 58
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-nez v0, :cond_0

    const-string v0, "config"

    .line 61
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    const-string v2, "config"

    .line 63
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 65
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x0

    .line 68
    check-cast v0, Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->configRef:Ljava/lang/ref/WeakReference;

    return-void
.end method
