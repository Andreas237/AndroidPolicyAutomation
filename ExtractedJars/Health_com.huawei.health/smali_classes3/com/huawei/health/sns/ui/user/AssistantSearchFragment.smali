.class public Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$e;
    }
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private j:Landroid/os/Handler;

.field private l:Lo/awu;

.field private m:Lo/bkc;

.field private o:Landroid/widget/SearchView;

.field private p:Landroid/view/inputmethod/InputMethodManager;

.field private q:Z

.field private r:I

.field private s:I

.field private t:Lo/bnf;

.field private u:Lo/bio;

.field private v:Z

.field private w:Lo/bkk;

.field private x:I

.field private y:Landroid/view/View;

.field private z:Landroid/widget/GridView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->q:Z

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->v:Z

    .line 142
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->x:I

    .line 216
    new-instance v0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$e;-><init>(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .line 705
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 706
    if-eqz v1, :cond_0

    .line 708
    const-string v0, "key_recommend_assistant"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 709
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 711
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0, v2}, Lo/bkk;->d(Ljava/util/List;)V

    .line 712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0}, Lo/bkk;->notifyDataSetChanged()V

    .line 715
    :cond_0
    return-void
.end method

.method private a(Landroid/view/LayoutInflater;)V
    .locals 3

    .line 361
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_recomment_assist_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 365
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->assistant_gridview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->z:Landroid/widget/GridView;

    .line 366
    new-instance v0, Lo/bkk;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bkk;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    .line 367
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->z:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 368
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->k()V

    .line 371
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o()V

    .line 372
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->v()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;Landroid/os/Message;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Lo/bfm;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d:Lo/bfm;

    return-object v0
.end method

.method public static d()Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;
    .locals 1

    .line 220
    new-instance v0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;-><init>()V

    .line 221
    return-object v0
.end method

.method private d(II)V
    .locals 2

    .line 635
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    if-eqz v0, :cond_0

    .line 637
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    .line 639
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->q()V

    .line 640
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->getAssistErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 641
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->l()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;II)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d(II)V

    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 5

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 534
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 535
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 537
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 538
    const-string v0, "keyFindAssistantList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 539
    const-string v0, "keyAssistantTotalNum"

    iget v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    .line 540
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2711

    if-ne v0, v1, :cond_0

    .line 542
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    invoke-virtual {v0, v4, v1, v2}, Lo/bkc;->a(Ljava/util/List;ILandroid/os/Handler;)V

    goto :goto_0

    .line 544
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2712

    if-ne v0, v1, :cond_1

    .line 546
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    invoke-virtual {v0, v4, v1}, Lo/bkc;->b(Ljava/util/List;Landroid/os/Handler;)V

    .line 549
    :cond_1
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d:Lo/bfm;

    invoke-virtual {v1}, Lo/bfm;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_2

    .line 551
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s()V

    goto :goto_1

    .line 554
    :cond_2
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d:Lo/bfm;

    invoke-virtual {v1}, Lo/bfm;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_3

    .line 556
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u()V

    .line 559
    :cond_3
    :goto_1
    return-void
.end method

.method private e(Landroid/view/LayoutInflater;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 330
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_local_search_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->a:Landroid/view/View;

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_assistant_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 338
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->a:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 340
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 342
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_search_view_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/widget/SearchView;->setPadding(IIII)V

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 350
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->p:Landroid/view/inputmethod/InputMethodManager;

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->p:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 352
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;Landroid/os/Message;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Lo/bfm;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d:Lo/bfm;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;-><init>(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 309
    return-void
.end method

.method private i()I
    .locals 2

    .line 400
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->x:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 402
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->p()I

    move-result v0

    return v0

    .line 406
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->x:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Landroid/widget/ListView;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 379
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->z:Landroid/widget/GridView;

    if-nez v0, :cond_0

    .line 381
    return-void

    .line 383
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 386
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->z:Landroid/widget/GridView;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    goto :goto_0

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->z:Landroid/widget/GridView;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 392
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->q:Z

    return v0
.end method

.method private l()V
    .locals 1

    .line 523
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->q:Z

    .line 524
    return-void
.end method

.method private m()V
    .locals 2

    .line 436
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 437
    return-void
.end method

.method private n()V
    .locals 2

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0}, Lo/bkk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->v:Z

    if-eqz v0, :cond_0

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->y:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 447
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0}, Lo/bkk;->notifyDataSetChanged()V

    .line 449
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 427
    new-instance v1, Lo/aox;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    invoke-direct {v1, v0}, Lo/aox;-><init>(Landroid/os/Handler;)V

    .line 428
    invoke-virtual {v1}, Lo/aox;->a()V

    .line 429
    return-void
.end method

.method private p()I
    .locals 6

    .line 416
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/boi;->c(Landroid/app/Activity;)I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$dimen;->sns_listview_margin_left_right:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int v3, v0, v1

    .line 417
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/high16 v1, 0x42ec0000    # 118.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v4

    .line 418
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_recomend_assistant_grid_horizontalSpace:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 419
    sub-int v0, v3, v4

    add-int v1, v4, v5

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private q()V
    .locals 3

    .line 595
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 597
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x42580000    # 54.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    neg-int v1, v1

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->smoothScrollBy(II)V

    .line 599
    :cond_0
    return-void
