.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 5

    .line 550
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "regDeviceInfoConfigListener success type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",changeType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    const/16 v0, 0x66

    if-ne v0, p1, :cond_0

    const-string v0, "custom.UserPreference_HeartZone_Config"

    .line 553
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 554
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regDeviceInfoConfigListener send HeartZoneConfig to device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_RECEIVE_SEND_HEART_CONFIG"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 557
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 558
    goto/16 :goto_0

    :cond_0
    const/16 v0, 0x64

    if-ne v0, p1, :cond_1

    .line 559
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regDeviceInfoConfigListener send UserInfo to device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_RECEIVE_SEND_HEIGHT_WEIGHT"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 561
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 562
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 563
    goto :goto_0

    :cond_1
    const/16 v0, 0x65

    if-ne v0, p1, :cond_2

    .line 564
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regDeviceInfoConfigListener send GoalInfo to device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_RECEIVE_SEND_SPORT_GOAL"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 566
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 567
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 569
    :cond_2
    :goto_0
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 539
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regDeviceInfoConfigListener onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 541
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regDeviceInfoConfigListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0, p1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$802(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Ljava/util/List;)Ljava/util/List;

    .line 546
    :cond_0
    return-void
.end method
