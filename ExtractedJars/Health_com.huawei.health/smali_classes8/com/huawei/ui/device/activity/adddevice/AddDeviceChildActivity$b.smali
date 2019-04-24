.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field b:Lo/eok;

.field final synthetic e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eok;)V
    .locals 0

    .line 1663
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1664
    iput-object p2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->b:Lo/eok;

    .line 1665
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1668
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyOnClickListenerAndroidWear(): item.getID()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->b:Lo/eok;

    invoke-virtual {v3}, Lo/eok;->i()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1669
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->b:Lo/eok;

    invoke-virtual {v1}, Lo/eok;->i()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I

    .line 1670
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/dpb;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1671
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/dpa;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1672
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1673
    return-void

    .line 1675
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1676
    return-void
.end method
