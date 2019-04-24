.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l()V
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

    .line 632
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$4;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 635
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " listNotifyDataSetChanged clickRYDeviceMore "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$4;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$4;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 638
    return-void
.end method
