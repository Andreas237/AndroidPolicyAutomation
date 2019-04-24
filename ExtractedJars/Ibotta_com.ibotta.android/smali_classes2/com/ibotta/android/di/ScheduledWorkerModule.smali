.class public abstract Lcom/ibotta/android/di/ScheduledWorkerModule;
.super Ljava/lang/Object;
.source "ScheduledWorkerModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final SCHEDULED_WORK_RECEIVER_KEY:Ljava/lang/String; = "scheduled_work"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideFavoriteRetailerSettingsFlushWorker(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 11
    .param p3    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 52
    new-instance v10, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V

    return-object v10
.end method

.method public static provideScheduledWorkReceiverPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SharedPrefsScheduledWorkReceiver"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "scheduled_work"

    const/4 v1, 0x0

    .line 38
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static provideScheduledWorkers(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/util/Set;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ")",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 114
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 115
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static provideTrackingFlushWorker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
    .locals 8
    .param p2    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 74
    new-instance v7, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)V

    return-object v7
.end method