.end method

.method private r()V
    .locals 2

    .line 606
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 607
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 608
    return-void
.end method

.method private s()V
    .locals 2

    .line 566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 569
    new-instance v0, Lo/bnf;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bnf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->t:Lo/bnf;

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->t:Lo/bnf;

    invoke-virtual {v0}, Lo/bnf;->b()V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->t:Lo/bnf;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    goto :goto_0

    .line 575
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->t:Lo/bnf;

    invoke-virtual {v0}, Lo/bnf;->b()V

    .line 577
    :goto_0
    return-void
.end method

.method private t()V
    .locals 2

    .line 615
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 617
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 619
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 621
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    invoke-virtual {v0}, Lo/bkc;->c()V

    .line 623
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u()V

    .line 624
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 625
    return-void
.end method

.method private u()V
    .locals 1

    .line 584
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->t:Lo/bnf;

    invoke-virtual {v0}, Lo/bnf;->c()V

    .line 588
    :cond_0
    return-void
.end method

.method private v()V
    .locals 1

    .line 677
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u:Lo/bio;

    if-eqz v0, :cond_0

    .line 679
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 680
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u:Lo/bio;

    .line 683
    :cond_0
    return-void
.end method

.method private w()V
    .locals 1

    .line 746
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    if-eqz v0, :cond_0

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0}, Lo/bkk;->c()V

    .line 750
    :cond_0
    return-void
.end method

.method private x()V
    .locals 1

    .line 690
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->z()Lo/bio;

    move-result-object v0

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 691
    return-void
.end method

.method private y()V
    .locals 1

    .line 722
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w:Lo/bkk;

    invoke-virtual {v0}, Lo/bkk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 724
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->n()V

    goto :goto_0

    .line 728
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m()V

    .line 730
    :goto_0
    return-void
.end method

.method private z()Lo/bio;
    .locals 5

    .line 664
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u:Lo/bio;

    if-nez v0, :cond_0

    .line 667
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    sget v3, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u:Lo/bio;

    .line 669
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u:Lo/bio;

    return-object v0
.end method


# virtual methods
.method protected b()V
    .locals 5

    .line 316
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->l:Lo/awu;

    if-eqz v0, :cond_0

    .line 318
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->q:Z

    .line 319
    iget v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->l:Lo/awu;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    mul-int/lit8 v1, v1, 0x64

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    const/16 v3, 0x2712

    const/16 v4, 0x64

    invoke-virtual {v0, v3, v1, v4, v2}, Lo/awu;->b(IIILandroid/os/Handler;)V

    .line 324
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 258
    new-instance v0, Lo/bkc;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bkc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bkc;->b(Lo/bfn;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->c:Lo/bfq;

    .line 261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    invoke-virtual {v0}, Lo/bkc;->d()V

    .line 262
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 5

    .line 454
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 455
    invoke-virtual {v3}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x34

    if-ne v0, v1, :cond_0

    instance-of v0, v3, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    if-eqz v0, :cond_0

    .line 457
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    .line 458
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getUID()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(Landroid/app/Activity;J)V

    .line 460
    :cond_0
    return-void
.end method

.method public f()V
    .locals 3

    .line 649
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 651
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 652
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 655
    :cond_0
    return-void
.end method

.method protected g()V
    .locals 2

    .line 467
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d:Lo/bfm;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 471
    :cond_0
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 501
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->v:Z

    .line 502
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->t()V

    .line 503
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->n()V

    .line 504
    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 735
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 737
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->w()V

    .line 739
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->k()V

    .line 740
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e()V

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->g:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 742
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 227
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    .line 229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 230
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_no_result_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 232
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->g:Landroid/widget/LinearLayout;

    .line 233
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->f:Landroid/widget/ImageView;

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->g:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 241
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e(Landroid/view/LayoutInflater;)V

    .line 244
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->a(Landroid/view/LayoutInflater;)V

    .line 247
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h()V

    .line 250
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->g()V

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 696
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 697
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 698
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 3

    .line 510
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 511
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 513
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->onClose()Z

    .line 515
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 6

    .line 476
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->s:I

    .line 477
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->r:I

    .line 478
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 479
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 481
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->v:Z

    .line 482
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m:Lo/bkc;

    invoke-virtual {v0}, Lo/bkc;->c()V

    .line 486
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->q:Z

    .line 487
    new-instance v0, Lo/awu;

    invoke-direct {v0, v5}, Lo/awu;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->l:Lo/awu;

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->l:Lo/awu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->j:Landroid/os/Handler;

    const/16 v2, 0x2711

    const/4 v3, 0x0

    const/16 v4, 0x64

    invoke-virtual {v0, v2, v3, v4, v1}, Lo/awu;->b(IIILandroid/os/Handler;)V

    .line 490
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->u()V

    .line 491
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->m()V

    .line 492
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->x()V

    .line 494
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->o:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 495
    const/4 v0, 0x0

    return v0
.end method
