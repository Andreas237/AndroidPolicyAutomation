.class public Lcom/newrelic/agent/android/Agent;
.super Ljava/lang/Object;
.source "Agent.java"


# static fields
.field public static final DEFAULT_BUILD_ID:Ljava/lang/String; = ""

.field public static final MONO_INSTRUMENTATION_FLAG:Ljava/lang/String; = "NO"

.field private static final NULL_AGENT_IMPL:Lcom/newrelic/agent/android/AgentImpl;

.field public static final UNITY_INSTRUMENTATION_FLAG:Ljava/lang/String; = "NO"

.field public static final VERSION:Ljava/lang/String; = "5.20.0"

.field private static buildId:Ljava/lang/String;

.field private static impl:Lcom/newrelic/agent/android/AgentImpl;

.field private static implLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/newrelic/agent/android/NullAgentImpl;

    invoke-direct {v0}, Lcom/newrelic/agent/android/NullAgentImpl;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Agent;->NULL_AGENT_IMPL:Lcom/newrelic/agent/android/AgentImpl;

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Agent;->implLock:Ljava/lang/Object;

    .line 21
    sget-object v0, Lcom/newrelic/agent/android/Agent;->NULL_AGENT_IMPL:Lcom/newrelic/agent/android/AgentImpl;

    sput-object v0, Lcom/newrelic/agent/android/Agent;->impl:Lcom/newrelic/agent/android/AgentImpl;

    const/4 v0, 0x0

    .line 22
    sput-object v0, Lcom/newrelic/agent/android/Agent;->buildId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addTransactionData(Lcom/newrelic/agent/android/api/common/TransactionData;)V
    .locals 1

    .line 99
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/AgentImpl;->addTransactionData(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    return-void
.end method

.method public static disable()V
    .locals 1

    .line 140
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->disable()V

    return-void
.end method

.method public static getActiveNetworkCarrier()Ljava/lang/String;
    .locals 1

    .line 126
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getNetworkCarrier()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getActiveNetworkWanType()Ljava/lang/String;
    .locals 1

    .line 133
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getNetworkWanType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getAndClearTransactionData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;"
        }
    .end annotation

    .line 108
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getAndClearTransactionData()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;
    .locals 1

    .line 188
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getBuildId()Ljava/lang/String;
    .locals 6

    .line 54
    sget-object v0, Lcom/newrelic/agent/android/Agent;->implLock:Ljava/lang/Object;

    monitor-enter v0

    .line 55
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/Agent;->buildId:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, ""

    .line 58
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->isInstantApp()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 60
    :try_start_1
    const-class v2, Lcom/newrelic/agent/android/Agent;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v3, "com.newrelic.agent.android.NewRelicConfig"

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "BUILD_ID"

    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 64
    :try_start_2
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Agent.getBuildId: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 66
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getUnityInstrumentationFlag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "YES"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getMonoInstrumentationFlag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "YES"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const-string v1, ""

    .line 70
    :cond_2
    :goto_0
    sput-object v1, Lcom/newrelic/agent/android/Agent;->buildId:Ljava/lang/String;

    .line 72
    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    sget-object v0, Lcom/newrelic/agent/android/Agent;->buildId:Ljava/lang/String;

    return-object v0

    :catchall_0
    move-exception v1

    .line 72
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static getCatFacade()Lcom/newrelic/agent/android/connectivity/CatFacade;
    .locals 1

    .line 90
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getCatFacade()Lcom/newrelic/agent/android/connectivity/CatFacade;

    move-result-object v0

    return-object v0
.end method

.method public static getCrossProcessId()Ljava/lang/String;
    .locals 1

    .line 78
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getCrossProcessId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;
    .locals 1

    .line 184
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getEncoder()Lcom/newrelic/agent/android/util/Encoder;
    .locals 1

    .line 180
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getEncoder()Lcom/newrelic/agent/android/util/Encoder;

    move-result-object v0

    return-object v0
.end method

.method public static getImpl()Lcom/newrelic/agent/android/AgentImpl;
    .locals 2

    .line 35
    sget-object v0, Lcom/newrelic/agent/android/Agent;->implLock:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/Agent;->impl:Lcom/newrelic/agent/android/AgentImpl;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getMonoInstrumentationFlag()Ljava/lang/String;
    .locals 1

    const-string v0, "NO"

    return-object v0
.end method

.method public static getResponseBodyLimit()I
    .locals 1

    .line 86
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getResponseBodyLimit()I

    move-result v0

    return v0
.end method

.method public static getStackTraceLimit()I
    .locals 1

    .line 82
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->getStackTraceLimit()I

    move-result v0

    return v0
.end method

.method public static getUnityInstrumentationFlag()Ljava/lang/String;
    .locals 1

    const-string v0, "NO"

    return-object v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "5.20.0"

    return-object v0
.end method

.method public static hasReachableNetworkConnection(Ljava/lang/String;)Z
    .locals 1

    .line 192
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/AgentImpl;->hasReachableNetworkConnection(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isDisabled()Z
    .locals 1

    .line 149
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->isDisabled()Z

    move-result v0

    return v0
.end method

.method public static isInstantApp()Z
    .locals 1

    .line 196
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->isInstantApp()Z

    move-result v0

    return v0
.end method

.method public static mergeTransactionData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;)V"
        }
    .end annotation

    .line 117
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/AgentImpl;->mergeTransactionData(Ljava/util/List;)V

    return-void
.end method

.method public static setImpl(Lcom/newrelic/agent/android/AgentImpl;)V
    .locals 1

    .line 25
    sget-object v0, Lcom/newrelic/agent/android/Agent;->implLock:Ljava/lang/Object;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 27
    :try_start_0
    sget-object p0, Lcom/newrelic/agent/android/Agent;->NULL_AGENT_IMPL:Lcom/newrelic/agent/android/AgentImpl;

    sput-object p0, Lcom/newrelic/agent/android/Agent;->impl:Lcom/newrelic/agent/android/AgentImpl;

    goto :goto_0

    .line 29
    :cond_0
    sput-object p0, Lcom/newrelic/agent/android/Agent;->impl:Lcom/newrelic/agent/android/AgentImpl;

    .line 31
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static setLocation(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 173
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/newrelic/agent/android/AgentImpl;->setLocation(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static start()V
    .locals 1

    .line 156
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->start()V

    return-void
.end method

.method public static stop()V
    .locals 1

    .line 163
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/AgentImpl;->stop()V

    return-void
.end method
