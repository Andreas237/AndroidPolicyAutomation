.class public Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;
.super Ljava/lang/Object;
.source "KickstarterBonusReminderController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static REMINDER_ID:Ljava/lang/String; = "kickstarter_bonus_reminder"


# instance fields
.field private alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->context:Landroid/content/Context;

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 32
    iput-object p3, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 33
    iput-object p4, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 35
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ClientFlagsUpdated"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 36
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 9
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

    const-string p2, "ClientFlagsUpdated"

    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    sget-object p2, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->REMINDER_ID:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->kickstarterBonusExpiryTimestamp:Ljava/lang/Long;

    if-eqz p1, :cond_1

    .line 48
    invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    .line 50
    iget-object p2, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->kickstarterBonusExpiryTimestamp:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 p2, 0x1

    .line 53
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    const/16 p2, 0xb

    const/16 v0, -0xf

    .line 56
    invoke-virtual {p1, p2, v0}, Ljava/util/Calendar;->add(II)V

    .line 58
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    sub-long/2addr p1, v7

    const-wide/32 v0, 0xea60

    div-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 60
    iget-object v1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    sget-object v2, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->REMINDER_ID:Ljava/lang/String;

    long-to-int v3, p1

    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->context:Landroid/content/Context;

    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f110036

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->context:Landroid/content/Context;

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f1103a9

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    .line 60
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Z

    goto :goto_0

    :cond_0
    const-string p2, "WalkinControllerWalkinSucceededEvent"

    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    sget-object p2, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;->REMINDER_ID:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
