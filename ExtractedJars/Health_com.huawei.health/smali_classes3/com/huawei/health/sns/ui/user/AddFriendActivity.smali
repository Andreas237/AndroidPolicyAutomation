.class public Lcom/huawei/health/sns/ui/user/AddFriendActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# instance fields
.field private h:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 34
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 35
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 40
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/AddFriendActivity;->setContentView(I)V

    .line 41
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 42
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 43
    const-string v0, "addFriendFragmentTag"

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v5

    .line 44
    if-nez v5, :cond_1

    .line 46
    invoke-static {}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b()Lcom/huawei/health/sns/ui/user/AddFriendFragment;

    move-result-object v5

    .line 48
    :cond_1
    invoke-virtual {v5}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 50
    sget v0, Lcom/huawei/android/sns/R$id;->fragment_container:I

    const-string v1, "addFriendFragmentTag"

    invoke-virtual {v4, v0, v5, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 52
    :cond_2
    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 53
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendActivity;->h:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendActivity;->h:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 61
    :cond_0
    return-void
.end method
