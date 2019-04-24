.class public Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "AppsFlyerLifecycleTracker.java"

# interfaces
.implements Lcom/appsflyer/AppsFlyerConversionListener;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field public static final KEY_APPS_FLYER_DEEP_LINK:Ljava/lang/String; = "af_dp"

.field public static final KEY_APPS_FLYER_IS_FIRST_LAUNCH:Ljava/lang/String; = "is_first_launch"


# instance fields
.field private final app:Lcom/ibotta/android/App;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->app:Lcom/ibotta/android/App;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    return-void
.end method


# virtual methods
.method public init()V
    .locals 3

    .line 49
    invoke-super {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->init()V

    .line 52
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->APPS_FLYER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v1, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    .line 53
    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v1

    .line 52
    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/AppsFlyerLib;->init(Ljava/lang/String;Lcom/appsflyer/AppsFlyerConversionListener;)Lcom/appsflyer/AppsFlyerLib;

    .line 54
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->app:Lcom/ibotta/android/App;

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->startTracking(Landroid/app/Application;)V

    .line 55
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->isDebugAppsFlyer()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setDebugLog(Z)V

    return-void
.end method

.method public onAppOpenAttribution(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const-string v0, "link"

    .line 92
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "onAppOpenAttribution: url=%1$s"

    const/4 v1, 0x1

    .line 93
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.ibotta.android.APPS_FLYER_DEEP_LINK"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "link"

    .line 97
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->app:Lcom/ibotta/android/App;

    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    const-string p1, "Broadcast Sent: %1$s"

    .line 99
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v3

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onAttributionFailure(Ljava/lang/String;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    return-void
.end method

.method public onInstallConversionDataLoaded(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const-string v0, "af_dp"

    .line 76
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "is_first_launch"

    .line 77
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 81
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;->setDeepLink(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onInstallConversionFailure(Ljava/lang/String;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    return-void
.end method

.method public trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 60
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    const-string p2, "Setting customer ID on AppsFlyer SDK"

    const/4 v0, 0x0

    .line 62
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p2

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;->getCustomerIdAsString(Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/appsflyer/AppsFlyerLib;->setCustomerUserId(Ljava/lang/String;)V

    return-void
.end method

.method public trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 68
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "Tracking open referrer with AppsFlyer SDK"

    const/4 v1, 0x0

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->sendDeepLinkData(Landroid/app/Activity;)V

    return-void
.end method
