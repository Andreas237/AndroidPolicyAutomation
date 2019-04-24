.class Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 649
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 652
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 653
    sget v0, Lcom/huawei/ui/main/R$id;->g5_one_meter_radio_button:I

    if-ne v2, v0, :cond_0

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto/16 :goto_0

    .line 655
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->g5_two_meter_radio_button:I

    if-ne v2, v0, :cond_1

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto/16 :goto_0

    .line 657
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->g5_three_meter_radio_button:I

    if-ne v2, v0, :cond_2

    .line 658
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto/16 :goto_0

    .line 659
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->g5_four_meter_radio_button:I

    if-ne v2, v0, :cond_3

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 661
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->g5_five_meter_radio_button:I

    if-ne v2, v0, :cond_4

    .line 662
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 663
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->g5_six_meter_radio_button:I

    if-ne v2, v0, :cond_5

    .line 664
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 665
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$id;->g5_seven_meter_radio_button:I

    if-ne v2, v0, :cond_6

    .line 666
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 667
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$id;->g5_eight_meter_radio_button:I

    if-ne v2, v0, :cond_7

    .line 668
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 669
    :cond_7
    sget v0, Lcom/huawei/ui/main/R$id;->g5_nine_meter_radio_button:I

    if-ne v2, v0, :cond_8

    .line 670
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    goto :goto_0

    .line 671
    :cond_8
    sget v0, Lcom/huawei/ui/main/R$id;->g5_ten_meter_radio_button:I

    if-ne v2, v0, :cond_9

    .line 672
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V

    .line 674
    :cond_9
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Landroid/widget/RadioGroup;

    move-result-object v0

    if-ne p1, v0, :cond_a

    .line 675
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;Z)Z

    .line 676
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Landroid/widget/RadioGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 677
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;Z)Z

    goto :goto_1

    .line 679
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;Z)Z

    .line 680
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Landroid/widget/RadioGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 681
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;Z)Z

    .line 684
    :cond_b
    :goto_1
    return-void
.end method
