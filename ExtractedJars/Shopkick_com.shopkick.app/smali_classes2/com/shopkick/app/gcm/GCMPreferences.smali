.class public Lcom/shopkick/app/gcm/GCMPreferences;
.super Ljava/lang/Object;
.source "GCMPreferences.java"


# static fields
.field private static final GCM_LAST_PUSH_MESSAGE:Ljava/lang/String; = "gcm.last_message"

.field private static final GCM_SOUND_ENABLED:Ljava/lang/String; = "gcm.sound"

.field private static final GCM_VIBRATE_ENABLED:Ljava/lang/String; = "gcm.vibrate"

.field private static final PREFERENES_NAME:Ljava/lang/String; = "com.shopkick.gcm.preferences"


# instance fields
.field private sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.shopkick.gcm.preferences"

    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public getLastPushMessageJSON()Ljava/lang/String;
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "gcm.last_message"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isSoundEnabled()Z
    .locals 3

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "gcm.sound"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isVibrateEnabled()Z
    .locals 3

    .line 19
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "gcm.vibrate"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public setLastPushMessageJSON(Ljava/lang/String;)V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "gcm.last_message"

    .line 40
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 41
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setSoundEnabled(Z)V
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "gcm.sound"

    .line 34
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 35
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setVibrateEnabled(Z)V
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "gcm.vibrate"

    .line 24
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
