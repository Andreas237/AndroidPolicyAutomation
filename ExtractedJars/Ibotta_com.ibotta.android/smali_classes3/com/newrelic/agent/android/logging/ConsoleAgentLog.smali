.class public Lcom/newrelic/agent/android/logging/ConsoleAgentLog;
.super Ljava/lang/Object;
.source "ConsoleAgentLog.java"

# interfaces
.implements Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private level:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    return-void
.end method

.method private static print(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 60
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public audit(Ljava/lang/String;)V
    .locals 2

    .line 8
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const-string v0, "AUDIT"

    .line 9
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public debug(Ljava/lang/String;)V
    .locals 2

    .line 14
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    const-string v0, "DEBUG"

    .line 15
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 2

    .line 44
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const-string v0, "ERROR"

    .line 45
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 38
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const-string v0, "ERROR"

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public getLevel()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    return v0
.end method

.method public info(Ljava/lang/String;)V
    .locals 2

    .line 26
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const-string v0, "INFO"

    .line 27
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setLevel(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    return-void
.end method

.method public verbose(Ljava/lang/String;)V
    .locals 2

    .line 20
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    const-string v0, "VERBOSE"

    .line 21
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public warning(Ljava/lang/String;)V
    .locals 2

    .line 32
    iget v0, p0, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->level:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const-string v0, "WARN"

    .line 33
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/logging/ConsoleAgentLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
