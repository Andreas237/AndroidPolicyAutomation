.class public Lcom/newrelic/agent/android/harvest/AgentHealth;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "AgentHealth.java"


# static fields
.field public static final DEFAULT_KEY:Ljava/lang/String; = "Exception"

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field protected final agentHealthExceptions:Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/AgentHealth;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 19
    new-instance v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->agentHealthExceptions:Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;

    return-void
.end method

.method public static noticeException(Lcom/newrelic/agent/android/harvest/AgentHealthException;)V
    .locals 1

    const-string v0, "Exception"

    .line 33
    invoke-static {p0, v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Lcom/newrelic/agent/android/harvest/AgentHealthException;Ljava/lang/String;)V

    return-void
.end method

.method public static noticeException(Lcom/newrelic/agent/android/harvest/AgentHealthException;Ljava/lang/String;)V
    .locals 4

    if-eqz p0, :cond_3

    .line 38
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    .line 42
    sget-object v1, Lcom/newrelic/agent/android/harvest/AgentHealth;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Passed metric key is null. Defaulting to Exception"

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    :cond_0
    const-string v1, "Supportability/AgentHealth/{0}/{1}/{2}/{3}"

    const/4 v2, 0x4

    .line 45
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    if-nez p1, :cond_1

    const-string p1, "Exception"

    :cond_1
    aput-object p1, v2, v3

    const/4 p1, 0x1

    .line 47
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getSourceClass()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, p1

    const/4 p1, 0x2

    .line 48
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getSourceMethod()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, p1

    const/4 p1, 0x3

    .line 49
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getExceptionClass()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, p1

    .line 45
    invoke-static {v1, v2}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    .line 51
    invoke-static {p0}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    goto :goto_0

    .line 53
    :cond_2
    sget-object p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p1, "StatsEngine is null. Exception not recorded."

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 56
    :cond_3
    sget-object p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p1, "AgentHealthException is null. StatsEngine not updated"

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static noticeException(Ljava/lang/Exception;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 24
    new-instance v0, Lcom/newrelic/agent/android/harvest/AgentHealthException;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;-><init>(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Lcom/newrelic/agent/android/harvest/AgentHealthException;)V

    return-void
.end method


# virtual methods
.method public addException(Lcom/newrelic/agent/android/harvest/AgentHealthException;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->agentHealthExceptions:Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->add(Lcom/newrelic/agent/android/harvest/AgentHealthException;)V

    return-void
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 2

    .line 71
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 73
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->agentHealthExceptions:Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 74
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->agentHealthExceptions:Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    :cond_0
    return-object v0
.end method

.method public clear()V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealth;->agentHealthExceptions:Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->clear()V

    return-void
.end method
