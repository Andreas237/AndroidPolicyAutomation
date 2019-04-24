.class public Lo/cfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cck;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:I

.field private c:Z

.field private d:Landroid/content/Context;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/cfo;->b:I

    .line 43
    new-instance v0, Lo/cfo$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cfo$1;-><init>(Lo/cfo;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cfo;->a:Landroid/os/Handler;

    .line 53
    iput-object p1, p0, Lo/cfo;->d:Landroid/content/Context;

    .line 54
    iput p2, p0, Lo/cfo;->b:I

    .line 55
    iput-boolean p3, p0, Lo/cfo;->e:Z

    .line 56
    invoke-static {}, Lo/dbf;->m()Z

    move-result v0

    iput-boolean v0, p0, Lo/cfo;->c:Z

    .line 57
    return-void
.end method

.method private a()Landroid/app/Notification;
    .locals 6

    .line 61
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createHealthNotification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v4

    .line 64
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_notification:I

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 67
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 68
    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/cfo;->c(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 70
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 71
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 73
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    .line 74
    const-string v0, "Track_HealthSportingNotificationHelper"

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 77
    :cond_0
    invoke-virtual {v4}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v5

    .line 79
    return-object v5
.end method

.method static synthetic a(Lo/cfo;)Landroid/content/Context;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lo/cfo;Z)Z
    .locals 0

    .line 33
    iput-boolean p1, p0, Lo/cfo;->e:Z

    return p1
.end method

.method private b(Ljava/lang/String;)I
    .locals 5

    .line 241
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "--"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 244
    :catch_0
    move-exception v4

    .line 245
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parsePace "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/4 v0, 0x0

    return v0

    .line 251
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 118
    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 119
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHealthNotification mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void

    .line 122
    :cond_0
    invoke-direct {p0}, Lo/cfo;->a()Landroid/app/Notification;

    move-result-object v4

    .line 124
    if-nez v4, :cond_1

    .line 125
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHealthNotification mNotification == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void

    .line 131
    :cond_1
    iget-boolean v0, p0, Lo/cfo;->c:Z

    if-eqz v0, :cond_2

    .line 132
    new-instance v5, Landroid/widget/RemoteViews;

    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->notification_sporting_data:I

    invoke-direct {v5, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    .line 134
    :cond_2
    new-instance v5, Landroid/widget/RemoteViews;

    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->notification_sporting__data_lowversion:I

    invoke-direct {v5, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 137
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->icon:I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_notification:I

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 139
    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_homefragment_health_app:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 140
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->app_name_text:I

    invoke-virtual {v5, v0, v6}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 142
    iget-object v0, p0, Lo/cfo;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    .line 144
    invoke-direct {p0, p1}, Lo/cfo;->d(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v8, v0, v2

    .line 145
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_distance:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v8, v9, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 147
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 148
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_distance_unit:I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v7, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_1

    .line 150
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_distance_unit:I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v7, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 154
    :goto_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_duration:I

    invoke-virtual {v5, v0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 156
    iget v0, p0, Lo/cfo;->b:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_7

    .line 157
    if-eqz p3, :cond_4

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 158
    :cond_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace:I

    const-string v1, "--"

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_2

    .line 160
    :cond_5
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace:I

    invoke-virtual {v5, v0, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 162
    :goto_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 163
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace_unit:I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v7, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_4

    .line 166
    :cond_6
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace_unit:I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v7, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_4

    .line 169
    :cond_7
    const-string v0, "--"

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 170
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace:I

    const-string v1, "--"

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_3

    .line 172
    :cond_8
    invoke-direct {p0, p4}, Lo/cfo;->b(Ljava/lang/String;)I

    move-result v10

    .line 173
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace:I

    int-to-float v1, v10

    invoke-static {v1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 175
    :goto_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_speed_or_pace_unit:I

    const/16 v1, 0x8

    invoke-virtual {v5, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 184
    :goto_4
    iput-object v5, v4, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 186
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    const/16 v1, 0x271c

    invoke-virtual {v0, v1, v4}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 187
    return-void
.end method

.method private c(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 6

    .line 193
    if-nez p1, :cond_0

    .line 194
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object p1

    .line 197
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 198
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    .line 199
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    invoke-virtual {v5}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 200
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 201
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 202
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 203
    const-string v0, "mLaunchSource"

    const/4 v1, 0x5

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 204
    const/4 v0, 0x0

    const/high16 v1, 0x8000000

    invoke-static {p1, v0, v5, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 205
    :catch_0
    move-exception v4

    .line 206
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getContentIntent "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    const/high16 v2, 0x8000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/cfo;)Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lo/cfo;->e:Z

    return v0
.end method

.method private d(Ljava/lang/String;)D
    .locals 5

    .line 213
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    :try_start_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-double v0, v0

    return-wide v0

    .line 216
    :catch_0
    move-exception v4

    .line 217
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseTotalDistance "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method static synthetic d(Lo/cfo;I)I
    .locals 0

    .line 33
    iput p1, p0, Lo/cfo;->b:I

    return p1
.end method

.method static synthetic e(Lo/cfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cfo;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 260
    iget-object v0, p0, Lo/cfo;->a:Landroid/os/Handler;

    new-instance v1, Lo/cfo$5;

    invoke-direct {v1, p0}, Lo/cfo$5;-><init>(Lo/cfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 275
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .line 93
    iget-object v0, p0, Lo/cfo;->a:Landroid/os/Handler;

    new-instance v1, Lo/cfo$3;

    invoke-direct {v1, p0, p1}, Lo/cfo$3;-><init>(Lo/cfo;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 114
    return-void
.end method
