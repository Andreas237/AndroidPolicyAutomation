.class Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;
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

    .line 279
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 283
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mNotificationSwitchOnlyWear clicked : isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->i(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lo/eoa;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1$4;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;)V

    invoke-virtual {v0, p2, v1}, Lo/eoa;->e(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_operation_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 295
    :goto_0
    return-void
.end method
