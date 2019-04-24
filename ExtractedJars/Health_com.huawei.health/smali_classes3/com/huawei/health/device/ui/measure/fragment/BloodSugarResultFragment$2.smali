.class Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->saveBloodSugarData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 141
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodSugarResultFragment saveBloodSugarData() onResponse() err_code:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 143
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 144
    invoke-virtual {v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 145
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 146
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    const-string v0, "healthdata"

    const-string v1, "MyHealthData_jump_mainActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BloodsugarActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/DeviceMainActivity;->startActivity(Landroid/content/Intent;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    invoke-virtual {v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 151
    goto :goto_0

    .line 152
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->finish()V

    goto :goto_0

    .line 155
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodSugarResultFragment saveBloodSugarData() onResponse() null == mainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    :goto_0
    return-void
.end method
