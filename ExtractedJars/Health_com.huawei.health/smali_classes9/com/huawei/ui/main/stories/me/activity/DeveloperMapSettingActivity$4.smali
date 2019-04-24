.class Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity$4;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 56
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->gaode_map:I

    if-ne v2, v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity$4;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;I)V

    goto :goto_0

    .line 59
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->google_map:I

    if-ne v2, v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity$4;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;I)V

    .line 62
    :cond_1
    :goto_0
    return-void
.end method
