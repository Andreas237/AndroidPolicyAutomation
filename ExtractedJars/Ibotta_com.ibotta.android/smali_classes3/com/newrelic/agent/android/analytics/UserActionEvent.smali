.class public Lcom/newrelic/agent/android/analytics/UserActionEvent;
.super Lcom/newrelic/agent/android/analytics/AnalyticsEvent;
.source "UserActionEvent.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)V"
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->UserAction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "MobileUserAction"

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method
