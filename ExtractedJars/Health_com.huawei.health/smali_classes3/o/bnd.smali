.class public Lo/bnd;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lo/bmz;
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Z

.field private c:Landroid/content/Context;

.field private d:Lo/bnb;

.field private e:I

.field private f:Lo/bmv;

.field private g:Landroid/widget/BaseAdapter;

.field private h:Landroid/view/View;

.field private i:I

.field private k:Z

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 95
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnd;->b:Z

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/bnd;->e:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/bnd;->i:I

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bnd;->k:Z

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bnd;->o:Ljava/util/List;

    .line 96
    invoke-direct {p0, p1}, Lo/bnd;->a(Landroid/content/Context;)V

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 101
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnd;->b:Z

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/bnd;->e:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/bnd;->i:I

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bnd;->k:Z

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bnd;->o:Ljava/util/List;

    .line 102
    iput-object p1, p0, Lo/bnd;->c:Landroid/content/Context;

    .line 103
    invoke-direct {p0, p1}, Lo/bnd;->a(Landroid/content/Context;)V

    .line 104
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;
    .locals 4

    .line 439
    const-string v2, ""

    .line 440
    if-eqz p1, :cond_1

    .line 442
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSortPinYin()Ljava/lang/String;

    move-result-object v3

    .line 443
    iget-boolean v0, p0, Lo/bnd;->b:Z

    if-eqz v0, :cond_0

    .line 445
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactSortPinYin()Ljava/lang/String;

    move-result-object v3

    .line 447
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 449
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 453
    :cond_1
    return-object v2
.end method

.method private a(Landroid/content/Context;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 167
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_fastsearch_listview:I

    invoke-static {p1, v0, p0}, Lo/bnd;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 168
    sget v0, Lcom/huawei/android/sns/R$id;->fastsearch_listview:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    .line 169
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 171
    sget v0, Lcom/huawei/android/sns/R$id;->sns_fast_search_bar:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnb;

    iput-object v0, p0, Lo/bnd;->d:Lo/bnb;

    .line 172
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    iget-object v1, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Lo/bnb;->setView(Landroid/widget/ListView;)V

    .line 173
    sget v0, Lcom/huawei/android/sns/R$id;->fastscroll_textview:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 174
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0, v3}, Lo/bnb;->setOverlay(Landroid/widget/TextView;)V

    .line 175
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-static {}, Lo/bnd;->getOntTouchListener()Landroid/view/View$OnTouchListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bnb;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 177
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_fastscroll_overlay_5:I

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 182
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_blank:I

    invoke-virtual {p0, v0}, Lo/bnd;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bnd;->h:Landroid/view/View;

    .line 184
    invoke-direct {p0}, Lo/bnd;->b()V

    .line 185
    return-void
.end method

.method private b()V
    .locals 2

    .line 144
    iget-object v0, p0, Lo/bnd;->h:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 149
    iget-boolean v0, p0, Lo/bnd;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bnd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lo/bnd;->h:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 155
    :cond_0
    iget-object v0, p0, Lo/bnd;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 160
    :cond_1
    const-string v0, "FastSearchView refreshBlank"

    const-string v1, "blankview is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 463
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 465
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    const-string v1, "#"

    invoke-virtual {v0, v1}, Lo/bnb;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 469
    :cond_0
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0, p1}, Lo/bnb;->b(Ljava/lang/String;)V

    .line 471
    :goto_0
    return-void
.end method

.method private static getOntTouchListener()Landroid/view/View$OnTouchListener;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 190
    new-instance v0, Lo/bnd$4;

    invoke-direct {v0}, Lo/bnd$4;-><init>()V

    return-object v0
.end method

.method private i()V
    .locals 7

    .line 271
    iget-object v0, p0, Lo/bnd;->g:Landroid/widget/BaseAdapter;

    if-nez v0, :cond_0

    .line 273
    return-void

    .line 276
    :cond_0
    const/4 v2, 0x0

    .line 277
    const/4 v3, 0x0

    .line 278
    const/4 v4, 0x0

    .line 279
    const/4 v5, 0x0

    .line 280
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/bnd;->g:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 282
    iget-object v0, p0, Lo/bnd;->g:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v6}, Landroid/widget/BaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    .line 283
    if-eqz v3, :cond_1

    instance-of v0, v3, Lo/bfq$e;

    if-eqz v0, :cond_1

    .line 285
    move-object v4, v3

    check-cast v4, Lo/bfq$e;

    .line 287
    :cond_1
    if-eqz v4, :cond_2

    .line 289
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/bfq$e;->b(I)Lo/bfh;

    move-result-object v5

    .line 292
    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x16

    if-eq v0, v1, :cond_3

    .line 294
    add-int/lit8 v2, v2, 0x1

    .line 280
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 302
    :cond_3
    iput v2, p0, Lo/bnd;->e:I

    .line 303
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0, v2}, Lo/bnb;->setSpecialItemCount(I)V

    .line 304
    return-void
.end method

.method private k()V
    .locals 3

    .line 479
    iget-object v0, p0, Lo/bnd;->c:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bnd;->c:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    .line 480
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 482
    iget-object v0, p0, Lo/bnd;->c:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lo/bnd;->c:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    .line 483
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 486
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 203
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bnb;->setVisibility(I)V

    .line 207
    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .line 242
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->removeHeaderView(Landroid/view/View;)Z

    .line 243
    return-void
