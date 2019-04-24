.class public abstract Lcom/ibotta/android/di/StateModule;
.super Ljava/lang/Object;
.source "StateModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final BREADCRUMBS_PREFS_FILENAME:Ljava/lang/String; = "breadcrumbs_prefs"

.field private static final PREFS_SECURE_FILENAME:Ljava/lang/String; = "app_state_secure"

.field private static final RETAINED_PREFS_FILENAME:Ljava/lang/String; = "retained_prefs"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideAppCacheCallback(Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/state/app/AppCacheCallback;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 300
    new-instance v0, Lcom/ibotta/android/di/StateModule$3;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/StateModule$3;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    return-object v0
.end method

.method public static provideAppCacheState(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/state/GlobalEventManager;)Lcom/ibotta/android/state/app/cache/AppCacheState;
    .locals 1
    .param p1    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation runtime Ljavax/inject/Named;
            value = "AppCacheDirInternal"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 208
    new-instance v0, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/state/app/cache/AppCacheStateImpl;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 209
    invoke-interface {p0, v0}, Lcom/ibotta/android/state/app/config/AppConfig;->addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V

    return-object v0
.end method

.method public static provideAppConfig(Landroid/content/SharedPreferences;Landroid/content/res/Resources;Lcom/ibotta/android/state/app/config/ConfigParserHolder;)Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 218
    new-instance v0, Lcom/ibotta/android/state/app/config/AppConfigImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/state/app/config/AppConfigImpl;-><init>(Landroid/content/SharedPreferences;Landroid/content/res/Resources;Lcom/ibotta/android/state/app/config/ConfigParserHolder;)V

    return-object v0
.end method

.method public static provideAppStateRetainedSharedPreferences(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SharedPrefsAppStateRetained"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "retained_prefs"

    const/4 v1, 0x0

    .line 321
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static provideBreadcrumbSharedPreferences(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SharedPrefsBreadcrumbs"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "breadcrumbs_prefs"

    const/4 v1, 0x0

    .line 334
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static provideBreadcrumbStorage(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;
    .locals 4
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsBreadcrumbs"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 316
    new-instance v0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;

    sget-object v1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorageImpl;-><init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V

    return-object v0
.end method

.method public static provideConfigParserHolder(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ConfigParserHolder;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 229
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideEmailState(Lcom/ibotta/android/state/secure/SecureState;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/email/EmailState;
    .locals 1
    .param p0    # Lcom/ibotta/android/state/secure/SecureState;
        .annotation runtime Ljavax/inject/Named;
            value = "SecureStateAppState"
        .end annotation
    .end param
    .param p1    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 197
    new-instance v0, Lcom/ibotta/android/state/app/email/EmailStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/email/EmailStateImpl;-><init>(Lcom/ibotta/android/state/secure/SecureState;)V

    .line 198
    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/email/EmailState;->migrateSecureData(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideFcmState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/fcm/FcmState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 144
    new-instance v0, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/fcm/FcmStateImpl;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideFcmTokenManager(Landroid/content/Context;Lcom/google/firebase/iid/FirebaseInstanceId;Landroid/os/Handler;)Lcom/ibotta/android/async/device/FcmTokenManager;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .param p2    # Landroid/os/Handler;
        .annotation runtime Ljavax/inject/Named;
            value = "background_handler"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const v0, 0x7f11010e

    .line 152
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 153
    new-instance v0, Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-direct {v0, p1, p0, p2}, Lcom/ibotta/android/async/device/FcmTokenManager;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Landroid/os/Handler;)V

    return-object v0
.end method

.method public static provideFeatureFlagResponseUtil(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/features/FeatureFlagResponseUtil;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 223
    new-instance v0, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method

.method public static provideGoogleState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/google/GoogleState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 177
    new-instance v0, Lcom/ibotta/android/state/app/google/GoogleStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/google/GoogleStateImpl;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideLogOutListeners(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/api/ClearCookiesLogOutListener;Lcom/ibotta/android/state/pwi/PwiUserState;)Ljava/util/List;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            "Lcom/ibotta/android/verification/VerificationManager;",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            "Lcom/ibotta/android/api/ClearCookiesLogOutListener;",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;"
        }
    .end annotation

    .line 365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 367
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 368
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    invoke-interface {v0, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 374
    invoke-interface {v0, p7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    invoke-interface {v0, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 376
    invoke-interface {v0, p9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 377
    invoke-interface {v0, p10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    invoke-interface {v0, p11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    invoke-interface {v0, p12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static provideLogOutManager(Lcom/ibotta/android/state/user/auth/AuthManager;Ljava/util/List;)Lcom/ibotta/android/state/user/LogOutManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;)",
            "Lcom/ibotta/android/state/user/LogOutManager;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 339
    new-instance v0, Lcom/ibotta/android/state/user/LogOutManagerImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/user/LogOutManagerImpl;-><init>(Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 340
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/user/LogOutManagerImpl;->setLogOutListeners(Ljava/util/List;)V

    return-object v0
.end method

.method public static provideOSDeprecationState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/deprecation/OSDeprecationState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 165
    new-instance v0, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/deprecation/OSDeprecationStateImpl;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static providePermissionsState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 171
    new-instance v0, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideSecureState(Landroid/content/Context;)Lcom/ibotta/android/state/secure/SecureState;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SecureStateAppState"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 327
    new-instance v0, Lcom/ibotta/android/state/secure/SecureStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/secure/SecureStateImpl;-><init>(Landroid/content/Context;)V

    const-string p0, "app_state_secure"

    .line 328
    invoke-interface {v0, p0}, Lcom/ibotta/android/state/secure/SecureState;->init(Ljava/lang/String;)Z

    return-object v0
.end method

.method public static provideServerUpgradeState(Landroid/content/SharedPreferences;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;Lcom/ibotta/android/util/AppSemver;)Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 187
    new-instance v0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;

    .line 188
    invoke-interface {p2}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionCode()I

    move-result p2

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;-><init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/state/app/config/AppConfig;ILcom/ibotta/android/util/AppSemver;)V

    .line 189
    invoke-interface {p3, v0}, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;->addAppUpgradeListener(Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;)V

    return-object v0
.end method

.method static provideSessionState(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/state/session/SessionState;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 346
    new-instance v0, Lcom/ibotta/android/state/session/SessionStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/session/SessionStateImpl;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideUpgradeChecker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/async/upgrade/UpgradeChecker;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 135
    new-instance v0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;-><init>(Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 137
    invoke-interface {p0, v0}, Lcom/ibotta/android/state/app/config/AppConfig;->addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V

    return-object v0
.end method

.method public static provideUpgradeState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/upgrade/UpgradeState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 159
    new-instance v0, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/upgrade/UpgradeStateImpl;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideUserState(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/state/user/UserState;
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 106
    new-instance v6, Lcom/ibotta/android/state/user/UserStateImpl;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/state/user/UserStateImpl;-><init>(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;)V

    .line 108
    invoke-interface {p5, v6}, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;->addAppUpgradeListener(Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;)V

    .line 112
    new-instance p0, Lcom/ibotta/android/di/StateModule$1;

    invoke-direct {p0, v6}, Lcom/ibotta/android/di/StateModule$1;-><init>(Lcom/ibotta/android/state/user/UserStateImpl;)V

    invoke-interface {p6, p0}, Lcom/ibotta/android/location/LocationStatusDispatcher;->addListener(Lcom/ibotta/android/location/LocationStatusListener;)V

    return-object v6
.end method

.method public static provideUserStateAppCallback(Lcom/ibotta/android/state/app/AppCacheCallback;Landroid/content/Context;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/state/app/UserStateAppCallback;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 239
    new-instance v0, Lcom/ibotta/android/di/StateModule$2;

    invoke-direct {v0, p0, p2, p3, p1}, Lcom/ibotta/android/di/StateModule$2;-><init>(Lcom/ibotta/android/state/app/AppCacheCallback;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;Landroid/content/Context;)V

    return-object v0
.end method
