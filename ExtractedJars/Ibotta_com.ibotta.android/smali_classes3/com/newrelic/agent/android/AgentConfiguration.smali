.class public Lcom/newrelic/agent/android/AgentConfiguration;
.super Ljava/lang/Object;
.source "AgentConfiguration.java"


# static fields
.field private static final DEFAULT_COLLECTOR_HOST:Ljava/lang/String; = "mobile-collector.newrelic.com"

.field private static final DEFAULT_CRASH_COLLECTOR_HOST:Ljava/lang/String; = "mobile-crash.newrelic.com"

.field public static final DEFAULT_REGION_COLLECTOR_HOST:Ljava/lang/String; = "mobile-collector.%s.nr-data.net"

.field private static final DEFAULT_REGION_CRASH_COLLECTOR_HOST:Ljava/lang/String; = "mobile-crash.%s.nr-data.net"

.field private static final HEX_COLLECTOR_PATH:Ljava/lang/String; = "/mobile/f"

.field private static final HEX_COLLECTOR_TIMEOUT:I = 0x1388

.field private static final NUM_IO_THREADS:I = 0x3

.field private static final PAYLOAD_TTL:I = 0xa4cb800


# instance fields
.field private analyticAttributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

.field private appName:Ljava/lang/String;

.field private applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

.field private applicationPlatformVersion:Ljava/lang/String;

.field private applicationToken:Ljava/lang/String;

.field private collectorHost:Ljava/lang/String;

.field private crashCollectorHost:Ljava/lang/String;

.field private crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

.field private customApplicationVersion:Ljava/lang/String;

.field private customBuildId:Ljava/lang/String;

.field private enableAnalyticsEvents:Z

.field private payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/agent/android/payload/PayloadStore<",
            "Lcom/newrelic/agent/android/payload/Payload;",
            ">;"
        }
    .end annotation
.end field

.field private region:Ljava/lang/String;

.field private reportCrashes:Z

.field private reportHandledExceptions:Z

.field private sessionID:Ljava/lang/String;

.field private useLocationService:Z

.field private useSsl:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "mobile-collector.newrelic.com"

    .line 32
    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->collectorHost:Ljava/lang/String;

    const-string v0, "mobile-crash.newrelic.com"

    .line 33
    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->crashCollectorHost:Ljava/lang/String;

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->useSsl:Z

    .line 38
    iput-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->reportCrashes:Z

    .line 39
    iput-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->reportHandledExceptions:Z

    .line 40
    iput-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->enableAnalyticsEvents:Z

    .line 41
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AgentConfiguration;->provideSessionId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->sessionID:Ljava/lang/String;

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->customApplicationVersion:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->customBuildId:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->region:Ljava/lang/String;

    .line 48
    new-instance v0, Lcom/newrelic/agent/android/payload/NullPayloadStore;

    invoke-direct {v0}, Lcom/newrelic/agent/android/payload/NullPayloadStore;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    .line 50
    sget-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Native:Lcom/newrelic/agent/android/ApplicationPlatform;

    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 51
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatformVersion:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAnalyticAttributeStore()Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->analyticAttributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppTokenHeader()Ljava/lang/String;
    .locals 1

    const-string v0, "X-App-License-Key"

    return-object v0
.end method

.method public getAppVersionHeader()Ljava/lang/String;
    .locals 1

    const-string v0, "X-NewRelic-App-Version"

    return-object v0
.end method

.method public getApplicationPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

    return-object v0
.end method

.method public getApplicationPlatformVersion()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatformVersion:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatformVersion:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public getApplicationToken()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationToken:Ljava/lang/String;

    return-object v0
.end method

.method public getCollectorHost()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->collectorHost:Ljava/lang/String;

    return-object v0
.end method

.method public getCrashCollectorHost()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->crashCollectorHost:Ljava/lang/String;

    return-object v0
.end method

.method public getCrashStore()Lcom/newrelic/agent/android/crash/CrashStore;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

    return-object v0
.end method

.method public getCustomApplicationVersion()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->customApplicationVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomBuildIdentifier()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->customBuildId:Ljava/lang/String;

    return-object v0
.end method

.method getDefaultCollectorHost()Ljava/lang/String;
    .locals 1

    const-string v0, "mobile-collector.newrelic.com"

    return-object v0
.end method

.method getDefaultCrashCollectorHost()Ljava/lang/String;
    .locals 1

    const-string v0, "mobile-crash.newrelic.com"

    return-object v0
.end method

.method public getDeviceOsNameHeader()Ljava/lang/String;
    .locals 1

    const-string v0, "X-NewRelic-OS-Name"

    return-object v0
.end method

.method public getEnableAnalyticsEvents()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->enableAnalyticsEvents:Z

    return v0
.end method

