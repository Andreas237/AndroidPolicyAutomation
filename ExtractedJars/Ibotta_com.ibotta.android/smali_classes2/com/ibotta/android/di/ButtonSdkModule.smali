.class public abstract Lcom/ibotta/android/di/ButtonSdkModule;
.super Ljava/lang/Object;
.source "ButtonSdkModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideButtonSdkCacheRemover(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;)V

    return-object v0
.end method

.method public static provideButtonSdkManager(Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
    .locals 12
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 55
    new-instance v11, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;-><init>(Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    return-object v11
.end method

.method public static provideButtonSdkStorage(Lcom/ibotta/android/App;)Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "button_sdk_manager"

    const/4 v1, 0x0

    .line 38
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 40
    new-instance v0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-direct {v0, p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method
