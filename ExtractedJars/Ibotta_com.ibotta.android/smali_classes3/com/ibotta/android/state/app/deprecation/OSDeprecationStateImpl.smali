.class public Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;
.super Ljava/lang/Object;
.source "OSDeprecationStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/deprecation/OSDeprecationState;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_LAST_OS_DEPRECATION_DIALOG:Ljava/lang/String; = "last_os_deprecation_dialog"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method protected getCurrentTime()J
    .locals 2

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLastOSDeprecationDialog()J
    .locals 4

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "last_os_deprecation_dialog"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public saveOSDeprecationDisplayedTime()V
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_os_deprecation_dialog"

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;->getCurrentTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 36
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