.method public getHexCollectorHost()Ljava/lang/String;
    .locals 1

    .line 196
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AgentConfiguration;->getCollectorHost()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHexCollectorPath()Ljava/lang/String;
    .locals 1

    const-string v0, "/mobile/f"

    return-object v0
.end method

.method public getHexCollectorTimeout()I
    .locals 1

    const/16 v0, 0x1388

    return v0
.end method

.method public getIOThreadSize()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getPayloadStore()Lcom/newrelic/agent/android/payload/PayloadStore;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    return-object v0
.end method

.method public getPayloadTTL()I
    .locals 1

    const v0, 0xa4cb800

    return v0
.end method

.method getRegionalCollectorFromLicenseKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 240
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/AgentConfiguration;->parseRegionFromApplicationToken(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, ""

    .line 242
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "mobile-collector.%s.nr-data.net"

    const/4 v1, 0x1

    .line 243
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "mobile-collector.newrelic.com"

    return-object p1
.end method

.method public getReportCrashes()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->reportCrashes:Z

    return v0
.end method

.method public getReportHandledExceptions()Z
    .locals 1

    .line 123
    iget-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->reportHandledExceptions:Z

    return v0
.end method

.method public getSessionID()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->sessionID:Ljava/lang/String;

    return-object v0
.end method

.method parseRegionFromApplicationToken(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 259
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-string v2, ""

    .line 261
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    const-string v2, "^(.+?)x{1,2}.*"

    .line 266
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 267
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 269
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    .line 271
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v2, ""

    .line 272
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    :goto_0
    const-string p1, "Region prefix empty"

    .line 273
    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 279
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRegionalCollectorFromLicenseKey: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-object v1

    :cond_4
    :goto_2
    return-object v1
.end method

.method protected provideSessionId()Ljava/lang/String;
    .locals 1

    .line 187
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->sessionID:Ljava/lang/String;

    .line 188
    iget-object v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->sessionID:Ljava/lang/String;

    return-object v0
.end method

.method public setAnalyticAttributeStore(Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->analyticAttributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->appName:Ljava/lang/String;

    return-void
.end method

.method public setApplicationPlatform(Lcom/newrelic/agent/android/ApplicationPlatform;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

    return-void
.end method

.method public setApplicationPlatformVersion(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationPlatformVersion:Ljava/lang/String;

    return-void
.end method

.method public setApplicationToken(Ljava/lang/String;)V
    .locals 4

    .line 58
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->applicationToken:Ljava/lang/String;

    .line 59
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/AgentConfiguration;->parseRegionFromApplicationToken(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->region:Ljava/lang/String;

    .line 60
    iget-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->region:Ljava/lang/String;

    if-eqz p1, :cond_0

    const-string v0, "mobile-collector.%s.nr-data.net"

    const/4 v1, 0x1

    .line 61
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->collectorHost:Ljava/lang/String;

    const-string p1, "mobile-crash.%s.nr-data.net"

    .line 62
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->region:Ljava/lang/String;

    aput-object v1, v0, v3

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->crashCollectorHost:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setCollectorHost(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->collectorHost:Ljava/lang/String;

    return-void
.end method

.method public setCrashCollectorHost(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->crashCollectorHost:Ljava/lang/String;

    return-void
.end method

.method public setCrashStore(Lcom/newrelic/agent/android/crash/CrashStore;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

    return-void
.end method

.method public setCustomApplicationVersion(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->customApplicationVersion:Ljava/lang/String;

    return-void
.end method

.method public setCustomBuildIdentifier(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->customBuildId:Ljava/lang/String;

    return-void
.end method

.method public setEnableAnalyticsEvents(Z)V
    .locals 0

    .line 143
    iput-boolean p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->enableAnalyticsEvents:Z

    return-void
.end method

.method public setPayloadStore(Lcom/newrelic/agent/android/payload/PayloadStore;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    return-void
.end method

.method public setReportCrashes(Z)V
    .locals 0

    .line 111
    iput-boolean p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->reportCrashes:Z

    return-void
.end method

.method public setReportHandledExceptions(Z)V
    .locals 0

    .line 127
    iput-boolean p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->reportHandledExceptions:Z

    return-void
.end method

.method public setSessionID(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->sessionID:Ljava/lang/String;

    return-void
.end method

.method public setUseLocationService(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->useLocationService:Z

    return-void
.end method

.method public setUseSsl(Z)V
    .locals 0

    .line 95
    iput-boolean p1, p0, Lcom/newrelic/agent/android/AgentConfiguration;->useSsl:Z

    return-void
.end method

.method public useLocationService()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->useLocationService:Z

    return v0
.end method

.method public useSsl()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/newrelic/agent/android/AgentConfiguration;->useSsl:Z

    return v0
.end method
