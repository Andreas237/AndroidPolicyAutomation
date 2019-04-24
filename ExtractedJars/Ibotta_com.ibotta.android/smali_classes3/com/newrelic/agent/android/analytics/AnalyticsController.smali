.class public interface abstract Lcom/newrelic/agent/android/analytics/AnalyticsController;
.super Ljava/lang/Object;
.source "AnalyticsController.java"


# virtual methods
.method public abstract addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z
.end method

.method public abstract addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract addEvent(Ljava/lang/String;Ljava/util/Set;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
.end method

.method public abstract getEventManager()Lcom/newrelic/agent/android/analytics/EventManager;
.end method

.method public abstract getMaxEventBufferTime()I
.end method

.method public abstract getMaxEventPoolSize()I
.end method

.method public abstract getSessionAttributeCount()I
.end method

.method public abstract getSessionAttributes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSystemAttributeCount()I
.end method

.method public abstract getSystemAttributes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUserAttributeCount()I
.end method

.method public abstract getUserAttributes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end method

.method public abstract incrementAttribute(Ljava/lang/String;D)Z
.end method

.method public abstract incrementAttribute(Ljava/lang/String;DZ)Z
.end method

.method public abstract recordEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract removeAllAttributes()Z
.end method

.method public abstract removeAttribute(Ljava/lang/String;)Z
.end method

.method public abstract setAttribute(Ljava/lang/String;D)Z
.end method

.method public abstract setAttribute(Ljava/lang/String;DZ)Z
.end method

.method public abstract setAttribute(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public abstract setAttribute(Ljava/lang/String;Ljava/lang/String;Z)Z
.end method

.method public abstract setAttribute(Ljava/lang/String;Z)Z
.end method

.method public abstract setAttribute(Ljava/lang/String;ZZ)Z
.end method

.method public abstract setMaxEventBufferTime(I)V
.end method

.method public abstract setMaxEventPoolSize(I)V
.end method
