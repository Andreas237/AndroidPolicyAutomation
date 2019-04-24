.class public Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;
.super Ljava/lang/Object;
.source "PartnerAppCheckerImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;


# static fields
.field public static final KEY_LAST_PARTNER_APP_CHECK:Ljava/lang/String; = "last_partner_app_check"


# instance fields
.field private final currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final isAuthenticatedUserSupplier:Lcom/ibotta/android/tracking/proprietary/pat/IsAuthenticatedUserSupplier;

.field private final partnerAppDetector:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

.field private final partnerAppTracker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/abstractions/CurrentTimeSupplier;Lcom/ibotta/android/tracking/proprietary/pat/IsAuthenticatedUserSupplier;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->isAuthenticatedUserSupplier:Lcom/ibotta/android/tracking/proprietary/pat/IsAuthenticatedUserSupplier;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->partnerAppDetector:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->partnerAppTracker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->prefs:Landroid/content/SharedPreferences;

    .line 46
    iput-object p6, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method

.method private hasRunToday()Z
    .locals 6

    .line 112
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    invoke-interface {v1}, Lcom/ibotta/android/abstractions/CurrentTimeSupplier;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 115
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 116
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "last_partner_app_check"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v2, 0x1

    .line 118
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-ne v3, v4, :cond_0

    const/4 v3, 0x6

    .line 119
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method private saveCheckDate()V
    .locals 4

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_partner_app_check"

    .line 124
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    invoke-interface {v2}, Lcom/ibotta/android/abstractions/CurrentTimeSupplier;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 125
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private shouldRun(Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->isAuthenticatedUserSupplier:Lcom/ibotta/android/tracking/proprietary/pat/IsAuthenticatedUserSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/pat/IsAuthenticatedUserSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 95
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->hasRunToday()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v3, "User is not logged in."

    .line 99
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string v3, "Default config detected. We want the actual app config from the server."

    .line 102
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    if-eqz v1, :cond_2

    const-string v3, "Already ran today."

    .line 105
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    if-eqz v0, :cond_3

    if-nez p1, :cond_3

    if-nez v1, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2
.end method


# virtual methods
.method public checkPartnerApps(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;)V
    .locals 4

    .line 57
    invoke-interface {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->shouldRun(Ljava/util/Map;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->saveCheckDate()V

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->partnerAppDetector:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;->getInstalledPartnerApps(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    const-string v1, "%1$d partner apps detected."

    const/4 v2, 0x1

    .line 67
    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->partnerAppTracker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;->trackPartnerApps(Ljava/util/List;)V

    return-void

    :cond_1
    :goto_0
    const-string p1, "Criteria not met for checking installed partner apps."

    .line 60
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public getInstalledPartnerAppJson(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    .line 84
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;->partnerAppDetector:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    invoke-interface {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {v2, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;->getInstalledPartnerApps(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to parse List<PartnerAppTrackingData> to JSON!"

    const/4 v2, 0x0

    .line 86
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method
