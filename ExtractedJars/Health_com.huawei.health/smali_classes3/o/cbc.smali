.class public Lo/cbc;
.super Lo/cao;
.source "SourceFile"


# instance fields
.field private a:Lo/ald;

.field private c:Z

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Lo/cao;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbc;->c:Z

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbc;->a:Lo/ald;

    .line 69
    iput-object p1, p0, Lo/cbc;->d:Landroid/content/Context;

    .line 70
    return-void
.end method

.method private d(II)Landroid/app/Notification;
    .locals 9

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 90
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cbh;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 92
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    int-to-float v1, p2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/amv;->e(Landroid/content/Context;DII)Ljava/lang/String;

    move-result-object v6

    .line 93
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/cbh;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 96
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v7

    .line 100
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cbb;->b(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 102
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 103
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cbh;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 104
    new-instance v8, Landroid/content/Intent;

    const-string v0, "steps_notify_delete"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    const/16 v1, 0x271a

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v8, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 108
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 109
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 110
    invoke-virtual {v7, v5}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 112
    invoke-virtual {v7}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private d(III)Landroid/app/Notification;
    .locals 11

    .line 121
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cbh;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 122
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cbh;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    .line 124
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v6

    .line 125
    sget v0, Lcom/huawei/plugindaemon/R$drawable;->ic_health_notification:I

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 128
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 129
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cbh;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 130
    new-instance v7, Landroid/content/Intent;

    const-string v0, "steps_notify_delete"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    const/16 v1, 0x271a

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v7, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 134
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 135
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 136
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    .line 137
    const-string v0, "Step_HSNH"

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 140
    :cond_0
    new-instance v8, Landroid/widget/RemoteViews;

    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$layout;->notify:I

    invoke-direct {v8, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 141
    sget v0, Lcom/huawei/plugindaemon/R$id;->icon:I

    sget v1, Lcom/huawei/plugindaemon/R$drawable;->ic_health_notification:I

    invoke-virtual {v8, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 143
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_hw_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 144
    sget v0, Lcom/huawei/plugindaemon/R$id;->app_name_text:I

    invoke-virtual {v8, v0, v9}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 145
    sget v0, Lcom/huawei/plugindaemon/R$id;->textStep:I

    invoke-virtual {v8, v0, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 146
    sget v0, Lcom/huawei/plugindaemon/R$id;->textStepUnit:I

    iget-object v1, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_hw_phonecounter_widget_step_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 147
    sget v0, Lcom/huawei/plugindaemon/R$id;->textKcal:I

    invoke-virtual {v8, v0, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 148
    sget v0, Lcom/huawei/plugindaemon/R$id;->textKcalUnit:I

    iget-object v1, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_hw_phonecounter_widget_kalo_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 150
    const/4 v0, -0x1

    if-eq v0, p3, :cond_3

    .line 152
    int-to-double v0, p1

    int-to-double v2, p3

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v10, v0

    .line 153
    const/16 v0, 0x64

    if-ne v10, v0, :cond_1

    if-ge p1, p3, :cond_1

    .line 154
    const/16 v10, 0x63

    goto :goto_0

    .line 155
    :cond_1
    const/16 v0, 0x64

    if-le v10, v0, :cond_2

    .line 156
    const/16 v10, 0x64

    .line 158
    :cond_2
    :goto_0
    const-string v0, "Step_HSNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "completedGoal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",stepGoal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    sget v0, Lcom/huawei/plugindaemon/R$id;->right_icon_text:I

    iget-object v1, p0, Lo/cbc;->d:Landroid/content/Context;

    invoke-static {v1, v10}, Lo/cbh;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 160
    sget v0, Lcom/huawei/plugindaemon/R$id;->right_icon:I

    invoke-static {v10}, Lo/cbh;->a(I)I

    move-result v1

    invoke-virtual {v8, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 164
    :cond_3
    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v10

    .line 165
    iput-object v8, v10, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 167
    return-object v10
.end method

.method private e()V
    .locals 4

    .line 77
    const-string v0, "Step_HSNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeNotification..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-le v0, v1, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 79
    :cond_0
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Service;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Service;->stopForeground(Z)V

    .line 81
    :cond_1
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    const/16 v1, 0x271a

    invoke-static {v0, v1}, Lo/cbh;->d(Landroid/content/Context;I)V

    .line 82
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .line 63
    iget-object v0, p0, Lo/cbc;->a:Lo/ald;

    invoke-virtual {p0, v0}, Lo/cbc;->c(Lo/ald;)V

    .line 64
    return-void
.end method

.method public b()V
    .locals 2

    .line 56
    invoke-super {p0}, Lo/cao;->b()V

    .line 57
    invoke-direct {p0}, Lo/cbc;->e()V

    .line 58
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/amy;->c(Landroid/content/Context;Z)V

    .line 59
    return-void
.end method

.method public b(III)V
    .locals 5

    .line 179
    const-string v0, "Step_HSNH"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upDateHealthNotification()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-static {}, Lo/caw;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    invoke-direct {p0, p1, p2, p3}, Lo/cbc;->d(III)Landroid/app/Notification;

    move-result-object v4

    goto :goto_0

    .line 188
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/cbc;->d(II)Landroid/app/Notification;

    move-result-object v4

    .line 191
    :goto_0
    iget-boolean v0, p0, Lo/cbc;->c:Z

    if-eqz v0, :cond_1

    .line 192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbc;->c:Z

    .line 193
    const-string v0, "Step_HSNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startNotification..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Service;

    const/16 v1, 0x271a

    invoke-virtual {v0, v1, v4}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 196
    return-void

    .line 199
    :cond_1
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    const/16 v1, 0x271a

    invoke-virtual {v0, v1, v4}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 200
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .line 32
    invoke-super {p0, p1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_0

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbc;->c:Z

    .line 37
    :cond_0
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbc;->c:Z

    .line 40
    :cond_1
    iget-object v0, p0, Lo/cbc;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/amy;->c(Landroid/content/Context;Z)V

    .line 41
    return-void
.end method

.method protected c(Lo/ald;)V
    .locals 7

    .line 45
    move-object v4, p0

    monitor-enter v4

    .line 47
    :try_start_0
    invoke-virtual {p0, p1}, Lo/cbc;->e(Lo/ald;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 48
    :catch_0
    move-exception v5

    .line 49
    const-string v0, "Step_HSNH"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepsNotification refresh exception!!!:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 52
    :goto_1
    return-void
.end method

.method public e(Lo/ald;)V
    .locals 3

    .line 207
    if-nez p1, :cond_0

    .line 208
    return-void

    .line 210
    :cond_0
    iput-object p1, p0, Lo/cbc;->a:Lo/ald;

    .line 212
    iget v0, p1, Lo/ald;->a:I

    iget v1, p1, Lo/ald;->d:I

    iget v2, p1, Lo/ald;->c:I

    invoke-virtual {p0, v0, v1, v2}, Lo/cbc;->b(III)V

    .line 213
    return-void
.end method
