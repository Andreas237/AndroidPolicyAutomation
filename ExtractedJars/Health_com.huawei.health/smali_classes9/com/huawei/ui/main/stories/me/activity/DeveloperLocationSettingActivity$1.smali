.class Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 533
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 535
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 536
    sget v0, Lcom/huawei/ui/main/R$id;->zero_meter_radio_button:I

    if-ne v2, v0, :cond_0

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 538
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->zero_one_meter_radio_button:I

    if-ne v2, v0, :cond_1

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 540
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->zero_five_meter_radio_button:I

    if-ne v2, v0, :cond_2

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 542
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->one_meter_radio_button:I

    if-ne v2, v0, :cond_3

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 544
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->two_meter_radio_button:I

    if-ne v2, v0, :cond_4

    .line 545
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 546
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->three_meter_radio_button:I

    if-ne v2, v0, :cond_5

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    .line 549
    :cond_5
    :goto_0
    return-void
.end method
