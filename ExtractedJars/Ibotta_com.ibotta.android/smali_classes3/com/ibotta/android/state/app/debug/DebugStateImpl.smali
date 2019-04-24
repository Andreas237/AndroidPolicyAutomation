.class public Lcom/ibotta/android/state/app/debug/DebugStateImpl;
.super Ljava/lang/Object;
.source "DebugStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/debug/DebugState;


# static fields
.field private static final DEFAULT_HOSTNAME:Ljava/lang/String; = "api.ibotta.com"

.field private static final KEY_COLUMNS:Ljava/lang/String; = "number_of_columns"

.field private static final KEY_HOSTNAME:Ljava/lang/String; = "hostname"

.field private static final KEY_IGNORE_UPDATES:Ljava/lang/String; = "ignore_updates"

.field private static final KEY_SHOW_IMAGE_TRANSPARENCY:Ljava/lang/String; = "show_image_transparency"

.field private static final KEY_SHOW_OFFER_ID_SPOTLIGHT:Ljava/lang/String; = "show_offer_id_spotlight"

.field private static final KEY_TMONITOR:Ljava/lang/String; = "tmonitor"

.field private static final KEY_USE_DEBUG_API:Ljava/lang/String; = "use_debug_api"

.field private static final KEY_USE_RADAR_TEST_API:Ljava/lang/String; = "use_radar_test"

.field private static final KEY_USE_RADAR_TEST_NOTIF:Ljava/lang/String; = "use_radar_test_notif"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public getColumns()Lcom/ibotta/android/profile/GalleryColumns;
    .locals 2

    .line 81
    sget-object v0, Lcom/ibotta/android/profile/GalleryColumns;->Companion:Lcom/ibotta/android/profile/GalleryColumns$Companion;

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->getColumnsSelection()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/profile/GalleryColumns$Companion;->fromOrdinal(I)Lcom/ibotta/android/profile/GalleryColumns;

    move-result-object v0

    return-object v0
.end method

.method public getColumnsSelection()I
    .locals 3

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "number_of_columns"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getDebugApiUrl()Ljava/lang/String;
    .locals 2

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->useDebugApi()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://"

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getHostName()Ljava/lang/String;
    .locals 3

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "hostname"

    const-string v2, "api.ibotta.com"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isDebugTMonitorClientOn()Z
    .locals 3

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "tmonitor"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isIgnoreUpdates()Z
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "ignore_updates"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isRadarTestNotificationsOn()Z
    .locals 3

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "use_radar_test_notif"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isShowImageTransparency()Z
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "show_image_transparency"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isShowOfferIdInSpotlight()Z
    .locals 3

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "show_offer_id_spotlight"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public saveColumnsSelectionPrefs(I)V
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "number_of_columns"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveDefaultHostNamePref()V
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hostname"

    const-string v2, "api.ibotta.com"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveHostnamePref(Ljava/lang/String;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hostname"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveIsIgnoreUpdatesPref(Z)V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ignore_updates"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveIsRadarTestNotificationsOn(Z)V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "use_radar_test_notif"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveIsTMonitoringOnPref(Z)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "tmonitor"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveShowImageTransparency(Z)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "show_image_transparency"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveShowOfferIdInSpotlight(Z)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "show_offer_id_spotlight"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveUseDebugApiPref(Z)V
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "use_debug_api"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveUseRadarTestApi(Z)V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "use_radar_test"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public useDebugApi()Z
    .locals 3

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "use_debug_api"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public useRadarTestApi()Z
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "use_radar_test"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
