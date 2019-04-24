.class public Lo/amu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 7

    .line 20
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 21
    const-string v0, "Step_STNF"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushSTInvliadNotification context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-void

    .line 25
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 26
    const-string v0, "com.huawei.health.MainActivity"

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    const/4 v0, 0x0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p0, v0, v4, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 28
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v6

    .line 29
    sget v0, Lcom/huawei/plugindaemon/R$drawable;->ic_health_notification:I

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_server_token_invalid_relogin_title:I

    .line 30
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_server_token_invalid_relogin_content:I

    .line 31
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 32
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    new-instance v1, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v1}, Landroid/app/Notification$BigTextStyle;-><init>()V

    sget v2, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_server_token_invalid_relogin_content:I

    .line 33
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 34
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 35
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    const/16 v2, 0x79

    invoke-virtual {v0, v2, v1}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 36
    const-string v0, "Step_STNF"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNotification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    return-void
.end method
