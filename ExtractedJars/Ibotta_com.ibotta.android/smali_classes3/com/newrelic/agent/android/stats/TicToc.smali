.class public Lcom/newrelic/agent/android/stats/TicToc;
.super Ljava/lang/Object;
.source "TicToc.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/stats/TicToc$State;
    }
.end annotation


# instance fields
.field private endTime:J

.field private startTime:J

.field private state:Lcom/newrelic/agent/android/stats/TicToc$State;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public peek()J
    .locals 4

    .line 30
    iget-object v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->state:Lcom/newrelic/agent/android/stats/TicToc$State;

    sget-object v1, Lcom/newrelic/agent/android/stats/TicToc$State;->STARTED:Lcom/newrelic/agent/android/stats/TicToc$State;

    if-ne v0, v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/newrelic/agent/android/stats/TicToc;->startTime:J

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public tic()V
    .locals 2

    .line 14
    sget-object v0, Lcom/newrelic/agent/android/stats/TicToc$State;->STARTED:Lcom/newrelic/agent/android/stats/TicToc$State;

    iput-object v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->state:Lcom/newrelic/agent/android/stats/TicToc$State;

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->startTime:J

    return-void
.end method

.method public toc()J
    .locals 4

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->endTime:J

    .line 21
    iget-object v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->state:Lcom/newrelic/agent/android/stats/TicToc$State;

    sget-object v1, Lcom/newrelic/agent/android/stats/TicToc$State;->STARTED:Lcom/newrelic/agent/android/stats/TicToc$State;

    if-ne v0, v1, :cond_0

    .line 22
    sget-object v0, Lcom/newrelic/agent/android/stats/TicToc$State;->STOPPED:Lcom/newrelic/agent/android/stats/TicToc$State;

    iput-object v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->state:Lcom/newrelic/agent/android/stats/TicToc$State;

    .line 23
    iget-wide v0, p0, Lcom/newrelic/agent/android/stats/TicToc;->endTime:J

    iget-wide v2, p0, Lcom/newrelic/agent/android/stats/TicToc;->startTime:J

    sub-long/2addr v0, v2

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
