.class Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;->b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 174
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showStartCoreSleepSwitchDialog ok click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;->b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->a(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V

    .line 177
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 178
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 179
    const-string v0, "action_change_core_sleep_button"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;->b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/enz;

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;->b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/enz;

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;->b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;->b:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 187
    return-void
.end method
