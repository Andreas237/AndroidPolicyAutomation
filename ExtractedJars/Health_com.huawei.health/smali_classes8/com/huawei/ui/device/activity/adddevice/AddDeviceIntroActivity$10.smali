.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

.field final synthetic e:Lo/enw;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;Lo/enw;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;->c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;->e:Lo/enw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 528
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 529
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;->e:Lo/enw;

    const-string v0, "SURE"

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 531
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->j(Landroid/content/Context;)V

    goto :goto_0

    .line 536
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;->c:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 538
    :cond_1
    :goto_0
    return-void
.end method
