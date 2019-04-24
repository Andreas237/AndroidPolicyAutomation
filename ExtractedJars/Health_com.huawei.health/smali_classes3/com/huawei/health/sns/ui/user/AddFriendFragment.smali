.class public Lcom/huawei/health/sns/ui/user/AddFriendFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;
.implements Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;
    }
.end annotation


# instance fields
.field private a:Lo/bkd;

.field private l:Landroid/os/Handler;

.field private m:Landroid/widget/SearchView;

.field private o:Lo/bio;

.field private p:Landroid/view/View;

.field private t:Lo/awu;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    .line 67
    new-instance v0, Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;-><init>(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->l:Landroid/os/Handler;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->t:Lo/awu;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->k()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/AddFriendFragment;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    invoke-virtual {v0, p1, p2}, Lo/bkd;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 279
    return-void
.end method

.method public static b()Lcom/huawei/health/sns/ui/user/AddFriendFragment;
    .locals 1

    .line 73
    new-instance v0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;-><init>()V

    .line 74
    return-object v0
.end method

.method private b(I)V
    .locals 2

    .line 339
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    invoke-static {v0, v1, p1}, Lo/awu;->d(Landroid/app/Activity;Lo/bio;I)V

    .line 340
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/AddFriendFragment;Landroid/view/View;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->c(Landroid/view/View;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)Landroid/os/Handler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->l:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Landroid/view/View;)V
    .locals 3

    .line 246
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 247
    if-eqz v2, :cond_0

    .line 249
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    const-string v0, "AddFriendFragment"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 391
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 392
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->t:Lo/awu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    invoke-static {v2, v0, p1, v1}, Lo/awu;->e(Landroid/app/Activity;Lo/awu;Lcom/huawei/health/sns/model/user/User;Lo/bio;)V

    .line 396
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->f()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/AddFriendFragment;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b(I)V

    return-void
.end method

.method private e(Landroid/view/LayoutInflater;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 203
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_local_search_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->p:Landroid/view/View;

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->p:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    .line 205
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 208
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 210
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/user/AddFriendFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment$3;-><init>(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->p:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 226
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 228
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_search_view_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/widget/SearchView;->setPadding(IIII)V

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->m:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 236
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/inputmethod/InputMethodManager;

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 241
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    sget v3, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    .line 242
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/AddFriendFragment;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private f()V
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    invoke-virtual {v0}, Lo/bkd;->b()V

    .line 290
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 347
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/user/AddFriendFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment$4;-><init>(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    .line 367
    return-void
.end method

.method private k()V
    .locals 1

    .line 403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    if-eqz v0, :cond_0

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 407
    :cond_0
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 259
    new-instance v0, Lo/bkd;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bkd;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bkd;->b(Lo/bfn;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->c:Lo/bfq;

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    invoke-virtual {v0}, Lo/bkd;->d()V

    .line 263
    return-void
.end method

.method public c(Lo/bfl;)V
    .locals 0

    .line 381
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d(Lo/bfl;)V

    .line 382
    return-void
.end method

.method protected d()V
    .locals 2

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d:Lo/bfm;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 271
    :cond_0
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 1

    .line 372
    new-instance v0, Lo/bkg;

    invoke-direct {v0}, Lo/bkg;-><init>()V

    invoke-virtual {v0, p1, p0}, Lo/bkg;->b(Lo/bfl;Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    .line 373
    return-void
.end method

.method public onClose()Z
    .locals 3

    .line 330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a:Lo/bkd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bkd;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 334
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 182
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b:Landroid/view/View;

    .line 184
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->e(Landroid/view/LayoutInflater;)V

    .line 186
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d()V

    .line 189
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->setHasOptionsMenu(Z)V

    .line 191
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->e()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    if-nez v0, :cond_0

    .line 194
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->g()V

    .line 196
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 412
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 416
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    .line 418
    :cond_0
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 2

    .line 308
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 309
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->onClose()Z

    goto :goto_0

    .line 315
    :cond_0
    invoke-static {v1}, Lo/bqz;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->l:Landroid/os/Handler;

    invoke-static {v1, v0}, Lo/awu;->d(Ljava/lang/String;Landroid/os/Handler;)V

    goto :goto_0

    .line 321
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->onClose()Z

    .line 324
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 5

    .line 295
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 296
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    new-instance v0, Lo/awu;

    invoke-direct {v0, v4}, Lo/awu;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->t:Lo/awu;

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->t:Lo/awu;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->l:Landroid/os/Handler;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->o:Lo/bio;

    invoke-virtual {v0, v1, v2, v3}, Lo/awu;->e(Landroid/app/Activity;Landroid/os/Handler;Lo/bio;)V

    .line 302
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
