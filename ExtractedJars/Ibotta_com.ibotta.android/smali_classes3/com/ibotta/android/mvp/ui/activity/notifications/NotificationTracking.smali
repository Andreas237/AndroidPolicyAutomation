.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;
.super Ljava/lang/Object;
.source "NotificationTracking.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private notificationDurationStart:J

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 2
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 26
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->notificationDurationStart:J

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method private transformMessageDataMap(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 77
    :try_start_0
    sget-object v2, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    invoke-virtual {v2, v1, v0}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to parse Map with this exception: %1$s"

    .line 79
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private updateEventFromRow(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 1

    .line 117
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getListIndex()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 118
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setNotificationText(Ljava/lang/String;)V

    .line 119
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setNotificationType(Ljava/lang/String;)V

    .line 120
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setStatus(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setNotificationId(Ljava/lang/Integer;)V

    .line 122
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getMessageData()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->transformMessageDataMap(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setMessageData(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getAmount()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAmount(F)V

    return-void
.end method


# virtual methods
.method public onBellClicked(Ljava/lang/String;)V
    .locals 4

    .line 35
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;-><init>()V

    .line 36
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NOTIFICATIONS_BELL_CLICK:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 v1, 0x1

    .line 37
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 38
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setEntryScreen(Ljava/lang/String;)V

    const-string v2, "Tracking Notification Bell Clicked : %1$s"

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v1, v3

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public onItemClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;Ljava/lang/String;I)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    .line 48
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 58
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;-><init>()V

    if-nez p3, :cond_0

    .line 60
    sget-object p3, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MINE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    goto :goto_0

    .line 54
    :pswitch_0
    new-instance p3, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {p3}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 55
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NOTIFICATIONS:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p3, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    goto :goto_1

    .line 50
    :pswitch_1
    new-instance p3, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-direct {p3}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;-><init>()V

    .line 51
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NOTIFICATIONS:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p3, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    goto :goto_1

    .line 60
    :cond_0
    sget-object p3, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->TEAMMATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 59
    :goto_0
    invoke-virtual {v0, p3}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    move-object p3, v0

    :goto_1
    const/4 v0, 0x1

    .line 63
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    if-eqz p2, :cond_1

    const-string v1, "."

    .line 64
    invoke-virtual {p2, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_1
    const/4 p2, 0x0

    :goto_2
    invoke-virtual {p3, p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setExitScreen(Ljava/lang/String;)V

    .line 65
    invoke-direct {p0, p3, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->updateEventFromRow(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    const-string p1, "Tracking Notification Item Clicked: %1$s"

    .line 67
    new-array p2, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p3}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getEventContext()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v0

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, p3}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onNavClicked(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;)V
    .locals 4

    .line 87
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;-><init>()V

    .line 88
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    if-ne p1, v1, :cond_0

    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MINE_NAV:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->TEAMMATES_NAV:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 p1, 0x1

    .line 89
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Notification Nav Clicked: %1$s"

    .line 91
    new-array p1, p1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->getEventContext()Ljava/lang/String;

    move-result-object v3

    aput-object v3, p1, v2

    invoke-static {v1, p1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public onNotificationItemViewed(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 5

    .line 97
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;-><init>()V

    .line 99
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    if-ne p1, v1, :cond_0

    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MINE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->TEAMMATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 98
    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 p1, 0x0

    .line 100
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 102
    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->updateEventFromRow(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    .line 104
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->notificationDurationStart:J

    sub-long/2addr v1, v3

    long-to-float p2, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p2, v1

    .line 106
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->setDuration(Ljava/lang/Float;)V

    const-string p2, "Tracking Notification Item Viewed: %1$s"

    const/4 v1, 0x1

    .line 107
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;->getEventContext()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, p1

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public updateNotificationDurationStart()V
    .locals 2

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->notificationDurationStart:J

    return-void
.end method
