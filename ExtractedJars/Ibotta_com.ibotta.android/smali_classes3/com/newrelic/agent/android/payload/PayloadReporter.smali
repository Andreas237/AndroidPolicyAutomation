.class public abstract Lcom/newrelic/agent/android/payload/PayloadReporter;
.super Ljava/lang/Object;
.source "PayloadReporter.java"


# static fields
.field protected static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field protected final agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

.field protected final isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReporter;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReporter;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    iput-object p1, p0, Lcom/newrelic/agent/android/payload/PayloadReporter;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    return-void
.end method


# virtual methods
.method public getAgentConfiguration()Lcom/newrelic/agent/android/AgentConfiguration;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReporter;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReporter;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method protected reportSupportabilityMetrics()V
    .locals 0

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReporter;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method protected abstract start()V
.end method

.method protected abstract stop()V
.end method
