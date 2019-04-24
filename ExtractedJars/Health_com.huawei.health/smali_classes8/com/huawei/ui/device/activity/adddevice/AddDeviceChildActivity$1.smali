.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 655
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 5

    .line 658
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u66f4\u65b0index\u6587\u4ef6 status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Lo/eba;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 661
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->a()V

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 664
    :cond_0
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 666
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 667
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0index\u672a\u6210\u529f \u4e0d\u66f4\u65b0UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 670
    const/16 v0, 0x32

    iput v0, v4, Landroid/os/Message;->what:I

    .line 671
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 672
    goto :goto_0

    :cond_2
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, -0x5

    if-ne v1, v0, :cond_3

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 675
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    const/16 v1, 0x46

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->removeMessages(I)V

    .line 676
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 677
    const/16 v0, 0x50

    iput v0, v4, Landroid/os/Message;->what:I

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 679
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u670d\u52a1\u5668\u672a\u627e\u5230\u8d44\u6e90"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    :cond_3
    :goto_0
    return-void
.end method
