.class Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic c:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;Z)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;->c:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;

    iput-boolean p2, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;->c:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->b(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/emu;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;->a:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;->c:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->b(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;->c:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->a(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 119
    return-void
.end method
