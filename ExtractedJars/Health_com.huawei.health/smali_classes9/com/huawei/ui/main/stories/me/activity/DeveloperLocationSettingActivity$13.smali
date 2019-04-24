.class Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->r()V
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

    .line 492
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 4

    .line 494
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v3

    .line 495
    sget v0, Lcom/huawei/ui/main/R$id;->half_second_radio_button:I

    if-ne v3, v0, :cond_0

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const-wide/16 v1, 0x1f4

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;J)V

    goto :goto_0

    .line 497
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->one_second_radio_button:I

    if-ne v3, v0, :cond_1

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;J)V

    goto :goto_0

    .line 499
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->one_and_half_second_radio_button:I

    if-ne v3, v0, :cond_2

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const-wide/16 v1, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;J)V

    goto :goto_0

    .line 501
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->two_second_radio_button:I

    if-ne v3, v0, :cond_3

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const-wide/16 v1, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;J)V

    goto :goto_0

    .line 503
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->two_and_half_second_radio_button:I

    if-ne v3, v0, :cond_4

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const-wide/16 v1, 0x9c4

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;J)V

    .line 506
    :cond_4
    :goto_0
    return-void
.end method
