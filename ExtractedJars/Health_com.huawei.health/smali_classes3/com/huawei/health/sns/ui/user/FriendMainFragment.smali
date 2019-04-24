.class public Lcom/huawei/health/sns/ui/user/FriendMainFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;


# instance fields
.field protected a:Landroid/support/v4/app/Fragment;

.field private b:Landroid/view/View;

.field protected c:Landroid/view/inputmethod/InputMethodManager;

.field public d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

.field public e:Landroid/widget/SearchView;

.field private f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Landroid/view/View;

.field private k:Lo/bfm;

.field private o:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b:Landroid/view/View;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->i:Landroid/view/View;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    .line 64
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->h:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->g:Z

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    return-void
.end method

.method private b()V
    .locals 3

    .line 210
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 211
    invoke-static {v2}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->i:Landroid/view/View;

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/app/Activity;Landroid/view/View;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->search_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 217
    :cond_1
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 3

    .line 221
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 222
    if-eqz v2, :cond_0

    .line 224
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    const-string v0, "FriendMainFragment"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 373
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 375
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 379
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->k()V

    .line 381
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/FriendMainFragment;Landroid/view/View;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b(Landroid/view/View;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    if-eq v0, v1, :cond_0

    .line 312
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 313
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a:Landroid/support/v4/app/Fragment;

    .line 317
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->c(Ljava/lang/String;)V

    .line 321
    :cond_1
    return-void
.end method

.method private h()V
    .locals 3

    .line 360
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 364
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->g:Z

    .line 366
    :cond_0
    return-void
.end method

.method private k()V
    .locals 4

    .line 328
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    if-eq v0, v1, :cond_0

    .line 330
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 331
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a:Landroid/support/v4/app/Fragment;

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->c(Ljava/lang/String;)V

    .line 339
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d()V

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    if-eqz v0, :cond_1

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->getQuery()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->getQuery()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b(Ljava/lang/String;)V

    .line 303
    :cond_1
    return-void
.end method

.method public c()Z
    .locals 1

    .line 412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->h()V

    .line 416
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b(Ljava/lang/String;)V

    .line 417
    const/4 v0, 0x1

    return v0

    .line 421
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected d()V
    .locals 7

    .line 236
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 237
    if-eqz v3, :cond_0

    .line 239
    sget v0, Lcom/huawei/android/sns/R$string;->sns_tab_user:I

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setTitle(I)V

    .line 241
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 242
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 244
    const-string v0, "friendListFragmentTag"

    invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v6

    .line 246
    if-eqz v6, :cond_1

    instance-of v0, v6, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    if-eqz v0, :cond_1

    .line 248
    move-object v0, v6

    check-cast v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    goto :goto_0

    .line 252
    :cond_1
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    .line 255
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 257
    sget v0, Lcom/huawei/android/sns/R$id;->friend_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    const-string v2, "friendListFragmentTag"

    invoke-virtual {v5, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 260
    :cond_2
    const-string v0, "ConversationSearchFragmentTag"

    invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v6

    .line 262
    if-eqz v6, :cond_3

    instance-of v0, v6, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    if-eqz v0, :cond_3

    .line 264
    move-object v0, v6

    check-cast v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    goto :goto_1

    .line 268
    :cond_3
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    .line 271
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_4

    .line 273
    sget v0, Lcom/huawei/android/sns/R$id;->friend_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    const-string v2, "ConversationSearchFragmentTag"

    invoke-virtual {v5, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 275
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v5, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->f:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a:Landroid/support/v4/app/Fragment;

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->k:Lo/bfm;

    if-eqz v0, :cond_5

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->k:Lo/bfm;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->d(Lo/bfm;)V

    .line 281
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e(Ljava/lang/String;)V

    .line 283
    :cond_5
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 450
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->g:Z

    .line 451
    return-void
.end method

.method protected e(Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 162
    sget v0, Lcom/huawei/android/sns/R$id;->friend_list_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->i:Landroid/view/View;

    .line 163
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;-><init>(Lcom/huawei/health/sns/ui/user/FriendMainFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 195
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->c:Landroid/view/inputmethod/InputMethodManager;

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->c:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->o:Ljava/lang/CharSequence;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->o:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 201
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b()V

    .line 202
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d()V

    .line 203
    return-void
.end method

.method public e()Z
    .locals 2

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onClose()Z
    .locals 1

    .line 386
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b(Ljava/lang/String;)V

    .line 387
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 456
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 457
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b()V

    .line 458
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 140
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b:Landroid/view/View;

    .line 141
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e(Landroid/view/View;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 400
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->h:Ljava/lang/String;

    .line 401
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b(Ljava/lang/String;)V

    .line 402
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 393
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->b(Ljava/lang/String;)V

    .line 394
    const/4 v0, 0x1

    return v0
.end method

.method public onResume()V
    .locals 1

    .line 344
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 349
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->g:Z

    if-eqz v0, :cond_1

    .line 351
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->h()V

    .line 353
    :cond_1
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 148
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 150
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bny;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 154
    :cond_0
    return-void
.end method
