.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;
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
.field final synthetic b:Lo/egw;

.field final synthetic c:Landroid/widget/RadioButton;

.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

.field final synthetic e:Landroid/widget/RadioButton;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lo/egw;)V
    .locals 0

    .line 1549
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->c:Landroid/widget/RadioButton;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->e:Landroid/widget/RadioButton;

    iput-object p4, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->b:Lo/egw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1552
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1553
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->e:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1554
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)I

    .line 1555
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V

    .line 1556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 1557
    return-void
.end method
