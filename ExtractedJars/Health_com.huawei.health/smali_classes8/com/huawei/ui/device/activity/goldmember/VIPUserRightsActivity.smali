.class public Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:I

.field b:Landroid/content/Context;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private g:Lo/emr;

.field private i:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->a:I

    return-void
.end method

.method private c()V
    .locals 3

    .line 43
    sget v0, Lcom/huawei/ui/device/R$layout;->acticity_vip_user_rights:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->setContentView(I)V

    .line 44
    sget v0, Lcom/huawei/ui/device/R$id;->user_rights_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->g:Lo/emr;

    .line 46
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_member_Free_repair_content_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->c:Landroid/widget/LinearLayout;

    .line 47
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_member_Wash_shell_content_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->d:Landroid/widget/LinearLayout;

    .line 48
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_member_Whole_machine_protection_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->e:Landroid/widget/LinearLayout;

    .line 49
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_member_Extended_warranty_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->i:Landroid/widget/LinearLayout;

    .line 51
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->a:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->g:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_free_repair:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 57
    :cond_0
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->a:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->g:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_wash_shell:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_1
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->a:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->g:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_whole_machine_protection:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_2
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->a:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->g:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_extended_warranty:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 76
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 34
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 35
    iput-object p0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->b:Landroid/content/Context;

    .line 36
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->a:I

    .line 39
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->c()V

    .line 40
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 80
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 81
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserRightsActivity;->finish()V

    .line 82
    return-void
.end method
