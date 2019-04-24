.class public Lcom/huawei/health/sns/ui/selector/TransmitActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;
.implements Lo/azd;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/selector/TransmitActivity$d;
    }
.end annotation


# instance fields
.field protected f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

.field protected g:Landroid/view/inputmethod/InputMethodManager;

.field protected h:Landroid/widget/SearchView;

.field protected k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

.field private l:Landroid/app/AlertDialog;

.field protected m:Landroid/support/v4/app/Fragment;

.field private n:Lo/bio;

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 121
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity$d;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 1

    .line 225
    sget v0, Lcom/huawei/android/sns/R$string;->sns_selector_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 226
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 513
    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 515
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 519
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n()V

    .line 521
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)Lo/bio;
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->c()Lo/bio;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 6

    .line 723
    if-nez p1, :cond_0

    .line 725
    return-void

    .line 728
    :cond_0
    const/4 v2, 0x0

    .line 729
    const/4 v3, 0x0

    .line 730
    const-string v0, "loginCode"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 731
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 733
    invoke-static {v4}, Lo/azd$a;->valueOf(Ljava/lang/String;)Lo/azd$a;

    move-result-object v2

    .line 736
    :cond_1
    const-string v0, "imStatus"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 737
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 739
    invoke-static {v5}, Lo/azd$c;->valueOf(Ljava/lang/String;)Lo/azd$c;

    move-result-object v3

    .line 742
    :cond_2
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-ne v3, v0, :cond_3

    .line 745
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k()V

    .line 748
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l()V

    goto :goto_0

    .line 750
    :cond_3
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne v3, v0, :cond_5

    .line 753
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k()V

    .line 755
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_5

    .line 759
    sget-object v0, Lo/azd$a;->h:Lo/azd$a;

    if-eq v2, v0, :cond_4

    .line 762
    sget v0, Lcom/huawei/android/sns/R$string;->sns_im_online_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 766
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p()V

    .line 769
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)Landroid/os/Handler;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private c()Lo/bio;
    .locals 4

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n:Lo/bio;

    if-nez v0, :cond_0

    .line 238
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n:Lo/bio;

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n:Lo/bio;

    return-object v0
.end method

.method private c(Landroid/view/View;)V
    .locals 3

    .line 650
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 651
    if-eqz v2, :cond_0

    .line 653
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 655
    const-string v0, "transmit"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/selector/TransmitActivity;Landroid/os/Bundle;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 483
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->m:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    if-eq v0, v1, :cond_0

    .line 485
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 486
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->m:Landroid/support/v4/app/Fragment;

    .line 490
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->c(Ljava/lang/String;)V

    .line 491
    return-void
.end method

.method private static d(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)Lo/aoo;
    .locals 1

    .line 203
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity$2;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/TransmitActivity;Landroid/view/View;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->c(Landroid/view/View;)V

    return-void
.end method

.method private e()V
    .locals 3

    .line 189
    const-string v0, "transmit"

    const-string v1, "try to login hw account."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->d(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)Lo/aoo;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lo/aor;->d(Landroid/app/Activity;Lo/aoo;Z)V

    .line 193
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h()V

    return-void
.end method

.method private g()Landroid/app/AlertDialog;
    .locals 3

    .line 257
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 258
    sget v0, Lcom/huawei/android/sns/R$string;->sns_im_offline_send:I

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 260
    sget v0, Lcom/huawei/android/sns/R$string;->sns_im_online_share:I

    new-instance v1, Lcom/huawei/health/sns/ui/selector/TransmitActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity$1;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 278
    sget v0, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    new-instance v1, Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 293
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 295
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method private h()V
    .locals 1

    .line 303
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k()V

    .line 304
    sget v0, Lcom/huawei/android/sns/R$string;->sns_im_online_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 305
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p()V

    .line 306
    return-void
.end method

.method private k()V
    .locals 1

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n:Lo/bio;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 251
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->n:Lo/bio;

    .line 253
    :cond_0
    return-void
.end method

.method private l()V
    .locals 1

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 328
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 329
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l:Landroid/app/AlertDialog;

    .line 331
    :cond_0
    return-void
.end method

