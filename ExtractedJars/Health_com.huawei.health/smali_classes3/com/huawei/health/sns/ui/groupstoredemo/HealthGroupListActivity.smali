.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# instance fields
.field private c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    return-void
.end method

.method private c()V
    .locals 5

    .line 52
    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-direct {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;-><init>()V

    .line 53
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 54
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 55
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_grouplist_container:I

    const-string v1, "listfragment"

    invoke-virtual {v4, v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 56
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 58
    iput-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    .line 59
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 42
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListActivity;->setContentView(I)V

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListActivity;->c()V

    .line 45
    return-void
.end method
