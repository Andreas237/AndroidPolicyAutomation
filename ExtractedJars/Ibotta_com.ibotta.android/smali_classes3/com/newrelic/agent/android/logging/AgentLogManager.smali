.class public Lcom/newrelic/agent/android/logging/AgentLogManager;
.super Ljava/lang/Object;
.source "AgentLogManager.java"


# static fields
.field private static instance:Lcom/newrelic/agent/android/logging/DefaultAgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Lcom/newrelic/agent/android/logging/DefaultAgentLog;

    invoke-direct {v0}, Lcom/newrelic/agent/android/logging/DefaultAgentLog;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/logging/AgentLogManager;->instance:Lcom/newrelic/agent/android/logging/DefaultAgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 7
    sget-object v0, Lcom/newrelic/agent/android/logging/AgentLogManager;->instance:Lcom/newrelic/agent/android/logging/DefaultAgentLog;

    return-object v0
.end method

.method public static setAgentLog(Lcom/newrelic/agent/android/logging/AgentLog;)V
    .locals 1

    .line 11
    sget-object v0, Lcom/newrelic/agent/android/logging/AgentLogManager;->instance:Lcom/newrelic/agent/android/logging/DefaultAgentLog;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/logging/DefaultAgentLog;->setImpl(Lcom/newrelic/agent/android/logging/AgentLog;)V

    return-void
.end method
