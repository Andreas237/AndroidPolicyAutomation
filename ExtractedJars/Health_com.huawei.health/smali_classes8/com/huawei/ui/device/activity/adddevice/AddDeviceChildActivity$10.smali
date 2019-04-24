.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ear;

.field final synthetic d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V
    .locals 0

    .line 833
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;->b:Lo/ear;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 835
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result status "

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

    .line 836
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 837
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u672c\u5730\u63cf\u8ff0\u6587\u4ef6\u4e0d\u7528\u66f4\u65b0\uff0c\u4e0d\u7528\u66f4\u65b0UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;->b:Lo/ear;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V

    .line 840
    :cond_0
    return-void
.end method
