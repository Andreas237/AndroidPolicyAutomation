.class public Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;
.super Lcom/newrelic/agent/android/analytics/AnalyticsEvent;
.source "NetworkRequestEvent.java"


# static fields
.field static analyticsController:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->analyticsController:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    return-void
.end method

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

    .line 17
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->NetworkRequest:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "MobileRequest"

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;-><init>(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method static createDefaultAttributeSet(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Ljava/util/Set;
    .locals 7
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

    .line 32
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 36
    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v3, "requestDomain"

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 37
    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v3, "requestPath"

    invoke-virtual {v1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 39
    :catch_0
    sget-object v1, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is not a valid URL. Unable to set host or path attributes."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 42
    :goto_0
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "requestUrl"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "connectionType"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getWanType()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "requestMethod"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getHttpMethod()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getTotalTime()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v5, v1, v3

    if-eqz v5, :cond_0

    .line 48
    new-instance v5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v6, "responseTime"

    invoke-direct {v5, v6, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getBytesSent()J

    move-result-wide v1

    long-to-double v1, v1

    cmpl-double v5, v1, v3

    if-eqz v5, :cond_1

    .line 53
    new-instance v5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v6, "bytesSent"

    invoke-direct {v5, v6, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getBytesReceived()J

    move-result-wide v1

    long-to-double v1, v1

    cmpl-double v5, v1, v3

    if-eqz v5, :cond_2

    .line 58
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v4, "bytesReceived"

    invoke-direct {v3, v4, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_2
    sget-object v1, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v1}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 62
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asMapForRequest()Ljava/util/Map;

    move-result-object p0

    .line 63
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 64
    sget-object v2, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->analyticsController:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 66
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 68
    :cond_3
    sget-object v2, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported event attribute type for key ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "]: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public static createNetworkEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;
    .locals 5

    .line 21
    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;->createDefaultAttributeSet(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Ljava/util/Set;

    move-result-object v0

    .line 23
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "responseTime"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getTotalTime()D

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "statusCode"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getStatusCode()I

    move-result v3

    int-to-double v3, v3

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "bytesSent"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getBytesSent()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "bytesReceived"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getBytesReceived()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance p0, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/NetworkRequestEvent;-><init>(Ljava/util/Set;)V

    return-object p0
.end method
