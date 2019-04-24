.class public Lcom/newrelic/agent/android/crash/CrashSender;
.super Lcom/newrelic/agent/android/payload/PayloadSender;
.source "CrashSender.java"


# static fields
.field private static final CRASH_COLLECTOR_PATH:Ljava/lang/String; = "/mobile_crash"

.field public static final CRASH_COLLECTOR_TIMEOUT:I = 0x1388


# instance fields
.field private final crash:Lcom/newrelic/agent/android/crash/Crash;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/crash/Crash;Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 1

    .line 24
    invoke-virtual {p1}, Lcom/newrelic/agent/android/crash/Crash;->toJsonString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/newrelic/agent/android/payload/PayloadSender;-><init>([BLcom/newrelic/agent/android/AgentConfiguration;)V

    .line 25
    iput-object p1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->crash:Lcom/newrelic/agent/android/crash/Crash;

    return-void
.end method


# virtual methods
.method public call()Lcom/newrelic/agent/android/payload/PayloadSender;
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashSender;->crash:Lcom/newrelic/agent/android/crash/Crash;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/Crash;->toJsonString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/crash/CrashSender;->setPayload([B)V

    .line 51
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashSender;->crash:Lcom/newrelic/agent/android/crash/Crash;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/Crash;->incrementUploadCount()V

    .line 52
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashSender;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/AgentConfiguration;->getCrashStore()Lcom/newrelic/agent/android/crash/CrashStore;

    move-result-object v0

    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->crash:Lcom/newrelic/agent/android/crash/Crash;

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/crash/CrashStore;->store(Lcom/newrelic/agent/android/crash/Crash;)Z

    .line 55
    :try_start_0
    invoke-super {p0}, Lcom/newrelic/agent/android/payload/PayloadSender;->call()Lcom/newrelic/agent/android/payload/PayloadSender;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to report crash to New Relic, will try again later. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/crash/CrashSender;->onFailedUpload(Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 17
    invoke-virtual {p0}, Lcom/newrelic/agent/android/crash/CrashSender;->call()Lcom/newrelic/agent/android/payload/PayloadSender;

    move-result-object v0

    return-object v0
.end method

.method protected getConnection()Ljava/net/HttpURLConnection;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/newrelic/agent/android/crash/CrashSender;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getCrashCollectorHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/mobile_crash"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 31
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    .line 34
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    .line 36
    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getAppTokenHeader()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/newrelic/agent/android/crash/CrashSender;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getDeviceOsNameHeader()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getAppVersionHeader()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x1388

    .line 40
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 41
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    return-object v0
.end method

.method protected onFailedUpload(Ljava/lang/String;)V
    .locals 1

    .line 89
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashSender;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object p1

    const-string v0, "Supportability/AgentHealth/Crash/FailedUpload"

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    return-void
.end method

.method protected onRequestException(Ljava/lang/Exception;)V
    .locals 3

    .line 95
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashSender;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crash upload failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method protected onRequestResponse(Ljava/net/HttpURLConnection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 66
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1f4

    if-eq v0, v1, :cond_0

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Something went wrong while submitting a crash (will try again later) - Response code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/crash/CrashSender;->onFailedUpload(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    const-string v1, "Supportability/AgentHealth/Crash/Removed/Rejected"

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The crash was rejected and will be deleted - Response code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/crash/CrashSender;->onFailedUpload(Ljava/lang/String;)V

    goto :goto_0

    .line 70
    :cond_1
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object p1

    const-string v0, "Supportability/AgentHealth/Crash/UploadTime"

    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->timer:Lcom/newrelic/agent/android/stats/TicToc;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/stats/TicToc;->peek()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/newrelic/agent/android/stats/StatsEngine;->sampleTimeMs(Ljava/lang/String;J)V

    .line 71
    sget-object p1, Lcom/newrelic/agent/android/crash/CrashSender;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Crash "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->crash:Lcom/newrelic/agent/android/crash/Crash;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/crash/Crash;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " successfully submitted."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 84
    :goto_0
    sget-object p1, Lcom/newrelic/agent/android/crash/CrashSender;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Crash collection took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashSender;->timer:Lcom/newrelic/agent/android/stats/TicToc;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/stats/TicToc;->toc()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void
.end method

.method protected shouldUploadOpportunistically()Z
    .locals 1

    const/4 v0, 0x0

    .line 101
    invoke-static {v0}, Lcom/newrelic/agent/android/Agent;->hasReachableNetworkConnection(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
