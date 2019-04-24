.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 929
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$11;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 932
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7528\u6237\u70b9\u51fb\u53d6\u6d88"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 933
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$11;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 934
    return-void
.end method
