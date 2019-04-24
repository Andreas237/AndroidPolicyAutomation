.class public Lcom/ibotta/android/state/user/UserStateImpl;
.super Ljava/lang/Object;
.source "UserStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;
.implements Lcom/ibotta/android/state/user/UserState;
.implements Lcom/ibotta/api/AppCacheListener;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field public static final KEY_AUTH_REFRESH_TOKEN:Ljava/lang/String; = "auth_refresh_token"

.field public static final KEY_AUTH_TOKEN:Ljava/lang/String; = "auth_token"

.field public static final KEY_AUTH_TOKEN_EXPIRATION:Ljava/lang/String; = "auth_token_expiration"

.field public static final KEY_CUSTOMER_ELIGIBLE_FOR_PERSONALIZATION:Ljava/lang/String; = "customer_eligible_for_personalization"

.field public static final KEY_CUSTOMER_ID:Ljava/lang/String; = "customer_id"

.field public static final KEY_CUSTOMER_LAT:Ljava/lang/String; = "customer_lat"

.field public static final KEY_CUSTOMER_LAT_LONG_TIME:Ljava/lang/String; = "customer_lat_long_time"

.field public static final KEY_CUSTOMER_LONG:Ljava/lang/String; = "customer_long"

.field public static final KEY_CUSTOMER_NOTIFICATION_COUNT:Ljava/lang/String; = "customer_notification_count"

.field public static final KEY_CUSTOMER_TEST_ROLES:Ljava/lang/String; = "customer_test_roles"

.field public static final KEY_CUSTOMER_ZIP:Ljava/lang/String; = "customer_zip"

.field public static final KEY_FB_ID:Ljava/lang/String; = "fb_id"

.field public static final KEY_GEOFENCE_SETTING:Ljava/lang/String; = "geofence_setting"

.field public static final KEY_HIDE_RATE_APP:Ljava/lang/String; = "hide_rate_app"

.field public static final KEY_LAST_DEVICE_REGISTRATION_HASH:Ljava/lang/String; = "last_device_registration_hash"

.field public static final KEY_LAUNCH_COUNT:Ljava/lang/String; = "launch_count"

.field public static final KEY_LIFETIME_EARNINGS:Ljava/lang/String; = "lifetime_earnings"

.field public static final KEY_PENDING_WELCOME_BONUS_DIALOG:Ljava/lang/String; = "pending_welcome_bonus_dialog"

.field public static final KEY_RATE_APP_DATE:Ljava/lang/String; = "rate_app_date"

.field public static final KEY_VERIFIED_DEVICE_REFERENCE_ID:Ljava/lang/String; = "verified_device_reference_id"

.field private static final PREFS_SECURE_FILENAME:Ljava/lang/String; = "user_state_secure"

.field private static final ROLE_IBOTTA_EMPLOYEE_TESTER:Ljava/lang/String; = "Ibotta_Employee_Tester"


# instance fields
.field private final appboy:Lcom/appboy/Appboy;

.field private final context:Landroid/content/Context;

.field private facebookInfo:Lcom/ibotta/android/state/social/FacebookInfo;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private googleSignInInfo:Lcom/ibotta/android/state/social/GoogleSignInInfo;

.field private newUser:Z

.field private prefs:Landroid/content/SharedPreferences;

.field private secureState:Lcom/ibotta/android/state/secure/SecureState;

.field private final storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

.field private final userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->context:Landroid/content/Context;

    .line 98
    iput-object p2, p0, Lcom/ibotta/android/state/user/UserStateImpl;->appboy:Lcom/appboy/Appboy;

    .line 99
    iput-object p3, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    .line 100
    iput-object p4, p0, Lcom/ibotta/android/state/user/UserStateImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    .line 101
    iput-object p5, p0, Lcom/ibotta/android/state/user/UserStateImpl;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    return-void
.end method

