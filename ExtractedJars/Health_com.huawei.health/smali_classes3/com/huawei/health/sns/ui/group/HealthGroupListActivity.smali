.class public Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# instance fields
.field private b:Z

.field private d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->b:Z

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    return-void
.end method

.method private b()V
    .locals 1

    .line 90
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    .line 99
    :cond_0
    return-void
.end method

.method private e()V
    .locals 5

    .line 106
    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-direct {v2}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;-><init>()V

    .line 107
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 108
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 109
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_grouplist_container:I

    const-string v1, "listfragment"

    invoke-virtual {v4, v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 110
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 112
    iput-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    .line 113
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 71
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    invoke-static {p0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 75
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->startActivity(Landroid/content/Intent;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->finish()V

    .line 77
    return-void

    .line 79
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->setContentView(I)V

    .line 80
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->b()V

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;->e()V

    .line 82
    return-void
.end method
