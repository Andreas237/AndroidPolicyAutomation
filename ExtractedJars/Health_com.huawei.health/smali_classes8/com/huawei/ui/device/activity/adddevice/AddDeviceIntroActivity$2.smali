.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V
    .locals 0

    .line 494
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;Lo/egv;)Lo/egv;

    .line 502
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;Ljava/lang/Boolean;)V

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->g(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 504
    return-void
.end method
