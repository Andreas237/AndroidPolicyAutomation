.class public Lcom/newrelic/agent/android/agentdata/AgentDataController;
.super Ljava/lang/Object;
.source "AgentDataController.java"


# static fields
.field protected static final agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-direct {v0}, Lcom/newrelic/agent/android/AgentConfiguration;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataController;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    .line 30
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static buildAgentDataFromHandledException(Ljava/lang/Exception;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;
    .locals 1

    .line 93
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/agentdata/AgentDataController;->buildAgentDataFromHandledException(Ljava/lang/Exception;Ljava/util/Map;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;

    move-result-object p0

    return-object p0
.end method

.method static buildAgentDataFromHandledException(Ljava/lang/Exception;Ljava/util/Map;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;"
        }
    .end annotation

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 36
    new-instance v2, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;-><init>(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)V

    .line 40
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/crash/Crash;->getBuildId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 42
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    const-string v5, "RandomUUID"

    .line 43
    invoke-static {v3, v5}, Lcom/newrelic/agent/android/util/ExceptionHelper;->recordSupportabilityMetric(Ljava/lang/Exception;Ljava/lang/String;)V

    move-object v3, v4

    :goto_0
    const-string v4, "appUuidHigh"

    .line 46
    invoke-virtual {v3}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "appUuidLow"

    .line 47
    invoke-virtual {v3}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "appVersion"

    .line 48
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->getApplicationVersion()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "appBuild"

    .line 49
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->getApplicationBuild()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sessionId"

    .line 50
    sget-object v3, Lcom/newrelic/agent/android/agentdata/AgentDataController;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v3}, Lcom/newrelic/agent/android/AgentConfiguration;->getSessionID()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "timestampMs"

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "message"

    .line 52
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "cause"

    .line 53
    invoke-static {p0}, Lcom/newrelic/agent/android/agentdata/AgentDataController;->getRootCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "name"

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "thread"

    .line 55
    invoke-virtual {p0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    invoke-static {p0}, Lcom/newrelic/agent/android/agentdata/AgentDataController;->threadSetFromStackElements([Ljava/lang/StackTraceElement;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 59
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getSessionAttributes()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 60
    sget-object v3, Lcom/newrelic/agent/android/agentdata/AgentDataController$1;->$SwitchMap$com$newrelic$agent$android$analytics$AnalyticAttribute$AttributeDataType:[I

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getAttributeDataType()Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 68
    :pswitch_0
    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getBooleanValue()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 65
    :pswitch_1
    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getDoubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 62
    :pswitch_2
    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 74
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object p0

    invoke-interface {p0}, Lcom/newrelic/agent/android/AgentImpl;->getSessionDurationMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v4, v2

    if-nez p0, :cond_1

    .line 76
    sget-object p0, Lcom/newrelic/agent/android/agentdata/AgentDataController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Harvest instance is not running! Session duration will be invalid"

    invoke-interface {p0, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const-string p0, "timeSinceLoad"

    long-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    .line 78
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :goto_2
    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 83
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 84
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    invoke-static {v1, p0}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->startAndFinishAgentData(Ljava/util/Map;Ljava/util/Set;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected static getRootCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 1

    if-eqz p0, :cond_1

    .line 99
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    .line 104
    :cond_0
    invoke-static {v0}, Lcom/newrelic/agent/android/agentdata/AgentDataController;->getRootCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    if-eqz p0, :cond_1

    return-object p0

    .line 114
    :cond_1
    new-instance p0, Ljava/lang/Throwable;

    const-string v0, "Unknown cause"

    invoke-direct {p0, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static sendAgentData(Ljava/lang/Exception;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 132
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->HandledExceptions:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 134
    :try_start_0
    invoke-static {p0, p1}, Lcom/newrelic/agent/android/agentdata/AgentDataController;->buildAgentDataFromHandledException(Ljava/lang/Exception;Ljava/util/Map;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;

    move-result-object p1

    .line 136
    invoke-virtual {p1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->dataBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    .line 138
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 139
    sget-object p1, Lcom/newrelic/agent/android/agentdata/AgentDataController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/mobile/fbs/AgentDataBundle;->getRootAsAgentDataBundle(Ljava/nio/ByteBuffer;)Lcom/newrelic/mobile/fbs/AgentDataBundle;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toJsonString(Lcom/newrelic/mobile/fbs/AgentDataBundle;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->audit(Ljava/lang/String;)V

    .line 140
    invoke-static {v0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->reportAgentData([B)Z

    move-result p1

    if-nez p1, :cond_0

    .line 142
    sget-object v0, Lcom/newrelic/agent/android/agentdata/AgentDataController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HandledException: exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " failed to record data."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return p1

    .line 146
    :catch_0
    sget-object p1, Lcom/newrelic/agent/android/agentdata/AgentDataController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HandledException: exception "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " failed to record data."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    return v1
.end method

.method protected static threadSetFromStackElements([Ljava/lang/StackTraceElement;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 119
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 120
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v5, "className"

    .line 121
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "methodName"

    .line 122
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "lineNumber"

    .line 123
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "fileName"

    .line 124
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
