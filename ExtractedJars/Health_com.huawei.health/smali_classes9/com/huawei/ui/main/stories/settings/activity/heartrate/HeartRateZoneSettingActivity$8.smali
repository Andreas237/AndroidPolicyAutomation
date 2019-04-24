.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 946
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 950
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I

    .line 951
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->r(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 952
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->s(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->u(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 954
    return-void
.end method
