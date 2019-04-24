.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$5;->d:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$5;->d:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    sget-object v1, Lo/dae;->ef:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "editName():\u53d6\u6d88\u7f16\u8f91name"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    return-void
.end method
