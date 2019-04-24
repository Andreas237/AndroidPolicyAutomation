.class Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 610
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$5;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 613
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 614
    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    .line 615
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 616
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$5;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 617
    const/4 v0, 0x5

    iput v0, v2, Landroid/os/Message;->what:I

    .line 618
    iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$5;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 623
    :cond_0
    return-void
.end method
