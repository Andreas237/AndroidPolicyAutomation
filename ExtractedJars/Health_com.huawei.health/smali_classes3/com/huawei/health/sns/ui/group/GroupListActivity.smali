.class public Lcom/huawei/health/sns/ui/group/GroupListActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/bgu;


# instance fields
.field private f:Z

.field private g:Lcom/huawei/health/sns/ui/group/GroupListFragment;

.field private h:Z

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->h:Z

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->k:Z

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->g:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    return-void
.end method

.method private a()V
    .locals 1

    .line 206
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->g:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    if-eqz v0, :cond_0

    .line 208
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->e()V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->g:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d()V

    .line 211
    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 241
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->h:Z

    .line 242
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 243
    return-void
.end method

.method private b()V
    .locals 2

    .line 250
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 251
    const-class v0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 252
    const/high16 v0, 0x20000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 253
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->startActivity(Landroid/content/Intent;)V

    .line 254
    return-void
.end method

.method private c()V
    .locals 3

    .line 112
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    if-eqz v0, :cond_0

    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 117
    const-string v0, "refresh_searchView"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 118
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 119
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->startActivity(Landroid/content/Intent;)V

    .line 121
    :cond_0
    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 2

    .line 157
    const-string v0, "activity_open_from_notification_flag"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    const-string v0, "activity_open_from_notification_flag"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->k:Z

    .line 162
    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 169
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 170
    if-eqz v1, :cond_1

    .line 172
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 174
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_chat_title:I

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setTitle(I)V

    goto :goto_0

    .line 178
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_family_title:I

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setTitle(I)V

    .line 181
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 4

    .line 128
    if-eqz p1, :cond_2

    .line 130
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->c(Landroid/content/Intent;)V

    .line 131
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 132
    if-eqz v2, :cond_0

    .line 134
    const-string v0, "bundleKeyIsGrpChat"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    .line 138
    :cond_0
    if-eqz v2, :cond_2

    .line 140
    const-string v0, "sns_sdk_grpList_type"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 141
    const/4 v0, 0x1

    if-ne v3, v0, :cond_1

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    goto :goto_0

    .line 146
    :cond_1
    const/4 v0, 0x2

    if-ne v3, v0, :cond_2

    .line 149
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    .line 153
    :cond_2
    :goto_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 261
    new-instance v2, Lcom/huawei/health/sns/ui/group/GroupListFragment;

    invoke-direct {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;-><init>()V

    .line 262
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 263
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 264
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_grouplist_container:I

    const-string v1, "listfragment"

    invoke-virtual {v4, v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 265
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 266
    iput-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->g:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    .line 267
    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 0

    .line 272
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->a(Z)V

    .line 273
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 292
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->k:Z

    if-eqz v0, :cond_0

    .line 294
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 295
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 296
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 297
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->startActivity(Landroid/content/Intent;)V

    .line 299
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 300
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 305
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 306
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 307
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->g()V

    .line 308
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 85
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 86
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 87
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 92
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->setContentView(I)V

    .line 95
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->e(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 97
    :catch_0
    move-exception v3

    .line 99
    const-string v0, "GroupListActivity"

    const-string v1, "getIntentData Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->c()V

    .line 102
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->e()V

    .line 103
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->g()V

    .line 104
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 187
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 190
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->e(Landroid/content/Intent;)V

    .line 192
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    goto :goto_0

    .line 194
    :catch_0
    move-exception v2

    .line 196
    const-string v0, "GroupListActivity"

    const-string v1, "onNewIntent getIntentData Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 199
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 227
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_add_group:I

    if-ne v0, v1, :cond_0

    .line 229
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->b()V

    .line 231
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 216
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 217
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListActivity;->f:Z

    if-nez v0, :cond_0

    .line 219
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_grouplist_blue_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 221
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method
