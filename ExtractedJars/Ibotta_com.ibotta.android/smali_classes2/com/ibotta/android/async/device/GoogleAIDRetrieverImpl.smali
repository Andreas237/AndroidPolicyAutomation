.class public Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;
.super Ljava/lang/Object;
.source "GoogleAIDRetrieverImpl.java"

# interfaces
.implements Lcom/ibotta/android/async/device/GoogleAIDRetriever;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field protected googleAID:Ljava/lang/String;

.field private final googleState:Lcom/ibotta/android/state/app/google/GoogleState;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleState:Lcom/ibotta/android/state/app/google/GoogleState;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method


# virtual methods
.method protected fetchGoogleAID()Ljava/lang/String;
    .locals 4

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->getAdInfo()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleState:Lcom/ibotta/android/state/app/google/GoogleState;

    iget-object v1, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/google/GoogleState;->setGoogleAID(Ljava/lang/String;)V

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleState:Lcom/ibotta/android/state/app/google/GoogleState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/google/GoogleState;->getGoogleAID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->setApiContextDevicePublicId(Ljava/lang/String;)V

    const-string v0, "Google AID: %1$s"

    const/4 v1, 0x1

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    return-object v0
.end method

.method protected getAdInfo()Ljava/lang/String;
    .locals 3

    .line 80
    :try_start_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to capture Google AID."

    const/4 v2, 0x0

    .line 83
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->trackException(Ljava/lang/Exception;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getGoogleAID()Ljava/lang/String;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->isGooglePlayServicesAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googlePlayServicesUnavailable()V

    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleAID:Ljava/lang/String;

    return-object v0

    .line 52
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->fetchGoogleAID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGoogleState()Lcom/ibotta/android/state/app/google/GoogleState;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->googleState:Lcom/ibotta/android/state/app/google/GoogleState;

    return-object v0
.end method

.method protected googlePlayServicesUnavailable()V
    .locals 2

    const-string v0, "Google Play Services is not available. Skipping FCM initialization."

    const/4 v1, 0x0

    .line 56
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "gcm_unavailable"

    .line 57
    invoke-virtual {p0, v0}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->track(Ljava/lang/String;)V

    return-void
.end method

.method protected isGooglePlayServicesAvailable()Z
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->isGooglePlayServicesAvailable()Z

    move-result v0

    return v0
.end method

.method protected setApiContextDevicePublicId(Ljava/lang/String;)V
    .locals 1

    .line 91
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0, p1}, Lcom/ibotta/api/ApiContext;->setDevicePublicId(Ljava/lang/String;)V

    return-void
.end method

.method protected track(Ljava/lang/String;)V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "fcm_registration"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected trackException(Ljava/lang/Exception;)V
    .locals 1

    .line 99
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method
