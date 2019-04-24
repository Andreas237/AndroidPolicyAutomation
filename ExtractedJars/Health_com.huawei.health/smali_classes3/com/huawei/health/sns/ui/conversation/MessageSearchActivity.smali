.class public Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# instance fields
.field private g:Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 4

    .line 34
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_message_search:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->setContentView(I)V

    .line 35
    invoke-static {}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->b()Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;

    .line 36
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 38
    sget v0, Lcom/huawei/android/sns/R$id;->message_search_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;

    invoke-virtual {v3, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 39
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 40
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 23
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 27
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 29
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;->c()V

    .line 30
    return-void
.end method
