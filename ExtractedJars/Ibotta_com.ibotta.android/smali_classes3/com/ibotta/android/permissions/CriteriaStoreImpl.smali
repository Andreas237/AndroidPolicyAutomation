.class Lcom/ibotta/android/permissions/CriteriaStoreImpl;
.super Ljava/lang/Object;
.source "CriteriaStoreImpl.java"

# interfaces
.implements Lcom/ibotta/android/permissions/CriteriaStore;


# static fields
.field private static final KEY_LAST_PHASE_TIME:Ljava/lang/String; = "last_phase_time"

.field private static final KEY_PHASE:Ljava/lang/String; = "phase"

.field private static final KEY_SESSIONS:Ljava/lang/String; = "sessions"

.field private static final PREFS_NAME:Ljava/lang/String; = "default_criteria_store"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/permissions/Permission;)V
    .locals 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->createSharedPreferences(Lcom/ibotta/android/permissions/Permission;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    .line 23
    iget-object p1, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v0, "last_phase_time"

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 25
    iget-object p1, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "last_phase_time"

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method


# virtual methods
.method public addSession()V
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "sessions"

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->getSessions()S

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 70
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public advancePhase()V
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "phase"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->getPhase()S

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    .line 61
    iget-object v1, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "phase"

    .line 62
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 63
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method protected createSharedPreferences(Lcom/ibotta/android/permissions/Permission;)Landroid/content/SharedPreferences;
    .locals 2

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "default_criteria_store_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/android/permissions/Permission;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 90
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method public delete()V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 84
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 85
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public getLastPhaseTime()J
    .locals 4

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "last_phase_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getPhase()S
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "phase"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public getSessions()S
    .locals 3

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "sessions"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public reset()V
    .locals 4

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/permissions/CriteriaStoreImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "sessions"

    const/4 v2, 0x0

    .line 76
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v1, "last_phase_time"

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 78
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
