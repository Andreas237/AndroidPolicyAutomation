.class Lcom/huawei/ui/homehealth/HomeFragment$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/HomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 1290
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$4;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1294
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "before onReceive WifiUserInfoBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1295
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, "com.huawei.health.action.ACTION_WIFI_USERINFO_ACTION"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1296
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive WifiUserInfoBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1298
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$4;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$4$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$4$4;-><init>(Lcom/huawei/ui/homehealth/HomeFragment$4;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Landroid/content/Context;Lo/egg;)V

    goto :goto_0

    .line 1313
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    const-string v0, "com.huawei.health.action.ACTION_WIFI_DEVICE_UNIT_ACTION"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1314
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive WifiUnitBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$4;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ahu;->e(Landroid/content/Context;)V

    goto :goto_0

    .line 1316
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    const-string v0, "com.huawei.health.action.ACTION_WIFI_OTA_UPDATE_ACTION"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1317
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$4;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ahs;->d(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 1319
    :cond_2
    :goto_0
    return-void
.end method
