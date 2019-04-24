.class Lcom/huawei/ui/homehealth/HomeFragment$8;
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
.field final synthetic d:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 1347
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$8;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1350
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    const-string v0, "com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION"

    .line 1351
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 1350
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1353
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after sync data,time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-static {v2}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1355
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi_weight_device"

    const-string v2, "weight_notify_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1357
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1358
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "don\'t  show weight measure notify...isShowNotify:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1359
    return-void

    .line 1362
    :cond_0
    new-instance v5, Lcom/huawei/ui/homehealth/HomeFragment$8$4;

    invoke-direct {v5, p0}, Lcom/huawei/ui/homehealth/HomeFragment$8$4;-><init>(Lcom/huawei/ui/homehealth/HomeFragment$8;)V

    .line 1369
    invoke-static {v5}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 1371
    :cond_1
    return-void
.end method
