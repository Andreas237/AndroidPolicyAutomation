.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 585
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$3;->c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$3;->c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z

    .line 589
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " listNotifyDataSetChanged clickRYDeviceMore "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$3;->c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 591
    return-void
.end method
