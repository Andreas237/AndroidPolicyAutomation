.class public interface abstract Lcom/newrelic/agent/android/analytics/EventManager;
.super Ljava/lang/Object;
.source "EventManager.java"


# static fields
.field public static final RESERVED_EVENT_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/analytics/EventManager;->RESERVED_EVENT_TYPES:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z
.end method

.method public abstract empty()V
.end method

.method public abstract getEventsEjected()I
.end method

.method public abstract getEventsRecorded()I
.end method

.method public abstract getMaxEventBufferTime()I
.end method

.method public abstract getMaxEventPoolSize()I
.end method

.method public abstract getQueuedEvents()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract initialize()V
.end method

.method public abstract isMaxEventBufferTimeExceeded()Z
.end method

.method public abstract isMaxEventPoolSizeExceeded()Z
.end method

.method public abstract isTransmitRequired()Z
.end method

.method public abstract setMaxEventBufferTime(I)V
.end method

.method public abstract setMaxEventPoolSize(I)V
.end method

.method public abstract shutdown()V
.end method

.method public abstract size()I
.end method
