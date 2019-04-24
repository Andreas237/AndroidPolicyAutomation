.class public Lcom/shopkick/app/util/AlarmScheduler;
.super Ljava/lang/Object;
.source "AlarmScheduler.java"


# static fields
.field private static REQUEST_CODE:I


# instance fields
.field private final context:Landroid/content/Context;

.field private final intentsById:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/util/AlarmScheduler;->context:Landroid/content/Context;

    .line 25
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    return-void
.end method

.method private setAlarm(JLandroid/app/PendingIntent;)V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->context:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 124
    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public cancel(Ljava/lang/String;)V
    .locals 3

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    .line 134
    iget-object v1, p0, Lcom/shopkick/app/util/AlarmScheduler;->context:Landroid/content/Context;

    const-string v2, "alarm"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    .line 135
    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->context:Landroid/content/Context;

    const-string v1, "notification"

    .line 139
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    const/4 v1, 0x0

    .line 140
    invoke-virtual {v0, p1, v1}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void
.end method

.method public cancelAllNotifications()V
    .locals 4

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 155
    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 156
    invoke-virtual {p0, v3}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public cancelByPrefix(Ljava/lang/String;)V
    .locals 5

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 145
    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 146
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 147
    invoke-virtual {p0, v3}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public exists(Ljava/lang/String;)Z
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Z
    .locals 8

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p5

    .line 38
    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result p1

    return p1
.end method

.method public scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 8

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    move v7, p6

    .line 47
    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result p1

    return p1
.end method

.method public scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 9

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    .line 57
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 12

    .line 74
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xc

    move v2, p2

    .line 75
    invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->add(II)V

    .line 78
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p8

    .line 77
    invoke-virtual/range {v2 .. v11}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAtTimestampMs(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public scheduleAtTimestampMs(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 99
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/shopkick/app/util/AlarmScheduler;->context:Landroid/content/Context;

    const-class v2, Lcom/shopkick/app/util/AlarmReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v1, "title"

    .line 100
    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p4, "statusMessage"

    .line 101
    invoke-virtual {v0, p4, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p4, "statusLongMessage"

    .line 102
    invoke-virtual {v0, p4, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p4, "skUrl"

    .line 103
    invoke-virtual {v0, p4, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p4, "toastMessage"

    .line 104
    invoke-virtual {v0, p4, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p4, "alarmType"

    .line 105
    invoke-virtual {v0, p4, p9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 108
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "alarm:"

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p4

    invoke-virtual {v0, p4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 p4, 0x1

    .line 109
    invoke-virtual {v0, p4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 111
    iget-object p5, p0, Lcom/shopkick/app/util/AlarmScheduler;->context:Landroid/content/Context;

    sget p6, Lcom/shopkick/app/util/AlarmScheduler;->REQUEST_CODE:I

    const/high16 p7, 0x8000000

    invoke-static {p5, p6, v0, p7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p5

    .line 116
    invoke-direct {p0, p2, p3, p5}, Lcom/shopkick/app/util/AlarmScheduler;->setAlarm(JLandroid/app/PendingIntent;)V

    .line 117
    iget-object p2, p0, Lcom/shopkick/app/util/AlarmScheduler;->intentsById:Ljava/util/HashMap;

    invoke-virtual {p2, p1, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return p4
.end method
