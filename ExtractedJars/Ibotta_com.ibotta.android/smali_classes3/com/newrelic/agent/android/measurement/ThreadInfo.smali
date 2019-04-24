.class public Lcom/newrelic/agent/android/measurement/ThreadInfo;
.super Ljava/lang/Object;
.source "ThreadInfo.java"


# instance fields
.field private id:J

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/ThreadInfo;-><init>(Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p1, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->id:J

    .line 16
    iput-object p3, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/newrelic/agent/android/measurement/ThreadInfo;-><init>(JLjava/lang/String;)V

    return-void
.end method

.method public static fromThread(Ljava/lang/Thread;)Lcom/newrelic/agent/android/measurement/ThreadInfo;
    .locals 1

    .line 24
    new-instance v0, Lcom/newrelic/agent/android/measurement/ThreadInfo;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/measurement/ThreadInfo;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method


# virtual methods
.method public getId()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->id:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setId(J)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->id:J

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThreadInfo{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/ThreadInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
