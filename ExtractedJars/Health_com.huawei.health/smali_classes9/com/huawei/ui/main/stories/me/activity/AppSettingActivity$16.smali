.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egw;

.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

.field final synthetic c:Landroid/widget/RadioButton;

.field final synthetic d:Landroid/content/Intent;

.field final synthetic e:Landroid/widget/RadioButton;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/content/Intent;Lo/egw;)V
    .locals 0

    .line 1022
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->c:Landroid/widget/RadioButton;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->e:Landroid/widget/RadioButton;

    iput-object p4, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->d:Landroid/content/Intent;

    iput-object p5, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->a:Lo/egw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1025
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1026
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->e:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1027
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)I

    .line 1028
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V

    .line 1029
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->b:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->d:Landroid/content/Intent;

    const-string v2, "com.huawei.ui.imperial.imperial_permission"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1030
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;->a:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 1031
    return-void
.end method
