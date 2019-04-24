.class public Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;
.super Ljava/lang/Object;
.source "ScreenTransitionPerformanceLogger.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;,
        Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;
    }
.end annotation


# instance fields
.field private appLaunchRecordedForSession:Z

.field private appLaunchTime:J

.field private autoTransitionStartTime:J

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private destinationScreen:Ljava/lang/Integer;

.field private endTime:J

.field private isAutoTransition:Z

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private originElement:Ljava/lang/Integer;

.field private originScreen:Ljava/lang/Integer;

.field private performClickRecords:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;",
            ">;"
        }
    .end annotation
.end field

.field private screenName:Ljava/lang/String;

.field private startTime:J


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 48
    iput-object p2, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 49
    iput-object p3, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 50
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->performClickRecords:Ljava/util/ArrayList;

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private enablePerformanceLogging()Z
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePerformanceLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private logAppLaunchTime(Ljava/lang/Integer;)V
    .locals 5

    .line 174
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x668a0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 175
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchTime:J

    sub-long/2addr v1, v3

    long-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSplashScreenDelay(Ljava/lang/Double;)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logScreenTransitionPerformance()V
    .locals 5

    .line 181
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x4e2b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 182
    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originScreen:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginScreen(Ljava/lang/Integer;)V

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originElement:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginElement(Ljava/lang/Integer;)V

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->destinationScreen:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDestScreenV2(Ljava/lang/Integer;)V

    .line 185
    iget-wide v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->endTime:J

    iget-wide v3, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->startTime:J

    sub-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDurationMs(Ljava/lang/Integer;)V

    .line 186
    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->screenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreenName(Ljava/lang/String;)V

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private reset()V
    .locals 2

    const/4 v0, 0x0

    .line 165
    iput-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originScreen:Ljava/lang/Integer;

    .line 166
    iput-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originElement:Ljava/lang/Integer;

    .line 167
    iput-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->destinationScreen:Ljava/lang/Integer;

    const-wide/16 v0, 0x0

    .line 168
    iput-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->startTime:J

    .line 169
    iput-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->endTime:J

    const/4 v0, 0x0

    .line 170
    iput-boolean v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->isAutoTransition:Z

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public isAppLaunchRecordedForSession()Z
    .locals 1

    .line 138
    iget-boolean v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchRecordedForSession:Z

    return v0
.end method

.method public maybeCancelAutoTransitionLog(I)V
    .locals 4

    .line 80
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 83
    :cond_0
    iget-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->autoTransitionStartTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 84
    iput-wide v2, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->autoTransitionStartTime:J

    .line 86
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public maybeRecordAppLaunchSIP(Ljava/lang/Integer;)Z
    .locals 6

    .line 152
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 155
    :cond_0
    iget-wide v2, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchTime:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    .line 156
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->logAppLaunchTime(Ljava/lang/Integer;)V

    .line 157
    iput-wide v4, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchTime:J

    const/4 p1, 0x1

    .line 158
    iput-boolean p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchRecordedForSession:Z

    return p1

    :cond_1
    return v1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "AppActivityManagerAppBackgroundedEvent"

    .line 196
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 197
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->reset()V

    const/4 p1, 0x0

    .line 198
    iput-boolean p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchRecordedForSession:Z

    :cond_0
    return-void
.end method

.method public recordAppLaunch(J)V
    .locals 4

    .line 144
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    iput-wide p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->appLaunchTime:J

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public recordGoToScreen(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 5

    .line 92
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 95
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->reset()V

    .line 96
    iget-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->autoTransitionStartTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    if-nez p2, :cond_1

    .line 99
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originScreen:Ljava/lang/Integer;

    .line 100
    iput-object p3, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->destinationScreen:Ljava/lang/Integer;

    .line 101
    iput-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->startTime:J

    const/4 p1, 0x1

    .line 104
    iput-boolean p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->isAutoTransition:Z

    .line 106
    :cond_1
    iput-wide v2, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->autoTransitionStartTime:J

    goto :goto_1

    .line 108
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->performClickRecords:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;

    if-eqz p1, :cond_3

    .line 109
    invoke-static {v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$200(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    invoke-static {v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$100(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getElement()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 110
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originScreen:Ljava/lang/Integer;

    .line 111
    iput-object p2, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originElement:Ljava/lang/Integer;

    .line 112
    iput-object p3, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->destinationScreen:Ljava/lang/Integer;

    .line 113
    invoke-static {v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$100(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getScreenName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->screenName:Ljava/lang/String;

    .line 114
    invoke-static {v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$300(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->startTime:J

    goto :goto_0

    .line 117
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->performClickRecords:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :goto_1
    return-void
.end method

.method public recordPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/Integer;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getElement()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 64
    new-instance v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;-><init>(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$1;)V

    .line 65
    invoke-static {v0, p1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$102(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    .line 66
    invoke-static {v0, p2}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$202(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->access$302(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;J)J

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->performClickRecords:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public recordScreenResponsive(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3

    .line 122
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originScreen:Ljava/lang/Integer;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v2

    .line 126
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->isAutoTransition:Z

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    move p2, v1

    goto :goto_1

    :cond_2
    move p2, v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->originElement:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 127
    invoke-virtual {v0, p2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    move p2, v1

    goto :goto_1

    :cond_4
    move p2, v2

    .line 128
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->destinationScreen:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    move v1, v2

    :goto_2
    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    if-eqz v1, :cond_6

    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->endTime:J

    .line 132
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->logScreenTransitionPerformance()V

    .line 133
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->reset()V

    :cond_6
    return-void
.end method

.method public startAutoTransition()V
    .locals 2

    .line 73
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 76
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->autoTransitionStartTime:J

    return-void
.end method
