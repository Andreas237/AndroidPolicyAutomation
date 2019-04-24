.class public Lcom/huawei/health/sns/ui/user/UserNotifyFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;
.implements Lo/avk$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;
    }
.end annotation


# instance fields
.field private a:Lo/bio;

.field private l:Lo/bkj;

.field private m:Lo/bkm;

.field private o:Lo/bkp;

.field private p:Landroid/view/View;

.field private q:Landroid/view/inputmethod/InputMethodManager;

.field private r:Lo/bkq;

.field private s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private t:Lo/awu;

.field private u:Landroid/widget/SearchView;

.field private w:Landroid/os/Handler;

.field private y:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 111
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->s:Ljava/util/Set;

    .line 140
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;-><init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    .line 145
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$2;-><init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->y:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private static a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Handler;I)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Handler;I)Lo/brc<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
        }
    .end annotation

    .line 586
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;

    invoke-direct {v0, p1, p0, p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;-><init>(Landroid/os/Handler;Lcom/huawei/health/sns/ui/user/UserNotifyFragment;I)V

    return-object v0
.end method

.method private a(I)V
    .locals 3

    .line 572
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->p()Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    invoke-static {p0, v2, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Handler;I)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 573
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .line 325
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 326
    const/4 v2, 0x0

    .line 327
    if-eqz v1, :cond_0

    .line 329
    const-string v0, "keyFindUser"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 331
    :cond_0
    if-eqz v2, :cond_1

    .line 333
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c(Lcom/huawei/health/sns/model/user/User;)V

    .line 335
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;J)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c(J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Message;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Ljava/util/List;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c(Ljava/util/List;)V

    return-void
.end method

.method private a([J)V
    .locals 6

    .line 830
    if-eqz p1, :cond_0

    .line 832
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-wide v0, v2, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 834
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->s:Ljava/util/Set;

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 832
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 837
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)Landroid/os/Handler;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    return-object v0
.end method

.method public static b()Lcom/huawei/health/sns/ui/user/UserNotifyFragment;
    .locals 1

    .line 294
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;-><init>()V

    .line 295
    return-object v0
.end method

.method private b(I)V
    .locals 2

    .line 792
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    invoke-static {v0, v1, p1}, Lo/awu;->d(Landroid/app/Activity;Lo/bio;I)V

    .line 793
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 5

    .line 362
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 363
    const/4 v3, 0x0

    .line 364
    const/4 v4, 0x0

    .line 365
    if-eqz v2, :cond_1

    .line 367
    const-string v0, "keyUserNotifyList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 368
    const-string v0, "bundleQueryNotifyType"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 371
    :cond_1
    :goto_0
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d(Ljava/util/List;)V

    .line 373
    if-eqz v4, :cond_2

    .line 375
    new-instance v0, Lo/bkn;

    invoke-direct {v0}, Lo/bkn;-><init>()V

    invoke-virtual {v0, v3}, Lo/bkn;->a(Ljava/util/List;)V

    .line 377
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;I)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(I)V

    return-void
.end method

.method private c(J)V
    .locals 2

    .line 819
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->s:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 820
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->k()V

    .line 821
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 754
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 755
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 757
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->t:Lo/awu;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->m()Lo/bio;

    move-result-object v1

    invoke-static {v2, v0, p1, v1}, Lo/awu;->e(Landroid/app/Activity;Lo/awu;Lcom/huawei/health/sns/model/user/User;Lo/bio;)V

    .line 759
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->i()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;I)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Message;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Landroid/os/Message;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 631
    new-instance v0, Lo/bkn;

    invoke-direct {v0}, Lo/bkn;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->s:Ljava/util/Set;

    invoke-virtual {v0, p1, v1}, Lo/bkn;->a(Ljava/util/List;Ljava/util/Set;)V

    .line 632
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 4

    .line 344
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 345
    const/4 v2, 0x0

    .line 346
    const/4 v3, 0x0

    .line 347
    if-eqz v1, :cond_0

    .line 349
    const-string v0, "keySearchContact"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 350
    const-string v0, "keySearchContent"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 352
    :cond_0
    invoke-direct {p0, v2, v3}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d(Ljava/util/List;Ljava/lang/String;)V

    .line 353
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Message;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b(Landroid/os/Message;)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    invoke-virtual {v0, p1}, Lo/bkp;->e(Ljava/util/List;)V

    .line 521
    :cond_0
    return-void
.end method

