.class Lio/branch/referral/TrackingController;
.super Ljava/lang/Object;
.source "TrackingController.java"


# instance fields
.field private trackingDisabled:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lio/branch/referral/TrackingController;->trackingDisabled:Z

    .line 20
    invoke-virtual {p0, p1}, Lio/branch/referral/TrackingController;->updateTrackingState(Landroid/content/Context;)V

    return-void
.end method

.method private onTrackingDisabled(Landroid/content/Context;)V
    .locals 2

    .line 45
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->clearPendingRequests()V

    .line 48
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lio/branch/referral/PrefHelper;->clearBranchAnalyticsData()V

    const-string v0, "bnc_no_value"

    .line 50
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setSessionID(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 51
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setLinkClickID(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 52
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setLinkClickIdentifier(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 53
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setAppLink(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 54
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setInstallReferrerParams(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 55
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setGooglePlayReferrer(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 56
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setGoogleSearchInstallIdentifier(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 57
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setExternalIntentUri(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 58
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setExternalIntentExtra(Ljava/lang/String;)V

    const-string v0, "bnc_no_value"

    .line 59
    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    .line 60
    invoke-virtual {p1, v0, v1}, Lio/branch/referral/PrefHelper;->saveLastStrongMatchTime(J)V

    return-void
.end method

.method private onTrackingEnabled()V
    .locals 1

    .line 64
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->registerAppReInit()V

    :cond_0
    return-void
.end method


# virtual methods
.method disableTracking(Landroid/content/Context;Z)V
    .locals 1

    .line 24
    iget-boolean v0, p0, Lio/branch/referral/TrackingController;->trackingDisabled:Z

    if-eq v0, p2, :cond_1

    .line 25
    iput-boolean p2, p0, Lio/branch/referral/TrackingController;->trackingDisabled:Z

    if-eqz p2, :cond_0

    .line 27
    invoke-direct {p0, p1}, Lio/branch/referral/TrackingController;->onTrackingDisabled(Landroid/content/Context;)V

    goto :goto_0

    .line 29
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/TrackingController;->onTrackingEnabled()V

    .line 31
    :goto_0
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    const-string v0, "bnc_tracking_state"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lio/branch/referral/PrefHelper;->setBool(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_1
    return-void
.end method

.method isTrackingDisabled()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lio/branch/referral/TrackingController;->trackingDisabled:Z

    return v0
.end method

.method updateTrackingState(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    const-string v0, "bnc_tracking_state"

    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->getBool(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lio/branch/referral/TrackingController;->trackingDisabled:Z

    return-void
.end method
