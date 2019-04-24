.class public Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;
.super Ljava/lang/Object;
.source "AppCacheStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/cache/AppCacheState;
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final APP_CACHE_LOW_SPACE_FREQUENCY:J = 0x240c8400L

.field protected static final KEY_APP_CACHE_LOW_SPACE_FLAG:Ljava/lang/String; = "appCacheLowSpaceFlag"

.field protected static final KEY_APP_CACHE_LOW_SPACE_LAST_NOTICE:Ljava/lang/String; = "appCacheLowSpaceLastNotice"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final cacheDir:Ljava/io/File;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private graphQLSalt:Ljava/lang/String;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/state/GlobalEventManager;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->prefs:Landroid/content/SharedPreferences;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->cacheDir:Ljava/io/File;

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    return-void
.end method


# virtual methods
.method protected calculateFreeSpaceInMB()J
    .locals 7

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->cacheDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v0

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    .line 95
    iget-object v2, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->cacheDir:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getTotalSpace()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 99
    iget-object v4, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->cacheDir:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v4

    long-to-float v4, v4

    long-to-float v2, v2

    div-float/2addr v4, v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v4, v4, v2

    .line 102
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    const-string v3, "App cache space remaining: %1$f, %2$d MB"

    const/4 v4, 0x2

    .line 103
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v4, v5

    const/4 v2, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-wide v0
.end method

.method public checkAppCacheSpace()Z
    .locals 6

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->cacheDir:Ljava/io/File;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->calculateFreeSpaceInMB()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-string v0, "App cache directory unavailable."

    .line 74
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v2, 0x0

    .line 77
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getAppCacheLowSpaceThresholdMB()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->setAppCacheLow(Z)V

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->isAppCacheLow()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v2, "App cache space is LOW"

    .line 82
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->shouldShowAppCacheLowNotice()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v1}, Lcom/ibotta/android/state/GlobalEventManager;->onAppCacheLowSpace()V

    :cond_3
    return v0
.end method

.method protected getAppCacheLowLastNotice()J
    .locals 4

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "appCacheLowSpaceLastNotice"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-object v0
.end method

.method public getCacheDir()Ljava/io/File;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->cacheDir:Ljava/io/File;

    return-object v0
.end method

.method protected getCurrentTime()J
    .locals 2

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    return-object v0
.end method

.method public getGraphQLSalt()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->graphQLSalt:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 133
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->graphQLSalt:Ljava/lang/String;

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->graphQLSalt:Ljava/lang/String;

    return-object v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public invalidateGraphQLSalt()V
    .locals 1

    const/4 v0, 0x0

    .line 140
    iput-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->graphQLSalt:Ljava/lang/String;

    return-void
.end method

.method public isAppCacheLow()Z
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "appCacheLowSpaceFlag"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public onAppConfigChanged()V
    .locals 0

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->checkAppCacheSpace()Z

    return-void
.end method

.method protected setAppCacheLow(Z)V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "appCacheLowSpaceFlag"

    .line 110
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 111
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setAppCacheLowLastNoticeSeen()V
    .locals 4

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "appCacheLowSpaceLastNotice"

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->getCurrentTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 64
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method protected shouldShowAppCacheLowNotice()Z
    .locals 7

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->getAppCacheLowLastNotice()J

    move-result-wide v0

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->getCurrentTime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/32 v4, 0x240c8400

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 118
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;->isAppCacheLow()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
