.class public Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;
.super Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
.source "SessionEvent.java"


# annotations
.annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
    tableName = "session_event"
.end annotation


# static fields
.field private static ACTIVE_TIME:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;-><init>()V

    return-void
.end method

.method private static newSessionEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;
    .locals 3

    .line 26
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;-><init>()V

    .line 28
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 p0, 0x0

    .line 29
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setReferrer(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setEventAt(J)V

    const/4 p0, 0x1

    .line 31
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setCounter(I)V

    .line 32
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setDuration(Ljava/lang/Float;)V

    .line 33
    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setLocationPermissionStatus(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, p3}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->setPushPermissionStatus(Ljava/lang/String;)V

    return-object v0
.end method

.method public static trackAppActive(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->ACTIVE_TIME:J

    .line 16
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ACTIVE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->newSessionEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackAppInactive(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->ACTIVE_TIME:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-float v0, v0

    .line 21
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 22
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->INACTIVE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {v1, v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->newSessionEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method public getPrime1()I
    .locals 1

    const/16 v0, 0xfa3

    return v0
.end method

.method public getPrime2()I
    .locals 1

    const/16 v0, 0x127d

    return v0
.end method

.method public toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
    .locals 1

    .line 41
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SESSION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-super {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toTrackEvent(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    move-result-object v0

    return-object v0
.end method
