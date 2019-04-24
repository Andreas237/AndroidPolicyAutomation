.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 207
    new-instance v3, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->t(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sure_to_reset_button_rate_zone_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    .line 209
    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->t(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_plugin_menu_reset:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    .line 228
    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->t(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 237
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 238
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 240
    return-void
.end method
