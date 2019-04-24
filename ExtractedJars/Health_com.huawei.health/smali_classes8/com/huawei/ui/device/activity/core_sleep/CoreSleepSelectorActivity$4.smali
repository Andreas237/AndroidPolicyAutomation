.class Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->onCreate(Landroid/os/Bundle;)V
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

    .line 85
    iput-object p1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$4;->d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 88
    if-nez p2, :cond_0

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$4;->d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "core_sleep_btn_tips_do_not_remind_again"

    const-string v2, "core_sleep_btn_tips_cnt"

    invoke-static {v0, v1, v2}, Lo/egp;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$4;->d:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;Z)V

    .line 93
    return-void
.end method
