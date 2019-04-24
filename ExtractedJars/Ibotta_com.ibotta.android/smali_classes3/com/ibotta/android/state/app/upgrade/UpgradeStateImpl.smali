.class public Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;
.super Ljava/lang/Object;
.source "UpgradeStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/upgrade/UpgradeState;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_LAST_UPGRADE_CHECK:Ljava/lang/String; = "last_upgrade_check"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public ackUpgradeCheck()V
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_upgrade_check"

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->getCurrentTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 36
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method protected getCurrentTime()J
    .locals 2

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLastUpgradeCheck()J
    .locals 4

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "last_upgrade_check"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->resetLastUpgradeCheck()V

    return-void
.end method

.method public resetLastUpgradeCheck()V
    .locals 4

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_upgrade_check"

    const-wide/16 v2, 0x0

    .line 42
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 43
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