.end method

.method public a(Ljava/util/List;Lo/bfm;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Lo/bfm;)V"
        }
    .end annotation

    .line 340
    iput-object p1, p0, Lo/bnd;->o:Ljava/util/List;

    .line 341
    invoke-direct {p0}, Lo/bnd;->i()V

    .line 342
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/bnb;->setData(Ljava/util/List;Z)V

    .line 343
    return-void
.end method

.method public b(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 348
    iput-object p1, p0, Lo/bnd;->o:Ljava/util/List;

    .line 349
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0, p1, p2}, Lo/bnb;->setData(Ljava/util/List;Z)V

    .line 350
    return-void
.end method

.method public c()V
    .locals 2

    .line 219
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnb;->setVisibility(I)V

    .line 223
    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    .line 232
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 233
    return-void
.end method

.method public d()V
    .locals 2

    .line 211
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnb;->setVisibility(I)V

    .line 215
    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 354
    iget-object v0, p0, Lo/bnd;->f:Lo/bmv;

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lo/bnd;->f:Lo/bmv;

    invoke-interface {v0, p0}, Lo/bmv;->d(Lo/bmz;)V

    .line 358
    :cond_0
    return-void
.end method

.method public getAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 263
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    return-object v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .line 118
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    return-object v0
.end method

.method public getSearchBar()Lo/bnb;
    .locals 1

    .line 123
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    return-object v0
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 6

    .line 386
    iget-object v0, p0, Lo/bnd;->o:Ljava/util/List;

    if-nez v0, :cond_0

    .line 388
    return-void

    .line 391
    :cond_0
    const-string v2, ""

    .line 394
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v0

    sub-int v3, p2, v0

    .line 395
    if-gez v3, :cond_1

    .line 397
    const/4 v3, 0x0

    .line 400
    :cond_1
    iget v0, p0, Lo/bnd;->e:I

    sub-int v4, v3, v0

    .line 401
    if-gez v4, :cond_2

    .line 404
    const-string v2, "#"

    goto :goto_0

    .line 408
    :cond_2
    iget-object v0, p0, Lo/bnd;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 410
    iget-object v0, p0, Lo/bnd;->o:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/User;

    .line 411
    invoke-direct {p0, v5}, Lo/bnd;->a(Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;

    move-result-object v2

    .line 415
    :cond_3
    :goto_0
    iget v0, p0, Lo/bnd;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 417
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0}, Lo/bnb;->getVisibility()I

    move-result v0

    if-nez v0, :cond_4

    .line 419
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0, v2}, Lo/bnb;->a(Ljava/lang/String;)V

    .line 423
    :cond_4
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0, v3}, Lo/bnb;->c(I)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Lo/bnb;->c(I)Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, p0, Lo/bnd;->i:I

    if-nez v0, :cond_6

    .line 427
    :cond_5
    invoke-direct {p0, v2}, Lo/bnd;->d(Ljava/lang/String;)V

    .line 429
    :cond_6
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .line 363
    if-nez p2, :cond_0

    .line 366
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0}, Lo/bnb;->d()V

    .line 368
    const/4 v0, 0x0

    iput v0, p0, Lo/bnd;->i:I

    goto :goto_0

    .line 370
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 373
    const/4 v0, 0x1

    iput v0, p0, Lo/bnd;->i:I

    goto :goto_0

    .line 375
    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    .line 377
    invoke-direct {p0}, Lo/bnd;->k()V

    .line 378
    iget-object v0, p0, Lo/bnd;->d:Lo/bnb;

    invoke-virtual {v0}, Lo/bnb;->d()V

    .line 379
    const/4 v0, 0x2

    iput v0, p0, Lo/bnd;->i:I

    .line 381
    :cond_2
    :goto_0
    return-void
.end method

.method public setAdapter(Landroid/widget/BaseAdapter;)V
    .locals 2

    .line 313
    iput-object p1, p0, Lo/bnd;->g:Landroid/widget/BaseAdapter;

    .line 314
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lo/bnd;->g:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 315
    if-eqz p1, :cond_0

    instance-of v0, p1, Lo/bmv;

    if-eqz v0, :cond_0

    .line 317
    move-object v0, p1

    check-cast v0, Lo/bmv;

    iput-object v0, p0, Lo/bnd;->f:Lo/bmv;

    .line 318
    iget-object v0, p0, Lo/bnd;->f:Lo/bmv;

    invoke-interface {v0, p0}, Lo/bmv;->a(Lo/bmz;)V

    .line 320
    :cond_0
    return-void
.end method

.method public setAdapter(Lo/bfm;)V
    .locals 1

    .line 252
    iput-object p1, p0, Lo/bnd;->g:Landroid/widget/BaseAdapter;

    .line 253
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 254
    return-void
.end method

.method public setContact(Z)V
    .locals 0

    .line 113
    iput-boolean p1, p0, Lo/bnd;->b:Z

    .line 114
    return-void
.end method

.method public setHasBottomBlank(Z)V
    .locals 0

    .line 134
    iput-boolean p1, p0, Lo/bnd;->k:Z

    .line 135
    invoke-direct {p0}, Lo/bnd;->b()V

    .line 136
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    .line 329
    iget-object v0, p0, Lo/bnd;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 330
    return-void
.end method
