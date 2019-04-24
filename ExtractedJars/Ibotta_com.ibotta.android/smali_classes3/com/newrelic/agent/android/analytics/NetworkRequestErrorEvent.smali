.class public Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;
.super Lcom/newrelic/agent/android/analytics/AnalyticsEvent;
.source "NetworkRequestErrorEvent.java"


# static fields
.field static final DISABLE_FF_RESPONSE:Ljava/lang/String; = "NEWRELIC_RESPONSE_BODY_CAPTURE_DISABLED"


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)V"
        }
    .end annotation

    .line 49
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "MobileRequestError"

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method static createErrorAttributeSet(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/agent/android/harvest/HttpTransaction;",
            ")",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 15
    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->createDefaultAttributeSet(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Ljava/util/Set;

    move-result-object v0

    .line 17
    sget-object v1, Lcom/newrelic/agent/android/FeatureFlag;->HttpResponseBodyCapture:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v1}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getResponseBody()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x1000

    if-le v2, v3, :cond_0

    .line 21
    sget-object v2, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v4, "NetworkRequestErrorEvent: truncating response body to 4096 bytes"

    invoke-interface {v2, v4}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 24
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getEncoder()Lcom/newrelic/agent/android/util/Encoder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/util/Encoder;->encodeNoWrap([B)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 26
    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v3, "nr.responseBody"

    invoke-direct {v2, v3, v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "nr.responseBody"

    const-string v3, "NEWRELIC_RESPONSE_BODY_CAPTURE_DISABLED"

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getAppData()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 35
    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v3, "nr.X-NewRelic-App-Data"

    invoke-direct {v2, v3, v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_3
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getParams()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 39
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getParams()Ljava/util/Map;

    move-result-object p0

    const-string v1, "content_type"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_4

    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 41
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "contentType"

    invoke-direct {v1, v2, p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method

.method public static createHttpErrorEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;
    .locals 5

    .line 53
    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;->createErrorAttributeSet(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Ljava/util/Set;

    move-result-object v0

    .line 55
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "statusCode"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getStatusCode()I

    move-result p0

    int-to-double v3, p0

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance p0, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;-><init>(Ljava/util/Set;)V

    return-object p0
.end method

.method public static createNetworkFailureEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;
    .locals 5

    .line 61
    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;->createErrorAttributeSet(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Ljava/util/Set;

    move-result-object v0

    .line 63
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "networkErrorCode"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getErrorCode()I

    move-result p0

    int-to-double v3, p0

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance p0, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/NetworkRequestErrorEvent;-><init>(Ljava/util/Set;)V

    return-object p0
.end method
