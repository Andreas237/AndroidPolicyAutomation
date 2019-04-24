.class Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;I)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    iput p2, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 173
    const/4 v3, 0x0

    .line 175
    iget v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->a:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 176
    const/4 v4, 0x0

    goto :goto_0

    .line 178
    :cond_0
    const/4 v4, 0x1

    .line 180
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Lo/emu;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/emu;->setChecked(Z)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    iget v1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->a:I

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;->d:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->e(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;ZZZ)V

    .line 184
    return-void
.end method