.method private m()V
    .locals 6

    .line 404
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_transmit:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->setContentView(I)V

    .line 405
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->o()V

    .line 407
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 408
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 410
    const-string v0, "transmitListFragmentTag"

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v5

    .line 411
    if-nez v5, :cond_0

    .line 413
    invoke-static {}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b()Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    goto :goto_0

    .line 415
    :cond_0
    instance-of v0, v5, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    if-eqz v0, :cond_1

    .line 417
    move-object v0, v5

    check-cast v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    .line 419
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 421
    sget v0, Lcom/huawei/android/sns/R$id;->transmit_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const-string v2, "transmitListFragmentTag"

    invoke-virtual {v4, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 424
    :cond_2
    const-string v0, "transmitSearchFragmentTag"

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v5

    .line 425
    if-nez v5, :cond_3

    .line 427
    invoke-static {}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->b()Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    goto :goto_1

    .line 429
    :cond_3
    instance-of v0, v5, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    if-eqz v0, :cond_4

    .line 431
    move-object v0, v5

    check-cast v0, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    .line 434
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_5

    .line 436
    sget v0, Lcom/huawei/android/sns/R$id;->transmit_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    const-string v2, "transmitSearchFragmentTag"

    invoke-virtual {v4, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 438
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->m:Landroid/support/v4/app/Fragment;

    .line 441
    return-void
.end method

.method private n()V
    .locals 4

    .line 498
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->m:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    if-eq v0, v1, :cond_0

    .line 500
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 501
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->m:Landroid/support/v4/app/Fragment;

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k:Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->c(Ljava/lang/String;)V

    .line 506
    :cond_0
    return-void
.end method

.method private o()V
    .locals 3

    .line 445
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 447
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setFocusable(Z)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/selector/TransmitActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity$3;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 466
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 468
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 470
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->g:Landroid/view/inputmethod/InputMethodManager;

    .line 471
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->g:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 476
    :cond_0
    return-void
.end method

.method private p()V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    .line 315
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->g()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l:Landroid/app/AlertDialog;

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 319
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Landroid/os/Bundle;)V"
        }
    .end annotation

    .line 668
    if-nez p1, :cond_0

    .line 670
    return-void

    .line 673
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 674
    invoke-virtual {v2, p0, p1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 675
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 676
    if-eqz p2, :cond_1

    .line 678
    invoke-virtual {v2, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 683
    :cond_1
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 688
    goto :goto_0

    .line 685
    :catch_0
    move-exception v3

    .line 687
    const-string v0, "transmit"

    const-string v1, "jumpToPage ActivityNotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    :goto_0
    return-void
.end method

.method protected b()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 779
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 781
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bpk;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 782
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 784
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/16 v1, 0xb

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 788
    :cond_0
    return-void
.end method

.method public c(Lo/azd$c;Lo/azd$a;)V
    .locals 4

    .line 702
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-eq p1, v0, :cond_0

    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne p1, v0, :cond_2

    .line 704
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 705
    const-string v0, "imStatus"

    invoke-virtual {p1}, Lo/azd$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    if-eqz p2, :cond_1

    .line 708
    const-string v0, "loginCode"

    invoke-virtual {p2}, Lo/azd$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p:Landroid/os/Handler;

    const/16 v1, 0xc29

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 711
    invoke-virtual {v3, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 714
    :cond_2
    return-void
.end method

.method public d()V
    .locals 1

    .line 390
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->d:Landroid/view/View;

    .line 391
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 562
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 563
    const/4 v0, -0x1

    if-ne p2, v0, :cond_3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 566
    if-eqz p3, :cond_2

    .line 568
    const-string v0, "transmit"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult:::requestCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(I)V

    .line 570
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 571
    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 573
    const-string v0, "userId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 575
    const-class v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {p0, v0, v3}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Ljava/lang/Class;Landroid/os/Bundle;)V

    goto :goto_0

    .line 577
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {p0, v0, v3}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Ljava/lang/Class;Landroid/os/Bundle;)V

    goto :goto_0

    .line 581
    :cond_1
    const-string v0, "userList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 583
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {p0, v0, v3}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 587
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->finish()V

    .line 590
    :cond_3
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 526
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Ljava/lang/String;)V

    .line 527
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 694
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 695
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 696
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 162
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 163
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 166
    if-eqz v1, :cond_0

    .line 168
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 172
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a()V

    .line 174
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->m()V

    .line 178
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 180
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->e()V

    .line 182
    :cond_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 595
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_transimit_menu_emui50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 596
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 547
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 552
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(I)V

    .line 555
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 336
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 337
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->setIntent(Landroid/content/Intent;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 344
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 348
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 354
    goto :goto_0

    .line 350
    :catch_0
    move-exception v3

    .line 352
    const-string v0, "transmit"

    const-string v1, "TransmitActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->finish()V

    .line 357
    :goto_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 359
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->e()V

    .line 361
    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 624
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_creat_new_chat:I

    if-ne v0, v1, :cond_0

    .line 626
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(II)V

    goto :goto_0

    .line 629
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_select_family:I

    if-ne v0, v1, :cond_1

    .line 631
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(II)V

    goto :goto_0

    .line 634
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_select_group_chat:I

    if-ne v0, v1, :cond_2

    .line 636
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(II)V

    goto :goto_0

    .line 638
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_3

    .line 641
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(I)V

    .line 644
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 1

    .line 396
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPause()V

    .line 399
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c(Lo/azd;)V

    .line 400
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 604
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    sget v0, Lcom/huawei/android/sns/R$id;->menu_creat_new_chat:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 607
    sget v0, Lcom/huawei/android/sns/R$id;->menu_select_family:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 608
    sget v0, Lcom/huawei/android/sns/R$id;->menu_select_group_chat:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 612
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_creat_new_chat:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 613
    sget v0, Lcom/huawei/android/sns/R$id;->menu_select_family:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 614
    sget v0, Lcom/huawei/android/sns/R$id;->menu_select_group_chat:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 617
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 540
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Ljava/lang/String;)V

    .line 541
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 533
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Ljava/lang/String;)V

    .line 534
    const/4 v0, 0x1

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 793
    const/16 v0, 0xb

    if-ne p1, v0, :cond_2

    .line 796
    if-eqz p3, :cond_0

    array-length v0, p3

    if-lez v0, :cond_0

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 798
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(I)V

    .line 799
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->finish()V

    goto :goto_0

    .line 803
    :cond_1
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    .line 806
    :cond_2
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 366
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 369
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lo/azd;)V

    .line 372
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 374
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->p()V

    goto :goto_0

    .line 379
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->k()V

    .line 381
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->l()V

    .line 384
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->invalidateOptionsMenu()V

    .line 385
    return-void
.end method
