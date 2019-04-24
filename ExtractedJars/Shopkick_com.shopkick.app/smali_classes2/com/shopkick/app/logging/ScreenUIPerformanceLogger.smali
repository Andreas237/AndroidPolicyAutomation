.class public Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;
.super Ljava/lang/Object;
.source "ScreenUIPerformanceLogger.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;
    }
.end annotation


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private uiEvents:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 84
    iput-object p3, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 85
    iput-object p2, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 86
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private enablePerformanceLogging()Z
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePerformanceLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private logScreenUIPerformance(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;Ljava/lang/Integer;J)V
    .locals 2

    .line 158
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x4e2c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 159
    invoke-static {p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->access$000(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 160
    invoke-static {p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->access$100(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginElement(Ljava/lang/Integer;)V

    .line 161
    invoke-static {p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->access$200(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 162
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDestElement(Ljava/lang/Integer;)V

    long-to-int p1, p3

    .line 163
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDurationMs(Ljava/lang/Integer;)V

    .line 164
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private recordUIEventEndHelper(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;Ljava/lang/Integer;)V
    .locals 4

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    invoke-direct {p0, p1, p2, v2, v3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->logScreenUIPerformance(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;Ljava/lang/Integer;J)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public getStartTimeForUIEventKey(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)J
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
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

    .line 173
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 174
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public recordUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 131
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 134
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    invoke-direct {v0, p1, p2}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 p1, 0x0

    .line 135
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventEndHelper(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;Ljava/lang/Integer;)V

    return-void
.end method

.method public recordUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 139
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 142
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 p1, 0x0

    .line 143
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventEndHelper(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;Ljava/lang/Integer;)V

    return-void
.end method

.method public recordUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 123
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 126
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 127
    invoke-direct {p0, v0, p4}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventEndHelper(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;Ljava/lang/Integer;)V

    return-void
.end method

.method public recordUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3

    .line 104
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 107
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    invoke-direct {v0, p1, p2}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public recordUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 112
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 115
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public recordUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    .line 96
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->enablePerformanceLogging()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->uiEvents:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
