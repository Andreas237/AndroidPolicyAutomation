.class Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 93
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 94
    sget v0, Lcom/huawei/ui/main/R$id;->close_radio_button:I

    if-ne v2, v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V

    goto :goto_0

    .line 96
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->two:I

    if-ne v2, v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V

    goto :goto_0

    .line 98
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->thirty:I

    if-ne v2, v0, :cond_2

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V

    goto :goto_0

    .line 100
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->sixty:I

    if-ne v2, v0, :cond_3

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V

    goto :goto_0

    .line 102
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->onehundredtwenty:I

    if-ne v2, v0, :cond_4

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    const/16 v1, 0x78

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V

    .line 105
    :cond_4
    :goto_0
    return-void
.end method
