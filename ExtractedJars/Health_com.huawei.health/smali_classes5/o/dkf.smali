.class public Lo/dkf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/app/Notification$Builder;

.field private d:Landroid/app/Notification;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkf;->d:Landroid/app/Notification;

    return-void
.end method

.method private e(Landroid/content/Context;II)Landroid/app/Notification;
    .locals 7

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 53
    invoke-static {p1, v4}, Lo/cbh;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 55
    int-to-float v0, p3

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lo/amv;->e(Landroid/content/Context;DII)Ljava/lang/String;

    move-result-object v5

    .line 56
    invoke-static {p1, v5}, Lo/cbh;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 58
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    .line 60
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-static {p1, v0}, Lo/cbb;->b(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 61
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 62
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 63
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-static {p1}, Lo/cbh;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 64
    new-instance v6, Landroid/content/Intent;

    const-string v0, "steps_notify_delete"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/16 v1, 0x271a

    const/high16 v2, 0x8000000

    invoke-static {p1, v1, v6, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 68
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 69
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 71
    :cond_0
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 73
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/content/Context;III)Landroid/app/Notification;
    .locals 9

    .line 81
    invoke-static {p1, p2}, Lo/cbh;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 82
    invoke-static {p1, p3}, Lo/cbh;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    .line 83
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    if-nez v0, :cond_0

    .line 84
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    .line 85
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    sget v1, Lcom/huawei/hwdevicemgr/R$drawable;->ic_health_notification:I

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 86
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 87
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 88
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-static {p1}, Lo/cbh;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 89
    new-instance v6, Landroid/content/Intent;

    const-string v0, "steps_notify_delete"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/16 v1, 0x271a

    const/high16 v2, 0x8000000

    invoke-static {p1, v1, v6, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 93
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 94
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 95
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    const-string v1, "NotificationUtil"

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 97
    :cond_0
    new-instance v6, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$layout;->notify:I

    invoke-direct {v6, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 98
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->icon:I

    sget v1, Lcom/huawei/hwdevicemgr/R$drawable;->ic_health_notification:I

    invoke-virtual {v6, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->IDS_plugindameon_hw_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 101
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->app_name_text:I

    invoke-virtual {v6, v0, v7}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 102
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->textStep:I

    invoke-virtual {v6, v0, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 103
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->textStepUnit:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwdevicemgr/R$string;->IDS_plugindameon_hw_phonecounter_widget_step_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 104
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->textKcal:I

    invoke-virtual {v6, v0, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 105
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->textKcalUnit:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwdevicemgr/R$string;->IDS_plugindameon_hw_phonecounter_widget_kalo_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 107
    const/4 v0, -0x1

    if-eq v0, p4, :cond_3

    .line 109
    int-to-double v0, p2

    int-to-double v2, p4

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v8, v0

    .line 110
    const/16 v0, 0x64

    if-ne v8, v0, :cond_1

    if-ge p2, p4, :cond_1

    .line 111
    const/16 v8, 0x63

    goto :goto_0

    .line 112
    :cond_1
    const/16 v0, 0x64

    if-le v8, v0, :cond_2

    .line 113
    const/16 v8, 0x64

    .line 115
    :cond_2
    :goto_0
    const-string v0, "NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "completedGoal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",stepGoal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->right_icon_text:I

    invoke-static {p1, v8}, Lo/cbh;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 117
    sget v0, Lcom/huawei/hwdevicemgr/R$id;->right_icon:I

    invoke-static {v8}, Lo/cbh;->a(I)I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 120
    :cond_3
    iget-object v0, p0, Lo/dkf;->c:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v8

    .line 121
    iput-object v6, v8, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 122
    return-object v8
.end method


# virtual methods
.method public d(Landroid/content/Context;III)V
    .locals 4

    .line 35
    const-string v0, "NotificationUtil"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upDateHealthNotification()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    invoke-static {}, Lo/caw;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dkf;->e(Landroid/content/Context;III)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lo/dkf;->d:Landroid/app/Notification;

    goto :goto_0

    .line 39
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/dkf;->e(Landroid/content/Context;II)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lo/dkf;->d:Landroid/app/Notification;

    .line 41
    :goto_0
    const-string v0, "NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startNotification..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    move-object v0, p1

    check-cast v0, Landroid/app/Service;

    iget-object v1, p0, Lo/dkf;->d:Landroid/app/Notification;

    const/16 v2, 0x271a

    invoke-virtual {v0, v2, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 43
    return-void
.end method
