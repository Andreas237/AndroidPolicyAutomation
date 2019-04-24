.class public Lcom/ibotta/android/LocalBroadcast;
.super Ljava/lang/Object;
.source "LocalBroadcast.java"


# static fields
.field public static final BROADCAST_LOCAL:Ljava/lang/String; = "com.ibotta.android.LOCAL"

.field private static final KEY_CLEAR_ALL:Ljava/lang/String; = "clear_all"

.field private static final KEY_CLEAR_NON_ROOTS:Ljava/lang/String; = "clear_non_roots"

.field private static final KEY_DEBUG_LOADING:Ljava/lang/String; = "debug_loading"

.field public static final KEY_DEBUG_LOADING_JOBS:Ljava/lang/String; = "debug_loading_jobs"

.field private static final KEY_LOGOUT:Ljava/lang/String; = "logout"

.field private static final KEY_NOTIFICATION_COUNT:Ljava/lang/String; = "notification_count"

.field private static final KEY_REBATE_UNLOCKED:Ljava/lang/String; = "rebate_unlocked"

.field private static final KEY_REFRESH_DATA:Ljava/lang/String; = "refresh_data"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static broadcast(Landroid/content/Intent;)V
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void
.end method

.method public static broadcastClearAll()V
    .locals 3

    .line 39
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "clear_all"

    const/4 v2, 0x1

    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 41
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static broadcastClearNonRoots()V
    .locals 3

    .line 33
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "clear_non_roots"

    const/4 v2, 0x1

    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 35
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static broadcastDebugLoading([Ljava/lang/String;)V
    .locals 3

    .line 57
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "debug_loading"

    const/4 v2, 0x1

    .line 58
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "debug_loading_jobs"

    .line 59
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static broadcastLogout()V
    .locals 3

    .line 27
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "logout"

    const/4 v2, 0x1

    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 29
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static broadcastNotificationCount()V
    .locals 3

    .line 45
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "notification_count"

    const/4 v2, 0x1

    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 47
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static broadcastRebateUnlocked()V
    .locals 3

    .line 51
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "rebate_unlocked"

    const/4 v2, 0x1

    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 53
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static broadcastRefreshData()V
    .locals 3

    .line 63
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.ibotta.android.LOCAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "refresh_data"

    const/4 v2, 0x1

    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 65
    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static isClearAll(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "clear_all"

    .line 101
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isClearNonRoots(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "clear_non_roots"

    .line 81
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isDebugLoading(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "debug_loading"

    .line 117
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isLogout(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "logout"

    .line 73
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isNotificationCount(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "notification_count"

    .line 93
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isRebateUnlocked(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "rebate_unlocked"

    .line 109
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isRefreshData(Landroid/content/Intent;)Z
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "refresh_data"

    .line 85
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
