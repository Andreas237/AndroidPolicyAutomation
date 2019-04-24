.class public Lcom/huawei/health/sns/ui/group/NormalGroupActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# instance fields
.field private f:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->f:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    return-void
.end method

.method private b()V
    .locals 5

    .line 81
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->f:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    .line 82
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 83
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 84
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_grouplist_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->f:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    const-string v2, "normalGroupFragment"

    invoke-virtual {v4, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 85
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 86
    return-void
.end method


# virtual methods
.method public d(Lo/awn$e;)V
    .locals 0

    .line 54
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d(Lo/awn$e;)V

    .line 55
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->f:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->f:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 95
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 96
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 40
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 42
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 47
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->setContentView(I)V

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->b()V

    .line 49
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 60
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 62
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;->d(Lo/awn$e;)V

    .line 74
    return-void
.end method
