.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 580
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    .line 587
    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_synchronous_success:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 586
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    .line 590
    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_synchronization_failure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 589
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 590
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c()V

    .line 594
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/cfz;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 595
    return-void
.end method
