.class public Lio/sentry/connection/RandomEventSampler;
.super Ljava/lang/Object;
.source "RandomEventSampler.java"

# interfaces
.implements Lio/sentry/connection/EventSampler;


# instance fields
.field private random:Ljava/util/Random;

.field private sampleRate:D


# direct methods
.method public constructor <init>(D)V
    .locals 1

    .line 21
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lio/sentry/connection/RandomEventSampler;-><init>(DLjava/util/Random;)V

    return-void
.end method

.method public constructor <init>(DLjava/util/Random;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-wide p1, p0, Lio/sentry/connection/RandomEventSampler;->sampleRate:D

    .line 36
    iput-object p3, p0, Lio/sentry/connection/RandomEventSampler;->random:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public shouldSendEvent(Lio/sentry/event/Event;)Z
    .locals 4

    .line 47
    iget-object p1, p0, Lio/sentry/connection/RandomEventSampler;->random:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    .line 48
    iget-wide v2, p0, Lio/sentry/connection/RandomEventSampler;->sampleRate:D

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpl-double p1, v2, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
