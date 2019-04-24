.class public Lcom/newrelic/agent/android/logging/NullAgentLog;
.super Ljava/lang/Object;
.source "NullAgentLog.java"

# interfaces
.implements Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public audit(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public debug(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public getLevel()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public info(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setLevel(I)V
    .locals 0

    return-void
.end method

.method public verbose(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public warning(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
