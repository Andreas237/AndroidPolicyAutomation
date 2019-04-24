.class public Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# instance fields
.field private g:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->g:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    return-void
.end method

.method private b()V
    .locals 6

    .line 53
    new-instance v0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->g:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    .line 54
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 55
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 56
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_grouplist_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->g:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    const-string v2, "normalSingleFragment"

    invoke-virtual {v4, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 57
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 58
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v5

    .line 59
    if-eqz v5, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 63
    :cond_0
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->g:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->g:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 72
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 73
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 78
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 79
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->setContentView(I)V

    .line 80
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->b()V

    .line 81
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 43
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->setContentView(I)V

    .line 45
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;->b()V

    .line 46
    return-void
.end method
