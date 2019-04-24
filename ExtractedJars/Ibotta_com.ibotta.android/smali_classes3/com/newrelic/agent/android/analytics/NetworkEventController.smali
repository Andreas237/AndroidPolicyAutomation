.class public Lcom/newrelic/agent/android/analytics/NetworkEventController;
.super Ljava/lang/Object;
.source "NetworkEventController.java"


# static fields
.field static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createHttpErrorEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 3

    .line 14
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->NetworkErrorRequests:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;->createHttpErrorEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    sget-object p0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Failed to add MobileRequestError"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " added to event store for request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static createNetworkFailureEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 3

    .line 24
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->NetworkErrorRequests:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;->createNetworkFailureEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    sget-object p0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Failed to add MobileRequestError"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 28
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " added to event store for request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static createNetworkRequestEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 3

    .line 34
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->NetworkRequests:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->createNetworkEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    sget-object p0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Failed to add MobileRequest"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 38
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/analytics/NetworkEventController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->NetworkRequest:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " added to event store for request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
