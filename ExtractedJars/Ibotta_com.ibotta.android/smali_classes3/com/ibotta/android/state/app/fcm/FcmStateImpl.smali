.class public Lcom/ibotta/android/state/app/fcm/FcmStateImpl;
.super Ljava/lang/Object;
.source "FcmStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/fcm/FcmState;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field public static final KEY_PUSH_CACHE_CLEARING_FLAGS:Ljava/lang/String; = "push_cache_clearing_flags"

.field public static final KEY_PUSH_MSG_ID:Ljava/lang/String; = "push_msg_id"

.field public static final KEY_SETTING_ALERT_LIGHT:Ljava/lang/String; = "setting_alert_light"

.field public static final KEY_SETTING_ALERT_SOUND:Ljava/lang/String; = "setting_alert_sound"

.field public static final KEY_SETTING_ALERT_VIBRATE:Ljava/lang/String; = "setting_alert_vibrate"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public addPushCacheClearingFlags(I)V
    .locals 4

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->getPushCacheClearingFlags()I

    move-result v0

    or-int/2addr v0, p1

    const-string v1, "Writing cache clearing flags: %1$d"

    const/4 v2, 0x1

    .line 70
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object p1, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "push_cache_clearing_flags"

    .line 72
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 73
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public clearPushCacheClearingFlags()V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "push_cache_clearing_flags"

    .line 84
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 85
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public getNextPushMessageId()I
    .locals 5

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "push_msg_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 92
    iget-object v3, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "push_msg_id"

    .line 93
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 94
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v3, "Next Push Message ID: %1$d"

    .line 95
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v3, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method public getPushCacheClearingFlags()I
    .locals 3

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "push_cache_clearing_flags"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public isAlertLight()Z
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "setting_alert_light"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isAlertSound()Z
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "setting_alert_sound"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isAlertVibrate()Z
    .locals 3

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "setting_alert_vibrate"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public setAlertLight(Z)V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "setting_alert_light"

    .line 62
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 63
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setAlertSound(Z)V
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "setting_alert_sound"

    .line 38
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 39
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setAlertVibrate(Z)V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "setting_alert_vibrate"

    .line 50
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 51
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
