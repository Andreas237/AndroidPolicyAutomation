.class public Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;
.super Ljava/lang/Object;
.source "GoogleAnalyticsTracker.java"

# interfaces
.implements Lcom/ibotta/android/tracking/Tracker;


# instance fields
.field private final appContext:Landroid/content/Context;

.field private ga:Lcom/google/android/gms/analytics/GoogleAnalytics;

.field private tracker:Lcom/google/android/gms/analytics/Tracker;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->appContext:Landroid/content/Context;

    return-void
.end method

.method private sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V
    .locals 0

    if-eqz p3, :cond_0

    .line 105
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 109
    new-instance v0, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setCategory(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setAction(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object p1

    if-eqz p3, :cond_0

    .line 112
    invoke-virtual {p1, p3}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setLabel(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object p1

    .line 115
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->build()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public event(Ljava/lang/String;)V
    .locals 3

    const-string v0, "event: %1$s"

    const/4 v1, 0x1

    .line 66
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "event"

    const/4 v1, 0x0

    .line 67
    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, p1, v1}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public event(Ljava/lang/String;I)V
    .locals 4

    const-string v0, "event: %1$s, label=%2$d"

    const/4 v1, 0x2

    .line 78
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "event"

    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V

    return-void
.end method

.method public event(Ljava/lang/String;J)V
    .locals 4

    const-string v0, "event: %1$s, label=%2$d"

    const/4 v1, 0x2

    .line 84
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "event"

    .line 85
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V

    return-void
.end method

.method public event(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "event: %1$s, label=%2$s"

    const/4 v1, 0x2

    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "event"

    .line 73
    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public init()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->ga:Lcom/google/android/gms/analytics/GoogleAnalytics;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "init"

    const/4 v1, 0x0

    .line 36
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->ga:Lcom/google/android/gms/analytics/GoogleAnalytics;

    if-nez v0, :cond_1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->ga:Lcom/google/android/gms/analytics/GoogleAnalytics;

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    if-nez v0, :cond_2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->ga:Lcom/google/android/gms/analytics/GoogleAnalytics;

    iget-object v1, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->appContext:Landroid/content/Context;

    const v2, 0x7f1102fa

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    :cond_2
    return-void
.end method

.method public locationPreAuth(Ljava/lang/String;Z)V
    .locals 3

    if-eqz p2, :cond_0

    const-string p2, "yes"

    goto :goto_0

    :cond_0
    const-string p2, "no"

    :goto_0
    const-string v0, "locationPreAuth: %1$s, label=%2$s"

    const/4 v1, 0x2

    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "request_pre_authorization_location"

    .line 93
    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public locationRealAuth(Ljava/lang/String;Z)V
    .locals 3

    if-eqz p2, :cond_0

    const-string p2, "yes"

    goto :goto_0

    :cond_0
    const-string p2, "no"

    :goto_0
    const-string v0, "locationRealAuth: %1$s, label=%2$s"

    const/4 v1, 0x2

    .line 99
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "request_real_authorization_location"

    .line 101
    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    if-eqz v0, :cond_0

    const-string v1, "&uid"

    .line 51
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "User ID set before initialization."

    const/4 v0, 0x0

    .line 53
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public view(Ljava/lang/String;)V
    .locals 3

    const-string v0, "view: %1$s"

    const/4 v1, 0x1

    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v0, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;->build()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    return-void
.end method
