.class Lcom/huawei/bone/ui/setting/NotificationService$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/ui/setting/NotificationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/bone/ui/setting/NotificationService;


# direct methods
.method constructor <init>(Lcom/huawei/bone/ui/setting/NotificationService;)V
    .locals 0

    .line 459
    iput-object p1, p0, Lcom/huawei/bone/ui/setting/NotificationService$3;->c:Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 463
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 464
    return-void

    .line 466
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 467
    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_TIME_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 468
    const-string v0, "NotificationService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_NOTIFICATION_TIME_CHANGED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 469
    :cond_1
    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_AUTHORIZED_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 470
    const-string v0, "package_name"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 471
    const-string v0, "authorized_flag"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 472
    const-string v0, "NotificationService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NotificationAppListInfo.ACTION_NOTIFICATION_AUTHORIZED_CHANGED, mPushApp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 474
    const/4 v0, 0x1

    if-ne v0, v6, :cond_2

    .line 475
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationService$3;->c:Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationService;->a(Lcom/huawei/bone/ui/setting/NotificationService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 476
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationService$3;->c:Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationService;->a(Lcom/huawei/bone/ui/setting/NotificationService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 479
    :cond_2
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationService$3;->c:Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationService;->a(Lcom/huawei/bone/ui/setting/NotificationService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 480
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationService$3;->c:Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationService;->a(Lcom/huawei/bone/ui/setting/NotificationService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 485
    :cond_3
    :goto_0
    return-void
.end method
