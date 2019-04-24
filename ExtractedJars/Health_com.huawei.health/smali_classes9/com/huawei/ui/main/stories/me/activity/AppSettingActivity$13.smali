.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

.field final synthetic b:Lo/egy;

.field final synthetic c:Lo/egw;

.field final synthetic d:Landroid/widget/RadioButton;

.field final synthetic e:Landroid/widget/RadioButton;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lo/egw;Lo/egy;)V
    .locals 0

    .line 1559
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->d:Landroid/widget/RadioButton;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->e:Landroid/widget/RadioButton;

    iput-object p4, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->c:Lo/egw;

    iput-object p5, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->b:Lo/egy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->d:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1564
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->e:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)I

    .line 1566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V

    .line 1567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->c:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    goto :goto_0

    .line 1569
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;->b:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 1571
    :goto_0
    return-void
.end method
