.class public Lcom/newrelic/agent/android/unity/NewRelicUnity;
.super Ljava/lang/Object;
.source "NewRelicUnity.java"


# static fields
.field private static final ROOT_TRACE_NAME:Ljava/lang/String; = "Unity"

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/unity/NewRelicUnity;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static handleUnityCrash(Lcom/newrelic/agent/android/unity/UnityException;)V
    .locals 2

    .line 22
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 24
    instance-of v1, v0, Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    if-eqz v1, :cond_0

    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method static noticeNetworkFailure(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;)V
    .locals 8

    .line 40
    invoke-static {p6}, Lcom/newrelic/agent/android/util/NetworkFailure;->fromErrorCode(I)Lcom/newrelic/agent/android/util/NetworkFailure;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v7, p7

    .line 41
    invoke-static/range {v0 .. v7}, Lcom/newrelic/agent/android/NewRelic;->noticeNetworkFailure(Ljava/lang/String;Ljava/lang/String;JJLcom/newrelic/agent/android/util/NetworkFailure;Ljava/lang/String;)V

    return-void
.end method

.method static recordEvent(Lcom/newrelic/agent/android/unity/UnityEvent;)Z
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/newrelic/agent/android/unity/UnityEvent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/newrelic/agent/android/unity/UnityEvent;->getAttributes()Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/NewRelic;->recordEvent(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p0

    return p0
.end method
