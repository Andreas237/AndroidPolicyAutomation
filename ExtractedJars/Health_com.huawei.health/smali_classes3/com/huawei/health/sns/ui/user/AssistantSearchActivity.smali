.class public Lcom/huawei/health/sns/ui/user/AssistantSearchActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 25
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    sget v0, Lcom/huawei/android/sns/R$string;->sns_system_notification:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchActivity;->setTitle(I)V

    .line 27
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 32
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchActivity;->setContentView(I)V

    .line 33
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 34
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 35
    const-string v0, "assistantSearchActivityTag"

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v5

    .line 36
    if-nez v5, :cond_1

    .line 38
    invoke-static {}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d()Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    move-result-object v5

    .line 40
    :cond_1
    invoke-virtual {v5}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 42
    sget v0, Lcom/huawei/android/sns/R$id;->fragment_container:I

    const-string v1, "assistantSearchActivityTag"

    invoke-virtual {v4, v0, v5, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 44
    :cond_2
    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 45
    return-void
.end method
