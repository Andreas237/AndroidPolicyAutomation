.class public Lcom/huawei/health/sns/ui/padsearch/SearchActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;
.implements Lo/azd;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/padsearch/SearchActivity$c;
    }
.end annotation


# instance fields
.field public f:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

.field public g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

.field protected h:Landroid/widget/SearchView;

.field public k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

.field private l:Landroid/support/v4/app/Fragment;

.field private m:I

.field private n:Landroid/os/Handler;

.field protected o:Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 105
    new-instance v0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$c;-><init>(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->n:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$3;-><init>(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setFocusable(Z)V

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 320
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    .line 391
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 392
    if-eqz v2, :cond_0

    .line 394
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 396
    const-string v0, "SearchActivity"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    :cond_0
    return-void
.end method

.method private b()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 176
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 178
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_actionbar:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 179
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v5

    .line 180
    invoke-static {v5, v4}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 181
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->h:Landroid/widget/SearchView;

    .line 182
    return-void
.end method

.method private b(Landroid/support/v4/app/FragmentTransaction;Landroid/support/v4/app/Fragment;)V
    .locals 3

    .line 261
    if-eqz p2, :cond_0

    instance-of v0, p2, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    if-eqz v0, :cond_0

    .line 263
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    goto :goto_0

    .line 267
    :cond_0
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    .line 270
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 272
    sget v0, Lcom/huawei/android/sns/R$id;->conversation_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    const-string v2, "friendListFragmentTag"

    invoke-virtual {p1, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 274
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g()V

    return-void
.end method

.method private c()V
    .locals 5

    .line 217
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_search:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->setContentView(I)V

    .line 218
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->a()V

    .line 219
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 220
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 222
    const-string v0, "conversationSearchFragmentTag"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 223
    invoke-direct {p0, v3, v4}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->d(Landroid/support/v4/app/FragmentTransaction;Landroid/support/v4/app/Fragment;)V

    .line 224
    iget v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->m:I

    if-nez v0, :cond_0

    .line 226
    const-string v0, "conversationListFragmentTag"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 227
    invoke-direct {p0, v3, v4}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->c(Landroid/support/v4/app/FragmentTransaction;Landroid/support/v4/app/Fragment;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->f:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    goto :goto_0

    .line 232
    :cond_0
    const-string v0, "friendListFragmentTag"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 233
    invoke-direct {p0, v3, v4}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->b(Landroid/support/v4/app/FragmentTransaction;Landroid/support/v4/app/Fragment;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    .line 237
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->o:Landroid/support/v4/app/Fragment;

    .line 240
    return-void
.end method

.method private c(Landroid/support/v4/app/FragmentTransaction;Landroid/support/v4/app/Fragment;)V
    .locals 3

    .line 244
    if-nez p2, :cond_0

    .line 246
    new-instance v0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->f:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    goto :goto_0

    .line 248
    :cond_0
    instance-of v0, p2, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    if-eqz v0, :cond_1

    .line 250
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->f:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    .line 252
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->f:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 254
    sget v0, Lcom/huawei/android/sns/R$id;->conversation_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->f:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    const-string v2, "conversationListFragmentTag"

    .line 255
    invoke-virtual {p1, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 257
    :cond_2
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->o:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    if-eq v0, v1, :cond_0

    .line 329
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 330
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->o:Landroid/support/v4/app/Fragment;

    .line 334
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->c(Ljava/lang/String;)V

    .line 335
    return-void
.end method

.method private d(Landroid/support/v4/app/FragmentTransaction;Landroid/support/v4/app/Fragment;)V
    .locals 3

    .line 278
    if-eqz p2, :cond_0

    instance-of v0, p2, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    if-eqz v0, :cond_0

    .line 280
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    goto :goto_0

    .line 284
    :cond_0
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    .line 287
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 289
    sget v0, Lcom/huawei/android/sns/R$id;->conversation_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    const-string v2, "conversationSearchFragmentTag"

    invoke-virtual {p1, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 292
    :cond_1
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    .line 364
    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 366
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 370
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k()V

    .line 372
    :goto_0
    return-void
.end method

.method private e()V
    .locals 3

    .line 158
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 159
    if-eqz v1, :cond_1

    .line 161
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 162
    if-nez v2, :cond_0

    .line 164
    return-void

    .line 166
    :cond_0
    const-string v0, "DefaultFragment"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    const-string v0, "DefaultFragment"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->m:I

    .line 171
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;Landroid/view/View;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->a(Landroid/view/View;)V

    return-void
.end method

.method private g()V
    .locals 1

    .line 425
    iget v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->m:I

    if-nez v0, :cond_0

    .line 427
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->finish()V

    goto :goto_0

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    if-eqz v0, :cond_1

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->k:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d()V

    .line 433
    :cond_1
    :goto_0
    return-void
.end method

.method private k()V
    .locals 4

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->o:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    if-eq v0, v1, :cond_0

    .line 344
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 345
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 346
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->l:Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->o:Landroid/support/v4/app/Fragment;

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->c(Ljava/lang/String;)V

    .line 350
    :cond_0
    return-void
.end method


# virtual methods
.method public c(Lo/azd$c;Lo/azd$a;)V
    .locals 2

    .line 411
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne p1, v0, :cond_0

    .line 413
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->n:Landroid/os/Handler;

    const/16 v1, 0xd30

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 418
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 187
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->d:Landroid/view/View;

    .line 188
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 355
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->d(Ljava/lang/String;)V

    .line 356
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 404
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 405
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 406
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 142
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 143
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->e()V

    .line 144
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 147
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 149
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->b()V

    .line 150
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->c()V

    .line 152
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lo/azd;)V

    .line 153
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 211
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 212
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c(Lo/azd;)V

    .line 213
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 205
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPause()V

    .line 206
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 384
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->d(Ljava/lang/String;)V

    .line 385
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 377
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->d(Ljava/lang/String;)V

    .line 378
    const/4 v0, 0x1

    return v0
.end method

.method public onResume()V
    .locals 1

    .line 193
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 196
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->m:I

    if-nez v0, :cond_0

    .line 198
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->finish()V

    .line 200
    :cond_0
    return-void
.end method