.method private migrateSecureData()V
    .locals 7

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "auth_token"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 139
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v3, "auth_token"

    iget-object v4, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v5, "auth_token"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "auth_token"

    .line 140
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 142
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "customer_id"

    invoke-interface {v1, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v3, "customer_id"

    iget-object v4, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v5, "customer_id"

    const/4 v6, 0x0

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-interface {v1, v3, v4}, Lcom/ibotta/android/state/secure/SecureState;->putInt(Ljava/lang/String;I)V

    const-string v1, "customer_id"

    .line 144
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 146
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "fb_id"

    invoke-interface {v1, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v3, "fb_id"

    iget-object v4, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v5, "fb_id"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "fb_id"

    .line 148
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 150
    :cond_2
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private setLifetimeEarnings(F)V
    .locals 2

    .line 548
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "lifetime_earnings"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 549
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->getLifetimeEarnings()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    const-string v1, "lifetime_earnings_increase"

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/UserStateAppCallback;->trackEvent(Ljava/lang/String;)V

    .line 557
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lifetime_earnings"

    .line 558
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 559
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method


# virtual methods
.method public deleteFacebookAuth()V
    .locals 4

    const/4 v0, 0x0

    .line 382
    :try_start_0
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/login/LoginManager;->logOut()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 387
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v2, "fb_id"

    invoke-interface {v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->remove(Ljava/lang/String;)V

    .line 389
    iput-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->facebookInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Failed to delete Facebook auth."

    const/4 v3, 0x0

    .line 384
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 392
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/UserStateAppCallback;->cacheClearCustomerFriends()V

    return-void

    .line 387
    :goto_2
    iget-object v2, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v3, "fb_id"

    invoke-interface {v2, v3}, Lcom/ibotta/android/state/secure/SecureState;->remove(Ljava/lang/String;)V

    .line 389
    iput-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->facebookInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    throw v1
.end method

.method public deleteGoogleSignInAuth()V
    .locals 1

    const/4 v0, 0x0

    .line 397
    iput-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->googleSignInInfo:Lcom/ibotta/android/state/social/GoogleSignInInfo;

    .line 398
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/UserStateAppCallback;->cacheClearCustomerFriends()V

    return-void
.end method

.method public deletePersistedData()V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    invoke-interface {v0}, Lcom/ibotta/android/state/secure/SecureState;->removeAll()V

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    invoke-virtual {v0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->destroyStorageSilos()V

    return-void
.end method

.method public getAuthRefreshToken()Ljava/lang/String;
    .locals 3

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "auth_refresh_token"

    sget-object v2, Lcom/ibotta/android/state/user/auth/ApiAuth;->EMPTY:Lcom/ibotta/android/state/user/auth/ApiAuth;

    invoke-virtual {v2}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthRefreshToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAuthToken()Ljava/lang/String;
    .locals 3

    .line 403
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "auth_token"

    sget-object v2, Lcom/ibotta/android/state/user/auth/ApiAuth;->EMPTY:Lcom/ibotta/android/state/user/auth/ApiAuth;

    invoke-virtual {v2}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAuthTokenExpiration()J
    .locals 4

    .line 423
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "auth_token_expiration"

    sget-object v2, Lcom/ibotta/android/state/user/auth/ApiAuth;->EMPTY:Lcom/ibotta/android/state/user/auth/ApiAuth;

    invoke-virtual {v2}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthTokenExpiration()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/state/secure/SecureState;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getCustomerId()I
    .locals 3

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "customer_id"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getCustomerNotificationCount()I
    .locals 3

    .line 433
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "customer_notification_count"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getCustomerTestRoles()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 459
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "customer_test_roles"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v2

    .line 464
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 465
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 466
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public getCustomerZip()Ljava/lang/String;
    .locals 3

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "customer_zip"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFacebookId()Ljava/lang/String;
    .locals 3

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "fb_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFacebookInfo()Lcom/ibotta/android/state/social/FacebookInfo;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->facebookInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    return-object v0
.end method

.method public getGoogleSignInInfo()Lcom/ibotta/android/state/social/GoogleSignInInfo;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->googleSignInInfo:Lcom/ibotta/android/state/social/GoogleSignInInfo;

    return-object v0
.end method

.method public getLastDeviceRegistrationHash()Ljava/lang/String;
    .locals 3

    .line 522
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "last_device_registration_hash"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 7

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "customer_lat"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "customer_lat"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 345
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v4, "customer_long"

    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v4, "customer_long"

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    .line 346
    :goto_1
    iget-object v3, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v4, "customer_lat_long_time"

    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_2

    .line 347
    iget-object v3, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v6, "customer_lat_long_time"

    invoke-interface {v3, v6, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 346
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 350
    new-instance v2, Landroid/location/Location;

    const-string v4, ""

    invoke-direct {v2, v4}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 351
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Landroid/location/Location;->setLatitude(D)V

    .line 352
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    .line 353
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Landroid/location/Location;->setTime(J)V

    :cond_3
    return-object v2
.end method

.method public getLifetimeEarnings()F
    .locals 3

    .line 544
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "lifetime_earnings"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public getPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public getRateAppDate()J
    .locals 4

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "rate_app_date"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 302
    iget-object v2, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "rate_app_date"

    .line 303
    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 304
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-wide v0
.end method

.method public getVerifiedDeviceReferenceId()Ljava/lang/String;
    .locals 3

    .line 539
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "verified_device_reference_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasEmployeeTesterRole()Z
    .locals 2

    .line 579
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->getCustomerTestRoles()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v1, "Ibotta_Employee_Tester"

    .line 584
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasSeenPendingWelcomeBonusDialog()Z
    .locals 3

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "pending_welcome_bonus_dialog"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public incrementLaunchCount()J
    .locals 3

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "launch_count"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 293
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "launch_count"

    .line 294
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 295
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    int-to-long v0, v0

    return-wide v0
.end method

.method public init()V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    .line 107
    new-instance v0, Lcom/ibotta/android/state/secure/SecureStateImpl;

    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ibotta/android/state/secure/SecureStateImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "user_state_secure"

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/secure/SecureState;->init(Ljava/lang/String;)Z

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->migrateSecureData()V

    .line 112
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->getCustomerZip()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/UserLocation;->updateZipCodeAndGeohash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {v0, p0}, Lcom/ibotta/android/state/app/UserStateAppCallback;->addListener(Lcom/ibotta/api/AppCacheListener;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->syncTrackerCustomerId()V

    return-void
.end method

.method public isEligibleForPersonalization()Z
    .locals 3

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "customer_eligible_for_personalization"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->hasEmployeeTesterRole()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public isGeofencingEnabled()Z
    .locals 3

    .line 483
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "geofence_setting"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isHideRateApp()Z
    .locals 3

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "hide_rate_app"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isNewUser()Z
    .locals 2

    .line 569
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-boolean v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->newUser:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public markPendingWelcomeBonusDialogSeen()V
    .locals 3

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pending_welcome_bonus_dialog"

    const/4 v2, 0x1

    .line 316
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 317
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public neverShowRateApp()V
    .locals 3

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hide_rate_app"

    const/4 v2, 0x1

    .line 277
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 278
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public onAppUpgraded(Lcom/ibotta/android/state/app/pojo/UpgradeInfo;)V
    .locals 1

    .line 564
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;->getOldVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;->getNewVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/state/user/UserStateImpl;->onUpgrade(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 589
    iget-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {p1}, Lcom/ibotta/android/state/app/UserStateAppCallback;->clearAllFavoriteRetailerSettings()V

    .line 591
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->syncTrackerCustomerId()V

    return-void
.end method

.method public onSaveCachedResponse(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    .locals 1

    .line 495
    instance-of p1, p2, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    if-eqz p1, :cond_0

    if-nez p3, :cond_0

    .line 496
    check-cast p2, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    invoke-virtual {p2}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 497
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result p2

    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->getCustomerId()I

    move-result p3

    if-ne p2, p3, :cond_0

    .line 498
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getAllNotificationCount()S

    move-result p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/state/user/UserStateImpl;->setCustomerNotificationCount(I)V

    .line 499
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getLifetimeEarnings()F

    move-result p2

    invoke-direct {p0, p2}, Lcom/ibotta/android/state/user/UserStateImpl;->setLifetimeEarnings(F)V

    .line 500
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getSocial()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/state/user/UserStateImpl;->saveFacebookId(Ljava/util/List;)V

    .line 501
    sget-object p2, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {p2}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getZip()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Lcom/ibotta/api/UserLocation;->updateZipCodeAndGeohash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 503
    iget-object p2, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string p3, "customer_zip"

    .line 504
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getZip()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string p3, "customer_eligible_for_personalization"

    .line 505
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->isEligibleForPersonalization50()Z

    move-result p1

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 506
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public onUpgrade(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "onUpgrade: oldVersion=%1$s, newVersion=%2$s"

    const/4 v1, 0x2

    .line 156
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public recordLogin(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/auth/AuthType;)V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/UserStateAppCallback;->geofenceCoordinatorOnLogIn()V

    .line 206
    sget-object v0, Lcom/ibotta/android/state/user/UserStateImpl$1;->$SwitchMap$com$ibotta$api$model$auth$AuthType:[I

    invoke-virtual {p2}, Lcom/ibotta/api/model/auth/AuthType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const-string p2, "email"

    goto :goto_0

    :pswitch_0
    const-string p2, "google"

    goto :goto_0

    :pswitch_1
    const-string p2, "facebook"

    goto :goto_0

    :pswitch_2
    const-string p2, "email"

    .line 221
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    const-string v1, "login"

    invoke-interface {v0, v1, p2}, Lcom/ibotta/android/state/app/UserStateAppCallback;->trackEvent(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    iget-object p2, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/state/app/UserStateAppCallback;->setLastEmailUsed(Ljava/lang/String;)V

    .line 226
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->syncTrackerCustomerId()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public resetRateApp()V
    .locals 4

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "launch_count"

    const/4 v2, 0x0

    .line 284
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v1, "rate_app_date"

    .line 285
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 286
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveFacebookId(Ljava/lang/String;)V
    .locals 2

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "fb_id"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    iget-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {p1}, Lcom/ibotta/android/state/app/UserStateAppCallback;->cacheClearCustomerFriends()V

    return-void
.end method

.method public saveFacebookId(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;)V"
        }
    .end annotation

    .line 369
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/customer/CustomerSocial;

    .line 370
    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/CustomerSocial;->getTypeEnum()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 371
    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/CustomerSocial;->getIdentifier()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 376
    :goto_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/user/UserStateImpl;->saveFacebookId(Ljava/lang/String;)V

    return-void
.end method

.method public setAuthRefreshToken(Ljava/lang/String;)V
    .locals 2

    .line 418
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "auth_refresh_token"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAuthToken(Ljava/lang/String;)V
    .locals 2

    .line 408
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "auth_token"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAuthTokenExpiration(J)V
    .locals 2

    .line 428
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "auth_token_expiration"

    invoke-interface {v0, v1, p1, p2}, Lcom/ibotta/android/state/secure/SecureState;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public setCustomerId(I)V
    .locals 2

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "customer_id"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/state/secure/SecureState;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public setCustomerNotificationCount(I)V
    .locals 2

    .line 438
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "customer_notification_count"

    .line 439
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 440
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 442
    iget-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {p1}, Lcom/ibotta/android/state/GlobalEventManager;->onNotificationsUpdated()V

    return-void
.end method

.method public setCustomerTestRoles(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 447
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 448
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 449
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 452
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "customer_test_roles"

    .line 453
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 454
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setCustomerZip(Ljava/lang/String;)V
    .locals 2

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "customer_zip"

    .line 258
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 259
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 261
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/api/UserLocation;->updateZipCodeAndGeohash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public setEligibleForPersonalization(Z)V
    .locals 2

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "customer_eligible_for_personalization"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setFacebookInfo(Lcom/ibotta/android/state/social/FacebookInfo;)V
    .locals 14

    const-string v0, "setFacebookInfo"

    const/4 v1, 0x0

    .line 166
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    iput-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->facebookInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->appboy:Lcom/appboy/Appboy;

    invoke-virtual {v0}, Lcom/appboy/Appboy;->getCurrentUser()Lcom/appboy/AppboyUser;

    move-result-object v0

    .line 171
    iget-object v2, p0, Lcom/ibotta/android/state/user/UserStateImpl;->facebookInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    if-eqz v2, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 175
    :cond_0
    new-instance v2, Lcom/appboy/models/outgoing/FacebookUser;

    .line 176
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getId()Ljava/lang/String;

    move-result-object v4

    .line 177
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getFirstName()Ljava/lang/String;

    move-result-object v5

    .line 178
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getLastName()Ljava/lang/String;

    move-result-object v6

    .line 179
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getEmail()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 185
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v13

    move-object v3, v2

    invoke-direct/range {v3 .. v13}, Lcom/appboy/models/outgoing/FacebookUser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/appboy/enums/Gender;Ljava/lang/Integer;Ljava/util/Collection;Ljava/lang/String;)V

    .line 186
    invoke-virtual {v0, v2}, Lcom/appboy/AppboyUser;->setFacebookData(Lcom/appboy/models/outgoing/FacebookUser;)Z

    const-string p1, "setFacebookInfor: FacebookUser info sent to Appboy"

    .line 187
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public setGeofencingEnabled(Z)V
    .locals 2

    .line 474
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofence_setting"

    .line 475
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 476
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 478
    iget-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {p1}, Lcom/ibotta/android/state/app/UserStateAppCallback;->geofenceCoordinatorOnSettingChange()V

    return-void
.end method

.method public setGoogleSignInInfo(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->googleSignInInfo:Lcom/ibotta/android/state/social/GoogleSignInInfo;

    return-void
.end method

.method public setLastDeviceRegistrationHash(Ljava/lang/String;)V
    .locals 2

    .line 527
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_device_registration_hash"

    .line 528
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 529
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setLastLocation(Landroid/location/Location;)V
    .locals 5

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "customer_lat_long_time"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "customer_lat_long_time"

    const-wide/16 v3, 0x0

    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 323
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_1
    if-eqz v0, :cond_3

    if-eqz v1, :cond_2

    .line 324
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    .line 327
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "customer_lat"

    .line 328
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "customer_long"

    .line 329
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "customer_lat_long_time"

    .line 330
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 331
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 333
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/GlobalEventManager;->onLocationChanged(Landroid/location/Location;)V

    .line 335
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v0

    .line 336
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 337
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 338
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    .line 335
    invoke-virtual {v0, v1, v2, p1}, Lcom/ibotta/api/UserLocation;->updateLocation(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Ljava/lang/String;

    :cond_4
    return-void
.end method

.method public setNewUser(Z)V
    .locals 0

    .line 574
    iput-boolean p1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->newUser:Z

    return-void
.end method

.method public setVerifiedDeviceReferenceId(Ljava/lang/String;)V
    .locals 2

    .line 534
    iget-object v0, p0, Lcom/ibotta/android/state/user/UserStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "verified_device_reference_id"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected syncTrackerCustomerId()V
    .locals 2

    .line 512
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->getCustomerId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/state/user/UserStateImpl;->getCustomerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 513
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/state/user/UserStateImpl;->userStateAppCallback:Lcom/ibotta/android/state/app/UserStateAppCallback;

    invoke-interface {v1, v0}, Lcom/ibotta/android/state/app/UserStateAppCallback;->setUserIdForTracker(Ljava/lang/String;)V

    return-void
.end method
