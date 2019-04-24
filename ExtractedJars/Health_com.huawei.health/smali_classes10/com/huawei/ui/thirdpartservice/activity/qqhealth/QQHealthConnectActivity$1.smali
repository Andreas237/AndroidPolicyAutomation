.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 81
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 82
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->eb:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network is not Connected "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_network_connect_error:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 88
    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/SystemUtils;->checkMobileQQ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQHealthConnectActivity onClick() loginQQ()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c()V

    goto :goto_0

    .line 95
    :cond_1
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "System is not install QQ App."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const-string v0, "market://details?id=com.tencent.mobileqq"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 98
    :try_start_0
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 99
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_0

    .line 101
    :catch_0
    move-exception v6

    .line 102
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start qq error e is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_common_notification_know_tips:I

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_data_share_app_not_install:I

    invoke-static {v0, v1, v2}, Lo/fjm;->e(Landroid/content/Context;II)V

    .line 106
    :goto_0
    return-void
.end method
