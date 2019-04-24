.class Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$1;
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
.field final synthetic d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$1;->d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 192
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showStartCoreSleepSwitchDialog cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$1;->d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->a(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$1;->d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/emu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 195
    return-void
.end method