.method private d(Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 766
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 768
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    invoke-virtual {v0, p1, p2}, Lo/bkp;->c(Ljava/util/List;Ljava/lang/String;)V

    .line 770
    :cond_0
    return-void
.end method

.method private e(Landroid/view/LayoutInflater;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 538
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_local_search_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->p:Landroid/view/View;

    .line 539
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->p:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    .line 540
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 541
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 542
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 544
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 546
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->p:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 548
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 550
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_search_view_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/widget/SearchView;->setPadding(IIII)V

    .line 554
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 556
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->u:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 558
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->q:Landroid/view/inputmethod/InputMethodManager;

    .line 559
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->q:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 562
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    sget v3, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    .line 563
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->n()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;[J)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a([J)V

    return-void
.end method

.method private f()V
    .locals 3

    .line 430
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->g()Lo/brd;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$4;-><init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 442
    return-void
.end method

.method private static g()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 446
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$3;-><init>()V

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 461
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$5;-><init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 478
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->b:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 479
    return-void
.end method

.method private i()V
    .locals 4

    .line 486
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o()V

    .line 487
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/axj;->c(Landroid/app/Activity;IZLandroid/os/Handler;)V

    .line 489
    return-void
.end method

.method private k()V
    .locals 2

    .line 528
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->s:Ljava/util/Set;

    invoke-virtual {v0, v1}, Lo/bkp;->b(Ljava/util/Set;)V

    .line 532
    :cond_0
    return-void
.end method

.method private l()Lo/bkq;
    .locals 3

    .line 636
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->r:Lo/bkq;

    if-nez v0, :cond_0

    .line 638
    new-instance v0, Lo/bkq;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lo/bkq;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->r:Lo/bkq;

    .line 640
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->r:Lo/bkq;

    return-object v0
.end method

.method private m()Lo/bio;
    .locals 1

    .line 749
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    return-object v0
.end method

.method private n()V
    .locals 1

    .line 732
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    if-eqz v0, :cond_0

    .line 734
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 736
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 740
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 741
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    if-eqz v0, :cond_0

    .line 743
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 745
    :cond_0
    return-void
.end method

.method private static p()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
        }
    .end annotation

    .line 611
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$6;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$6;-><init>()V

    return-object v0
.end method

.method private r()V
    .locals 5

    .line 777
    new-instance v0, Lo/bkm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkm;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->m:Lo/bkm;

    .line 778
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->l:Lo/bkj;

    .line 779
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$o;->e:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->m:Lo/bkm;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 781
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->l:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 784
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 785
    const-string v0, "com.huawei.health.sns.local_action_read_notify"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 786
    const-string v0, "com.huawei.health.sns.local_action_unread_notify"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 787
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 788
    return-void
.end method

.method private t()V
    .locals 2

    .line 800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->m:Lo/bkm;

    if-eqz v0, :cond_0

    .line 802
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->m:Lo/bkm;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 804
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->l:Lo/bkj;

    if-eqz v0, :cond_1

    .line 806
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->l:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 809
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 810
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 382
    new-instance v0, Lo/bkp;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bkp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bkp;->b(Lo/bfn;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c:Lo/bfq;

    .line 385
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    invoke-virtual {v0}, Lo/bkp;->d()V

    .line 386
    return-void
.end method

.method public c(Lo/bfl;)V
    .locals 1

    .line 652
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->l()Lo/bkq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bkq;->a(Lo/bfl;)V

    .line 653
    return-void
.end method

.method protected d()V
    .locals 2

    .line 657
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d:Lo/bfm;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 661
    :cond_0
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 1

    .line 646
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->l()Lo/bkq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bkq;->b(Lo/bfl;)V

    .line 647
    return-void
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 6

    .line 494
    sget-object v0, Lo/auu$b;->b:Lo/auu$b;

    if-ne p1, v0, :cond_1

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    const/16 v1, 0x253

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 501
    :cond_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->b(Landroid/os/Bundle;)J

    move-result-wide v4

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->s:Ljava/util/Set;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 505
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/axj;->c(Landroid/app/Activity;IZLandroid/os/Handler;)V

    .line 508
    :cond_1
    return-void
.end method

.method public onClose()Z
    .locals 3

    .line 692
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->o:Lo/bkp;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bkp;->c(Ljava/util/List;Ljava/lang/String;)V

    .line 696
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    .line 666
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 667
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 391
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b:Landroid/view/View;

    .line 394
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->e(Landroid/view/LayoutInflater;)V

    .line 397
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d()V

    .line 400
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(I)V

    .line 403
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->setHasOptionsMenu(Z)V

    .line 406
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->r()V

    .line 408
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->a:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 411
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->h()V

    .line 414
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->f()V

    .line 416
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 2

    .line 724
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->t()V

    .line 725
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->a:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 726
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->n()V

    .line 727
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroyView()V

    .line 728
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 685
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 686
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 2

    .line 702
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 703
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 705
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->onClose()Z

    goto :goto_0

    .line 709
    :cond_0
    invoke-static {v1}, Lo/bqz;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 711
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    invoke-static {v1, v0}, Lo/awu;->d(Ljava/lang/String;Landroid/os/Handler;)V

    goto :goto_0

    .line 715
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->onClose()Z

    .line 718
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 5

    .line 672
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 673
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 675
    new-instance v0, Lo/awu;

    invoke-direct {v0, v4}, Lo/awu;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->t:Lo/awu;

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->t:Lo/awu;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->w:Landroid/os/Handler;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a:Lo/bio;

    invoke-virtual {v0, v1, v2, v3}, Lo/awu;->e(Landroid/app/Activity;Landroid/os/Handler;Lo/bio;)V

    .line 679
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onResume()V
    .locals 0

    .line 422
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onResume()V

    .line 423
    return-void
.end method
