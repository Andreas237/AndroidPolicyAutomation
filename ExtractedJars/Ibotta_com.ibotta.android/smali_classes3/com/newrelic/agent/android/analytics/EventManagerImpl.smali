.class public Lcom/newrelic/agent/android/analytics/EventManagerImpl;
.super Ljava/lang/Object;
.source "EventManagerImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/analytics/EventManager;


# static fields
.field public static DEFAULT_MAX_EVENT_BUFFER_SIZE:I = 0x0

.field public static DEFAULT_MAX_EVENT_BUFFER_TIME:I = 0x0

.field private static final EVENT_TYPE_ALLOWABLE_CHARS:Ljava/lang/String; = "^[\\p{L}\\p{Nd} _:.]+$"

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private events:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;"
        }
    .end annotation
.end field

.field private eventsEjected:Ljava/util/concurrent/atomic/AtomicInteger;

.field private eventsRecorded:Ljava/util/concurrent/atomic/AtomicInteger;

.field private firstEventTimestamp:J

.field private initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private maxBufferTimeInSec:I

.field private maxEventPoolSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const/16 v0, 0x258

    .line 18
    sput v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->DEFAULT_MAX_EVENT_BUFFER_TIME:I

    const/16 v0, 0x3e8

    .line 19
    sput v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->DEFAULT_MAX_EVENT_BUFFER_SIZE:I

    .line 30
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    const-string v1, "Mobile"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    const-string v1, "MobileRequest"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    const-string v1, "MobileRequestError"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    const-string v1, "MobileBreadcrumb"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    const-string v1, "MobileCrash"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    const-string v1, "MobileUserAction"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 40
    sget v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->DEFAULT_MAX_EVENT_BUFFER_SIZE:I

    sget v1, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->DEFAULT_MAX_EVENT_BUFFER_TIME:I

    invoke-direct {p0, v0, v1}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsRecorded:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsEjected:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    .line 45
    iput p2, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxBufferTimeInSec:I

    .line 46
    iput p1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxEventPoolSize:I

    const-wide/16 p1, 0x0

    .line 47
    iput-wide p1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->firstEventTimestamp:J

    .line 48
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsRecorded:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 49
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsEjected:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method


# virtual methods
.method public addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z
    .locals 5

    .line 92
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsRecorded:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 94
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 95
    sget-object v1, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EventManagerImpl.addEvent - Queue is currently empty, setting first event timestamp to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->firstEventTimestamp:J

    .line 99
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxEventPoolSize:I

    if-lt v1, v2, :cond_2

    .line 100
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsEjected:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 106
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    int-to-double v3, v0

    mul-double v1, v1, v3

    double-to-int v0, v1

    .line 107
    iget v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxEventPoolSize:I

    if-lt v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 112
    :cond_1
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 116
    :cond_2
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public empty()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-wide/16 v0, 0x0

    .line 79
    iput-wide v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->firstEventTimestamp:J

    return-void
.end method

.method public getEventsEjected()I
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsEjected:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public getEventsRecorded()I
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsRecorded:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public getMaxEventBufferTime()I
    .locals 1

    .line 160
    iget v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxBufferTimeInSec:I

    return v0
.end method

.method public getMaxEventPoolSize()I
    .locals 1

    .line 145
    iget v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxEventPoolSize:I

    return v0
.end method

.method public getQueuedEvents()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public initialize()V
    .locals 4

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "EventManagerImpl has already been initialized.  Bypassing..."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    return-void

    :cond_0
    const-wide/16 v2, 0x0

    .line 58
    iput-wide v2, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->firstEventTimestamp:J

    .line 60
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsRecorded:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 61
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->eventsEjected:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 63
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->empty()V

    return-void
.end method

.method public isEventTypeReserved(Ljava/lang/String;)Z
    .locals 4

    .line 183
    sget-object v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->RESERVED_EVENT_TYPES:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    sget-object v1, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Event type name ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] is reserved and will be ignored."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_0
    return v0
.end method

.method public isEventTypeValid(Ljava/lang/String;)Z
    .locals 4

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-string v0, "^[\\p{L}\\p{Nd} _:.]+$"

    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    .line 176
    sget-object v1, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Event type name ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] is invalid and will be ignored. Custom event types may only include alphanumeric, \' \', \'.\', \':\' or \'_\' characters."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_2
    return v0
.end method

.method public isMaxEventBufferTimeExceeded()Z
    .locals 6

    .line 131
    iget-wide v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->firstEventTimestamp:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v3, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->firstEventTimestamp:J

    sub-long/2addr v0, v3

    iget v3, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxBufferTimeInSec:I

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v3, v3

    cmp-long v5, v0, v3

    if-lez v5, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2

    :cond_1
    return v2
.end method

.method public isMaxEventPoolSizeExceeded()Z
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxEventPoolSize:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isTransmitRequired()Z
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->isMaxEventBufferTimeExceeded()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setMaxEventBufferTime(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxBufferTimeInSec:I

    return-void
.end method

.method public setMaxEventPoolSize(I)V
    .locals 0

    .line 150
    iput p1, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->maxEventPoolSize:I

    return-void
.end method

.method public shutdown()V
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public size()I
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->events:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
