.class public Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$a;
    }
.end annotation


# instance fields
.field private f:J

.field protected g:Landroid/widget/SearchView;

.field private h:Lcom/huawei/health/sns/model/group/Group;

.field private k:Landroid/widget/ListView;

.field private l:Z

.field private m:Lo/bdh;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private o:Landroid/os/Handler;

.field private p:Lo/bgn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    .line 114
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->l:Z

    .line 129
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$a;-><init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->o:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 3

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 380
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x143

    invoke-virtual {v0, v2, v1}, Lo/ate;->b(ILcom/huawei/health/sns/model/group/Group;)V

    .line 382
    :cond_0
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .line 460
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 461
    const/4 v2, 0x0

    .line 462
    if-eqz v1, :cond_1

    .line 464
    const-string v0, "keySearchGroupMemberMatchList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 465
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 467
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 471
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Z)V

    .line 474
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->a()V

    return-void
.end method

.method private b()V
    .locals 3

    .line 290
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    .line 291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 294
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 295
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 312
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 314
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c:Landroid/widget/LinearLayout;

    .line 315
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e:Landroid/widget/ImageView;

    .line 316
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 319
    sget v0, Lcom/huawei/android/sns/R$id;->list_groupMenber:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->k:Landroid/widget/ListView;

    .line 320
    new-instance v0, Lo/bdh;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/bdh;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->k:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 350
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)Lo/bdh;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 249
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 250
    if-eqz v2, :cond_1

    .line 252
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 253
    if-nez v3, :cond_0

    .line 255
    return-void

    .line 257
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 259
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->f:J

    .line 260
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->f:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(J)V

    .line 263
    :cond_1
    return-void
.end method

.method private c(I)V
    .locals 1

    .line 200
    const/16 v0, 0xe3

    if-ne p1, v0, :cond_0

    .line 202
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_num_limite_normal:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 206
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 208
    :goto_0
    return-void
.end method

.method private c(J)V
    .locals 2

    .line 272
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 286
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 494
    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 496
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->d(Ljava/lang/String;)V

    .line 497
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->l:Z

    goto :goto_0

    .line 501
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->h()V

    .line 502
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->l:Z

    .line 504
    :goto_0
    return-void
.end method

.method private c(Z)V
    .locals 2

    .line 391
    if-eqz p1, :cond_0

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->k:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->k:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 401
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)Landroid/os/Handler;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->o:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(I)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 412
    :cond_0
    return-void

    .line 414
    :cond_1
    new-instance v0, Lo/bjc;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bjc;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/bjc;->d(Ljava/lang/String;J)V

    .line 415
    return-void
.end method

.method private e()V
    .locals 0

    .line 369
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->a()V

    .line 370
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 3

    .line 354
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 355
    if-eqz v2, :cond_0

    .line 357
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 359
    const-string v0, "ShowGroupMemberForAtActivity"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;Landroid/os/Message;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;Landroid/view/View;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e(Landroid/view/View;)V

    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 483
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Z)V

    .line 484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    invoke-virtual {v0, p1}, Lo/bdh;->b(Ljava/util/ArrayList;)V

    .line 485
    return-void
.end method

.method private g()V
    .locals 4

    .line 431
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->p:Lo/bgn;

    .line 432
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->p:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 433
    return-void
.end method

.method private h()V
    .locals 2

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/bdh;->c(Ljava/util/ArrayList;)V

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    invoke-virtual {v0}, Lo/bdh;->notifyDataSetChanged()V

    .line 424
    return-void
.end method

.method private k()V
    .locals 2

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->p:Lo/bgn;

    if-eqz v0, :cond_0

    .line 442
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->p:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 444
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 232
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->l:Z

    if-nez v0, :cond_0

    .line 234
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    invoke-virtual {v0, p1}, Lo/bdh;->c(Ljava/util/ArrayList;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->m:Lo/bdh;

    invoke-virtual {v0}, Lo/bdh;->notifyDataSetChanged()V

    goto :goto_0

    .line 240
    :cond_0
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->n:Ljava/util/ArrayList;

    .line 242
    :goto_0
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    .line 127
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 529
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Ljava/lang/String;)V

    .line 530
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Z)V

    .line 531
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 537
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 539
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 213
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 214
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 215
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 219
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_delete_group_member_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->setContentView(I)V

    .line 220
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c()V

    .line 221
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->g()V

    .line 222
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->b()V

    .line 223
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 449
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->k()V

    .line 450
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 451
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 515
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 517
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->onClose()Z

    goto :goto_0

    .line 521
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Ljava/lang/String;)V

    .line 523
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 509
    const/4 v0, 0x0

    return v0
.end method
