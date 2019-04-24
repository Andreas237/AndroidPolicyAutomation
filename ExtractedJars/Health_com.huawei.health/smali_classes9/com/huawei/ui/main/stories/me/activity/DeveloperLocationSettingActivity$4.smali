.class Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->w()V
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

    .line 622
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 624
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 625
    sget v0, Lcom/huawei/ui/main/R$id;->convert_open_radio_button:I

    if-ne v2, v0, :cond_0

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;I)V

    goto :goto_0

    .line 627
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->convert_close_radio_button:I

    if-ne v2, v0, :cond_1

    .line 628
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;I)V

    .line 629
    :cond_1
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->convert_auto_radio_button:I

    if-ne v2, v0, :cond_2

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;I)V

    .line 632
    :cond_2
    return-void
.end method
