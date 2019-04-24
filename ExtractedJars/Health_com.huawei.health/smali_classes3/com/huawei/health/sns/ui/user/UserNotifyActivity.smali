.class public Lcom/huawei/health/sns/ui/user/UserNotifyActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private g:Landroid/widget/TextView;

.field protected h:Z

.field private k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->h:Z

    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .line 114
    if-eqz p1, :cond_1

    .line 118
    const-string v0, "activity_open_from_notification_flag"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const-string v0, "activity_open_from_notification_flag"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->h:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    :cond_0
    goto :goto_0

    .line 123
    :catch_0
    move-exception v2

    .line 125
    const-string v0, "UserNotifyActivity"

    const-string v1, "getParams Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_1
    :goto_0
    return-void
.end method

.method private e()V
    .locals 6

    .line 73
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 74
    if-eqz v3, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 79
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 82
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_notify_actionbar_title_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 86
    if-eqz v3, :cond_2

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_menu_add_friend_emui50:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v3, v1, v0, p0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 92
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_notify_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 93
    sget v0, Lcom/huawei/android/sns/R$id;->sns_notify_add_friend:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->k:Landroid/widget/ImageView;

    .line 94
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    :cond_2
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_notify_title:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->g:Landroid/widget/TextView;

    .line 99
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_huaweipay_black_a_D8:I

    sget v2, Lcom/huawei/android/sns/R$color;->sns_chat_action_bar_title_for_emuifive:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->e(Landroid/widget/TextView;IILandroid/content/Context;)V

    .line 103
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 3

    .line 136
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 139
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->h:Z

    if-eqz v0, :cond_0

    .line 141
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 142
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 143
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 144
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->startActivity(Landroid/content/Intent;)V

    .line 146
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 152
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 153
    const-class v0, Lcom/huawei/health/sns/ui/user/AddFriendActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 154
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->startActivity(Landroid/content/Intent;)V

    .line 155
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 49
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->setContentView(I)V

    .line 51
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->b(Landroid/content/Intent;)V

    .line 52
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 53
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 54
    const-string v0, "userNotifyFragmentTag"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 55
    if-nez v4, :cond_0

    .line 57
    invoke-static {}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b()Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    move-result-object v4

    .line 59
    :cond_0
    invoke-virtual {v4}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 61
    sget v0, Lcom/huawei/android/sns/R$id;->fragment_container:I

    const-string v1, "userNotifyFragmentTag"

    invoke-virtual {v3, v0, v4, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 63
    :cond_1
    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 64
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->e()V

    .line 65
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 108
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 109
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;->b(Landroid/content/Intent;)V

    .line 110
    return-void
.end method
