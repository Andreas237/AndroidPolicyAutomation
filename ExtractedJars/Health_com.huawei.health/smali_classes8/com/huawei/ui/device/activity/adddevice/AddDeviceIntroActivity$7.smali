.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e(ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V
    .locals 0

    .line 592
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$7;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 595
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showReplaceDeviceDialog():\u70b9\u51fb\u540c\u610f\u5207\u6362\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$7;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->k(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$7;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->q()V

    .line 600
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6e05\u9664\u5347\u7ea7inter\u6570\u636e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    return-void
.end method
