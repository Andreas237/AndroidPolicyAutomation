.class public final Lcom/huawei/updatesdk/UpdateSdkAPI;
.super Ljava/lang/Object;


# static fields
.field private static final CLIENT_OTA_CHECK_DATE:Ljava/lang/String; = "lastCheckDate"

.field public static final TAG:Ljava/lang/String; = "UpdateSdk"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkAppUpdate(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;ZZ)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/huawei/updatesdk/UpdateSdkAPI;->init(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/updatesdk/service/otaupdate/c;

    invoke-direct {v2, p0, p1, p3}, Lcom/huawei/updatesdk/service/otaupdate/c;-><init>(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;Z)V

    invoke-virtual {v2, p2}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Z)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v0, "status"

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-interface {p1, v2}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    :cond_2
    const-string v0, "no_available_network_prompt_toast"

    invoke-static {p0, v0}, Lcom/huawei/updatesdk/support/f/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method public static checkClientOTAUpdate(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;ZIZ)V
    .locals 10

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {p0}, Lcom/huawei/updatesdk/UpdateSdkAPI;->init(Landroid/content/Context;)V

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {}, Lcom/huawei/updatesdk/support/e/a;->a()Lcom/huawei/updatesdk/support/e/a;

    move-result-object v6

    const-string v0, "lastCheckDate"

    const-wide/16 v1, 0x0

    invoke-virtual {v6, v0, v1, v2}, Lcom/huawei/updatesdk/support/e/a;->b(Ljava/lang/String;J)J

    move-result-wide v7

    int-to-long v0, p3

    add-long/2addr v0, v7

    cmp-long v0, v4, v0

    if-ltz v0, :cond_2

    new-instance v9, Lcom/huawei/updatesdk/service/otaupdate/c;

    invoke-direct {v9, p0, p1, p4}, Lcom/huawei/updatesdk/service/otaupdate/c;-><init>(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;Z)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;->b(Z)V

    invoke-virtual {v9, p2}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Z)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v9, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    const-string v0, "lastCheckDate"

    invoke-virtual {v6, v0, v4, v5}, Lcom/huawei/updatesdk/support/e/a;->a(Ljava/lang/String;J)V

    :cond_2
    return-void
.end method

.method public static checkTargetAppUpdate(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;)V
    .locals 3

    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v0, "status"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-interface {p2, v2}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    :cond_1
    return-void

    :cond_2
    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lcom/huawei/updatesdk/UpdateSdkAPI;->init(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/updatesdk/service/otaupdate/c;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p2, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;-><init>(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;Z)V

    invoke-virtual {v2, p1}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v0, "status"

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-interface {p2, v2}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static init(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/service/a/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/a/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/service/a/c;->b()Z

    move-result v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Z)V

    invoke-static {p0}, Lcom/huawei/updatesdk/support/b/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/b/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/b/a/a;->a()V

    return-void
.end method

.method public static releaseCallBack()V
    .locals 2

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/b;->a()Lcom/huawei/updatesdk/service/otaupdate/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/b;->a(Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;)V

    return-void
.end method

.method public static showUpdateDialog(Landroid/content/Context;Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;Z)V
    .locals 6

    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/updatesdk/service/otaupdate/AppUpdateActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "app_update_parm"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "app_must_btn"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const/high16 v0, 0x10000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_0
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "UpdateSdk"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "go AppUpdateActivity error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
